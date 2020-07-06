package homeworktwo;

import java.util.Arrays;

public class CheckArr {
    public void ifEqual () {
        int arr[] = {2,4,5,6,4,3,3,4,5,6};
        int sum = 0;
        int half = 0;
        int leftPart = 0;
        int rightPart = 0;
        for (int i : arr) {
           // System.out.println("Значения элементов массива: " + i);
            sum = sum +i;
        }
        //System.out.println(Arrays.toString(arr));
        if (sum % 2 == 0) {
            for (int i = 0; i < arr.length; i++) {
                half = half + arr[i];
                if ((sum / 2) == (half)) {
                    System.out.println("true");
                }
            }
            System.out.println(Arrays.toString(arr));
        } else {
            System.out.println("False");
        }

    }
}
