package com.absolutebonkers.distributed.quorumbasedsystems;



public final class QuorumBasedSystemsDemo {
    private QuorumBasedSystemsDemo() {}

    public static String run() {
        int replicas = 5;
                int readQuorum = 3;
                int writeQuorum = 3;
                boolean intersecting = readQuorum + writeQuorum > replicas;
                return "R=" + readQuorum + ", W=" + writeQuorum + ", N=" + replicas + ", intersect=" + intersecting;
    }

    public static void main(String[] args) { System.out.println(run()); }
}
