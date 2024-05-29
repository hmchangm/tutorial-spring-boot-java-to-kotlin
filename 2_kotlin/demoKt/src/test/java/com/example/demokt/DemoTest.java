package com.example.demokt;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DemoTest {

    @Test
    public void test() {
        List<Integer> list = IntStream.iterate(2, i -> i + 2)
                .boxed().takeWhile(i -> i <= 10)
                .collect(Collectors.toList());
        list.forEach(System.out::println);
    }
}
