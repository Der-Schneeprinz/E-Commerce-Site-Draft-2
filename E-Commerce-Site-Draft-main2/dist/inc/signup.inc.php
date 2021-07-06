<?php

if (isset($_POST["submit"])) {
    
    $given_name = $_POST["given_name"];
    $sirname = $_POST["sirname"];
    $email = $_POST["email"];
    $username = $_POST["username"];
    $password1 = $_POST["password1"];
    $password2 = $_POST["password2"];

    require_once "db.inc.php";
    require_once "functions.inc.php";

    if(emptyInputSignup($given_name, $sirname, $email, $username, $password1, $password2) !== false) {
        header("location: ../signup.php?error=emptyinput");
        exit();
    }
    if(invalidUsername($username) !== false) {
        header("location: ../signup.php?error=invalidusername");
        exit();
    }
    if(invalidEmail($email) !== false) {
        header("location: ../signup.php?error=invalidemail");
        exit();
    }
    if(passwordMatchError($password1, $password2) !== false) {
        header("location: ../signup.php?error=passworderror");
        exit();
    }
    if(usernameTaken($conn, $username, $email) !== false) {
        header("location: ../signup.php?error=usernameistaken");
        exit();
    }

    createUser($conn, $given_name, $sirname, $email, $username, $password1);

} else {
    header("location: ../signup.php");
    exit();
}