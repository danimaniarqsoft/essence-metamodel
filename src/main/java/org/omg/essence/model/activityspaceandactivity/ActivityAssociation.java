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

import org.omg.essence.model.foundation.LanguageElement;

/**
 * <pre>
 * <b>Description: </b>
 * </pre>
 * 
 * The Class ActivityAssociation. Activity association is used to represent a
 * relationship or dependency between activities. Generally these dependencies
 * are defined by the practice that defines the activities.
 * 
 * <pre>
 * 
 * <b>Invariant:</b>
 * 
 * {@code
 * -- Activity spaces can only be part of other activity spaces
 * (self.end2.oclIsKindOf(ActivitySpace) and self.kind = “part-of”) implies
 * self.end1.oclIsKindOf(ActivitySpace)
 * }
 * </pre>
 * 
 * <pre>
 * 
 * <b>Semantics:</b>
 * 
 * Activities can be related to each other via activity associations. They define relationships or dependencies between
 * activities, but do not constrain their completion.
 * 
 * If the kind of the association is “part-of”, the first member of the association is considered to be part of the second
 * member in a work breakdown structure. A usual way of using this kind is to assign activities to an activity space they
 * populate.
 * 
 * If the kind of the association is “start-before-start”, it is suggested to start the first member before starting the second
 * member.
 * 
 * If the kind of the association is “start-before-end”, it is suggested to start the first member before finishing the second
 * member.
 * 
 * If the kind of the association is “end-before-start”, it is suggested to finish the first member before starting the second
 * member. This may imply that the second member cannot be started before the first member is finished.
 * 
 * If the kind of the association is “end-before-end”, it is suggested to finish the first member before finishing the second
 * member. This may imply that the second member cannot be finished before the first member is finished.
 * 
 * However, in any case a member is considered complete if its completion criteria are met, independent of the completion
 * of its associated activities.
 * 
 * </pre>
 *
 * @author Daniel Cortes Pichardo
 * @version 1.1
 * @since essence 1.1
 */
public class ActivityAssociation extends LanguageElement {

    /** The first member of the association. */
    public AbstractActivity end2;

    /** The second member of the association. */
    public AbstractActivity end1;

    /** The kind of the association. */
    public String kind;

}