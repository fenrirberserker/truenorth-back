package com.truenorth.project.model.dto;


public class Square extends Operation {

    @Override
    public Object calculate(Float... nums) {
        if(nums[0] !=null){
            return Math.sqrt(nums[0]);
        }
        return 0;
    }
}
