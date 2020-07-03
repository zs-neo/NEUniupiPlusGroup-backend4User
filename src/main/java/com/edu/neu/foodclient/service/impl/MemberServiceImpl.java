package com.edu.neu.foodclient.service.impl;

import com.edu.neu.foodclient.entity.Client;
import com.edu.neu.foodclient.entity.Member;
import com.edu.neu.foodclient.entity.RedPacket;
import com.edu.neu.foodclient.mapper.ClientMapper;
import com.edu.neu.foodclient.mapper.MemberMapper;
import com.edu.neu.foodclient.mapper.RedPacketMapper;
import com.edu.neu.foodclient.service.MemberService;
import com.edu.neu.foodclient.service.RedPacketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Resource
    private MemberMapper memberMapper;

    @Resource
    private ClientMapper clientMapper;

    @Override
    public Member getMember(int clientid) {
        return memberMapper.getMember(clientid);
    }

    @Override
    public int memberRegis(Member member) {
        Client client = new Client();
        client.setClientid(member.getClientid());
        client.setType(1);
        clientMapper.updateClientInfo(client);
        return memberMapper.memberRegis(member);
    }
}
