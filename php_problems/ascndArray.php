<!-- <?
$array = [5, 2, 6, 1, 8];

// for($i = 0 ; $i<)

sort($array);
print_r($array);
?> -->

<?

$array = [23, 147, 13, 6, 135];
$len = sizeof($array);

for ($i = 0; $i < ($len - 1); $i++) {
  //assume minimun index
  $minIndex = $i;

  //to find the minimum in array
  for ($j = $i + 1; $j < $len; $j++) {
    if ($array[$j] < $array[$minIndex]) {
      $minIndex = $j;
    }
  }

  //swap
  if ($minIndex != $i) {
    $temp = $array[$i];
    $array[$i] = $array[$minIndex];
    $array[$minIndex] = $temp;
  }
}

print_r($array);

?>