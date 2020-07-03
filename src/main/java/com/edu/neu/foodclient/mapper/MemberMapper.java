package com.edu.neu.foodclient.mapper;

import com.edu.neu.foodclient.entity.Member;
import com.edu.neu.foodclient.entity.RedPacket;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MemberMapper {

    @Select("select * from member where clientid=#{clientid}" )
    Member getMember(int clientid);

    @Insert("insert into member values( #{clientid}, #{identityid}, #{realname}, sysdate, #{accumulatescores},0)")
    int memberRegis(Member member);

}