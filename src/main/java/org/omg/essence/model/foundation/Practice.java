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
 * The Class Practice. A practice is a repeatable approach to doing something
 * with a specific objective in mind. A practice describes how to handle a
 * specific aspect of a software engineering endeavor, including the
 * descriptions of all relevant elements necessary to express the desired work
 * guidance that is required to achieve the purpose of the practice. A practice
 * can be defined as a composition of other practices.
 * 
 * <pre>
 * 
 * <b>Invariant:</b>
 * 
 * {@code
 * -- The alphas and the work products associated by the work product manifests are
 * -- visible within the practice.
 * self.allElements(WorkProductManifest)->forAll (wpm |
 * self.allElements(Alpha)->includes (wpm.alpha) and
 * self.allElements(WorkProduct)->includes (wpm.workProduct)
 * 
 * -- Associated activities are visible within the practice.
 * self.allElements(ActivityAssociation)->forAll (a | (self.allElements(Activity)
 * ->includes(a.end1) or self.allElements(ActivitySpace)->includes(a.end1)) and
 * (self.allElements(Activity)->includes(a.end2) or self.allElements(ActivitySpace)
 * ->includes(a.end2)))
 * 
 * -- All alphas and work products involved in actions of activities are
 * -- available within the practice.
 * self.allElements(Activity)->forAll (a | a.action->forAll ( ac |
 * self.allElements(WorkProduct)->includesAll (ac.workProduct) and
 * self.allElements(Alpha)->includesAll (ac.alpha))
 * 
 * -- Completion criteria are only expressed in terms of states which belong to
 * alphas or levels of detail which belong to work products which are available in
 * the practice.
 * self.allElements(ActivitySpace)->forAll (as | as.completionCriterion->forAll (cc
 * | (cc.state<> null and cc.levelOfDetail = null and self.allElements(Alpha)
 * ->exists(a | a.states->includes(cc.state))) or (cc.state = null and
 * cc.levelOfDetail<> null and self.allElements(WorkProduct)->exists(wp |
 * wp.levelsOfDetail->includes(cc.workProduct)))))
 * 
 * -- The activities’ required competencies are visible within the practice. 
 * self.allElements(Activity)->forAll(a | self.allElements(Competency)->exists (c |
 * c.possibleLevel->includes (a.requiredCompetencyLevel))
 * 
 * -- All elements associated with a patterns are visible within the practice.
 * self.allElements(Pattern)->forAll (p | p.associations->forAll (pa | pa.elements
 * ->forall (pae | self.allElements(pae.oclType)->includes(pae))
 * }
 * </pre>
 * 
 * <pre>
 * 
 * <b>Semantics:</b>
 * 
 * 
 * A practice addresses a specific aspect of development or teamwork. It provides the guidance to characterize the problem,
 * the strategy to solve the problem, and instructions to verify that the problem has indeed been addressed. It also describes
 * what supporting evidence, if any, is needed and how to make the strategy work in real life.
 * 
 * A practice provides a systematic and repeatable way of work focused on the achievement of an objective. When the
 * practice is made up by activities, the completion criteria derived from them are used to verify if the produced result
 * achieves the practice’s objective. To evaluate the practice performance and the objectives’ achievement, selected
 * measures can be associated to it. Measures are estimated and collected during the practice execution.
 * 
 * As might be expected, there are several different kinds of practices to address all different areas of development and
 * teamwork, including (but not limited to):
 * </pre>
 * <ul>
 * <li>Development Practices – such as practices for developing components,
 * designing user interfaces, establishing an architecture, planning and
 * assessing iterations, or estimating effort.</li>
 * <li>Social Practices – such as practices on teamwork, collaboration, or
 * communication</li>
 * <li>Organizational Practices – such as practices on milestones, gateway
 * reviews, or financial controls.</li>
 * </ul>
 * 
 * <pre>
 * 
 * Except trivial examples, a practice does not capture all aspects of how to perform a development effort. Instead, the
 * practice addresses only one aspect of it. To achieve a complete description, practices can be composed. The result of
 * composing two practices is another practice capturing all aspect of the composed ones. In this way, more complete and
 * powerful practices can be created, eventually ending up with one that describes how an effort is to be performed, i.e., a
 * method.
 * 
 * The definition of a practice may be based on elements defined in a kernel. These elements, like alphas, may be used (and
 * extended) when defining elements specific to the practice, like work products.
 * 
 * A practice may be a composition of other practices. All elements of the other practices are merged and the result becomes
 * a new practice (see 9.4 for the definition of composition).
 * 
 * A practice is closed in that elements in the practice may only refer to elements which are also part of the practice or the
 * element groups this practice relates to.
 * 
 * </pre>
 * 
 * @author Daniel Cortes Pichardo
 * @version 1.1
 * @since essence 1.1
 */
public interface Practice extends ElementGroup {

    /**
     * Rules on the consistency of a particular Practice. The format for writing
     * these rules is out of the scope of this specification. It is recommended
     * to use either plain text or OCL.
     */
    String getConsistencyRules();

    /**
     * The objective of this Practice, expressed as a concise and isolated
     * phrase. The content of this attribute should be an explicit and short
     * statement that describes the goal that the practice pursues. Additional
     * explanations can be given in the attribute “description” inherited from
     * “ElementGroup”.
     */
    String getObjective();

    /**
     * List of standard units used to evaluate the practice performance and the
     * objectives’ achievement.
     */
    Collection<String> getMeasures();

    /**
     * Expected characteristics of elements needed to start the execution of a
     * practice.
     */
    Collection<String> getEntry();

    /**
     * Expected characteristics of elements required as outputs after the
     * execution a practice is completed.
     */
    Collection<String> getResult();

}
