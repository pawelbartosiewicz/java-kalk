import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Program kalkulator służy do wykonywania prostych obliczeń, z wykorzystaniem dwóch liczb rzeczywistych. " +
                "Program wykrywa próbę dzielenia przez zero, reaguje nad błędny typ operacji");
        int l1;
        int l2;
        String opcja;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę rzeczywistą:");
        l1 = scanner.nextInt();
        System.out.println("Podaj drugą liczbę rzeczywistą:");
        l2 = scanner.nextInt();
        System.out.println("Wybierz jedną z operacji: \n + - * / % ");
        opcja = scanner.next();
        scanner.close();

        switch(opcja)
        {
            default:
                System.out.println("Podałeś nieprawidłową operację!");
                break;
            case "+":
            {
                System.out.println(l1 + l2);
                break;
            }
            case "-":
            {
                System.out.println(l1 - l2);
                break;
            }
            case "*":
            {
                System.out.println(l1 * l2);
                break;
            }
            case "/":
            {
                if(l2 !=0)
                {
                    System.out.println(l1 / l2 + ", reszta " + l1 % l2);
                }
                else
                {
                    System.out.println("Zabrania się dzielenia przez 0!");
                }
                break;
            }
            case "%":
            {
                if(l2 !=0)
                {
                    System.out.println(l1 % l2);
                }
                else
                {
                    System.out.println("Zabronione dzielenie przez 0!");
                }
            }
        }
    }
}