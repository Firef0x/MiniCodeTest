/*
 * Copyright 2018 Fergie Pound
 *
 * Permission to use, copy, modify, and/or distribute this software for any purpose with or without fee is hereby granted, provided that the above copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */

package com.fergiepound.minicodetest.impl;

public class Main {
    private static FizzBuzzBasicOutput fizzBuzzBasicOutput = new FizzBuzzBasicOutput();
    private static FizzBuzzStage2Output fizzBuzzStage2Output = new FizzBuzzStage2Output();

    /**
     * Main method, print FizzBuzz Basic and Stage 2 Output
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("FizzBuzz Basic Output:");
        System.out.println(fizzBuzzBasicOutput.printFizzBuzzOutput(com.fergiepound.minicodetest.impl.Constants.DEFAULT_FIZZ_BUZZ_LIMIT));
        System.out.println();
        System.out.println("FizzBuzz Stage 2 Output:");
        System.out.println(fizzBuzzStage2Output.printFizzBuzzOutput(com.fergiepound.minicodetest.impl.Constants.DEFAULT_FIZZ_BUZZ_LIMIT));
    }
}
