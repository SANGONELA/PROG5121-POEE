/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.quickchatap;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author sandingonela
 */
public class QUICKCHATAPTest {
    
    public QUICKCHATAPTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class QUICKCHATAP.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        QUICKCHATAP.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerUser method, of class QUICKCHATAP.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        QUICKCHATAP.registerUser();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loginUser method, of class QUICKCHATAP.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        boolean expResult = false;
        boolean result = QUICKCHATAP.loginUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of runMainMenu method, of class QUICKCHATAP.
     */
    @Test
    public void testRunMainMenu() {
        System.out.println("runMainMenu");
        QUICKCHATAP.runMainMenu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sendMessages method, of class QUICKCHATAP.
     */
    @Test
    public void testSendMessages() {
        System.out.println("sendMessages");
        QUICKCHATAP.sendMessages();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of messageManagerMenu method, of class QUICKCHATAP.
     */
    @Test
    public void testMessageManagerMenu() {
        System.out.println("messageManagerMenu");
        QUICKCHATAP.messageManagerMenu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displaySendersAndRecipients method, of class QUICKCHATAP.
     */
    @Test
    public void testDisplaySendersAndRecipients() {
        System.out.println("displaySendersAndRecipients");
        QUICKCHATAP.displaySendersAndRecipients();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayLongestMessage method, of class QUICKCHATAP.
     */
    @Test
    public void testDisplayLongestMessage() {
        System.out.println("displayLongestMessage");
        QUICKCHATAP.displayLongestMessage();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchByMessageID method, of class QUICKCHATAP.
     */
    @Test
    public void testSearchByMessageID() {
        System.out.println("searchByMessageID");
        String id = "";
        QUICKCHATAP.searchByMessageID(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchByRecipient method, of class QUICKCHATAP.
     */
    @Test
    public void testSearchByRecipient() {
        System.out.println("searchByRecipient");
        String recipientNumber = "";
        QUICKCHATAP.searchByRecipient(recipientNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteByMessageHash method, of class QUICKCHATAP.
     */
    @Test
    public void testDeleteByMessageHash() {
        System.out.println("deleteByMessageHash");
        String hash = "";
        QUICKCHATAP.deleteByMessageHash(hash);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayReport method, of class QUICKCHATAP.
     */
    @Test
    public void testDisplayReport() {
        System.out.println("displayReport");
        QUICKCHATAP.displayReport();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateMessageID method, of class QUICKCHATAP.
     */
    @Test
    public void testGenerateMessageID() {
        System.out.println("generateMessageID");
        String expResult = "";
        String result = QUICKCHATAP.generateMessageID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateMessageHash method, of class QUICKCHATAP.
     */
    @Test
    public void testGenerateMessageHash() {
        System.out.println("generateMessageHash");
        String id = "";
        int num = 0;
        String msg = "";
        String expResult = "";
        String result = QUICKCHATAP.generateMessageHash(id, num, msg);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayMessageDetails method, of class QUICKCHATAP.
     */
    @Test
    public void testDisplayMessageDetails() {
        System.out.println("displayMessageDetails");
        String id = "";
        String hash = "";
        String recipient = "";
        String message = "";
        QUICKCHATAP.displayMessageDetails(id, hash, recipient, message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of writeMessageToJSON method, of class QUICKCHATAP.
     */
    @Test
    public void testWriteMessageToJSON() {
        System.out.println("writeMessageToJSON");
        String messageID = "";
        String hash = "";
        String recipient = "";
        String message = "";
        QUICKCHATAP.writeMessageToJSON(messageID, hash, recipient, message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
