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
package org.omg.essence.model.activityspaceandactivity;

import org.omg.essence.model.alphaandworkproduct.*;
import org.omg.essence.model.foundation.*;

/**
 * <pre>
 * <b>Description: </b>
 * </pre>
 * 
 * The Class Criterion. A condition that can be tested as true or false that
 * contributes to the determination of whether an activity or an activity space
 * may be entered or is complete. A criterion is expressed in terms of the state
 * of an alpha or the level of detail of a work product. The abstract Criterion
 * must be specialized by EntryCriterion or Completion Criterion.
 * 
 * <pre>
 * 
 * <b>Invariant:</b>
 * 
 * {@code
 * -- A criterion addresses either a state or a level of detail 
 * (self.state<> null and levelOfDetail = null) or (self.state = null and
 * levelOfDetail<> null)
 * }
 * </pre>
 *  
 * <pre>
 * 
 * <b>Semantics:</b>
 * 
 * Criterion specifies a condition that must be met to enter an activity or activity space; or to consider the work in an
 * activity or activity space complete. Criterion must be specialized by either EntryCriterion or CompletionCriterion. The
 * work of an activity or activity space is considered complete when its completion criteria are fulfilled, i.e., when the alpha
 * states or work product levels of detail defined by the completion criteria are reached.
 * 
 * </pre>
 *
 * @author Daniel Cortes Pichardo
 * @version 1.1
 * @since essence 1.1
 */
public abstract class Criterion extends LanguageElement {

    /** The activity. */
    public AbstractActivity activity;

    /** A state to be reached. */
    public State state;

    /** A level of detail to be reached. */
    public LevelOfDetail levelOfDetail;

    /** The description of the Criterion */
    public String description;

}