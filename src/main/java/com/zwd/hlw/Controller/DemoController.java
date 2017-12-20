package com.zwd.hlw.Controller;

import com.zwd.hlw.entity.Person;
import com.zwd.hlw.service.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/demo")
public class DemoController {
    @Resource
    private DemoService demoService;


    /**

     * 测试保存数据方法.

     * @return

     */

    @RequestMapping("/save")
    public String save(){
        Person d = new Person();
        d.setName("Angel");
        demoService.save(d);//保存数据.
        return "ok.DemoController.save";

    }
}
