package q2775_�γ�ȸ���̵��׾�;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	// �迭�� ���� �� ó������ Ư�� index������ ����� ���� return�ϴ� �Լ�
	public static int getSum(int[] arr, int index) {
		int sum = 0;
		
		for (int i = 0; i < index; i++) {
			sum += arr[i];
		}
		
		return sum;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		// �� testcase�� ������� �����ϴ� �迭
		String[] result = new String[T];
		
		for (int t = 0; t < T; t++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			// ������ ȣ���� �ְ��ο��� �����ϴ� �迭
			int[][] arr = new int[k + 1][n];
			
			// �� ���� �ش� ȣ���� ������ ȣ���� �迭�� ���� ���� �����Ѵ�.
			// getSum() �Լ��� �迭�� ���� �� Ư�� index������ ���� return�Ѵ�.
			for (int i = 0; i < k + 1; i++) {
				for (int j = 0; j < n; j++) {
					// 0�������� �׳� 1����� +1�� �þ��.
					if (i == 0) arr[i][j] = j + 1;
					else arr[i][j] = getSum(arr[i - 1], j + 1);
				}
			}
			
			result[t] = Integer.toString(arr[k][n - 1]);
		}
		
		System.out.println(String.join("\n", result));
	}

}
