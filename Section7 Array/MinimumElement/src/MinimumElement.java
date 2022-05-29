import java.util.Scanner;

public class MinimumElement {


    public int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many elements you needs to enter ?");
        return scanner.nextInt();
    }

    public int[] readElements(int elements) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[elements];

        for (int i = 0; i < elements; i++) {
            System.out.println("Enter integer: ");
            int n = scanner.nextInt();
            scanner.nextLine();
            arr[i] = n;
        }

        return arr;
    }

    public int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int minVal = arr[i];
            if(minVal < min) {
                min = minVal;
            }
        }

        return min;
    }



}
