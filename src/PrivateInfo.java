import java.util.Scanner;

public class PrivateInfo {
    public static void main(String[] args){
        Scanner userInput=new Scanner(System.in);

        String firstName, lastName, login;
        int grade, idNumber;
        double gpa;

        System.out.print("First name:");
        firstName=userInput.next();

        System.out.print("Last name:");
        lastName=userInput.next();

        System.out.print("Grade (9-12):");
        grade=userInput.nextInt();


        System.out.print("Student ID: ");
        idNumber=userInput.nextInt();

        System.out.print("Login: ");
        login=userInput.next();

        System.out.print("GPA (0.0-4.0): ");
        gpa=userInput.nextDouble();




        System.out.println("Your information:");
        System.out.println("\t Login: "+login);
        System.out.println("\t ID: "+ idNumber);
        System.out.println("\t Name: "+firstName+" "+lastName);
        if (gpa>=0.0 && gpa<=4.0){
            System.out.println("\t GPA:" +gpa);
        }else{
            System.out.println( "\t Enter valid info");
        }
        if (grade<13 && grade>8) {
            System.out.print("\t Grade: "+grade);
        }else{
            System.out.println("\t Enter valid info");
        }




    }
}
