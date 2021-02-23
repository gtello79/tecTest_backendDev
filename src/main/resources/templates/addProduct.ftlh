<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.w3.org/1999/xhtml">
    <head>
        <title>Add a New Product</title>

        <link href="/bootstrap/4.0.0-beta/css/bootstrap.min.css" rel="stylesheet">

        <style>
            .container {
                margin-top: 80px;
            }

            .bg-dark {
                background-color: #3b8dbd !important;
            }
        </style>

    </head>

    <body>

        <nav class="navbar navbar-expand-md navbar-dark bg-dark fixed-top">
            <a class="navbar-brand" href="/">Main</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse"
                    data-target="#navbarsExampleDefault"
                    aria-controls="navbarsExampleDefault" aria-expanded="false"
                    aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
        </nav>

        <div id="my_center">
            <div class="col-sm-8 main-section">
                <div class="modal-content">

                    <form class="form-inline" method="GET" >
                        <div class="form-group" id="user-group">
                            <input type="text" class="form-control" placeholder="Product Name" name="username" value="" />
                        </div>

                        <div class="form-group" id="product-code">
                            <input type="password" class="form-control" placeholder="Product Code" name="product-code" value=""/>
                        </div>

                        <div class="form-group" id="iso-code">
                            <input type="password" class="form-control" placeholder="Iso Code" name="iso-code" value=""/>
                        </div>

                        <div class="form-group" id="product-price">
                            <input type="password" class="form-control" placeholder="product Price" name="product-price" value=""/>
                        </div>

                        <button type="submit" class="btn btn-primary"><i class="fas fa-sign-in-alt"></i> Add new Product </button>
                    </form>

                </div>
            </div>
        </div>



    </body>
</html>
