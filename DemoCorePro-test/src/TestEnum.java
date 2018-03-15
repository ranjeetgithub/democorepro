
public enum TestEnum {

	TEST(false),TEST1(true),TEST2;
	boolean t2;
	TestEnum(){}
	TestEnum(boolean t){
		t2 = t;
	}
	public boolean show (){
		return t2;
	}
}
