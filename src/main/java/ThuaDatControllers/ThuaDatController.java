/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThuaDatControllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author cuongdx
 */
@Controller
public class ThuaDatController {
    @RequestMapping(value="/hello",method=RequestMethod.GET)
    public String printHelloWorld(Model model)
    {
        model.addAttribute("message","Xin chào các bạn");
        return "hello";
    }
    @RequestMapping(value="/index",method = RequestMethod.GET)
    public String index()
    {
        return "index";
    }
}
