package com.java.xdd.drools;

import com.java.xdd.drools.bean.Person;
import org.junit.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * @author xdd
 * @date 2019/10/30
 */
public class DroolsTest {

    private KieContainer container = null;
    private KieSession statefulKieSession = null;

    @Test
    public void test() {
//        KieServicesImpl
        KieServices kieServices = KieServices.Factory.get();
        container = kieServices.getKieClasspathContainer();
        //ksession-hello与kmodule.xml文件ksession标签name属性一直
        statefulKieSession = container.newKieSession("ksession-hello");
        Person person = new Person("Kevin",12);
        statefulKieSession.insert(person);
        statefulKieSession.fireAllRules();
        Person person2 = new Person("Jack",50);
        statefulKieSession.insert(person2);
        statefulKieSession.fireAllRules();

        statefulKieSession.dispose();
    }

    @Test
    public void test2() {
//        KieServicesImpl
        KieServices kieServices = KieServices.Factory.get();
        container = kieServices.getKieClasspathContainer();
        //ksession-hello与kmodule.xml文件ksession标签name属性一直
        statefulKieSession = container.newKieSession("point-rulesKS");
        Person person = new Person("Kevin",12);
        statefulKieSession.insert(person);
        statefulKieSession.fireAllRules();
        Person person2 = new Person("Jack",50);
        statefulKieSession.insert(person2);
        statefulKieSession.fireAllRules();

        statefulKieSession.dispose();
    }
}
