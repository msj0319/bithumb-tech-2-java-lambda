package net.msj0319.api.customer.lambda;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class MyUnaryOpTest {

    @Test
    void operator() {
        List<Integer> list = Arrays.asList(10,20,30,40,50); //데이터
        UnaryOperator<Integer> operator = i -> i * 100;     //
        List<Integer> newList = mapper(list, operator);
        assertThat(newList, is(equalTo(Arrays.asList(1000,2000,3000,4000,5000))));

    }

    private static <T> List<T> mapper(List<T> list, UnaryOperator<T> operator) {
        List<T> newList = new ArrayList<>();
        for (T t : list) {
            T e = operator.apply(t);
            newList.add(e);
        }
        return newList;
    }
}