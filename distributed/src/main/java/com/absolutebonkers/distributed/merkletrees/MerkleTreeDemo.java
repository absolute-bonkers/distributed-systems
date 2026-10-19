package com.absolutebonkers.distributed.merkletrees;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HexFormat;

public final class MerkleTreeDemo {
    private MerkleTreeDemo() {}

    public static String run() {
        String left = hash("guide-a");
                String right = hash("guide-b");
                String root = hash(left + right);
                String changedRoot = hash(hash("guide-a" ) + hash("changed-guide-b"));
                return "root=" + root.substring(0, 12) + ", tamper-detected=" + !root.equals(changedRoot);
    }
    private static String hash(String text) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA-256").digest(text.getBytes(StandardCharsets.UTF_8));
            return HexFormat.of().formatHex(digest);
        } catch (NoSuchAlgorithmException exception) { throw new IllegalStateException(exception); }
    }

    public static void main(String[] args) { System.out.println(run()); }
}
