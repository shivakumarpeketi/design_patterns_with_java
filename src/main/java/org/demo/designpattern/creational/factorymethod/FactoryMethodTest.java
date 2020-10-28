package org.demo.designpattern.creational.factorymethod;

import org.demo.designpattern.creational.factorymethod.models.Shape;

import java.util.Optional;

public class FactoryMethodTest {
    public static void main(String[] args) {
        Optional<Shape> circle = FactoryMethodPattern.getShape("circle");
        circle.ifPresent((c)->c.draw());

        Optional<Shape> unknown = FactoryMethodPattern.getShape("unknown");
        if(unknown.isPresent()) {
            unknown.get().draw();
        }else{
            System.out.println("Not a valid shape type");
        }
    }
}
