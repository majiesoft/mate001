package com.majie.netty;


/*
  created by 19147
  date by 2020/3/26
  
*/


import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpServerCodec;


public class ServerChannelInitializer extends ChannelInitializer<SocketChannel> {


    @Override
    protected void initChannel(SocketChannel socketChannel) throws Exception {
        ChannelPipeline pipeline = socketChannel.pipeline();
        //处理http服务的关键handler
        pipeline.addLast("httpServerCodec",new HttpServerCodec());
        //自定义的handler
        pipeline.addLast("testHttpServerHandler",new HttpServerHandler());
    }
}
