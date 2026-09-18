package com.nerydlg.daily.coding.problems.medium;


public class DeleteMoreThanThree {

    class Node{
        char val;
        Node next;
        int counter;
        public Node(){

        }

        public Node(char val, int counter, Node next) {
            this.val = val;
            this.counter = counter;
            this.next = next;
        }
    }

    class List {

        private Node head;
        private Node prev;
        private Node curr;

        public List(){
            head = new Node();
        }

        public void insert(char val) {
            if(head.next == null){
                head.next = new Node(val, 1, null);
                curr = head.next;
                prev = head;
            } else if (curr.val == val) {
                curr.counter++;
            } else {
                curr.next = new Node(val, 1, null);
                curr = curr.next;
            }
        }

        public void dropAndMerge() {
            Node aux = head.next;
            Node prev = head;
            while(aux != null){

                while(aux.counter >= 3) {
                    // delete current aux node
                    prev.next = aux.next;
                    aux = aux.next;

                    // merge if both next and prev has same letter
                    if(prev.val == aux.val){
                        prev.counter+= aux.counter;
                        // delete current node
                        prev.next = aux.next;
                        aux = prev;
                        // find prev
                        prev = head;
                        while(prev != null && prev.next != aux){
                            prev = prev.next;
                        }
                    }
                }
                aux = aux.next;
            }
        }

        public String toString() {
            Node aux = head.next;
            StringBuilder sb = new StringBuilder();
            while(aux != null) {
                for(int i = 0; i < aux.counter; i++) {
                    sb.append(aux.val);
                }
                aux = aux.next;
            }
            return sb.toString();
        }
    }

    public String DeleteMoreThanThree(String str) {
        int n = str.length();
        List list = new List();

        for(int i = 0; i < n; i++) {
            list.insert(str.charAt(i));
        }
        list.dropAndMerge();
        return list.toString();
    }

}
