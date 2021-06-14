package lession7;

public class StringInMemory {

    // true：都是常量池中的字面量
    public void test1(){// 测试通过
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1 == s2);;
    }

    // true：s3 = "he" + "llo"
    // JVM在编译期间会进行优化：s3为字面量拼接的字符串"hello"，存在常量池
    public void test2(){// 测试通过
        String s1 = "hello";
        String s2 = "hel" + "lo";
        System.out.println(s1 == s2);
    }

    // s2创建了以下对象
    // 1."hello"：存在字符串常量池，如果常量池已有"hello"就不创建
    // 2.new String("hello")：存在堆中
    // s1为常量池的"hello"对象，s2为堆中的对象new String("hello")
    public void test3(){// 测试不能通过
        String s1 = "hello";
        String s2 = new String("hello");
        System.out.println(s1 == s2);
    }

    // 调用intern方法时，如果池已经包含与equals(Object)方法确定的
    // 相当于此String对象的字符串，则返回来自池的字符串。 否则，此
    // String对象将添加到池中，并返回对此String对象的引用。
    // 由此可见，对于任何两个字符串s和t，s.intern() == t.intern()
    // 是true当且仅当s.equals(t)是true。
    public void test4(){// 测试通过
        String s1 = "hello";
        String s2 = new String("hello");
        System.out.println(s1 == s2.intern());
    }

    // s4是用s2和s3两个常量池中的对象相加新生成的对象，存在堆中

    public void test5(){// 测试不能通过
        String s1 = "hello";
        String s2 = "hel";
        String s3 = "lo";
        String s4 = s2 + s3;
        System.out.println(s1 == s4);
    }

    /**
     * 常量池：计算机、软件
     * 堆：new String("计算机软件")
     * "计算机软件"会在常量池中创建字符串对象并返回引用
     */
    public void test6(){//false
        String s = new StringBuilder("计算机").append("软件").toString();
        System.out.println(s == "计算机软件");
    }

    /**
     * 常量池：计算机、软件
     * 堆：new String("计算机软件")
     * 调用s.intern()---> 常量池生成字符串引用，指向堆中的s，并返回该引用
     * 之后的"计算机软件"字符串，都是从常量池中获取，但是指向堆中的s对象
     */
    public void test7(){//true

        //常量池：字符串对象（计算机，软件），堆（字符串对象，字面量是计算机软件）
        String s = new StringBuilder("计算机").append("软件").toString();
        // s.intern()在字符串常量池生成一个引用，指向s，"计算机软件"这个字符串是s
        System.out.println(s.intern() == "计算机软件");
        System.out.println(s.intern() == s);
        System.out.println(s == "计算机软件");
    }
    public void test7_1() {//false
        String s = new StringBuilder("计算机").append("软件").toString();
        // 先执行"计算机软件"，会字符串常量池生成一个字符串对象，之后intern返回是字符串对象的引用
        System.out.println("计算机软件" == s.intern());//true
        System.out.println(s.intern() == s);//false
        System.out.println(s == "计算机软件");//false
    }


    /**
     * 常量池：计算机软件
     * 堆：new String("计算机软件")--->指向常量池的字符串
     * s.intern()--->返回常量池字符串对象的引用
     */
    public void test8(){
        //字符串常量池：计算机软件，堆（字面量为计算机软件）
        String s = new StringBuilder("计算机软件").toString();
        System.out.println(s.intern() == "计算机软件");//true
        System.out.println(s.intern() == s);//false
    }

    /**
     * jvm在初始化时，会默认加载一些资源，这些资源中包含一些字符串，
     * 如"java"，会加载到常量池。
     * s.intern()返回常量池中的字符串对象
     * s为堆中的new String("java")
     */
    public void test111(){
        String s = new StringBuilder("ja").append("va").toString();
        System.out.println(s.intern() == s);

    }
    public void test111_2(){
        String s = new StringBuilder("计算机").append("软件").toString();
        // s.intern()在字符串常量池生成一个引用，指向s，"计算机软件"这个字符串是s
        System.out.println(s.intern() == s);
    }
}
