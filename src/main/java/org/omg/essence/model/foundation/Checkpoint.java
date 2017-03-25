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

import org.omg.essence.model.alphaandworkproduct.*;
import org.omg.essence.model.competency.*;

/**
 * <pre>
 * <b>Description: </b>
 * </pre>
 * 
 * The Class Checkpoint. A condition that can be tested as true or false that
 * contributes to the determination of whether a state (of an alpha) or a level
 * of detail (of a work product) or a competency level has been attained.
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
 * Checkpoints are used as follows:
 * </pre>
 * <ul>
 * <li>The checkpoints of an alpha state are joined by AND. The state of an
 * alpha is deemed to be the most advanced (favourable) state for which all
 * checkpoints are true.</li>
 * <li>The checkpoints of a work product level of detail are joined by OR. The
 * level of detail of a work product is deemed to be the most detailed level for
 * which at least one checkpoint is true.</li>
 * </ul>
 *
 * @author Daniel Cortes Pichardo
 * @version 1.1
 * @since essence 1.1
 */
public class Checkpoint extends LanguageElement {

    /** The name of the checkpoint. */
    private String name;

    /** A description of the checkpoint. */
    private String description;

    /** An optional abbreviated version of the full description. */
    private String shortDescription;

    /** The level. */
    private LevelOfDetail level;

    /** The state. */
    private State state;

    /** The competency level. */
    private CompetencyLevel competencyLevel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public LevelOfDetail getLevel() {
        return level;
    }

    public void setLevel(LevelOfDetail level) {
        this.level = level;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public CompetencyLevel getCompetencyLevel() {
        return competencyLevel;
    }

    public void setCompetencyLevel(CompetencyLevel competencyLevel) {
        this.competencyLevel = competencyLevel;
    }

}