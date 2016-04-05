package gggggg;

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("sample_input4.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String[][] array = new String[50][50];

		for (int i = 0; i < T; i++) {
			int count = 0;

			int N = sc.nextInt();
			for (int i1 = 0; i1 < N; i1++) {
				for (int i2 = 0; i2 < N; i2++) {
					array[i1][i2] = sc.next();
				}

			}



			// ////////////////////////////////////
			for (int i1 = 0; i1 < N; i1++) {
				for (int i2 = 0; i2 < N; i2++) {
					// A 체크
					if (array[i1][i2].equals("A")) {
						for (int i3 = i1 - 1; i3 < i1 + 1; i3++) {
							for (int i4 = i2 - 1; i4 < i2 + 1; i4++) {
								if (i3 >= 0 && i4 >= 0 && i3 < N && i4 < N) {
									if (array[i3][i4].equals("H")) {
										array[i3][i4] = "X";
									}
								}
							}
						}
					}

				}
			}

			// /////////////////////////////////////
			for (int i3 = 0; i3 < N; i3++) {
				for (int i4 = 0; i4 < N; i4++) {
					System.out.print(array[i3][i4] + " ");
				}
				System.out.println();
			}
			
			
			////////////////////////////
			
			
			
			
			for (int i1 = 0; i1 < N; i1++) {
				for (int i2 = 0; i2 < N; i2++) {
					if (array[i1][i2] == "H") {
						count++;
					}

				}

			}

		}

	}
}
