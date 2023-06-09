package com.truenorth.project.model.dto;

public record User(
        Integer id,
        String username,
        String password,
        Boolean status,
        Double credit
) {
}
