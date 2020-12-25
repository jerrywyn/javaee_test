package com.example.test_mybatis;

import org.apache.ibatis.annotations.Select;

public interface PersonMapper {
    @Select("SELECT * FROM person WHERE id = #{id}")
    Person selectPerson(int id);
}
