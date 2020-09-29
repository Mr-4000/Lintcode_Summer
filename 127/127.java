/**
 * Definition for Directed graph.
 * class DirectedGraphNode {
 *     int label;
 *     ArrayList<DirectedGraphNode> neighbors;
 *     DirectedGraphNode(int x) { label = x; neighbors = new ArrayList<DirectedGraphNode>(); }
 * };
 */

public class Solution {
    /*
     * @param graph: A list of Directed graph node
     * @return: Any topological order for the given graph.
     */
    public ArrayList<DirectedGraphNode> topSort(ArrayList<DirectedGraphNode> graph) {
        // write your code here
        HashMap<DirectedGraphNode,Integer> indgree = new HashMap();
        Queue<DirectedGraphNode> q = new LinkedList();
        ArrayList<DirectedGraphNode> map = new ArrayList();
        for (DirectedGraphNode node:graph) {
            for (DirectedGraphNode neighbor:node.neighbors) {
                if (indgree.containsKey(neighbor)) {
                    indgree.put(neighbor,indgree.get(neighbor)+1);
                }
                else {
                    indgree.put(neighbor,1);
                }
            }
        }
        for (DirectedGraphNode node:graph) {
            if (!indgree.containsKey(node)) {
                q.offer(node);
                map.add(node);
            }
        }
        while (!q.isEmpty()) {
            DirectedGraphNode n = q.poll();
            for (DirectedGraphNode neighbor:n.neighbors) {
                indgree.put(neighbor,indgree.get(neighbor)-1);
                if (indgree.get(neighbor)==0) {
                    q.offer(neighbor);
                    map.add(neighbor);
                }
            }
        }
        return map;
    }
}