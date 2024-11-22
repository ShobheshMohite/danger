<?php

function revString($str)
{
  $strRev = "";
  for ($i = strlen($str) - 1; $i >= 0; $i--) {
    $strRev .= $str[$i];
  }
  return $strRev;
}

echo revString("Shobhesh");

?>