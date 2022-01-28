public class LeapYear {
    public static void main(String[] args) {

        int inputYear = 1900; //input a year

        if (inputYear % 400 == 0) //if is divided by 400
        {
            System.out.println ("PRZESTEPNY");
        }
        else if (inputYear % 4 == 0 && inputYear % 100 != 0) //if not divided by 400, but divided by 4 and not divisible by 100
        {
            System.out.println ("PRZESTEPNY");
        }
        else // every other year
        {
            System.out.println("NIEPRZESTEPNY");
        }

    }
}