package com.airtribe.studentmgmt.util;

public class InputValidationUtil {

    public static boolean isValidCohort(String cohort) {
        return cohort.equalsIgnoreCase("java") ||
                cohort.equalsIgnoreCase("nodejs");
    }

    public static boolean isValidId(String id) {
        return id != null && !id.isBlank();
    }

    public static boolean isValidName(String name) {
        return name != null && !name.isBlank();
    }
}