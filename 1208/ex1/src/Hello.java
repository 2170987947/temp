public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        short a=128; //1000 0000
//        byte b=(byte)a;
//        System.out.println("a="+a+","+"b="+b);

//        double x=3.0;
//        int y=4;x/=++y;
//        System.out.println(x);
//        int num=1;
//        while (num<=10) {
//            System.out.println(num);
//            num++;
//        }


//        int num = 1;
//        int result = 0;
//        while (num <= 100) {
//            result += num;
//            num++;
//        }
//        System.out.println(result);

        int num = 1;
        int result = 0;
        while (num <= 5) {
            int factor = 1;
            int num1 = 1;
            while (num1 <= num) {
                factor *= num1;
                num1++;
            }
            result +=factor;
            num++;
        }
        System.out.println(result);



    }
}



