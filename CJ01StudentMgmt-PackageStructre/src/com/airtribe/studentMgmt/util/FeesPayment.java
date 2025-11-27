package com.airtribe.studentMgmt.util;

public class FeesPayment {
    private final int amount;

    public FeesPayment(int fees) {
        amount=fees;
    }

    public void payment(){
        System.out.println("Fees payment is successful for the amount="+amount);
    }
}
