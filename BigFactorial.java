package bigFactorial;

import java.util.ArrayList;
import java.util.Collections;

public class BigFactorial {

    public String factorial(int n){

        if(checkBoundary(n))
            return "1";

        ArrayList<Integer> result = new ArrayList<>();
        result.add(1);

        for (int i=2; i<=n; i++)
            multiply(result, i);

        Collections.reverse(result);

        StringBuilder resultString = new StringBuilder();
        result.forEach((i)->resultString.append(i));

        return resultString.toString();
    }

    private boolean checkBoundary(int n) {
        if (n==0||n==1)
            return true;
        return false;
    }

    private void multiply(ArrayList<Integer> result, int multiplyWith) {

        int carry = 0;
        int product;

        for (int j=0; j<result.size(); j++){
            product = result.get(j)*multiplyWith + carry;
            result.set(j, product%10);
            carry = product/10;
        }

        while (carry!=0){
            result.add(carry%10);
            carry/=10;
        }


    }

    public static void main(String[] args) {
        BigFactorial bf = new BigFactorial();
        System.out.println(bf.factorial(5));
    }

}
