package com.absolutebonkers.distributed.runner;

public final class Main {
    private Main() {}
    public static void main(String[] args) {
        if (args.length != 1) throw new IllegalArgumentException("Pass a topic slug; see README.md");
        String output = switch (args[0]) {
            case "consensus" -> com.absolutebonkers.distributed.distributedconsensus.ConsensusDemo.run();
            case "leader-election" -> com.absolutebonkers.distributed.leaderelection.LeaderElectionDemo.run();
            case "distributed-locking" -> com.absolutebonkers.distributed.distributedlocking.DistributedLockingDemo.run();
            case "distributed-transactions" -> com.absolutebonkers.distributed.distributedtransactions.DistributedTransactionsDemo.run();
            case "logical-clocks" -> com.absolutebonkers.distributed.clocksynchronization.ClockSynchronizationDemo.run();
            case "gossip" -> com.absolutebonkers.distributed.gossipprotocol.GossipProtocolDemo.run();
            case "split-brain" -> com.absolutebonkers.distributed.splitbrain.SplitBrainDemo.run();
            case "quorums" -> com.absolutebonkers.distributed.quorumbasedsystems.QuorumBasedSystemsDemo.run();
            case "bloom-filters" -> com.absolutebonkers.distributed.bloomfilters.BloomFilterDemo.run();
            case "merkle-trees" -> com.absolutebonkers.distributed.merkletrees.MerkleTreeDemo.run();
            default -> throw new IllegalArgumentException("Unknown topic: " + args[0]);
        };
        System.out.println(output);
    }
}
