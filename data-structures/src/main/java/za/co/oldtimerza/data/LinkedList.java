package za.co.oldtimerza.data;

public class LinkedList {
        private LinkableContainer head = null;
        private LinkableContainer tail = null;

        public LinkedList(){

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

        public LinkableContainer getFirst()
        {
            return this.head;
        }

        public LinkableContainer getLast(){

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

        public LinkableContainer get(int index) {
            int count = 0;
            LinkableContainer n = this.head;
            while(n.getNext() != null){
                if(count == index){
                    return n;
                }
                else{
                    count += 1;
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
                newnode.setPrev(this.getLast());
                newnode.setNext(null);
                this.getLast().setNext(newnode);
                this.tail = newnode;
            }
        }

        public void add(int index, LinkableContainer newnode){
            LinkableContainer n0 = this.get(index);
            LinkableContainer n1 = n0.getNext();

            n0.setNext(newnode);
            n1.setPrev(newnode);
            newnode.setPrev(n0);
            newnode.setNext(n1);
        }

        public void remove(int index) {
            this.get(index);
        }

        public int length(){
            int count = 0;
            LinkableContainer n = this.head;
            while(n != null){
                n = n.getNext();
                count += 1;
            }
            return count;
        }
}

