package com.dm;

import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.AlibabaDamaiMaitixProjectDistributionQuerybypageRequest;
import com.taobao.api.response.AlibabaDamaiMaitixProjectDistributionQuerybypageResponse;


/**
 *
 *
 *
 */
public class DmDemo {
   static String url= "https://gw.api.tbsandbox.com/router/rest";
    static String key= "29132081";
    static String secret= "84ae3ce8f64c928078d136e64da486cf";
    public static void main(String[] args) {
        TaobaoClient client = new DefaultTaobaoClient(url, key, secret);
        AlibabaDamaiMaitixProjectDistributionQuerybypageRequest req = new AlibabaDamaiMaitixProjectDistributionQuerybypageRequest();
        req.setTopHttpMethod("alibaba.damai.maitix.project.distribution.querybypage");


        AlibabaDamaiMaitixProjectDistributionQuerybypageRequest.ProjectPageParam obj1 = new AlibabaDamaiMaitixProjectDistributionQuerybypageRequest.ProjectPageParam();
        obj1.setPageNo(1L);
        obj1.setPageSize(10L);
        req.setParam(obj1);
        AlibabaDamaiMaitixProjectDistributionQuerybypageResponse rsp = null;
        try {
            rsp = client.execute(req);
        } catch (ApiException e) {
            e.printStackTrace();
        }
        System.out.println(rsp.getBody());
    }
}
