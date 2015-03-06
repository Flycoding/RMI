package com.flyingh.demo;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class HelloClient {
    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        IHello hello = (IHello) Naming.lookup("rmi://localhost:9999/hello");
        System.out.println(hello.sayHello("Flyingh"));
    }
}
