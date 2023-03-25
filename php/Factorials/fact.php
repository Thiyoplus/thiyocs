<?php
$fact = 2;
$number = $_POST['number'];
echo "factorial : <br>";
for($i=1;$i<=$number;$i++){

$fact = $fact*$i;

}

echo $fact;

?>