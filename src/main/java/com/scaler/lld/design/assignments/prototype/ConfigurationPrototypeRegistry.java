package com.scaler.lld.design.assignments.prototype;

import java.util.HashMap;

public interface ConfigurationPrototypeRegistry {
    HashMap<ConfigurationType, Configuration> registry = new HashMap<>();

    void addPrototype(Configuration user);

    Configuration getPrototype(ConfigurationType type);

    Configuration clone(ConfigurationType type);
}