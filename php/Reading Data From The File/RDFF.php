<html>
    <body>
        <?php
        $myfile = fopen("mietcs.txt","r")or die("unable to open the file");
        echo fread($myfile,filesize("mietcs.txt"));
        fclose($myfile);
        ?>
    </body>
</html>