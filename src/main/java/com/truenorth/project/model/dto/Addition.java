package com.truenorth.project.model.dto;

public class Addition extends Operation {


    @Override
    public Object calculate(Float... nums) {
        if(nums[0] !=null && nums[1]!=null){
            return nums[0] + nums[1];
        }
        return 0;
    }
}
