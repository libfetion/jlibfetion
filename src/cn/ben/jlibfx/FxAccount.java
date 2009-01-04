package cn.ben.jlibfx;

/**
 * Fetion用户帐户信息接口
 * @author Ben.Pang
 */
public interface FxAccount {
    /**
     * 返回Fetion号. 如无 Fetion 号(尚未注册 Fetion 业务)则可以选择使用 {@link #getMobileNumber() 手机号码} 进行联系
     * @see #getMobileNumber()
     * @return 返回该账户的 Fetion 号,如果该帐户未开通 Fetion 业务则返回null
     */
    public String getFetionNumber();
    /**
     * 返回帐户手机号. 如帐号设置保密手机号则可以选择使用 {@link #getFetionNumber() Fetion号} 进行联系
     * @see #getFetionNumber()
     * @return 返回该账户的移动手机号,如果该账户设置保密手机号则返回 null
     */
    public String getMobileNumber();
    /**
     * 返回账户本地屏显名
     * @see #setLocalname(String)
     * @return 返回该帐户的本地屏显名,默认返回用户 {@link #getNickname() 昵称}
     */
    public String getLocalname();
    /**
     * 为该账户设置本地屏显名
     * @see #getLocalname()
     * @param name 设置该帐户的本地屏显名
     * @throws cn.ben.jlibfx.FxException
     */
    public void setLocalname(String name) throws FxException;
    /**
     * 返回该帐户的用户昵称
     * @see #getLocalname()
     * @return 返回该帐户的用户昵称
     */
    public String getNickname();
    /**
     * 返回该账户的状态信息
     * @see FxStatus
     * @return 帐户状态信息,枚举{@link FxStatus 帐户状态}
     */
    public FxStatus getStatus();
    /**
     * 设置该帐户的状态信息
     * @param status 帐户状态信息,枚举 {@link FxStatus 帐户状态}
     * @see FxStatus
     * @throws cn.ben.jlibfx.FxException
     */
    public void setStatus(FxStatus status) throws FxException;
    /**
     * 返回该帐户的终端类型<br/>
     * (尚未知道 libfetion 的实现和状态获取方式,使用 enum 应该更为合适)
     * @return 返回该帐户的终端类型
     */
    public String getTerminal();

    /**
     * 帐户状态信息(有些libfetion里的参数尚不了解,待解决)<br/>
     * 问题:<br/>
     * 1.UNSET状态是什么意思?什么时候会有这个状态<br/>
     * 2.FX_STATUS_MOBILE是说明用户的终端类型吗?<br/>
     * 3.FX_STATUS_REFUSE和FX_STATUS_NUM_PRIMITIVES分别是什么意思?<br/>
     * 4.FX_STATUS_EXTENDED_AWAY是自定义离开信息是吗?<br/>
     * 5.FX_STATUS_BLACK是说明该帐户已经被加入黑名单了吗?
     */
    public enum FxStatus {
        /** 等待用户认证 */
        UNAUTH,
        /** 繁忙状态 */
        BUSY,
        /** 隐身状态,对好友为显示为 {@link #OFFLINE 不在线状态} */
        HIDDEN,
        /** 离开状态 */
        LEAVE,
        /** 电话中 */
        PHONING,
        /** 会议中 */
        MEETING,
        /** 就餐中 */
        DINNING,
        /** 不在线,如果好友 {@link #HIDDEN 隐身},也会显示为不在线 */
        OFFLINE,
        /** 在线状态 */
        ONLINE,
        /** 自定义状态 */
        CUSTOM;
    }
}
