<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.w3.org/1999/xhtml" xmlns:form="http://www.w3.org/1999/html">
    <head>
        <meta charset="UTF-8">
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

        <fieldset>
            <legend>Add New product</legend>
                <form name="${product}" action="/newProduct" method="post">
                    Product Name : <input type="text" name="productName" /><br/>
                    ID Product: <input type="text" name="productId" /><br/>
                    Iso Code: <input type="text" name="isoCode" /><br/>
                    Price: <input type="text" name="productPrice" /><br/>
                    <input type="submit" value="Save" />
                </form>
        </fieldset>

    </body>
</html>
