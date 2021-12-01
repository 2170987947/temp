package org.example.compile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class CommandUtil {

    public static int run(String cmd, String stdoutFile, String stderrFile) throws IOException, InterruptedException {
        // 单例模式
        Process process = Runtime.getRuntime().exec(cmd);

        if (stdoutFile != null) {
            InputStream stdoutFrom = process.getInputStream();
            FileOutputStream stdoutTo = new FileOutputStream(stdoutFile);
            while (true) {
                int c = stdoutFrom.read();
                if (c == -1) {
                    break;
                }
                stdoutTo.write(c);
            }
            stdoutFrom.close();
            stdoutTo.close();
        }

        if (stderrFile != null) {
            InputStream stderrFrom = process.getErrorStream();
            FileOutputStream stderrTo = new FileOutputStream(stderrFile);
            while (true) {
                int c = stderrFrom.read();
                if (c == -1) {
                    break;
                }
                stderrTo.write(c);
            }
            stderrFrom.close();;
            stderrTo.close();
        }
        // 等待进程结束，获取退出码
        int exitCode = process.waitFor();
        return exitCode;
    }

    public static void main(String[] args) {
        try {
            int code = CommandUtil.run("javac", "E:/stdoutFile.txt", "E:/stderrFile.txt");
            System.out.println(code);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
