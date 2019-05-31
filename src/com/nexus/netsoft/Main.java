package com.nexus.netsoft;

import com.nexus.netsoft.FizzBuzz.Business.FizzBuzzFacade;
import com.nexus.netsoft.FizzBuzz.Business.FizzBuzzFacadeInterface;

public class Main {
    private static FizzBuzzFacadeInterface fizzBuzzFacade = null;

    public static void main(String[] args) {
        getFacade().runFizzBuzz(1, 100).forEach(System.out::println);
    }

    private static FizzBuzzFacadeInterface getFacade() {
        if (fizzBuzzFacade == null) {
            fizzBuzzFacade = new FizzBuzzFacade();
        }

        return fizzBuzzFacade;
    }
}
