<?
function isPrime($no)
{
  if ($no <= 1) {
    return false;
  }
  for ($i = 2; $i <= $no / 2; $i++) {
    if ($no % $i == 0) {
      return false;
    }
  }
  return true;
}

function printPrime($n)
{
  $arr = [];
  for ($i = 2; $i <= $n; $i++) {
    if (isPrime($i)) {
      $arr .= $i;
    }
  }

  foreach ($arr as $prime) {
    echo $prime . "\n";
  }
}

$n = 50;
printPrime($n);

?>