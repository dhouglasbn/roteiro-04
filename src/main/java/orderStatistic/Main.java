package orderStatistic;

public class Main {

	public static void main(String[] args) {
		Integer [] array = {4,8,6,9,12,1};
		KLargestOrderStatisticsImpl<Integer> klargest = new KLargestOrderStatisticsImpl<Integer>();
		Integer[] result = klargest.getKLargest(array, 3);
		System.out.println("Valores: ");
		for(Integer n: result) {
			System.out.println(n);
		}
	}

}
