package com.absolutebonkers.distributed.clocksynchronization;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ClockSynchronizationTest {
    @Test
    void demonstratesClockSynchronization() {
        assertTrue(ClockSynchronizationDemo.run().contains("vectors-concurrent=true"));
    }

    @Test
    void distinguishesCausalityFromConcurrency() {
        assertTrue(ClockSynchronizationDemo.concurrent(new int[]{2, 1}, new int[]{1, 2}));
        assertFalse(ClockSynchronizationDemo.concurrent(new int[]{1, 2}, new int[]{2, 2}));
        assertFalse(ClockSynchronizationDemo.concurrent(new int[]{2, 2}, new int[]{2, 2}));
        assertThrows(IllegalArgumentException.class,
                () -> ClockSynchronizationDemo.concurrent(new int[]{1}, new int[]{1, 2}));
    }
}
