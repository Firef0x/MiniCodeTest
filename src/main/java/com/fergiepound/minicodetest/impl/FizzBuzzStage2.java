/*
 * Copyright 2018 Fergie Pound
 *
 * Permission to use, copy, modify, and/or distribute this software for any purpose with or without fee is hereby granted, provided that the above copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */

package com.fergiepound.minicodetest.impl;

public class FizzBuzzStage2 implements com.fergiepound.minicodetest.intf.IFizzBuzz {
    public String getFizzBuzzWord(int intFizzBuzzNum) {
        StringBuilder sbFizzBuzzWord = new StringBuilder();
        String strFizzBuzzNum = Integer.toString(intFizzBuzzNum);
        boolean blFizz = false;
        boolean blBuzz = false;

        /** Judge whether it should print Fizz **/
        if (0 == intFizzBuzzNum % Constants.FIZZ_DIVIDER) {
            blFizz = true;
        }

        /** Judge whether it should print Buzz **/
        if (0 == intFizzBuzzNum % Constants.BUZZ_DIVIDER) {
            blBuzz = true;
        }

        /** Judge whether it should print Fizz **/
        if (strFizzBuzzNum.indexOf(Constants.STR_FIZZ_DIVIDER) > -1) {
            blFizz = true;
        }

        /** Judge whether it should print Buzz **/
        if (strFizzBuzzNum.indexOf(Constants.STR_BUZZ_DIVIDER) > -1) {
            blBuzz = true;
        }
        /** Judge whether it should print Fizz **/
        if (blFizz) {
            sbFizzBuzzWord.append(Constants.FIZZ);
        }

        /** Judge whether it should print Buzz **/
        if (blBuzz) {
            sbFizzBuzzWord.append(Constants.BUZZ);
        }
        return (sbFizzBuzzWord.length() == 0) ? strFizzBuzzNum : sbFizzBuzzWord.toString();
    }
}
