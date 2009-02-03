
package cn.ben.jlibfx;

import cn.ben.jlibfx.util.ListenersManager;

/**
 *
 * @author Ben.Pang
 */
public abstract class AbstractDialog implements FxDialog {
    private ListenersManager<MessageListener> listeners;  // 即时对话消息监听器

    /**
     * 注册服务器消息监听器. 如果 listener 为 null,则不抛出任何异常,且不执行任何操作<br />
     * 监听器将用于处理所有Dialog接收到的好友即时消息
     * @see MessageListener
     * @see #getDialogMsgListeners()
     * @see #removeDialogMsgListener(cn.ben.jlibfx.MessageListener)
     * @param listener {@link MessageListener 消息监听器}
     */
    public void addDialogMsgListener(MessageListener listener) {
        listeners.addListener(listener);
    }
    /**
     * 移除服务器消息监听器. 如果 listener 为 null,则不抛出任何异常,且不执行任何操作。
     * @see MessageListener
     * @see #addDialogMsgListener(cn.ben.jlibfx.MessageListener)
     * @see #getDialogMsgListeners()
     * @param listener {@link MessageListener 消息监听器}
     */
    public void removeDialogMsgListener(MessageListener listener) {
        listeners.removeListener(listener);
    }
    /**
     * 返回此 FxDialog 对象注册的所有监听器的数组
     * @see MessageListener
     * @see #addDialogMsgListener(cn.ben.jlibfx.MessageListener)
     * @see #removeDialogMsgListener(cn.ben.jlibfx.MessageListener)
     * @return 此 FxDialog 对象注册的所有 {@link MessageListener},如果当前未注册任何侦听器,则返回一个空数组
     */
    public MessageListener[] getDialogMsgListeners() {
        return listeners.getListeners(MessageListener.class);
    }

}
