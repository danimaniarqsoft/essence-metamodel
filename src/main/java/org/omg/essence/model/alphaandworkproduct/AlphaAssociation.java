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
package org.omg.essence.model.alphaandworkproduct;

import org.omg.essence.model.foundation.*;

/**
 * <pre>
 * <b>Description: </b>
 * </pre>
 * 
 * The Class AlphaAssociation. Alpha association is used to represent a
 * relationship between alphas. Generally these associations are defined by a
 * practice.
 * 
 * <pre>
 * 
 * <b>Invariant:</b>
 * 
 * {@code
 * true
 * }
 * </pre>
 * 
 * <pre>
 * 
 * <b>Semantics:</b>
 * 
 * Unlike a relationship between alphas defined using alpha containment, which is used for the Essence “sub-alpha”
 * relationship, a relationship between alphas defined using alpha association has no defined semantics in Essence. An
 * example would be between a Risk and the Team Member who identified the Risk. While Risk Management practice
 * might recommend that this relationship be tracked, it is not a sub-alpha relationship.
 * 
 * A relationship modeled by an alpha association can, in general, be many-to-many.
 * 
 * </pre>
 *
 * @author Daniel Cortes Pichardo
 * @version 1.1
 * @since essence 1.1
 */
public interface AlphaAssociation extends LanguageElement {

    /** Lower bound of association endpoint 1. */
    int getEnd1lowerBound();

    /** Upper bound of association endpoint 1. */
    int getEnd1upperBound();

    /** Lower bound of association endpoint 2. */
    int getEnd2lowerBound();

    /** Upper bound of association endpoint 2. */
    int getEnd2upperBound();

    /** Name of the alpha association. */
    String getName();

    /** The alpha endpoint 1 of the association. */
    Alpha getEnd1();

    /** The alpha endpoint 2 of the association. */
    Alpha getEnd2();
}