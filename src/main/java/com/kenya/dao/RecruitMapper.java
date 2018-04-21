package com.kenya.dao;

import com.kenya.bean.Recruit;
import com.kenya.bean.RecruitExample;
import com.kenya.bean.RecruitWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecruitMapper {
    long countByExample(RecruitExample example);

    int deleteByExample(RecruitExample example);

    int deleteByPrimaryKey(Integer recruitid);

    int insert(RecruitWithBLOBs record);

    int insertSelective(RecruitWithBLOBs record);

    List<RecruitWithBLOBs> selectByExampleWithBLOBs(RecruitExample example);

    List<Recruit> selectByExample(RecruitExample example);

    RecruitWithBLOBs selectByPrimaryKey(Integer recruitid);

    int updateByExampleSelective(@Param("record") RecruitWithBLOBs record, @Param("example") RecruitExample example);

    int updateByExampleWithBLOBs(@Param("record") RecruitWithBLOBs record, @Param("example") RecruitExample example);

    int updateByExample(@Param("record") Recruit record, @Param("example") RecruitExample example);

    int updateByPrimaryKeySelective(RecruitWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(RecruitWithBLOBs record);

    int updateByPrimaryKey(Recruit record);
}