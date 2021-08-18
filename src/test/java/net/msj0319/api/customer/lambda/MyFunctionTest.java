package net.msj0319.api.customer.lambda;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import static org.junit.jupiter.api.Assertions.*;

class MyFunctionTest {

    @Test
    void main() {
        //데이터 준비
        List<String> list = Arrays.asList("Bithumb","Company", "Market");
        //기능 선언
        Function<String, Integer> function = String::length;

        List<Integer> newList = map(list, function);

        assertThat(newList.get(1), is(equalTo(7)));
    }
    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> newList = new ArrayList<>();
        for (T e : list) {
            newList.add(function.apply(e));
        }
        return newList;
    }
}