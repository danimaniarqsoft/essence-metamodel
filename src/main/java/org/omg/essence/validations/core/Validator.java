package org.omg.essence.validations.core;

/**
 * Validation Interface
 * 
 * @author Daniel Cortes Pichardo
 * @since essence 1.1
 * @version 1.1
 * @param <K>
 */
@FunctionalInterface
public interface Validator<K> {

    ValidationResult validate(K param);

    default Validator<K> and(Validator<K> other) {
        return (param) -> {
            ValidationResult firstResult = this.validate(param);
            return !firstResult.isValid() ? firstResult : other.validate(param);
        };
    }

    default Validator<K> or(Validator<K> other) {
        return (param) -> {
            ValidationResult firstResult = this.validate(param);
            return firstResult.isValid() ? firstResult : other.validate(param);
        };
    }
}
