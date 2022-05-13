public class SpeedConverter {
    public static void main(String[] args){
        long x = toMilesPerHour(12.5);
        printConversion(25.42);
        System.out.println(x);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if(kilometersPerHour < 0){
            return -1;
        }
        else {
            return Math.round(kilometersPerHour / 1.609);
        }
    }

    public  static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }
        else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
