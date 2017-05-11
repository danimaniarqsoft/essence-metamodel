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

import java.util.Collection;

import org.omg.essence.model.alphaandworkproduct.Alpha;

/**
 * <pre>
 * <b>Description: </b>
 * </pre>
 * 
 * The Class ActivitySpace. A placeholder for something to be done in the
 * software engineering endeavor.
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
 * An activity space is a high-level abstraction representing “something to be done”. It uses a (possibly empty) collection of
 * alphas as input to the work. When the work is concluded a collection of alphas (possibly some of the alphas used as
 * input) has been updated. The update may cause a change of the alpha’s state. When the update and the state change of an
 * alpha takes place is not defined; only that it has been done when the activity space is completed.
 * 
 * What should have been accomplished when the work performed in the activity space is completed, i.e., the activity
 * space’s completion criteria, is expressed in terms of which states the output alphas should have reached. Using the
 * checkpoints for the states of alphas, it is at the discretion of the team to decide when a state change has occurred and thus
 * the completion criteria of the activity space have been met.
 * 
 * </pre>
 *
 * @author Daniel Cortes Pichardo
 * @version 1.1
 * @since essence 1.1
 */
public interface ActivitySpace extends AbstractActivity {

    /**
     * A collection of alphas that have to be present to be successful in
     * fulfilling the objectives of this activity space.
     */
    public Collection<? extends Alpha> getInput();

}