package com.george.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import com.exception.Result;
import com.george.entity.TSysUser;
    import org.springframework.web.bind.annotation.RestController;
import com.george.service.ITSysUserService;
import io.swagger.annotations.Api;
import java.util.ArrayList;

/**
 * @author : 国良
 * @className : TSysUserController
 * @package: com.george.controller
 * @description : 用户表 前端控制器
 * @date :  2021-01-25
 */
@RestController
@RequestMapping(value = "/tSysUser")
@Api(tags = "TSysUserController")
public class TSysUserController {
private final ITSysUserService itSysUserService;

public TSysUserController(ITSysUserService itSysUserService){
        this.itSysUserService=itSysUserService;
        }

/**
 * 添加
 *
 * @param tSysUser
 * @return
 */
@PostMapping("/add")
public Result<String> add(@RequestBody TSysUser tSysUser){
        return itSysUserService.add(tSysUser);
        }

/**
 * 更新
 *
 * @param tSysUser
 * @return
 */
@PutMapping(value = "/update")
public Result<Boolean> update(@RequestBody TSysUser tSysUser){
        return itSysUserService.update(tSysUser);
        }

/**
 * 删除
 *
 * @param ids
 * @return
 */
@DeleteMapping(value = "/delete")
public Result<Boolean> delete(@RequestParam(value = "ids") String ids){
        String[]idsArray=ids.split(",");
        List<Long> idList=new ArrayList<>();
        for(String id:idsArray){
        idList.add(Long.valueOf(id));
        }
        return itSysUserService.delete(idList);
        }

/**
 * 查询详情
 *
 * @param id
 * @return
 */
@GetMapping(value = "/getById/{id}")
public Result<TSysUser> getById(@PathVariable(value = "id") Long id){
        return itSysUserService.getById(id);
        }

/**
 * 查询列表
 *
 * @param tSysUser
 * @return
 */
@PostMapping(value = "/queryList")
public Result<List<TSysUser>>queryList(@RequestBody TSysUser tSysUser){
        return itSysUserService.queryList(tSysUser);
        }

                                                }