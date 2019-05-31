package com.nexus.netsoft.FizzBuzz.Business;

import com.nexus.netsoft.FizzBuzz.Business.Model.Generator.GeneratorInterface;
import com.nexus.netsoft.FizzBuzz.Business.Model.Generator.NumberGenerator;
import com.nexus.netsoft.FizzBuzz.Business.Model.Handler.ReplaceHandler;
import com.nexus.netsoft.FizzBuzz.Business.Model.Handler.ReplaceHandlerInterface;

public class FizzBuzzBusinessFactory implements FizzBuzzBusinessFactoryInterface {
    private FizzBuzzDependencyProviderInterface dependencies = null;

    @Override
    public ReplaceHandlerInterface createReplacer() {
        return new ReplaceHandler(
            this.createGenerator(),
            this.getDependencies().getReplacer()
        );
    }

    @Override
    public GeneratorInterface createGenerator() {
        return new NumberGenerator();
    }

    private FizzBuzzDependencyProviderInterface getDependencies() {
        if (this.dependencies == null) {
            this.dependencies = new FizzBuzzDependencyProvider();
        }

        return this.dependencies;
    }
}
