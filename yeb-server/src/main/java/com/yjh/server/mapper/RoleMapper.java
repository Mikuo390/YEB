package com.yjh.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yjh.server.pojo.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author mikuo
 * @since 2021-12-02
 */
@Mapper
public interface RoleMapper extends BaseMapper<Role> {
    /**
     * 根据用户id查询角色列表
     * @param adminId
     * @return
     */
    List<Role> getRoles(Integer adminId);
}
