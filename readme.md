### 🌟 超可爱版项目使用指南来啦～ 🌟

- 嗨～ 宝子们！想知道这个项目怎么玩吗？跟着我一步步来，超简单的哦～ 😉

  #### 📋 先准备好这些 “小零件” 呀

  用之前要先检查一下有没有这些东西哟：

  - 本地得有个 MongoDb 数据库（就像给数据安个小家～）🗄️
  - 阿里云或者 Deepseek 大语言模型的 APIKey（这是调用大模型的 “钥匙” 哦）🔑
  - Node.js运行前端脚本

  #### 🚀 开始动手啦！三步搞定～

- 第一步：写个测试类，把八股题目 “搬” 到 Pinecone 上

  咱们要写一个测试类，让题目乖乖住进 Pinecone 里～ 代码模板都给你备好啦，抄作业就行👇

  - ```java
    @Autowired
    private EmbeddigStore embeddingStore;
    
    @Aotowired
    private EmbeddingModel embeddingMOdel;
    
    @Test
        public void testUploadKnowledgeLibrary() {
            //使用FileSystemDocumentLoader读取指定目录下的知识库文档
            //并使用默认的文档解析器对文档进行解析
            Document document1 = FileSystemDocumentLoader.loadDocument("八股目录");
            Document document2 = FileSystemDocumentLoader.loadDocument("八股目录");
            List<Document> documents = Arrays.asList(document1, document2);
            //文本向量化并存入向量数据库：将每个片段进行向量化，得到一个嵌入向量
            EmbeddingStoreIngestor
                    .builder()
                    .embeddingStore(embeddingStore)
                    .embeddingModel(embeddingModel)
                    .build()
                    .ingest(documents);
        }
    ```

- 第二步：改改配置文件，填好你的 “钥匙”

  找到`resources`文件夹里的`application.properties`文件（就是它啦📄），里面有这些内容：

  - ```properties
    langchain4j.community.dashscope.streaming-chat-model.api-key=${aliQwen-api}
    langchain4j.community.dashscope.streaming-chat-model.model-name=qwen-plus
    ```

  - 把`apikey`换成你自己的哦～ 大模型也可以挑喜欢的用，选一个你觉得最乖的就行啦～ 😘

- 第三步：别忘了 EmbeddingStoreConfig 文件呀

  - ```java
    apiKey(System.getenv("pinecone-api"))
    ```

  - 这里的`pinecone-api`也要换成你自己的 APIKey 哦，不然 Pinecone 认不出你呀～ 🔑



✨ 前端项目启动指南来咯～ ✨

咱们的前端小可爱是【xiaozhi-ui】哟～ 想让它跑起来超简单，跟着做就好啦～ 😘

#### 📝 启动步骤：

1. 先找到【xiaozhi-ui】的 “小窝”—— 也就是它的根目录呀～ 📂

2. 在根目录里召唤 “命令行小精灵”：右键打开 CMD（或者终端）就行啦～ 💻

3. 敲下启动咒语：

   1. ```nginx
      npm run dev
      ```

4. 等一小会儿，前端页面就会乖乖出现咯～ ✨

   是不是超 easy ！启动成功后就可以和可爱的AI玩耍啦～ 😊