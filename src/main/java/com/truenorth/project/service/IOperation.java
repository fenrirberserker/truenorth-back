package com.truenorth.project.service;

import com.truenorth.project.model.dto.Operation;
import com.truenorth.project.model.dto.User;

public interface IOperation {

    public Object getOperation(User user, Operation operation);
}
