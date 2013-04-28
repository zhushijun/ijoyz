<!DOCTYPE html>
<html lang="cn">
    <head>
        <meta charset="utf-8">
        <title>LatteSystem-admin</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="/css/bootstrap.min.css" rel="stylesheet" media="screen"/>
    </head>
    <body>
        <div class="container">
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
            <div class="row-fluid">
                <div class="span3">
                    <a class="btn btn-large btn-block btn-primary" href="#modalCreateItem" data-toggle="modal">
                        创建记录
                    </a>
                </div>
                <div class="span3">
                    <a class="btn btn-large btn-block">
                        明细查询
                    </a>
                </div>
                <div class="span3">
                    <a class="btn btn-large btn-block">
                        统计分析
                    </a>
                </div>
                <div class="span3">
                    <a class="btn btn-large btn-block">
                        设置
                    </a>
                </div>
            </div>
            
            <h2>明细</h2>
               
			<table class="table">
				<thead>
					<th>时间</th>
					<th>金额</th>
					<th>账务类型</th>
					<th>备注</th>
					<th>操作</th>
				</thead>
				<tbody>
					<tr>
						<td>2013年4月11日</td>
						<td>100.12</td>
						<td>公款消费</td>
						<td>吃喝玩乐</td>
						<td><a href="#">删除</a></td>	
					</tr>
					<tr>
						<td>2013年4月11日</td>
						<td>100.12</td>
						<td>公款消费</td>
						<td>吃喝玩乐</td>
						<td><a href="#">删除</a></td>	
					</tr>
				</tbody>
				
			</table>
			 
					<!-- 创建记录浮层 -->
					<div id="modalCreateItem" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
							<h3 id="myModalLabel">创建记录</h3>
						</div>
	
						<div class="modal-body">

							<form class="form-inline">
								<div class="control-group">
									<input type="text" class="input-xlarge" placeholder="输入金额..."/>
									
									<div class="dropdown btn-group controls">
										<button class="btn dropdown-toggle" data-toggle="dropdown">类型</button>
										<ul class="dropdown-menu" role="menu" aria-labelledby="dLabel">
											<li class="presentation">aaa</li>
											<li class="presentation">aaa</li>
											<li class="presentation">aaa</li>
										</ul>
									</div>
								</div>
								<div class="control-group"><textarea rows=3 class="input-xlarge" placeholder="备注"></textarea></div>
							</form>
						</div>
						<div class="modal-footer">
							<button class="btn" data-dismiss="modal" aria-hidden="true">关闭</button>
							<button class="btn btn-primary">保存</button>
						</div>
					</div>
				  <!-- /创建记录浮层 -->
			
			
        </div>
        <script src="/js/jquery-1.9.1.min.js"></script>
        <script src="/js/bootstrap.min.js"></script>
    </body>
</html>