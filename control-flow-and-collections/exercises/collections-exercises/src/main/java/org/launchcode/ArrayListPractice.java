package org.launchcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import jdk.dynalink.beans.StaticClass;


public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> listed = new ArrayList<>();{
            listed.add(11);
            listed.add(22);
            listed.add(33);
            listed.add(44);
            listed.add(55);
            listed.add(66);
            listed.add(77);
            listed.add(88);
            listed.add(99);
            listed.add(101);
        }

    }
    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int listed : arr) {
            if (listed % 2 == 0) {
                total += listed;
            }
        }
        return total;
    }
}
