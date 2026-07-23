import java.util.Scanner;

public class Welcome{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your First Name :");
        String F_name = scanner.nextLine();

        System.out.print("Enter your Last Name :");
        String L_name = scanner.nextLine();
        System.out.printf("Welcome to the Second Year - %s %s\n",F_name,L_name);
    }
}
