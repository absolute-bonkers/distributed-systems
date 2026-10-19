package com.absolutebonkers.distributed.distributedconsensus;

import java.util.Set;

public final class ConsensusDemo {
    private ConsensusDemo() {}

    public static String run() {
        Set<String> votes = Set.of("node-a", "node-b", "node-c");
                int clusterSize = 5;
                int quorum = clusterSize / 2 + 1;
                boolean committed = votes.size() >= quorum;
                return "votes=" + votes.size() + "/" + clusterSize + ", quorum=" + quorum + ", committed=" + committed;
    }

    public static void main(String[] args) { System.out.println(run()); }
}
