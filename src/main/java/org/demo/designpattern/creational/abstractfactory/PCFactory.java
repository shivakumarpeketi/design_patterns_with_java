package org.demo.designpattern.creational.abstractfactory;

import org.demo.designpattern.creational.abstractfactory.model.Computer;
import org.demo.designpattern.creational.abstractfactory.model.PC;

public class PCFactory implements ComputerAbstractFactory {

    private String ram;
    private String hdd;
    private String cpu;

    public PCFactory(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }
    @Override
    public Computer createComputer() {
        return new PC(ram,hdd,cpu);
    }

}
