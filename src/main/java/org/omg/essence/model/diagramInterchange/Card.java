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
 * The Class Card.
 *
 * @author Daniel Cortes Pichardo
 * @version 1.1
 * @since essence 1.1
 */
public class Card {

    /** The model element. */
    private BasicElement modelElement;
    
    /** The right header side. */
    private Label rightHeaderSide;
    
    /** The left header side. */
    private Node leftHeaderSide;
    
    /** The left body side. */
    private Diagram leftBodySide;
    
    /** The right body side. */
    private Text rightBodySide;

    public BasicElement getModelElement() {
        return modelElement;
    }

    public void setModelElement(BasicElement modelElement) {
        this.modelElement = modelElement;
    }

    public Label getRightHeaderSide() {
        return rightHeaderSide;
    }

    public void setRightHeaderSide(Label rightHeaderSide) {
        this.rightHeaderSide = rightHeaderSide;
    }

    public Node getLeftHeaderSide() {
        return leftHeaderSide;
    }

    public void setLeftHeaderSide(Node leftHeaderSide) {
        this.leftHeaderSide = leftHeaderSide;
    }

    public Diagram getLeftBodySide() {
        return leftBodySide;
    }

    public void setLeftBodySide(Diagram leftBodySide) {
        this.leftBodySide = leftBodySide;
    }

    public Text getRightBodySide() {
        return rightBodySide;
    }

    public void setRightBodySide(Text rightBodySide) {
        this.rightBodySide = rightBodySide;
    }

}
