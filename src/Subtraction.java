import java.util.Scanner;
public class Subtraction {
    public static void main(String[] args) {
        //create object for scanner class
        Scanner in=new Scanner(System.in);

        //read the integer
        System.out.print("Enter number 1: ");
        int num1=in.nextInt();
        System.out.print("Enter number 2: ");
        int num2=in.nextInt();
        System.out.println("Subtraction: "+(num1-num2));
    }

}

