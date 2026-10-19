# Distributed Transactions (2PC, 3PC, Saga)

A label-only Saga trace represents inventory reservation, payment failure, and a compensating release. It does not execute durable local transactions or change inventory/payment state.

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

- Saga architecture — [Microsoft Learn](https://learn.microsoft.com/azure/architecture/reference-architectures/saga/saga) — Describes compensating transactions and the Saga alternative to a distributed transaction coordinator.
- Two-phase commit implementation — [PostgreSQL prepared transactions](https://www.postgresql.org/docs/current/two-phase.html) — Documents the prepare/commit workflow and operational limitations in a production database.
