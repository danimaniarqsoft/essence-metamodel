/*
 *  
 * The MIT License (MIT)
 * Copyright (c) 2016 Daniel Cortes Pichardo
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package org.omg.essence.validations.elements;

import static java.lang.String.format;

import org.omg.essence.validations.core.ModelValidation;
import org.omg.essence.validations.core.Validator;

/**
 * AlphaValidation
 * 
 * @author Daniel Cortes Pichardo
 * @since essence 1.1
 * @version 1.1
 */
public class FormValidations {
    public static Validator<String> notNull = ModelValidation.from((s) -> s != null, "El valor no debe ser null");

    public static Validator<String> moreThan(int size) {
        return ModelValidation.from((s) -> s.length() >= size, format("must have more than %s chars.", size));
    }

    public static Validator<String> lessThan(int size) {
        return ModelValidation.from((s) -> s.length() <= size, format("must have less than %s chars.", size));
    }

    public static Validator<String> between(int minSize, int maxSize) {
        return moreThan(minSize).and(lessThan(maxSize));
    }

    public static Validator<String> contains(String c) {
        return ModelValidation.from((s) -> s.contains(c), format("must contain %s", c));
    }

}
