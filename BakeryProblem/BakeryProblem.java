import java.util.Arrays;
import java.util.Scanner;

public class BakeryProblem {
	public static String checkDelivery(int[] sizes, int quantity, int ind) {
//		System.out.println(String.format("quantity=%s, ind=%s",quantity,ind));
		int len = sizes.length;
		for (int i = ind; i < len; i++) {
			int siz = sizes[i];
			if (siz < quantity) {
				String ret = checkDelivery(sizes, quantity - siz, i+1);
				if (ret.equals("YES")) {
					return "YES";
				}
			}else if(siz==quantity) {
				return "YES";
			} else {
				return "NO";
			}
		}
		return "NO";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int days = Integer.valueOf(sc.nextLine());
		for (int i = 0; i < days; i++) {
			int noOfPie = sc.nextInt();
			int[] size = new int[noOfPie];
			for (int j = 0; j < noOfPie; j++) {
				size[j] = sc.nextInt();
			}
			Arrays.sort(size);
			sc.nextLine();
			int orderQuantity =Integer.valueOf(sc.nextInt());
			String result=checkDelivery(size, orderQuantity, 0);
			System.out.println(result);
		}
		sc.close();
	}
}

