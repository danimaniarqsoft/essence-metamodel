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
package org.omg.essence.model.competency;

import java.util.Collection;

import org.omg.essence.model.activityspaceandactivity.Activity;
import org.omg.essence.model.foundation.Checkpoint;
import org.omg.essence.model.foundation.LanguageElement;

/**
 * <pre>
 * <b>Description: </b>
 * </pre>
 * 
 * The Class CompetencyLevel. A competency level defines a level of how
 * competent or able a team member is with respect to the abilities,
 * capabilities, attainments, knowledge, or skills defined by the respective
 * competency.
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
 * Competency levels are used to create a range of abilities from poor to excellent or small scale to large scale. While a
 * competency describes what capabilities are needed (such as “Analyst” or “Developer”), a competency level adds a
 * qualitative grading to them. Typically, the levels range from 0 – no competence to 5 – expert. (such as “basic”,
 * “advanced”, or “excellent”).
 * 
 * </pre>
 *
 * @author Daniel Cortes Pichardo
 * @version 1.1
 * @since essence 1.1
 */
public interface CompetencyLevel extends LanguageElement {

    /** The name of the competency level */
    String getName();

    /** A short description of what the competency level is */
    String getBriefDescription();

    /**
     * A numeric indicator for the level, where a higher number means
     * more/better competence.
     */
    int getLevel();

    /** The activity. */
    Collection<? extends Activity> getActivity();

    /** The competency. */
    Competency getCompetency();

    /** The checklist item. */
    Collection<? extends Checkpoint> getChecklistItem();

}
