package com.absolutebonkers.distributed.clocksynchronization;



public final class ClockSynchronizationDemo {
    private ClockSynchronizationDemo() {}

    public static String run() {
        int localLamport = 3;
                int receivedLamport = 7;
                int mergedLamport = Math.max(localLamport, receivedLamport) + 1;
                int[] left = {2, 1};
                int[] right = {1, 2};
                boolean concurrent = concurrent(left, right);
                return "lamport=" + mergedLamport + ", vectors-concurrent=" + concurrent;
    }

    public static boolean concurrent(int[] left, int[] right) {
        if (left == null || right == null || left.length != right.length) {
            throw new IllegalArgumentException("vector clocks must have the same dimension");
        }
        boolean leftBeforeOrEqual = true;
        boolean rightBeforeOrEqual = true;
        for (int i = 0; i < left.length; i++) {
            leftBeforeOrEqual &= left[i] <= right[i];
            rightBeforeOrEqual &= right[i] <= left[i];
        }
        return !leftBeforeOrEqual && !rightBeforeOrEqual;
    }

    public static void main(String[] args) { System.out.println(run()); }
}
