<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Welcome </title>

        <link href="/bootstrap/4.0.0-beta/css/bootstrap.min.css" rel="stylesheet">

        <style>
            .container {
                margin-top: 80px;
            }
            .bg-dark {
                background-color: #3b8dbd !important;
            }

            .box{
                margin-top: 40px;
            }
        </style>
    </head>

    <body>
        <div class="navbar">
            <nav class="navbar navbar-expand-md navbar-dark bg-dark fixed-top">
                <a class="navbar-brand" href="/">Main</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse"
                        data-target="#navbarsExampleDefault"
                        aria-controls="navbarsExampleDefault" aria-expanded="false"
                        aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
            </nav>
        </div>
        <div class="modal-dialog text-center">
            <div class="box">
                <p>All objects Information</p>
                <input type="submit" href="/soldProduct" value="Continue"/>
            </div>

            <div class="box">
                <p>View transactions</p>
                <input type="submit" value="Continue"/>
            </div>

            <div class="box">
                <p>Report a product</p>
                <input type="submit" value="Continue"/>
            </div>

            <div class="box">
                <p>Add New Product</p>
                <input type="submit" value="Continue"/>
            </div>

            <div class="box">
                <p>Edit product</p>
                <input type="submit" value="Continue"/>
            </div>

            <div class="box">
                <p>Delete product</p>
                <input type="submit" value="Continue"/>
            </div>
        </div>
    </body>
</html>