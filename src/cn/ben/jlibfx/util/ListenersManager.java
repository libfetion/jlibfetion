
package cn.ben.jlibfx.util;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * 监听器注册器,用于管理监听器注册、删除和管理. 用于管理 jlibfx 里的所有监听器,写此工具类的目的只为了代码重用, jlibfx 专用.
 * @author Ben.Pang
 */
public class ListenersManager<T> {
    private ArrayList<T> listeners;         // 监听器容器
    /**
     * 注册服务器消息监听器. 如果 listener 为 null,则不抛出任何异常且不执行任何操作.
     * @param listener 消息监听器
     */
    public synchronized void addListener(T listener) {
        if( listener != null && !listeners.contains(listener) )
            listeners.add(listener);
    }
    /**
     * 返回已经注册的服务器消息监听器数组. 如果尚未注册任何监听器则返回空数组.
     * @return 监听器数组
     */
    public synchronized T[] getListeners(Class<T> listenerType) {
        if (listenerType == null) {
            throw new NullPointerException ("Listener type should not be null");
        }
        
        // 建立空数组
        T[] arrays = (T[]) Array.newInstance(listenerType, listeners.size());
        for ( int i = 0; i<listeners.size(); i++ ) {
            arrays[i] = listeners.get(i);
        }
        
        return arrays;
    }
    /**
     * 移除服务器消息监听器. 如果 listener 为 null,则不抛出任何异常且不执行任何操作.
     * @param listener 将被移除的服务器消息监听器
     */
    public synchronized void removeListener(T listener) {
        if( listener != null )
            listeners.remove(listener);
    }
    /**
     * 判断管理器中是否已经注册该监听器. 已经注册过该监听器则返回 true,否则返回 false
     * @param listener 监听器
     * @return 已经注册过该监听器则返回 true,否则返回 false
     */
    public synchronized boolean contains(T listener) {
        return listeners.contains(listener);
    }
    /**
     * 返回管理器中注册的所有监听器的数量
     * @return 注册的监听器的数量
     */
    public int size() {
        return listeners.size();
    }
}
