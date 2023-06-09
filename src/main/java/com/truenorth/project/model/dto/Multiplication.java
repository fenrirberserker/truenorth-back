package com.truenorth.project.model.dto;

public class Multiplication extends Operation implements Operate{
    @Override
    public Number execute(Double first, Double second) {
        return first*second;
    }
}
