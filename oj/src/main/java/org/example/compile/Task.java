package org.example.compile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class Task {
    // 用于进程通信的所有临时文件
    private String WORK_DIR;
    // 要编译执行的类名
    private final String CLASS = "Solution";
    // 要编译执行的文件名
    private String CODE;
    private String STDOUT;
    private String STDERR;
    private String COMPILE_ERROR;

    public Task() {
        WORK_DIR = "./tmp/" + UUID.randomUUID().toString() + "/";
        CODE = WORK_DIR + CLASS + ".java";
        STDOUT = WORK_DIR + "stdout.txt";
        STDERR = WORK_DIR + "stderr.txt";
        COMPILE_ERROR = WORK_DIR + "compileError.txt";
    }

    public Answer compileAndRun(Question question) throws IOException, InterruptedException {
        Answer answer = new Answer();

        File file = new File(WORK_DIR);
        if (!file.exists()) {
            file.mkdirs();
        }

        FileUtil.writeFile(CODE, question.getCode());

        // javac -encoding utf-8 ./tmp/Soution -d ./tmp/
//        String compileCmd = "javac -encoding utf-8" + CODE + "-d" + WORK_DIR;
        // 类似于 C 中的 sprintf
        String compileCmd = String.format("javac -encoding utf-8 %s -d %s", CODE, WORK_DIR);
        System.out.println("编译命令：" + compileCmd);
        CommandUtil.run(compileCmd, null, COMPILE_ERROR);

        String compileError = FileUtil.readFile(COMPILE_ERROR);
        if (compileError.equals("")) {
            answer.setErrno(0);
        } else {
            answer.setErrno(1);
            answer.setReason(compileError);
            return answer;
        }
        String runCmd = String.format("java -classpath %s %s", WORK_DIR, CLASS);
        System.out.println("执行命令：" + runCmd);
        CommandUtil.run(runCmd, STDOUT, STDERR);
        String runError = FileUtil.readFile(STDERR);
        if (runError.equals("")) {
            answer.setErrno(0);
        } else {
            answer.setErrno(2);
            answer.setReason(runError);
            return answer;
        }
        String runSTDOUT = FileUtil.readFile(STDOUT);
        answer.setStdout(runSTDOUT);
        return answer;
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        Task task = new Task();
        Question question = new Question();
        question.setCode("public class Solution {\n" +
                "    public static void main(String[] args) {\n" +
                "        String s = null;\n" +
                "        System.out.println(s.length());\n" +
                "    }\n" +
                "}");
        Answer answer = task.compileAndRun(question);
        System.out.println(answer);
    }
}
