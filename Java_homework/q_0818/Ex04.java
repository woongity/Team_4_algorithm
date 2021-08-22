package q_0818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Ex04 {
	
	// ���� ���� �ܾ �ϱ��ϰ� �ִ� �ܾ��� ��պ��� ���� �ƴ��� ���θ� Ȯ���ϴ� �Լ� isLonger
	public static boolean isLonger(ArrayList al, String s) {
		float avg = 0;
		
		// memory ArrayList�� �ִ� �ܾ���� ������ ���̵��� ���ϰ� ������ ������ ����� ���Ѵ�.
		for (int i = 0; i < al.size(); i++) {
			String word = (String)al.get(i);
			avg += (float)word.length();
		}
		
		avg /= (float)al.size();
		
		// ��պ��� ��ٸ� return 1, ���ų� ª�ٸ� return 0
		if (s.length() > avg) return true;
		else return false;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int W = Integer.parseInt(input[1]);
		// ������ �������� ��� �ܾ� �迭
		String[] words = br.readLine().split(" ");
		// �ϱ��� ���迭 memory
		ArrayList<String> memory = new ArrayList<String>();
		int total = 0;
		
		// �������� ��� �ܾ� W���� �ݺ��Ѵ�.
		for (int i = 0; i < W; i++) {
			
			// 1. �ɸ� �ð�ó��
			// ��� �ܾ ��￡ �̹� �ִٸ� +1��, ���ٸ� +3�ʸ� ���ش�.
			if (memory.contains(words[i])) total += 1;
			else total += 3;
			
			// 2. ��� memory ó��
			// ��� memory�� ���� á�� , ���� ������ �ܾ ��պ��� ��ٸ� �ش� �ܾ �����Ѵ�.
			// ��� memory�� ���� á��, ���� ������ �ܾ ��պ��� ��ٸ� ���� index�� �ܾ �����Ѵ�.
			if (memory.size() == N) {
				int j = 0;
				while (j < memory.size()) {
					if (isLonger(memory, (String)memory.get(j)) == false) {
						memory.remove(j);
						break;
					}
					j++;
				}
			}
			
			// memory ArrayList�� �ش� �ܾ �߰��Ѵ�.
			memory.add(words[i]);
			
			System.out.println("memery: " + memory);
		}
		
		// �ɸ��ð� ���
		System.out.println(total);	
	}

}
