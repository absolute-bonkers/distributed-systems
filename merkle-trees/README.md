# Merkle Trees

A teaching SHA-256 Merkle root is computed from two leaves; changing a leaf changes the root, provided the expected root is trusted. The demo does not implement a proof, domain separation, or a full tree format.

## Trade-offs

Merkle trees make set reconciliation and proofs efficient, but proof construction depends on a canonical tree shape and secure hash choice.

## Run the example and test

```sh
./gradlew :distributed:run --args=merkle-trees
./gradlew :distributed:test --tests 'com.absolutebonkers.distributed.merkletrees.MerkleTreeTest'
```

- [Runnable Java 21 example](../distributed/src/main/java/com/absolutebonkers/distributed/merkletrees/MerkleTreeDemo.java)
- [Focused JUnit test](../distributed/src/test/java/com/absolutebonkers/distributed/merkletrees/MerkleTreeTest.java)
- [Primary reference](https://csrc.nist.gov/pubs/fips/180-4/upd1/final)

## Further primary references

- Certificate Transparency Merkle proofs — [RFC 9162](https://www.rfc-editor.org/rfc/rfc9162) (updates RFC 6962)
