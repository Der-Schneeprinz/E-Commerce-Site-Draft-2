<?php

if(isset($_POST["submit"])) {

    $username = $_POST["username"];
    $password = $_POST["password1"];

    require_once "db.inc.php";
    require_once "functions.inc.php";

    if(emptyInputLogin($username, $password1) !== false) {
        header("location: ../signup.php?error=emptyinput");
        exit();
    }


    loginUser($conn, $username, $password1);

} else {

    header("location: ../login.php");
    exit();

}