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

import java.util.*;

/**
 * <pre>
 * <b>Description: </b>
 * </pre>
 * 
 * The Class Action. An operation performed by an activity on a particular work
 * product.
 * 
 * <pre>
 * 
 * <b>Invariant:</b>
 * 
 * {@code
 * -- The action touches either alphas or work products, but not both nor nothing
 * (self.alpha->isEmpty() implies self.workProduct->notEmpty()) and (self.alpha
 * ->notEmpty() implies self.workProduct->isEmpty())
 * }
 * </pre>
 * 
 * <pre>
 * 
 * <b>Semantics:</b>
 * 
 * Activities may involve work products in different ways. In an action, one of four possible operations can be specified that
 * an activity performs on a work product:
 * </pre>
 * <ul>
 * <li><b>“create”:</b> The activity creates the work product. It is likely to
 * use this kind of operation in activities that set up an environment or create
 * initial version of work products.</li>
 * <li><b>“read”:</b> The activity reads the work product but does not change
 * it. This kind of operation assumes that the work product needs to be present
 * to be successful in this activity. It is likely to use this kind of operation
 * in activities that transform contents from one work product into other work
 * products.</li>
 * <li><b>“update”:</b> The activity possibly modifies the work product. In an
 * actual endeavor, there may be cases in which no modification is necessary,
 * but there is at least one case in which the work product has changed after
 * performing the activity. This kind of operation assumes that the work product
 * needs to be present to be successful in this activity.</li>
 * <li><b>“delete”:</b> The activity deletes the work product. This kind of
 * operation assumes that the work product no longer exists if the activity is
 * completed successfully. Note that deleted work products cannot be covered by
 * completion criteria. It is likely to use this kind of operation in activities
 * that finalize an endeavor and thus remove intermediate results for privacy or
 * security reasons.</li>
 * </ul>
 *
 * @author Daniel Cortes Pichardo
 * @version 1.1
 * @since essence 1.1
 */
public interface Action extends LanguageElement {

    /** The activity. */
    Activity getActivity();

    /** The alpha. */
    Collection<Alpha> getAlpha();

    /** The work product. */
    Collection<WorkProduct> getWorkProduct();

    /** The kind. */
    ActionKind getKind();

}