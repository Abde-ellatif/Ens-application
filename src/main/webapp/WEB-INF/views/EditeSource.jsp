<%@ page pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!doctype html>
<html lang="en" xmlns:th="http://www.thymeleaf.org/">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<header>
    <h1>Modification d'une source</h1>
</header>

<form action="updateSource" method="post">
    <fieldset>
        <legend>Ajouter une source</legend>
        <div>
            <label >Source d'argent : </label>
            <input type="text" id="id" name="id" value="${sourceJsp.id}" >
            <input type="text" id="objSource" name="objSource" value="${sourceJsp.objSource}">
        </div>
        <div>
            <input type="submit" value="modifier source">
        </div>


    </fieldset>
</form>

</body>
</html>