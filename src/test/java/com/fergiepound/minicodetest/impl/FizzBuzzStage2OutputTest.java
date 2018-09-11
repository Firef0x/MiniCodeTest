/*
 * Copyright 2018 Fergie Pound
 *
 * Permission to use, copy, modify, and/or distribute this software for any purpose with or without fee is hereby granted, provided that the above copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */

package com.fergiepound.minicodetest.impl;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.easymock.EasyMock;
import org.powermock.api.easymock.PowerMock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * FizzBuzzStage2Output Unit Test
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(FizzBuzzStage2.class)
public class FizzBuzzStage2OutputTest extends TestCase {

    private FizzBuzzStage2Output fizzBuzzStage2Output;

    @Before
    public void setUp() throws Exception {
        super.setUp();
        fizzBuzzStage2Output = new FizzBuzzStage2Output();
    }

    @Test
    public void testPrintFizzBuzzOutput() {
        int intFizzBuzzLimit = 2;

        PowerMock.resetAll();
        FizzBuzzStage2 fizzBuzzStage2 = PowerMock.createMock(FizzBuzzStage2.class);
        EasyMock.expect(fizzBuzzStage2.getFizzBuzzWord(1))
                .andReturn(Integer.toString(1));
        EasyMock.expect(fizzBuzzStage2.getFizzBuzzWord(intFizzBuzzLimit))
                .andReturn(Integer.toString(intFizzBuzzLimit));
        PowerMock.replay(FizzBuzzStage2.class);
        assertEquals(Integer.toString(1) + "\r\n" + Integer.toString(intFizzBuzzLimit), fizzBuzzStage2Output.printFizzBuzzOutput(intFizzBuzzLimit));
        PowerMock.verify(FizzBuzzStage2.class);
    }

    @After
    public void tearDown() throws Exception {
        super.tearDown();
    }
}
