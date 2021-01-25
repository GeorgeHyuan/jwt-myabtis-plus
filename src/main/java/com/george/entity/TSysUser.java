package com.george.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
        import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.serializer.LongJsonDeserializer;
import com.serializer.LongJsonSerializer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * @author : 国良
 * @className : TSysUser
 * @package: com.george.entity
 * @description : 用户表 实例类
 * @date :  2021-01-25
 */
@Getter
@Setter
    @Accessors(chain = true)
@TableName("t_sys_user")
    @ApiModel(value = "TSysUser", description = "用户表")
public class TSysUser implements Serializable{

private static final long serialVersionUID=1L;

    /**
     * 全局唯一编号
     */
    @JsonDeserialize(using = LongJsonDeserializer.class)
    @JsonSerialize(using = LongJsonSerializer.class)
                @TableId(value = "id", type = IdType.ID_WORKER)
        @ApiModelProperty(value = "全局唯一编号")
                private Long id;


    /**
     * 名称
     */
    @TableField("name")
    @ApiModelProperty(value = "名称")
        private String name;


    /**
     * 类型（用作主管标识位)
     */
    @TableField("type")
    @ApiModelProperty(value = "类型（用作主管标识位)")
        private String type;


    /**
     * 唯一标识
     */
    @TableField("url")
    @ApiModelProperty(value = "唯一标识")
        private String url;


    /**
     * 地址
     */
    @TableField("addr")
    @ApiModelProperty(value = "地址")
        private String addr;


    /**
     * 特征
     */
    @TableField("tag")
    @ApiModelProperty(value = "特征")
        private String tag;


    /**
     * 描述
     */
    @TableField("`desc`")
    @ApiModelProperty(value = "描述")
        private String desc;


    /**
     * 备注
     */
    @TableField("remark")
    @ApiModelProperty(value = "备注")
        private String remark;


    /**
     * 状态
     */
    @TableField("status")
    @ApiModelProperty(value = "状态")
        private Integer status;


    /**
     * 创建日期
     */
    @TableField("create_time")
    @ApiModelProperty(value = "创建日期")
        private Date createTime;

    public Date getCreateTime(){
            if(createTime !=null){
            return(Date) createTime.clone();
            }
            return null;
            }

    public void setCreateTime(Date createTime){
            if(createTime !=null){
            this.createTime =(Date) createTime.clone();
            }
            }

    /**
     * 创建人uuid
     */
    @JsonDeserialize(using = LongJsonDeserializer.class)
    @JsonSerialize(using = LongJsonSerializer.class)
    @TableField("create_by")
    @ApiModelProperty(value = "创建人uuid")
        private Long createBy;


    /**
     * 修改日期
     */
    @TableField("update_time")
    @ApiModelProperty(value = "修改日期")
        private Date updateTime;

    public Date getUpdateTime(){
            if(updateTime !=null){
            return(Date) updateTime.clone();
            }
            return null;
            }

    public void setUpdateTime(Date updateTime){
            if(updateTime !=null){
            this.updateTime =(Date) updateTime.clone();
            }
            }

    /**
     * 修改人uuid
     */
    @JsonDeserialize(using = LongJsonDeserializer.class)
    @JsonSerialize(using = LongJsonSerializer.class)
    @TableField("update_by")
    @ApiModelProperty(value = "修改人uuid")
        private Long updateBy;


    /**
     * 所属租户uuid
     */
    @JsonDeserialize(using = LongJsonDeserializer.class)
    @JsonSerialize(using = LongJsonSerializer.class)
    @TableField("owner_id")
    @ApiModelProperty(value = "所属租户uuid")
        private Long ownerId;


    /**
     * 所属职务id
     */
    @JsonDeserialize(using = LongJsonDeserializer.class)
    @JsonSerialize(using = LongJsonSerializer.class)
    @TableField("dept_id")
    @ApiModelProperty(value = "所属职务id")
        private Long deptId;


    /**
     * 密码
     */
    @TableField("password")
    @ApiModelProperty(value = "密码")
        private String password;


    /**
     * 头像
     */
    @TableField("avatar")
    @ApiModelProperty(value = "头像")
        private String avatar;


    /**
     * 昵称
     */
    @TableField("nick_name")
    @ApiModelProperty(value = "昵称")
        private String nickName;


    /**
     * 邮箱
     */
    @TableField("user_mail")
    @ApiModelProperty(value = "邮箱")
        private String userMail;


    /**
     * 传真
     */
    @TableField("user_fax")
    @ApiModelProperty(value = "传真")
        private String userFax;


    /**
     * 电话
     */
    @TableField("user_tel")
    @ApiModelProperty(value = "电话")
        private String userTel;


    /**
     * 角色
     */
    @TableField("role")
    @ApiModelProperty(value = "角色")
        private String role;





        }