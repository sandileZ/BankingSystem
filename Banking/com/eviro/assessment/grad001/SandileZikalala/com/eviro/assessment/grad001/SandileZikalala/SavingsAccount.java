package com.eviro.assessment.grad001.SandileZikalala;
import java.math.BigDecimal;

public class SavingsAccount{

    int Cid;
    String accNum = "";
    public BigDecimal Cbalance;

    public SavingsAccount(int id, String AccNum, BigDecimal balance)
    {
        Cid = id;
        accNum = AccNum;
        Cbalance = balance;
    }


    public int getAccNum()
    {
        return Integer.valueOf(accNum);
    }

    public BigDecimal getBalance()
    {
        return Cbalance;
    }

    
}
