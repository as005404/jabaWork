package com.foxrider;

import java.util.Arrays;

public class Book {
    private static int uniqueId = 0;
    private int id;
    private String name;
    private String[] autors;
    private String publishingHouse;
    private int yearOfpublishing;
    private int numberOfPages;
    private int price;
    private String cover;


    public Book(String name, String publishingHouse, int yearOfpublishing, int numberOfPages,String cover, int price, String... autors) {
        this.id = ++uniqueId;
        this.name = name;
        this.autors = autors.clone();
        this.publishingHouse = publishingHouse;
        this.yearOfpublishing = yearOfpublishing;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.cover = cover;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getAutors() {
        return autors;
    }

    public void setAutors(String[] autors) {
        this.autors = autors;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYearOfpublishing() {
        return yearOfpublishing;
    }

    public void setYearOfpublishing(int yearOfpublishing) {
        this.yearOfpublishing = yearOfpublishing;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", autors: " + Arrays.toString(autors) +
                ", publishingHouse: '" + publishingHouse + '\'' +
                ", yearOfpublishing: " + yearOfpublishing +
                ", numberOfPages: " + numberOfPages +
                ", price: " + price +
                ", cover:'" + cover + '\'' +
                '}';
    }
}
