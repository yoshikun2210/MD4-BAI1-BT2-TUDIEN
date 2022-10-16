package rikkei.academy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class TuDienController {
    @GetMapping("/translate")
    public String translate(@RequestParam String text, Model model){
        Map<String,String> map = new HashMap<>();
        map.put("meo","cat");
        map.put("cho","dog");
        map.put("o to","car");
        map.put("bong da","football");
        map.put("cay","tree");
        String result = map.get(text);
        if (result==null){
            result = "Khong co";
        }
        model.addAttribute("result",result);
        return "result";
    }
}
