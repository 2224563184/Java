package com.Data;

import org.apache.http.HttpHost;
import org.elasticsearch.client.*;
import org.elasticsearch.client.indices.CreateIndexRequest;
import org.elasticsearch.xcontent.XContentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class test {
/*
*
* */
    @Autowired
     private    Tab tab;

//      创建索引
    public  void test()throws Exception{

//           创建ES客户端:
/*                       创建主机对象
*                        创建ES低级客户端
*                        创建ES高级客户端 */
        HttpHost host = HttpHost.create("http://127.0.0.1:9200");
        RestClientBuilder builder = RestClient.builder(host);
        RestHighLevelClient client = new RestHighLevelClient(builder);

//
/*             是ES客户端创建索引对象
*              创建请求对象
*              设置请求方式
*                 发送请求
*          关闭ES客户端对象
* */
        IndicesClient indices = client.indices();
        CreateIndexRequest request=new CreateIndexRequest("books");
        indices.create(request, RequestOptions.DEFAULT);
        client.close();

    }

//     添加文档
    public void add()throws Exception {

//        创建ES客户端
        HttpHost httpHost = HttpHost.create("http://127.0.0.1:9200");
        RestClientBuilder builder = RestClient.builder(httpHost);
        RestHighLevelClient client = new RestHighLevelClient(builder);

        CreateIndexRequest request = new CreateIndexRequest("books");
        String  json="   {\n" +
                "                        \n" +
                "\t\t\t\"mappiongs\": {\n" +
                "\t\t\t\n" +
                "                       \"properties\": {\n" +
                "\n" +
                "\n" +
                "        \t\t        #属性\n" +
                "  \t\t\t       \"id\": {\n" +
                " \t\t\t    #数据类型:  关键字\n" +
                "\t\t\t       \"type\": \"keyword\"\t\n" +
                "\t\t\t\t      },\n" +
                "\n" +
                "\n" +
                "\t\t\t        #属性\n" +
                "                             \"name\": {\n" +
                "\n" +
                "\t\t\t   #数据类型: 文本\n" +
                "       \t\t\t      \"type\":  \"text\"\n" +
                "\n" +
                "\t\t    \t      #分词器  \n" +
                "\t\t          \"analyzer\": \"ik_max_word\"\t\t\t\t\t\t\t\t\t\t  \t       \n" +
                "\t\t\t\t     },\n" +
                "\n" +
                "\n" +
                "\t\t\t    \n" +
                " \t\t         \"descrtion\":{\n" +
                "\t\t\t      \"type\": \"text\"\n" +
                "\t\t\t  \"analyzer\": \"ik_max_word\"\n" +
                "\t\t\n" +
                "\t\t   #其他属性参与查询\n" +
                "\t\t\t   \"copy_to\": \"name\"\t\n" +
                "\t\t\t\t     }\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\t\t     #参加分词\n" +
                "\t\t\t      \"type\":{\n" +
                "\t\t\t\n" +
                "\t\t\t         #哪些类型参加分词\n" +
                "\t\t\t\t\"type\":\"keyword\"\t\t\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t     },\t\t\t\t\n" +
                "\t\t\t\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\t\t\t      }\n" +
                "\t\t\t  \n" +
                "\t\t\t \n" +
                "\n" +
                "\n" +
                "\t\t   }\n";
        request.source(json, XContentType.JSON);
        client.indices().create(request, RequestOptions.DEFAULT);



    }
}
