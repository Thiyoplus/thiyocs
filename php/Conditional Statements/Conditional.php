<?php
$age = 70;
$price = 30;
switch($age){
    case 15 :
        $discount = 95;
        break;
        case 30 :
            echo "No Discount";
            break;
            case 70 :
                $discount = 90;
                break;
                default :
                echo "Enter Valid Age";
}
if($age>65){
    print "You have received our senior's discount, your price is $".$price*$discount; }
else{
    print "sorry you do not qualify for discount,your price is $".$price; }
?>