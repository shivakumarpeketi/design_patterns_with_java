package org.demo.designpattern.creational.abstractfactory;

import org.demo.designpattern.creational.abstractfactory.model.Computer;
import org.demo.designpattern.creational.abstractfactory.model.ComputerType;

public class AbstractFactoryDesignPatternTest {
    public static void main(String[] args) {
        testAbstractFactory();
    }

    private static void testAbstractFactory() {
        Computer pc = ComputerFactory.getComputer(ComputerType.PC, "2 GB", "500 GB", "2.4 GHz");
        Computer server = ComputerFactory.getComputer(ComputerType.SERVER, "100 GB", "1000 TB", "5.2 GHz");
        System.out.println("AbstractFactory PC Config::" + pc);
        System.out.println("AbstractFactory Server Config::" + server);
    }
}
