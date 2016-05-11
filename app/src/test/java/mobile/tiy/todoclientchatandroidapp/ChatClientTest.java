package mobile.tiy.todoclientchatandroidapp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Corey Shaw on 5/11/2016.
 */
public class ChatClientTest {
    ChatClient chatClient;

    @Before
    public void setUp() throws Exception {
      chatClient = new ChatClient();
    }

    @After
    public void tearDown() throws Exception {

    }
    @Test
    public void testSendMessage() throws Exception {
        String chatMessage = "kjdljalkfd lafj ladj fdasl jfdasd; fdsasj jfdk ";
        String expectedResponse = chatMessage;
        String actualResponse = chatClient.sendMessage(chatMessage);
        assertEquals(expectedResponse, actualResponse);
    }
}