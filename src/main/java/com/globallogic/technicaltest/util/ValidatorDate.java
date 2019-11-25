package com.globallogic.technicaltest.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Clase concreta que implementa los metodos utilitarios
 */
public class ValidatorDate implements IUtilApp {
    private String date;

    public ValidatorDate(String date) {
        this.date = date;
    }

    /**
     * Valida si el formato de fecha ingreso es correcto or not
     * @param dateStr
     * @return
     */
    @Override
    public boolean isInputDateValid(String dateStr) {
        DateFormat sdf = new SimpleDateFormat(this.date);
        sdf.setLenient(false);
        try {
            sdf.parse(dateStr);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }
}