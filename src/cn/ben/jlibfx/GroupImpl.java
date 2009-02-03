
package cn.ben.jlibfx;

import cn.ben.jlibfx.util.ListenersManager;

/**
 * 组实现类
 * @author Ben.Pang
 */
class GroupImpl extends AbstractGroup {
    private ListenersManager<MessageListener> listeners;         // 服务器消息监听器
    private FetionImpl fetion;

    /**
     * 传入组名,构造一个新组
     * @param name 组名
     */
    public GroupImpl(String name) {
        super(name);
    }
    /**
     * 注册组消息监听器. 如果 {@link MessageListener listener} 为 null，则不抛出任何异常，且不执行任何操作。
     * @see MessageListener
     * @see #getGroupMsgListeners()
     * @see #removeGroupMsgListener(cn.ben.jlibfx.MessageListener)
     * @param listener {@link MessageListener 组消息监听器}
     */
    public void addGroupMsgListener(MessageListener listener) {
        listeners.addListener(listener);
    }
    /**
     * 移除组消息监听器. 如果 {@link MessageListener 组消息监听器} 为 null，则不抛出任何异常，且不执行任何操作。
     * @see MessageListener
     * @see #addGroupMsgListener(cn.ben.jlibfx.MessageListener)
     * @see #removeGroupMsgListener(cn.ben.jlibfx.MessageListener)
     * @param listener {@link MessageListener 组消息监听器}
     */
    public void removeGroupMsgListener(MessageListener listener) {
        listeners.removeListener(listener);
    }
    /**
     * 返回此组对象注册过的所有监听器的数组
     * @see MessageListener
     * @see #addGroupMsgListener(cn.ben.jlibfx.MessageListener)
     * @see #getGroupMsgListeners()
     * @return {@link MessageListener 组消息监听器}数组
     */
    public MessageListener[] getGroupMsgListeners() {
        return listeners.getListeners(MessageListener.class);
    }
    /**
     * 向组里添加新好友. 如果传入 null 或该组中已经存在相同帐户好友则不执行任何操作
     * @see FxAccount
     * @param account 需要加入组中的 {@link FxAccount Fetion 帐户}
     * @throws cn.ben.jlibfx.FxUnsupportedException
     * @throws cn.ben.jlibfx.FxException
     */
    @Override
    public synchronized void add(FxAccount account) throws FxException {
        if ( fetion.addBuddyToGroup(this,account) )
            super.add(account);
    }
    /**
     * 从组中删除指定 {@link FxAccount Fetion 帐户},如果传入 null 则不执行任何操作
     * @param account 将从组中删除的 {@link FxAccount Fetion 帐户}
     * @throws cn.ben.jlibfx.FxException
     */
    @Override
    public void remove(FxAccount account) throws FxException {
        if ( fetion.removeBuddyToGroup(this, account) )
            super.remove(account);
    }
    /**
     * 设置组名. 如果传入null或empty则不会执行任何操作. </br>
     * 目前不支持此操作 {@link FxUnsupportedException 点击说明}, 调用将抛出 {@link FxUnsupportedException FxUnsupportedException} 异常
     * @see FxUnsupportedException
     * @param name 组名
     * @throws cn.ben.jlibfx.FxException
     */
    @Override
    public void setName(String name) throws FxException {
        throw new FxUnsupportedException(this.getClass().getCanonicalName(),"setName");
    }
}
