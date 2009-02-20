
package cn.ben.jlibfx;

import cn.ben.jlibfx.FxAccount.FxStatus;

/**
 * jlibfx 客户端
 * @author Ben.Pang
 */
class FetionImpl extends AbstractFetion {
    /**
     * 返回指定账户的 {@link FxUserInfo 用户信息}
     * @see FxAccount
     * @see FxUserInfo
     * @param account {@link FxAccount 用户帐户}, 非本地帐户
     * @return {@link FxUserInfo 用户信息}
     */
    public FxUserInfo getUserInfo(FxAccount account) throws FxException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    /**
     * 返回本地帐户的 {@link FxUserInfo 用户信息}
     * @see FxUserInfo
     * @return 用户信息
     */
    public FxUserInfo getSelfUserInfo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    /**
     * 使用帐号和密码登录 Fetion Server
     * @param number 手机号或 Fetion号
     * @param password 帐户密码
     * @throws cn.ben.jlibfx.FxException
     */
    public void login(String number, String password) throws FxException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    /**
     * 使用帐号和密码登录 Fetion Server, 并设置登录后的 {@link FxStatus 状态}
     * @param number 手机号或 Fetion号
     * @param password 帐户密码
     * @param status 登录后的 {@link FxStatus 状态}
     * @throws cn.ben.jlibfx.FxException
     */
    public void login(String number, String password, FxStatus status) throws FxException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    /**
     * 登出(注销) Fetion Server
     */
    public void logout() throws FxException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    /**
     * 开启一个新的 {@link FxDialog 即时信息对话}
     * @see FxDialog
     * @see FxAccount
     * @param account {@link FxAccount 好友帐户}
     * @return {@link FxDialog 即时信息对话}
     * @throws cn.ben.jlibfx.FxException
     */
    public FxDialog beginDialog(FxAccount account) throws FxException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    /**
     * 开启一个新的 {@link FxDialog 即时信息对话}
     * @see FxDialog
     * @see FxAccount
     * @param accounts {@link FxAccount 好友帐户} 数组
     * @return {@link FxDialog 即时信息对话}
     * @throws cn.ben.jlibfx.FxException
     */
    public FxDialog beginDialog(FxAccount[] accounts) throws FxException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
     /**
     * 开启一个新的 {@link FxDialog 组即时信息对话}
     * @see FxDialog
     * @param group {@link FxGroup 好友组}
     * @return {@link FxDialog 组即时信息对话}
     * @throws cn.ben.jlibfx.FxException
     */
    public FxDialog beginDialog(FxGroup group) throws FxException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    /**
     * 结束 {@link FxDialog 即时信息对话}
     * @param dialog {@link FxDialog 组即时信息对话}
     * @throws cn.ben.jlibfx.FxException
     */
    public void endDialog(FxDialog dialog) throws FxException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    boolean addBuddyToGroup(GroupImpl group, FxAccount account) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    boolean addGroup(FxGroup group) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    boolean removeBuddyToGroup(GroupImpl aThis, FxAccount account) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    boolean removeGroup(FxGroup group) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    void send(FxMessage msg) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    void sendSMS(FxMessage msg) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    void setLocalname(AccountImpl aThis, String localname) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    void setStatus(AccountImpl aThis, FxStatus status) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

}
