package com.yoli.workflow.constant;

public class Constant {


    /* 标签：服务 */
    public final static String SERVICE_TAG = "service";

    /* 标签：服务节点 */
    public final static String SERVICE_NODE_TAG = "service-node";

    /* 标签：异步 */
    public final static String ASYC_TAG = "asyc";

    /* 标签：多分支判断 */
    public final static String SWITCH_TAG = "switch";

    /* 标签：多分支判断 */
    public final static String CASE_TAG = "case";

    /* 标签：条件判断 */
    public final static String CONDITION_TAG = "condition";

    /* 标签：事务 */
    public final static String TRANSACTION_TAG = "transaction";

    /* 标签：依赖服务标签 */
    public final static String REF_SERVICE_TAG = "ref-service";

    /* 属性：名称 */
    public final static String NAME_ATT = "name";

    /* 属性：描述 */
    public final static String DESC_ATT = "desc";

    /* 属性：spring bean name */
    public final static String SPRING_BEAN_NAME_ATT = "spring-bean-name";

    /* 属性：class name */
    public final static String CLASS_NAME_ATT = "class-name";

    /* 属性：条件运算 */
    public final static String COND_ATT = "cond";

    /* 属性：CASE_TAG 是否退出 */
    public final static String ISBREAK_ATT = "is-break";

    /* 属性：CASE_TAG 是不是项 */
    public final static String ISDEFAULT_ATT = "is-default";

    /* 属性：CASE_TAG 输入的变量 */
    public final static String VARIABLE_ATT = "variable";

    /* 属性：TRANSACTION_TAG 事务隔离级别 */
    public final static String ISOLATION_ATT = "isolation";

    /* 属性：TRANSACTION_TAG 只读属性 */
    public final static String READONLY_ATT = "readOnly";

    /* 属性：TRANSACTION_TAG 传播属性 */
    public final static String PROPAGATION_ATT = "propagation";

    /* 属性：TRANSACTION_TAG 事务的管理对象名称 */
    public final static String TRANSACTIONMANAGER_ATT = "transactionManager";

    /* 属性：TRANSACTION_TAG 需要回滚的异常 */
    public final static String ROLLBACKFOR_ATT = "rollbackFor";

    /* 属性：TRANSACTION_TAG 不需要回滚的异常 */
    public final static String NOROLLBACKFOR_ATT = "noRollbackFor";

    /* 属性：TRANSACTION_TAG 事务超时时间 */
    public final static String TIMEOUT_ATT = "timeout";

    /* 属性：ASYC_TAG 异常监听标签 */
    public final static String LISTENER_CLASS_NAME_ATT = "listener-class-name";

    /* 属性：ASYC_TAG 异常监听标签 */
    public final static String LISTENER_SPRING_BEAN_NAME_ATT = "listener-spring-bean-name";

    /* 属性：REF_SERVICE_TAG 依赖服务名称 */
    public final static String REF_NAME_ATT = "ref-name";



}
