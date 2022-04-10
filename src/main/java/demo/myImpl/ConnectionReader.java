package demo.myImpl;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;


public class ConnectionReader {

    private static final String CONNECTION_FILE = "connections.txt";

    public ConnectionsInfo generateConnectionInfo(){
        ArrayList<int[]> connections = new ArrayList<>();
        ConnectionsInfo info;
        int numberOfNodes = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream(CONNECTION_FILE)));) {
            String lineOne = bufferedReader.readLine().trim();
            numberOfNodes = Integer.valueOf(lineOne.split("=")[1].trim());
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                int[] connection = Arrays.stream(line.trim().split(" ")).mapToInt(Integer::valueOf).toArray();
                connections.add(connection);
            }
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }

        info = new ConnectionsInfo(numberOfNodes, connections);
        return info;
    }


}
