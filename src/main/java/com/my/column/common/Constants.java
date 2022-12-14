/**
 * 严肃声明：
 * 开源版本请务必保留此注释头信息，若删除我方将保留所有法律责任追究！
 * 可正常分享和学习源码，不得用于违法犯罪活动，违者必究！
 * Copyright (c) 2021 十三 all rights reserved.
 * 版权所有，侵权必究！
 */
package com.my.column.common;

import org.springframework.util.ClassUtils;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author 13
 * @qq交流群 719099151
 * @email 2449207463@qq.com
 * @link https://github.com/ZHENFENG13/My-Column
 * @apiNote 常量配置
 */
public class Constants {
//    public static String FILE_UPLOAD_DIC = null;//上传文件的默认url前缀，根据部署设置自行修改
//
//    static {
//
//        try {
//            FILE_UPLOAD_DIC=ResourceUtils.getURL("classpath:static").getPath();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//    }


    public final static String USER_SESSION_KEY = "myColumnUser";//session中user的key

    public final static String VERIFY_CODE_KEY = "userVerifyCode";//验证码key

    public final static int Column_PAGE_LIMIT = 5;//文章列表分页的默认条数(每页5条)

}
