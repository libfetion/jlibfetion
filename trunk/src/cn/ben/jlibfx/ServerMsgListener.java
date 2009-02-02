
package cn.ben.jlibfx;

/**
 * jLIbFx 服务器消息监听器基准接口,所有服务器消息侦听器必须直接或间接继承此接口
 * @author Ben.Pang
 */
public interface ServerMsgListener extends MessageListener {
    /**
     * 成功连接服务器后时调用,并传入 {@link MessageEvent 服务器消息事件对象}
     * @see MessageEvent
     * @param event {@link MessageEvent 服务器消息事件对象}
     */
    public void connected(MessageEvent event);
    /**
     * 与服务器断开连接后调用,并传入 {@link MessageEvent 服务器消息事件对象}
     * @see MessageEvent
     * @param event {@link MessageEvent 服务器消息事件对象}
     */
    public void disconnected(MessageEvent event);
}
