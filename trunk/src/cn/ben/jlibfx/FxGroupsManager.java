
package cn.ben.jlibfx;

import java.util.Iterator;

/**
 * 组管理器接口,用于管理组,如:添加、删除、迭代组等操作
 * @author Ben.Pang
 */
public interface FxGroupsManager {
    /**
     * 添加新组到管理器中. 如果 {@link FxGroup group} 为 null 则不抛出任何异常,且不执行任何操作
     * @see FxGroup
     * @param group 将被添加到管理器中的{@link FxGroup}
     * @throws cn.ben.jlibfx.FxException
     */
    public void add(FxGroup group) throws FxException;
    /**
     * 从管理器中移除指定组. 如果 {@link FxGroup group} 为 null 则不抛出任何异常,且不执行任何操作
     * @see FxGroup
     * @param group 将从管理器移除中的{@link FxGroup}
     * @throws cn.ben.jlibfx.FxException
     */
    public void remove(FxGroup group) throws FxException;
    /**
     * 搜索管理器中 {@link FxGroup 指定组} 的索引编号. 如果不存在该组则返回-1.
     * @see FxGroup
     * @param group {@link FxGroup}
     * @return 该 {@link FxGroup 组} 在管理器中的索引编号,不存在该组则返回-1.
     */
    public int indexOf(FxGroup group);
    /**
     * 返回管理器中指定索引上的 {@link FxGroup}
     * @param index 管理器中的索引号
     * @return 返回管理器中指定索引上的 {@link FxGroup}
     * @throws java.lang.IndexOutOfBoundsException 如果索引超出范围 (index < 0 || index >= size())则引发异常
     */
    public FxGroup get(int index) throws IndexOutOfBoundsException;
    /**
     * 迭代管理器中所有 {@link FxGroup}
     * @return 迭代管理器中所有 {@link FxGroup} 的迭代器
     */
    public Iterator<FxGroup> iterator();
    /**
     * 返回管理器中的元素数（其容量).
     * @return 组中的元素数
     */
    public int size();
}
