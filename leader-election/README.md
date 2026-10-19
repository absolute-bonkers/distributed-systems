# Leader Election

A deterministic example chooses the highest-priority live node and prints a fixed epoch beside it. It does not run a quorum election or persist/fence terms; production protocols need those guarantees.

## Trade-offs

Priority election is easy to inspect but does not model timeouts, message loss, or safety proofs; production protocols use terms/epochs and quorum-backed election.

## Run the example and test

```sh
./gradlew :distributed:run --args=leader-election
./gradlew :distributed:test --tests 'com.absolutebonkers.distributed.leaderelection.LeaderElectionTest'
```

- [Runnable Java 21 example](../distributed/src/main/java/com/absolutebonkers/distributed/leaderelection/LeaderElectionDemo.java)
- [Focused JUnit test](../distributed/src/test/java/com/absolutebonkers/distributed/leaderelection/LeaderElectionTest.java)
- [Primary reference](https://raft.github.io/raft.pdf)

## Further primary references

- Raft consensus paper — [PDF](https://raft.github.io/raft.pdf)
