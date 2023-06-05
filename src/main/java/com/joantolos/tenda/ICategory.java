package com.joantolos.tenda;

import java.util.List;

public interface ICategory {
    List<Component> getComponents();
    String getName();
    String getDescription();
}
