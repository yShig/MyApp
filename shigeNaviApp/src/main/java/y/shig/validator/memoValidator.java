package y.shig.validator;

import y.shig.Annotation.Memo;
import y.shig.CommonConst;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by yubei on 2018/03/04.
 */
public class memoValidator implements ConstraintValidator<Memo, String> {

    @Override
    public void initialize(Memo memo) {

    }

    @Override
    public  boolean isValid(String input, ConstraintValidatorContext cxt) {

        if(null==input){

            return false;
        }

        return !CommonConst.FORBIDDUN_WORD.equals(input);
    }
}
