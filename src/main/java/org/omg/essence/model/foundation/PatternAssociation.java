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

import java.util.Collection;

/**
 * <pre>
 * <b>Description: </b>
 * </pre>
 * 
 * The Class PatternAssociation. Pattern associations are used to create named
 * links between the elements of a pattern
 * 
 * <pre>
 * 
 * <b>Invariant:</b>
 * 
 * {@code
 * -- A pattern association may not refer to other pattern associations, element
 * groups, extension elements, or merge resolutions
 * self.elements->forAll (e | not e.oclIsKindOf(PatternAssocation) and not
 * e.oclIsKindOf(ElementGroup) and not e.oclIsKindOf(ExtensionElement) and not
 * e.oclIsKindOf(MergeResolution))
 * }
 * </pre>
 * 
 * <pre>
 * 
 * <b>Semantics:</b>
 * 
 * Each pattern association introduces elements to take part in a pattern. The name of the pattern association should explain
 * the meaning these elements have inside the pattern. For example, in a pattern defining a toolset there may be a pattern
 * association named “used for” referring to an activity, another pattern association named “used on” referring to a work
 * product, and a third pattern association named “suitable for” referring to a level of detail on the work product that can be
 * achieved with that toolset.
 * 
 * </pre>
 *
 * @author Daniel Cortes Pichardo
 * @version 1.1
 * @since essence 1.1
 */
public class PatternAssociation extends LanguageElement {

    /** Name of the association. */
    public String name;

    /** The elements taking part in the pattern via this association */
    public Collection<LanguageElement> elements;

    /** The pattern. */
    public Pattern pattern;

}