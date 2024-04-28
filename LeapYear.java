public class LeapYear {
    public static void main(String[] args) {
        int year = 2005;
        int century_year =0 ;

        if (year %100 == 0){
            century_year = 1;
        }

        if (year % 4 == 0 && century_year == 1) {
            if (year % 400 == 0) {
                System.out.println("leap year");
            } else {
                System.out.println("not leap year");
            }
        }
        else if(year % 4 == 0 && century_year ==0) {
            System.out.println("leap year");
        }
        else {
            System.out.println("not a leap year");
        }
    }
}
