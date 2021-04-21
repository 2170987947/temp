package java0120;

import java0121.Animal;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/1/20 9:52
 */
public class Main {
    String str2 = aa();

    public String aa() {
        System.out.println(b);
        System.out.println("就地");
        return "12";
    }
    {
        str2 = new String("何洛洛");
        System.out.println(str2+ "1");
        System.out.println("静态成员变量(初始化在下面): " + c);
//        System.out.println(b);
    }
    static {
        System.out.println("静态代码块1");
    }

    static {
        System.out.println("静态代码块2");

        Main main1 = new Main();
        System.out.println(main1);
        System.out.println(main1.b);
        System.out.println(main1.c);
    }

    static int c = 1;
    int b = 10;
    static {
        System.out.println("静态代码块3");
    }
    public Main() {
        System.out.println("构造");
    }
    public static void main(String[] args) {
//        Cat cat = new Cat("xiomao");
        new Main();
    }
}
//    Animal animal = new Animal();
////        animal.run2();
//        animal.run1();

//

//        new Main();
//        System.out.println("Hello" + str2);
//        System.out.println(str3.concat(str2));
//            StringBuffer str5 = new StringBuffer("Hello");
//        StringBuffer str6 = new StringBuffer("Hello");
//        String str7 = "Helolo";
//        String str8 = "";
//        String str9;
//        String str1 = "Hello";
//        String str4 = "Hello";
//        String str11 = new String("Hello");
//        String str12 = new String("Hello");

