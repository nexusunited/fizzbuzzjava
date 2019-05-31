package com.nexus.netsoft.FizzBuzz.Business.Model.Handler;

import com.nexus.netsoft.FizzBuzz.Business.Dependency.ReplacerPluginInterface;
import com.nexus.netsoft.FizzBuzz.Business.Model.Generator.GeneratorInterface;

import java.util.ArrayList;
import java.util.List;

public class ReplaceHandler implements ReplaceHandlerInterface {
    private GeneratorInterface generator;
    private List<ReplacerPluginInterface> replacer;

    public ReplaceHandler(GeneratorInterface generator, List<ReplacerPluginInterface> replacer) {
        this.generator = generator;
        this.replacer = replacer;
    }

    @Override
    public List<String> getList() {

        List<String> result = new ArrayList<>();

        for (int number : this.generator.getList(1, 100)) {
            String newValue = String.valueOf(number);

            for (ReplacerPluginInterface replacer : this.replacer) {
                if (replacer.isResponsible(number)) {
                    newValue = replacer.replace(number);
                }
            }

            result.add(newValue);
        }

        return result;
    }
}
