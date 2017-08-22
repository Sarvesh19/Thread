interface IMock1{
	void m1();
	void m2();
	void m3();
}
interface IMock2 extends IMock1{
	void m1();
}
public class InterfaceTest implements IMock2 {
	public static void main(String[] args) {
		System.out.println(CartPushPop.class);
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}


}
