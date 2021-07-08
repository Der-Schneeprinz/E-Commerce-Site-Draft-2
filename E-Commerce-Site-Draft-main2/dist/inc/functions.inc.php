<?php

if (isset($_POST["submit"]) === false) {
    header("location: ../index.php");
}

function emptyInputSignup($given_name, $sirname, $email, $username, $password1, $password2) {
    
    $result = null;
    //check all inputs if empty
    if(empty($given_name) || empty($sirname) || empty($email) || empty($username) || empty($password1) || empty($password2)) {
        $result = true;
    } else {
        $result = false;
    }

    return $result;

}

function invalidUsername($username) {

    $result = null;
    //checks if character is valid
    if(!preg_match("/^[a-zA-Z0-9]*$/", $username)) {
        $result = true;
    } else {
        $result = false;
    }

    return $result;

}

function invalidEmail($email) {

    $result = null;
    //checks if input is in email format
    if(!filter_var($email, FILTER_VALIDATE_EMAIL)) {
        $result = true;
    } else {
        $result = false;
    }

    return $result;

}

function passwordMatchError($password1, $password2) {

    $result = null;
    //check if paswords match
    if($password1 !== $password2) {
        $result = true;
    } else {
        $result = false;
    }

    return $result;

}

function usernameTaken($conn, $username, $email) {

    //prepares sql command
    $sql = "SELECT * FROM users WHERE usersUid = ? OR usersEmail = ?;";

    //initializes prepared statment
    $stmt = mysqli_stmt_init($conn);

    //checks for mistakes in the prepared statment
    if(!mysqli_stmt_prepare($stmt, $sql)) {

        header("location: ../signup.php?error=stmtfailed");
        exit();

    }

    //passes data from inputs
    mysqli_stmt_bind_param($stmt, "ss", $username, $email);
    //executes the statment
    mysqli_stmt_execute($stmt);

    //gets the data
    $resultData = mysqli_stmt_get_result($stmt);

    //if the user exists within the database, it is returned
    if($row = mysqli_fetch_assoc($resultData)) {
        return $row;
    } else {
        $result = false;
        return $result;
    }

    //closes the statment
    mysqli_stmt_close($stmt);

}

function createUser($conn, $given_name, $sirname, $email, $username, $password1) {
    
    //prepares sql command
    $sql = "INSERT INTO users (usersFirst, usersLast, usersEmail, usersUid, usersPwd) VALUES (?, ?, ?, ?, ?);";

    //initializes prepared statment
    $stmt = mysqli_stmt_init($conn);

    //checks for mistakes in the prepared statment
    if(!mysqli_stmt_prepare($stmt, $sql)) {

        header("location: ../signup.php?error=stmtfailed");
        exit();

    }

    //hashes the password
    $hashed_pass = password_hash($password1, PASSWORD_DEFAULT);

    //passes data from inputs
    mysqli_stmt_bind_param($stmt, "sssss", $given_name, $sirname, $username, $email, $hashed_pass);
    //executes the statment
    mysqli_stmt_execute($stmt);
    //closes the statment
    mysqli_stmt_close($stmt);

    header("location: ../signup.php?error=none");
    exit();
}

function emptyInputLogin($username, $password1) {
    
    $result = null;
    
    //check all inputs if empty
    if(empty($username) || empty($password1)) {
        $result = true;
    } else {
        $result = false;
    }

    return $result;

}

function loginUser($conn, $username, $password1) {

    $username_taken = usernameTaken($conn, $username, $username);
    

    //If the username does not exist, go back
    if($username_taken === false) {
        header("location: ../login.php?error=wronglogin");
        exit();
    }

    //hashed password
    $pass_hashed = $username_taken["usersPwd"];
    $check_pass = password_verify($password1, $pass_hashed);

    //If password is wrong, go back
    if($check_pass === false) {
        header("location: ../login.php?error=wronglogin");
        exit();
    } else if($check_pass === true) {

        session_start();
        $_SESSION["uid"] = $username_taken["username"];
        $_SESSION["uid"] = $username_taken["uid"];
        
        header("location: ../index.php");
        exit();

    }
}