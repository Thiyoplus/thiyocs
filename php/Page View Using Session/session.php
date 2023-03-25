<?php
session_start();
if(!isset($_SESSION["count"])){
    $_SESSION["count"] = 0;
}
else{
    $_SESSION["count"]++;
}
echo "<b><h3>sessions hit counter</h3><br>";
echo "you have been here".$_SESSION["count"]."times before.";
?>