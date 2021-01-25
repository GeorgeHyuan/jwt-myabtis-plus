package com.exception;

import lombok.Getter;

/**
 * @author ：alvin
 * @date ：Created in 2019/11/13 19:23
 * @description：系统错误
 * @modified By：alvin
 * @version: 1.0.0
 */
@Getter
public enum SystemErrorType implements ErrorType {

    /**
     * 成功
     */
    SYSTEM_SUCCESS("0", "result.system.success"),
    /**
     * 系统异常
     */
    SYSTEM_ERROR("100001", "result.system.error"),

    /**
     * 系统繁忙，请稍后再试!
     */
    SYSTEM_BUSY("100002", "result.system.busy"),

    /**
     * 服务未找到
     */
    SYSTEM_SERVICE_NOT_FOUND("100003", "result.system.service_not_found"),

    /**
     * 网关异常
     */
    SYSTEM_GATEWAY_ERROR("100004", "result.system.gateway_error"),

    /**
     * 网关超时
     */
    SYSTEM_GATEWAY_TIMEOUT("100005", "result.system.gateway_timeout"),

    /**
     * 请求参数校验不通过
     */
    SYSTEM_ARGUMENT_NOT_VALID("100006", "result.system.argument_not_valid"),

    /**
     * 上传文件大小超过限制
     */
    UPLOAD_FILE_SIZE_LIMIT("100007", "result.system.upload_file_size_limit"),

    /**
     * 唯一键冲突
     */
    DUPLICATE_PRIMARY_KEY("100008", "result.system.duplicate_primary_key"),

    /**
     * token无效
     */
    TOKEN_INVALID("100009", "result.system.token_invalid"),

    /**
     * 非法操作
     */
    ILLEGAL_OPERATION("100010", "result.system.illegal_operation"),

    /**
     * 存在关联节点,请先删除
     */
    ASSOCIATED_NODE_EXISTS("100011", "result.system.associated_node_exists"),

    /**
     * 命令正在执行中
     */
    COMMAND_LOADING("100012", "result.system.command_loading"),
    /**
     * 多次重复操作
     */
    MULTIPLE_REPEAT_OPERATION("100013", "result.system.multiple.repeat.operation"),

    /**
     * 文件名重复
     */
    FILE_NAME_DUPLICATE("100014", "result.system.file_name_duplicate"),

    /**
     * 用户名称重复
     */
    USER_NAME_DUPLICATE("100015", "result.system.user_name_duplicate"),

    /**
     * 同一应用,应用类型不一致
     */
    APP_TYPE_INCONSISTENT("100016", "result.system.app_type_inconsistent"),

    /**
     * 名称重复
     */
    NAME_DUPLICATE("100017", "result.system.name_duplicate"),

    /**
     * 同一项目上行topic重复
     */
    UP_TOPIC_DUPLICATE("100018", "result.system.up_topic_duplicate"),

    /**
     * 同一项目下行topic重复
     */
    DOWN_TOPIC_DUPLICATE("100018", "result.system.down_topic_duplicate"),

    /**
     * 工单执行人步骤不存在
     */
    EXECUTOR_NOT_EXIST("100019", "result.system.executor_not_exist"),
    /**
     * 用户不存在
     */
    USER_NOT_EXIST("100020", "result.system.user_not_exist"),
    /**
     * 主管不存在
     */
    LEADER_NOT_EXIST("100021", "result.system.leader_not_exist"),
    /**
     * 参数缺失
     */
    MISSING_PARAMETERS("100022", "result.system.missing_parameters"),
    /**
     * 数据已存在
     */
    RECORD_DUPLICATE("100023", "result.system.record_duplicate"),
    /**
     * 摄像头注册失败
     */
    REGISTER_CAMERA_ERROR("100024", "result.system.register_camera_error"),
    /**
     * 摄像头删除失败
     */
    DELETE_CAMERA_ERROR("100025", "result.system.delete_camera_error"),
    /**
     * 阿里点位名称已存在
     */
    CAMERA_POINT_ISEXIST_ERROR("100026", "result.system.camera_point_isexist_error"),

    /**
     * 巡检点不存在
     */
    CAMERA_POINT_ISNOTEXIST_ERROR("170011", "result.system.camera_point_isnotexist_error"),

    /**
     * 设备不存在
     */
    CAMERA_POINT_RAWNOTEXIST_ERROR("160008", "result.system.camera_point_rawnotexist_error"),
    /**
     * 任务运行中，无法修改，请稍后再试
     */
    CAMERA_POINT_ISRUNNING_ERROR("170002", "result.system.camera_point_isrunning_error"),

    /**
     * 任务正在运行中，无法启动，请稍后再试
     */
    ALI_TASK_IS_RUNNING_ERROR("100027", "result.system.ali_task_is_running_error"),

    /**
     * 新增错误-名称已存在
     */
    ALI_TASK_PRESENT_NAME_ERROR("100028", "result.system.ali_task_present_name_error"),

    /**
     * 云台转动失败
     */
    PTZ_MOVE_FAIL("100029", "result.system.ptz_move_fail"),

    /**
     * 抓图失败
     */
    PTZ_SNAPSHOT_FAIL("100030", "result.system.ptz_snapshot_fail"),
    /**
     * 调用算法异常
     */
    EPIC_ALGO_FAIL("100031", "result.system.epic_algo_fail"),

    /**
     * 任务正在运行中，请稍后再试
     */
    TASK_IS_RUNNING_ERROR("100032", "result.system.task_is_running_error"),


    /**
     * 任务已删除，无法执行
     */
    TASK_IS_DELETED_ERROR("100033", "result.system.task_is_deleted_error");
    /**
     * 错误类型码
     */
    private String code;

    /**
     * 错误信息
     */
    private String msg;

    SystemErrorType(String code, String msg) {

        this.code = code;
        this.msg = msg;
    }
}
