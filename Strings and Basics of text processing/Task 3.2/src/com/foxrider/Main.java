package com.foxrider;

import com.sun.source.tree.Tree;

import javax.sound.midi.Soundbank;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 Дана строка, содержащая следующий текст (xml-документ):
    <notes>
        <note id = "1">
            <to>Вася</to>
            <from>Света</from>
            <heading>Напоминание</heading>
            <body>Позвони мне завтра!</body>
        </note>
        <note id = "2">
            <to>Петя</to>
            <from>Маша</from>
            <heading>Важное напоминание</heading>
            <body/>
        </note>
    </notes>
    Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип (открывающий
    тег, закрывающий тег, содержимое тега, тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи
    нельзя.
*/
public class Main {

    public static void main(String[] args) {
        String xml= "<notes>" +
                "        <note id = \"1\">" +
                "            <to>Вася</to>" +
                "            <from>Света</from>" +
                "            <heading>Напоминание</heading>" +
                "            <body>Позвони мне завтра!</body>" +
                "        </note>\n" +
                "        <note id = \"2\">" +
                "            <to>Петя</to>" +
                "            <from>Маша</from>" +
                "            <heading>Важное напоминание</heading>" +
                "            <body/>" +
                             "<hell>БАТЯ</hell>"+
                "        </note>" +
                "    </notes>";



        Pattern pOpenTag = Pattern.compile("\\<\\w+\\>");
        Pattern pCloseTag = Pattern.compile("\\<\\/\\w+\\>");
        Pattern pTagWithBody = Pattern.compile("\\<\\w+ .+\\>");
        Pattern pTagWOBody = Pattern.compile("\\<\\w+\\/\\>");


        Pattern Tag = Pattern.compile("\\<.+?\\>");
        Matcher mTag = Tag.matcher(xml);

        while(mTag.find()){
            String tag = mTag.group();
            // Открывающий тэг
            Matcher mOpen = pOpenTag.matcher(tag);
            // Тэг без тела
            Matcher mWObody = pTagWOBody.matcher(tag);
            // Тэг с телом
            Matcher mWithBody = pTagWithBody.matcher(tag);


            if (mOpen.matches()){
                System.out.println("Тег"+ tag + " - открывающий");

                String strOpen = mOpen.group();
                String strClose = "</"+strOpen.substring(1,strOpen.length());

                int begin = mTag.start();
                int end = xml.indexOf(strClose,begin)+strClose.length();


                System.out.println("Тело: " + xml.substring(begin+strOpen.length(),end-strClose.length()));
                System.out.println(xml.substring(end-strClose.length(),end) +" - закрывающий");

                System.out.println();

            }else if (mWObody.matches()){
                System.out.println("Тег"+ tag + "без тела");
                System.out.println();

            }
            else if(mWithBody.matches()){
                Pattern p = Pattern.compile("\\w+\\s*=\\s*(\".+\")");
                Matcher mBodyOfTag = p.matcher(tag);
                String bodyOfTag = "";
                String nameOfBody = "";
                String valueOfBody = "";
                if (mBodyOfTag.find()) {
                    bodyOfTag = mBodyOfTag.group();
                    nameOfBody = bodyOfTag.substring(0,bodyOfTag.indexOf("=")).trim();
                    valueOfBody = bodyOfTag.substring(bodyOfTag.indexOf("=")+1,bodyOfTag.length()).trim();
                }

                System.out.println("Тег"+ tag + " - c именем " + nameOfBody+ " и c содержимым: "+ valueOfBody);


                Pattern pat = Pattern.compile("\\<\\w+ ");
                Matcher matcher = pat.matcher(tag);

                String TagName = "";

                while(matcher.find()){
                    TagName = matcher.group();
                }


                String strClose = "</"+TagName.substring(1,TagName.length()).trim()+">";


                int begin = mTag.start();
                int end = xml.indexOf(strClose,begin)+strClose.length();

                System.out.println("Тело: " + xml.substring(mTag.end(),end-strClose.length()).strip());
                System.out.println(strClose+" - закрывающий");
                System.out.println();
            }


        }

    }

}

