//Clone Graph(LC 133)
//Optimal--map & bfs--T.C:O(V+E)------S.C:O(V)
//USING THE LC TEMPLATE
package Google.Medium;
import java.util.*;

class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}

class p7{
    public Node cloneGraph(Node node) {
        if(node==null)
        return null;
        Map<Integer,Node> mp=new HashMap<>();
        Queue<Node> q=new LinkedList<>();
        Node head=new Node(node.val);
        mp.put(node.val,head);
        q.add(node);
        while(q.size()>0)
        {
            Node poll=q.poll();
            Node d=mp.get(poll.val);
            List<Node> ne=new ArrayList<>();
            for(Node n:poll.neighbors)
            {
                if(mp.containsKey(n.val))
                ne.add(mp.get(n.val));
                else
                {
                    Node news=new Node(n.val);
                    mp.put(n.val,news);
                    ne.add(news);
                    q.add(n);
                }
            }
            d.neighbors=ne;
        }
        return head;
    }
}