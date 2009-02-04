
package cn.ben.jlibfx;

/**
 * 即时对话类实现类
 * @author Ben.Pang
 */
class DialogImpl extends AbstractDialog {
    private FetionImpl fetion;
    /**
     * 发送 Fetion {@link FxMessage 即时消息}
     * @param msg {@link FxMessage Fetion 消息}
     * @throws cn.ben.jlibfx.FxException
     */
    public void send(FxMessage msg) throws FxException {
        fetion.send(msg);
    }
    /**
     * 发送 {@link FxMessage SMS(手机短信)消息}
     * @param msg {@link FxMessage SMS(手机短信)消息}
     * @throws cn.ben.jlibfx.FxException
     */
    public void sendSMS(FxMessage msg) throws FxException {
        fetion.sendSMS(msg);
    }
}
