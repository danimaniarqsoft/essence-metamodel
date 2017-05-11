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
package org.omg.essence.model.competency;

import java.util.*;

import org.omg.essence.model.foundation.*;

/**
 * <pre>
 * <b>Description: </b>
 * </pre>
 * 
 * The Class Competency. A competency encompasses the abilities, capabilities,
 * attainments, knowledge, and skills necessary to do a certain kind of work. It
 * is assumed that for each team member a level of competency for each
 * individual competency can be named or determined.
 * 
 * <pre>
 * 
 * <b>Invariant:</b>
 * 
 * {@code
 * -- The possible levels are distinct
 * self.possibleLevel->forAll (l1, l2 | l1 <> l2 implies (l1.level <> l2.level and
 * l1.name <> l2.name))
 * }
 * </pre>
 * 
 * <pre>
 * <b>Semantics:</b>
 * 
 * A competency is used for defining a capability of being able to work in a
 * specific area. In the same way as an Alpha is an abstract thing to monitor
 * and control and an Activity Space is an abstraction of what to do, a
 * Competency is an abstract collection of knowledge, abilities, attitudes, and
 * skills needed to perform a certain kind of work.
 * 
 * </pre>
 *
 * @author Daniel Cortes Pichardo
 * @version 1.1
 * @since essence 1.1
 */
public interface Competency extends BasicElement {

    /** A collection of levels defined for this competency. */
    Collection<? extends CompetencyLevel> getPossibleLevel();
    
}
