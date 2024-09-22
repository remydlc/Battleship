package battleship;

import java.util.*;
import java.util.Arrays;

public class Coordinates {

    private static final Map<String, Integer> letterIndex = new HashMap<>();
    static {
        letterIndex.put("A", 1);
        letterIndex.put("B", 2);
        letterIndex.put("C", 3);
        letterIndex.put("D", 4);
        letterIndex.put("E", 5);
        letterIndex.put("F", 6);
        letterIndex.put("G", 7);
        letterIndex.put("H", 8);
        letterIndex.put("I", 9);
        letterIndex.put("J", 10);
    }

    static String[] getCoordinates (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coordinates of the ship: ");
        String coordinates = sc.nextLine();

        return coordinates.split("\\s");
    }

    public static boolean validateShipSize (List<Integer> shipSizeList) {
        int gridSize = 11;
        int sizeA = shipSizeList.get(0);
        int sizeB = shipSizeList.get(1);
        if ( (sizeA < gridSize && sizeA >0 ) && (sizeB) < gridSize && sizeB >0 ) return true;
        else {
            return false;
        }
    }

    public static List<Integer> getShipSize (String[] splitCoordinates) {
        String coordinateA = splitCoordinates[0];
        String coordinateB = splitCoordinates[1];
        int coordinateALength = coordinateA.length();
        int coordinateBLength = coordinateB.length();
        StringBuilder numA = new StringBuilder();
        StringBuilder numB = new StringBuilder();
        try {
            for ( int i = 1; i < coordinateALength; i++ ) {
                numA.append(coordinateA.charAt(i));
            }
        } catch (Exception e) {
            System.out.println("Error!");
        }

        try {
            for ( int i = 1; i < coordinateBLength; i++ ) {
                numB.append(coordinateB.charAt(i));
            }
        } catch (Exception e) {
            System.out.println("Error!");
        }
        List<Integer> coordinates = new ArrayList<>();
        coordinates.add(Integer.parseInt(numA.toString()));
        coordinates.add(Integer.parseInt(numB.toString()));
        return coordinates;
    }

    public static void printLength(String[] splitCoordinates) {

        List<String> lettersOnlyList = new ArrayList<>(
                Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "J", "K")
        );

        List<Integer> shipSizeList = getShipSize(splitCoordinates);
        int pointA = shipSizeList.get(0);
        int pointB = shipSizeList.get(1);
        String coordinateA = splitCoordinates[0];
        String coordinateB = splitCoordinates[1];
        String letterA = String.valueOf(coordinateA.charAt(0));
        String letterB = String.valueOf(coordinateB.charAt(0));
        StringBuilder coordinatesRange = new StringBuilder();
        int count = 0;
        if ( letterA.equals(letterB) ) {
            if (pointA < pointB) {
                for ( int i = pointA; i <= pointB; i++ ) {
                    coordinatesRange.append(letterA).append(i).append(" ");
                    count++;
                }
            } else {
                for ( int i = pointA; i >= pointB; i-- ) {
                    coordinatesRange.append(letterA).append(i).append(" ");
                    count++;
                }
            }
        } else if (pointA == pointB) {
            if (letterIndex.get(letterA) < letterIndex.get(letterB)) {
                for (int i = letterIndex.get(letterA); i <= letterIndex.get(letterB); i++) {
                    coordinatesRange.append(lettersOnlyList.get(i - 1)).append(pointA).append(" ");
                    count++;
                }
            } else {
                for (int i = letterIndex.get(letterA); i >= letterIndex.get(letterB); i--) {
                    coordinatesRange.append(lettersOnlyList.get(i - 1)).append(pointB).append(" ");
                    count++;
                }
            }
        }

        System.out.println("Length: " + count);
        System.out.println("Parts: " + coordinatesRange);
    }

    public static boolean verifyCoordinateLetter (String[] splitCoordinates) {

        String coordinateA = splitCoordinates[0];
        String coordinateB = splitCoordinates[1];
        String letterA = String.valueOf(coordinateA.charAt(0));
        String letterB = String.valueOf(coordinateB.charAt(0));
        List<Integer> indexes = getShipSize(splitCoordinates);

        return letterA.equals(letterB) || Objects.equals(indexes.get(0), indexes.get(1)) && letterIndex.containsKey(letterA) && letterIndex.containsKey(letterB);

    }
}
