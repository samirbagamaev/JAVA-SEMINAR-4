/*
Реализовать стэк с помощью массива
Нужно реализовать методы:
size(), empty(), push(), peek(), pop()
*/

package WORK;

/**
 * program4
 */
public class program4 {

    public static void main(String[] args) {
        myStack myStack = new myStack();
        System.out.println(myStack.empty());
        myStack.push(5);
        myStack.push(6);
        myStack.push(7);
        System.out.println("количество элементов в стеке " + myStack.size);
        System.out.println(myStack.empty());
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }
}
