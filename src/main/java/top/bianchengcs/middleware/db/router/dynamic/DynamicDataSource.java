package top.bianchengcs.middleware.db.router.dynamic;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import top.bianchengcs.middleware.db.router.DBContextHolder;

/**
 * @description: 动态数据源获取，每当切换数据源，都要从这个里面进行获取
 * @author: EricCml
 * @date: 2022/9/2
 * @github: https://github.com/ericcml
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return "db" + DBContextHolder.getDBKey();
    }

}
