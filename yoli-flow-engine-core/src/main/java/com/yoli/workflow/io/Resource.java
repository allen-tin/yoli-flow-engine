package com.yoli.workflow.io;

import java.io.InputStream;

/**
 *  资源接口
 * */
public interface Resource {


    /**
     * 所有配置文件的inputstream 都是在这获取
     * */
    InputStream getInputStream();

}
