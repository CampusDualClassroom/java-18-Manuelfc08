package com.campusdual.classroom;

public class Exercise18 {

	public static int[] createAndInitializeArray(int num) {
		int[] Array = new int[num];
		for (int i = 0; i < num; i++) {
			Array[i] = i + 1;
		}
		return Array;
	}

	public static void showInlineArray(int[] Array) {
		for (int i = 0; i < Array.length; i++) {
			if (i != Array.length - 1) {
				System.out.print(Array[i] + " ");
			} else
				System.out.print(Array[i]);
		}
	}

	public static void main(String[] args) {
		createAndInitializeArray(7);
		showInlineArray(createAndInitializeArray(7));

	}
}
