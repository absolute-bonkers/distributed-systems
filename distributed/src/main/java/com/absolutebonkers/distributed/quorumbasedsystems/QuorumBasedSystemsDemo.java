package com.absolutebonkers.distributed.quorumbasedsystems;



public final class QuorumBasedSystemsDemo {
    private QuorumBasedSystemsDemo() {}

    public static String run() {
        int replicas = 5;
                int readQuorum = 3;
                int writeQuorum = 3;
                boolean intersecting = intersects(readQuorum, writeQuorum, replicas);
                return "R=" + readQuorum + ", W=" + writeQuorum + ", N=" + replicas + ", intersect=" + intersecting;
    }

    public static boolean intersects(int readQuorum, int writeQuorum, int replicas) {
        if (replicas < 1 || readQuorum < 1 || writeQuorum < 1
                || readQuorum > replicas || writeQuorum > replicas) {
            throw new IllegalArgumentException("quorums must be within the replica set");
        }
        return (long) readQuorum + writeQuorum > replicas;
    }

    public static void main(String[] args) { System.out.println(run()); }
}
