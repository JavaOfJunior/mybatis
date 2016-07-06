package com.henu.organization.dao;

import com.henu.organization.entry.Person;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by junwei on 2016/7/3.
 */
@Repository
public class PersonDao  extends SqlSessionDaoSupport {
    public static final String NAME_SPACE = "com.henu.organization.personMapper";

    public List<Person> find(Person object){
        return getSqlSession().selectList(NAME_SPACE + ".query",object);
    }
}
