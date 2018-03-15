
public class MainTestClass {

	public static void main(String[] args) {
		int i = 100;
		//int j = --i;
		
		System.out.println(--i+(i++)+i);
		System.out.println(i);
		TestEnum ttt = TestEnum.TEST;
		System.out.println(ttt.show());
		System.out.println(TestEnum.TEST1.show());

	}

}
