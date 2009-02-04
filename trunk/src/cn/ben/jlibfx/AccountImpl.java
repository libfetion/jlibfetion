
package cn.ben.jlibfx;

/**
 * Fetion用户帐户信息,实现 {@link FxAccount FxAccount 接口}
 * @author Ben.Pang
 */
class AccountImpl implements FxAccount {
    private int id;
    private String fetionNumber;
    private String mobileNumber;
    private String localname;
    private String nickname;
    private FxStatus status;
    private String terminal;
    private FetionImpl fetion;

    /**
     * 账户ID,只用于本地标识不同的用户,不同的帐户使用不同的帐户ID
     * @return 帐户ID
     */
    int getId() {
        return id;
    }
    /**
     * 账户ID,只用于本地标识不同的用户,不同的帐户使用不同的帐户ID
     * @param 帐户ID
     */
    void setId(int id) {
        this.id = id;
    }
    /**
     * 返回Fetion号. 如无 Fetion 号(尚未注册 Fetion 业务)则可以选择使用 {@link #getMobileNumber() 手机号码} 进行联系
     * @see #getMobileNumber()
     * @return 返回该账户的 Fetion 号,如果该帐户未开通 Fetion 业务则返回null
     */
    public String getFetionNumber() {
        return fetionNumber;
    }
    /**
     * 设置 Fetion 号. 如尚未注册 Fetion 业务则没有 Fetion 号
     * @param 设置该账户的 Fetion 号,由 jlibfx 调用
     */
    void setFetionNumber(String fetionNumber) {
        this.fetionNumber = fetionNumber;
    }
    /**
     * 返回帐户手机号. 如帐号设置保密手机号则可以选择使用 {@link #getFetionNumber() Fetion号} 进行联系
     * @see #getFetionNumber()
     * @return 返回该账户的移动手机号,如果该账户设置保密手机号则返回 null
     */
    public String getMobileNumber() {
        return mobileNumber;
    }
    /**
     * 设置帐户手机号. 如帐号设置保密手机号则可以选择使用 {@link #getFetionNumber() Fetion号} 进行联系
     * @see #getFetionNumber()
     * @return 设置该账户的移动手机号, 由 jlibfx 调用
     */
    void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    /**
     * 返回账户本地屏显名,如果未设置本地屏显名则返回好友 {@link #getNickname() 昵称}
     * @see #setLocalname(String)
     * @return 返回该帐户的本地屏显名,默认返回好友 {@link #getNickname() 昵称}
     */
    public String getLocalname() {
        return localname == null ? nickname : localname;
    }
    /**
     * 为该账户设置本地屏显名,如果传入 null 或 empty 则不执行任何操作
     * @see #getLocalname()
     * @param name 设置该帐户的本地屏显名
     * @throws cn.ben.jlibfx.FxException
     */
    public void setLocalname(String localname) throws FxException {
        if (localname != null && !localname.isEmpty())
            fetion.setLocalname(this, localname);
            this.localname = localname;
    }
    /**
     * 返回该帐户的用户昵称
     * @see #getLocalname()
     * @return 返回该帐户的用户昵称
     */
    public String getNickname() {
        return nickname;
    }
    /**
     * 设置该帐户的用户昵称
     * @param nickname 用户昵称
     */
    public void setNickname(String nickname) throws FxException {
        this.nickname = nickname;
    }
    /**
     * 返回该账户的状态信息
     * @see FxStatus
     * @return 帐户状态信息,枚举{@link FxStatus 帐户状态}
     */
    public FxStatus getStatus() {
        return status;
    }
    /**
     * 设置该帐户的状态信息,如果传入 null 则不执行任何操作
     * @param status 帐户状态信息,枚举 {@link FxStatus 帐户状态}
     * @see FxStatus
     * @throws cn.ben.jlibfx.FxException
     */
    public void setStatus(FxStatus status) throws FxException {
        if (status != null)
            fetion.setStatus(this,status);
            this.status = status;
    }
    /**
     * 返回该帐户的终端类型<br/>
     * (尚未知道 libfetion 的实现和状态获取方式,使用 enum 应该更为合适)
     * @return 返回该帐户的终端类型
     */
    public String getTerminal() {
        return terminal;
    }
    /**
     * 设置该帐户的终端类型,由 jlibfx 调用<br/>
     * (尚未知道 libfetion 的实现和状态获取方式,使用 enum 应该更为合适)
     * @return 返回该帐户的终端类型
     */
    void setTerminal(String terminal) {
        this.terminal = terminal;
    }
}
