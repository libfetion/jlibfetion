
package cn.ben.jlibfx;

/**
 * jLlibFx消息事件对象,所有事件对象将直接或间接继承此类
 * @author Ben.Pang
 */
public class MessageEvent extends java.util.EventObject {
    /**
     * 构造一个 MessageEvent 对象,传入最初发生 Event 的对象
     * @param source 引发事件的对象
     */
    public MessageEvent(Object source) {
        super(source);
    }
}
