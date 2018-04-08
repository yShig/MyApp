package y.shig.Annotation;

import y.shig.validator.memoValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;
import java.lang.annotation.*;

/**
 * Created by yubei on 2018/03/04.
 */
@Documented
@Constraint(validatedBy = memoValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@ReportAsSingleViolation
public @interface Memo {

    String message() default "いい加減にするのです";
    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
