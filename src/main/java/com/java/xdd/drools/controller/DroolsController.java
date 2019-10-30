package com.java.xdd.drools.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xdd
 * @date 2019/10/30
 */
@RestController
@RequestMapping("drools")
public class DroolsController {

    @RequestMapping("test")
    public void test() {
//        KieServices kieServices = KieServices.Factory.get();
//        container = kieServices.getKieClasspathContainer();
//        statefulKieSession = container.newKieSession("myAgeSession");
//        Person person = new Person("Kevin",12);
//        statefulKieSession.insert(person);
//        statefulKieSession.fireAllRules();
//        Person person2 = new Person("Jack",50);
//        statefulKieSession.insert(person2);
//        statefulKieSession.fireAllRules();
//
//        statefulKieSession.dispose();
    }
}
