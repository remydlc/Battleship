package battleship;

import java.util.List;

import static battleship.Coordinates.*;

public class Main {

    public static void main(String[] args) {
        String[][] twoDimArray = Arrays.createArray(10, 10);
        Arrays.printArray(twoDimArray);
        String[] coordinatesList = getCoordinates();
        List<Integer> shipSizeList = getShipSize(coordinatesList);

        if ((verifyCoordinateLetter(coordinatesList)) && (validateShipSize(shipSizeList) ))
            printLength(coordinatesList);
        else {
            System.out.println("Error");
        }

    }
}
