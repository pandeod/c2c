import java.util.*;
import java.io.*;

class Test {
    public static void swap(Node i, Node j) {
        Node temp = new Node(0);
        temp=i;
        temp.data=456;
        System.out.println("temp : "+temp.data);
    }
    public static void main(String[] args) {
        Node i = new Node(10);
        Node j = new Node(20);
        swap(i, j);
        System.out.println("i = " + i.data + ", j = " + j.data);
    }
}

    class Node{
        int data;
        Node(int data)
        {
            this.data=data;
        }
    }

// Output :
// A:\c2c_classnotes\c2c\reference_demo>java Test
// temp : 456
// i = 456, j = 20