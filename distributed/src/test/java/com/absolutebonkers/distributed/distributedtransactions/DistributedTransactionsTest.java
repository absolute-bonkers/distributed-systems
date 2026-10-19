package com.absolutebonkers.distributed.distributedtransactions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DistributedTransactionsTest {
    @Test
    void demonstratesDistributedTransactions() {
        assertTrue(DistributedTransactionsDemo.run().contains("inventory-compensated"));
    }
}
