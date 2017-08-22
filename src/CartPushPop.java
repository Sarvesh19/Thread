import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CartPushPop {
	private static void getCart() {

	}

	public static void main(String[] args) {
		Cart[] product;
		List<Cart> cartList = new ArrayList<Cart>();

		Cart cart1 = new Cart();
		cart1.setProductName("Nexus 5");
		cart1.setProductPrice(26000);
		Cart cart2 = new Cart();
		cart2.setProductName("Mi 4");
		cart2.setProductPrice(15000);
		Cart cart3 = new Cart();
		cart3.setProductName("Redmi 4A");
		cart3.setProductPrice(5999);
		Cart cart4 = new Cart();
		cart4.setProductName("Nexus 6");
		cart4.setProductPrice(38000);
		Cart cart5 = new Cart();
		cart5.setProductName("Asus Zenfone");
		cart5.setProductPrice(8000);
		Cart cart6 = new Cart();
		cart6.setProductName("Apple 7");
		cart6.setProductPrice(68000);
		Cart cart7 = new Cart();
		cart7.setProductName("LG corby");
		cart7.setProductPrice(4000);
		Cart cart8 = new Cart();
		cart8.setProductName("Coolpad A1");
		cart8.setProductPrice(8500);
		cartList.add(cart1);
		cartList.add(cart2);
		cartList.add(cart3);
		cartList.add(cart4);
		cartList.add(cart5);
		cartList.add(cart6);
		cartList.add(cart7);
		cartList.add(cart8);

		Scanner sc = new Scanner(System.in);
		int count = 0;
		while (cartList.size() > 0) {

			System.out.println(
					"Welcome We have following product for Sale (Kindly enter index which product you want to own it): ");
			System.out.println("NOTE: Index start from ZERO");
			System.out.println(cartList);
			int selected = 0;
			if (selected < cartList.size() && count == 0) {
				selected = sc.nextInt();
				count++;
				System.out.println(cartList.get(selected));
				cartList.remove(selected);
				System.out.println("Product Left from Sale :");
				System.out.println(cartList);
				continue;
			} else {
				System.out.println("Sorry, You have enterd wrong choice");
				continue;
			}

		}
		sc.close();

	}
}
