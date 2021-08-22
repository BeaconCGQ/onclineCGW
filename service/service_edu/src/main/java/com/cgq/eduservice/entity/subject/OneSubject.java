package com.cgq.eduservice.entity.subject;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

//一级分类
@Data
public class OneSubject {

    private String id;
    private String title;

    //一级分类有多个二级分类
   private List<TwoSubject> children = new ArrayList<>();

}
