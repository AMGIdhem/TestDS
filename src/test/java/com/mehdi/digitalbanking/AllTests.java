package com.mehdi.digitalbanking;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


//@RunWith(Suite.class)
//@SuiteClasses({MockitoTest.class, PluspcmTest.class, FactureTest.class})
@RunWith(JUnitPlatform.class)
@SelectClasses({MockitoTest.class, PluspcmTest.class, FactureTest.class})
class AllTests {

}
