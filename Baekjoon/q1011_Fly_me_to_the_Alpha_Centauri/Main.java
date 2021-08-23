package q1011_Fly_me_to_the_Alpha_Centauri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String[] result = new String[T];
		
		// TestCase T��ŭ �ݺ�
		for (int t = 0; t < T; t++) {
			String[] input = br.readLine().split(" ");
			int x = Integer.parseInt(input[0]);
			int y = Integer.parseInt(input[1]);
			// �����ϴ°Ÿ� y - x �� ������ ���� �ø��� �� n
			// �����Ϸ��� 2n - 1��ŭ �̵�Ƚ���� �ʿ��ϴ�.
			double n = Math.ceil(Math.sqrt((double)(y - x)));
			int move = 2 * (int)n - 1;
			
			// ���� ������ ���� ������ ��հ����� ũ�� 2n - 1, ������ 2n - 2��ŭ �ּ� �̵�Ƚ���� �ʿ��ϴ�.
			double avg = (n * n + (n - 1) * (n - 1)) / 2;
			if (avg < y - x) result[t] = Integer.toString(move);
			else result[t] = Integer.toString(move - 1);
		}

		System.out.println(String.join("\n", result));
	}

}
