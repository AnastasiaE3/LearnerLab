package io.zipcoder.interfaces;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestPerson {

    @Test
    public void testConstructor() {
        Person person = new Person(1, "Nastya"); //person object
        assertEquals(1, person.getId()); // if id and name are correct
        assertEquals("Nastya", person.getName());
    }

    @Test
    public void testSetName() {
        Person person = new Person(1,"Nastya");
        //set a new name
        person.setName("Pidor");
        //check if updated correctly
        assertEquals("Pidor", person.getName());
    }
}
