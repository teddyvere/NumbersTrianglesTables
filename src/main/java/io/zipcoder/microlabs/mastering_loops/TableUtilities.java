package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String s = "";
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                s += String.format("%3d |", i * j);

            }
            s += "\n";
        }
        return s;

    }

    public static String getLargeMultiplicationTable() {
        String s = "";
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                s += String.format("%3d |", i * j);

            }
            s += "\n";


        }
        return s;

    }
        public static String getMultiplicationTable ( int tableSize) {
            String s = "";
            for (int i = 1; i <= tableSize; i++) {
                for (int j = 1; j <= tableSize; j++) {
                    s += String.format("%3d |", i * j);

                }
                s += "\n";
            }
            return s;
        }
    }