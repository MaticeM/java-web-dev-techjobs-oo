package org.launchcode.techjobs_oo.tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;
import org.junit.Assert;

import static org.junit.Assert.*;

public class JobTest {

    private Job testJob1, testJob2, testJob3, testJob4, testJob5;

    @Before
    public void createTestJobObject() {
        testJob1 = new Job("Software Engineer", new Employer("Microsoft"), new Location("Dallas"), new PositionType("IT"), new CoreCompetency("Coding"));
        testJob2 = new Job("UX Designer", new Employer("Adobe"), new Location("California"), new PositionType("Marketing"), new CoreCompetency("Design"));
        testJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        testJob4 = new Job("Entry Level Software Engineer", new Employer("Toyota"), new Location("Plano, TX"), new PositionType("Engineering"), new CoreCompetency("Problem Solving"));
        testJob5 = new Job("Entry Level Software Engineer", new Employer("Toyota"), new Location("Plano, TX"), new PositionType("Engineering"), new CoreCompetency("Problem Solving"));

    }

    //test job IDs differ by 1
    @Test
    public void testSettingJobId() {
    assertEquals(testJob1.getId(), testJob2.getId(), 1);
    }

    //test full constructor
    @Test
    public void testJobConstructorSetsAllFields() {
        assertTrue(testJob3 instanceof Job);
    }

    //test the equals method
    @Test
    public void testJobsForEquality() {
        assertFalse(testJob4.equals(testJob5));

    }
}
