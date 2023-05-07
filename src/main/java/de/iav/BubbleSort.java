package de.iav;

public class BubbleSort {

    public static int[] bubbleSortIncremental(int[] givenArray) {
        int temp=0;
        for (int j=0; j<givenArray.length; j++) {
            for (int i = 0; i < givenArray.length-1; i++) {
                if (givenArray[i + 1] < givenArray[i]) {
                    temp = givenArray[i];
                    givenArray[i] = givenArray[i + 1];
                    givenArray[i + 1] = temp;
                }
            }
        }
        return givenArray;
    }
}
