package se.hb;

import org.junit.Before;
import org.junit.Test;
import se.hb.bank.Account;
import se.hb.bank.Transfer;
import static org.junit.Assert.*;
import se.hb.bank.exceptions.TransferNotAllowedException;

public class TransferTest {

    Account johnsAccount;
    Account lisasAccount;

    @Before
    public void setUp() throws Exception {
        johnsAccount = new Account(2000);
        lisasAccount = new Account(0);
    }

    @Test
    public void testDeposit() {
        assertNotNull("John should exist", johnsAccount);
        assertNotNull("Lisa should exist", lisasAccount);
        
        //Check that data is correct
        assertTrue("Johns account number should be 0", johnsAccount.getAccountNumber() == 0);
        assertTrue("Lisas account number should be 1", lisasAccount.getAccountNumber() == 1);
        assertEquals("Johns balance should be 2000.0", 2000.0, johnsAccount.getBalance(), 0);
        assertEquals("Lisa should be broke...", 0.0, lisasAccount.getBalance(), 0);

        try {
            //Transfer money
            Transfer.transfer(johnsAccount, lisasAccount, 700);
        } catch (TransferNotAllowedException ex) {
            ex.printStackTrace();
        }

        assertEquals("John should now have $1300.0", 1300.0, johnsAccount.getBalance(), 0);
        assertEquals("Lisa should now have $700.0", 700.0, lisasAccount.getBalance(), 0);
    }

    @Test(expected = TransferNotAllowedException.class)
    public void testNotAllowedTransfer() throws TransferNotAllowedException {
        Transfer.transfer(johnsAccount, lisasAccount, 1000000.0);
    }
}