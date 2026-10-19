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
- [Primary reference](https://martin.kleppmann.com/2016/02/08/how-to-do-distributed-locking.html)

## Further primary references

- etcd lock API — [official concurrency API reference](https://etcd.io/docs/v3.5/dev-guide/api_concurrency_reference_v3/)

The local example only compares fencing-token values; it does not implement leases, a lock service, or a protected resource.
