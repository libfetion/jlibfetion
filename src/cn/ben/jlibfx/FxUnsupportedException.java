
package cn.ben.jlibfx;

/**
 * jlibfx 是基于 c 库的 "libfetion" 的衍生产品(<a target="_blank" href="http://www.libfetion.cn">点击这里查看 libfetion 网页</a>).<br/>
 * 由于 libfetion 库尚未支持所有的可用操作,在调用一些方法时由于 libfetion 的限制将抛出此异常.
 * @author Ben.Pang
 */
public class FxUnsupportedException extends FxException {
    /**
     * 构造一个新的 FxUnsupportedException 对象, 传入异常说明信息
     * @param message  异常说明信息
     */
    public FxUnsupportedException(String message) {
        super(message);
    }
    /**
     * 构造一个新的 FxUnsupportedException 对象, 定义一定格式的说明信息:
     * "目前 {类名} 不支持方法 {方法名}, 期待后续版本完善"
     * @param name 类名
     * @param method 方法名
     */
    public FxUnsupportedException(String name, String method) {
        super("目前 " + name + " 不支持方法 \"" + method + "\" ,期待后续版本完善");
    }
    /**
     * 构造一个新的 FxUnsupportedException 对象, 传入异常说明信息和 Throwable 对象
     * @param message 异常说明信息
     * @param couse Throwable
     */
    public FxUnsupportedException(String message, Throwable couse) {
        super(message,couse);
    }
}
