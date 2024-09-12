package battleship;

import javax.swing.*;
import java.util.*;
import java.util.Arrays;
import battleship.Arrays.*;

public class Coordinates {

    private String SPACE = " ";
    private String TAB = "	";
    private String NEW_LINE = "\n";

    static HashMap getCoordinates (){
        List<String> validLetters = List.of("A", "B", "C", "D", "E", "F", "G", "H", "I", "J");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coordinates of the ship: ");
        String coordinates = sc.nextLine();
        String[] splitCoordinates = coordinates.split("\\s");
        String coordinateA = splitCoordinates[0];
        String coordinateB = splitCoordinates[1];
        boolean sameCoordinates = false;

        System.out.println(coordinateB.charAt(0) == coordinateA.charAt(0));

        ListIterator it = validLetters.listIterator();
        while (it.hasNext()) {
            if (validLetters.contains(it.next())){
            System.out.println(it.next() + " letter is similar");
            }
        }


        HashMap coordinatesMap = new HashMap();
        coordinatesMap.put("coordinateA", splitCoordinates[0]);
        coordinatesMap.put("coordinateB", splitCoordinates[1]);

        return coordinatesMap;
    }

    static boolean validateCoordinates (String coordinates) {
        //implement validation here
        List<String> validLetters = List.of("A", "B", "C", "D", "E", "F", "G", "H", "I", "J");
        Integer gridSize = 9;
        return false;
    }
}
