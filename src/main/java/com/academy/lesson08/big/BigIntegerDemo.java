package com.academy.lesson08.big;

import com.academy.lesson07.lambda.LambdaDemo;

import java.math.BigInteger;

public class BigIntegerDemo {
    public static void main(String[] args) {
        Integer number = Integer.MAX_VALUE;
        System.out.println(number);
        System.out.println(number + 1);

        Long biggerNumber = number + 1L;
        System.out.println(biggerNumber);
        Long biggerNumber2 = Long.MAX_VALUE;
        System.out.println(biggerNumber2);
        System.out.println(biggerNumber2 + 1);

        BigInteger bigNumber = BigInteger.valueOf(biggerNumber2);
        BigInteger bigNumber2 = BigInteger.valueOf(biggerNumber2);
        BigInteger result = bigNumber.multiply(bigNumber2);
        BigInteger result2 = result.multiply(result).multiply(result);
        System.out.println(result2);

        BigInteger bigNumber3 = new BigInteger("6156563468186637372913624323295733253638594398542155158925900306066452200189237495723945792347592347572349572935792357923478700810278654093633374614700204645941249");
    }
}
