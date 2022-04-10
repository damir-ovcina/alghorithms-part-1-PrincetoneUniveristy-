package demo.myImpl;

import java.util.ArrayList;

public class ConnectionsInfo {
    private int numberOfNodes;
    private ArrayList<int[]> connections = new ArrayList();

    public ConnectionsInfo(int numberOfNodes, ArrayList<int[]> connections) {
        this.numberOfNodes = numberOfNodes;
        this.connections = connections;
    }

    public ConnectionsInfo() {
    }

    public int getNumberOfNodes() {
        return numberOfNodes;
    }

    public void setNumberOfNodes(int numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
    }

    public ArrayList<int[]> getConnections() {
        return connections;
    }

    public void setConnections(ArrayList<int[]> connections) {
        this.connections = connections;
    }
}
