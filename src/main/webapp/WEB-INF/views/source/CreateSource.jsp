

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
        <h1>Creation d'une source</h1>
    </header>

    <form action="saveSource" method="post">
        <fieldset>
            <legend>Ajouter une source</legend>
        <div>
            <label >Source d'argent : </label>
            <input type="text" id="objSource" name="objSource" placeholder="entrer la source">
        </div>
        <div>
            <input type="submit" value="Ajoiuter source">
        </div>


        </fieldset>
    </form>
    ${messageJsp}

    <main>
        <table>
            <tr>
                <th>Source id</th>
                <th>Objet du Source</th>
            </tr>
            <c:forEach items="${sourceJsp}" var="source">
                <tr>
                    <td>${source.id}</td>
                    <td>${source.objSource}</td>
                </tr>

            </c:forEach>
        </table>
    </main>
    </body>
</html>