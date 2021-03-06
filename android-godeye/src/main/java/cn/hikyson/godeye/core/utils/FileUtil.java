package cn.hikyson.godeye.core.utils;

import java.io.File;

/**
 * Created by kysonchao on 2017/11/23.
 */
public class FileUtil {
    public static class FileException extends Exception {
        public FileException(String msg, Throwable e) {
            super(msg, e);
        }

        public FileException(String msg) {
            super(msg);
        }

        public FileException(Throwable e) {
            super(e);
        }
    }

    /**
     * 删除文件
     *
     * @param file
     * @throws FileException
     */
    public static void deleteIfExists(File file) throws FileException {
        if (file.exists() && !file.delete()) {
            throw new FileException("deleteIfExists failed");
        }
    }



}
