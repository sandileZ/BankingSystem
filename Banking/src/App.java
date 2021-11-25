import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
    
    SystemDB instance = SystemDB.getCus();

    instance.withdraw("1", BigDecimal.valueOf(6000));


    }
}
