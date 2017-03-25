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

/**
 * <pre>
 * <b>Description: </b>
 * </pre>
 * 
 * The Class MergeResolution. An element that provides a solution for a merge
 * conflict as defined in 9.4.4.3. of the standard
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
 * If an element group refers to more than one element with the same name, these elements are merged when viewing the
 * content of this element group. For each conflicting attribute on the merged objects, a merge resolution must be defined. It
 * applies a resolution function to the conflicting attributes and returns the attribute value to be used as resolution. See 9.4
 * for the detailed mechanism.
 * 
 * </pre>
 *
 * @author Daniel Cortes Pichardo
 * @version 1.1
 * @since essence 1.1
 */
public interface MergeResolution extends LanguageElement {

    /** The name of the attribute on which the conflict is solved. */
    String getTargetAttribute();

    /** The name of the element on which the conflict is solved. */
    String getTargetName();

    /** The function applied to the target attribute. */
    String getResolutionFunction();

    /** The element group. */
    ElementGroup getElementGroup();

}
