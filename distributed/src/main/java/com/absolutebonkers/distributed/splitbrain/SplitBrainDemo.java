package com.absolutebonkers.distributed.splitbrain;



public final class SplitBrainDemo {
    private SplitBrainDemo() {}

    public static String run() {
        int clusterSize = 5;
                int majority = clusterSize / 2 + 1;
                int leftPartition = 2;
                int rightPartition = 3;
                boolean leftCanWrite = leftPartition >= majority;
                boolean rightCanWrite = rightPartition >= majority;
                return "left-write=" + leftCanWrite + ", right-write=" + rightCanWrite;
    }

    public static void main(String[] args) { System.out.println(run()); }
}
