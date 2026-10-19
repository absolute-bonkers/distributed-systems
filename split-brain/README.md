# Split-Brain Problem

A five-node cluster grants write authority only to the partition that retains a majority.

## Trade-offs

Quorum fencing prevents both sides from safely accepting writes, but the minority side sacrifices availability; clients must observe lease/term changes.

## Run the example and test

```sh
./gradlew :distributed:run --args=split-brain
./gradlew :distributed:test --tests 'com.absolutebonkers.distributed.splitbrain.SplitBrainTest'
```

- [Runnable Java 21 example](../distributed/src/main/java/com/absolutebonkers/distributed/splitbrain/SplitBrainDemo.java)
- [Focused JUnit test](../distributed/src/test/java/com/absolutebonkers/distributed/splitbrain/SplitBrainTest.java)
- [Primary reference](https://raft.github.io/raft.pdf)

## Further primary references

- Raft safety and leader election — [paper](https://raft.github.io/raft.pdf)
