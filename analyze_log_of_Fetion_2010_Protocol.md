# Fetion PC 2010 Protocol Analyze log #

It seams that Fetion 2010 has change the protocol about authentication.

# Details #

  * URL has been changed;
  * The method of Password encrypt has been changed;

## Flow ##
  * 获取证书
    1. http://SVRIntl-aia.verisign.com/SVRIntl-aia.cer
> > Header Parameters：
> > |Name|Value|
|:---|:----|
> > |User-Agent|Microsoft-CryptoAPI/5.131.3790.3959|
> > |Connection|Keep-Alive|
> > 这步获取证书就可以导入了，www.verisign.com提供的
  * 证书验证
    1. https://nav.fetion.com.cn/nav/tc.aspx ##
> > 这是验证的SSL，一般没证书是会跑错的。我是直接跳过去了，因为不想导；
  * 获取系统配置信息
    1. http://nav.fetion.com.cn/nav/getsystemconfig.aspx
> > Header Parameters：
> > |Name|Value|
> > |User-Agent|IIC2.0/PC 3.6.1900|
> > 另外push一个xml，里面就是手机号码，版本信息等
```
<config>
	<user mobile-no="135337***43" />
	<client type="PC" version="3.6.1900" platform="W5.2" />
	<servers version="0" />
	<service-no version="0" />
	<parameters version="0" />
	<hints version="0" />
	<http-applications version="0" />
	<client-config version="0" />
	<services version="0" />
</config>

```
> > 响应一卡车东西，我没怎么看，应该都是一些地址，告诉client要做傻事情，先查地址表吧
  * 登录
    1. https://uid.fetion.com.cn/ssiportal/SSIAppSignInV4.aspx
> > 这个也是HTTPS，但我没用证书，也可以访问，只是里面的参数我暂时还不知道怎么去生成
> > Query Parameters：
> > |Name|Value|
> > |mobileno|手机号码|
> > |domains|fetion.com.cn;m161.com.cn;www.ikuwa.cn|
> > |v4digest-type|1 |
> > |v4digest|79001××3AF30××EA057F××6E151F7C××ABB611EB|
> > v4digest应该是加密了的密码，（下班回去对一下libfetion的算法才知道是不是彻底的改了， God bless me！）
> > 找到一个巨牛X的blog，写了[《飞信2010登录协议分析》](http://basiccoder.com/fetion2010-login-protocol.html)，但我还不明白，上班了，无心思ing...



> 想想，这个不是一天两天的事情，算了，“长命工长命做”！