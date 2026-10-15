package FunctionInterface;

import java.util.function.Function;

public class _Function {
    static void main(String[] args) {
        int increment = incrementByOne(0);
        System.out.println(increment);

        Integer incremento = incrementByOneFunction.apply(2);
        System.out.println(incremento);

        Function<Integer, Integer> addByOneAndThenMultiplyByTen = incrementByOneFunction.andThen(multipleByTen);

        Integer coisa_linda = addByOneAndThenMultiplyByTen.apply(9);
        System.out.println(coisa_linda);

    }

    static Function<Integer, Integer> incrementByOneFunction = //
            number -> number + 1;  //number++ nao funciona

    static Function<Integer,Integer> multipleByTen =
            number -> number * 10;

    static int incrementByOne(int number){
        return number + 1;
    }
}
