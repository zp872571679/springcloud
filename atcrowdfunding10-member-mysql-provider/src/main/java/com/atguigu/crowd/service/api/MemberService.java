package com.atguigu.crowd.service.api;

import com.atguigu.crowd.entity.po.MemberPO;

/**
 * @author Administrator
 */
public interface MemberService {
    public MemberPO getMemberPOByLoginAcct(String loginacct);
}
