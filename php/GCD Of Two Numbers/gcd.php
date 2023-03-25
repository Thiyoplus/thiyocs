<?php
function gcd($a,$b){
    $a = abs($a);
    $b = abs($b);

    if($a+$b == 0){
        return "0";
    }
    else{
        while($a>0){
            $c = $a;
            $a = $b % $a;
            $b = $c;
        }
        return $c;
    }
}
echo "gcd(16,24)->".gcd(16,24)."<br><br>";
echo "gcd(24,28)->".gcd(24,28)."<br><br>";
?>