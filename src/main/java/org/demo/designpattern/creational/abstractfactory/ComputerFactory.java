package org.demo.designpattern.creational.abstractfactory;

import org.demo.designpattern.creational.abstractfactory.model.Computer;
import org.demo.designpattern.creational.abstractfactory.model.ComputerType;

public class ComputerFactory {

    public static Computer getComputer(ComputerType computerType, String ram, String hdd, String cpu) {
        ComputerAbstractFactory factory = null;
        switch (computerType) {
            case PC:
                factory = new PCFactory(ram, hdd, cpu);
                break;
            case SERVER:
                factory = new ServerFactory(ram, hdd, cpu);
        }
        return factory.createComputer();
    }
}
