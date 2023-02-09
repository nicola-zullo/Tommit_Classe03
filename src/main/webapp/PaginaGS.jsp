<!DOCTYPE html>
<html lang="en" >
<head>
    <meta charset="UTF-8">
    <title>Gruppi Studio</title>
    <link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/css/bootstrap.min.css'>
    <link rel="stylesheet" href="static/css/PaginaGS.css">
    <link rel="stylesheet" href="static/css/ComboBox.css">
    <link rel="stylesheet" href="static/css/search_bar.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
<!-- partial:index.partial.html -->



<main>

    <section class="hero-unit">


    <%@ include file="navbar.jsp" %>

        <button class="btn5">
            Crea Gruppo Studio
        </button>

        <div class="comboBox">
            <div class="select" tabindex="1">
                <input class="selectopt" name="test" type="radio" id="opt1" checked>
                <label for="opt1" class="option">Informatica</label>
                <input class="selectopt" name="test" type="radio" id="opt2">
                <label for="opt2" class="option">Sociale</label>
                <input class="selectopt" name="test" type="radio" id="opt3">
                <label for="opt3" class="option">Economia</label>
                <input class="selectopt" name="test" type="radio" id="opt4">
                <label for="opt4" class="option">Umanistica</label>
                <input class="selectopt" name="test" type="radio" id="opt5">
                <label for="opt5" class="option">Scientifica</label>
                <input class="selectopt" name="test" type="radio" id="opt6">
                <label for="opt6" class="option">Santitaria</label>
                <input class="selectopt" name="test" type="radio" id="opt7">
                <label for="opt7" class="option">Storica</label>
                <input class="selectopt" name="test" type="radio" id="opt8">
                <label for="opt8" class="option">Artistica</label>
            </div>
        </div>


        <form class="example" action="action_page.php">
            <input type="text" placeholder="che gruppo cerchi?" name="search">
            <button type="submit"><i class="fa fa-search"></i></button>
        </form>


    <div class="container">
        <div class="test_box box-01 col-xs-6 col-md-4">
            <div class="inner">
                <a href="PaginaGSsingola.jsp" class="test_click">
                    <div class="flex_this">
                        <h1 class="test_title">Nome Gruppo</h1>
                        <span class="test_link">Link</span>
                    </div>
                </a>
            </div>
        </div>

        <div class="test_box box-02 col-xs-6 col-md-4">
            <div class="inner">
                <a href="#" class="test_click">
                    <div class="flex_this">
                        <h1 class="test_title">Nome Gruppo</h1>
                        <span class="test_link">Link</span>
                    </div>
                </a>
            </div>
        </div>
        <div class="test_box box-03 col-xs-6 col-md-4">
            <div class="inner">
                <a href="#" class="test_click">
                    <div class="flex_this">
                        <h1 class="test_title">Nome Gruppo</h1>
                        <span class="test_link">Link</span>
                    </div>
                </a>
            </div>
        </div>
        <div class="test_box box-04 col-xs-6 col-md-4">
            <div class="inner">
                <a href="#" class="test_click">
                    <div class="flex_this">
                        <h1 class="test_title">Nome Gruppo</h1>
                        <span class="test_link">Link</span>
                    </div>
                </a>
            </div>
        </div>
        <div class="test_box box-05 col-xs-6 col-md-4">
            <div class="inner">
                <a href="#" class="test_click">
                    <div class="flex_this">
                        <h1 class="test_title">Nome Gruppo</h1>
                        <span class="test_link">Link</span>
                    </div>
                </a>
            </div>
        </div>
        <div class="test_box box-06 col-xs-6 col-md-4">
            <div class="inner">
                <a href="#" class="test_click">
                    <div class="flex_this">
                        <h1 class="test_title">Nome Gruppo</h1>
                        <span class="test_link">Link</span>
                    </div>
                </a>
            </div>
        </div>
    </div>
    </section>
</main>
<!-- partial -->
<script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js'></script>
<script src='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.0.0-alpha.6/js/bootstrap.min.js'></script><script  src="./script.js"></script>

</body>
</html>
