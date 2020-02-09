import java.util.Arrays;

public class HomeWork2 {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();

    }

    public  static  void exercise1() {
        int [] arr = {0,1,0,0,0,1,1,1,1,0,1,0};
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] == 1){
                arr[i] = 0;
            } else arr[i] = 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public  static void exercise2() {
                int[] arr = new int[8] ;
                for (int i = 1 ; i < arr.length ; i ++ ) {
                    int j = 3;
                    arr[i] = i * j;
                }
                System.out.println(Arrays.toString(arr));
        }
     public static  void exercise3() {
        int [] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 6){
                arr[i] = arr[i] * 2;
            }
        }
         System.out.println(Arrays.toString(arr));
     }

     public  static void exercise4() {
        int [][] arr = new int[6][6];
        for(int i = 0; i < arr.length ; i++) {
            System.out.print("\n");
            for (int j = 0; j < arr.length; j++) {
                if (i == j)  arr[i][j] = 1;
                else if (i + j == arr.length - 1)  arr[i][j] = 1;
                else arr[i][j] = 0;
                System.out.print(arr[i][j] + "\t");
            }
        }
            System.out.println("\n");
    }

     public static void exercise5() {
        int[] arr = {3,5,4,9,15,1,5,20,42,5,9};
        int max = -1, min = 0;
        for (int i = 0; i < arr.length; i++ ){
        if(arr[i]>max){
        max=arr[i];
          }
        }
        min = max;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Максимальное значение в массиве: " + max + "   Минимальное значение в массиве: " + min);
     }
}

