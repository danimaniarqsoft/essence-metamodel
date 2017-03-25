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
package org.omg.essence.model.foundation;

import java.util.*;

/**
 * <pre>
 * <b>Description: </b>
 * </pre>
 * 
 * The Class Pattern. A pattern is a generic mechanism for naming complex
 * concepts that are made up of several Essence elements. A pattern is defined
 * in terms of pattern associations.
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
 * Pattern is a general mechanism for defining a structure of language elements. Typically, the pattern references other
 * elements in a practice or kernel. For example, a role may be defined by referencing required competencies, having
 * responsibility of work products, and participation in activities. Another example could be a phase which groups activity
 * spaces that should be performed during that phase.
 * 
 * Patterns can also be used to model complex conditions. For example, a pattern for pre-conditions can create associations
 * to activities, work products and level of detail to express that particular work products must be present in at least the
 * designated levels of detail to be ready to start the particular activities.
 * 
 * </pre>
 *
 * @author Daniel Cortes Pichardo
 * @version 1.1
 * @since essence 1.1
 */
public interface Pattern extends BasicElement {

    /** Named association types between elements */
    Collection<PatternAssociation> getAssociation();

}
