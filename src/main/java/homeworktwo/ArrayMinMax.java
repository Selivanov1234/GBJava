package homeworktwo;

public class ArrayMinMax {
    public void arrMax () {
        int max = 0;
        int arr [] = {-3,-5,-11,-21,-12};
        //int arr [] = {70,5,7,3,6,1,2,7,10,12,18,99,24};
            max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
           }
            System.out.println("Максимальный элемент массива: " + max);
       }

    public void arrMin () {
        int arr [] = {-3,-5,-11,-21,-12};
       // int arr [] = {70,5,7,3,6,1,2,7,10,12,18,99,24};
            int min = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr [i];
                }
            }
            System.out.println("Минимальный элемент массива: " + min);
        }
    }

