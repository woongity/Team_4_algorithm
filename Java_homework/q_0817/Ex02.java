package q_0817;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(",");
		int sum = 0;
		int min = -1;
		
		// 7���� ���� ��� �迭�� ���鼭 ¦���� ��� continue�� ����ġ��,
		// Ȧ���� ��� �ش� ���ڸ� sum�� ���ϰ�, min���� �����Ѵ�.
		for (int i = 0; i < 7; i++) {
			if (Integer.parseInt(input[i]) % 2 == 0) continue;
			
			sum += Integer.parseInt(input[i]);
			
			// ������ Ȧ���� ������ �� �ּҰ� min�� �����ϰ�,
			// �� ���� ���� ������ min ���� �������ش�.
			if (min == -1) min = Integer.parseInt(input[i]);
			else if (Integer.parseInt(input[i]) < min) min = Integer.parseInt(input[i]);
		}
		
		// Ȧ���� �ѹ��� ������ ���ߴٸ�(min�� -1�̶��) �ݺ����� ��� continue�� ������ �����Ƿ� �ƹ� ��ȭ�� ����.
		// ���� �� ��쿡�� sum���� ����� �ʿ䰡 ����.
		if (min != -1) System.out.println(sum);
		System.out.println(min);
	}

}
