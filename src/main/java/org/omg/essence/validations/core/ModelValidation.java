package org.omg.essence.validations.core;

import java.util.function.Predicate;

/**
 * ModelValidation used in order to validate LanguageElements. The intent of
 * this class is to be used as a helper to create custom validation.
 * 
 * 
 * @author Daniel Cortes Pichardo
 * @since essence 1.1
 * @version 1.1
 * @param <K>
 */
public class ModelValidation<K> implements Validator<K> {

    private Predicate<K> predicate;
    private String onErrorMessage;

    /**
     * Constructor
     * 
     * @param predicate
     * @param onErrorMessage
     */
    private ModelValidation(Predicate<K> predicate, String onErrorMessage) {
        this.predicate = predicate;
        this.onErrorMessage = onErrorMessage;
    }

    public static <K> ModelValidation<K> from(Predicate<K> predicate, String onErrorMessage) {
        return new ModelValidation<>(predicate, onErrorMessage);
    }

    @Override
    public ValidationResult validate(K param) {
        return predicate.test(param) ? ValidationResult.ok() : ValidationResult.fail(onErrorMessage);
    }

}