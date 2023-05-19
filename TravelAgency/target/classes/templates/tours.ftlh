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
        .head {
            display: flex;
            justify-content: space-between;
            font-size: 2.5rem;
        }
        a {
            text-decoration: none;
            text-align:center;
            color: black;
        }
        .fav {
            padding: 10px;
            border: 4px solid darkorchid;
            border-radius: 10px;
            background-color: lightsteelblue;
            height: 100%;
            margin: 25px;
        }
        .frame {
            border: 2.5px solid darkorchid;
            width: 600px;
            border-radius: 10px;
            padding: 15px;
            background-color: lightsteelblue;
        }
        hr {
            height: 2.5px;
            border: 0;
            margin: 0;
            background-color: black;
        }
    </style>
</head>
<body>
<h1>Туристическое агентство</h1><hr>

<div class="head">
    <h3 style="text-align: center">Актуальные туры</h3>
    <a class="fav" href="/favours">Избранное</a>
</div><hr>

<br>
<form action="/" method="get">
    Поиск по названию тура: <input type="text" name="title">
    <input style="background-color: lightsteelblue" type="submit" value="Поиск"/>
</form>


<#list tours as tour>
    <div>
        <p class="frame"><b>${tour.title}</b> ${tour.price} руб.  |   <a href="/tour/${tour.id}">Подробнее...</a></p>
    </div>
<#else>
    <h3>Туры не найдены</h3>
</#list>

</body>
</html>