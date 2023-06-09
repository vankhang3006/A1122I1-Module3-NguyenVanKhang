<%--
  Created by IntelliJ IDEA.
  User: KhangNguyen
  Date: 5/6/2023
  Time: 6:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">

    <title>Deleting product</title>
</head>
<body>
<h1 style="text-align: center">Delete product</h1>
<form method="post">
    <h3 style="color: #bb2d3b">Are you sure?</h3>
    <fieldset>
        <legend><h2>Product information</h2></legend>
        <table class="table table-dark table-striped">
            <tr>
                <th>Name: </th>
                <td>${requestScope["product"].getName()}</td>
            </tr>
            <tr>
                <th>Price: </th>
                <td>${requestScope["product"].getPrice()}</td>
            </tr>
            <tr>
                <th>Description: </th>
                <td>${requestScope["product"].getDescription()}</td>
            </tr>
            <tr>
                <td><input type="submit" value="Delete product"></td>
                <td><a style="text-decoration: none" href="/products">Back to product list</a>

                </td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
