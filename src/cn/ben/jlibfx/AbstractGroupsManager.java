
package cn.ben.jlibfx;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 组管理器抽象类,一个简单的 {@link FxGroupsManager} 实现类,实现与底层无关的代码.
 * @author Ben.Pang
 */
public abstract class AbstractGroupsManager implements FxGroupsManager{
    /**
     * 用于存放 {@link FxGroup group} 的Set
     */
    private ArrayList<FxGroup> groups;
    /**
     * 构造一个组管理器,初始化管理器容器
     */
    public AbstractGroupsManager() {
        groups = new ArrayList<FxGroup>();
    }

    /**
     * 添加新组到管理器中. 如果 {@link FxGroup group} 为 null 或已经存在则不抛出任何异常,且不执行任何操作
     * @see FxGroup
     * @param group 将被添加到管理器中的{@link FxGroup}
     * @throws cn.ben.jlibfx.FxException
     */
    public void add(FxGroup group) throws FxException {
        if( group != null && !groups.contains(group) )
            groups.add(group);
    }
    /**
     * 从管理器中移除指定组. 如果 {@link FxGroup group} 为 null 或管理器不存在该组则不抛出任何异常,且不执行任何操作
     * @see FxGroup
     * @param group 将从管理器移除中的{@link FxGroup}
     * @throws cn.ben.jlibfx.FxException
     */
    public void remove(FxGroup group) throws FxException {
        if(group != null)
            groups.remove(group);
    }
    /**
     * 搜索管理器中 {@link FxGroup 指定组} 的索引编号. 如果不存在该组则返回-1
     * @see FxGroup
     * @param group {@link FxGroup}
     * @return 该 {@link FxGroup 组} 在管理器中的索引编号,不存在该组则返回-1.
     */
    public int indexOf(FxGroup group) {
        return groups.indexOf(group);
    }
    /**
     * 返回管理器中指定索引上的 {@link FxGroup}
     * @param index 管理器中的索引号
     * @return 返回管理器中指定索引上的 {@link FxGroup}
     * @throws java.lang.IndexOutOfBoundsException 如果索引超出范围 (index < 0 || index >= size())则引发异常
     */
    public FxGroup get(int index) throws IndexOutOfBoundsException {
        return groups.get(index);
    }
    /**
     * 迭代管理器中所有 {@link FxGroup}
     * @return 迭代管理器中所有 {@link FxGroup} 的迭代器
     */
    public Iterator<FxGroup> iterator() {
        return groups.iterator();
    }
    /**
     * 返回管理器中的元素数（其容量).
     * @return 组中的元素数
     */
    public int size() {
        return groups.size();
    }

}
