package com.foxrider;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
    Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных
    операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине;
    отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по
    алфавиту.
*/
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = "Hello, my name is Anton, terraforming, ambulance. Heh, I know these words.";
        //sc.nextLine();
        System.out.println(numberOfSentences(str));


        end:
        do {
            System.out.println("Введите 1 чтобы отсортировать абзацы по количеству предложений\n" +
                               "Введите 2 чтобы в каждом предложении отсортировать слова по длине\n"+
                               "Введите 3 чтобы отсортировать лексемы в предложении по убыванию количества вхождений\n" +
                               "заданного символа, а в случае равенства – по алфавиту.\n"+
                               "Другое число, чтобы выйти");
            switch (sc.nextInt()){
                case 1:
                    System.out.println(case1(str));
                    break;
                case 2:
                    System.out.println(case2(str));
                    break;
                case 3:
                    System.out.println(case3(str));
                    break;
                default:
                    break end;
            }

        }while(true);
    }




    private static int numberOfSentences(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char tmp = str.charAt(i);
            if(tmp =='.' || tmp =='!' || tmp =='?')count++;// [\\.\\?!] изи заменяется
        }
        return count;
    }

    private static int numberOfEnter(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==ch){
                count++;
            }
        }
        return count;
    }

    static String case1(String str){
        String [] strarr = str.split("\\n{1,2}");
        Arrays.sort(strarr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(numberOfSentences(o1), numberOfSentences(o2));
            }
        });
        str = String.join("\n",strarr);
        return str;
    }

    static String case2(String str){
        Pattern p = Pattern.compile("[A-Z][\\w\\s,-]+");
        Matcher m = p.matcher(str);
        StringBuilder tmp = new StringBuilder(100);
        while(m.find()){
            String[] strArr = m.group().split("[,]?\\s|[\\s-\\s]++");
            Arrays.sort(strArr, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return Integer.compare(o2.length(),o1.length());
                }
            });
            tmp.append(String.join(" ",strArr)).append("\n");
        }
        return  tmp.toString();
    }

    static String case3(String str){
        Pattern pat = Pattern.compile("[A-Z][\\w\\s,-]+");
        Matcher mat = pat.matcher(str);
        StringBuilder tmp2 = new StringBuilder(100);

        while(mat.find()){
            String s3 = deleteDoublesAndSpaces(mat.group());
            Character [] chars = toCharacterArray(s3);

            Arrays.sort(chars, new Comparator<Character>() {
                @Override
                public int compare(Character o1, Character o2) {
                    int countO1 = numberOfEnter(mat.group(),o1);
                    int countO2 = numberOfEnter(mat.group(),o2);
                    if (countO1>countO2)
                        return -1;
                    else if(countO1<countO2)
                        return 1;
                    else
                        return o1-o2;

                }
            });
            String s = characterToString(chars);
            tmp2.append(s).append("\n");
        }
        return tmp2.toString();

    }
    public static Character[] toCharacterArray( String s ) {

        if ( s == null ) {
            return null;
        }

        int len = s.length();
        Character[] array = new Character[len];
        for (int i = 0; i < len ; i++) {
            array[i] = s.charAt(i);
        }

        return array;
    }

    public static String characterToString(Character[]chars){
        StringBuilder sb = new StringBuilder(chars.length);
        for (int i = 0; i < chars.length; i++) {
            sb.append(chars[i]);
        }
        return sb.toString();
    }

    private static String deleteDoublesAndSpaces(String str) {
        StringBuilder sb = new StringBuilder(str);
        int i = 0;
        for (; i < sb.length(); i++) {
            if(sb.charAt(i)==' ') {
                sb.delete(i, i + 1);
                i=0;
            }
            for (int j = i+1; j < sb.length(); j++) {
                if(sb.charAt(i)==sb.charAt(j)) {
                    sb.delete(i, i + 1);
                    i = 0;
                    j= i+1;
                }
            }
        }

        return sb.toString();
    }
}
