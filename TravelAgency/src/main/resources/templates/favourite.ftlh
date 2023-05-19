<!DOCTYPE html>
<html>
<head>
    <title>Туристическое агентство</title>
    <style>
        body {
            background-color: powderblue;
            font-size: 1.5rem;
            margin: 10px 40px;
        }
        h1 {
            font-size: 4rem;
            text-align: center;
            font-weight: bold;
            color: darkorchid;
        }
        hr {
            height: 2.5px;
            border: 0;
            margin: 0;
            background-color: black;
        }
        input {
            background-color: lightsteelblue;
            border-radius: 10px;
        }
        a {
            text-decoration: none;
            color: black;
            padding: 10px;
            border: 2.5px solid darkorchid;
            border-radius: 10px;
            background-color: lightsteelblue;
            font-size: 2rem;
        }
    </style>
</head>
<body>
<h1>Избранное</h1><hr>

<#list favTours as tour>
    <div>
        <b>${tour.title}</b>  |   ${tour.price} руб.
        <form action="/favours/delete/${tour.id}" method="post">
            <input type="submit" value="Удалить тур"/>
        </form>
        <br>
    </div>
<#else>
    <h3>В избранном нет туров</h3>
</#list><hr>


<form action="/favours/order" method="post">
    <br><input style="font-size: 2rem" type="submit" value="Оформить заказ"/>
</form>

<br><br><a href="/">Вернуться на главную</a>
</body>
</html>