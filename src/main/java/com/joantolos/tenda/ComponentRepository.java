package com.joantolos.tenda;

import java.util.List;

public class ComponentRepository {

    public List<Component> getAll() {
        BasicComponent alu = new BasicComponent("ALU", "Arithmetic Logic Unit", 70, 5);
        BasicComponent controlUnit = new BasicComponent("Control Unit", "Control Unit", 50, 2);
        AssembledComponent cpu = new AssembledComponent("CPU", "Control Process Unit", 130, 1);
        return List.of(
                new BasicComponent("Mouse", "This is a mouse", 50, 55),
                new BasicComponent("Keyboard", "This is a regular USB keyboard", 50, 30),
                new BasicComponent("Display", "This is a big computer display", 150, 20),
                alu,
                controlUnit,
                cpu
        );
    }
}
