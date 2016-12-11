package com.reputation.rk;

public class Factorial { // 22 is the test
	public static void main(String[] args) {
		String s1 = "234";
		int fd = 0;
		int fd1 = 0;
		int fd2 = 1;
		

		for (int df = s1.length() - 1; df >= 0; df--) {
			String firstLetter7 = String.valueOf(s1.charAt(df));
			if (firstLetter7.equals("0"))
				fd1 = 0;
			else if (firstLetter7.equals("1"))
				fd1 = 1;
			else if (firstLetter7.equals("2"))
				fd1 = 2;
			else if (firstLetter7.equals("3"))
				fd1 = 3;
			else if (firstLetter7.equals("4"))
				fd1 = 4;
			else if (firstLetter7.equals("5"))
				fd1 = 5;
			else if (firstLetter7.equals("6"))
				fd1 = 6;
			else if (firstLetter7.equals("7"))
				fd1 = 7;
			else if (firstLetter7.equals("8"))
				fd1 = 8;
			else if (firstLetter7.equals("9"))
				fd1 = 9;
			fd = fd + fd2 * fd1;
			fd2 = fd2 * 10;
		}

		int a = fd-1;
		for (int i = a; i > 1; i--) {
			int qw = 0;
			int qw1 = i;
			String s2 = "";
			while (qw1 > 0) {
				qw = qw1 % 10;
				if (qw == 0)
					s2 = "0" + s2;
				else if (qw == 1)
					s2 = "1" + s2;
				else if (qw == 2)
					s2 = "2" + s2;
				else if (qw == 3)
					s2 = "3" + s2;
				else if (qw == 4)
					s2 = "4" + s2;
				else if (qw == 5)
					s2 = "5" + s2;
				else if (qw == 6)
					s2 = "6" + s2;
				else if (qw == 7)
					s2 = "7" + s2;
				else if (qw == 8)
					s2 = "8" + s2;
				else if (qw == 9)
					s2 = "9" + s2;

				qw1 = qw1 / 10;

			}
			System.out.println(s1);
			System.out.println(s2);

			Exp11 ur = new Exp11();
			s1 = ur.emp11(s1,s2);



		}
		System.out.println(s1);

	}
}
