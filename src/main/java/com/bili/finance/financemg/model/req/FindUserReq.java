package com.bili.finance.financemg.model.req;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Data
public class FindUserReq {
    @Min(1)
    @Max(2)
    int id;
    String name;
}
