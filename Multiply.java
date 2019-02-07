package multiplication;

import java.math.BigInteger;

public class Multiply {

    public String multiply(String s1, String s2){
        BigInteger b1 = new BigInteger(s1);
        BigInteger b2 = new BigInteger(s2);
        return b1.multiply(b2).toString();
    }

    public String square(String s){
        BigInteger number = new BigInteger(s);
        return number.multiply(number).toString();
    }

    public String factorial(String s){
        BigInteger copyOfNumber = new BigInteger(s);
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
