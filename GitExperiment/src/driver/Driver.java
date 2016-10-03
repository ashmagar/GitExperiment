package driver;

import api.Test;

/**
 * @author Ashish Magar
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Test t = new Test();
		System.out.println(t.myTest(1));
		System.out.println(t.myTest(2));
	}

}
