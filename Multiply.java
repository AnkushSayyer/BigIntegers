package multiplication;

import java.math.BigInteger;

public class Multiply {

    public String multiply(String number1, String number2){
        BigInteger bigInteger1 = new BigInteger(number1);
        BigInteger bigInteger2 = new BigInteger(number2);
        return bigInteger1.multiply(bigInteger2).toString();
    }

    public String square(String numberString){
        BigInteger number = new BigInteger(numberString);
        return number.multiply(number).toString();
    }

    public String factorial(String numberString){
        BigInteger copyOfNumber = new BigInteger(numberString);
        BigInteger subtract = new BigInteger("1");
        BigInteger result = new BigInteger("1");
        BigInteger zero = new BigInteger("0");
        while (copyOfNumber.compareTo(zero)!=0) {


            //System.out.println("in loop" + copyOfN);
            result = result.multiply(copyOfNumber);
            copyOfNumber = copyOfNumber.subtract(subtract);
        }


        return result.toString();
    }

    public static void main(String[] args) {
        BigInteger b = new BigInteger("1");
        System.out.println(b);

        //BigInteger b1 = new BigInteger("dfg");
        Multiply m = new Multiply();
        System.out.println(m.factorial("5"));
    }

}
