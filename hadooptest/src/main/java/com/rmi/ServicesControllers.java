package com.rmi;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class ServicesControllers {
    public static void main(String[] args) throws RemoteException, AlreadyBoundException, MalformedURLException {
        HelloService helloService = new HelloServiceImp();
        LocateRegistry.createRegistry(8801);
        Naming.bind("rmi://localhost:8801/helloService",helloService);
    }
}
