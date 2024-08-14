package collection.List.Arrays;

import java.util.Arrays;

public class LearnArray {
    public static void main(String[] args) {

         /*//declare a array
         String[] colors= new String[5];

         colors[0]="Purple";
         colors[1]="Blue";
         colors[4]="Green";
         colors[3]="Grey";

        System.out.println(Arrays.toString(colors));
        System.out.println(colors[1]);*/

        /*int[] numbers= {1,2,3};

        for (int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }

        for(int i =numbers.length-1;i>=0;i--){
            System.out.print(numbers[i]+" ");
        }

        System.out.println(numbers.length);

        for(int number: numbers){
            System.out.println(number);

        }*/

        char[][] board= new char[3][3];

        for(int i=0;i<3; i++){
            for(int j=0;j<3;j++){
                board[i][j]='-';
            }
        }
        board[0][0]='0';
        board[1][0]='0';
        board[2][0]='0';

        System.out.println(Arrays.deepToString(board));

        char[][] boardTwo= new char[][]{
                new char[]{'-','-','-'},
                new char[]{'-','-','-'},
                new char[]{'-','-','-'},
        };
        System.out.println(Arrays.deepToString(boardTwo));


    }
}
