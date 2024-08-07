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

/**
 * <pre>
 * <b>Description: </b>
 * </pre>
 * 
 * The Class EntryCriterion. EntryCriterion specializes Criterion and must be
 * satisfied before work of an activity can be started.
 * 
 * <pre>
 * 
 * <b>Invariant:</b> 
 * see {@link Criterion}
 * </pre>
 * 
 * <pre>
 * 
 * <b>Semantics:</b>
 * 
 * An entry criterion is fulfilled when the alpha state or work product level of detail defined by the entry criterion is
 * reached. The work of an activity may be started when all its entry criteria are fulfilled. The work of an activity space may
 * be started when one or more of its entry criteria are fulfilled; the work started (by activities in the activity space) can only
 * be done in relation to the alphas that fulfill the entry criteria.
 * 
 * </pre>
 *
 * @author Daniel Cortes Pichardo
 * @version 1.1
 * @since essence 1.1
 */
public class EntryCriterion extends Criterion {
}