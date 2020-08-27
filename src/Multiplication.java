import java.math.BigInteger;
import java.util.Arrays;

public class Multiplication {


    public BigInteger multiplicationUsingBigIntegerClass(BigInteger num1, BigInteger num2){
        return num1.multiply(num2);

    }

    public int[] convertBigIntegerToArray(BigInteger num1){
        String numString = num1.toString();
        int numArray[] = new int[numString.length()];

        for (int i = 0; i < numString.length(); i++)
           numArray[i] = (numString.charAt(i)) - '0';

        return numArray;

        }

    public BigInteger convertArrayToBigInteger(int array[]){
        BigInteger resultNumber = new BigInteger("0");
        for (int i = 0; i < array.length; i++)
            resultNumber =  resultNumber.multiply(BigInteger.valueOf(10)).add(BigInteger.valueOf(array[i]));

        return resultNumber;
    }

    public  BigInteger multiplicationAlgorithmFromScrach(BigInteger num1, BigInteger num2){

        BigInteger testik= new BigInteger("12345678901234567890");
        int test[] = convertBigIntegerToArray(testik);

        int a[] = convertBigIntegerToArray(num1);
        int b[] = convertBigIntegerToArray(num2);

        int resultArray[] = new int[a.length + b.length];
        Arrays.fill(resultArray,0);


        for(int i= b.length -1, k = 0; i >= 0; i--, k++){
            int carry = 0;
            for(int j= a.length -1, l = 0; j >= 0; j--, l++)
            {
                int atemp = a[j];
                int btemp = b[i];
                int tmp = atemp * btemp;
                int t = (a[j] * b[i]) + resultArray[resultArray.length - 1 - k - l]  + carry;
                carry = t/10;
                if(j == 0 && carry>0){
                    resultArray[ resultArray.length - 1 - k - l -1 ] = carry;
                    resultArray[resultArray.length - 1 - k - l] = t%10;
                }
                else {
                    resultArray[resultArray.length - 1 - k - l] = t%10;
                }

            }
        }

      return convertArrayToBigInteger(resultArray);


    }



}
