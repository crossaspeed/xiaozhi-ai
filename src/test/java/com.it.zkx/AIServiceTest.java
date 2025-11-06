package com.it.zkx;

import com.it.zkx.assistant.Assistant;
import com.it.zkx.assistant.MemoryChatAssistant;
import com.it.zkx.assistant.SeparateChatAssistant;
import dev.langchain4j.community.model.dashscope.QwenChatModel;
import dev.langchain4j.service.AiServices;
import dev.langchain4j.service.spring.AiService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AIServiceTest {
    @Autowired
    private QwenChatModel qwenChatModel;
    @Test
    public void testChat(){
        Assistant assistant = AiServices.create(Assistant.class, qwenChatModel);
        String answer = assistant.chat("你是谁");
        System.out.println(answer);

    }

    @Autowired
    private Assistant assistant;
    @Test
    public void testAssistant(){
        String answer = assistant.chat("你是谁");
        System.out.println(answer);

    }


    @Autowired
    private MemoryChatAssistant memoryChatAssistant;
    @Test
    public void testMemory(){
        String answer1 = memoryChatAssistant.chat("我是张");
        System.out.println(answer1);
        String answer2 = memoryChatAssistant.chat("我是谁");
        System.out.println(answer2);

    }

    @Autowired
    private SeparateChatAssistant separateChatAssistant;
    @Test
    public void testMemory2(){
        String answer1 = separateChatAssistant.chat(1, "我是张");
        System.out.println(answer1);
        String answer2 = separateChatAssistant.chat(1, "我是谁");
        System.out.println(answer2);
        String answer3 = separateChatAssistant.chat(2, "我是谁");
        System.out.println(answer3);

    }
}
