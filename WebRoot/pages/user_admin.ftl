<!DOCTYPE html>
<html lang="cn">
    <head>
        <meta charset="utf-8">
        <title>LatteSystem-admin</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <link href="css/bootstrap.min.css" rel="stylesheet" media="screen"/>
		<style>
			.modal{
				width:1024px;
				margin-left:-512px;             
			}
      .modal-body{
        overflow: auto;
      }     
      .table{
        font-size: 12px;
        table-layout: fixed;
      }
      .table td{
        overflow: auto;
      }
    </style>

    </head>
    <body>
        <div class="navbar">
            <div class="navbar-inner">
                <ul class="nav pull-right">
                    <li>
                        <a>朱石君</a>
                    </li>
                    <li>
                        <a href="#">退出</a>
                    </li>
                </ul>
            </div>
        </div>
            
        <div class="container">
        	<div class="row">
        		<div class="span2">
        			<ul class="nav nav-list affix">
                <li class="active"><a href="#league">联赛成绩</a></li>
                <li class=""><a href="#member">帮会人员</a></li>
                <li class=""><a href="#other">其他</a></li>
              </ul>
        		</div>
        		<div class="span10">
              <table class="table">
                <thead>
                  <th>时间</th>
                  <th>对阵双方</th>
                  <th>结果</th>
                  <th>操作</th>
                </thead>
                <tbody>
                  <tr>
                    <td>2013年5月1日17:57:48</td>
                    <td>开心就好 VS 烟云逍遥轩</td>
                    <td>胜利</td>
                    <td><a href="data.html" data-toggle="modal" data-target="#modalCreateItem">查看详情</a></td>
                  </tr>
                  <tr>
                    <td>2013年5月1日17:57:48</td>
                    <td>开心就好 VS 烟云逍遥轩</td>
                    <td>胜利</td>
                    <td><a href="#">查看详情</a></td>
                  </tr>
                  <tr>
                    <td>2013年5月1日17:57:48</td>
                    <td>开心就好 VS 烟云逍遥轩</td>
                    <td>胜利</td>
                    <td><a href="#">查看详情</a></td>
                  </tr>
                </tbody>
              </table>

        		</div>
        	</div>
        </div>

        <div id="modalCreateItem" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
            <h3 id="myModalLabel">详细信息</h3>
          </div>
          <div class="modal-body">
          </div>
        </div>
        <script src="js/jquery-1.9.1.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script type="text/javascript">
        	$(document).ready(function(){



        		/*选择支出;收入;转账函数*/
				$("[href='#changetype#']").click(function(){
				  $("#typebtn").text($(this).text());
				});
			});
        </script>
    </body>
</html>