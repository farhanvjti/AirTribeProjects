class Test{
    public static void main() {
        //Datatypes and their types in Java along with default values.

        //data types:
        //strict type rule:

        //1. primitive data type: where memory size is fixed/predefined
        //2. non primitive data type: Class, Interface, Arrays, Enum, Annotations.

        //Numeric Type:
        //1. Integral Value:
        //1.a: Integer: byte, short, int, long
        //1.b: Floating-type: float, double

        //2. Character Type: char

        //Boolean Type:
        //boolean: true/false

        //1. byte:
        //size: 1 byte = 8 bits
        //Range: -2^7 to 2^7-1 -128 to 127
        byte b1 = 120;
        byte b2 = 121;
        //CE: byte out of range.
        // byte b2 = 128;
        // byte b3 = b1+b2;

        int b3 = b1+b2; //valid
        // or do type casting
        byte b4 = (byte)(b1+b2);
        System.out.println(b3);

        //signed, unsigned
        byte b5 = -120;
        byte age = 0;

        //2. short:
        //size: 2 bytes = 2x8=16 bits
        //range: -32768 to 32767: -2^15 to 2^15-1
        short sh = 1000;
        short totalBill = 4500;

        //3. int:
        //size: 4 bytes = 4x8=32 bits
        //range: -2147483648 to 2147483647 : -2^31 to 2^31-1
        int i = 10999999;
        int salary = 100000;
        int amount = 7676665;
        System.out.println(salary);

        //4. long:
        //size: 8 bytes = 8x8=64 bits
        //range: -2^63 to 2^63-1
        long t = 676767676;
        long distance = 98765432;
        long dist = 8989877778L;
        System.out.println(dist);

        //CC, SSN, AccountNumber, AAdhar Card, PAN, mobile: String
        long mobile = 9898989878L;
        String mobileNumber = "9898989878";

        //5. float:
        //size: 4 bytes = 4x8=32 bits
        //range: after the dot(.), can take upto 6 to 7 decimal digits
        float f1 = 12.33f;
        System.out.println(f1);
        float sal = 34.55F;

        //6. double:
        //size: 8 bytes = 8x8=64 bits
        //range: after the dot(.), can take upto 15 decimal digits
        double d = 12.333333d;
        double d1 = -23.44444d;
        System.out.println(d1);

        System.out.println(12.33f);//4 bytes
        System.out.println(12.33);//8 bytes

        //BigInteger, BiGDecimal

        //char: single digit value, written within ''
        //size: 2 bytes = 16 bits: unicode values
        //range: a-z A-Z 0-9
        //a-z: 97 to 122
        //A-Z: 65 to 90
        //0-9: 48 to 57
        char ch = 'a';
        char ct = '1';
        char cf = '$';
        char gender = 'f';
        char status = 'Y';

        System.out.println(status);
        System.out.println(ct);

        //boolean:
        //size: ~1 bit
        //range: true/false
        boolean flag = true;
        boolean flag1 = false;

        System.out.println(12);//int: 4 bytes
        System.out.println((byte)12);//1 byte

        System.out.println(12.33);//double : 8 bytes
        System.out.println(12.33f);//float : 4 bytes

        System.out.println((short)100);
        System.out.println(false);

        System.out.println();

    }
}