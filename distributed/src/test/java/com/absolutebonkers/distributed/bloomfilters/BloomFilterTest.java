package com.absolutebonkers.distributed.bloomfilters;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BloomFilterTest {
    @Test
    void insertedItemsRemainPossibleAndAbsentItemsCanBeRejected() {
        var filter = new BloomFilterDemo.BloomFilter(64, 17, 31);
        filter.add("module-12");
        assertTrue(filter.mightContain("module-12"));
        assertFalse(filter.mightContain("definitely-absent"));
        assertEquals(2, filter.bitCountSet());
    }

    @Test
    void hashCollisionsCanProduceFalsePositives() {
        var filter = new BloomFilterDemo.BloomFilter(64, 17, 31);
        filter.add("Aa");
        assertTrue(filter.mightContain("BB"));
    }

    @Test
    void rejectsInvalidFilterConfiguration() {
        assertThrows(IllegalArgumentException.class, () -> new BloomFilterDemo.BloomFilter(0, 1));
        assertThrows(IllegalArgumentException.class, () -> new BloomFilterDemo.BloomFilter(8));
        assertThrows(IllegalArgumentException.class, () -> new BloomFilterDemo.BloomFilter(8, 1).add(null));
    }
}
