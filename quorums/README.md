# Quorum-Based Systems

Read and write quorums are checked for intersection using the standard condition R + W > N.

## Trade-offs

Intersecting quorums can provide read-after-write properties, subject to replica versioning and consistency rules; larger quorums increase latency and reduce availability.

## Run the example and test

```sh
./gradlew :distributed:run --args=quorums
./gradlew :distributed:test --tests 'com.absolutebonkers.distributed.quorumbasedsystems.QuorumBasedSystemsTest'
```

- [Runnable Java 21 example](../distributed/src/main/java/com/absolutebonkers/distributed/quorumbasedsystems/QuorumBasedSystemsDemo.java)
- [Focused JUnit test](../distributed/src/test/java/com/absolutebonkers/distributed/quorumbasedsystems/QuorumBasedSystemsTest.java)
- [Primary reference](https://cassandra.apache.org/doc/latest/cassandra/architecture/dynamo.html)

## Further primary references

- Dynamo-style consistency — [Apache Cassandra documentation](https://cassandra.apache.org/doc/latest/cassandra/architecture/dynamo.html)
