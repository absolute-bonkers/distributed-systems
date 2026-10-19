package com.absolutebonkers.distributed.distributedconsensus;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ConsensusTest {
    @Test
    void demonstratesConsensus() {
        assertTrue(ConsensusDemo.run().contains("committed=true"));
    }
}
