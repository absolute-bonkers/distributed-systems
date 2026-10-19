package com.absolutebonkers.distributed.gossipprotocol;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GossipProtocolTest {
    @Test
    void demonstratesGossipProtocol() {
        assertTrue(GossipProtocolDemo.run().contains("members=node-a,node-b,node-c"));
    }
}
