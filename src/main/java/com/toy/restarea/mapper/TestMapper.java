package com.toy.restarea.mapper;

import com.toy.restarea.dto.TestDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {

    TestDto findById(Long id);

    Long insertTest(String title);
}
