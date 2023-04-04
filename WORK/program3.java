/*
1) Написать метод, который принимает массив элементов, 
помещает их в стэк и выводит на консоль содержимое стэка.
2) Написать метод, который принимает массив элементов,
помещает их в очередь и выводит на консоль содержимое очереди.
*/

package WORK;

import java.util.LinkedList;
import java.util.Queue;

public class program3 {
    public static void main(String[] arr) {
        
      
            Queue<String> linkedList = new LinkedList<>();
            for (String s: arr){
                linkedList.add(s);
            }
            System.out.println(linkedList);
            while (!linkedList.isEmpty()){
                System.out.println(linkedList.poll());
            }
        }
    }

