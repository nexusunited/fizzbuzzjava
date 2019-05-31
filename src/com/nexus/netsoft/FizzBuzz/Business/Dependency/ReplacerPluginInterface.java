package com.nexus.netsoft.FizzBuzz.Business.Dependency;

public interface ReplacerPluginInterface {
    boolean isResponsible(int number);
    String replace(int number);
}
