# Distributed Consensus (Raft, Paxos)

A five-node voting simulation commits a value only after a majority (3 of 5) agrees, illustrating the safety role of quorum intersection.

## Trade-offs

Majorities preserve safety across one-node failures in this model; real Raft/Paxos also require terms/ballots, log or proposal ordering, persistence, and network-partition handling.

## Run the example and test

```sh
./gradlew :distributed:run --args=consensus
./gradlew :distributed:test --tests 'com.absolutebonkers.distributed.distributedconsensus.ConsensusTest'
```

- [Runnable Java 21 example](../distributed/src/main/java/com/absolutebonkers/distributed/distributedconsensus/ConsensusDemo.java)
- [Focused JUnit test](../distributed/src/test/java/com/absolutebonkers/distributed/distributedconsensus/ConsensusTest.java)
- [Primary reference](https://raft.github.io/raft.pdf)

## Further primary references

- Paxos Made Simple — Leslie Lamport, [PDF](https://lamport.azurewebsites.net/pubs/paxos-simple.pdf)
