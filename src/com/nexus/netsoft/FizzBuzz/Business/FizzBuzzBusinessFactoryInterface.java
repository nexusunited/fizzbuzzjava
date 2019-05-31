package com.nexus.netsoft.FizzBuzz.Business;

import com.nexus.netsoft.FizzBuzz.Business.Model.Generator.GeneratorInterface;
import com.nexus.netsoft.FizzBuzz.Business.Model.Handler.ReplaceHandlerInterface;

public interface FizzBuzzBusinessFactoryInterface {
    ReplaceHandlerInterface createReplacer();

    GeneratorInterface createGenerator();
}
