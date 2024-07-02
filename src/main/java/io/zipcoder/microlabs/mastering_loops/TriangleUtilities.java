package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String rows = "";
        for (int i = 1; i < numberOfRows; i++) {
            rows += getRow(i)+"\n";

        } return rows;
    }
    public static String getRow(int numberOfStars) {
        String s = "";
        for(int i = 0; i < numberOfStars; i++) {
            s += "*";
        }
        return s;
    }

    public static String getSmallTriangle() {
        String triangle = getTriangle(5);
        return triangle;
    }

    public static String getLargeTriangle() {
        String triangle = getTriangle(10);
        return triangle;
    }

}
