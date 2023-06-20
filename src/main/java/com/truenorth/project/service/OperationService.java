package com.truenorth.project.service;

import com.truenorth.project.model.dto.Operation;
import com.truenorth.project.model.dto.User;
import com.truenorth.project.patterns.OperationFactory;
import org.springframework.stereotype.Service;

@Service
public class OperationService implements IOperation{

    @Override
    public Object getOperation(User user, Operation operation) {
        //do some validations
        if(user.credit()-operation.getCost()>0){
            //do op
            Operation op = OperationFactory.getOperation(operation.getType());

        }
        return null;
    }
}
