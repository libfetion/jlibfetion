
package cn.ben.jlibfx;

import cn.ben.jlibfx.FxAccount.FxStatus;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Java Fetion 实现类
 * @author Ben.Pang
 */
public class JFetion {
    /**
     * 本地帐户引用
     */
    private FxAccount localAccount;
    private ArrayList<ServerMsgListener> listeners;
    private FxGroupsManager buddyGroups;
    private FxGroupsManager groups;
    private FxGroup blackListGroup;

    /**
     * 注册服务器消息监听器. 如果 listener 为 null,则不抛出任何异常且不执行任何操作。
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
        // 建立数组
        ServerMsgListener[] arrays = (ServerMsgListener[]) Array.newInstance(ServerMsgListener.class, listeners.size());
        ServerMsgListener listener = null;
        for ( int i = 0; i<listeners.size(); i++ ) {
            arrays[i] = listeners.get(i);
        }
        return arrays;
    }
    /**
     * 移除服务器消息监听器. 如果 listener 为 null,则不抛出任何异常且不执行任何操作。
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
     * 返回群组管理器
     * @see FxGroupsManager
     * @return 群组管理器
     */
    public FxGroupsManager getGroupsManager() {
        return groups;
    }
    /**
     * 返回黑名单组
     * @return 黑名单组
     */
    public FxGroup getBlackList() {
        return blackListGroup;
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
     * 使用帐号和密码登录Fetion Server
     * @param account {@link FxAccount#getMobileNumber() 手机号} 或 {@link FxAccount#getFetionNumber() Fetion 号}
     * @param password 登录密码
     * @return 登录结果
     */
    public boolean login(String account, String password) {
    }
    /**
     * 使用帐号和密码登录Fetion Server, 并设置成功登录后 {@link FxStatus 状态}
     * @param account {@link FxAccount#getMobileNumber() 手机号} 或 {@link FxAccount#getFetionNumber() Fetion 号}
     * @param password 登录密码
     * @param status 登录后 {@link FxStatus 状态}
     * @return 登录结果
     */
    public boolean login(String account, String password, FxStatus status) {
    }
    /**
     * 注销登陆
     */
    public void logout() {
        
    }
    /**
     * 返回本地账号的 {@link FxUserInfo}
     * @see FxUserInfo
     * @return 本地帐号的 {@link FxUserInfo}
     */
    public FxUserInfo getSelfUserInfo() {
    }
}
