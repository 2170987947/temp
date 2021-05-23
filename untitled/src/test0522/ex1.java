package test0522;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String a = in.nextLine();
            jiema(a);
        }
    }

    private static void jiema(String a) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) >= 'A' && a.charAt(i) < 'F') {
                stringBuffer.append((char)('Z' - (5 - (a.charAt(i) - 'A')) + 1));
            } else if (a.charAt(i) >= 'F' && a.charAt(i) <= 'Z') {
                stringBuffer.append((char)(a.charAt(i) - 5));
            } else {
                stringBuffer.append((char)a.charAt(i));
            }
        }
        System.out.println(stringBuffer);
    }
}
