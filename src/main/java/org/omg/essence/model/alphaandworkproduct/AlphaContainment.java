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
 * The Class AlphaContainment. Alpha association is used to represent a
 * sub(ordinate)-alpha relationship between alphas.
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
 * The sub-alpha relationships define the graphs that show how the states of lower level, more granular alpha instances
 * contribute to and drive the states of the higher level, more abstract, alpha instances.
 * 
 * The relationship between a sub(ordinate)-alpha and a super-alpha can, in general, be many-to-many. The ends of the
 * relationship are modeled separately to indicate which is the sub(ordinate)-alpha and which is the super-alpha of the
 * relationship.
 * 
 * </pre>
 *
 * @author Daniel Cortes Pichardo
 * @version 1.1
 * @since essence 1.1
 */
public interface AlphaContainment extends LanguageElement {

    /** Lower bound for the number of instances of the sub(ordinate)-alpha. */
    int getLowerBound();

    /** Upper bound for the number of instances of the sub(ordinate)-alpha. */
    int getUpperBound();

    /** The super alpha */
    Alpha getSuperAlpha();

    /** The subordinate alpha. */
    Alpha getSubordinateAlpha();

}