
          //引入框架
          const express = require("express");
          //创建对象
          const app=express();
          //创建路由规则
          //rest:封装请求报文; resp:封装响应报文
          app.get('/', (rest, resp) =>{
          //设置响应
              resp.send("ajax");
          });

          app.listen(8000, ()=>console.log("服务已启动"))