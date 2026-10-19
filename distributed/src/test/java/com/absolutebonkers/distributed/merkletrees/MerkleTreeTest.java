package com.absolutebonkers.distributed.merkletrees;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MerkleTreeTest {
    @Test
    void demonstratesMerkleTree() {
        assertTrue(MerkleTreeDemo.run().contains("tamper-detected=true"));
    }
}
