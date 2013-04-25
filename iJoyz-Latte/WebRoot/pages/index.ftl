<!DOCTYPE html>
<html lang="cn">
    <head>
        <meta charset="utf-8">
        <title>LatteSystem-Login</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- Bootstrap -->
        <style type="text/css">
            body {
                padding-top: 40px;
                padding-bottom: 40px;
                background-color: #f5f5f5;
            }
            
            .form-signin {
                max-width: 300px;
                padding: 19px 29px 29px;
                margin: 0 auto 20px;
                background-color: #fff;
                border: 1px solid #e5e5e5;
                -webkit-border-radius: 5px;
                -moz-border-radius: 5px;
                border-radius: 5px;
                -webkit-box-shadow: 0 1px 2px rgba(0, 0, 0, .05);
                -moz-box-shadow: 0 1px 2px rgba(0, 0, 0, .05);
                box-shadow: 0 1px 2px rgba(0, 0, 0, .05);
            }
            
            .form-signin .form-signin-heading, .form-signin .checkbox {
                margin-bottom: 10px;
            }
            
            .form-signin input[type =
            "text"], .form-signin input[type = "password"] {
                font-size: 16px;
                height: auto;
                margin-bottom: 15px;
                padding: 7px 9px;
            }
        </style>
        <link href="css/bootstrap.min.css" rel="stylesheet" media="screen"/>
    </head>
    <body>
        <div class="container">
            <form class="form-signin" action="/login.do" method="post">
                <h2 class="form-signin-heading">登 录</h2>
                <input name="userName" type="text" class="input-block-level" placeholder="用户名"/><input name="pass" type="password" class="input-block-level" placeholder="密码"/>
                <label class="checkbox">
                    <input type="checkbox" value="remember-me">自动登录
                    </input>
                </label>
                <button class="btn btn-large btn-primary" type="submit">
                    登 录
                </button>
            </form>
        </div>
        <!-- /container -->
        <script src="http://code.jquery.com/jquery.js">
        </script>
        <script src="js/bootstrap.min.js">
        </script>
    </body>
</html>