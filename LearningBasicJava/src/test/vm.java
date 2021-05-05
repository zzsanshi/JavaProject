package test;

public class vm {
    int a = 1;
    static int b = 2;
    public int sum(int c) {
        return a + b + c;
    }
    public static void main(String[] args) {

            Integer a = 1;
            Integer b = 2;
            Integer c = 3;
            Integer d = 3;
            Integer e = 321;
            Integer f = 321;
            Long g = 3L;
        //System.out.println(g);
            System.out.println(c == d);
            System.out.println(e == f);
            System.out.println(e.equals(f));
       // System.out.println(e.);
            System.out.println(c == (a + b));
            System.out.println(c.equals(a + b));
            System.out.println(g == (a + b));
            System.out.println(g.equals(a + b));
        String str1 = new String("str");
        String str3 = str1;
        String str4 = str1;

        System.out.println(str3);
        System.out.println(str4);
        System.out.println("比较"+ str3 == str4);
        String str11 = new StringBuilder("s").append("s").toString();
        System.out.println(str11.intern() == str11);

        String str2 = new StringBuilder("ja1").append("va").toString();
        System.out.println(str2.intern() == str2);
        }
    }



