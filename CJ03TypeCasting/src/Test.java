public class Test {

    public static void main(String[] args) {

        //-128 to 127
        byte b1 = 10;
        byte b2 = 20;

        int b3 = b1 + b2;//30
        System.out.println(b3);

        //-32768 to 32767
        short s1 = 1000;
        short s2 = 2000;

        int s3 = s1 + s2;
        System.out.println(s3);


        byte t = 10;
        short s = t;
        System.out.println(s);

        int i = t;

        int p = 250;
        byte m = (byte) p;  //250-->250-256=-6
        System.out.println(m);   //-128 to 127: 256
//--------------------------------------------------------

        short k = 1000;
        byte n = (byte)k;//1000%256=234-256=-24
        System.out.println(n);

        short h = 25;
        int j = h;
        System.out.println(j);
/*
        int a = 128;
        byte d = (byte)a;//128->128-256=-128
        System.out.println(d);

        int total = -200;
        byte bill = (byte)total;//-200-->-200+256=56
        System.out.println(bill);

        System.out.println("------------");

        //-128 to 127
        byte price = 100;
        short p1 = price;
        int p2 = price;
        long p3 = price;
        float p4 = price;
        double p5 = price;

        System.out.println(price);//100
        System.out.println(p1);//100
        System.out.println(p2);//100
        System.out.println(p3);//100
        System.out.println(p4);//100.0
        System.out.println(p5);//100.0

        System.out.println("------------");

        double bmi = 200.33;
        float bmf = (float)bmi;
        System.out.println(bmf);//200.33

        long bml = (long)bmi;
        System.out.println(bml);//200

        int bmI = (int)bmi;
        System.out.println(bmI);//200

        short bms = (short)bmi;
        System.out.println(bms);//200

        byte bmb = (byte)bmi;//200.33 --> 200--> 200-256
        System.out.println(bmb);//-56

        System.out.println("------------");

        long num = 1200;
        float nf = num;
        System.out.println(nf);//1200.0

        int ni = (int)nf;//1200.0-->1200
        System.out.println(ni);//1200

        short ns = (short)nf;//1200.0-->1200
        System.out.println(ns);//1200

        //-128 to 127
        byte nb = (byte)nf;//1200.0-->1200
        System.out.println(nb);//-80

        System.out.println("------------");

        char ch = 'a';
        byte cb = (byte)ch;//97
        System.out.println(cb);

        short cs = (short)ch;//97
        System.out.println(cs);

        int ci = ch;
        System.out.println(ci);

        long cl = ch;
        System.out.println(cl);

        float cf = ch;
        System.out.println(cf);

        double cd = ch;
        System.out.println(cd);

        char th = 'A';
        byte tb = (byte)th;//65
        System.out.println(tb);

        //
        long test = 98;
        char ce = (char)test;//98-->b
        System.out.println(ce);//b

        //
        float pr = 99.3f;
        char cp = (char)pr;//99.3-->99
        System.out.println(cp);

        //0-7 for each digit
        byte number = 065;//octal number: base of 8
        System.out.println(number);//53

        //065 = (0 × 8²) + (6 × 8¹) + (5 × 8⁰) = 0+48+5=53

        long nm = 06776547;//octal number: base of 8
        System.out.println(nm);
        //06776547 = (0 × 8⁷) + (6 × 8⁶) + (7 × 8⁵) + (7 × 8⁴) + (6 × 8³) + (5 × 8²) + (4 × 8¹) + (7 × 8⁰) = 1834343

        long nu = -065;
        System.out.println(nu);//-53


        System.out.println((byte)10);

        long l = 9223372036854775807L;
        System.out.println(l);

        float f = l;
        System.out.println(f);

        System.out.println(Character.MIN_VALUE);
        System.out.println(Character.MAX_VALUE);
*/
    }

}
