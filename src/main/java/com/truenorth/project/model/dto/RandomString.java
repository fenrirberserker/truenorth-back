package com.truenorth.project.model.dto;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RandomString extends Operation implements Generate{

    @Override
    public String generate() {
        int max =100;
        int min =0;
        int length = (int)(Math.random()*(max-min+1)+min);
        System.out.println("l "+length);
        List<Character> chars = Stream.iterate('a', c -> (char) (c+1)).limit(26).collect(Collectors.toList());
        System.out.println("chars "+chars);
        String s = "";
        for (int i = 0; i < length; i++) {
            int index = (int)(Math.random()*(26));
            char c = chars.get(index);
            System.out.println("random "+index+" c "+c);
            s += c;
        }
        System.out.println("str "+s);
        return s;
    }
}
