package com.absolutebonkers.distributed.quorumbasedsystems;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class QuorumBasedSystemsTest {
    @Test
    void demonstratesQuorumBasedSystems() {
        assertTrue(QuorumBasedSystemsDemo.run().contains("intersect=true"));
    }
}
