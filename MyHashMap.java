public class MyHashMap {
    //HomeWork2
    class ListNode {
        int key;
        int val;
        ListNode next;

        public ListNode(int k, int v, ListNode n) {
            this.key = k;
            this.val = v;
            this.next = n;
        }
    }

    //MyHashMap
    ListNode[] data;
    static final double loadFactor = 0.75;

    public MyHashMap(int size) {
        this.data = new ListNode[8];
    }

    public void put(int key, int value) {
        remove(key);
        int h = hash(key);
        ListNode newNode = new ListNode(key, value, data[h]);
        data[h] = newNode;
    }

    public int get(int key) {
        int h = hash(key);
        ListNode head = data[h];
        while(head != null) {
            if(head.key == key) {
                return head.val;
            }
            head = head.next;
        }
        return -1;
    }

    public void remove(int key) {
        int h = hash(key);
        ListNode head = data[h];
        if(head == null) {
            return;
        }
        if(data[h].key == key) {
            data[h] = head.next;
        }
        while(head.next != null) {
            if(head.next.key == key) {
                head.next = head.next.next;
                return;
            }
        }
    }

    private int hash(int key) {
        return Integer.hashCode(key) % data.length;
    }

}
