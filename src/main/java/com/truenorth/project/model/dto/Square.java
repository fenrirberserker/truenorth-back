package com.truenorth.project.model.dto;

public class Square extends Operation implements Sqrt {
    @Override
    public Object execute(Double number) {
        return Math.sqrt(number);
    }
}
