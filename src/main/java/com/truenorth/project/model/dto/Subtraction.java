package com.truenorth.project.model.dto;

public class Subtraction extends Operation implements Operate{
    @Override
    public Object execute(Double first, Double second) {
        return first - second;
    }
}
