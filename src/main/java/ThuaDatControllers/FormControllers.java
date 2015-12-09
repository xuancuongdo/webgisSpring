/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThuaDatControllers;

import javax.validation.Valid;
import model.tblThuaDat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author cuongdx
 */
@Controller
public class FormControllers {

    /**
     * chuyen den trang thua dat
     * @param model
     * @return
     */
    @RequestMapping(value = "/thuadat", method = RequestMethod.GET)
    public ModelAndView printDemoForm(Model model) {
        model.addAttribute("message", "Xin chào các bạn");
        tblThuaDat objThuaDat = new tblThuaDat();
//        objThuaDat.SHBANDO = 10;
//        objThuaDat.SHTHUA = 1;
        return new ModelAndView("demoform","objThuaDat",objThuaDat);
    }
    @RequestMapping(value = "/addThuaDat", method = RequestMethod.POST)
    public String AddForm(@Valid tblThuaDat objThuaDat,  BindingResult result,Model model) {
        model.addAttribute("message", "Xin chào các bạn");
        //tblThuaDat objThuaDat = new tblThuaDat();
        if(result.hasErrors())
        {
            return "demoform";
        }
        model.addAttribute("tobando", objThuaDat.SHBANDO );
        model.addAttribute("sothua", objThuaDat.SHTHUA );
        return "addThuaDat";
    }
    
}
