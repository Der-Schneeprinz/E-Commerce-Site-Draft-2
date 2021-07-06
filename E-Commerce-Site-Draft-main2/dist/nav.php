<!-- Navigation Bar -->
<nav class="navbar navbar-dark bg-dark navbar-expand-sm sticky-top nav-custom2">

<button class="navbar-toggler collapsed" type="button" data-toggle="collapse" data-target="#naver">
    <span class="navbar-toggler-icon"></span>
</button>

<div id="naver" class="collapse navbar-collapse">
    <ul class="nav navbar-nav ml-auto">
        <li class="nav-item">
            <a href="./index.php/#Beer" class="nav-link">Beer</a>
        </li>
        <li class="nav-item">
            <a href="./index.php/#Locations" class="nav-link">Locations</a>
        </li>
        <li class="nav-item">
            <a href="#contacts" class="nav-link">Contacts</a>
        </li>
    </ul>
</div>

<a href="./index.php
" class="navbar-brand">
    <h4 class="my-auto mx-auto">
        <svg xmlns="http://www.w3.org/2000/svg" width="50" height="50" viewBox="0 0 409.281 433.844">
            <defs>
                <style>
                    .cls-1 {
                    fill: #fff;
                    fill-rule: evenodd;
                    }
                </style>
            </defs>
            <path id="Color_Fill_1" data-name="Color Fill 1" class="cls-1" d="M175.689,172.217C272.7,33.248,272.1,32.831,272.1,32.831L454.46,408.011S222.841,508.59,102.511,446.342c-73.66-38.1-66.818-160.639-32.523-203.271,35.781-44.48,92.731-55.537,138.224-68.531,24.082-6.879,59.162,32.432,56.916,34.846,0,0-8.342-9.834-37.17-5.808-30.3,4.233-41.815,11.616-41.815,11.616s26.521-4.6,54.592-1.162c28.835,3.531,40.655,17.424,40.655,17.424s-20.706-2.229-39.493,0c-15.064,1.787-29.039,8.13-29.039,8.13s18.226,1.4,27.877,3.485c11.649,2.519,15.1,5.808,15.1,5.808s-36.32-.473-54.593,11.615c-19.441,12.861-30.2,32.524-30.2,32.524s-5.293,41.8,16.262,69.693c17.515,22.666,62.724,32.523,62.724,32.523l-2.323,52.27,171.909-41.816L370.829,320.9l-4.646-74.339-32.524-65.047H312.751l-34.846-75.5L239.574,174.54s-9.771-19.173-36.008-8.131C184.942,174.246,169.351,181.3,175.689,172.217ZM289.52,259.333l-22.069,16.261-5.808,48.786,95.247,5.807-2.323-54.593-18.585-13.938V203.578L302.3,198.932Zm-26.715,74.339,91.762,3.485-1.161,20.907L258.159,356.9Zm-2.323,33.685,89.439,3.484,4.646,45.3L257,440.534ZM296.49,188.478l34.846,2.323,5.808,10.454-42.977-6.969Z" transform="translate(-45.188 -32.844)"/>
        </svg>
        Dionysian Brews
    </h4>
</a>

<div id="naver" class="collapse navbar-collapse">
    <ul class="nav navbar-nav ml-auto">
        <?php
            if(isset($_SESSION["username"])) {
                echo "<li class=\"nav-item\">
                        <a href=\"./profile.php\" class=\"nav-link\"><i class=\"fa fa-lg fa-user\" aria-hidden=\"true\"></i></a>
                    </li>";
                echo "<li class=\"nav-item\">
                        <a href=\"./inc/logout.inc.php\" class=\"nav-link\"><i class=\"fa fa-lg fa-sign-out\" aria-hidden=\"true\"></i></a>
                    </li>";
            } else {
                echo "<li class=\"nav-item\">
                        <a href=\"./signup.php\" class=\"nav-link\"><i class=\"fa fa-lg fa-user-plus\" aria-hidden=\"true\"></i></a>
                    </li>";
                echo "<li class=\"nav-item\">
                        <a href=\"./login.php\" class=\"nav-link\"><i class=\"fa fa-lg fa-sign-in\" aria-hidden=\"true\"></i></a>
                    </li>";
            }
        ?>
        <!--<li class="nav-item">
            <a href="./signup.php" class="nav-link"><i class="fa fa-lg fa-user" aria-hidden="true"></i></a>
        </li> -->
        <li class="nav-item">
            <a href="shop.php" class="nav-link"><i class="fa fa-lg fa-shopping-cart" aria-hidden="true"></i></a>
        </li>
    </ul>
</div>

</nav>