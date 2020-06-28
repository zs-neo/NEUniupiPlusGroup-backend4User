package com.edu.neu.foodcilent.mapper;

import com.edu.neu.foodcilent.entity.FirstType;
import com.edu.neu.foodcilent.entity.SecondType;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface FoodTypeMapper {

    @Select("select * from second_type where ftid=#{ftid}")
    List<SecondType> getSecondTypeByFtid(int ftid);

    @Select("select * from first_type")
    List<FirstType> getFirstType();

    @Select("select * from first_type")
    @Results({
            @Result(id=true,column = "ftid",property = "ftid"),
            @Result(column = "ftid",property = "secondTypeList", javaType = List.class,
                    many = @Many(select = "com.neu.edu.foodshop.mapper.FoodTypeMapper.getSecondTypeByFtid"))

    })
    List<FirstType> getFirstTypeWithSecondType();

}
