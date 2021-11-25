import java.util.Scanner;

public class ScannerTest1
{
    public static void main(String[] args) 
    {
        try (Scanner scanner = new Scanner(System.in);)
        {
        System.out.println("Enter a character");
        char c = scanner.next().charAt(0);
        System.out.println("Value = " +c);
        }
    }
}