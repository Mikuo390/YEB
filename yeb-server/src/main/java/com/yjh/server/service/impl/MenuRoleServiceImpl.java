package com.yjh.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yjh.server.mapper.MenuRoleMapper;
import com.yjh.server.pojo.Menu;
import com.yjh.server.pojo.MenuRole;
import com.yjh.server.pojo.RespBean;
import com.yjh.server.service.IMenuRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author mikuo
 * @since 2021-12-02
 */
@Service
public class MenuRoleServiceImpl extends ServiceImpl<MenuRoleMapper, MenuRole> implements IMenuRoleService {

    @Autowired
    private MenuRoleMapper menuRoleMapper;

    @Override
    public RespBean updateMenuRole(Integer rid, Integer[] mids) {
        menuRoleMapper.delete(new QueryWrapper<MenuRole>().eq("rid",rid));
        if(null==mids||0==mids.length){
            return RespBean.success("更新成功!");
        }
        Integer result = menuRoleMapper.insertRecord(rid, mids);
        if(result==mids.length){
            return RespBean.success("更新成功!");
        }
        return RespBean.error("更新失败!");
    }
}
