package demo;

import org.apache.commons.lang3.StringUtils;

public class hello {
    public static void main(String[] args) {
        System.out.println("hello world");


        demo.newfile1 obj =new demo.newfile1();
        obj.disp();

        String n ="new day";

       String n1= StringUtils.upperCase(n);
        System.out.println(n1);

    }


}
