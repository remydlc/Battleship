package battleship;

import java.util.HashMap;
import java.util.Map;


public class Arrays {

    static String[][] createArray(int rows, int columns) {
        String[][] twoDimArray = new String[rows+1][columns+1];
        int rowLetter = 'A';
        for (int i = 0; i < twoDimArray.length; i++) {
            int columnNumber = 1;
            for (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j] = "~";
                if (i == 0) {
                    if (j == 0) {
                        twoDimArray[i][j] = " ";
                    } else {
                        twoDimArray[i][j] = Integer.toString(columnNumber);
                        columnNumber++;
                    }
                }
                else if (j== 0){
                    twoDimArray[i][j] = Character.toString(rowLetter);
                    rowLetter = rowLetter +1;
                }
            }
        }
        return twoDimArray;
    }

    static void printArray(String[][] twoDimArray) throws IndexOutOfBoundsException{
        System.out.println();
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void arrayIndex () {
        Map<String, Integer> arrayIndexMap = Map.of(
                "A",0
                ,"B",1
                ,"C",2
                ,"D",3
                ,"E",4
                ,"F",5
                ,"G",6
                ,"H",7
                ,"I",8
                ,"J",9
        );
    }

}