package za.co.oldtimerza.data;

public class DoublyLinkedList<T>{
    private Node head = null;
    private Node tail = null;

    public DoublyLinkedList(){

    }

    public Node getHead(){
        return this.head;
    }

    public void setHead(Node node){
        if(this.head == null){
            this.head = node;
        }
        else{
            Node temp = this.head;
            this.head = node;
            this.head.setNext(temp);
        }
    }

    public Node getTail(){
        return this.tail;
    }

    public void setTail(Node node){
        if(this.tail == null){
            this.head = node;
        }
        else{
            this.tail.setNext(node);
            this.tail = node;
        }
    }

    public Node get(Node node){
        Node n = this.head;
        while(n.getNext() != null){
            if(n == node){
                return n;
            }
            else{
                n = n.getNext();
            }
        }
        return null;
    }

    public Node getLastNode(){

        if(this.tail == null){
            Node n = this.head;
            while(n.getNext() != null){
                n = n.getNext();
            }
            this.tail = n;
            return this.tail;
        }
        else{
            return this.tail;
        }
    }

    public void add(Node newnode){
        if(this.head == null){
            this.head = newnode;
        }
        else{
            newnode.setPrev(this.getLastNode());
            newnode.setNext(null);
            this.getLastNode().setNext(newnode);
        }
    }

    public void addAtPosition(Node position, Node newnode){
        Node n0 = this.get(position);
        Node n1 = n0.getNext();

        n0.setNext(newnode);
        n1.setPrev(newnode);
        newnode.setPrev(n0);
        newnode.setNext(n1);
    }
}
