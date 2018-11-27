public class MoreVariablesAndPrinting {
    public static void main(String[] args){
        String name, eyes, teeth, hair;
        int age, height, weight;

        name = "Jane Bai";
        age = 34;
        height = 64 ;   //inches
        weight = 105;  //lbs
        eyes = "Grey";
        teeth = "Beige";
        hair="Dark";

        System.out.println( "Let's talk about " + name + "." );
        System.out.println( "She's " + height + " inches tall." );
        System.out.println( "She's " + weight + " pounds heavy." );
        System.out.println( "Actually, that's not too heavy." );
        System.out.println( "She's got " + eyes + " eyes and " + hair + " hair." );
        System.out.println( "Her teeth are usually " + teeth + " depending on the coffee." );
        System.out.println( "If I add " + age + ", " + height + ", and " + weight
                + " I get " + (age + height + weight) + "." );
        System.out.println("In centimeters her height will be "+Math.round(height*2.54)+"cm"+ " and her weight in kilos is "+Math.round(weight/2.205)+"kg." );

    }
}
