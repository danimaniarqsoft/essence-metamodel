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
 * The Class Resource. A source of information or content, such as a website,
 * that is outside the Essence model and referenced from it, for instance by a
 * URL
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
 * Resources are used to make information available from an Essence model without translating this information into terms
 * of Essence elements and their attributes explicitly. This can for instance be used if the formal model should be kept small
 * for some reason while storing additional information informally in resources. It can also be used if a complex practice or
 * method is to be adopted partially in Essence, while the full practice or method description lives as an external resource
 * outside the Essence model.
 * 
 * Resources are also used to attach external objects like templates, tools, study material, or similar to language elements.
 * 
 * </pre>
 *
 * @author Daniel Cortes Pichardo
 * @version 1.1
 * @since essence 1.1
 */
public class Resource extends LanguageElement {

    /**
     * A reference to the content of the resource. The reference can be provided
     * in any suitable way, e.g., as a hyperlink or as a full text document.
     */
    public String content;

    /** The language element */
    public LanguageElement languageElement;

}