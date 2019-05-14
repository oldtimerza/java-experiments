package za.co.oldtimerza.data;

public class DoublyLinkedList{
    private LinkableContainer head = null;
    private LinkableContainer tail = null;

    public DoublyLinkedList(){

    }

    public void setHead(LinkableContainer node){
        if(this.head == null){
            this.head = node;
        }
        else{
            LinkableContainer temp = this.head;
            this.head = node;
            this.head.setNext(temp);
        }
    }

    public void setTail(LinkableContainer node){
        if(this.tail == null){
            this.head = node;
        }
        else{
            this.tail.setNext(node);
            this.tail = node;
        }
    }

    public LinkableContainer getHead()
    {
        return this.head;
    }

    public LinkableContainer getTail(){

        if(this.tail == null){
            LinkableContainer n = this.head;
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

    public LinkableContainer get(LinkableContainer node){
        LinkableContainer n = this.head;
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

    public void add(LinkableContainer newnode){
        if(this.head == null){
            this.head = newnode;
            this.tail = newnode;
        }
        else{
            newnode.setPrev(this.getTail());
            newnode.setNext(null);
            this.getTail().setNext(newnode);
            this.tail = newnode;
        }
    }

    public void addAtPosition(LinkableContainer position, LinkableContainer newnode){
        LinkableContainer n0 = this.get(position);
        LinkableContainer n1 = n0.getNext();

        n0.setNext(newnode);
        n1.setPrev(newnode);
        newnode.setPrev(n0);
        newnode.setNext(n1);
    }

    public int getNumberOfElements(){
        int count = 0;
        LinkableContainer n = this.head;
        while(n != null){
            n = n.getNext();
            count += 1;
        }
        return count;
    }
}
