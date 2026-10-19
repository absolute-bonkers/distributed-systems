package com.absolutebonkers.distributed.leaderelection;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LeaderElectionTest {
    @Test
    void demonstratesLeaderElection() {
        assertTrue(LeaderElectionDemo.run().contains("elected-node=5"));
    }
}
