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
public class AlphaAssociation extends LanguageElement {

    /** Lower bound of association endpoint 1. */
    private int end1lowerBound;

    /** Upper bound of association endpoint 1. */
    private int end1upperBound;

    /** Lower bound of association endpoint 2. */
    private int end2lowerBound;

    /** Upper bound of association endpoint 2. */
    private int end2upperBound;

    /** Name of the alpha association. */
    private String name;

    /** The alpha endpoint 1 of the association. */
    private Alpha end1;

    /** The alpha endpoint 2 of the association. */
    private Alpha end2;

    public int getEnd1lowerBound() {
        return end1lowerBound;
    }

    public void setEnd1lowerBound(int end1lowerBound) {
        this.end1lowerBound = end1lowerBound;
    }

    public int getEnd1upperBound() {
        return end1upperBound;
    }

    public void setEnd1upperBound(int end1upperBound) {
        this.end1upperBound = end1upperBound;
    }

    public int getEnd2lowerBound() {
        return end2lowerBound;
    }

    public void setEnd2lowerBound(int end2lowerBound) {
        this.end2lowerBound = end2lowerBound;
    }

    public int getEnd2upperBound() {
        return end2upperBound;
    }

    public void setEnd2upperBound(int end2upperBound) {
        this.end2upperBound = end2upperBound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Alpha getEnd1() {
        return end1;
    }

    public void setEnd1(Alpha end1) {
        this.end1 = end1;
    }

    public Alpha getEnd2() {
        return end2;
    }

    public void setEnd2(Alpha end2) {
        this.end2 = end2;
    }
}
