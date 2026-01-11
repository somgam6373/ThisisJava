package ch06.study.s01;
import java.util.Scanner;

public class ShopMain {
	private static Scanner sc = new Scanner(System.in);
	private static Product[] product = new Product[10];
	private static Customer[] customers = new Customer[10];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1. 상품 등록 2. 고객 등록 3. 상품 구매 4. 현황 조회");
		while(true) {
			System.out.print("선택: ");
			int n = sc.nextInt();
			sc.nextLine();
			
			if(n==1) enroll();
			else if(n==2) login();
			else if(n==3) buy();
			else if(n==4) check();
			else if(n==5) break;
		}
	}
	private static void enroll() {
		
		System.out.print("상품명: ");
		String name = sc.nextLine();
		System.out.print("가격: ");
		int price = sc.nextInt();
		System.out.print("재고: ");
		int stock = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i<product.length;i++) {
			if(product[i]==null) {
				product[i] = new Product(name, price, stock);
				break;
			}
		}
	}
	private static void login() {
		System.out.print("아이디: ");
		String id = sc.nextLine();

		for(int i = 0; i<customers.length;i++) {
			if(customers[i]==null) {
				customers[i] = new Customer(id);
				break;
			}
		}
	}
	private static void buy() {
		System.out.print("고객id: ");
		String id = sc.nextLine();
		System.out.print("상품명: ");
		String name = sc.nextLine();
		
		Customer c = null;
		Product p = null;

		for(int i = 0; i<product.length;i++) {
			if(product[i] != null && name.equals(product[i].getName())) {
				p = product[i];
				break;
			}
		}
		for(int k = 0; k<customers.length;k++) {
			if(customers[k] != null && id.equals(customers[k].getId())) {
				c = customers[k];
				break;
			}
		}
		if(p.getStock()>0) {
			int point = p.getPrice()/10;
			c.setPoint(c.getPoint()+point);
			System.out.println(c.getId()+"의 포인트: " + c.getPoint());
			p.setStock(p.getStock()-1);
		}else
			System.out.println("재고부족");
		

	}
	private static void check() {
		for(int i = 0; i<product.length;i++) {
			if(product[i]!=null) {
				Product p = product[i];
				System.out.println(p.getName() + "   " + p.getPrice() + "   " + p.getStock());
			}
		}
		
		for(int i = 0; i<customers.length;i++) {
			if(customers[i]!=null) {
				Customer c = customers[i];
				System.out.println(c.getPoint());
			}
		}
		
	}

}
