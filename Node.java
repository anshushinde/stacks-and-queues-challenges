
    public class Node {

        private Object data;
        private Node next;

        public Node(Object data, Node next){
            this.data = data;
            this.next = next;
        }

        public Object getData(){
            return data;
        }
        public void setData(Object newData){
            data = newData;
        }
        public Node getNext(){
            return next;
        }
        public void setNext(Node newNode){
            next = newNode;
        }

    }



