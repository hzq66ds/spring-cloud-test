package com.rmi;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class ClientControllers {
    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {

        HelloService helloService  =(HelloService) Naming.lookup("rmi://localhost:8801/helloService");
        System.out.println(helloService.hello());
        System.out.println(helloService.test());
    }
}
