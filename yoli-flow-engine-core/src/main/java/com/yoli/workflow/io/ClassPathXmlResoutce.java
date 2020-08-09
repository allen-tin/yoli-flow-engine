package com.yoli.workflow.io;

import java.io.InputStream;

/**
 * classpath 下加载资源文件
 * */
public class ClassPathXmlResoutce implements Resource {

    private String path;

    private ClassLoader classLoader;

    public ClassPathXmlResoutce(String path) {
        this(path, null);
    }

    public ClassPathXmlResoutce(String path, ClassLoader classLoader) {
        this.path = path;
        this.classLoader = (classLoader != null ? classLoader : Thread.currentThread().getContextClassLoader());
    }

    @Override
    public InputStream getInputStream() {
        return classLoader.getResourceAsStream(path);
    }
}
