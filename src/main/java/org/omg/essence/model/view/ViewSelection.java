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
package org.omg.essence.model.view;

import java.util.*;

import org.omg.essence.model.foundation.*;

/**
 * <pre>
 * <b>Description: </b>
 * </pre>
 * 
 * The Class ViewSelection. A ViewSelection selects a subset of constructs and
 * construct features such as attributes and associations.
 * 
 * <pre>
 * 
 * <b>Invariant:</b>
 * 
 * {@code
 * -- The featureSelections in a ViewSelection V refers to constructs that are
 * part of constructSelections in V. self.featureSelection->forAll(fs |
 * self.constructSelection -> inludes(fs.construct))
 * }
 * </pre>
 * 
 * <pre>
 * 
 * <b>Semantics:</b>
 * 
 * A feature selection names a feature (property or association) from a language construct which is to be included in a view.
 * The feature is identified by its name, since property and association names are unique within a language element. If a
 * feature with the given name does not exist, this feature selection does not contribute anything to the view.
 * 
 * </pre>
 *
 * @author Daniel Cortes Pichardo
 * @version 1.1
 * @since essence 1.1
 */
public class ViewSelection extends LanguageElement {

    /** The name of the view. */
    private String name;

    /** A description of the view, including the purpose of the view. */
    private String description;

    /** The referring view selection. */
    private Collection<ViewSelection> referringViewSelection;

    /**
     * The selected constructs (such as Alpha, State, etc) to be included in the
     * view.
     */
    private Collection<LanguageElement> constructSelection;

    /**
     * ViewSelections to be included in this ViewSelection (provides a means to
     * build extended and more sophisticated views based on existing/smaller
     * views)
     */
    private Collection<ViewSelection> includedViewSelection;

    /**
     * The selected features, such as attributes and associations of constructs
     * to be included in the view.
     */
    private Collection<FeatureSelection> featureSelection;

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

    public Collection<ViewSelection> getReferringViewSelection() {
        return referringViewSelection;
    }

    public void setReferringViewSelection(Collection<ViewSelection> referringViewSelection) {
        this.referringViewSelection = referringViewSelection;
    }

    public Collection<LanguageElement> getConstructSelection() {
        return constructSelection;
    }

    public void setConstructSelection(Collection<LanguageElement> constructSelection) {
        this.constructSelection = constructSelection;
    }

    public Collection<ViewSelection> getIncludedViewSelection() {
        return includedViewSelection;
    }

    public void setIncludedViewSelection(Collection<ViewSelection> includedViewSelection) {
        this.includedViewSelection = includedViewSelection;
    }

    @Override
    public Collection<FeatureSelection> getFeatureSelection() {
        return featureSelection;
    }

    @Override
    public void setFeatureSelection(Collection<FeatureSelection> featureSelection) {
        this.featureSelection = featureSelection;
    }

}
