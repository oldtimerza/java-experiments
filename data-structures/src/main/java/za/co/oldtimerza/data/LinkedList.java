package za.co.oldtimerza.data;

public class LinkedList<T>{
        private Linkable head = null;
        private Linkable tail = null;

        public LinkedList()
        {

        }

        public void setHead(T t)
        {
            Linkable node = new Node<T>(t);
            if(this.head == null){
                this.head = node;
                this.tail = node;
                }
            else{
                Linkable temp = this.head;
                temp.setPrev(node);
                this.head = node;
                this.head.setNext(temp);
            }
        }

        public void setTail(T t)
        {
            Linkable node = new Node<T>(t);
            this.tail.setNext(node);
            node.setPrev(this.tail);
            node.setNext(null);
            this.tail = node;
        }

        public Linkable getFirst()
        {
            return this.head;
        }

        public Linkable getLast()
        {

            if(this.tail == null){
                Linkable n = this.head;
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

        public Linkable get(int index)
        {
            int count = 0;
            Linkable n = this.head;
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

        public Linkable get(T t)
        {
            Linkable n = this.head;
            while(n.getNext() != null){
                if(n.getData() == t){
                    return n;
                }
                else{
                    n = n.getNext();
                }
            }
            return null;
        }

        public void add(T t)
        {
            Linkable newNode = new Node<T>(t);
            if(this.head == null){
                this.head = newNode;
                this.tail = newNode;
            }
            else{
                newNode.setPrev(this.getLast());
                newNode.setNext(null);
                this.getLast().setNext(newNode);
                this.tail = newNode;
            }
        }

        public void add(int index, T t)
        {
            Linkable newNode = new Node<T>(t);
            Linkable n0 = this.get(index);
            Linkable n1 = n0.getNext();

            n0.setNext(newNode);
            n1.setPrev(newNode);
            newNode.setPrev(n0);
            newNode.setNext(n1);
        }

        public void remove(int index)
        {
            this.get(index);
        }

        public int length()
        {
            int count = 0;
            Linkable n = this.head;
            while(n != null){
                n = n.getNext();
                count += 1;
            }
            return count;
        }
}

