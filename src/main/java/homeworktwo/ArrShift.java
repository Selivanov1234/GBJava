package homeworktwo;
/*
 **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
 *  при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично. Для усложнения задачи
 *  нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ];
 *  [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами. */

public class ArrShift {
    public void shiftLeft (int n) {
        int moveRight = 0;
        int moveLeft = 0;
        int firstItem = 0;
        int arr [] = {2,3,4};
        firstItem = (arr[0]);
        if (n > 0) {
            for (int i = 0; i < arr.length; i++) {
               //System.out.print(arr[i] + " \t");
               moveLeft = arr[i + n];
               arr[i] = moveLeft;
               if (arr[i] > (arr.length)) {
                   arr[arr.length - 1] = firstItem;
                  return;
              }
      //     System.out.println(arr[i] + "\t");
      //     }
      // }else if (n < 0) {
      //     for (int i = 0; i < arr.length; i++) {
      //         moveRight =
          }
       }
    }
}

