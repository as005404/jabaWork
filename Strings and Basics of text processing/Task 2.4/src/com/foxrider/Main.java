package com.foxrider;
/*
    С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”
*/
public class Main {

    public static void main(String[] args) {
	    StringBuilder sb = new StringBuilder("информатика");
        System.out.println(sb.charAt(7)+sb.substring(3,5)+sb.charAt(7));
    }
}
