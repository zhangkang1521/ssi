package org.zk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhangkang on 2017/9/11.
 */
@Controller
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("/first")
    public String index() {
        return "demo/first";
    }
}
