package com.truenorth.project.model.dto;

import com.truenorth.project.service.RandomService;


public class RandomString extends Operation {

    RandomService srv;
    @Override
    public Object calculate(Float... nums) {
        return srv.generate();
    }

}
