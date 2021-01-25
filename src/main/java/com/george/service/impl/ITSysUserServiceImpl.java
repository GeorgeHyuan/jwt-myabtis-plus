package com.george.service.impl;

import com.george.entity.TSysUser;
import com.george.mapper.TSysUserMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.exception.Result;
import com.george.service.ITSysUserService;
import java.util.List;

/**
 * @author : 国良
 * @className : ITSysUserServiceImpl
 * @package: com.george.service.impl
 * @description : 用户表 服务接口实现
 * @date :  2021-01-25
 */
@Service("iTSysUserService")
public class ITSysUserServiceImpl extends ServiceImpl<TSysUserMapper, TSysUser> implements ITSysUserService{
/**
 * 添加
 *
 * @param tSysUser
 * @return
 */
@Override
@Transactional(rollbackFor = Exception.class)
public Result<String> add(TSysUser tSysUser){
        return Result.success(this.save(tSysUser));
        }

/**
 * 更新
 *
 * @param tSysUser
 * @return
 */
@Override
@Transactional(rollbackFor = Exception.class)
public Result<Boolean>  update(TSysUser tSysUser){
        return Result.success(this.updateById(tSysUser));
        }

/**
 * 删除
 *
 * @param idList
 * @return
 */
@Override
@Transactional(rollbackFor = Exception.class)
public Result<Boolean>  delete(List<Long> idList){
        return Result.success(this.removeByIds(idList));
        }

/**
 * 查询详情
 *
 * @param id
 * @return
 */
@Override
public Result<TSysUser> getById(Long id){
        return Result.success(baseMapper.selectById(id));
        }

/**
 * 查询列表
 *
 * @param tSysUser
 * @return
 */
@Override
public Result<List<TSysUser>>queryList(TSysUser tSysUser){
        QueryWrapper<TSysUser> queryWrapper=new QueryWrapper<TSysUser>();
        return Result.success(this.list(queryWrapper));
        }

                                                            }