package com.absolutebonkers.distributed.clocksynchronization;



public final class ClockSynchronizationDemo {
    private ClockSynchronizationDemo() {}

    public static String run() {
        int localLamport = 3;
                int receivedLamport = 7;
                int mergedLamport = Math.max(localLamport, receivedLamport) + 1;
                int[] left = {2, 1};
                int[] right = {1, 2};
                boolean concurrent = left[0] > right[0] && left[1] < right[1];
                return "lamport=" + mergedLamport + ", vectors-concurrent=" + concurrent;
    }

    public static void main(String[] args) { System.out.println(run()); }
}
