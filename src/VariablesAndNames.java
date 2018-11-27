public class VariablesAndNames {
    public static void main(String[] args){
// Declares variables type of interger;
        int cars, drivers, passengers, cars_not_driven, cars_driven;
// Declares variables type of double;
        double space_in_a_car, carpool_capacity, average_passengers_per_car;
// Assign values to declared variables;
// Assigning 100 to cars, which is a whole number. As we declared above variable car holds values that are integers.
        cars = 100;
// Variable space_in_a_car holds double, as declared above;
        space_in_a_car = 4.0;
// The value of drivers must be an integer.
        drivers = 30;
// The value of passengers must be an integer.
        passengers = 90;
// The value of cars_not_driven must be an integer.
        cars_not_driven = cars - drivers;
// The variable cars_driven was not declared, so I declared it as an integer, since variable drivers is an integer;
        cars_driven = drivers;
// Variable carpool_capacity is double, so the output will be a double as well.
        carpool_capacity = cars_driven * space_in_a_car;
// Variable carpool_capacity is double, so the output will be a double as well.
        average_passengers_per_car = passengers / cars_driven;


        System.out.println( "There are " + cars + " cars available." );
        System.out.println( "There are only " + drivers + " drivers available." );
        System.out.println( "There will be " + cars_not_driven + " empty cars today." );
        System.out.println( "We can transport " + carpool_capacity + " people today." );
        System.out.println( "We have " + passengers + " to carpool today." );
        System.out.println( "We need to put about " + average_passengers_per_car + " in each car." );



    }
}
