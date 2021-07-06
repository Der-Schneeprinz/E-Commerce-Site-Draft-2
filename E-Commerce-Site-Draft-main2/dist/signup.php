<?php
    include_once "head-meta.php";
?>

    <title>DB | Sign Up</title>

    <?php
        include_once "link-res.php";
    ?>

</head>
<body>

    <?php
        include_once 'nav.php';
    ?>

    <main>
        <div class="row">
            <section class="card col-lg-6">
                <div class="row">
                    <div class="col-md-8 center">
                        <h1>Sign Up</h1>
                        <form action="./inc/signup.inc.php" method="post">
                            <input type="text" name="given_name" placeholder="Given Name">
                            <input type="text" name="sirname" placeholder="Sirname">
                            <input type="text" name="email" placeholder="Email Address">
                            <input type="text" name="username" placeholder="Username">
                            <input type="password" name="password1" placeholder="Password">
                            <input type="password" name="password2" placeholder="Confirm Password">
                            <button type="submit" name="submit">Confirm</button>
                        </form>
                    </div>

                    <aside class="col-md-2">
                        <p>Register for new account</p>
                        <img src="" alt="">
                    </aside>
                </div>
                
                <?php
                if(isset($_GET["error"])) {
                    if($_GET["error"] == "emptyinput") {
                        echo "<p>Please fill in all fields.</p>";
                    } else if($_GET["error"] == "invalidusername") {
                        echo "<p>Username is invalid</p>";
                    } else if($_GET["error"] == "invalidemail") {
                        echo "<p>Email is invalid</p>";
                    } else if($_GET["error"] == "passworderror") {
                        echo "<p>Password mismatch</p>";
                    } else if($_GET["error"] == "usernameistaken") {
                        echo "<p>Username is taken.</p>";
                    } else if($_GET["error"] == "stmtfailed") {
                        echo "<p>Something went wrong. Please try again.</p>";
                    } else if($_GET["error"] == "none") {
                        echo "<p>Sign up complete</p>";
                    }
                }
            ?>

            </section>
        </div>
    </main>

    <?php
        include_once "footer.php";
    ?>
    <?php
        include_once "scripts.php";
    ?>

</body>
</html>