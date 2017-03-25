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
 * The Class LevelOfDetail. A specification of the amount of detail or range of
 * content in a work product. The level of detail of a work product is
 * determined by evaluating checklist items.
 * 
 * <pre>
 * 
 * <b>Invariant:</b>
 * 
 * {@code
 * -- All checkpoints of a level of detail must have different names
 * self.checkListItem->forAll(i1, i2 | i1 <> i2 implies i1.name <> i2.name)
 * 
 * -- A level of detail may not be its own direct or indirect successor
 * self.allSuccessors()->excludes(self)
 * }
 * </pre>
 * 
 * <pre>
 * 
 * <b>Additional Operation:</b>
 * 
 * {@code
 * -- All successors of a level of detail
 * context LevelOfDetail::allSuccessors : Set(LevelOfDetail)
 * body: Set{self.successor}->union(self.successor.allSuccessors())
 * }
 * </pre>
 * 
 * <pre>
 * 
 * <b>Semantics:</b>
 * 
 * Levels of detail describe the amount and granularity of information that is present in a work product. For example, they
 * allow to distinguish between a sketch of a system architecture, a formally modeled system architecture, and an annotated
 * system architecture which is ready for code generation. It depends on the practice which of these levels is considered
 * sufficiently detailed.
 * 
 * It is important to note that levels of detail are not concerned with the completeness of a work product. A work product
 * can be considered complete for the purpose of the endeavor without being in the most advanced level of detail. In turn, a
 * work product can be in the most advanced level of detail, but not yet been completed.
 * 
 * </pre>
 *
 * @author Daniel Cortes Pichardo
 * @version 1.1
 * @since essence 1.1
 */
public interface LevelOfDetail extends LanguageElement {

    /** A description of the level of detail. */
    String getDescription();

    /**
     * Boolean value determined by the practice (author) to indicate the
     * sufficient level of detail. Name of the level of detail.
     */
    boolean isSufficientLevel();

    /** Name of the level of detail. */
    String getName();

    /** Checklist items to determine if the level of detail has been reached. */
    Collection<Checkpoint> getCheckListItem();

    /** Next level of detail. */
    LevelOfDetail getSuccessor();

    /** The criterion. */
    Collection<Criterion> getCriterion();

    /** The predecessor. */
    LevelOfDetail getPredecessor();

    /** The work product. */
    WorkProduct getWorkProduct();

}