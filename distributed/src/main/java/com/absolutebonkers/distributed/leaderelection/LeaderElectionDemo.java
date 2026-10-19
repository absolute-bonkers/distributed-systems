package com.absolutebonkers.distributed.leaderelection;

import java.util.List;

public final class LeaderElectionDemo {
    private LeaderElectionDemo() {}

    public static String run() {
        List<Integer> liveNodes = List.of(1, 3, 5);
                int term = 8;
                int leader = liveNodes.stream().mapToInt(Integer::intValue).max().orElseThrow();
                return "term=" + term + ", elected-node=" + leader;
    }

    public static void main(String[] args) { System.out.println(run()); }
}
