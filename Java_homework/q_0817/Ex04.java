package q_0817;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex04 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		// �Է¹��� ��й�ȣ�� charArray�� �и��Ѵ�.
		char[] PW = input.toCharArray();
		
		// ������ ���ڸ� ���鼭 4�� ���� ���ڷ� ��ȯ���ش�.
		// ascii code ��ȣ������ 4�� ���� ���ڰ� �� 'z'�� �Ѿ�� -26�� �ؼ� �ٽ� 'a'���� �����ϰ� ���ش�.
		for (int i = 0; i < PW.length; i++) {
			if (PW[i] > 'v') PW[i] = (char)((int)PW[i] + 4 - 26);
			else PW[i] = (char)((int)PW[i] + 4);
		}
		
		System.out.println(PW);
	}

}
