package org.sonatype.mavenbook;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

//  mvn '-Dtest=%regex[#.*___smoke.*]' test
//  mvn '-Dtest=%regex[#.*___smoke.*], %regex[#.*___A.*|.*___B.*]' test
//  mvn '-Dtest=%regex[#.*___smoke.*], %regex[#.*___A.*___B.*]' test
//  mvn '-Dtest=%regex[#.*___smoke.*], !%regex[#.*___B.*___smoke.*]' test
//  mvn surefire-report:report && open site/*.html

//
// <plugin>
//    <groupId>org.apache.maven.plugins</groupId>
//    <artifactId>maven-surefire-plugin</artifactId>
//    <version>2.20</version>
// </plugin>


public class CaseA
{
    @Test
    public void test1___A___happy___smoke()
    {
        assertThat(0, is(0));
    }

    @Test
    public void test2___B___sad___smoke()
    {
        assertThat(0, is(0));
    }

    @Test
    public void test3___A___B___sad()
    {
        assertThat(0, is(0));
    }

    @Test
    public void test4___B___happy()
    {
        assertThat(0, is(0));
    }

    @Test
    public void test5___B___happy___unstable()
    {
        assertThat(0, is(0));
    }
}
