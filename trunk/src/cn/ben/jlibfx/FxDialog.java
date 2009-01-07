
package cn.ben.jlibfx;

/**
 * 即时通信接口,一个 FxDialog 实例代表一次通信会话,在一次会话中可多次双向发送消息
 * @author Ben.Pang
 */
public interface FxDialog {
    /**
     * 注册服务器消息监听器. 如果 listener 为 null,则不抛出任何异常,且不执行任何操作<br />
     * 监听器将用于处理所有Dialog接收到的好友即时消息
     * @see MessageListener
     * @see #getDialogMsgListeners()
     * @see #removeDialogMsgListener(cn.ben.jlibfx.MessageListener)
     * @param listener {@link MessageListener 消息监听器}
     */
    public void addDialogMsgListener(MessageListener listener);
    /**
     * 移除服务器消息监听器. 如果 listener 为 null,则不抛出任何异常,且不执行任何操作。
     * @see MessageListener
     * @see #addDialogMsgListener(cn.ben.jlibfx.MessageListener)
     * @see #getDialogMsgListeners()
     * @param listener {@link MessageListener 消息监听器}
     */
    public void removeDialogMsgListener(MessageListener listener);
    /**
     * 返回此 FxDialog 对象注册的所有监听器的数组
     * @see MessageListener
     * @see #addDialogMsgListener(cn.ben.jlibfx.MessageListener)
     * @see #removeDialogMsgListener(cn.ben.jlibfx.MessageListener)
     * @return 此 FxDialog 对象注册的所有 {@link MessageListener},如果当前未注册任何侦听器,则返回一个空数组
     */
    public MessageListener[] getDialogMsgListeners();
    /**
     * 发送 Fetion {@link FxMessage 即时消息}
     * @param msg {@link FxMessage Fetion 消息}
     * @throws cn.ben.jlibfx.FxException
     */
    public void send(FxMessage msg) throws FxException;
    /**
     * 发送 {@link FxMessage SMS(手机短信)消息}
     * @param msg {@link FxMessage SMS(手机短信)消息}
     * @throws cn.ben.jlibfx.FxException
     */
    public void sendSMS(FxMessage msg) throws FxException;
}
