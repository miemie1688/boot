package com.spring.boot.controller;

import com.sun.org.glassfish.gmbal.ParameterNames;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ParameterController {

    @GetMapping("/car/{id}/owner/{username}")
    public Map<String, Object> getCar(@PathVariable("id") Integer id,
                                      @PathVariable("username") String name,
                                      @PathVariable Map<String,String> pv,
                                      @RequestHeader("User-Agent") String userAgent,
                                      @RequestHeader Map<String,String> headers,
                                      @RequestParam("age") Integer age,
                                      @RequestParam("inters") List<String> inters,
                                      @RequestParam Map<String,String> params){
//                                      @CookieValue("_ga") String _ga,
//                                      @CookieValue("_ga") Cookie cookie) {
        Map<String,Object> map = new HashMap<>();
//        map.put("id", id);
//        map.put("name", id);
//        map.put("kv", pv);
//        map.put("userAgent", userAgent);
//        map.put("headers", headers);
        map.put("age", age);
        map.put("inters", inters);
        map.put("params", params);
//        map.put("_ga", _ga);
//        map.put("")
        return map;
    }

    @PostMapping("/save")
    public Map postMethod(@RequestBody String content) {
        Map<String,Object> map = new HashMap<>();
        map.put("content", content);

        return map;
    }

}
