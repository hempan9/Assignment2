package test;

public class arrayTwo {
    public static void main(String[] args) {
        int[][] arr ={{10,2,3,4},
                    { 5,6,7},
                     {3,8,9},
                {1,9,7,8,10}
                         };
        System.out.println("Row "+arr.length);
        System.out.println("Column "+arr[2].length);
        for (int i = 0; i < arr.length; i++) {  //row
            for (int j = 0; j < arr[i].length; j++) {   //column
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        find(arr);
    }

    public static void find(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j]==10)
                    System.out.println("found at index " + i + " " + j);
                else
                    System.out.println("Not found at "+i+" "+j);


            }

        }
    }
}
