package battleship;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        String[][] twoDimArray = Arrays.createArray(10, 10);
        Arrays.printArray(twoDimArray);
        HashMap<Integer, String> map = Coordinates.getCoordinates();

    }
}
