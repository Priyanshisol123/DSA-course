//HashMap Implementation code
import java.util.*;
public class HM04 {
    static class HashMap<K, V> { // generic -parameterized type for any value okay
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // number of elements-n-size
        private int N; // number of buckets
        private LinkedList<Node> buckets[]; // N = buckets.length

        //implementaintion or creation of ll and buckets
        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];//sometimes  error so we did  this->@SuppressWarnings("unchecked")

            // initialize all the buckets with linked list
            for (int i = 0; i < buckets.length; i++) {
                this.buckets[i] = new LinkedList<>();//create an empty ll
            }
        }

        //to convert and set bi
        private int hashFunction(K key) {
            int hc = key.hashCode();//inbuilt return hashcode value for object
            return Math.abs(hc) % N;//absolute value and between the size so % size
            // 123456789 -> 123456789 % 4 = 1
            // -123456789 -> -123456789 % 4 = -1 -> We need +ve
        } // O(1)

        //search in LL the node for put
        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            int di = 0;

            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if (node.key == key) {
                    return di;
                }
                di++;
            }
            return -1;
        }

        //rehash
        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node> oldBuckets[] = buckets;
            buckets = new LinkedList[2 * N];
            N = 2 * N;
            for (int i = 0; i < buckets.length; i++) {
                this.buckets[i] = new LinkedList<>();
            }

            // copy old data to new buckets, nodes -> add in bucket
            for (int i = 0; i < oldBuckets.length; i++) {
                LinkedList<Node> ll = oldBuckets[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }

        //put
        public void put(K key, V value) { // O(Lambda) -> O(1)
            int bi = hashFunction(key); // bucket index (0, 1, 2, 3)
            int di = searchInLL(key, bi); // data index: valid or -1

            if (di != -1) {// exists
                // update
                Node node = buckets[bi].get(di);
                node.value = value;
            } else {
                // new node
                buckets[bi].add(new Node(key, value));
                n++;
            }

            double lambda = (double) n / N;
            if (lambda > 2.0) {
                rehash();
            }
        }

        //contains- similar to put
        public boolean containsKey(K key) { // O(Lambda) -> O(1)
            int bi = hashFunction(key); // bucket index (0, 1, 2, 3)
            int di = searchInLL(key, bi); // data index: valid or -1

            if (di != -1) {// exists or valid value
                return true;
            } else {
                return false;
            }
        }

        //get - similar to put
        public V get(K key) { // O(Lambda) -> O(1)
            int bi = hashFunction(key); // bucket index (0, 1, 2, 3)
            int di = searchInLL(key, bi); // data index: valid or -1

            if (di != -1) {// exists
                return buckets[bi].get(di).value;
            } else {
                return null;
            }
        }

        //remove- similar to put
        public V remove(K key) { // O(Lambda) -> O(1)
            int bi = hashFunction(key); // bucket index (0, 1, 2, 3)
            int di = searchInLL(key, bi); // data index: valid or -1

            if (di != -1) {// exists
                n--; // update size
                return buckets[bi].remove(di).value;
            } else {
                return null;
            }
        }

        // stors key in al and returns
        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();
            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty() {
            return n == 0;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 100);
        map.put("USA", 50);
        map.put("UK", 150);
        map.put("Nepal", 5);

        ArrayList<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " -> " + map.get(key));
        }

        System.out.println(map.get("India"));
        System.out.println(map.remove("India"));
        System.out.println(map.get("India"));
    }
}