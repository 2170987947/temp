package lession7;


public class IntegerInMemory {

    // 基本数据类型==比较都是比较字面量

    public void test1_1(){// 测试通过
        int i1 = 10;
        int i2 = 10;
        System.out.println(i1 == i2);
    }
    public void test1_2(){// 测试通过
        int i1 = 128;
        int i2 = 128;
        System.out.println(i1 == i2);
    }
    public void test1_3(){// 测试通过
        int i1 = 128;
        char c = (char) 128;
        System.out.println(i1 == c);
    }
    public void test1_4(){// 测试通过
        int i1 = 128;
        double d = 128.0;
        System.out.println(i1 == d);
    }

    // Integer与int比较，都会进行自动拆装箱，实际是Integer中
    // 的value与int进行比较，所以不管大小，只要值相等，这两个
    // 变量就相等。
    public void test2_1(){// 测试通过
        int i1 = 10;
        Integer i2 = 10;
        System.out.println(i1 == i2);
    }
    public void test2_2(){// 测试通过
        int i1 = 128;
        Integer i2 = 128;
        System.out.println(i1 == i2);
    }

    // Integer与Integer比较，如果都是常量赋值的，那么在-128
    // 到127范围内的比较，就是常量池对象的比较，如果在范围外，
    // 就是堆里边对象的比较。
    public void test3_1(){// 测试通过
        Integer i1 = 10;
        Integer i2 = 10;
        System.out.println(i1 == i2);
    }
    public void test3_2(){// 测试不能通过
        Integer i1 = 128;
        Integer i2 = 128;
        System.out.println(i1 == i2);
    }

    // Integer与Integer比较，不管大小，如果有一个是new Integer()的方式
    // 创建的，那肯定就不相等。
    public void test4_1(){
        Integer i1 = 10;
        Integer i2 = new Integer(10);
        System.out.println(i1 == i2);
    }
    public void test4_2(){
        Integer i1 = 128;
        Integer i2 = new Integer(128);
        System.out.println(i1 == i2);
    }
}
