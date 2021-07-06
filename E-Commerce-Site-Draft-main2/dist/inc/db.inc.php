<?php

$serverName = "localhost";
$dbUsername = "root";
$dbPassword = "";
$dbName = "ecommweb";

$conn = mysqli_connect($serverName, $dbUsername, $dbPassword, $dbName);

if (!$conn) {
    die("Connection Failed: " . mysqli_connect_error());
} else {
    echo "Connection Success!";
}