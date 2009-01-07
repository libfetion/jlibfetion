

package cn.ben.jlibfx;

/**
 * 服务器消息监听器
 * @author Ben.Pang
 */
public class ServerMsgListener implements MessageListener {
    /**
     * 处理服务器消息事件
     * @param event 服务器消息事件对象
     */
    public void messageReceived(MessageEvent event) {
        if( event == null || !(event instanceof ServerMsgEvent) )
            return;
        
    }
    
}
