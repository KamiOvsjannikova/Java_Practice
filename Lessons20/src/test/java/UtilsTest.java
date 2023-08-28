


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    int[] expArr = {1, 2, 3};
    int[] testArr;

    @BeforeEach
    void init(){
        testArr = Utils.getNumbers();
    }

    @Test
    void getNumberTestElement() {
        assertEquals(2, testArr[1]);
    }
    @Test
    void getNumberTestEquals() {
        assertEquals(3,testArr.length);
        assertArrayEquals(expArr, testArr);
    }

    @Test
    void findMaxArrayEmpty(){
        int[] testArray = {};
        assertEquals(0,Utils.findMax(testArray));
    }

    @Test
    void findMaxArrayTrueResult(){
        int[] testArray = {1, 9, 3, 8, -1};
        assertEquals(9,Utils.findMax(testArray));
    }
}