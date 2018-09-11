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

/**
 * FizzBuzzStage2 Integration Test
 */
public class ITFizzBuzzStage2OutputTest extends TestCase {

    private FizzBuzzStage2Output fizzBuzzStage2Output;
    private String strFizzBuzzStage2Output;

    @Before
    public void setUp() throws Exception {
        super.setUp();
        fizzBuzzStage2Output = new FizzBuzzStage2Output();
        strFizzBuzzStage2Output = "1\r\n" +
                "2\r\n" +
                "Fizz\r\n" +
                "4\r\n" +
                "Buzz\r\n" +
                "Fizz\r\n" +
                "7\r\n" +
                "8\r\n" +
                "Fizz\r\n" +
                "Buzz\r\n" +
                "11\r\n" +
                "Fizz\r\n" +
                "Fizz\r\n" +
                "14\r\n" +
                "FizzBuzz\r\n" +
                "16\r\n" +
                "17\r\n" +
                "Fizz\r\n" +
                "19\r\n" +
                "Buzz\r\n" +
                "Fizz\r\n" +
                "22\r\n" +
                "Fizz\r\n" +
                "Fizz\r\n" +
                "Buzz\r\n" +
                "26\r\n" +
                "Fizz\r\n" +
                "28\r\n" +
                "29\r\n" +
                "FizzBuzz\r\n" +
                "Fizz\r\n" +
                "Fizz\r\n" +
                "Fizz\r\n" +
                "Fizz\r\n" +
                "FizzBuzz\r\n" +
                "Fizz\r\n" +
                "Fizz\r\n" +
                "Fizz\r\n" +
                "Fizz\r\n" +
                "Buzz\r\n" +
                "41\r\n" +
                "Fizz\r\n" +
                "Fizz\r\n" +
                "44\r\n" +
                "FizzBuzz\r\n" +
                "46\r\n" +
                "47\r\n" +
                "Fizz\r\n" +
                "49\r\n" +
                "Buzz\r\n" +
                "FizzBuzz\r\n" +
                "Buzz\r\n" +
                "FizzBuzz\r\n" +
                "FizzBuzz\r\n" +
                "Buzz\r\n" +
                "Buzz\r\n" +
                "FizzBuzz\r\n" +
                "Buzz\r\n" +
                "Buzz\r\n" +
                "FizzBuzz\r\n" +
                "61\r\n" +
                "62\r\n" +
                "Fizz\r\n" +
                "64\r\n" +
                "Buzz\r\n" +
                "Fizz\r\n" +
                "67\r\n" +
                "68\r\n" +
                "Fizz\r\n" +
                "Buzz\r\n" +
                "71\r\n" +
                "Fizz\r\n" +
                "Fizz\r\n" +
                "74\r\n" +
                "FizzBuzz\r\n" +
                "76\r\n" +
                "77\r\n" +
                "Fizz\r\n" +
                "79\r\n" +
                "Buzz\r\n" +
                "Fizz\r\n" +
                "82\r\n" +
                "Fizz\r\n" +
                "Fizz\r\n" +
                "Buzz\r\n" +
                "86\r\n" +
                "Fizz\r\n" +
                "88\r\n" +
                "89\r\n" +
                "FizzBuzz\r\n" +
                "91\r\n" +
                "92\r\n" +
                "Fizz\r\n" +
                "94\r\n" +
                "Buzz\r\n" +
                "Fizz\r\n" +
                "97\r\n" +
                "98\r\n" +
                "Fizz\r\n" +
                "Buzz";
    }

    @Test
    public void testPrintFizzBuzzOutput() {
        assertEquals(fizzBuzzStage2Output.printFizzBuzzOutput(com.fergiepound.minicodetest.impl.Constants.DEFAULT_FIZZ_BUZZ_LIMIT), strFizzBuzzStage2Output);
    }

    @After
    public void tearDown() throws Exception {
        super.tearDown();
    }
}

