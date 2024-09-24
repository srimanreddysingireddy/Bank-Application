<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>SDFC Bank</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: rgba(77, 89, 45, 0.648);
            margin: 0;
            padding: 0;
        }

        .header {
            background-color: #333;
            padding: 10px 0;
            text-align: center;
            color: rgb(255, 196, 0);
        }

        .header h1, .header h2 {
            margin: 0;
        }

        .header h2 {
            color: rgba(179, 255, 0, 0.543);
        }

        nav {
            background-color: #44444453;
            overflow: hidden;
        }

        nav ul {
            list-style: none;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            flex-wrap: wrap;
        }

        nav ul li {
            position: relative;
        }

        nav ul li a {
            display: block;
            color: rgba(192, 243, 255, 0.724);
            text-decoration: none;
            padding: 15px 20px;
            transition: background-color 0.3s ease, color 0.3s ease;
        }

        nav ul li a:hover {
            background-color: rgba(0, 221, 255, 0.829);
            color: #3333336d;
        }

        nav ul li:hover > ul {
            display: block;
        }

        nav ul ul {
            display: none;
            position: absolute;
            background-color: #555;
            top: 100%;
            left: 0;
            min-width: 200px;
            z-index: 1000;
            border-radius: 0 0 5px 5px;
        }

        nav ul ul li {
            float: none;
        }

        nav ul ul li a {
            padding: 10px 20px;
            color: rgb(255, 234, 192);
        }

        nav ul ul li a:hover {
            background-color: rgba(0, 213, 255, 0.7);
            color: #333;
        }

        .menu-toggle {
            display: none;
            background-color: #444444;
            color: rgb(192, 255, 215);
            padding: 10px 20px;
            border: none;
            font-size: 16px;
            cursor: pointer;
            text-align: center;
            width: 100%;
        }

        @media screen and (max-width: 768px) {
            .menu-toggle {
                display: block;
            }

            nav ul {
                display: none;
                flex-direction: column;
            }

            nav ul.active {
                display: flex;
            }

            nav ul li {
                width: 100%;
                text-align: center;
            }

            nav ul ul {
                position: static;
                background-color: #444444;
                border-radius: 0;
            }
        }
    </style>
</head>
<body>

    <div class="header">
        <h1>SDFC BANK</h1>
        <h2>EXTRAORDINARY SERVICES</h2>
    </div>

    <nav>
        <button class="menu-toggle">Menu</button>
        <ul>
            <li><a href="/">Home</a></li>
            <li><a href="/addbank">New Bank</a></li>
            <li><a href="/viewbank">Balance</a></li>
            <li><a href="/deposit">Deposit</a></li>
            <li><a href="/withdraw">Withdraw</a></li>
            <li><a href="/transfer">Transfer</a></li>
            <li><a href="/close">Close A/c</a></li>
            <li><a href="/about">About</a></li>
        </ul>
    </nav>
    <center>
     <form action="/login">
    <h1 style="color:red">BALANCE FORM</h1><p></p>
   
    <table border="1">
    <tr>
    <th>Account No:</th>
    <td><input type="number"name="accountno"></td>
    </tr>
    
    <tr>
    <th>Name:</th>
    <td><input type="text"name="name"></td>
    </tr>
    <tr>
    <th>Password:</th>
    <td><input type="text"name="psw"></td>
    </tr>
    <tr>
    <th></th>
    <td><input type="submit"value="Submit"></td>
    </tr>
    <tr>
    <th></th>
    </tr>
    <tr>
    <td></td>
    
    <td><input type="submit"value="Clear"></td>
    </tr>
    </form>
    
    </body>
    </center>
    </table>
    </html>