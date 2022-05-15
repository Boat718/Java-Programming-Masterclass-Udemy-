public class SumOdd {
    public static void main(String[] args) {
        System.out.println(sumOdd(1,100));
    }

    public static boolean isOdd(int num) {
        if(num < 0) {
            return false;
        }
        return num % 2 != 0;
    }

    public static int sumOdd(int start, int end) {
        if(end < start || start < 0) {
            return  -1;
        }
        int sumOdd = 0;
        for(int n = start; n <= end; n++){
            if(!isOdd(n)) {
                continue;
            }
            sumOdd += n;
        }
        return sumOdd;

    }

}
