
package cn.ben.jlibfx;

/**
 * jlibfx 是基于 c 库的 "libfetion" 的衍生产品(<a target="_blank" href="http://www.libfetion.cn">点击这里查看 libfetion 网页</a>).<br/>
 * 由于 libfetion 库尚未支持所有的可用操作,在调用一些方法时由于 libfetion 的限制将抛出此异常.
 * @author Ben.Pang
 */
public class FxUnsupportedException extends FxException {
    /**
     * 构造一个新的 FxUnsupportedException 对象, 由于 libfetion 库的限制,有可能抛出此异常
     */
    public FxUnsupportedException() {
        super();
    }
    /**
     * 构造一个新的 FxUnsupportedException 对象, 传入异常说明信息
     * @param message  异常说明信息
     */
    public FxUnsupportedException(String message) {
        super(message);
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
