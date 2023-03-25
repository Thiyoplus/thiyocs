<?php
echo "Sorting Names And Numbers<br>";
$a = array("akila","bhavani","jaya","sri");
sort($a);
foreach($a as $value){
    echo $value."<br>"; 
}
$a = array(65,25,10,50);
sort($a);
foreach($a as $value){
    echo $value."<br>";
}
?>