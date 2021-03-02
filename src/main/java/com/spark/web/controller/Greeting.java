package com.spark.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

    @Controller
    public class Greeting{

        @RequestMapping(value="/home/{name}/{address}/{hobby}")
        public String home(@PathVariable String name, @PathVariable String address,
                           @PathVariable String hobby) throws Exception{
            return "home";
        }
        @RequestMapping(value="/archive")
        public String archive() throws Exception{
            return "archive";
        }
        @RequestMapping(value="/contact")
        public String contact() throws Exception{
            return "contact";
        }
        @RequestMapping(value="/single")
        public String single() throws Exception{
            return "single";
        }
        @RequestMapping(value="/static")
        public String statics() throws Exception{
            return "static";
        }

    }


