import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args){
        Scanner userInput=new Scanner(System.in);
        double heightFt;
        double heightInches;
        int weight;

        System.out.print("Your height(feet only): ");
        heightFt=userInput.nextDouble();

        System.out.print("Your height(inches): ");
        heightInches=userInput.nextDouble();

        System.out.print("Your weight in pounds: ");
        weight=userInput.nextInt();


        System.out.println("Your BMI is "+((weight/2.205)/((((heightFt*12)+heightInches)/39.37)*(((heightFt*12)+heightInches)/39.37))));

    }
}
