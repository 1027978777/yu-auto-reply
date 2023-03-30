<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hello World!</title>
</head>
<body>
<form method="POST" action="/xx" accept-charset="UTF-8">
    <div id="login">
        <table>
            <tr height="60">
                <td class="text-dark">问题：</td>
                <td><input width="150" name="username" class="form-control" type="text" required></td>
            </tr>
            <tr height="60">
                <td></td>
                <td>
                    <button type="submit" class="btn btn-primary btn-block">确定</button>
                </td>
                <td></td>
            </tr>
        </table>
    </div>
</form>
<#if answer??>
    <div>${answer.username!}</div>
</#if>
</body>
</html>