package org.sonatype.mavenbook;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class CaseB {

    @Test
    public void testAppXY1___smoke()
    {
        assertThat(0, is(0));
    }
}
