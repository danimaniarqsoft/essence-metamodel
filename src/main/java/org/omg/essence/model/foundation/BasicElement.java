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

import org.omg.essence.model.GraphicalElement;

/**
 * <pre>
 * <b>Description: </b>
 * </pre>
 * 
 * The Class BasicElement. Abstract superclass for all main concepts in Essence
 * other than Element groups.
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
 * Basic elements are considered to represent the small set of main concepts within Essence. Basic elements are most likely
 * the first elements of Essence a user interacts with.
 * 
 * Elements of Essence which are no basic elements (and no element groups) are considered to be auxiliary elements used
 * to detail or connect basic elements.
 * 
 * </pre>
 *
 * @author Daniel Cortes Pichardo
 * @version 1.1
 * @since essence 1.1
 */
public interface BasicElement extends LanguageElement {

    /** The name of the element. */
    String getName();

    /**
     * The icon to be used when presenting the elements.
     * 
     * @see GraphicalElement
     */
    GraphicalElement getIcon();

    /**
     * A short and concise description of what the element is. It is discouraged
     * to use rich formatting and structuring elements like section headings in
     * the brief description. The content of this attribute should be a summary
     * of the content fiven in attribute "description".
     */
    String getBriefDescription();

    /**
     * A more detailed description of the element. The content of this attribute
     * may be written in a markup language to allow for rich descriptions. It
     * may include section headings, formatting information, hyperlinks, or
     * similar to ease structured reading and navigation.
     */
    String getDescription();

}
