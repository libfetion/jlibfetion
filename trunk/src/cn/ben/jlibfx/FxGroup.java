
package cn.ben.jlibfx;

/**
 * 组接口,jLibFx中的好友组和群组必须直接或间接继承本接口
 * @author Ben.Pang
 */
public interface FxGroup {
    /**
     * 注册组消息监听器. 如果 {@link MessageListener listener} 为 null，则不抛出任何异常，且不执行任何操作。
     * @see MessageListener
     * @param listener {@link MessageListener 组消息监听器}
     */
    public void addGroupMsgListener(MessageListener listener);
    /**
     * 移除组消息监听器. 如果 {@link MessageListener 组消息监听器} 为 null，则不抛出任何异常，且不执行任何操作。
     * @see MessageListener
     * @param listener {@link MessageListener 组消息监听器}
     */
    public void removeGroupMsgListener(MessageListener listener);
    /**
     * 返回此组对象注册过的所有监听器的数组
     * @see MessageListener
     * @return {@link MessageListener 组消息监听器}数组
     */
    public MessageListener[] getGroupMsgListener();
    /**
     * 向组里添加新好友. 如果该组中已经存在相同帐户好友或该帐户为本地登录帐户则不执行任何操作
     * @see FxAccount
     * @param account 需要加入组中的 {@link FxAccount Fetion 帐户}
     * @throws cn.ben.jlibfx.FxException
     */
    public void add(FxAccount account) throws FxException;
    /**
     * 返回组中指定索引上的 {@link FxAccount Fetion 帐户}
     * @see FxAccount
     * @param index 组中的索引号
     * @return 返回组中指定索引上的 {@link FxAccount Fetion 帐户}
     * @throws java.lang.IndexOutOfBoundsException 如果索引超出范围 (index < 0 || index >= size())则引发异常
     */
    public FxAccount get(int index) throws IndexOutOfBoundsException;
    /**
     * 从组中删除指定 {@link FxAccount Fetion 帐户},如果不存在该帐户则引发操作异常
     * @param account 将从组中删除的 {@link FxAccount Fetion 帐户}
     * @throws cn.ben.jlibfx.FxException
     */
    public void remove(FxAccount account) throws FxException;
    /**
     * 搜索 {@link FxAccount Fetion 帐户} 在组中的索引编号. 如果该组中不存在该帐户则返回-1
     * @see FxAccount
     * @param account {@link FxAccount Fetion 帐户}
     * @return 该 {@link FxAccount Fetion 帐户} 在组中的索引编号.不存在该帐户则返回-1
     */
    public int indexOf(FxAccount account);
    /**
     * 迭代组中所有 {@link FxAccount Fetion 帐户}
     * @see FxAccount
     * @return 迭代组中所有 {@link FxAccount Fetion 帐户}的迭代器
     */
    public Iterable<FxAccount> iterator();
    /**
     * 返回组中的元素数（其容量).
     * @return 组中的元素数
     */
    public int size();
    /**
     * 返回组名
     * @return 组名
     */
    public String getName();
    /**
     * 设置组名. 如果传入null或empty则不会执行任何操作
     * @param name 组名
     * @throws cn.ben.jlibfx.FxException
     */
    public void setName(String name) throws FxException;
}
