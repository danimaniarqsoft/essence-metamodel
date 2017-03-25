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

import org.omg.essence.model.view.*;

/**
 * <pre>
 * <b>Description: </b>
 * </pre>
 * 
 * The Class LanguageElement. Abstract superclass for an Essence concept.
 * 
 * <pre>
 * 
 * <b>Invariant:</b>
 * 
 * {@code
 * -- All language elements that are not element groups need an owner
 * (not self.oclIsKindOf(ElementGroup)) implies owner <> null
 * 
 * -- Each and every instance of LanguageElement may be related to each other via
 * endeavor associations
 * LanguageElement::allInstances->forAll(e1,e2 : LanguageElement |
 * EndeavorAssociation::allInstances->exists(a: EndeavorAssociation | a.memberEnd
 * ->exists(p1,p2 : EndeavorProperty | p1.languageElement=e1 and
 * p2.languageElement=e2)))
 * 
 * }
 * </pre>
 * 
 * <pre>
 * 
 * <b>Semantics:</b>
 * 
 * Language element is the root for all basic elements, auxiliary elements and element groups. It defines the concepts within
 * the Essence language that can be grouped to build composite entities such as Kernels and Practices.
 * 
 * </pre>
 *
 * @author Daniel Cortes Pichardo
 * @version 1.1
 * @since essence 1.1
 */
public abstract class LanguageElement {

    /**
     * A flag indicating whether this element may be suppressed in an extension
     * or composition (see 9.4.3.2 on the essence standard)
     */
    public boolean isSuppressable = true;

    /** The element group that owns this language element */
    public ElementGroup owner;

    /** Tags associated with this language element */
    public Collection<Tag> tag;

    /** Resources associated with this language element. */
    public Collection<Resource> resource;

    /**
     * Properties (defined at M1 level) that you want to track during the
     * endeavor.
     */
    public Collection<EndeavorProperty> properties;

    /**
     * A list of ViewSelection selects a subset of constructs and construct
     * features such as attributes and associations.
     */
    public Collection<ViewSelection> viewSelection;

    /** The feature selection. */
    public Collection<FeatureSelection> featureSelection;

    /** The extension. */
    public Collection<ExtensionElement> extension;

    /** The referrer. */
    public Collection<ElementGroup> referrer;

    /** The pattern association. */
    public Collection<PatternAssociation> patternAssociation;

}