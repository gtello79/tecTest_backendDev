<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.w3.org/1999/xhtml">
    <head>
        <title>Main menu</title>

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
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault"
                    aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
        </nav>

        <div class="container">

            <br/>
            <table class="table">
                <thead>
                <tr>
                    <th>Product Code</th>
                    <th>Product Name</th>
                    <th></th>
                </tr>
                </thead>

                <tbody>
                    <#list model["products"] as product>
                        <tr>
                            <th scope="row">${product.isoCode}</th>
                            <td>${product.productName}</td>
                        </tr>
                    </#list>

                </tbody>
            </table>
        </div>
    </body>
</html>
