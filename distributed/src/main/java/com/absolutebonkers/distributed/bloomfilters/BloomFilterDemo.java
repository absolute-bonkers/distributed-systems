package com.absolutebonkers.distributed.bloomfilters;

import java.util.BitSet;

public final class BloomFilterDemo {
    private BloomFilterDemo() {}

    public static String run() {
        BitSet bits = new BitSet(64);
                String inserted = "module-12";
                for (int seed : new int[]{17, 31}) bits.set(Math.floorMod((inserted.hashCode() * seed), 64));
                boolean mightContain = true;
                for (int seed : new int[]{17, 31}) mightContain &= bits.get(Math.floorMod((inserted.hashCode() * seed), 64));
                return "inserted-might-exist=" + mightContain + ", bit-count=" + bits.cardinality();
    }

    public static void main(String[] args) { System.out.println(run()); }
}
