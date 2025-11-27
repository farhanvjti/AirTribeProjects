public class Test {

    public static void main(String[] args) {

        String x = "100";

        System.out.println(x+20);//10020

        //String to int:
        int i = Integer.parseInt(x);//100
        System.out.println(i+20);//120

        String y = "200$";
        int j = Integer.parseInt(y.replace("$", ""));//"200"-->200
        System.out.println(j+20);//220


        //String to double:
        String price = "12.33";
        System.out.println(price + 20);//12.3320

        double pr = Double.parseDouble(price); //12.33
        System.out.println(pr + 20);//32.33

        //int to String:
        int finalAmount = 1000;
        String amt = String.valueOf(finalAmount); //"1000"
        System.out.println(amt + 20);//100020


        //double to String:
        double test = 12.33;
        String tr = String.valueOf(test);//"12.33"
        System.out.println(tr+20);//12.3320

        //String to boolean
        String remote = "true";
        //"true" ---> true
        if(Boolean.parseBoolean(remote)) {
            System.out.println("run test cases");
        }
        else {
            System.out.println("ignore test cases");
        }


        //boolean to String:

        boolean flag = false;
        //false --> "false"
        String fg = String.valueOf(flag); //"false"
        System.out.println(fg.length());


        //primitive data type: byte short int long double float boolean char
        //Integer, Double, Float, Byte, Short, Boolean ---> Wrapper classes

        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);

        System.out.println(Byte.SIZE);//1 byte = 8 bits
        System.out.println(Integer.SIZE);//4 bytes = 32 bits



    }

}