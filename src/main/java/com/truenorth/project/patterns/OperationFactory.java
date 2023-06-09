package com.truenorth.project.patterns;

import com.truenorth.project.model.dto.*;

public class OperationFactory {

    public static Operation getOperation(String type){

        Operation operation = null;

        switch (type){
            case "addition":
                operation = new Addition();
                break;
            case "substraction":
                operation = new Subtraction();
                break;
            case "multiplication":
                operation = new Multiplication();
                break;
            case "division":
                operation = new Division();
                break;
            case "square_root":
                operation = new Square();
                break;
            case "random_string":
                operation = new RandomString();
                break;

        }

        return operation;
    }
}
