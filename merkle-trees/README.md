# Merkle Trees

A SHA-256 Merkle root is computed from two leaves; changing a leaf changes the root and detects content tampering.

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

- Certificate Transparency Merkle proofs — [RFC 6962](https://www.rfc-editor.org/rfc/rfc6962)
