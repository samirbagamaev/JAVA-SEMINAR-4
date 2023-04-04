/*
Реализовать консольное приложение, которое:
Принимает от пользователя и “запоминает” строки.
Если введено print, выводит строки так, чтобы последняя введенная 
была первой в списке, а первая - последней.
Если введено revert, удаляет предыдущую введенную строку из памяти
*/


package WORK;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * program2
 */
public class program2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();

        boolean work = true;
        while (work){
            String line = scanner.nextLine();
            switch (line){
                case "print":
                    ListIterator<String> iterator = list.listIterator(list.size()/2);
                    while (iterator.hasPrevious()){
                        System.out.println(iterator.previous());
                    }
                    break;
                case "revert":
                    list.removeLast();
                    break;
                case "exit":
                    work = false;
                    break;
                default:
                    list.add(line);
            }
        }
    }
    }
