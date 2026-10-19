package com.absolutebonkers.distributed.quorumbasedsystems;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuorumBasedSystemsTest {
    @Test
    void demonstratesQuorumBasedSystems() {
        assertTrue(QuorumBasedSystemsDemo.run().contains("intersect=true"));
        assertTrue(QuorumBasedSystemsDemo.intersects(3, 3, 5));
        assertFalse(QuorumBasedSystemsDemo.intersects(2, 2, 5));
        assertThrows(IllegalArgumentException.class,
                () -> QuorumBasedSystemsDemo.intersects(0, 3, 5));
    }
}
