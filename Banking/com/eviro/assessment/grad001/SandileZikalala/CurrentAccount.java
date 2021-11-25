import java.math.BigDecimal;

public class CurrentAccount{

    int Cid;
    public String accNum = "";
    public BigDecimal Cbalance;
    public BigDecimal cusOverdraft;

    public CurrentAccount(int CusId, String AccNum, BigDecimal balance, BigDecimal overdraft)
    {
        Cid = CusId;
        accNum = AccNum;
        Cbalance = balance;
        cusOverdraft = overdraft;
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
