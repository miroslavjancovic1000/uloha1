import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTest {


    @Test
    void multiplicationUsingBigIntegerClass() {
        BigInteger num1 = new BigInteger("12345678901234567890");
        BigInteger num2 = new BigInteger("11111111111111111111");

        BigInteger result = new BigInteger("137174210013717420998628257899862825790");
        Multiplication m = new Multiplication();
        assertEquals(result, m.multiplicationUsingBigIntegerClass(num1,num2));

    }

    @Test
    void convertBigIntegerToArray() {
        BigInteger num1 = new BigInteger("12345678901234567890");
        int resultArray[] = {1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0};

        Multiplication m = new Multiplication();
        assertArrayEquals(resultArray, m.convertBigIntegerToArray(num1));

    }

    @Test
    void convertArrayToBigInteger() {

        int array[] = {1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0};
        BigInteger num = new BigInteger("12345678901234567890");

        Multiplication m = new Multiplication();
        assertEquals(num, m.convertArrayToBigInteger(array));

    }

    @Test
    void multiplicationAlgorithmFromScrach() {
        BigInteger num1 = new BigInteger("12345678901234567890");
        BigInteger num2 = new BigInteger("11111111111111111111");

        BigInteger result = new BigInteger("137174210013717420998628257899862825790");
        Multiplication m = new Multiplication();
        assertEquals(result, m.multiplicationAlgorithmFromScrach(num1,num2));

    }


    @Test
    void testResultsOfBothAlgorithms() {
        BigInteger num1 = new BigInteger("12345678901234567890");
        BigInteger num2 = new BigInteger("11111111111111111111");
        Multiplication m = new Multiplication();
        assertEquals(m.multiplicationUsingBigIntegerClass(num1,num2), m.multiplicationAlgorithmFromScrach(num1,num2));


    }
}