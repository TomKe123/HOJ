package top.hcode.hoj.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import top.hcode.hoj.pojo.entity.UserInfo;
import top.hcode.hoj.pojo.vo.ACMContestRankVo;
import top.hcode.hoj.pojo.entity.ContestRecord;
import com.baomidou.mybatisplus.extension.service.IService;
import top.hcode.hoj.pojo.vo.OIContestRankVo;

import java.util.Date;
import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author Himit_ZH
 * @since 2020-10-23
 */
public interface ContestRecordService extends IService<ContestRecord> {

    IPage<ContestRecord> getACInfo(Integer currentPage, Integer limit, Integer status, Long cid, String contestCreatorId);

    IPage<ACMContestRankVo> getContestACMRank(List<ContestRecord> contestRecordList, int currentPage, int limit);

    IPage<OIContestRankVo> getContestOIRank(Long cid, String contestAuthor, Boolean isOpenSealRank, Date sealTime, Date startTime, Date endTime, int currentPage, int limit);

    List<ContestRecord> getOIContestRecord(Long cid, String contestAuthor, Boolean isOpenSealRank, Date sealTime, Date startTime, Date endTime);


    List<UserInfo> getSuperAdminList();

}
