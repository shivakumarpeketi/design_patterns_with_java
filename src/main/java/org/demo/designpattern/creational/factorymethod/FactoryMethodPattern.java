package org.demo.designpattern.creational.factorymethod;

import org.demo.designpattern.creational.factorymethod.models.Circle;
import org.demo.designpattern.creational.factorymethod.models.Shape;
import org.demo.designpattern.creational.factorymethod.models.Square;

import java.util.Optional;

public class FactoryMethodPattern {
    public static Optional<Shape> getShape(String shapeType) {
        if ("circle".equalsIgnoreCase(shapeType)) {
            return Optional.of(new Circle());
        } else if ("square".equalsIgnoreCase(shapeType)) {
            return Optional.of(new Square());
        } else {
            return Optional.ofNullable(null);
        }
    }
}
