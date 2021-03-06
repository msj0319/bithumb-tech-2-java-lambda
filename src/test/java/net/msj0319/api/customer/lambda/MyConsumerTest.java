package net.msj0319.api.customer.lambda;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class MyConsumerTest {

    @Test
    void main() {
        List<Integer> list = Arrays.asList(1,2,3);
                                    //메소드 참조
        Consumer<Integer> consumer = System.out::println;
        consumer.accept(56);    //56을 프린트하라
        printElements(list, consumer);

    }
    private static <T> void printElements(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }
}