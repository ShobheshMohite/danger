<?
$array = ["S", "s", "S"];
$result = [];

foreach ($array as $value) {
  $isDuplicate = false;

  foreach ($result as $resultValue) {
    if ($value == $resultValue) {
      $isDuplicate = true;
      break;
    }
  }
  if (!$isDuplicate) {
    $result[] = $value;
  }
}

print_r($result);

?>