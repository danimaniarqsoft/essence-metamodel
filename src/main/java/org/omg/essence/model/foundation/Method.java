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

/**
 * <pre>
 * <b>Description: </b>
 * </pre>
 * 
 * The Class Method. A Method is the composition of a Kernel and a set of
 * Practices to fulfill a specific purpose.
 * 
 * <pre>
 * 
 * <b>Invariant:</b>
 * 
 * {@code
 * -- A method can only contain practices.
 * self.referredElements->forAll (e | e.oclIsKindOf(Practice)) and
 * self.ownedElements->forAll (e | e.oclIsKindOf(Practice))
 * }
 * </pre>
 * 
 * <pre>
 * 
 * <b>Semantics:</b>
 * 
 * A method contains a set of practices to express the practitioners’ way of working in order to fulfill a specific purpose. The
 * method purpose should consider the stakeholder needs, particular conditions, and the desired software product. The set of
 * practices that makes up a method should contribute and be sufficient to the achievement of this purpose.
 * 
 * For example, a method purpose can be related to developing, maintaining, or integrating a software product.
 * 
 * The set of practices, that articulate a method, should satisfy the coherence, consistency, and completeness properties. The
 * set of practices is coherent if the objective of each practice contributes to the entire method purpose, is consistent if each
 * of its entries and results are interrelated and useful. Finally, it is complete if the achievement of all practice objectives
 * fulfills entirely the method purpose and produces expected output.
 * 
 * Those properties are most likely not true from the beginning while authoring a method.
 * 
 * </pre>
 *
 * @author Daniel Cortes Pichardo
 * @version 1.1
 * @since essence 1.1
 */
public class Method extends ElementGroup {

    /**
     * The purpose of this Method. The content of this attribute should be an
     * explicit short statement that describes the goal that the method pursues.
     * Additional explanations can be given in the attribute “description”
     * inherited from “ElementGroup”.
     */
    public String purpose;

    /** The Kernel this Method is based on */
    public Kernel baseKernel;

}