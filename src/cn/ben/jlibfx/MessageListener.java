
package cn.ben.jlibfx;

/**
 * jLIbFx 即时消息监听器基准接口,所有即时消息侦听器必须直接或间接继承此接口
 * @author Ben.Pang
 */
public interface MessageListener extends java.util.EventListener {
    /**
     * 当接收到消息时调用,并传入该 {@link MessageEvent 消息事件对象}
     * @see MessageEvent
     * @param event {@link MessageEvent 消息事件对象}
     */
    public void messageReceived(MessageEvent event);
}
