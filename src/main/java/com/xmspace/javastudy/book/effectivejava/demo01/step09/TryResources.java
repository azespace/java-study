package com.xmspace.javastudy.book.effectivejava.demo01.step09;

import java.io.*;

import static org.springframework.util.FileCopyUtils.BUFFER_SIZE;

/**
 * There is plenty of fish in the sea
 *
 * @Author XM  2024/01/12
 * Description:
 **/
public class TryResources {
    // 为了确保无论在读取文件或写入文件时是否发生异常，都能正确地关闭输入流和输出流 所以写了2个try
    static void copy(String src, String dst) throws IOException {
        InputStream in = new FileInputStream(src);
        try {
            OutputStream out = new FileOutputStream(dst);
            try {
                byte[] buf = new byte[BUFFER_SIZE];
                int n;
                while ((n = in.read(buf)) >= 0) {
                    out.write(buf, 0, n);
                }
            } finally {
                out.close();
            }
        }
        finally {
            in.close();
        }
    }
    // 优化后 不管是几个资源的处理都推荐这种方式 try后面增加一个括号 卸载括号里
    static void copy1(String src, String dst) throws IOException {
        try (InputStream in = new FileInputStream(src);OutputStream out = new FileOutputStream(dst)) {
            byte[] buf = new byte[BUFFER_SIZE];
            int n;
            while ((n = in.read(buf)) >= 0)
                out.write(buf, 0, n);
        }
    }
}
