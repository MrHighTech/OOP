import java.util.Arrays;

public class Arrange {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrangeOddEven(new int[]{3, 4, 78, 2, 1, 7})));
    }

    // Sort so odd numbers are on odd indexes, and even on even indexes considering it will be same number of
    // odd and even numbers
    public static int[] arrangeOddEven(int[] arr) {
        int length = arr.length;
        int temp;

        for (int i = 0; i < length; i++) {
            if (arr[i] % 2 != 0 && i % 2 == 0) {
                for (int j = i; j < length; j++) {
                    if (arr[j] % 2 == 0) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j]= temp;
                        break;
                    }
                }
            } else if(arr[i] % 2 == 0 && i % 2 != 0) {
                for (int j = i; j < length; j++) {
                    if (arr[j] % 2 != 0) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j]= temp;
                        break;
                    }
                }
            }
        }

        return arr;
    }
}
