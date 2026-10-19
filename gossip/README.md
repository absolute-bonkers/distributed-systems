# Gossip Protocol

A one-round membership-propagation simulation merges two peer views into one node's view. It illustrates set union, not repeated gossip rounds, probabilistic convergence, or a full membership protocol.

## Trade-offs

Gossip scales without a central coordinator and tolerates transient failures, but convergence is probabilistic and messages can be redundant or stale.

## Run the example and test

```sh
./gradlew :distributed:run --args=gossip
./gradlew :distributed:test --tests 'com.absolutebonkers.distributed.gossipprotocol.GossipProtocolTest'
```

- [Runnable Java 21 example](../distributed/src/main/java/com/absolutebonkers/distributed/gossipprotocol/GossipProtocolDemo.java)
- [Focused JUnit test](../distributed/src/test/java/com/absolutebonkers/distributed/gossipprotocol/GossipProtocolTest.java)
- [Primary reference](https://www.cs.cornell.edu/home/rvr/papers/flowgossip.pdf)

## Further primary references

- Gossip-based dissemination — [Cornell paper](https://www.cs.cornell.edu/home/rvr/papers/flowgossip.pdf)
