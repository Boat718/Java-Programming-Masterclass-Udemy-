public class LeapYearCalculator {
    public static void main(String[] args) {
        boolean x = isLeapYear(1924);
        System.out.println(x);
    }

    public static boolean isLeapYear (int year){
        if(year < 1 || year > 9999){
            return false;
        } else if(year%4 == 0 && year%100 != 0 || year%400 == 0){
            return true;
        } else {
            return false;
        }
    }
}
