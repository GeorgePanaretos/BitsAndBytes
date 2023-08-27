package ArrayManipulation.TwoSumTarget;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTargetTest {

    @Test
    void testHasTwoSum() {
        int[] arr1 = {1, 3, 8, 2};
        assertTrue(TwoSumTarget.hasTwoSum(arr1, 10));
        int [] arr2 = {4, 2, 6, 5, 2};
        assertTrue(TwoSumTarget.hasTwoSum(arr2, 4));
    }

    @Test
    void falseHasTwoSum (){
        int [] arr ={3, 9, 13, 7};
        assertFalse(TwoSumTarget.hasTwoSum(arr,8));
    }

    @Test
    void hashTwoSum() {
        int[] arr1 = {1, 3, 8, 2};
        assertTrue(TwoSumTarget.hashTwoSum(arr1, 10));
        int [] arr2 = {4, 2, 6, 5, 2};
        assertTrue(TwoSumTarget.hashTwoSum(arr2, 4));
    }

    @Test
    void falseHashTwoSum (){
        int [] arr ={3, 9, 13, 7};
        assertFalse(TwoSumTarget.hashTwoSum(arr,8));
    }
}