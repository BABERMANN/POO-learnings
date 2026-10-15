package FunctionInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    static void main(String[] args) {
        int increment = incrementByOne(0);
        System.out.println(increment);

        Integer incremento = incrementByOneFunction.apply(2);
        System.out.println(incremento);

        Function<Integer, Integer> addByOneAndThenMultiplyByTen = incrementByOneFunction.andThen(multipleByTen);

        //function
        Integer coisa_linda = addByOneAndThenMultiplyByTen.apply(9);
        System.out.println(coisa_linda);

        //biFunction
        Integer coisa_linda2 = addByOneAndThenMultiplyByTenBiFunction.apply(4,100);
        System.out.println(coisa_linda2);

    }

    //Bifunction
    static BiFunction<Integer,Integer,Integer> addByOneAndThenMultiplyByTenBiFunction =
            (numberToIncrement, numberToMultiple) -> (numberToIncrement + 1) * numberToMultiple;

    //function
    static Function<Integer, Integer> incrementByOneFunction = //
            number -> number + 1;  //number++ nao funciona

    static Function<Integer,Integer> multipleByTen =
            number -> number * 10;

    //imperative approach
    static int incrementByOne(int number){
        return number + 1;
    }
}
