# Distributed Locking

A fencing-token example rejects an operation from an old lock holder after a newer lease has been granted.

## Trade-offs

Leases need bounded clock assumptions and fencing at the protected resource; a lock service alone cannot prevent a paused stale client from writing.

## Run the example and test

```sh
./gradlew :distributed:run --args=distributed-locking
./gradlew :distributed:test --tests 'com.absolutebonkers.distributed.distributedlocking.DistributedLockingTest'
```

- [Runnable Java 21 example](../distributed/src/main/java/com/absolutebonkers/distributed/distributedlocking/DistributedLockingDemo.java)
- [Focused JUnit test](../distributed/src/test/java/com/absolutebonkers/distributed/distributedlocking/DistributedLockingTest.java)
- [Primary reference](https://etcd.io/docs/v3.5/learning/lock/)

## Further primary references

- etcd distributed locks — [documentation](https://etcd.io/docs/v3.5/learning/lock/)
