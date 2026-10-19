# Clock Synchronization (Lamport, Vector Clocks)

Lamport timestamps advance on local and received events; vector timestamps distinguish causality from concurrent events.

## Trade-offs

Lamport clocks order causally related events but cannot detect concurrency; vector clocks can, at a cost proportional to the number of participants.

## Run the example and test

```sh
./gradlew :distributed:run --args=logical-clocks
./gradlew :distributed:test --tests 'com.absolutebonkers.distributed.clocksynchronization.ClockSynchronizationTest'
```

- [Runnable Java 21 example](../distributed/src/main/java/com/absolutebonkers/distributed/clocksynchronization/ClockSynchronizationDemo.java)
- [Focused JUnit test](../distributed/src/test/java/com/absolutebonkers/distributed/clocksynchronization/ClockSynchronizationTest.java)
- [Primary reference](https://lamport.azurewebsites.net/pubs/time-clocks.pdf)

## Further primary references

- Vector clocks — [Leslie Lamport paper](https://lamport.azurewebsites.net/pubs/vector-clocks.pdf)
