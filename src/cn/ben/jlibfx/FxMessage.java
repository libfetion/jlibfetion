
package cn.ben.jlibfx;

/**
 * jLIbFx 消息对象接口,所有消息类直接或间接继承此接口.
 * @author Ben.Pang
 */
public interface FxMessage {
    /**
     * 返回发送信息的帐户对象
     * @see FxAccount
     * @return 返回发送消息的{@link FxAccount 帐户对象}
     */
    public FxAccount getSender();
    /**
     * 返回信息主体(内容)
     * @return 消息内容,一些控制消息可能为 null
     */
    public String getMessage();
}
