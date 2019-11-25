package com.btrace;

/* BTrace Script Template */
import com.sun.btrace.annotations.*;
import static com.sun.btrace.BTraceUtils.*;

/**
 * BTrace中运行代码
 */
@BTrace
public class TracingScript {

    @OnMethod(
            clazz="com.btrace.Counter",
            method="add",
            location=@Location(Kind.RETURN)
    )
    public static void traceExecute(int num,@Return int result){
        println("====== ");
        println(strcat("parameter num: ",str(num)));
        println(strcat("return value:",str(result)));
    }
}