package com.zking.gofcrm.basd.controller;

import com.zking.gofcrm.common.controller.ParentController;
import com.zking.gofcrm.common.util.page.Datagrid;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 描述： 产品实体控制层
 * User: jzw
 * Date: 18-2-15
 * Time: 下午12:36
 */
@RequestMapping(value = "/product", method = RequestMethod.POST)
public class ProductController extends ParentController{



    /**
     * 前台数据表格的数据
     * @param datagrid
     * @return
     */
    @RequestMapping("/show")
    @ResponseBody
    public Datagrid showProduct(Datagrid datagrid) {


        return datagrid;
    }

}
