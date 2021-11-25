import com.eviro.assessment.grad001.SandileZikalala.AccountService;
import com.eviro.assessment.grad001.SandileZikalala.CurrentAccount;
import com.eviro.assessment.grad001.SandileZikalala.SavingsAccount;
import java.math.BigDecimal;

class SystemDB implements AccountService {
    private static SystemDB customer = new SystemDB();
    BigDecimal b;
    SavingsAccount savingsAcc1 = new SavingsAccount(101,"1",BigDecimal.valueOf(2000.00));
    SavingsAccount savingsAcc2 = new SavingsAccount(102,"2",BigDecimal.valueOf(5000.00));

    CurrentAccount currentAcc1 = new CurrentAccount(103,"3",BigDecimal.valueOf(1000),BigDecimal.valueOf(10000));
    CurrentAccount currentAcc2 = new CurrentAccount(104,"4",BigDecimal.valueOf(-5000),BigDecimal.valueOf(20000));

    private SystemDB(){}

    public static SystemDB getCus(){
        return customer;
    }

    @Override
    public void withdraw(String accountNum, BigDecimal amountToWithdraw) {
        int accNum = Integer.valueOf(accountNum);
        BigDecimal limit = BigDecimal.valueOf(1000.00);

            if(accNum == savingsAcc1.getAccNum())
            {
                b = savingsAcc1.Cbalance.subtract(amountToWithdraw);
                if(b.compareTo(limit) >= 0)
                {
                    savingsAcc1.Cbalance = b;
                    System.out.println("The withdrawl was successful");
                }
                else{
                    System.out.println("Withdrawl amount to large.");
                }
            } 
            else if(accNum == savingsAcc2.getAccNum())
            {
                b = savingsAcc2.Cbalance.subtract(amountToWithdraw);
                if(b.compareTo(limit) >= 0)
                {
                    savingsAcc2.Cbalance = b;
                }
                else{
                    System.out.println("Withdrawl amount to large.");
                }
            }
            else if(accNum == currentAcc1.getAccNum())
            {
                b = currentAcc1.Cbalance.subtract(amountToWithdraw);

                if(currentAcc1.Cbalance.add(currentAcc1.cusOverdraft).compareTo(amountToWithdraw) > 0){
                    currentAcc1.Cbalance = b;
                }
                else{
                    System.out.println("Withdrawl amount to large");
                }
            }
            else if(accNum == currentAcc2.getAccNum())
            {
                b = currentAcc2.Cbalance.subtract(amountToWithdraw);

                if(currentAcc2.Cbalance.add(currentAcc2.cusOverdraft).compareTo(amountToWithdraw) > 0){
                    currentAcc2.Cbalance = b;
                }
                else{
                    System.out.println("Withdrawl amount to large");
                }
            }
            else{
                System.out.println("The account number provided does not exist");
            }       
        
    }
    
    
}

