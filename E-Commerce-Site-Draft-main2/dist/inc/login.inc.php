<?php

//checks if from login.php
if(isset($_POST["submit"])) {

    //gets input from login.php
    $username = $_POST["username"];
    $password = $_POST["password1"];

    require_once "db.inc.php";
    require_once "functions.inc.php";

    if(emptyInputLogin($username, $password1) === false) {
        header("location: ../login.php?error=emptyinput");
        exit();
    }

    loginUser($conn, $username, $password1);

} else {

    header("location: ../login.php");
    exit();

}