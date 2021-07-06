<?php

function emptyInputSignup($given_name, $sirname, $email, $username, $password1, $password2) {
    
    $result = null;
    if(empty($given_name) || empty($sirname) || empty($email) || empty($username) || empty($password1) || empty($password2)) {
        $result = true;
    } else {
        $result = false;
    }

    return $result;

}

function invalidUsername($username) {

    $result = null;
    if(!preg_match("/^[a-zA-Z0-9]*$/", $username)) {
        $result = true;
    } else {
        $result = false;
    }

    return $result;

}

function invalidEmail($email) {

    $result = null;
    if(!filter_var($email, FILTER_VALIDATE_EMAIL)) {
        $result = true;
    } else {
        $result = false;
    }

    return $result;

}

function passwordMatchError($password1, $password2) {

    $result = null;
    if($password1 !== $password2) {
        $result = true;
    } else {
        $result = false;
    }

    return $result;

}

function usernameTaken($conn, $username, $email) {

    $sql = "SELECT * FROM users WHERE username = ? OR uEmail = ?;";

    $stmt = mysqli_stmt_init($conn);

    if(!mysqli_stmt_prepare($stmt, $sql)) {

        header("location: ../signup.php?error=stmtfailed");
        exit();

    }

    mysqli_stmt_bind_param($stmt, "ss", $username, $email);
    mysqli_stmt_execute($stmt);

    $resultData = mysqli_stmt_get_result($stmt);

    if($row = mysqli_fetch_assoc($resultData)) {
        return $row;
    } else {
        $result = false;
        return $result;
    }

    mysqli_stmt_close($stmt);

}

function createUser($conn, $given_name, $sirname, $email, $username, $password1) {
    $sql = "INSERT INTO users (uGiven, uSir, uEmail, username, uPass) VALUES (?, ?, ?, ?, ?);";

    $stmt = mysqli_stmt_init($conn);

    if(!mysqli_stmt_prepare($stmt, $sql)) {

        header("location: ../signup.php?error=stmtfailed");
        exit();

    }

    $hashed_pass = password_hash($password1, PASSWORD_DEFAULT);

    mysqli_stmt_bind_param($stmt, "sssss", $given_name, $sirname, $username, $email, $hashed_pass);
    mysqli_stmt_execute($stmt);
    mysqli_stmt_close($stmt);

    header("location: ../signup.php?error=none");
    exit();
}

function emptyInputLogin($username, $password1) {
    
    $result = null;
    if(empty($username) || empty($password1)) {
        $result = true;
    } else {
        $result = false;
    }

    return $result;

}

function loginUser($conn, $username, $password1) {

    $username_taken = usernameTaken($conn, $username, $username);

    if($username_taken === false) {
        header("location: ../login.php?error=wronglogin");
        exit();
    }

    $pass_hashed = $username_taken["uPass"];
    $check_pass = password_verify($password1, $pass_hashed);

    if($check_pass === false) {
        header("location: ../login.php?error=wronglogin");
        exit();
    } else if($check_pass === true) {

        session_start();
        $_SESSION["username"] = $username_taken["username"];
        $_SESSION["uid"] = $username_taken["uid"];
        
        header("location: ../index.php");
        exit();

    }
}