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

    <main class="row">
        <div class="col-md-10">
            <div class="row">

                <aside class="categories col-lg-2 float-left my-5">
                    <div class="sticky-top nav-custom">
                        <h2>Categories</h2>
                        <ul>
                            <h5 class="list-group-item bg-dark"><a href="#OriginalIPA" class="text-light">Our Beers</a></h5>
                            <a href="#Singles"><li class="list-group-item list-group-item-secondary">Singles</li></a>
                            <a href="#Bundle"><li class="list-group-item list-group-item-secondary">Bundle</li></a>
                        </ul>
                        <ul>
                            <a href="#OtherBeers" class="text-light"><h5 class="list-group-item bg-dark">Other Items</h5></a>
                            <a href="#SanMig"><li class="list-group-item list-group-item-secondary">San Miguel</li></a>
                            <a href="#RedHorse"><li class="list-group-item list-group-item-secondary">Red Hourse</li></a>
                        </ul>
                    </div>
                </aside>

                <section class="col-lg-10">

                    <div class= "col-md-3 col-sm-6 my-3 my-md-0 d-inline-flex py-4">
                        <form action= "index.php " method= "post ">
                            <div class= "card shadow ">
                                <div>
                                    <img src= "./res/Dion-Beer-Ori.png" alt= "Image1 " class= "img-fluid card-img-top ">
                                </div>
                                <div class= "card-body ">
                                    <h5 class= "card-title ">$productname</h5>
                                    <h6>
                                        <i class= "fa fa-star "></i>
                                        <i class= "fa fa-star "></i>
                                        <i class= "fa fa-star "></i>
                                        <i class= "fa fa-star "></i>
                                        <i class= "fa fa-star-half "></i>
                                    </h6>
                                    <p class= "card-text ">
                                        Some quick example text to build on the card.
                                    </p>
                                    <h5>
                                        <small><s class= "text-secondary ">$10.00</s></small>
                                        <span class= "price ">$7.99</span>
                                    </h5>

                                    <button type= "submit " class= "btn btn-warning my-3 " name= "add ">Add to Cart <i class= "fa fa-shopping-cart "></i></button>
                                    <input type='hidden' name='product_id' value='$productid'>
                                </div>
                            </div>
                        </form>
                    </div>

                </section>
            </div>
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