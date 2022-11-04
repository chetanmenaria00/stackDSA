import java.util.*;
public class pushAtBottom{
    //function for pushing fromm bottom
    public static void pushBottom(int data , Stack<Integer> s){
        if(s.isEmpty()){
                s.push(data);
                return;
            }
        int top = s.pop();
        pushBottom(data , s);
        s.push(top);
    }
//Upr recursion function m kya hua or kese reversee ho rha h:
/* initialy condition check hui fr top m sabse upr wala element store ho gya or fr wo element remove ho gya. fr function firse call hua frse condition check hui fr, frse top me top ka element store ho gya. ase krte krte recursion ne apna stack create kr diya or last me isEmpty wali condition jab satisfy ho gyi tab usi recursion call ke stack pr ak or value push krdi jo hume bottom m push krni thi LINE:6 ki help se, fr jab return call hua tab LINE:11 pr control gya or return hote hue stack ke hr level pr upr se niche tak jo values (reverse form of original stack +jo latest push kia wo element) thi wo sab firse ak ke upr ak ki tarah push hoti gyi LINE:11 ki help se or is tarah bottom m nya element chla gya or baki stack as it is frse aagya */

    public static void main(String args [])
    {
        Stack<Integer> s = new Stack<>();
        s.push(2);
        s.push(4);
        s.push(6);
        s.push(8);
        s.push(10);
        s.pop();
        pushBottom(0,s);//s is stack which is passed here for accessing the elements of stack.
        pushBottom(1,s);
        //jab tak Stack empty nhi hota tab tak print karayenge elements ko.
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}