package com.it.zkx.config;


import dev.langchain4j.memory.ChatMemory;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MemoryChatAssistantConfig {
    @Bean
    ChatMemory chatMemory(){
        //设置聊天记录的message数量
        return MessageWindowChatMemory.withMaxMessages(10);
    }
}
