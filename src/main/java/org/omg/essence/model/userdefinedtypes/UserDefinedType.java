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
package org.omg.essence.model.userdefinedtypes;

import java.util.*;

import org.omg.essence.model.foundation.*;

/**
 * <pre>
 * <b>Description: </b>
 * </pre>
 * 
 * The Class UserDefinedType. A user defined type is a named type containing a
 * description and constraints that can be used to detail patterns, resources,
 * and tags.
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
 *User defined types are intended to detail, explain, and constrain the proper usage of particular patterns, resources, or tags.
 *
 *The constraints defined by the type are meant to be evaluated on each typed element that is associated with this type.
 *Elements on which the evaluation fails are considered ill-defined. For example, a constraint on a type called “triary
 *pattern” could express that this type is intended to be used on typed patterns with at exactly three pattern associations.
 *Hence, using this type on other elements than typed patterns would be reported as ill-defined usage. Similarly, using this
 *type on a typed pattern with more or less than three pattern associations would also be ill-defined usage.
 *
 * </pre>
 *
 * @author Daniel Cortes Pichardo
 * @version 1.1
 * @since essence 1.1
 */
public interface UserDefinedType extends LanguageElement {

    /** The name of the type. */
    String getName();

    /** A short description of what the type is about. */
    String getDescription();

    /**
     * Rules that apply to all constructs using this type. It is recommended to
     * use either plain text or OCL.
     */
    String getConstraint();

    /** The typed resource. */
    Collection<? extends TypedResource> getTypedResource();

    /** The typed pattern. */
    Collection<? extends TypedPattern> getTypedPattern();

    /** The typed tag. */
    Collection<? extends TypedTag> getTypedTag();

}
