package ComparatorEx;

import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {

       TreeSet ts = new TreeSet(new MyDemo());
       ts.add(1);
       ts.add(5);
       ts.add(3);
       ts.add(6);
       ts.add(2);
       ts.add(4);
       System.out.println(ts);

	}

}
