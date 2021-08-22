package q4673_�����ѹ�;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// 10001�� array �ʱ�ȭ
		int[] arr = new int[10001];
		arr[0] = 1;
		
		// 10000�� ������ ����� �ʿ䰡 �����Ƿ� ���� ���� ���ؼ��� �����ѹ��� ���ؼ� �ش� index�� 1�� �־��ش�.
		for (int i = 1; i < 10001; i++) {
			if (checkSelfNumber(i) < 10001) arr[checkSelfNumber(i)] = 1;
		}
		
		// 1 ~ 10000���� ���鼭 �����ѹ��� �ѹ��� �ش���� ���� index�� ����Ѵ�.
		for (int i = 0; i < 10001; i++) {
			if (arr[i] == 0) System.out.println(i);				
		}
	}
	
	// �����ѹ� ���ϴ� �Լ�
	public static int checkSelfNumber(int n) {
		int sum = n;
		
		while (n > 0) {
			if (n == 0) break;
			sum += n % 10;
			n /= 10;
		}
		
		return sum;
	}

}
