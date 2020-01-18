package chap05;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Array {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("�Է�: ");
		String st = in.nextLine();

		StringTokenizer stri = new StringTokenizer(st, " .");

		int num = stri.countTokens();
		String[] arr = new String[num];

		int i = 0;
		while (stri.hasMoreTokens()) {
			arr[i] = stri.nextToken();
			i++;
		}

		System.out.println("�ܾ� ����: " + num);

		Arrays.sort(arr);
		System.out.print("���ĵ� ��ū: ");
		for (int j = 0; j < num; j++) {
			System.out.print(arr[j] + ", ");
		}

		in.close();
	}
}