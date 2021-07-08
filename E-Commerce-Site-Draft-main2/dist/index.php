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
                <div class="col-lg-4 py-5 d-none d-md-none d-lg-block">
                    <img src="./res/beer_2.png" alt="">
                </div>
                <div class="col-lg-8">
                    <h1 class="masthead-title">Dionysian Brews</h1>
                    <article class="text-white">
                        <aside class="subtitle bg-white">
                            Original IPA
                        </aside>
                        <p class="masthead-description bg-custom">
                            A sensation so tangy, so intoxicating, so <b>good!</b>
                        </p>
                        <button class="btn btn-outline-warning font-weight-bold shadow"> Buy Some Beer Now!</button>
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

        <!-- Welcome -->
        <section class="bg-special h-100">
            <?php
                if(isset($_SESSION["username"]))
                    echo "<p>Hello". $_SESSION["username"] . "!</p>";
            ?>
            <div class="col-md-8 my-3 h-100">
                <div id="Beer" class="card my-5 p-5 d-flex align-items-center text-center shadow rounded">
                    <h1 class="card-title text-white">Dionysian Brews</h1>
                    <p class="card-text text-dark bg-white m-5 bg-logo">Brewed with the finest malt and served with a side of chaos... Dionysus isn't the most law-aligned of the greek pantheon, and you can be wild too with Dionysian Beer. If you're searching for a new class of IPAs Dionysian Brews has got your back. Just know that if you wanna feel god-like, you gotta crack a cold one with the boys.</p>
                </div>
            </div>
        </section>

        <!-- Shop -->
        <section>
            <div class="col-md-8">
                <h1>Shop Online!</h1>
                <p class="subtitle">
                    Try out our some of our original IPA!
                </p>
                <div id="carousel" class="carousel slide" data-ride="carousel">
                    <ol class="carousel-indicators">
                        <li data-target="#carousel" data-slide-to="0" class="active"></li>
                        <li data-target="#carousel" data-slide-to="1"></li>
                        <li data-target="#carousel" data-slide-to="2"></li>
                    </ol>
                    <div class="carousel-inner">
                        <a href="./shop.php">
                            <div class="carousel-item active">
                                <img class="d-block w-100" src="./res/Dion-Beer-Ori.png" alt="First slide">
                                <div class="carousel-caption d-none d-md-block">
                                    <h5>Original</h5>
                                </div>
                            </div>
                            <div class="carousel-item">
                                <img class="d-block w-100" src="./res/Dion-Beer-Spicy.png" alt="Second slide">
                                <div class="carousel-caption d-none d-md-block">
                                    <h5>Spicy</h5>
                                </div>
                            </div>
                            <div class="carousel-item">
                                <img class="d-block w-100" src="./res/Dion-Beer-Light.png" alt="Third slide">
                                <div class="carousel-caption d-none d-md-block">
                                    <h5>Light</h5>
                                </div>
                            </div>
                        </a>
                    </div>
                    <a class="carousel-control-prev" href="#carousel" role="button" data-slide="prev">
                        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                        <span class="sr-only">Previous</span>
                    </a>
                    <a class="carousel-control-next" href="#carousel" role="button" data-slide="next">
                        <span class="carousel-control-next-icon" aria-hidden="true"></span>
                        <span class="sr-only">Next</span>
                    </a>
                </div>
                <?php

                ?>
            </div>
        </section>

        <!-- Map -->
        <section>
            <div class="col-md-8">
                <h1 id="Locations" class="mx-1">Get Some Beer!</h1>
                <p class="subtitle">
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