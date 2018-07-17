package easy.syh.reflect;

/**
 * Created by syh on 2018/7/17.
 * Desc:
 */

public class HalliLatte {
    public boolean isLatte;
    public String desc;
    public int count;
    private String num;

    public void drink(String name) {
        System.out.println("drink : " + name);
    }

    public void drink() {
        System.out.println("drink : latte");
    }

    @Override
    public String toString() {
        return "HalliLatte{" +
                "isLatte=" + isLatte +
                ", desc='" + desc + '\'' +
                ", count=" + count +
                ", num='" + num + '\'' +
                '}';
    }
}
