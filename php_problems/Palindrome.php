<?
function isPalindrome($string)
{
  return $string == strrev($string);
}

echo isPalindrome("asa") ? "It is Palindrome" : "It is Not Palindrome";
?>