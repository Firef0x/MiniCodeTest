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

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * FizzBuzzStage2 Unit Test
 */
public class FizzBuzzStage2Test extends TestCase {

    private FizzBuzzStage2 fizzBuzzStage2;

    @Before
    public void setUp() throws Exception {
        super.setUp();
        fizzBuzzStage2 = new FizzBuzzStage2();
    }

    @Test
    public void testGetFizzBuzzWord_NumberIsMultipleOfThree() {
        assertThat(fizzBuzzStage2.getFizzBuzzWord(Constants.FIZZ_DIVIDER), is(Constants.FIZZ));
        assertThat(fizzBuzzStage2.getFizzBuzzWord(Constants.FIZZ_DIVIDER * Constants.FIZZ_DIVIDER), is(Constants.FIZZ));
    }

    @Test
    public void testGetFizzBuzzWord_NumberContainsThree() {
        assertThat(fizzBuzzStage2.getFizzBuzzWord(Constants.FIZZ_DIVIDER * 10 + 4), is(Constants.FIZZ));
        assertThat(fizzBuzzStage2.getFizzBuzzWord(Constants.FIZZ_DIVIDER + 40), is(Constants.FIZZ));
    }

    @Test
    public void testGetFizzBuzzWord_NumberIsMultipleOfFive() {
        assertThat(fizzBuzzStage2.getFizzBuzzWord(Constants.BUZZ_DIVIDER), is(Constants.BUZZ));
        assertThat(fizzBuzzStage2.getFizzBuzzWord(Constants.BUZZ_DIVIDER * Constants.BUZZ_DIVIDER), is(Constants.BUZZ));
    }

    @Test
    public void testGetFizzBuzzWord_NumberContainsFive() {
        assertThat(fizzBuzzStage2.getFizzBuzzWord(Constants.BUZZ_DIVIDER * 10 + 6), is(Constants.BUZZ));
        assertThat(fizzBuzzStage2.getFizzBuzzWord(Constants.BUZZ_DIVIDER  + 60), is(Constants.BUZZ));
    }

    @Test
    public void testGetFizzBuzzWord_NumberIsMultipleOfThreeAndFive() {
        assertThat(fizzBuzzStage2.getFizzBuzzWord(Constants.FIZZ_DIVIDER * Constants.BUZZ_DIVIDER), is(Constants.FIZZ + Constants.BUZZ));
    }

    @Test
    public void testGetFizzBuzzWord_NumberContainsThreeAndFive() {
        assertThat(fizzBuzzStage2.getFizzBuzzWord(Constants.FIZZ_DIVIDER * 10 + Constants.BUZZ_DIVIDER), is(Constants.FIZZ + Constants.BUZZ));
        assertThat(fizzBuzzStage2.getFizzBuzzWord(Constants.BUZZ_DIVIDER * 10 + Constants.FIZZ_DIVIDER), is(Constants.FIZZ + Constants.BUZZ));
    }

    @Test
    public void testGetFizzBuzzWord_NumberIsNotMultipleOfOrContainsThreeOrFive() {
        assertEquals(fizzBuzzStage2.getFizzBuzzWord(4), Integer.toString(4));
        assertEquals(fizzBuzzStage2.getFizzBuzzWord(44), Integer.toString(44));
    }

    @After
    public void tearDown() throws Exception {
        super.tearDown();
    }
}

