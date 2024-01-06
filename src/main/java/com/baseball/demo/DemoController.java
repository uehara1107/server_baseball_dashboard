package com.baseball.demo;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@RestController
public class DemoController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping(path = "/test", method = RequestMethod.GET)
    public String get(){
        List<Map<String, Object>> list;
        list = jdbcTemplate.queryForList("select * from my_table");
        return list.toString();
    }

    @RequestMapping(path = "/test/{id}", method = RequestMethod.GET)
    public String read(@PathVariable String id) {
        List<Map<String, Object>> list;
        list = jdbcTemplate.queryForList("select * from my_table where id = ?", id);
        return list.toString();
    }
    
}
