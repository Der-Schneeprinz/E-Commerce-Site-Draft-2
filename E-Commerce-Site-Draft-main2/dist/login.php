<?php
    include_once "head-meta.php";
?>

    <title>DB | Login</title>

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
                            <h1>Login</h1>
                            <form action="./inc/login.inc.php" method="post">
                                <input type="text" name="username" placeholder="Username/Email">
                                <input type="password" name="password1" placeholder="Password">
                                <button type="submit" name="submit" class="btn btn-outline-warning">Confirm</button>
                            </form>
                        </div>

                        <aside class="col-md-2">
                            <p>Sign in to your account</p>
                            <img src="" alt="">
                        </aside>

                        <?php
                            if(isset($_GET["error"])) {
                                if($_GET["error"] == "emptyinput") {
                                    echo "<p>Please fill in all fields.</p>";
                                } else if($_GET["error"] == "wronglogin") {
                                    echo "<p>Invalid login information.</p>";
                                }
                            }
                        ?>

                    </div>
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