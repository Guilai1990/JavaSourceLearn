package cn.bruce.test.base;

/**
 * @author <a href="mailto:chen.lingqi@xlink.cn">Bruce</a>
 * @date 2020/3/26
 */
public class IntegerEqualsExample1 {

    public static void main(String[] args) {
        Integer i1 = new Integer(1);
        Integer i2 = new Integer(1);
        Integer i3 = new Integer(2);

        if (i1 == i2) {
            System.out.println("equals() method return true");
        } else {
            System.out.println("equals() method return false");
        }

        if (i1.compareTo(i2) == 0) {
            System.out.println("equals() method return true");
        } else {
            System.out.println("equals() method return false");
        }

        if (i1.equals(i2)) {
            System.out.println("equals() method return true");
        }  else {
            System.out.println("equals() method return false");
        }

        if (i1.intValue() == i2.intValue()) {
            System.out.println("equals() method return true");
        } else {
            System.out.println("equals() method return false");
        }

        if (i1.equals(i3)) {
            System.out.println("equals() method return true");
        } else {
            System.out.println("equals() method return false");
        }

        if (i1.intValue() == i3.intValue()) {
            System.out.println("equals() method return true");
        } else {
            System.out.println("equals() method return false");
        }

    }

}
