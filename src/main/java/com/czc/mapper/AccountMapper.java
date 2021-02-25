package com.czc.mapper;

import com.czc.domain.Account;

import java.util.List;

public interface AccountMapper {

    /**
     * 保存
     * @param account 账户
     */
    public void save(Account account);

    /**
     * 查询全部账户
     * @return 账户集合
     */
    public List<Account> findAll();

}
