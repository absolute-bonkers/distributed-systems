package com.absolutebonkers.distributed.bloomfilters;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BloomFilterTest {
    @Test
    void demonstratesBloomFilter() {
        assertTrue(BloomFilterDemo.run().contains("inserted-might-exist=true"));
    }
}
