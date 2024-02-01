package com.maciio.simpleK8s.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Mario A. Pineda on 1/31/24.
 */
@RestController
public class FooController {

    @RequestMapping(value="/controller", method= RequestMethod.GET)
    public String foo() {
        return "Response! OK! ";
    }

}