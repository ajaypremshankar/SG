/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;
import org.apache.commons.validator.Field;
import org.apache.commons.validator.GenericValidator;
import org.apache.commons.validator.ValidatorAction;
import org.apache.commons.validator.util.ValidatorUtils;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.validator.Resources;

/**
 *
 * @author ajay prem shankar
 */
public class ValidateTwoField {
public static boolean validateTwoFields(Object bean, ValidatorAction va,
                                        Field field, ActionErrors errors,
                                        HttpServletRequest request) {
    String value =
        ValidatorUtils.getValueAsString(bean, field.getProperty());
    String sProperty2 = field.getVarValue("secondProperty");
    String value2 = ValidatorUtils.getValueAsString(bean, sProperty2);

    if (!GenericValidator.isBlankOrNull(value)) {
        try {
            if (!value.equals(value2)) {
                errors.add(field.getKey(),
                           Resources.getActionMessage(request, va, field));

                return false;
            }
        } catch (Exception e) {
            errors.add(field.getKey(),
                       Resources.getActionMessage(request, va, field));

            return false;
        }
    }

    return true;
}
}
