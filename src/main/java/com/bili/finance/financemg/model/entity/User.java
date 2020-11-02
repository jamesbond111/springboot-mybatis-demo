package com.bili.finance.financemg.model.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.*;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    //@JSONField 只有在经过JSONObject.toJSONString()后才起作用,返回至客户端的为自定义json格式
    @JSONField(name = "bili_id")
    private int id;         //userId
    @JSONField(name = "bili_name")
    private String name;    //用户名
    @JSONField(name = "bili_age")
    private int age;        //年龄
}
