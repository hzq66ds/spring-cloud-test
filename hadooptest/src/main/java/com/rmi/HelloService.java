package com.rmi;

import java.rmi.Remote;

public interface HelloService extends Remote {
    public String hello();
    public String test();
}
