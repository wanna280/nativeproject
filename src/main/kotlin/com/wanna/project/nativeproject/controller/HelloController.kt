package com.wanna.project.nativeproject.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


/**
 *
 * @author jianchao.jia
 * @version v1.0
 * @date 2024/08/20
 */
@RestController
class HelloController {

    @RequestMapping("/hello")
    fun hello(): String {
        return "OK"
    }
}