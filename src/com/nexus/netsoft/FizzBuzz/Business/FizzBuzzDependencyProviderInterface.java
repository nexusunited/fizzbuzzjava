package com.nexus.netsoft.FizzBuzz.Business;

import com.nexus.netsoft.FizzBuzz.Business.Dependency.ReplacerPluginInterface;

import java.util.ArrayList;

public interface FizzBuzzDependencyProviderInterface {
    ArrayList<ReplacerPluginInterface> getReplacer();
}
