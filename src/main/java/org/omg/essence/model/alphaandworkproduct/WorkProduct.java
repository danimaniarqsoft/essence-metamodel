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
 * The Class WorkProduct. A work product is an artifact of value and relevance
 * for a software engineering endeavor. A work product may be a document or a
 * piece of software, but also other created entities such as:<br>
 * <br>
 * - Creation of a test environment<br>
 * - Delivery of a training course<br>
 * 
 * <pre>
 * 
 * <b>Invariant:</b>
 * 
 * {@code
 * -- All levels of detail of a work product must have different names
 * self.levelOfDetail->forAll(l1, l2 | l1 <> l2 implies l1.name <> l2.name)
 * }
 * </pre>
 * 
 * <pre>
 * 
 * <b>Semantics:</b>
 * 
 * A work product is a concrete representation of an alpha. It may take several work products to describe the alpha from all
 * different aspects.
 * 
 * A work product can be of many different types such as models, documents, specifications, code, tests, executables,
 * spreadsheets, as well as other types of artifacts. In fact, some work products may even be tacit (conversations, memories,
 * and other intangibles).
 * 
 * Work products may be created, modified, used, or deleted during an endeavor. Some work products constitute the result
 * of (the deliverables from) the endeavor and some are used as input to the endeavor.
 * 
 * A work product could be described at different levels of details, like overview, user level, or all details level.
 * 
 * </pre>
 *
 * @author Daniel Cortes Pichardo
 * @version 1.1
 * @since essence 1.1
 */
public interface WorkProduct extends BasicElement {

    /** The level of details defined for the work product. */
    Collection<? extends LevelOfDetail> getLevelOfDetail();

    /** The action. */
    Collection<? extends Action> getAction();

    /** The work product manifest. */
    Collection<? extends WorkProductManifest> getWorkProductManifest();

}
