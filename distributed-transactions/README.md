# Distributed Transactions (2PC, 3PC, Saga)

A two-step Saga reserves inventory, then simulates a payment failure and runs a compensating release.

## Trade-offs

2PC offers atomic commit but may block while coordinators recover; 3PC adds assumptions about timing; Sagas trade global atomicity for local commits and compensations.

## Run the example and test

```sh
./gradlew :distributed:run --args=distributed-transactions
./gradlew :distributed:test --tests 'com.absolutebonkers.distributed.distributedtransactions.DistributedTransactionsTest'
```

- [Runnable Java 21 example](../distributed/src/main/java/com/absolutebonkers/distributed/distributedtransactions/DistributedTransactionsDemo.java)
- [Focused JUnit test](../distributed/src/test/java/com/absolutebonkers/distributed/distributedtransactions/DistributedTransactionsTest.java)
- [Primary reference](https://microservices.io/patterns/data/saga.html)

## Further primary references

- Two-phase commit overview — [Microsoft Learn](https://learn.microsoft.com/azure/architecture/reference-architectures/saga/saga)
