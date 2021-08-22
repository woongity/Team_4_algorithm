package q_0818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex03 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] scores = br.readLine().split(" ");
		char[] obstacle1 = br.readLine().toCharArray();
		char[] obstacle2 = br.readLine().toCharArray();
		int total = 0;
		
		// ��ֹ�1, ��ֹ�2 �� ��� �շ������� �ش� index�� ������ total�� ���Ѵ�.
		for (int i = 0; i < N; i++) {
			if (obstacle1[i] == 'O' && obstacle2[i] == 'O') total += Integer.parseInt(scores[i]);
		}
		
		System.out.println(total);
		
	}

}
