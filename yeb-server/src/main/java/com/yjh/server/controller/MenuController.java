package com.yjh.server.controller;


import com.yjh.server.pojo.Menu;
import com.yjh.server.service.IMenuService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author mikuo
 * @since 2021-12-02
 */
@RestController
//因为菜单的是固定的
@RequestMapping("/system/cfg")
public class MenuController {
    @Autowired
    private IMenuService menuService;

    @ApiOperation(value = "通过用户id查询菜单列表")
    @GetMapping("/menu")//security有一个全局对象
    public List<Menu> getMenusByAdminId(){
        return menuService.getMenusByAdminId();
    }
}
