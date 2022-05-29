import java.util.Scanner;

public class SortedArray {

    public int[] getIntegers(int size) {
        Scanner scanner = new Scanner(System.in);

        int[] myArr = new int[size];
        System.out.println("Enter " + size + "integers");

        for (int i = 0; i < size; i++) {
            myArr[i] = scanner.nextInt();
        }

        scanner.close();

        return myArr;
    }

    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element " + i + " contents "+ arr[i]);
        }
    }

    public int[] sortIntegers(int[] arr) {

        for (int i = arr.length-1; i > 0 ; i--) {

            for (int j = 0; j < i; j++) {
             if(arr[j] < arr[j+1]) {
                 int temp = arr[j];
                 arr[j] = arr[j+1];
                 arr[j+1] = temp;
             }
            }
        }

        return arr;



    }
}
