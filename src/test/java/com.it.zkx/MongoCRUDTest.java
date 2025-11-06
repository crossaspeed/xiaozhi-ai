package com.it.zkx;

import com.it.zkx.bean.ChatMessages;
import dev.langchain4j.data.message.ChatMessage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootTest
public class MongoCRUDTest {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Test
    public void testInsert(){
        ChatMessages messages = new ChatMessages();
        messages.setContent("聊天记录列表");
        mongoTemplate.insert(messages);
    }

}
