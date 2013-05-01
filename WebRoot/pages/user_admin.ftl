<!DOCTYPE html>
<html lang="cn">
    <head>
        <meta charset="utf-8">
        <title>LatteSystem-admin</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <link href="css/bootstrap.min.css" rel="stylesheet" media="screen"/>
		<style>
			.modal{
				width:640px;
				margin-left:-320px;             
			}             
			.modal-body{
				overflow: visible;
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
                    <td><a href="#">查看详情</a></td>
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

              <table class="table">
                <thead>
                  <th>玩家名称</th>
                  <th>等级</th>
                  <th>职业</th>
                  <th>杀敌</th>
                  <th>助攻</th>
                  <th>维修</th>
                  <th>被杀数</th>
                  <th>爆尸数</th>
                  <th>复活数</th>
                  <th>输出量</th>
                  <th>承受攻击量</th>
                  <th>治疗量</th>
                  <th>战车驾驶次数</th>
                  <th>战车杀人数</th>
                </thead>
                <tbody>
                  <tr>
                    <td>天神下凡</td>
                    <td>144</td>
                    <td>方士</td>
                    <td>200</td>
                    <td>201</td>
                    <td>0</td>
                    <td>8</td>
                    <td>0</td>
                    <td>0</td>
                    <td>34852358(13.17%)</td>
                    <td>64555408(7.68%)</td>
                    <td>15626733(27.40%)</td>
                    <td>10</td>
                    <td>10</td>
                  </tr>
                  <tr>
                    <td>天神下凡</td>
                    <td>144</td>
                    <td>方士</td>
                    <td>200</td>
                    <td>201</td>
                    <td>0</td>
                    <td>8</td>
                    <td>0</td>
                    <td>0</td>
                    <td>34852358(13.17%)</td>
                    <td>64555408(7.68%)</td>
                    <td>15626733(27.40%)</td>
                    <td>10</td>
                    <td>10</td>
                  </tr>
                </tbody>
              </table>

        		</div>
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