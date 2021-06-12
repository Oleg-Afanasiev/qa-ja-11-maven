package com.academy.lesson07.lambda;

import com.academy.lesson07.Boxer;
import com.academy.lesson07.Fighter;

public class LambdaDemo {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter();
        Boxer fighter2 = new Fighter();

        fighter1.boxing();
        fighter2.boxing();

        Boxer fighter3 = new BoxerStudent();
        fighter3.boxing();

        // анонимный класс - класс без названия
        Boxer fighter4 = new Boxer() {
            @Override
            public void boxing() {
                System.out.println("New boxing technique");
            }
        };

        fighter4.boxing();

        Boxer fighter5 = ()->System.out.println("New boxing technique (lambda)");
        fighter5.boxing();

        Operation calcSum = (n1, n2)-> n1 + n2; // способ реализации Operation -> сумма
        Operation calcDiff = (n1, n2)-> n1 - n2;
        Operation calcMult = (n1, n2)-> n1 * n2;

        System.out.println(calcSum.calc(3, 4));
        System.out.println(calcDiff.calc(3, 4));
        System.out.println(calcMult.calc(3, 4));

        Operation sumImpl = new OperationSumImpl(); //длинный способ реализации Operation -> сумма
        System.out.println(sumImpl.calc(1, 2));

        Operation calcSumExt = (n1, n2) -> {
            System.out.println("Вычисляю сумма двух чисел");
            return n1 + n2;
        };

        System.out.println(calcSumExt.calc(3, 2));

        Operation calcSumUsingMethod1 = (n1, n2)->sum(n1, n2);
        System.out.println(calcSumUsingMethod1.calc(1, 3));

        Operation calcSumUsingMethod2 = LambdaDemo::sum;
        System.out.println(calcSumUsingMethod2.calc(1, 3));
    }

    public static int sum(int number1, int number2) {
        return number1 + number2;
    }
}
