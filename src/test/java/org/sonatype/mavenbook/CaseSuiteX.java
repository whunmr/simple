package org.sonatype.mavenbook;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CaseA.class,
        CaseB.class
})
public class CaseSuiteX {
    //normally, this is an empty class
}