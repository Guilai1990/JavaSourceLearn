package cn.bruce.test.base;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * @author <a href="mailto:chen.lingqi@xlink.cn">Bruce</a>
 * @date 2020/3/26
 */
public class BooleanEqualsExample2 {

    public static void main(String[] args) {
        Boolean b1 = true;
        Boolean b2 = false;

        if (b1.equals(b2)) {
            System.out.println("equals() method return true");
        } else {
            System.out.println("equals() method return false");
        }

        if (b1.booleanValue() == b2.booleanValue()) {
            System.out.println("equals() method return true");
        } else {
            System.out.println("equals() method return false");
        }

        if (b1.compareTo(b2) == 0) {
            System.out.println("equals() method return true");
        } else {
            System.out.println("equals() method return false");
        }
    }

}
