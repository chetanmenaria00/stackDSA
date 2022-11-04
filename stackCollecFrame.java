import java.util.*;
class stackCollecFrame{
    public static void main(String args [])
    {
        Stack<Integer> s1 = new Stack<>();
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