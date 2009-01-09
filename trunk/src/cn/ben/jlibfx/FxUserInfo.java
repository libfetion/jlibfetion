
package cn.ben.jlibfx;

import java.awt.Image;
import java.sql.Timestamp;

/**
 * Fetion 用户信息接口. <br/>
 * 方法 {@link #getPortrait()} 不是很理解<br/>
 * int  lunar_animal 和 char *  profile 还有 char * job_title 和 int match_enabled() 不清楚参数是用来干什么的
 * @author Ben.Pang
 */
public interface FxUserInfo extends FxAccount {
//    /**
//     * 返回用户昵称,用户昵称为非 null 和非 empty 的字符串
//     * @see #setNickname(java.lang.String)
//     * @return 用户昵称
//     */
//    public String getNickname();
    /**
     * 设置用户昵称信息,用户昵称必须为非 null 和非 empty,否则将不会执行任何操作
     * @param name 用户昵称
     * @throws cn.ben.jlibfx.FxException 如果尝试修改非本地帐号的用户信息将引发异常
     */
    public void setNickname(String name) throws FxException;
    /**
     * 返回用户心情短语信息
     * @return 心情短语
     */
    public String getImpresa();
    /**
     * 设置用户心情短语信息,如果传入 null 和 empty 都将清除用户心情短信信息
     * @param impresa 心情短语
     * @throws cn.ben.jlibfx.FxException 如果尝试修改非本地帐号的用户信息将引发异常
     */
    public void setImpresa(String impresa) throws FxException;
    /**
     * 返回用户性别信息(枚举)
     * @see Gender
     * @return 性别信息
     */
    public Gender getGender();
    /**
     * 设置用户性别信息(枚举)
     * @see Gender
     * @param gender 用户性别
     * @throws cn.ben.jlibfx.FxException 如果尝试修改非本地帐号的用户信息将引发异常
     */
    public void setGender(Gender gender) throws FxException;
    /**
     * 返回用户民族信息
     * @return 民族信息
     */
    public String getNation();
    /**
     * 设置用户民族信息
     * @param nation 民族信息
     * @throws cn.ben.jlibfx.FxException 如果尝试修改非本地帐号的用户信息将引发异常
     */
    public void setNation(String nation) throws FxException;
    /**
     * 返回用户省份信息
     * @return 省份信息
     */
    public String getProvince();
    /**
     * 设置用户省份信息
     * @param prov 省份信息
     * @throws cn.ben.jlibfx.FxException 如果尝试修改非本地帐号的用户信息将引发异常
     */
    public void setProvince(String prov) throws FxException;
    /**
     * 返回用户城市信息
     * @return 城市信息
     */
    public String getCity();
    /**
     * 设置用户城市信息
     * @param city 城市信息
     * @throws cn.ben.jlibfx.FxException 如果尝试修改非本地帐号的用户信息将引发异常
     */
    public void setCity(String city) throws FxException;
    /**
     * 返回用户头像
     * @return 用户头像
     */
    public Image getPortrait();
    /**
     * 设置更新用户头像
     * @param image 用户头像
     * @throws cn.ben.jlibfx.FxException 如果尝试修改非本地帐号的用户信息将引发异常
     */
    public void setPortrait(Image image) throws FxException;
//    /**
//     * 获得用户手机号信息,如果不是本地帐户且对方设置密码手机号选项则返回 null
//     * @return 手机号,如果对方设置密码选择则返回 null
//     */
//    public String getMobileNumber();
    /**
     * 返回用户真实姓名信息,可能返回 null 当用户未设置该信息时
     * @return 用户姓名
     */
    public String getRealname();
    /**
     * 设置用户真实姓名信息
     * @param name 用户姓名
     * @throws cn.ben.jlibfx.FxException 如果尝试修改非本地帐号的用户信息将引发异常
     */
    public void setRealname(String name) throws FxException;
    /**
     * 返回用户出生日期信息
     * @return 生出日期
     */
    public Timestamp getBirthday();
    /**
     * 设置用户出生日期信息
     * @param birthday 出生日期
     * @throws cn.ben.jlibfx.FxException 如果尝试修改非本地帐号的用户信息将引发异常
     */
    public void setBirthday(Timestamp birthday) throws FxException;
    /**
     * 返回用户星座信息
     * @see Horoscopes
     * @return 星座枚举,可能返回 null 当用户未设置该信息时
     */
    public Horoscopes getHoroscope();
    /**
     * 设置用户星座信息
     * @see Horoscopes
     * @param horoscope 星座枚举
     * @throws cn.ben.jlibfx.FxException 如果尝试修改非本地帐号的用户信息将引发异常
     */
    public void setHoroscope(Horoscopes horoscope) throws FxException;
    /**
     * 返回用户血型信息(枚举)
     * @see BloodType
     * @return 用户血型,可能返回 null 当用户未设置该信息时
     */
    public BloodType getBloodType();
    /**
     * 设置用户血型信息
     * @see BloodType
     * @param type 血型枚举
     * @throws cn.ben.jlibfx.FxException 如果尝试修改非本地帐号的用户信息将引发异常
     */
    public void setBloodType(BloodType type) throws FxException;
    /**
     * 返回用户工作(职位)信息
     * @return 工作信息
     */
    public String getJob();
    /**
     * 设置用户工作(职位)信息
     * @param job 工作信息
     * @throws cn.ben.jlibfx.FxException 如果尝试修改非本地帐号的用户信息将引发异常
     */
    public void setJob(String job) throws FxException;
    /**
     * 返回用户业余爱好信息
     * @return 业余爱好
     */
    public String getHobby();
    /**
     * 设置用户业余爱好信息
     * @param hobby 业余爱好
     * @throws cn.ben.jlibfx.FxException 如果尝试修改非本地帐号的用户信息将引发异常
     */
    public void setHobby(String hobby) throws FxException;
    /**
     * 返回用户个人邮箱信息
     * @return 个人邮箱
     */
    public String getPersonalEMail();
    /**
     * 设置用户个人邮箱信息
     * @param email 个人邮箱
     * @throws cn.ben.jlibfx.FxException 如果尝试修改非本地帐号的用户信息或邮箱格式不正确都将引发异常
     */
    public void setPersonalEMail(String email) throws FxException;
    /**
     * 返回用户工作邮箱信息
     * @return 工作邮箱
     */
    public String getWorkEMail();
    /**
     * 设置用户工作邮箱信息
     * @param email 工作邮箱
     * @throws cn.ben.jlibfx.FxException 如果尝试修改非本地帐号的用户信息或邮箱格式不正确都将引发异常
     */
    public void setWorkEMail(String email) throws FxException;
    /**
     * 返回用户其他邮箱信息
     * @return 邮箱
     */
    public String getOtherEMail();
    /**
     * 设置用户其他邮箱信息
     * @param email 邮箱
     * @throws cn.ben.jlibfx.FxException 如果尝试修改非本地帐号的用户信息或邮箱格式不正确都将引发异常
     */
    public void setOtherEMail(String email) throws FxException;
    /**
     * 返回用户主要邮箱信息
     * @return 主要邮箱
     */
    public String getPrimaryEMail();
    /**
     * 设置用户主要邮箱信息
     * @param email 主要邮箱
     * @throws cn.ben.jlibfx.FxException 如果尝试修改非本地帐号的用户信息或邮箱格式不正确都将引发异常
     */
    public void setPrimaryEMail(String email) throws FxException;
    /**
     * 返回用户家庭电话信息
     * @return 家庭电话
     */
    public String getHomePhone();
    /**
     * 设置用户家庭电话号码信息
     * @param number 家庭电话
     * @throws cn.ben.jlibfx.FxException 如果尝试修改非本地帐号的用户信息将引发异常
     */
    public void setHomePhone(String number) throws FxException;
    /**
     * 返回用户工作电话信息
     * @return 工作电话
     */
    public String getWorkPhone();
    /**
     * 设置用户工作电话号码信息
     * @param number 工作电话
     * @throws cn.ben.jlibfx.FxException 如果尝试修改非本地帐号的用户信息将引发异常
     */
    public void setWorkPhone(String number) throws FxException;
    /**
     * 返回用户其他电话信息
     * @return 电话号码
     */
    public String getOtherPhone();
    /**
     * 设置用户其他电话号码信息
     * @param number 其他电话
     * @throws cn.ben.jlibfx.FxException 如果尝试修改非本地帐号的用户信息将引发异常
     */
    public void setOtherPhone(String number) throws FxException;
    /**
     * 返回用户公司名称信息
     * @return 公司名称
     */
    public String getCompany();
    /**
     * 设置用户公司名称信息
     * @param company 公司名称
     * @throws cn.ben.jlibfx.FxException 如果尝试修改非本地帐号的用户信息将引发异常
     */
    public void setCompany(String company) throws FxException;
    /**
     * 返回用户公司网站信息
     * @return 网站URL
     */
    public String getCompanyWebSite();
    /**
     * 设置用户公司网站信息
     * @param site 网站URL
     * @throws cn.ben.jlibfx.FxException 如果尝试修改非本地帐号的用户信息将引发异常
     */
    public void setCompanyWebSite(String site) throws FxException;
    /**
int  match_enabled

     */
    /**
     * 用户性别信息 MALE 为男性用户, FEMALE 为女性用户
     */
    public enum Gender {
        /**
         * 男性
         */
        MALE,
        /**
         * 女性
         */
        FEMALE;
    }
    /**
     * 星座信息枚举
     */
    public enum Horoscopes {
        /**
         * 白羊座
         */
        ARIES,
        /**
         * 金牛座
         */
        TAURUS,
        /**
         *  双子宫
         */
        GEMINI,
        /**
         * 巨蟹座
         */
        CANCER,
        /**
         * 狮子座
         */
        LEO,
        /**
         * 处女座
         */
        VIRGO,
        /**
         * 天秤座
         */
        LIBRA,
        /**
         * 天蝎座
         */
        SCORPIO,
        /**
         * 人马座
         */
        SAGITTARIUS,
        /**
         * 摩羯宫
         */
        CAPRICORN,
        /**
         * 水瓶座
         */
        AQUARIUS,
        /**
         * 双鱼座
         */
        PISCES;
    }
    /**
     * 血型信息
     */
    public enum BloodType {
        A,
        B,
        AB,
        O,
        OTHER;
    }
}
