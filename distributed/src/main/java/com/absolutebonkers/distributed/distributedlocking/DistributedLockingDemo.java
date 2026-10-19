package com.absolutebonkers.distributed.distributedlocking;



public final class DistributedLockingDemo {
    private DistributedLockingDemo() {}

    public static String run() {
        long staleHolderToken = 41;
                long currentFenceToken = 42;
                boolean staleWriteAccepted = staleHolderToken >= currentFenceToken;
                return "stale-write-accepted=" + staleWriteAccepted + ", fence=" + currentFenceToken;
    }

    public static void main(String[] args) { System.out.println(run()); }
}
