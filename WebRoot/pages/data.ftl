            <table class="table">
              <thead>
                <th><a href="#">玩家名称</a></th>
                <th>等级</th>
                <th>职业</th>
                <th>杀敌</th>
                <th>助攻</th>
                <th>维修</th>
                <th>被杀数</th>
                <th>爆尸数</th>
                <th>复活数</th>
                <th>战车驾驶数</th>
                <th>战车杀人数</th>
                <th>其他</th>
              </thead>
              <tbody>
              	<#list datas as it>
                <tr>
                  <td>${it.name}</td>
                  <td>${it.level}</td>
                  <td>${it.prof}</td>
                  <td>${it.heads}</td>
                  <td>${it.assist}</td>
                  <td>${it.repair}</td>
                  <td>${it.dieCount}</td>
                  <td>${it.corpse}</td>
                  <td>${it.revive}</td>
                  <td>${it.driveChariotCount}</td>
                  <td>${it.chariotHeads}</td>
                  <td><a href="#">其他操作</a></td>
                </tr>
                </#list>
              </tbody>
            </table>