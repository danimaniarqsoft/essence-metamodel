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

/**
 * <pre>
 * <b>Description: </b>
 * </pre>
 * 
 * The Enum ActionKind. Enumeration of all supported Actions.<br><br>
 * 
 * <b>create:</b> Indicates a create Action <br>
 * <b>read:</b> Indicates a read Action<br>
 * <b>update:</b> Indicates an update Action<br> 
 * <b>delete:</b> Indicates a delete Action
 * <pre>
 * 
 * <b>Semantics:</b>
 * 
 * See clause 9.3.4.3 Action for a details on the indicated Actions.
 * 
 * </pre>
 * 
 * @see Action for a details on the indicated Actions.
 *
 * @author Daniel Cortes Pichardo
 * @version 1.1
 * @since essence 1.1
 */
public enum ActionKind {

    /** Indicates a delete Action */
    DELETE,

    /** Indicates a create Action */
    CREATE,

    /** Indicates a read Action */
    READ,

    /** Indicates an update Action */
    UPDATE
}
