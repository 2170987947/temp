package org.example;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/5/13 10:32
 */

/**
 * apriori关联规则挖掘算法调用类
 */
public class Client {
    public static void main(String[] args){
        String filePath = "D:\\Gitku\\testInput2.txt";
        AprioriTool tool = new AprioriTool(filePath, 2);
        tool.printAttachRule(0.7);
    }
}

