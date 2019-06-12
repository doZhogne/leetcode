package easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwoSumTest {

    private TwoSum tester = new TwoSum();

    @Test
    public void testTwoSumBasic() {
        int[] numbers = new int[]{2, 7, 11, 15};
        int[] answer = new int[]{0, 1};

        int[] indices = tester.twoSum(numbers, 9);

        assertEquals(answer[0], indices[0]);
        assertEquals(answer[1], indices[1]);
    }

    @Test
    public void testTwoSumBasic2() {
        int[] numbers = new int[]{12, 7, 11, 15};
        int[] answer = new int[]{2, 3};

        int[] indices = tester.twoSum(numbers, 26);

        assertEquals(answer[0], indices[0]);
        assertEquals(answer[1], indices[1]);
    }

    //Test for null pointer
}
