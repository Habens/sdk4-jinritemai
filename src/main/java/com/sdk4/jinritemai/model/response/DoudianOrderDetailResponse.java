package com.sdk4.jinritemai.model.response;

import com.sdk4.jinritemai.DoudianPage;
import com.sdk4.jinritemai.DoudianResponse;
import com.sdk4.jinritemai.model.bean.DoudianOrder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DoudianOrderDetailResponse extends DoudianResponse<DoudianPage<DoudianOrder>> {
}
