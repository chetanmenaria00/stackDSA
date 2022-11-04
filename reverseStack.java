import java.util.*;
public class reverseStack{
    //function for reversing the Stack
    public static void reverse( Stack<Integer> s){
        if(s.isEmpty()){
                return;
            }
        int top = s.pop();
        reverse(s);
        System.out.println(top);
    }
//Upr recursion function m kya hua or kese reversee ho rha h:
/* initialy condition check hui fr top m sabse upr wala element store ho gya or fr wo element remove ho gya. fr function firse call hua frse condition check hui fr, frse top me top ka element store ho gya. ase krte krte recursion ne apna stack create kr diya or last me isEmpty wali condition satisfy ho gyi, fr jab return call hua tab LINE:10 pr control gya or return hote hue stack ke hr level pr upr se niche tak jo values (reverse form of original stack) thi wo sab print hoti gyi or stack reverse form m print ho gya. */

    public static void main(String args [])
    {
        Stack<Integer> s = new Stack<>();
        s.push(2);
        s.push(4);
        s.push(6);
        s.push(8);
        s.push(10);
        s.pop();
        reverse(s);//s is stack which is passed here for accessing the elements of stack.
        //jab tak Stack empty nhi hota tab tak print karayenge elements ko.
        // while(!s.isEmpty()){
        //     System.out.println(s.peek());
        //     s.pop();
        // }
    }
}