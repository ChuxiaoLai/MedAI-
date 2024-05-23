package com.med.medai.constant;

/**
 * 用户常量
*
 */
public interface UserConstant {

    /**
     * 盐值，混淆密码
     */
    String SALT = "medai";

    /**
     * 用户登录态键
     */
    String USER_LOGIN_STATE = "user_login";

    //  region 权限

    /**
     * 默认角色
     */
    String DEFAULT_ROLE = "user";

    /**
     * 管理员角色
     */
    String ADMIN_ROLE = "admin";

    /**
     * 被封号
     */
    String BAN_ROLE = "ban";

    /**
     * 默认头像
     */
//    String DEFAULT_AVATAR = "https://p3-passport.byteimg.com/img/user-avatar/2ea9106b748a0b88d5bfcf517a4dc2ef~180x180.awebp";
    String DEFAULT_AVATAR = "https://th.bing.com/th/id/OIP.m87tTJ5qrlgxa1vvOpnkngAAAA?rs=1&pid=ImgDetMain";
}
