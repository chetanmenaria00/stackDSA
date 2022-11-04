//LIFO(Last In First Out)
//Stack using LinlkList
public class stackLL{
    public static int size = 0;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Stack{
        public static Node head;
        //check empty condition
        public static boolean isEmpty(){
            return head==null;
        }

        //PUSH function
        public static void push(int data){
            Node newNode = new Node(data);
            if (isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
            size++;
        }

        //POP function
        public static int pop(){
            //empty condition
            if(isEmpty()){
                System.out.println("Satck is empty.");
                return -1;//-1 islie return kr he h kyonki return type integer h function ka.
            }

            int top = head.data;//returning the data which we are deleting.
            //POP conditions
            head = head.next;
            return top;
        }

        public static int peek(){//shows top element of the Stack.
             //empty condition
            if(isEmpty()){
                System.out.println("Satck is empty.");
                return -1;//-1 islie return kr he h kyonki return type integer h function ka.
            }
            return head.data;
        }
    }


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