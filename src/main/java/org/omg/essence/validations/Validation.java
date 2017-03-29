package org.omg.essence.validations;

/**
 * Validation Interface
 * 
 * @author Daniel Cortes Pichardo
 * @since essence 1.1
 * @version 1.1
 * @param <K>
 */
@FunctionalInterface
public interface Validation<K> {

    ValidationResult test(K param);

    default Validation<K> and(Validation<K> other) {
        return (param) -> {
            ValidationResult firstResult = this.test(param);
            return !firstResult.isvalid() ? firstResult : other.test(param);
        };
    }

    default Validation<K> or(Validation<K> other) {
        return (param) -> {
            ValidationResult firstResult = this.test(param);
            return firstResult.isvalid() ? firstResult : other.test(param);
        };
    }
}