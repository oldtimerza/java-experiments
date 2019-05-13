package za.co.oldtimerza.data;

public class DoublyLinkedList<T>{
    private NodeInterface head = null;
    private NodeInterface tail = null;

    public DoublyLinkedList(){

    }

    public void setHead(NodeInterface node){
        if(this.head == null){
            this.head = node;
        }
        else{
            NodeInterface temp = this.head;
            this.head = node;
            this.head.setNext(temp);
        }
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

    public NodeInterface getHead()
    {
        return this.head;
    }

    public NodeInterface get(NodeInterface node){
        NodeInterface n = this.head;
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

    public NodeInterface getLastNode(){

        if(this.tail == null){
            NodeInterface n = this.head;
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
        NodeInterface n0 = this.get(position);
        NodeInterface n1 = n0.getNext();

        n0.setNext(newnode);
        n1.setPrev(newnode);
        newnode.setPrev(n0);
        newnode.setNext(n1);
    }
}
