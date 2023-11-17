<html>
<head>
</head>
<body style="color:red">
 ${company}
 ${quantity}
 ${msg}
 ${message}
<form action="/ui/getPrice">
<table>
    <tr>
        <td>company name:</td>
        <td><input type="text" name="companyName"></td>
    </tr>
    <tr>
        <td>quantity:</td>
        <td><input type="text" name="quantity"></td>
    </tr>
    <tr>
        <td><input type="submit"></td>
    </tr>
</table>
</form>

<h1>go to  <a href="/ui/getall"> this</a>get total stocks</h1>
</body>
</html>