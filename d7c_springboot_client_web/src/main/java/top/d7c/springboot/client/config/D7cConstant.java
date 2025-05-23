package top.d7c.springboot.client.config;

/**
 * @Title: D7cConstant
 * @Package: top.d7c.springboot.client.config
 * @author: 吴佳隆
 * @date: 2019年12月10日 下午6:54:28
 * @Description: d7c 属性文件相关常量
 */
public class D7cConstant {
    /*********************************************** system ********************************************/
    // --- 当前服务器编号，0~1023，top.d7c.plugins.tools.idfactory.idworker.IdWorker 中 workerId 使用
    public static final String SERVER_NO = "SERVER_NO";
    // 本地 ip 地址 
    public static String LOCAL_IP = null;

    /*********************************************** session ********************************************/
    // --- 验证码
    public static final String SESSION_VERIFY_CODE = "SESSION_VERIFY_CODE";
    // --- session 中的用户信息及角色信息
    public static final String SESSION_USER = "SESSION:USER";
    // --- 当前登录用户编号在 PageData 中的 KEY
    public static final String SESSION_USER_ID = "SESSION_USER_ID";
    // --- 全部菜单
    public static final String MENULIST = "MENULIST";

    /*********************************************** web ***********************************************/
    // 超级管理员编号
    public static final Long SUPER_ADMIN_ID = 1L;
    // 系统预定义角色编号
    public static final Long ROLE_ID_1 = 1L; // 系统管理员
    public static final Long ROLE_ID_2 = 2L; // 集团管理员
    public static final Long ROLE_ID_3 = 3L; // 区域管理员
    public static final Long ROLE_ID_4 = 4L; // 分公司管理员
    public static final Long ROLE_ID_5 = 5L; // 部门管理员

}