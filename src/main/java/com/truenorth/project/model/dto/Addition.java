package com.truenorth.project.model.dto;

public class Addition extends Operation implements Operate{


    @Override
    public Double execute(Double first, Double second) {
        return first + second;
    }
}
