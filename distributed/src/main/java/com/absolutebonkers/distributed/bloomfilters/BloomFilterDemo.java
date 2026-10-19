package com.absolutebonkers.distributed.bloomfilters;

import java.util.BitSet;

public final class BloomFilterDemo {
    private BloomFilterDemo() {}

    public static final class BloomFilter {
        private final int bitCount;
        private final int[] seeds;
        private final BitSet bits;

        public BloomFilter(int bitCount, int... seeds) {
            if (bitCount < 1 || seeds.length == 0) {
                throw new IllegalArgumentException("use a positive bit count and at least one hash seed");
            }
            this.bitCount = bitCount;
            this.seeds = seeds.clone();
            this.bits = new BitSet(bitCount);
        }

        public void add(String value) {
            positions(value).forEach(bits::set);
        }

        public boolean mightContain(String value) {
            return positions(value).allMatch(bits::get);
        }

        public int bitCountSet() {
            return bits.cardinality();
        }

        private java.util.stream.IntStream positions(String value) {
            if (value == null) throw new IllegalArgumentException("value cannot be null");
            return java.util.Arrays.stream(seeds)
                    .mapToLong(seed -> (long) value.hashCode() * seed)
                    .map(hash -> Math.floorMod(hash, bitCount))
                    .mapToInt(Math::toIntExact);
        }
    }

    public static String run() {
        var filter = new BloomFilter(64, 17, 31);
        filter.add("module-12");
        return "inserted-might-exist=" + filter.mightContain("module-12")
                + ", absent-might-exist=" + filter.mightContain("definitely-absent")
                + ", bit-count=" + filter.bitCountSet();
    }

    public static void main(String[] args) {
        System.out.println(run());
    }
}
