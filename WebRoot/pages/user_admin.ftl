<!DOCTYPE html>
<html lang="cn">
    <head>
        <meta charset="utf-8">
        <title>LatteSystem-admin</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <link href="/css/bootstrap.min.css" rel="stylesheet" media="screen"/>
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
                        <a>${user.userName}</a>
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
	                  <#list leagues as item>
	                  <tr>
	                    <td>${item.date?date}</td>
	                    <td>${item.gang.name} VS ${item.rival}</td>
	                    <td><#if item.win>胜利<#else>失败</#if></td>
	                    <td><a href="/u/${user.userName}/detail.do?id=${item.id}" data-toggle="modal" data-target="#modalCreateItem">详情</a></td>
	                  </tr>
	                  </#list>
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
        <script src="/js/jquery-1.9.1.min.js"></script>
        <script src="/js/bootstrap.min.js"></script>
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