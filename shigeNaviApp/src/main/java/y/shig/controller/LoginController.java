package y.shig.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import y.shig.Entity.MyData;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
/**
 * Created by yubei on 2018/02/04.
 */

@Controller
public class LoginController {

    @GetMapping("/")
    public String index(@ModelAttribute("formModel") MyData myData, Model model) {

        model.addAttribute("msg", "this is sample contents.");
/*        Iterable<MyData> list = myDataRepository.findAll();
        model.addAttribute("datalist", list);*/

        return "login";
    }
}
