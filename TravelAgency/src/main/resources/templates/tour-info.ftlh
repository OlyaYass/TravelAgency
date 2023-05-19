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
            font-size: 1.5rem;
            background-color: lightsteelblue;
        }
    </style>
</head>
<body>
<h1>Туристическое агенство</h1><hr>
<h3>Подробная информация о туре</h3>
<b>Название тура: </b>${tour.title}<br>
<b>Описание тура: </b>${tour.description}<br>
<b>Цена: </b>${tour.price}<br><br><hr>

<h3>Если вас заинтересовал тур, добавьте в избранное</h3>
<form action="/favours/add/${tour.id}" method="post">
    <input type="submit" value="Добавить тур в избранное">
</form>
</body>
</html>