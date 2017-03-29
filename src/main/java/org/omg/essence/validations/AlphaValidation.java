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
package org.omg.essence.validations;

import static org.omg.essence.util.CommonValidations.notNull;

import java.util.Collection;

import org.omg.essence.exception.InvariantException;
import org.omg.essence.model.alphaandworkproduct.Alpha;
import org.omg.essence.model.alphaandworkproduct.State;
import org.omg.essence.util.ValidationMessages;

public class AlphaValidation implements Validator<Alpha> {

    @Override
    public void validate(Alpha alpha) {
        if (!validateAlpha(alpha)) {
            throw new InvariantException(ValidationMessages.Alpha.INVARIANT_EXCEPTION);
        }

    }

    public static boolean validateAlpha(Alpha alpha) {
        notNull(alpha.getStates(), ValidationMessages.Alpha.PROPERTY_STATES);
        for (State currentState : alpha.getStates()) {
            if (containsState(currentState, alpha.getStates())) {
                return false;
            }
        }
        return true;
    }

    public static boolean containsState(State target, Collection<State> stateCollection) {
        for (State state : stateCollection) {
            if (target != state && target.getName().equals(state.getName())) {
                return true;
            }
        }
        return false;
    }
}
