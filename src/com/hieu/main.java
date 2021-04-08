package com.hieu;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int count = 0;
        double sum = 0;
        Book book1 = new Book("1","BOOK1",2001,1,"HIEU","JAVA","MVC1");
        Book book2 = new Book("2","BOOK2",22,2,"HIEU","JAVA1","MVC2");
        Book book3 = new Book("3","BOOK3",13,3,"HIEU","JAVA2","MVC3");
        Book book4 = new Book("4","BOOK4",24,4,"HIEU","JAVA","MVC4");
        Book book5 = new Book("5","BOOK5",25,5,"HIEU","JAVA3","MVC5");
        Book book6 = new Book("6","BOOK6",26,6,"HIEU","JAVA","MVC6");
        Book book7 = new Book("7","BOOK7",27,7,"HIEU","JAVA","MVC7");
        Book book8 = new Book("8","BOOK8",28,8,"HIEU","JAVA","MVC8");
        Book book9 = new Book("9","BOOK9",209,9,"HIEU","JAVA","MVC9");
        Book book10 = new Book("10","BOOK10",210,10,"HIEU","JAVA","MVC10");
        Book[] books = {book1,book2,book3,book4,book5,book6,book7,book8,book9,book10};
        for (Book book: books) {
            sum += book.getAmount();
        }
        System.out.println("Sum of Boook " + sum);
        for (Book book: books) {
            if (book.getLanguage().equalsIgnoreCase("JAVA")){
                count++;
            }
        }
        System.out.println("JAVA language is " + count);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào cuốn sách có số tiền mà bạn muốn tìm ");
        int input = scanner.nextInt();
        for (int i = 0; i < books.length; i++) {
            if (books[i].getPrice() < input){
                System.out.println(books[i].getName());
            }
        }

    }
}
