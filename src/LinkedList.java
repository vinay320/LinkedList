// Checking odd and even in string array and appended o and e accordingly and inserting the result in LinkedList..
import java.util.Scanner;
class Node {
    String No;
    Node next;
}
public class LinkedList {
    Node head;
    LinkedList()
    {
        head=null;
    }

        public void insert(String[] arr) {
            for (String data : arr) {


                Node n = new Node();
                n.No = data;
                n.next = null;

                if (head == null) {
                    head = n;
                } else {
                    Node i = head;
                    while (i.next != null) {
                        i = i.next;
                    }
                    i.next = n;
                }
            }
        }
        public void traversed()
        {
            Node n = head;
            while (n!=null)
            {
                System.out.print(n.No+" ");
            n=n.next;
            }

        }

        public static void main(String[] args) {
            LinkedList obj=new LinkedList();
            Scanner s=new Scanner(System.in);
            int ch=s.nextInt();
            String[] arr=new String[ch];
            for (int i = 0; i <ch ; i++) {
                arr[i]=s.next();
            }
            for (int i = 0; i < ch; i++) {
                int l=arr[i].length();
                StringBuilder demo= new StringBuilder();
                for (int j = 0; j <l; j++) {
                    if(arr[i].charAt(j)%2==0)
                    {
                        demo.append("e");
                    }
                    else
                    {
                        demo.append("o");
                    }
                }
                arr[i]=arr[i].concat(demo.toString());
            }
            obj.insert(arr);

                        obj.traversed();
        }
    }

