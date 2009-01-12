
package cn.ben.jlibfx;

import cn.ben.jlibfx.FxAccount.FxStatus;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Java Fetion 实现类
 * @author Ben.Pang
 */
public abstract class AbstractFetion implements FxFetion {
    private FxAccount localAccount;                       // 本地帐户
    protected ArrayList<ServerMsgListener> listeners;     // 服务器消息监听器
    private FxGroupsManager buddyGroups;                  // 好友组管理器
    private FxGroupsManager groups;                       // 群组管理器
    private FxGroup blackListGroup;                       // 黑名单

    /**
     * 注册服务器消息监听器. 如果 listener 为 null,则不抛出任何异常且不执行任何操作.
     * @see ServerMsgListener
     * @param listener 消息监听器
     */
    public synchronized void addServerMsgListener(ServerMsgListener listener) {
        if( listener != null && !listeners.contains(listener) )
            listeners.add(listener);
    }
    /**
     * 返回已经注册的服务器消息监听器数组. 如果尚未注册任何监听器则返回空数组.
     * @see ServerMsgListener
     * @return 监听器数组
     */
    public synchronized ServerMsgListener[] getServerMsgListeners() {
        // 建立空数组
        ServerMsgListener[] arrays = (ServerMsgListener[]) Array.newInstance(ServerMsgListener.class, listeners.size());
        for ( int i = 0; i<listeners.size(); i++ ) {
            arrays[i] = listeners.get(i);
        }
        return arrays;
    }
    /**
     * 移除服务器消息监听器. 如果 listener 为 null,则不抛出任何异常且不执行任何操作.
     * @see ServerMsgListener
     * @param listener 将被移除的服务器消息监听器
     */
    public synchronized void removeServerMsgListener(ServerMsgListener listener) {
        if( listener != null )
            listeners.remove(listener);
    }
    /**
     * 返回好友组管理器
     * @see FxGroupsManager
     * @return 好友组管理器
     */
    public FxGroupsManager getBuddyGroupsManager() {
        return buddyGroups;
    }
    /**
     * 设置好友组管理器
     * @see FxGroupsManager
     * @param groups 好友组管理器
     */
    void setBuddyGroupsManager(FxGroupsManager groups) {
        this.buddyGroups = groups;
    }
    /**
     * 返回群组管理器
     * @see FxGroupsManager
     * @return 群组管理器
     */
    public FxGroupsManager getGroupsManager() {
        return groups;
    }
    /**
     * 设置群组管理器
     * @see FxGroupsManager
     * @param groups 群组管理器
     */
    void setGroupsManager(FxGroupsManager groups) {
        this.groups = groups;
    }
    /**
     * 返回黑名单组
     * @return 黑名单组
     */
    public FxGroup getBlackList() {
        return blackListGroup;
    }
    /**
     * 设置黑名单组
     * @see FxGroupsManager
     * @param groups 黑名单组
     */
    void setBlackList(FxGroup group) {
        this.blackListGroup = group;
    }
    /**
     * 返回本地账户的状态信息
     * @see FxStatus
     * @return 帐户状态信息,枚举{@link FxStatus 帐户状态}
     */
    public FxStatus getStatus() {
        return localAccount.getStatus();
    }
    /**
     * 设置该帐户的状态信息
     * @param status 帐户状态信息,枚举 {@link FxStatus 帐户状态}
     * @see FxStatus
     * @throws cn.ben.jlibfx.FxException
     */
    public void setStatus(FxStatus status) throws FxException {
        localAccount.setStatus(status);
    }
    /**
     * 开启一个新的 {@link FxDialog 即时信息对话}
     * @see FxDialog
     * @param account {@link FxDialog 即时信息对话}
     * @return {@link FxDialog 即时信息对话}
     * @throws cn.ben.jlibfx.FxException
     */
    abstract FxDialog beginDialog(FxAccount account) throws FxException;
    /**
     * 开启一个新的 {@link FxDialog 组即时信息对话}
     * @see FxDialog
     * @param group {@link FxDialog 组即时信息对话}
     * @return {@link FxDialog 组即时信息对话}
     * @throws cn.ben.jlibfx.FxException
     */
    abstract FxDialog beginDialog(FxGroup group) throws FxException;
    /**
     *  结束 {@link FxDialog 即时信息对话}
     * @param dialog {@link FxDialog 组即时信息对话}
     * @throws cn.ben.jlibfx.FxException
     */
    abstract void endDialog(FxDialog dialog) throws FxException;
}
