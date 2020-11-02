package com.bili.finance.financemg.model.req;

import lombok.Data;

import java.util.List;

@Data
public class GetUserRangeReq {
    List<Integer> ids;
}
