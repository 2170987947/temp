package java0119;


import java.util.Arrays;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/1/19 11:31
 */
// 实现方法 split, 能够指定分割符将字符串拆分成字符串数组(不必支持正则表达式)
public class Split {
    public static void main(String[] args){
        String s1="baxxbcxxb";
        System.out.println("调用 String 类中的 split 方法: " + Arrays.toString(s1.split("xx")));
        System.out.println("    自己写的 mySplit 方法:    " + Arrays.toString(mySplit(s1,"xx")));

    }

    public static String[] mySplit(String s1,String b) {
        String temp = null;
        // 创建临时的字符串数组,长度等于字符串 s1 的长度
        String[] result1 = new String[s1.length()];
        //记录字符串数组中元素的个数
        int count = 0;
        //记录上次分隔结束的位置
        int end = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (i < end) {
                continue;
            }
            if (count == 0) {
                temp = s1.substring(0,i);
            }else {
                temp = s1.substring(end,i);
            }
            if ((i + b.length()) <= s1.length() && b.equals(s1.substring(i,i + b.length()))) {
                result1[count++] = temp;
                end = i + b.length();
            }
        }
        // 该字符串没有被分割
        if (count == 0) {
            result1[0] = s1;
        }
        // 该字符串数组中剩下的最后一个字符串
        // eg: "abcdef"  ===>   "ef"
        if (end < s1.length()) {
            result1[count++] = s1.substring(end,s1.length());
        }
        // 存放最终结果的字符串数组
        // 将 result1 中尾部的空字符串前面的有用字符赋值到新数组中
        String[] result = new String[count];
        for (int i = 0; i < count; i++) {
            result[i] = result1[i];
        }
        return result;
    }
}
