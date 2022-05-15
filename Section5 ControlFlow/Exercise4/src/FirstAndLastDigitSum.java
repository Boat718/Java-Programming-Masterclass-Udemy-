public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstLastDigit(257));
    }

    public static int sumFirstLastDigit(int num) {
        if(num < 0){
            return -1;
        }

        if(num == 0){
            return 0;
        }

        int store = num;
        int first = 0;
        int last = 0;

        while(store > 0) {
            if(store == num) {
                first = store % 10;
            }
            if(store % 10 == store) {
                last = store;
            }
            store /= 10;
        }

        return first+last;
    }
}
