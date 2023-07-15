package arrRot;

import java.util.Arrays;

public class ArrRot {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4};
		int b = 2;
		int[] rotArr = rotArr(a, b);
		for (int num : rotArr) {
		System.out.println(Arrays.toString(rotArr));
	}
}
	public static int[] rotArr (int[] a, int b) {
		int N = a.length;
		int[] rotArr = new int[N];
		b %= N;
		for (int i = 0; i < N; i++) {
			int newIndex = (i + b) % N;
			rotArr[newIndex] = a[i]; 
		}
			return rotArr;}
		}