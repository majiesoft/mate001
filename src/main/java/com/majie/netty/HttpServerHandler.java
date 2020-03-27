package com.majie.netty;


/*
  created by 19147
  date by 2020/3/26
  
*/


import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;


public class HttpServerHandler extends SimpleChannelInboundHandler {

   private static ChannelGroup channelGroup = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, Object o) throws Exception {
            channelGroup.forEach(channel -> {
                  if (channel != channelHandlerContext.channel()){
                      channel.writeAndFlush("nihao!!!!!!!!!!!!!!!!!");

                  }

            });
            System.out.println("nihao");
            channelHandlerContext.channel().writeAndFlush("nihao");
    }

    @Override
    public void channelRegistered(ChannelHandlerContext ctx) throws Exception {
        channelGroup.add(ctx.channel());

    }

    @Override
    public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
        super.handlerAdded(ctx);
    }

    @Override
    public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
        super.handlerRemoved(ctx);
    }

    @Override
    public void channelUnregistered(ChannelHandlerContext ctx) throws Exception {
        super.channelUnregistered(ctx);
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        super.channelActive(ctx);
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        super.channelInactive(ctx);
    }
}
