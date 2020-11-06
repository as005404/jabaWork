package com.foxrider;
/** Создать объект класса Текст, используя классы Предложение, Слово.
 * Методы: дополнить текст, вывести на консоль текст, заголовок текста.
 */
public class Main {

    public static void main(String[] args) {
        Text t = new Text();
        t.appendText("hello world.");
        t.appendText("hi world.");

        t.appendText(new Word("bye"));

        t.showText();

        t.showTitle();
    }
}
