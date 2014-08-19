 public static boolean isEmailAddress(String email) {
        return email.contains("@") && (email.split("@").length >= 2);
    }