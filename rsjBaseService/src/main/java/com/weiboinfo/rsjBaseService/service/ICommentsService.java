package com.weiboinfo.rsjBaseService.service;

import java.util.List;

import com.weiboinfo.rsjBaseService.dto.PageData;
import com.weiboinfo.rsjBaseService.dto.rsjBase.CommentsDto;
import com.weiboinfo.rsjBaseService.entry.Comments;
import com.weiboinfo.rsjBaseService.entry.CommentsExample;

public interface ICommentsService {
	/**
	 * 获取分页数据
	 * @param dto
	 * @return
	 */
	PageData<Comments> getListPage(CommentsDto dto);
	
	/**
	 * 根据主键删除记录
	 * @param uuid
	 * @return
	 */
	int deleteByPrimaryKey(String uuid);
	
	/**
	 * 插入或者更新数据 只返回影响记录数
	 * @param record
	 * @return
	 */
	int saveOrUpdate(Comments record);
	
	/**
	 * 插入或者更新数据 返会更新后的数据
	 * @param record
	 * @return
	 */
	Comments saveOrUpdateWithData(Comments record);
	
	/**
	 * 更新审核状态 如果未设置审核状态，默认为通过审核
	 * @param commentsIds 要更新的数据id
	 * @param record 需要更新的其他数据
	 * @return
	 */
	int updateCheckStatus(String commentsIds,Comments record);
	
	/**
	 * 根据条件查询记录
	 * @param example
	 * @return
	 */
	List<Comments> findByExample(CommentsExample example);
}
