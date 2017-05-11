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

/**
 * <pre>
 * <b>Description: </b>
 * </pre>
 * 
 * The Class Kernel. A kernel is a set of elements used to form a common ground
 * for describing a software engineering endeavor. A kernel is an element group
 * that names the basic concepts (i.e., alphas, activity spaces and
 * competencies) for a domain (e.g., Software Engineering).
 * 
 * <pre>
 * 
 * <b>Invariant:</b>
 * 
 * {@code
 * -- A kernel can only contain alphas, alpha associations, alpha containments,
 * activity spaces, competencies, kernels, extension elements, and merge
 * resolutions.
 * 
 * self.referredElements->union(self.ownedElements)->forAll (e |
 * e.oclIsKindOf(Alpha) or e.oclIsKindOf(AlphaAssociation) or
 * e.oclIsKindOf(AlphaContainment) or e.oclIsKindOf(ActivitySpace) or
 * e.oclIsKindOf(Competency) or e.oclIsKindOf(Kernel) or
 * e.oclIsKindOf(ExtensionElement) or e.oclIsKindOf(MergeResolution))
 * 
 * -- The alphas associated by alpha associations are available within the kernel or
 * -- its referred kernels.
 * self.allElements(AlphaAssociation)->forAll (aa | self.allElements(Alpha)
 * ->includes (aa.end1) and self.allElements(Alpha)->includes (aa.end2))
 * 
 * -- All input alphas of the activity spaces are available within the
 * -- kernel or its referred kernels.
 * self.allElements(ActivitySpace)->forAll (as | self.allElements(Alpha)
 * ->includesAll(as.input))
 * 
 * -- Completion criteria are only expressed in terms of states which belong to
 * alphas which are available in the kernel or its referred kernels.
 * self.allElements(ActivitySpace)->forAll (as | as.completionCriterion->forAll (cc
 * | cc.state<> null and cc.workProduct = null and self.allElements(Alpha)->exists(a
 * | a.states->includes(cc.state))))
 * }
 * </pre>
 * 
 * <pre>
 * 
 * <b>Semantics:</b>
 * 
 * A kernel is a kind of domain model. It defines important concepts that are general to everyone when working in that
 * domain, like software engineering development.
 * 
 * A kernel may be defined including references to other kernels. For example, a more basic kernel may contain elements
 * that are meaningful to the domain of “Software Engineering” and that may be used in the specific context of “Software
 * Engineering for safety critical” domains as defined by a referring kernel.
 * 
 * A kernel is closed in that elements in the kernel may only refer to elements which are also part of the kernel or its
 * referred kernels.
 * 
 * </pre>
 *
 * @author Daniel Cortes Pichardo
 * @version 1.1
 * @since essence 1.1
 */
public interface Kernel extends ElementGroup {

    /** The referring method. */
    Collection<? extends Method> getReferringMethod();

    /**
     * A set of rules on the consistency of a particular Kernel. The format for
     * writing these rules is out of the scope of this specification. It is
     * recommended to use either plain text or OCL.
     */
    String getConsistencyRules();

}
