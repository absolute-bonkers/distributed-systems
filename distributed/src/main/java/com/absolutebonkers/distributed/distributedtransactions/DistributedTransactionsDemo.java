package com.absolutebonkers.distributed.distributedtransactions;

import java.util.ArrayList;
import java.util.List;

public final class DistributedTransactionsDemo {
    private DistributedTransactionsDemo() {}

    public static String run() {
        List<String> steps = new ArrayList<>();
                steps.add("inventory-reserved");
                steps.add("payment-failed");
                steps.add("inventory-compensated");
                return String.join(" -> ", steps);
    }

    public static void main(String[] args) { System.out.println(run()); }
}
