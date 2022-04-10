import demo.myImpl.ConnectionReader;
import demo.myImpl.ConnectionsInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class QuickFindTest {
   static repetition.QuickFind_1 quickFind;

    public QuickFindTest() {
    }

    @BeforeAll
    private static void setUp() {
        ConnectionReader connectionReader = new ConnectionReader();
        ConnectionsInfo connectionsInfo = connectionReader.generateConnectionInfo();
        quickFind = new repetition.QuickFind_1(connectionsInfo.getNumberOfNodes());
        connectionsInfo.getConnections().forEach((e) -> {
            quickFind.connect(e);
        });
    }

    @Test
     void testConnectedNodes() {
        Assertions.assertTrue(this.quickFind.isConnected(0, 1));
        Assertions.assertTrue(this.quickFind.isConnected(0, 5));
        Assertions.assertTrue(this.quickFind.isConnected(1, 5));
        Assertions.assertTrue(this.quickFind.isConnected(6, 7));
        Assertions.assertTrue(this.quickFind.isConnected(6, 3));
        Assertions.assertTrue(this.quickFind.isConnected(6, 2));
        Assertions.assertTrue(this.quickFind.isConnected(7, 2));
        Assertions.assertTrue(this.quickFind.isConnected(7, 3));
        Assertions.assertTrue(this.quickFind.isConnected(2, 3));
        Assertions.assertTrue(this.quickFind.isConnected(8, 9));
        Assertions.assertTrue(this.quickFind.isConnected(8, 4));
        Assertions.assertTrue(this.quickFind.isConnected(9, 4));
    }

    @Test
    void notConnectedNodes(){
        //0-1-5
        Assertions.assertFalse(this.quickFind.isConnected(0, 2));
        Assertions.assertFalse(this.quickFind.isConnected(0, 3));
        Assertions.assertFalse(this.quickFind.isConnected(0, 4));
        Assertions.assertFalse(this.quickFind.isConnected(0, 6));
        Assertions.assertFalse(this.quickFind.isConnected(0, 7));
        Assertions.assertFalse(this.quickFind.isConnected(0, 8));
        Assertions.assertFalse(this.quickFind.isConnected(0, 9));

        Assertions.assertFalse(this.quickFind.isConnected(1, 2));
        Assertions.assertFalse(this.quickFind.isConnected(1, 3));
        Assertions.assertFalse(this.quickFind.isConnected(1, 4));
        Assertions.assertFalse(this.quickFind.isConnected(1, 6));
        Assertions.assertFalse(this.quickFind.isConnected(1, 7));
        Assertions.assertFalse(this.quickFind.isConnected(1, 8));
        Assertions.assertFalse(this.quickFind.isConnected(1, 9));

        Assertions.assertFalse(this.quickFind.isConnected(5, 2));
        Assertions.assertFalse(this.quickFind.isConnected(5, 3));
        Assertions.assertFalse(this.quickFind.isConnected(5, 4));
        Assertions.assertFalse(this.quickFind.isConnected(5, 6));
        Assertions.assertFalse(this.quickFind.isConnected(5, 7));
        Assertions.assertFalse(this.quickFind.isConnected(5, 8));
        Assertions.assertFalse(this.quickFind.isConnected(5, 9));
        //6-7-2-3
        Assertions.assertFalse(this.quickFind.isConnected(6, 0));
        Assertions.assertFalse(this.quickFind.isConnected(6, 1));
        Assertions.assertFalse(this.quickFind.isConnected(6, 5));
        Assertions.assertFalse(this.quickFind.isConnected(6, 4));
        Assertions.assertFalse(this.quickFind.isConnected(6, 8));
        Assertions.assertFalse(this.quickFind.isConnected(6, 9));

        Assertions.assertFalse(this.quickFind.isConnected(7, 0));
        Assertions.assertFalse(this.quickFind.isConnected(7, 1));
        Assertions.assertFalse(this.quickFind.isConnected(7, 5));
        Assertions.assertFalse(this.quickFind.isConnected(7, 4));
        Assertions.assertFalse(this.quickFind.isConnected(7, 8));
        Assertions.assertFalse(this.quickFind.isConnected(7, 9));

        Assertions.assertFalse(this.quickFind.isConnected(2, 0));
        Assertions.assertFalse(this.quickFind.isConnected(2, 1));
        Assertions.assertFalse(this.quickFind.isConnected(2, 5));
        Assertions.assertFalse(this.quickFind.isConnected(2, 4));
        Assertions.assertFalse(this.quickFind.isConnected(2, 8));
        Assertions.assertFalse(this.quickFind.isConnected(2, 9));

        Assertions.assertFalse(this.quickFind.isConnected(3, 0));
        Assertions.assertFalse(this.quickFind.isConnected(3, 1));
        Assertions.assertFalse(this.quickFind.isConnected(3, 5));
        Assertions.assertFalse(this.quickFind.isConnected(3, 4));
        Assertions.assertFalse(this.quickFind.isConnected(3, 8));
        Assertions.assertFalse(this.quickFind.isConnected(3, 9));

        //8-9-4
        Assertions.assertFalse(this.quickFind.isConnected(8, 0));
        Assertions.assertFalse(this.quickFind.isConnected(8, 1));
        Assertions.assertFalse(this.quickFind.isConnected(8, 5));
        Assertions.assertFalse(this.quickFind.isConnected(8, 6));
        Assertions.assertFalse(this.quickFind.isConnected(8, 7));
        Assertions.assertFalse(this.quickFind.isConnected(8, 2));
        Assertions.assertFalse(this.quickFind.isConnected(8, 3));

        Assertions.assertFalse(this.quickFind.isConnected(9, 0));
        Assertions.assertFalse(this.quickFind.isConnected(9, 1));
        Assertions.assertFalse(this.quickFind.isConnected(9, 5));
        Assertions.assertFalse(this.quickFind.isConnected(9, 6));
        Assertions.assertFalse(this.quickFind.isConnected(9, 7));
        Assertions.assertFalse(this.quickFind.isConnected(9, 2));
        Assertions.assertFalse(this.quickFind.isConnected(9, 3));

        Assertions.assertFalse(this.quickFind.isConnected(4, 0));
        Assertions.assertFalse(this.quickFind.isConnected(4, 1));
        Assertions.assertFalse(this.quickFind.isConnected(4, 5));
        Assertions.assertFalse(this.quickFind.isConnected(4, 6));
        Assertions.assertFalse(this.quickFind.isConnected(4, 7));
        Assertions.assertFalse(this.quickFind.isConnected(4, 2));
        Assertions.assertFalse(this.quickFind.isConnected(4, 3));


    }
}

