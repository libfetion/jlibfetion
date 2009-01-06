
package cn.ben.jlibfx;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 管理组抽象类,实现部分接口方法
 * @author Ben.Pang
 */
public abstract class AbstractGroup implements FxGroup {
    /** accounts list */
    protected ArrayList<FxAccount> accounts;
    /** 组名 */
    protected String name;
    
    /**
     * 传入组名并构造一个新组
     * @param name 组名
     */
    public AbstractGroup(String name) {
        this.name = name;
        accounts = new ArrayList<FxAccount>();
    }
    /**
     * 向组里添加新好友. 如果传入 null 或该组中已经存在相同帐户好友则不执行任何操作
     * @see FxAccount
     * @param account 需要加入组中的 {@link FxAccount Fetion 帐户}
     * @throws cn.ben.jlibfx.FxException
     */
    public void add(FxAccount account) throws FxException {
        if( accounts != null && !accounts.contains(account) )
            accounts.add(account);
    }
    /**
     * 返回组中指定索引上的 {@link FxAccount Fetion 帐户}
     * @see FxAccount
     * @param index 组中的索引号
     * @return 返回组中指定索引上的 {@link FxAccount Fetion 帐户}
     * @throws java.lang.IndexOutOfBoundsException 如果索引超出范围 (index < 0 || index >= size())则引发异常
     */
    public FxAccount get(int index) throws IndexOutOfBoundsException {
        return accounts.get(index);
    }
    /**
     * 从组中删除指定 {@link FxAccount Fetion 帐户}
     * @param account 将从组中删除的 {@link FxAccount Fetion 帐户}
     * @throws cn.ben.jlibfx.FxException
     */
    public void remove(FxAccount account) throws FxException {
        accounts.remove(account);
    }
    /**
     * 搜索 {@link FxAccount Fetion 帐户} 在组中的索引编号. 如果该组中不存在该帐户则返回-1
     * @see FxAccount
     * @param account {@link FxAccount Fetion 帐户}
     * @return 该 {@link FxAccount Fetion 帐户} 在组中的索引编号.不存在该帐户则返回-1
     */
    public int indexOf(FxAccount account) {
        return accounts.indexOf(account);
    }
    /**
     * 迭代组中所有 {@link FxAccount Fetion 帐户}
     * @see FxAccount
     * @return 迭代组中所有 {@link FxAccount Fetion 帐户}的迭代器
     */
    public Iterator<FxAccount> iterator() {
        return accounts.iterator();
    }
    /**
     * 返回组中的元素数（其容量).
     * @return 组中的元素数
     */
    public int size() {
        return accounts.size();
    }
    /**
     * 返回组名
     * @return 组名
     */
    public String getName() {
        return name;
    }
    /**
     * 设置组名. 如果传入null或empty则不会执行任何操作
     * @param name 组名
     * @throws cn.ben.jlibfx.FxException
     */
    public void setName(String name) throws FxException {
        this.name = name;
    }
}
