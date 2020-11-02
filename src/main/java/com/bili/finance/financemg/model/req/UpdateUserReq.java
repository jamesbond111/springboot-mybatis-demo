package com.bili.finance.financemg.model.req;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Data
public class UpdateUserReq {
    int id;
    String name;
    @Min(0)
    @Max(120)
    int age;
}
