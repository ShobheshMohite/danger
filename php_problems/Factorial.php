<?
function factorial($no)
{
  $fact = 1;
  for ($i = 1; $i <= $no; $i++) {
    $fact = $fact * $i;
    
    //reccursion
    if($no<=1)
    {
        return 1;
    }
    return $no * factorial($no-1);
  }
//   return $fact;
}

echo factorial(5);

?>