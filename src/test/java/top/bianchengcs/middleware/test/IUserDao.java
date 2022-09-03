package top.bianchengcs.middleware.test;

import top.bianchengcs.middleware.db.router.annotation.DBRouter;

/**
 * @description: Dao 接口类
 * @author: EricCml
 * @date: 2022/9/3
 * @github: https://github.com/ericcml
 */
public interface IUserDao {

    @DBRouter(key = "userId")
    void insertUser(String req);

}