//        System.out.println(str1 == str4); // true
//        System.out.println(str11 == str12); // false
//        System.out.println(str1.equals(str4)); // true
//        System.out.println(str11.equals(str12)); // true
//        String str10 = "\tF M M ";
//        char[] chars1 = {'W', 'o', 'r', 'l', 'd'};
//        char[] chars2 = {'W', 'o'};
//        // 1. 求长度
//        System.out.println(str1.length()); // 5
//        // 2. 连接字符串
//        // 方法一:
//        System.out.println(str1.concat(str2)); // HelloWorld
//        // 方法二:
//        System.out.println(str1 + str2); // HelloWorld
//        // 3. 返回指定索引处的 char 值
//        System.out.println(str1.charAt(4)); // o
//        // 4. 把这个字符串和另一个对象比较 (关注 str1 与 str2 位置)
//        // a. 返回值小于 0 , str1 < str2
//        // b. 返回值等于 0 , str1 = str2
//        // c. 返回值大于 0 , str1 > str2
//        System.out.println(str1.compareTo(str2)); // -15
//        // 5. 按字典顺序比较两个字符串，不考虑大小写
//        System.out.println(str1.compareToIgnoreCase(str3)); // 0
//        // 6. 当且仅当字符串与指定的StringBuffer有相同顺序的字符时候返回真
//        // 判断 String 类和 StringBuffer 类的引用所指向的对象是否相同
//        // 不同类型或相同类型的字符串是否相同
//        System.out.println(str1.contentEquals(str4)); // true
//        System.out.println(str1.contentEquals(str5)); // true
//        // 7. 返回指定数组中表示该字符序列的 String, 将字符数组转换成字符串
//        System.out.println(String.copyValueOf(chars1)); // World
//        // 8. 返回指定数组中表示该字符序列的 String, 将字符数组由 offset 下标
//        // 开始的 count 个字符转换成字符串
//        // eg: 将从 chars1 字符数组中下标为 1 的字符开始, 数 2 个字符结束
//        // char[] chars1 = {'W', 'o', 'r', 'l', 'd'}; 这连个字符为 'o', 'r'
//        // 将其转换成字符串类型 "or", 下面输出语句打印出来的结果为 or
//        System.out.println(String.copyValueOf(chars1, 1,2)); // or
//        // 9. 测试此字符串是否以指定的后缀结束。
//        System.out.println(str1.endsWith("lo")); // true
//        // 10. 将此字符串与指定的对象比较, 比较两个String类型的字符串其内容是否相同
//        System.out.println(str1.equals(str4)); // 都是 "Hello", 因此结果为 true
//        System.out.println(str1.equals(str5)); // str5不是 Strig 类型, 即便都是字符串 "Hello", 结果也为 false
//        System.out.println(str5.equals(str6)); // str5, str6 都不是 String 类型, 即便都是字符串 "Hello", 结果也为 false
//        // 11. 将此 String 与另一个 String 比较，不考虑大小写。
//        System.out.println(str1.equalsIgnoreCase(str3)); // true
//        // 12. 返回指定字符在此字符串中第一次出现处的索引。
//        System.out.println(str1.indexOf('o')); // 4
//        // 13. 返回指定子字符串在此字符串中第一次出现处的索引。
//        System.out.println(str1.indexOf("llo")); // 2
//        // 14. 返回在此字符中第一次出现指定字符处的索引，从指定的索引开始搜索(包括索引位置)。
//        //    str7 = "Helolo"
//        System.out.println(str7.indexOf('o',4)); // 5
//        // 15. 返回在此字符中第一次出现指定子字符串处的索引，从指定的索引开始搜索。
//        System.out.println(str7.indexOf("lo",3)); // 4
//        // 16. 返回字符串对象的规范化表示形式。
//        System.out.println(str1.intern());
//        // 17. 返回指定字符在此字符串中最后一次出现处的索引。
//        System.out.println(str7.lastIndexOf('l')); // 4
//        // 18. 返回指定子字符串在此字符串中最后一次出现处的索引。
//        System.out.println(str7.lastIndexOf("lo")); // 4
//        // 19. 返回指定字符在此字符串中最后一次出现处的索引，从指定的索引处开始进行反向搜索。
//        System.out.println(str7.lastIndexOf('l',3)); // 2
//        // 20. 返回指定子字符串在此字符串中最后一次出现处的索引，从指定的索引开始反向搜索。
//        System.out.println(str7.lastIndexOf("lo",3)); // 2
//        System.out.println(str7.lastIndexOf("lo",4)); // 4
//        // 21. 返回一个新的字符串，它是通过用 newChar 替换此字符串中出现的所有 oldChar 得到的。
//        System.out.println(str7.replace("lo","A")); // HeAA
//        // 22. 根据给定正则表达式的匹配拆分此字符串。
//        System.out.println(Arrays.toString(str7.split("l"))); // [He, o, o]
//        // 23. 根据匹配给定的正则表达式来拆分此字符串, 字符串数组元素不超过指定个数
//        System.out.println(Arrays.toString(str7.split("l",2))); // [He, olo]
//        // 24. 判断字符串是否为空。
//        System.out.println(str1.isEmpty()); // false
//        System.out.println(str8.isEmpty()); // true
//        // 25. 判断是否包含指定的字符系列。
//        System.out.println(str1.contains("lo")); // true
//        // 26. 测试此字符串是否以指定的前缀开始。
//        System.out.println(str1.startsWith("he")); // false
//        System.out.println(str1.startsWith("He")); // true
//        // 27. 测试此字符串从指定索引开始的子字符串是否以指定前缀开始。
//        System.out.println(str7.startsWith("lo",3)); // false
//        System.out.println(str7.startsWith("lo",4)); // true
//        // 28. 返回一个新的字符序列，它是此序列的一个子序列, 左闭右开区间
//        System.out.println(str7.substring(0,3)); // Hel
//        // 29. 将此字符串转换为一个新的字符数组
//        System.out.println(str1.toCharArray()); // Hello
//        // 30. 使用默认语言环境的规则将此 String 中的所有字符都转换为小写
//        System.out.println(str1.toLowerCase()); // hello
//        // 31. 使用默认语言环境的规则将此 String 中的所有字符都转换为大写
//        System.out.println(str1.toUpperCase()); // HELLO
//        // 32.  返回此对象本身（它已经是一个字符串！）
//        System.out.println(str1.toString()); // Hello
//        // 33. 返回字符串的副本，忽略前导空白和尾部空白。
//        // 空白符包括: 换行符, 制表符, 空格
//        System.out.println(str10.trim()); // F M M
//    }
//}
