package com.nexus.netsoft.FizzBuzz.Business.Model.Generator;

import java.util.ArrayList;
import java.util.List;

public class NumberGenerator implements GeneratorInterface {
    @Override
    public List<Integer> getList(int start, int end) {
        List<Integer> list = new ArrayList<>();

        for (int i = start; i <= end; i++) {
            list.add(i);
        }

        return list;
    }
}
