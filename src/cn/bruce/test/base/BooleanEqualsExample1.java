package cn.bruce.test.base;

/**
 * @author <a href="mailto:chen.lingqi@xlink.cn">Bruce</a>
 * @date 2020/3/26
 */
public class BooleanEqualsExample1 {

    public static void main(String[] args) {
        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean(false);
        Boolean b3 = new Boolean(true);

        boolean b4 = true;
        boolean b5 = true;
        boolean b6 = false;

        if (b1.equals(b2)) {
            System.out.println("equals() method return true");
        } else {
            System.out.println("equals() method return false");
        }

        if (b1.equals(b3)) {
            System.out.println("equals() method return true");
        } else {
            System.out.println("equals() method return false");
        }

        if (b1.booleanValue() == b2.booleanValue()) {
            System.out.println("equals() method return true");
        } else {
            System.out.println("equals() method return false");
        }

        if (b4 == b5) {
            System.out.println("equals() method return true");
        } else {
            System.out.println("equals() method return false");
        }

        if (b4 == b6) {
            System.out.println("equals() method return true");
        } else {
            System.out.println("equals() method return false");
        }

    }


}
