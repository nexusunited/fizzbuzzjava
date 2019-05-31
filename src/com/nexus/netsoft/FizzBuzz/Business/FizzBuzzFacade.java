package com.nexus.netsoft.FizzBuzz.Business;

import java.util.List;

public class FizzBuzzFacade implements FizzBuzzFacadeInterface {

    private FizzBuzzBusinessFactoryInterface factory = null;

    @Override
    public List<String> runFizzBuzz() {
        return this.getFactory().createReplacer().getList();
    }

    private FizzBuzzBusinessFactoryInterface getFactory() {
        if (this.factory == null) {
            this.factory = new FizzBuzzBusinessFactory();
        }

        return this.factory;
    }
}
