

package cn.ben.jlibfx;

import cn.ben.jlibfx.FxAccount.FxStatus;

/**
 * Fetion Client 对象接口
 * @author Ben.Pang
 */
public interface FxFetion {
    /**
     * 注册服务器消息监听器. 如果 listener 为 null,则不抛出任何异常且不执行任何操作。
     * @see ServerMsgListener
     * @param listener 消息监听器
     */
    public void addServerMsgListener(ServerMsgListener listener);
    /**
     * 返回黑名单组
     * @return 黑名单组
     */
    public FxGroup getBlackList();
    /**
     * 返回好友组管理器
     * @see FxGroupsManager
     * @return 好友组管理器
     */
    public FxGroupsManager getBuddyGroupsManager();
    /**
     * 返回群组管理器
     * @see FxGroupsManager
     * @return 群组管理器
     */
    public FxGroupsManager getGroupsManager();
    /**
     * 返回已经注册的服务器消息监听器数组. 如果尚未注册任何监听器则返回空数组.
     * @see ServerMsgListener
     * @return 监听器数组
     */
    public ServerMsgListener[] getServerMsgListeners();
    /**
     * 返回本地账户的状态信息
     * @see FxStatus
     * @return 帐户状态信息,枚举{@link FxStatus 帐户状态}
     */
    public FxStatus getStatus();
    /**
     * 移除服务器消息监听器. 如果 listener 为 null,则不抛出任何异常且不执行任何操作。
     * @see ServerMsgListener
     * @param listener 将被移除的服务器消息监听器
     */
    public void removeServerMsgListener(ServerMsgListener listener);
    /**
     * 设置该帐户的状态信息
     * @param status 帐户状态信息,枚举 {@link FxStatus 帐户状态}
     * @see FxStatus
     * @throws cn.ben.jlibfx.FxException
     */
    public void setStatus(FxStatus status) throws FxException;
    /**
     * 返回指定账户的 {@link FxUserInfo 用户信息}
     * @see FxAccount
     * @see FxUserInfo
     * @param account {@link FxAccount 用户帐户}, 非本地帐户
     * @return {@link FxUserInfo 用户信息}
     */
    public FxUserInfo getUserInfo(FxAccount account) throws FxException;
    /**
     * 返回本地帐户的 {@link FxUserInfo 用户信息}
     * @see FxUserInfo
     * @return 用户信息
     */
    public FxUserInfo getSelfUserInfo();
    /**
     * 使用帐号和密码登录 Fetion Server
     * @param number 手机号或 Fetion号
     * @param password 帐户密码
     * @throws cn.ben.jlibfx.FxException
     */
    public void login(String number, String password) throws FxException;
    /**
     * 使用帐号和密码登录 Fetion Server, 并设置登录后的 {@link FxStatus 状态}
     * @param number 手机号或 Fetion号
     * @param password 帐户密码
     * @param status 登录后的 {@link FxStatus 状态}
     * @throws cn.ben.jlibfx.FxException
     */
    public void login(String number, String password, FxStatus status) throws FxException;
    /**
     * 登出(注销) Fetion Server
     */
    public void logout() throws FxException;
}
