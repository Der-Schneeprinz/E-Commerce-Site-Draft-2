<?php
    include_once "head-meta.php";
?>

    <title>Dionysian Brews</title>

    <?php
        include_once "link-res.php";
    ?>

</head>
<body>

    <?php
        include_once 'nav.php';
    ?>

    <!-- Masthead -->
    <div class="masthead">
        <div class="container">
            <div class="row img-hide">
                <div class="col-lg-4 py-5 .d-none .d-md-block .d-lg-none">
                    <img src="./res/beer_2.png" alt="">
                </div>
                <div class="col-lg-8">
                    <h1 class="masthead-title">Dionysian Brews</h1>
                    <article class="text-white">
                        <aside class="subtitle">
                            Original IPA
                        </aside>
                        <p class="masthead-description">
                            A sensation so tangy, so intoxicating, so <b>good!</b>
                        </p>
                    </article>
                </div>
            </div>
        </div>
    </div>
    
    <!-- Second Navigation -->
    <div class="navbar navbar-dark bg-custom navbar-expand-sm sticky-top nav-custom">
        <div class="row mx-auto">
            <ul class="nav navbar-nav ml-auto">
                <li class="nav-item">
                    <a href="#" class="nav-link text-light">Find More IPA</a>
                </li>
                <li class="nav-item">
                    <a href="#" class="nav-link text-light">Other Beers</a>
                </li>
            </ul>
        </div>
    </div>

    <!-- Main -->
    <main>
        <section class="row">
            <?php
                if(isset($_SESSION["username"]))
                    echo "<p>Hello". $_SESSION["username"] . "!</p>";
            ?>
            <div class="col-md-6">
                <div id="Beer" class="card">
                    <h1 class="card-title text-white">S'up?</h1>
                    <p class="card-text text-dark bg-white">Cracking a cold one with the boys has never felt so god-like.</p>
                </div>
            </div>
        </section>
        <section class="row">
            <div class="col-md-8">
                <h1 id="Locations">Get Some Beer!</h1>
                <p class="subtitle" style="padding: 0 2rem;">
                    From Convenience Stores Near You!
                </p>
                <div id="map-container-google-1" class="z-depth-1-half map-container">
                    <iframe src="https://www.google.com/maps/embed?pb=!1m16!1m12!1m3!1d123546.21993522531!2d121.04149747154486!3d14.609363238693117!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!2m1!1s7-11!5e0!3m2!1sen!2sph!4v1625415157802!5m2!1sen!2sph" width="600" height="450" style="border:0;" allowfullscreen="" loading="lazy"></iframe>
                </div>
            </div>
        </section>
    </main>

    <?php
        include_once "footer.php";
    ?>
    <?php
        include_once "scripts.php";
    ?>
</body>
</html>