package top.bianchengcs.middleware.db.router;

/**
 * @description: 数据源基础配置
 * @author: EricCml
 * @date: 2022/9/3
 * @github: https://github.com/ericcml
 */
public class DBRouterBase {

    private String tbIdx;

    public String getTbIdx() {
        return DBContextHolder.getTBKey();
    }

}
