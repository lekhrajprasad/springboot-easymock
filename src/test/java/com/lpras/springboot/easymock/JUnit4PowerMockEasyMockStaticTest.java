package com.lpras.springboot.easymock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.easymock.EasyMock.expect;
import static org.junit.Assert.assertEquals;
import static org.powermock.api.easymock.PowerMock.mockStatic;
import static org.powermock.api.easymock.PowerMock.replayAll;
import static org.powermock.api.easymock.PowerMock.verifyAll;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Utils.class)
public class JUnit4PowerMockEasyMockStaticTest {

    @Test
    public void test_static_method() {
        //PowerMock.mockStatic()
        mockStatic(Utils.class);

        expect(Utils.generateID()).andReturn(1000L);

        //PowerMock.replayAll()
        replayAll();

        assertEquals(1000L, Utils.generateID());
        //PowerMock.verifyAll()
        verifyAll();
    }
}
