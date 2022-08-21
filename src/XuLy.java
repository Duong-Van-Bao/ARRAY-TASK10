import java.util.Scanner;

public class XuLy {
	final static int MIN = -100;
	final static int MAX = 100;
	
	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = nhapN(scan);
        int a[] = taoMang(n);
        xuatMang(a);
        int dem = demPTThoaDt(a);
        System.out.println("Có " + dem + " phần tử chia hết cho 4 và có số tận cùng bằng 6");
        a = gapDoiPTLe(a);
        xuatMang(a);
	}
	
	public static int[] nhapMang(Scanner scan, int n) {
		int a[] = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.println("a[" + i + "] = ");
			a[i] = Integer.parseInt(scan.nextLine());
		}
		return a;
	}	
	
	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.print("Nhập a > 0 ");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 1);
		return n;
	}

	public static int[] taoMang(int n) {
		int a[] = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = MIN + (int)(Math.random()*((MAX - MIN) + 1)); 
		}
		return a;
	}
	
	public static void xuatMang(int a[]) {
		for (int pt : a) {
			System.out.print(pt + "\t");
		}
		System.out.println("\n");
	}
	
	public static int demPTThoaDt(int a[]) {
		int dem = 0;
		for(int pt: a) {
			if(pt % 4 == 0 && Math.abs(pt) % 10 == 6) {
				dem++;
			}
		}
		return dem;
	}
	
	public static int[] gapDoiPTLe(int a[]) {
		for(int i = 0; i < a.length; i++) {
			if(a[i] % 2 != 0) {
			a[i] = a[i]*2;
			}
		} 
		return a;
	}
}
