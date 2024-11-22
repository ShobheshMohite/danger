<?php
function isValidEmail($email) {
    return filter_var($email, FILTER_VALIDATE_EMAIL) !== false;
}
echo isValidEmail("test@example.com") ? "Valid" : "Invalid"; // Output: Valid
?>