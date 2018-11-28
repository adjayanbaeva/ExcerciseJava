import java.util.Scanner;

public class DumbCalculator {
    public static void main(String[] args){
        Scanner userInput=new Scanner(System.in);
        double number1, number2, number3;

        System.out.print("What's your first number? ");
        number1=userInput.nextDouble();

        System.out.print("What is your second number? ");
        number2=userInput.nextDouble();

        System.out.print("What is your third number: ");
        number3=userInput.nextDouble();


        System.out.println("("+number1+" + "+number2+" + "+number3+" ) / 2 is...."+((number1+number2+number3)/2));


    }
}
