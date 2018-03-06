package com.malicn.server.dao.notice;

import com.malicn.server.domain.notice.Notice;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NoticeDao {


    /**
     * 插入通知
     * @param notice
     * @return
     */
    int insert(Notice notice);

    /**
     * 更新通知
     * @param notice
     * @return
     */
    int update(Notice notice);

    /**
     * 标记为已读
     * @param noticeId
     * @return
     */
    int updateReaded(long noticeId);

    /**
     * 批量标记为已读
     * @param noticeId
     * @return
     */
    int updateReadedBatch(@Param("userId")long userId,
                          @Param("ids") long[] noticeId);

    /**
     * 批量删除通知
     * @param noticeId
     * @return
     */
    int deleteBatch(@Param("userId")long userId,
                    @Param("ids") long[] noticeId);



    /**
     * 查询我的通知列表
     * @param userId 用户ID
     * @return
     */
    List<Notice> selectByUserId(@Param("userId")long userId,
                                @Param("clientType")byte clientType);


    /**
     * 查询通知详情
     * @param noticeId
     * @return 通知详情对象
     */
    Notice getById(long noticeId);

    /**
     * 查询一条未读消息
     * @param userId
     * @return
     */
    Notice getByUnRead(long userId);
}