package cn.edu.jxnu.awesome_campus.database.dao.jxnugo;

import java.util.List;

import cn.edu.jxnu.awesome_campus.database.dao.DAO;
import cn.edu.jxnu.awesome_campus.model.jxnugo.JxnugoUserModel;

/**
 * Created by KevinWu on 16-5-11.
 */
public class JxnugoUserDAO implements DAO<JxnugoUserModel> {
    @Override
    public boolean cacheAll(List<JxnugoUserModel> list) {
        return false;
    }

    @Override
    public boolean clearCache() {
        return false;
    }

    @Override
    public void loadFromCache() {

    }

    @Override
    public void loadFromNet() {

    }
}
