package com.yjh.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yjh.server.pojo.MenuRole;
import com.yjh.server.pojo.RespBean;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author mikuo
 * @since 2021-12-02
 */
public interface IMenuRoleService extends IService<MenuRole> {

    /**
     * 更新角色菜单
     * @param rid
     * @param mids
     * @return
     */
    RespBean updateMenuRole(Integer rid, Integer[] mids);
}
