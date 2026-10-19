package com.absolutebonkers.distributed.splitbrain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SplitBrainTest {
    @Test
    void demonstratesSplitBrain() {
        assertTrue(SplitBrainDemo.run().contains("right-write=true"));
    }
}
