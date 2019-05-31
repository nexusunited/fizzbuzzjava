package com.nexus.netsoft.FizzBuzz.Business;

import com.nexus.netsoft.FizzBuzz.Business.Dependency.ReplacerPluginInterface;
import com.nexus.netsoft.FizzBuzz.Communication.Plugin.BuzzReplacer;
import com.nexus.netsoft.FizzBuzz.Communication.Plugin.FizzBuzzReplacer;
import com.nexus.netsoft.FizzBuzz.Communication.Plugin.FizzReplacer;

import java.util.ArrayList;

public class FizzBuzzDependencyProvider implements FizzBuzzDependencyProviderInterface {

    @Override
    public ArrayList<ReplacerPluginInterface> getReplacer() {

        ArrayList<ReplacerPluginInterface> replacerList = new ArrayList<>();

        replacerList.add(new FizzReplacer());
        replacerList.add(new BuzzReplacer());
        replacerList.add(new FizzBuzzReplacer());

        return replacerList;
    }
}
