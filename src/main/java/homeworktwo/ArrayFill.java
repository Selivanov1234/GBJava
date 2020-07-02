package homeworktwo;

public class ArrayFill {
       public void fillArr (int inc) {
        int arr [] = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * inc;
            System.out.println(arr[i]);
        }
    }
}
