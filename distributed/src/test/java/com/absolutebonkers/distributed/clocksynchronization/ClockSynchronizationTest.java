package com.absolutebonkers.distributed.clocksynchronization;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClockSynchronizationTest {
    @Test
    void demonstratesClockSynchronization() {
        assertTrue(ClockSynchronizationDemo.run().contains("vectors-concurrent=true"));
    }
}
