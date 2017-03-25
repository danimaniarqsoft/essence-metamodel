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

import org.omg.essence.model.activityspaceandactivity.*;
import org.omg.essence.model.foundation.*;

import java.util.*;

/**
 * <pre>
 * <b>Description: </b>
 * </pre>
 * 
 * The Class Alpha. An essential element that is relevant to an assessment of
 * the progress and health of a software engineering endeavor.
 * 
 * An alpha represents and holds the state of some element, aspect, or
 * abstraction in an endeavor that has a discernible state and knowledge of
 * whose state is required to understand the state of progress and/or health of
 * the endeavor.
 * 
 * The instances of alphas in an endeavor form acyclic graphs. These graphs show
 * how the states of lower level, more granular instances, contribute to and
 * drive the states of the higher level, more abstract, alphas.
 * 
 * <pre>
 * 
 * <b>Invariant:</b>
 * 
 * {@code
 * -- All states of an alpha must have different names.
 * self.states->forAll(s1, s2 | s1 <> s2 implies s1.name <> s2.name)
 * }
 * </pre>
 * 
 * <pre>
 * 
 * <b>Semantics:</b>
 * 
 * Alpha is an acronym that means “Abstract-Level Progress Health Attribute.”
 * 
 * Alphas are subjects whose evolution we want to understand, monitor, direct, and control. The major milestones of a
 * software engineering endeavor can be expressed in terms of the states of a collection of alphas. Thus, alpha state
 * progression means progression towards achieving the objectives of the software engineering endeavor.
 * 
 * An alpha has well-defined states, defining a controlled evolution throughout its lifecycle – from its creation to its
 * termination state. Each state has a collection of checkpoints that describe what the alpha should fulfill in this particular
 * state. Hence it is possible to accurately plan and control their evolution through these states. However, these states are not
 * just one-way linear progressions. Each time you reassess a state, if you do not meet all the checklist items, you can go
 * back to a previous state. You can also iterate through the states multiple times depending on your choice of practices.
 * The linear ordering of states just denotes the usual way of progression.
 * 
 * An alpha may be used as input to an activity space in which the content of the alpha is used when performing the work of
 * the activity space. The alpha (and its state) may be created or updated during the performance of activities in an activity
 * space.
 * 
 * An alpha is often manifested in terms of a collection of work products. These work products are used for documentation
 * and presentation of the alpha. The shape of these work products may be used for concluding the state of the alpha.
 * 
 * Different practices may use different collections of work products to document the same alpha. For example, one practice
 * may document all kinds of requirements in one document, while other practices may use different types of documents.
 * One practice may document both the flow and the presentation of a use case in one document, while another practice may
 * separate the specification of the flow from the specification of the user interface and write them in different documents.
 * 
 * An alpha may contain a collection of other alphas. Together, these sub-alphas contribute to the state of the superordinate
 * alpha. However, there is no explicit relationship between the states of the subordinate alphas and the state of their
 * superordinate alpha.
 * 
 * </pre>
 *
 * @author Daniel Cortes Pichardo
 * @version 1.1
 * @since essence 1.1
 */
public interface Alpha extends BasicElement {

    /** The states of the alpha. */
    Collection<State> getStates();

    /** The action. */
    Collection<Action> getAction();

    /** The activity space. */
    ActivitySpace getActivitySpace();

    /** The alpha containment. */
    Collection<AlphaContainment> getAlphaContainment();

    /** The alpha association. */
    Collection<AlphaAssociation> getAlphaAssociation();

    /** The work product manifest. */
    Collection<WorkProductManifest> getWorkProductManifest();

}