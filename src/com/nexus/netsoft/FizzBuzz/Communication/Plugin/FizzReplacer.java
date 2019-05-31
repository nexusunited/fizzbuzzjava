package com.nexus.netsoft.FizzBuzz.Communication.Plugin;

import com.nexus.netsoft.FizzBuzz.Business.Dependency.ReplacerPluginInterface;

public class FizzReplacer implements ReplacerPluginInterface {
    @Override
    public boolean isResponsible(int number) {
        return (number % 3) == 0;
    }

    @Override
    public String replace(int number) {
        return "Fizz";
    }
}
