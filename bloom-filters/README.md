# Bloom Filters

A tiny bit-set Bloom filter demonstrates probabilistic membership: inserted values are reported present, while absent values may produce false positives. The local example uses two deterministic hash positions and is a teaching sketch, not a sized or production filter.

## Trade-offs

Space-efficient membership checks can return false positives but, in this insert-only example, never return a false negative for an inserted value. Standard Bloom filters do not support ordinary deletion; sizing and hash quality matter.

## Run the example and test

```sh
./gradlew :distributed:run --args=bloom-filters
./gradlew :distributed:test --tests 'com.absolutebonkers.distributed.bloomfilters.BloomFilterTest'
```

- [Runnable Java 21 example](../distributed/src/main/java/com/absolutebonkers/distributed/bloomfilters/BloomFilterDemo.java)
- [Focused JUnit test](../distributed/src/test/java/com/absolutebonkers/distributed/bloomfilters/BloomFilterTest.java)
- [Primary reference](https://doi.org/10.1145/362686.362692)

## Further primary references

- [GeeksforGeeks — Bloom Filters](https://www.geeksforgeeks.org/python/bloom-filters-introduction-and-python-implementation/) — An accessible implementation walkthrough; the original paper remains the primary source above.
