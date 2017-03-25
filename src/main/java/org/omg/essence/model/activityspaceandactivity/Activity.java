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

import java.util.*;

import org.omg.essence.model.competency.*;

/**
 * <pre>
 * <b>Description: </b>
 * </pre>
 * 
 * The Class Activity. An Activity defines one or more approaches for carrying
 * out some work to be performed and can recommend actions on alphas and/or work
 * products in order to perform this work.
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
 * An activity describes some work to be performed. It is considered completed if all its completion criteria are fulfilled;
 * whether or not this completion was because of performance of the activity or for some other reason. Performing an
 * activity can normally be expected to result in its completion criteria being fulfilled, but this is not guaranteed.
 * 
 * An activity can recommend to perform actions on alphas and/or work products. There is no specific relation between the
 * actions recommended by an activity and its completion criteria. For example, an activity for a Sprint Retrospective
 * according to Scrum will have alpha “Way of Working” as subject for action “modify”, because it is possible that the team
 * decides to change the way of working based on the results of the retrospective. However, there is no specific relationship
 * indicating that the Sprint Retrospective can only be considered complete if the alpha “Way of Working” has reached a
 * certain state, so it will not be listed among the completion criteria. In turn, an activity for monitoring a team’s
 * performance can be considered complete if the team is abandoned, but the activity will never imply any action on the
 * “team” alpha.
 * 
 * The activity is a manifestation of (part of) an activity space through an activity association. The activities filling the same
 * activity space jointly contribute to the achievement of the completion criteria of the activity space. Activities may define
 * different approaches to reach a goal which may imply restrictions on how different activities may be combined. One 
 * activity may be bound to multiple activity spaces within a practice.
 * 
 * The activity may be related to other activities via an activity association. The association indicates a relationship between
 * the activities, such as a work breakdown structure. Activity associations do not constrain the completion of the associated
 * activities.
 * 
 * To be likely to succeed with the activity, the performer(s) of the activity must have at least the competencies required by
 * the activity to be able to perform that activity with a satisfactory result.
 * 
 * </pre>
 *
 * @author Daniel Cortes Pichardo
 * @version 1.1
 * @since essence 1.1
 */
public class Activity extends AbstractActivity {

    /** The approach. */
    public Collection<Approach> approach;

    /** The action. */
    public Collection<Action> action;

    /** The required competency level. */
    public Collection<CompetencyLevel> requiredCompetencyLevel;

}