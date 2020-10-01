package LearningCode0927.service.impl;

import LearningCode0927.dao.AccountDao;
import LearningCode0927.dao.impl.AccountDaoImpl;
import LearningCode0927.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;


    public AccountServiceImpl(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    @Transactional
    public void transfer(String outMan, String inMan, double money) {

        //开启事务
        accountDao.out(outMan, money);
//        int i=1/0;
        accountDao.in(inMan, money);
        //提交事务
    }

    public AccountDao getAccountDao() {
        return accountDao;
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public AccountServiceImpl() {
    }
}
