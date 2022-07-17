import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);

        int n1,n2,select;

        System.out.print("Enter the first number: ");
        n1=input.nextInt();

        System.out.print("Enter the second number: ");
        n2=input.nextInt();

        System.out.println("1-Sum\n2-Sub\n3-Multi\n4-Divide");

        System.out.print("Choice: ");
        select=input.nextInt();

        switch (select){

            case 1:
                System.out.print("Summary: " + (n1 + n2));
                break;
            case 2:
                System.out.print("Sub: " + (n1-n2));
                break;
            case 3:
                System.out.print("Multi: " + (n1*n2));
                break;
            case 4 :
                System.out.print("Divide: " + (n1/n2));
                break;
            default:
                System.out.println("You've entered wrong select number");
        }
    }

}
