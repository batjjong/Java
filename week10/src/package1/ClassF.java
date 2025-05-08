package package1;

import week10.ClassD;

public class ClassF {
	public ClassF() {
		ClassD dd = new ClassD();
		dd.field1 = 20;
		//dd.field2 = 20;
		//dd.field3 = 20; private이라 불가
		
		dd.method1();
		//dd.method2();
		//dd.method3(); private이라 불가
	}
}
