//stack using ArrayList
import java.util.*;
public class stackArrList{
    static class stack{
        static ArrayList<Integer> stack = new ArrayList<>();

        //check stack it is empty or not
        public static boolean isEmpty(){
            return stack.size() == 0;
        }

        //PUSH function
        public static void push(int data){
            stack.add(data);
        }

        //POP function
        public static int pop(){
            //get last element of stack or we can say arraylist
            int top = stack.get(stack.size()-1); //stack.size()-1 => size - 1 will give index value

            //empty condition
           if (isEmpty())
           {
            return -1;
           }

            //POP conditions
           stack.remove(stack.size()-1);
           return top;
        }

        public static int peek(){//shows top element of the Stack.
            //empty condition
            if (isEmpty())
           {
            return -1;
           }

           //peek condition
            return stack.remove(stack.size()-1); //this statement will return the value which will be given by stack.remove(stack.size()-1).
        }
    }

//main function
    public static void main(String args [])
    {
        Stack s1 = new Stack();
        s1.push(2);
        s1.push(4);
        s1.push(6);
        s1.push(8);
        s1.push(10);
        s1.pop();
        //jab tak Stack empty nhi hota tab tak print karayenge elements ko.
        while(!s1.isEmpty()){
            System.out.println(s1.peek());
            s1.pop();
        }
    }
}