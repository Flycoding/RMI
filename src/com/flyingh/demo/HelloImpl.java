package com.flyingh.demo;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloImpl extends UnicastRemoteObject implements IHello {
    protected HelloImpl() throws RemoteException {
    }

    @Override
    public String sayHello(String name) {
        return "Hello," + name;
    }
}
