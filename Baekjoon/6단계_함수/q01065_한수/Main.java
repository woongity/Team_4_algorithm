package q1065_�Ѽ�;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	// �Ѽ����� �˻��ϴ� �Լ�
	public static int checkNumber(int n) {
		// �� �ڸ��� ������ �ڸ��� ���̰� ���ų� �Ѱ� �̹Ƿ� �׻� ���������̴�.
		if (n < 100) return 1;
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		// �� �ڸ����� ArrayList�� �ִ´�.
		while (n > 0) {
			numbers.add(n % 10);
			n /= 10;
		}
		
		int digit = numbers.size();
		int x = numbers.get(0) - numbers.get(1);
		int i = 1;
		// �ڸ��������� ���̰� �����ϸ� while���� �������� 1�� return�ϰ�, �׷��� ���� ��� 0�� return�Ѵ�.
		while (i < digit - 1) {
			if ((numbers.get(i) - numbers.get(i + 1)) != x) return 0;
			i++;
		}
		
		return 1;
	}

	// Main
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int[] arr = new int[N + 1];
		arr[0] = 1;
		int count = 0;
		
		// 1���� �־��� �� N���� �Ѽ����� �˻��ϸ鼭 ������� count +1�� ���ش�.
		for (int i = 1; i < N + 1; i++) {
			if (checkNumber(i) == 1) count++;
		}
		
		System.out.println(count);
	}

}
