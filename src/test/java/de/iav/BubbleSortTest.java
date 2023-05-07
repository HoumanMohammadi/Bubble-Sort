package de.iav;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    public void theArray573190WillBeSortedAs013579(){
        int[] givenArray = new int[]{5, 7, 3, 1, 9, 0};

        int[] expectedArray = new int[]{0 ,1 ,3 ,5 ,7 ,9};
        givenArray=BubbleSort.bubbleSortIncremental(givenArray);

        Assertions.assertArrayEquals(expectedArray,givenArray);



    }

}