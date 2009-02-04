
package cn.ben.jlibfx;

import java.awt.Image;
import java.sql.Timestamp;

/**
 * FxUserInfo实现类. <b>注:目前所有 setter 方法都将抛出 {@link FxUnsupportedException FxUnsupportedException 异常}</b>
 * @author Ben.Pang
 */
class UserInfoImpl implements FxUserInfo {
    private String fetionNumber;
    private String mobileNumber;
    private String localname;
    private String nickname;
    private String impresa;
    private Gender gender;
    private String nation;
    private String province;
    private String city;
    private Image portrait;
    private String realname;
    private Timestamp birthday;
    private Horoscopes horoscope;
    private BloodType bloodType;
    private String job;
    private String hobby;
    private String personalEMail;
    private String workEMail;
    private String otherEMail;
    private String primaryEMail;
    private String homePhone;
    private String workPhone;
    private String otherPhone;
    private String company;
    private String companyWebSite;
    private int id;

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
        throw new FxUnsupportedException();
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
        throw new FxUnsupportedException();
    }
    /**
     * 返回用户心情短语信息
     * @return 心情短语
     */
    public String getImpresa() {
        return impresa;
    }
    /**
     * 设置用户心情短语信息,如果传入 null 和 empty 都将清除用户心情短信信息
     * @param impresa 心情短语
     * @throws cn.ben.jlibfx.FxException 如果尝试修改非本地帐号的用户信息将引发异常
     */
    public void setImpresa(String impresa) throws FxException {
        throw new FxUnsupportedException();
    }
    /**
     * 返回用户性别信息(枚举)
     * @see Gender
     * @return 性别信息
     */
    public Gender getGender() {
        return gender;
    }
    /**
     * 设置用户性别信息(枚举)
     * @see Gender
     * @param gender 用户性别
     * @throws cn.ben.jlibfx.FxException 如果尝试修改非本地帐号的用户信息将引发异常
     */
    public void setGender(Gender gender) throws FxException {
        throw new FxUnsupportedException();
    }
    /**
     * 返回用户民族信息
     * @return 民族信息
     */
    public String getNation() {
        return nation;
    }
    /**
     * 设置用户民族信息
     * @param nation 民族信息
     * @throws cn.ben.jlibfx.FxException 如果尝试修改非本地帐号的用户信息将引发异常
     */
    public void setNation(String nation) throws FxException {
        throw new FxUnsupportedException();
    }
    /**
     * 返回用户省份信息
     * @return 省份信息
     */
    public String getProvince() {
        return province;
    }
    /**
     * 设置用户省份信息
     * @param prov 省份信息
     * @throws cn.ben.jlibfx.FxException 如果尝试修改非本地帐号的用户信息将引发异常
     */
    public void setProvince(String prov) throws FxException {
        throw new FxUnsupportedException();
    }
    /**
     * 返回用户城市信息
     * @return 城市信息
     */
    public String getCity() {
        return city;
    }
    /**
     * 设置用户城市信息
     * @param city 城市信息
     * @throws cn.ben.jlibfx.FxException 如果尝试修改非本地帐号的用户信息将引发异常
     */
    public void setCity(String city) throws FxException {
        throw new FxUnsupportedException();
    }
    /**
     * 返回用户头像
     * @return 用户头像
     */
    public Image getPortrait() {
        return portrait;
    }
    /**
     * 设置更新用户头像
     * @param image 用户头像
     * @throws cn.ben.jlibfx.FxException 如果尝试修改非本地帐号的用户信息将引发异常
     */
    public void setPortrait(Image image) throws FxException {
        throw new FxUnsupportedException();
    }
    /**
     * 返回用户真实姓名信息,可能返回 null 当用户未设置该信息时
     * @return 用户姓名
     */
    public String getRealname() {
        return realname;
    }
    /**
     * 设置用户真实姓名信息
     * @param name 用户姓名
     * @throws cn.ben.jlibfx.FxException 如果尝试修改非本地帐号的用户信息将引发异常
     */
    public void setRealname(String name) throws FxException {
        throw new FxUnsupportedException();
    }
    /**
     * 返回用户出生日期信息
     * @return 生出日期
     */
    public Timestamp getBirthday() {
        return birthday;
    }
    /**
     * 设置用户出生日期信息
     * @param birthday 出生日期
     * @throws cn.ben.jlibfx.FxException 如果尝试修改非本地帐号的用户信息将引发异常
     */
    public void setBirthday(Timestamp birthday) throws FxException {
        throw new FxUnsupportedException();
    }
    /**
     * 返回用户星座信息
     * @see Horoscopes
     * @return 星座枚举,可能返回 null 当用户未设置该信息时
     */
    public Horoscopes getHoroscope() {
        return horoscope;
    }
    /**
     * 设置用户星座信息
     * @see Horoscopes
     * @param horoscope 星座枚举
     * @throws cn.ben.jlibfx.FxException 如果尝试修改非本地帐号的用户信息将引发异常
     */
    public void setHoroscope(Horoscopes horoscope) throws FxException {
        throw new FxUnsupportedException();
    }
    /**
     * 返回用户血型信息(枚举)
     * @see BloodType
     * @return 用户血型,可能返回 null 当用户未设置该信息时
     */
    public BloodType getBloodType() {
        return bloodType;
    }
    /**
     * 设置用户血型信息
     * @see BloodType
     * @param type 血型枚举
     * @throws cn.ben.jlibfx.FxException 如果尝试修改非本地帐号的用户信息将引发异常
     */
    public void setBloodType(BloodType type) throws FxException {
        throw new FxUnsupportedException();
    }
    /**
     * 返回用户工作(职位)信息
     * @return 工作信息
     */
    public String getJob() {
        return job;
    }
    /**
     * 设置用户工作(职位)信息
     * @param job 工作信息
     * @throws cn.ben.jlibfx.FxException 如果尝试修改非本地帐号的用户信息将引发异常
     */
    public void setJob(String job) throws FxException {
        throw new FxUnsupportedException();
    }
    /**
     * 返回用户业余爱好信息
     * @return 业余爱好
     */
    public String getHobby() {
        return hobby;
    }
    /**
     * 设置用户业余爱好信息
     * @param hobby 业余爱好
     * @throws cn.ben.jlibfx.FxException 如果尝试修改非本地帐号的用户信息将引发异常
     */
    public void setHobby(String hobby) throws FxException {
        throw new FxUnsupportedException();
    }
    /**
     * 返回用户个人邮箱信息
     * @return 个人邮箱
     */
    public String getPersonalEMail() {
        return personalEMail;
    }
    /**
     * 设置用户个人邮箱信息
     * @param email 个人邮箱
     * @throws cn.ben.jlibfx.FxException 如果尝试修改非本地帐号的用户信息或邮箱格式不正确都将引发异常
     */
    public void setPersonalEMail(String email) throws FxException {
        throw new FxUnsupportedException();
    }
    /**
     * 返回用户工作邮箱信息
     * @return 工作邮箱
     */
    public String getWorkEMail() {
        return workEMail;
    }
    /**
     * 设置用户工作邮箱信息
     * @param email 工作邮箱
     * @throws cn.ben.jlibfx.FxException 如果尝试修改非本地帐号的用户信息或邮箱格式不正确都将引发异常
     */
    public void setWorkEMail(String email) throws FxException {
        throw new FxUnsupportedException();
    }
    /**
     * 返回用户其他邮箱信息
     * @return 邮箱
     */
    public String getOtherEMail() {
        return otherEMail;
    }
    /**
     * 设置用户其他邮箱信息
     * @param email 邮箱
     * @throws cn.ben.jlibfx.FxException 如果尝试修改非本地帐号的用户信息或邮箱格式不正确都将引发异常
     */
    public void setOtherEMail(String email) throws FxException {
        throw new FxUnsupportedException();
    }
    /**
     * 返回用户主要邮箱信息
     * @return 主要邮箱
     */
    public String getPrimaryEMail() {
        return primaryEMail;
    }
    /**
     * 设置用户主要邮箱信息
     * @param email 主要邮箱
     * @throws cn.ben.jlibfx.FxException 如果尝试修改非本地帐号的用户信息或邮箱格式不正确都将引发异常
     */
    public void setPrimaryEMail(String email) throws FxException {
        throw new FxUnsupportedException();
    }
    /**
     * 返回用户家庭电话信息
     * @return 家庭电话
     */
    public String getHomePhone() {
        return homePhone;
    }
    /**
     * 设置用户家庭电话号码信息
     * @param number 家庭电话
     * @throws cn.ben.jlibfx.FxException 如果尝试修改非本地帐号的用户信息将引发异常
     */
    public void setHomePhone(String number) throws FxException {
        throw new FxUnsupportedException();
    }
    /**
     * 返回用户工作电话信息
     * @return 工作电话
     */
    public String getWorkPhone() {
        return workPhone;
    }
    /**
     * 设置用户工作电话号码信息
     * @param number 工作电话
     * @throws cn.ben.jlibfx.FxException 如果尝试修改非本地帐号的用户信息将引发异常
     */
    public void setWorkPhone(String number) throws FxException {
        throw new FxUnsupportedException();
    }
    /**
     * 返回用户其他电话信息
     * @return 电话号码
     */
    public String getOtherPhone() {
        return otherPhone;
    }
    /**
     * 设置用户其他电话号码信息
     * @param number 其他电话
     * @throws cn.ben.jlibfx.FxException 如果尝试修改非本地帐号的用户信息将引发异常
     */
    public void setOtherPhone(String number) throws FxException {
        throw new FxUnsupportedException();
    }
    /**
     * 返回用户公司名称信息
     * @return 公司名称
     */
    public String getCompany() {
        return company;
    }
    /**
     * 设置用户公司名称信息
     * @param company 公司名称
     * @throws cn.ben.jlibfx.FxException 如果尝试修改非本地帐号的用户信息将引发异常
     */
    public void setCompany(String company) throws FxException {
        throw new FxUnsupportedException();
    }
    /**
     * 返回用户公司网站信息
     * @return 网站URL
     */
    public String getCompanyWebSite() {
        return companyWebSite;
    }
    /**
     * 设置用户公司网站信息
     * @param site 网站URL
     * @throws cn.ben.jlibfx.FxException 如果尝试修改非本地帐号的用户信息将引发异常
     */
    public void setCompanyWebSite(String site) throws FxException {
        throw new FxUnsupportedException();
    }

}
