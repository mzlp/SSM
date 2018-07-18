package com.morvanLi.service;


import com.morvanLi.common.MybatisDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * 基础服务
 * @author Administrator
 *
 */
public class BaseService {

	/** 数据库访问Dao **/
	@Autowired
	@Qualifier("myBatisDao")
	protected MybatisDao dao;
	
	/** 日志访问对象 **/
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
}
