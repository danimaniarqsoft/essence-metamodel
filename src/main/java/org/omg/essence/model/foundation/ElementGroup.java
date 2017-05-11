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

import org.omg.essence.model.GraphicalElement;

/**
 * <pre>
 * <b>Description: </b>
 * </pre>
 * 
 * The Abstract Class ElementGroup. A generic name for an Essence concept that
 * names a collection of elements. Element groups are recursive, so a group may
 * own other groups, as well as other (non-group) elements.
 * 
 * <pre>
 * 
 * <b>Invariant:</b>
 * 
 * {@code
 * -- An element group may not own itself
 * self.allElements(ElementGroup)->excludes(self)
 * 
 * -- An element group may only extend elements it owns
 * self.extensions->forAll(e | self.allElements(e.targetElement.oclType())->includes(e.targetElement))
 * }
 * </pre>
 * 
 * <pre>
 * <b>Additional Operations:</b>
 * 
 * {@code
 * -- Get all elements of a particular type which are available within this group
 * and its referenced groups.
 * context ElementGroup::allElements (t : OclType) : Set(t)
 * body: self.referredElements->select(e | e.oclIsKindOf(t))
 * ->union(self.allElements(ElementGroup)->collect(c | c.allElements(t))
 * ->union(self.ownedElements->select(e | e.oclIsKindOf(t)))
 * }
 * </pre>
 * 
 * <pre>
 * <b>Semantics:</b>
 * 
 * Element groups are used to organize Essence elements into meaningful collections such as Kernels or Practices. Elements
 * in a particular group belong together for some reason, while elements outside that group do not belong to them. The
 * reasoning for including elements in the group should be given in the description attribute of the group.
 * 
 * Element groups can own their members by reference or by value. 
 * 
 * If an element group owns two or more members of the same type and name, composition (cf. 9.4) is applied to them so
 * that only one merged element of that type with that name is visible when viewing the contents of the element group.
 * </pre>
 * 
 * 
 * @author Daniel Cortes Pichardo
 * @version 1.1
 * @since essence 1.1
 * 
 */
public interface ElementGroup extends LanguageElement {

    /** The name of the element group */
    String getName();

    /** The icon to be used when presenting the element group */
    GraphicalElement getIcon();

    /**
     * A short description of what the group is. It is discoraged to use rich
     * formatting and structuring elements like section headings in the brief
     * description. The content of this attribute should be a summary of the
     * content given in attribute "description".
     */
    String getBriefDescription();

    /**
     * A more detailed description of the group. The content of this attribute
     * may be written in a markup language to allow for rich descriptions. It
     * may include section headings, formatting information, hyperlinks, or
     * similar to ease structured reading and navigation.
     */
    String getDescription();

    /** The merge resolution. */
    Collection<? extends MergeResolution> getMergeResolution();

    /** The language elements this group owns by value */
    Collection<? extends LanguageElement> getOwnedElements();

    /** The language elements this group owns by reference */
    Collection<? extends LanguageElement> getReferredElements();

}
