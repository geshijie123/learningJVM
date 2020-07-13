package com.Listtoflip;


//链表翻转
public class ListToFlip {

    public static class Node{
        public Node(Object values){
            this.values=values;
        }
        public Object values;
        public Node next;
    }


    public static void main(String[] args) {

        Node node=new Node("1");
        Node node1=new Node("2");
        Node node2=new Node("3");
        Node node3=new Node("4");

        node.next=node1;
        node1.next=node2;
        node2.next=node3;

        Node reserve = Reserve(node);
        System.out.println(reserve);

    }

    private static Node Reserve(Node node) {

        Node pre = null;
        while(node!=null){
            Node temp =node.next;
            node.next=pre;

            pre=node;
            node=temp;


        }
        return pre;


    }
}
