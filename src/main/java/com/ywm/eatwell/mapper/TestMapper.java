package com.ywm.eatwell.mapper;

import com.ywm.eatwell.po.TestUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestMapper {

    List<TestUser> getUserInfo();
}
