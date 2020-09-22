package principle.single;

import org.junit.Test;

import static org.junit.Assert.*;

public class PhoneTest {

    @Test
    public void conn() {
        IConnectionManager iConnectionManager = new Phone();
        iConnectionManager.dialPhone("123456789");

        IDataTransfer iDataTransfer = new Phone();
        iDataTransfer.chat(iConnectionManager);
    }
}