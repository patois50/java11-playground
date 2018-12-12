package lambdas;

import java.math.BigDecimal;
import java.util.function.Consumer;

public class LambdasRunner {

    public static void main(String[] args) {

        // can now use var keyword and annotation in the lambda
        Consumer<BigDecimal> moneyConsumer = (@Deprecated var money) -> System.out.println("i got this much money! = " + money);


    }
}
