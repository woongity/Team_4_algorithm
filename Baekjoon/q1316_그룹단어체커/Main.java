package q1316_�׷�ܾ�üĿ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		
		// testcase N����ŭ �ݺ�
		for (int t = 0; t < N; t++) {
			// �Է¹��� �ܾ char�� �и��ؼ� word �迭�� �ִ´�.
			char[] word = br.readLine().toCharArray();
			// �ѹ� ���� alphabet���� �־�ΰ� ���Ŀ� �� ���������� Ȯ���� ArrayList
			ArrayList<Character> charArr = new ArrayList<Character>();
			
			int i = 0;
			while (i < word.length) {
				
				// ���� alphabet�� ArrayList�� �̹� �ִٸ� �׷�ܾ �ƴϹǷ� break
				if (charArr.contains(word[i])) break;		
				// ���� alphabet�� ���� index�� alphabet�� ���Ƹ� i�� +1�� ���ָ鼭 ����ģ��.
				while (true) {
					if (i < word.length - 1 && word[i] == word[i + 1]) {
						i++;
						continue;
					}
					break;
				}
				// ��� ����ģ �Ŀ� �ش� alphabet�� ArrayList�� �����Ѵ�.
				charArr.add(word[i]);
				// ������ ���ĺ��� �����ߴٸ� �׷�ܾ��̹Ƿ� count +1
				if (i == word.length - 1) count++;
				i++;
			}
		}
		
		System.out.println(count);
	}

}
