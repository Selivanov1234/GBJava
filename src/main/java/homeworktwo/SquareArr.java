package homeworktwo;

public class SquareArr {
    public void diagonalFill (int a,int b) {
        int arr [][] = new int[a][a];
        int k = 0;
        int d = 0;
        int l = a - 1;

        for (int i = 0; i < a; i = i + 1) {
            for (int j = 0; j < b; j = j + 1) {
               if ((i & j) == k)  {
                   arr[i][j] = 1;
                   k++;
               };
            }
        }

       for (int i = 0; i < a; i = i + 1) {
           for (int j = b; j >= 0; j = j - 1) {
               if ((i == d) && (j == l))  {
                   arr[i][j] = 1;
                   d++;
                   l--;
               };
           }
       }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
