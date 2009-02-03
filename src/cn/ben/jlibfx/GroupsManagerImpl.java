
package cn.ben.jlibfx;

/**
 * 组管理器实现类
 * @author Ben.Pang
 */
class GroupsManagerImpl extends AbstractGroupsManager {
    private FetionImpl fetion;
    
    /**
     * 添加新组到管理器中. 如果 {@link FxGroup group} 为 null 或已经存在则不抛出任何异常,且不执行任何操作
     * @see FxGroup
     * @param group 将被添加到管理器中的{@link FxGroup}
     * @throws cn.ben.jlibfx.FxException
     */
    @Override
    public void add(FxGroup group) throws FxException {
        if( fetion.addGroup(group) )
            super.add(group);
    }
    /**
     * 从管理器中移除指定组. 如果 {@link FxGroup group} 为 null 或管理器不存在该组则不抛出任何异常,且不执行任何操作
     * @see FxGroup
     * @param group 将从管理器移除中的{@link FxGroup}
     * @throws cn.ben.jlibfx.FxException
     */
    @Override
    public void remove(FxGroup group) throws FxException {
        if( fetion.removeGroup(group) )
            super.remove(group);
    }
}
