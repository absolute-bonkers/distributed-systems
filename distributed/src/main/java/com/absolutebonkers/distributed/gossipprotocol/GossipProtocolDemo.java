package com.absolutebonkers.distributed.gossipprotocol;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public final class GossipProtocolDemo {
    private GossipProtocolDemo() {}

    public static String run() {
        Set<String> known = new TreeSet<>(Set.of("node-a"));
                List<Set<String>> peerViews = List.of(Set.of("node-b"), Set.of("node-c"));
                for (Set<String> view : peerViews) known.addAll(view);
                return "members=" + String.join(",", known);
    }

    public static void main(String[] args) { System.out.println(run()); }
}
