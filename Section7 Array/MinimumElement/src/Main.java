import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MinimumElement minimumElement = new MinimumElement();

        int[] x = minimumElement.readElements(minimumElement.readInteger());

        System.out.println(Arrays.toString(x));
        System.out.println(minimumElement.findMin(x));

    }
}
