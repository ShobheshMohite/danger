<?

function isPrime($no)
{
  if ($no < 2)
    return false;
  for ($i = 2; $i <= sqrt($no); $i++) {
    if ($no % $i == 0) {
      return false;
    }
    return true;
  }

  echo isPrime(7) ? "It is Prime" : "Not Prime";
}
?>