package homeworktwo;

public class MutiplyArr {
    public void multiply (int value) {
        int arr[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < value) {
                //System.out.print(arr[i]+ "\t");
                arr [i] = arr[i] * 2;
                //System.out.println(arr[i]);
            }
        }
    }
}
