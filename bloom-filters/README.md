# Bloom Filters

A tiny bit-set Bloom filter demonstrates probabilistic membership: inserted values may be present, while absent values can produce false positives.

## Trade-offs

Space-efficient membership checks allow false positives but never false negatives for inserted values (absent deletions); sizing and hash quality matter.

## Run the example and test

```sh
./gradlew :distributed:run --args=bloom-filters
./gradlew :distributed:test --tests 'com.absolutebonkers.distributed.bloomfilters.BloomFilterTest'
```

- [Runnable Java 21 example](../distributed/src/main/java/com/absolutebonkers/distributed/bloomfilters/BloomFilterDemo.java)
- [Focused JUnit test](../distributed/src/test/java/com/absolutebonkers/distributed/bloomfilters/BloomFilterTest.java)
- [Primary reference](https://doi.org/10.1145/362686.362692)

## Further primary references

- Bloom filters — [original paper DOI](https://doi.org/10.1145/362686.362692)
