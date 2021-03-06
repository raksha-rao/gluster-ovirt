package org.ovirt.engine.core.engineencryptutils;

public final class EncriptionManagerMessages {
    private static final java.util.HashMap<String, String> _messages = new java.util.HashMap<String, String>();
    private static final String _unknownError = "Unknown Error";
    /**
     * Initializes the <see cref="EncriptionManagerMessages"/> class.
     */
    static {
        _messages.put("CRYPT_MULTIPLE_CERTIFICATES_FOUND", "Read signature failed, %s certificates were found.");
        _messages.put("CRYPT_FAILED_TO_OPEN_CERTIFICATE_STORE",
                "Read signature failed, failed to open certificate store.");
        _messages.put("CRYPT_INSTALLER_FAILED_TO_SIGN_NO_CERT", "Can not find certification");
    }

    /**
     * Gets the error text by key.
     *
     * @param key
     *            The key.
     * @return
     */
    public static String GetMessage(String key) {
        if (_messages.containsKey(key)) {
            return _messages.get(key);
        }
        return _unknownError;
    }
}
