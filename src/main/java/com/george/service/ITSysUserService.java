package com.george.service;

import com.george.entity.TSysUser;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.exception.Result;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @author : 国良
 * @className : ITSysUserService
 * @package: com.george.service
 * @description : 用户表 服务接口
 * @date :  2021-01-25
 */
public interface ITSysUserService extends IService<TSysUser> {
/**
 * 添加
 *
 * @param tSysUser
 * @return
 */
        Result<String> add(TSysUser tSysUser);

/**
 * 更新
 *
 * @param tSysUser
 * @return
 */
        Result<Boolean> update(TSysUser tSysUser);

/**
 * 删除
 *
 * @param idList
 * @return
 */
        Result<Boolean> delete(List<Long> idList);

/**
 * 查询详情
 *
 * @param id
 * @return
 */
        Result<TSysUser> getById(Long id);

/**
 * 查询列表
 *
 * @param tSysUser
 * @return
 */
        Result<List<TSysUser>>queryList(TSysUser tSysUser);

                                        }