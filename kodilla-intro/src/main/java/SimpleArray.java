public class SimpleArray {
    public static void main(String[] args){

        String [] countries = new String [6]; //create an array
        countries[0] = "Ireland";               //initialize array
        countries[1] = "Portugal";
        countries[2] = "Italy";
        countries[3] = "Belarus";
        countries[4] = "Slovakia";
        countries[5] = "France";

        String country = countries[3];

        System.out.println (country);

        int numberOfElements = countries.length;

        System.out.println ("Dlugosc mojej tablicy wynosi "+numberOfElements+" elementow.");
    }
}
