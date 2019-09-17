package com.example.demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.poi.ss.formula.functions.T;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * Created by hanzhiqiang@lenztechretail.com
 * on 2019/9/17.
 */
public class Test {
    public static Log log = LogFactory.getLog(Test.class);

    public static void main(String[] args) {
        //函数式编程
        test001(1,2, (a,b)->{
            log.debug("处理结果："+(a+b));
        });
        test002(1,2, (a,b)->{
            return a+b;
        });
        test003();
        test004();
    }

    public static Test getTest(Supplier<Test> supplier) {
        return supplier.get();
    }

    //函数式编程001
    public static void test001(Integer a, Integer b, BiConsumer<Integer,Integer> biConsumer){
        log.debug("------test001 start------");
        biConsumer.accept(a,b);
        log.debug("------test001   end------");
    }

    //函数式编程002
    public static void test002(Integer a, Integer b, BiFunction<Integer,Integer,Integer> biFunction){
        log.debug("------test002 start------");
        log.debug(biFunction.apply(a,b));
        log.debug("------test002   end------");
    }

    public static void test003(){
        Test t= Test.getTest(Test::new);
        Optional<Test> optional = Optional.of(t);
        boolean b= optional.equals(optional);
        log.debug(b);
    }

    public static void test004(){
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        filtered.forEach(System.out::println);
    }
}
