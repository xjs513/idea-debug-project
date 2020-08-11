package com.evente.debug.test;

import com.evente.debug.model.Person;
import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    @Test
    public void test(){
        Person person = new Person();
        person.setName("LiMing");
        person.setSex("M");

        Assert.assertEquals("LiMingHello", person.hello());
    }
}
