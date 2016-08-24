package org.wxm.core.base.service;

import java.util.List;
import java.util.Map;

/**
 * <b>标题: </b> Service层接口<br/>
 * <b>描述: </b> <br/>
 * <b>版本: </b>V1.0 <br/>
 * <b>作者: </b>Cybele 398600198@qq.com <br/>
 * <b>时间: </b>2015-2-8 下午12:05:11 <br/>
 * <b>修改记录: </b>
 */
public interface IService<T, V> {
    /**
     * 
     * <b>标题: </b>添加记录 <br/>
     * <b>描述: </b> <br/>
     * <b>版本: </b>V1.0 <br/>
     * <b>作者: </b>Cybele 398600198@qq.com <br/>
     * <b>时间: </b>2015-2-7 下午9:55:02 <br/>
     * <b>修改记录: </b>
     * 
     * @param POJO对象
     * @return 返回操作数
     */
    public int save(T t);

    /**
     * 
     * <b>标题: </b>更新记录 <br/>
     * <b>描述: </b> <br/>
     * <b>版本: </b>V1.0 <br/>
     * <b>作者: </b>Cybele 398600198@qq.com <br/>
     * <b>时间: </b>2015-2-7 下午9:55:31 <br/>
     * <b>修改记录: </b>
     * 
     * @param POJO对象
     * @return 返回操作数
     */
    public int update(T t);

    /**
     * 
     * <b>标题: </b>删除记录 <br/>
     * <b>描述: </b>逻辑删除 <br/>
     * <b>版本: </b>V1.0 <br/>
     * <b>作者: </b>吴晓敏 15109870670@139.com <br/>
     * <b>时间: </b>2016-7-13 下午11:26:20 <br/>
     * <b>修改记录: </b>
     * 
     * @param ids
     * @return 返回操作数
     */
    public int delete(List<Long> ids);

    /**
     * 
     * <b>标题: </b>删除记录 <br/>
     * <b>描述: </b>永久删除 <br/>
     * <b>版本: </b>V1.0 <br/>
     * <b>作者: </b>Cybele 398600198@qq.com <br/>
     * <b>时间: </b>2015-2-7 下午9:56:07 <br/>
     * <b>修改记录: </b>
     * 
     * @param ids
     * @return 返回操作数
     */
    public int remove(List<Long> ids);

    /**
     * 
     * <b>标题: </b>查询记录数 <br/>
     * <b>描述: </b> <br/>
     * <b>版本: </b>V1.0 <br/>
     * <b>作者: </b>Cybele 398600198@qq.com <br/>
     * <b>时间: </b>2015-2-7 下午9:56:39 <br/>
     * <b>修改记录: </b>
     * 
     * @return
     */
    public int count(Map<String, Object> params);

    /**
     * 
     * <b>标题: </b>根据ID查询信息 <br/>
     * <b>描述: </b> <br/>
     * <b>版本: </b>V1.0 <br/>
     * <b>作者: </b>Cybele 398600198@qq.com <br/>
     * <b>时间: </b>2015-10-1 下午1:43:52 <br/>
     * <b>修改记录: </b>
     * 
     * @param id
     * @return 返回POJO对象
     */
    public T findById(Long id);

    /**
     * 
     * <b>标题: </b>根据ID查询信息 <br/>
     * <b>描述: </b> <br/>
     * <b>版本: </b>V1.0 <br/>
     * <b>作者: </b>Cybele 398600198@qq.com <br/>
     * <b>时间: </b>2015-10-1 下午1:43:52 <br/>
     * <b>修改记录: </b>
     * 
     * @param id
     * @return 返回VIEW对象
     */
    public V findVById(Long id);

    /**
     * 
     * <b>标题: </b>根据条件查询信息 <br/>
     * <b>描述: </b> <br/>
     * <b>版本: </b>V1.0 <br/>
     * <b>作者: </b>Cybele 398600198@qq.com <br/>
     * <b>时间: </b>2015-9-3 下午10:04:00 <br/>
     * <b>修改记录: </b>
     * 
     * @param params
     *            查询条件
     * @return
     */
    public List<V> findVByCriteria(Map<String, Object> params);
}
