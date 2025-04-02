package JUNIT;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestAdd_num.class, TestSub_num.class })
public class TestSuite_AddSub {

}
