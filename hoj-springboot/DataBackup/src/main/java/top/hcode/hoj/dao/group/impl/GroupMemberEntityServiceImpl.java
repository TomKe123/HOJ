package top.hcode.hoj.dao.group.impl;

import top.hcode.hoj.dao.group.GroupMemberEntityService;
import top.hcode.hoj.mapper.GroupMemberMapper;
import top.hcode.hoj.pojo.entity.group.GroupMember;
import top.hcode.hoj.pojo.vo.GroupMemberVo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: LengYun
 * @Date: 2022/3/11 13:36
 * @Description:
 */
@Service
public class GroupMemberEntityServiceImpl extends ServiceImpl<GroupMemberMapper, GroupMember> implements GroupMemberEntityService {

    @Autowired
    private GroupMemberMapper groupMemberMapper;
    @Override
    public IPage<GroupMemberVo> getMemberList(int limit, int currentPage, String keyword, Integer auth, Long gid) {
        IPage<GroupMemberVo> iPage = new Page<>(currentPage, limit);
        List<GroupMemberVo> memberList = groupMemberMapper.getMemberList(iPage, keyword, auth, gid);

        return iPage.setRecords(memberList);
    }

    @Override
    public IPage<GroupMemberVo> getApplyList(int limit, int currentPage, String keyword, Integer auth, Long gid) {
        IPage<GroupMemberVo> iPage = new Page<>(currentPage, limit);
        List<GroupMemberVo> applyList = groupMemberMapper.getApplyList(iPage, keyword, auth, gid);

        return iPage.setRecords(applyList);
    }
}
