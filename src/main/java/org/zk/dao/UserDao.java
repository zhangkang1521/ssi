package org.zk.dao;

import org.springframework.stereotype.Repository;
import org.zk.model.User;

/**
 * Created by zhangkang on 2017/7/31.
 */
@Repository
public interface UserDao {

    User findById(int id);
}
