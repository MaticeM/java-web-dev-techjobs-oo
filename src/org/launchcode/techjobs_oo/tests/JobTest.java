package org.launchcode.techjobs_oo.tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class JobTest {

    private Job testJob1, testJob2;

    @Before
    public void createTestJobObject() {
        testJob1 = new Job("Software Engineer", new Employer("Microsoft"), new Location("Dallas"), new PositionType("IT"), new CoreCompetency("Coding"));
        testJob2 = new Job("UX Designer", new Employer("Adobe"), new Location("California"), new PositionType("Marketing"), new CoreCompetency("Design"));
    }

    //test job IDs differ by 1
    @Test
    public void testSettingJobId() {
    assertEquals(testJob1.getId(), testJob2.getId(), 1);
    }
}
