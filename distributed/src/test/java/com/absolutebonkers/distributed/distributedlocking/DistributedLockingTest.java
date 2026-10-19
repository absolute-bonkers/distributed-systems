package com.absolutebonkers.distributed.distributedlocking;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DistributedLockingTest {
    @Test
    void demonstratesDistributedLocking() {
        assertTrue(DistributedLockingDemo.run().contains("stale-write-accepted=false"));
    }
}
