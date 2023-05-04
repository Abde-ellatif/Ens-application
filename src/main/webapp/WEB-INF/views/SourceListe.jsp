<%@ page pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!doctype html>
<html lang="en">
<link rel="stylesheet" type="text/css" href="webjars/bootstrap/5.2.0/css/bootstrap.min.css" />
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<jsp:include page="Index.jsp"></jsp:include>
        <body>
        <header>
            <h1>Source Liste</h1>
        </header>
        <main>

            <table class="table">
                <thead>
                <tr>
                    <th scope="col">Source id</th>
                    <th scope="col">Objet du Source</th>
                    <th>Action</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${sourceJsp}" var="source">
                    <tr>
                        <th scope="row">${source.id}</th>
                        <th scope="row">${source.objSource}</th>
                        <th>
                            <td>
                                <a  onclick="return confirm('are you shure to delete this item ?')" href="deleteSource?id=${source.id}">Delete</a>
                            </td>
                            <td>
                                <a href="showSource?id=${source.id}">Edite</a>
                            </td>
                        </th>
                    </tr>

                </c:forEach>

                </tbody>
                <nav aria-label="Page navigation example">
                    <ul class="pagination">
                        <li class="page-item"><a class="page-link" href="#">Previous</a></li>
                        <li class="page-item"><a class="page-link" href="#">1</a></li>
                        <li class="page-item"><a class="page-link" href="#">2</a></li>
                        <li class="page-item"><a class="page-link" href="#">3</a></li>
                        <li class="page-item"><a class="page-link" href="#">Next</a></li>
                    </ul>
                </nav>
            </table>
        </main>

        </body>
</html>