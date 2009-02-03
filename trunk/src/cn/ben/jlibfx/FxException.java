
package cn.ben.jlibfx;

/**
 * 抽象类, jLibFx 的所有异常类基类
 * @author Ben.Pang
 */
public abstract class FxException extends Exception {
    /**
     * 传入异常说明信息
     * @param message  异常说明信息
     */
    public FxException(String message) {
        super(message);
    }
    /**
     * 传入异常说明信息和 Throwable 对象
     * @param message 异常说明信息
     * @param couse Throwable
     */
    public FxException(String message, Throwable couse) {
        super(message,couse);
    }
}
