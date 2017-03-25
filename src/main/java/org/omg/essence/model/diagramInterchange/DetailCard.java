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
package org.omg.essence.model.diagramInterchange;

import org.omg.essence.model.foundation.*;

/**
 * The Class DetailCard.
 *
 * @author Daniel Cortes Pichardo
 * @version 1.1
 * @since essence 1.1
 */
public class DetailCard {

    /** The left header side. */
    private Node leftHeaderSide;
    
    /** The footer. */
    private Label footer;
    
    /** The header. */
    private Node header;
    
    /** The body. */
    private Text body;
    
    /** The model element. */
    private BasicElement modelElement;

    public Node getLeftHeaderSide() {
        return leftHeaderSide;
    }

    public void setLeftHeaderSide(Node leftHeaderSide) {
        this.leftHeaderSide = leftHeaderSide;
    }

    public Label getFooter() {
        return footer;
    }

    public void setFooter(Label footer) {
        this.footer = footer;
    }

    public Node getHeader() {
        return header;
    }

    public void setHeader(Node header) {
        this.header = header;
    }

    public Text getBody() {
        return body;
    }

    public void setBody(Text body) {
        this.body = body;
    }

    public BasicElement getModelElement() {
        return modelElement;
    }

    public void setModelElement(BasicElement modelElement) {
        this.modelElement = modelElement;
    }

}
