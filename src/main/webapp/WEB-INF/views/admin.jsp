<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../../seting/header.jsp"%>

<button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#addUser">
  增加人员账号
</button>

<!-- Modal -->
<form class="modal fade" id="addUser" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">添加新账号</h4>
      </div>
      <div class="modal-body">
		    <label for="inputEmail3" class="col-sm-2 control-label">Email</label>
		    <div class="col-sm-10">
		      <input type="email" class="form-control" id="inputEmail3" placeholder="Email">
		    </div>
		    
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-primary" data-dismiss="modal">关闭</button>
        <button type="button" class="btn btn-primary">保存</button>
      </div>
    </div>
  </div>
</form>

<!-- Large modal -->
<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#abc">Large modal</button>

<div class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" id="abc">
  <div class="modal-dialog modal-lg" role="document">
    <div class="modal-content">
    	<label for="inputEmail3" class="col-sm-2 control-label">Email</label>
	    <div class="col-sm-10">
	      <input type="email" class="form-control" id="inputEmail3" placeholder="Email">
	    </div>
    	<label for="inputEmail3" class="col-sm-2 control-label">Email</label>
	    <div class="col-sm-10">
	      <input type="email" class="form-control" id="inputEmail3" placeholder="Email">
	    </div>
    	<label for="inputEmail3" class="col-sm-2 control-label">Email</label>
	    <div class="col-sm-10">
	      <input type="email" class="form-control" id="inputEmail3" placeholder="Email">
	    </div>
    </div>
  </div>
</div>


<button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
  增加人员账号
</button>
<div method="get" action="./showform" id="myModal" class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
    <div class="modal-content">

        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
          <h4 class="modal-title" id="myModalLabel">Modal title</h4>
        </div>
        <form class="modal-body" id="addUserForm">
	        <div class="form-group">
			    <label for="exampleInputEmail1">员工账号</label>
			    <input type="text" class="form-control" name="empUsername" placeholder="员工账号">
			</div>
	        <div class="form-group">
			    <label for="exampleInputEmail1">密码</label>
			    <input type="password" class="form-control" name="mepPassword" placeholder="密码">
			</div>
	        <div class="form-group">
			    <label for="exampleInputEmail1">职称</label>
			    <input type="text" class="form-control" name="empJob" placeholder="职称">
			</div>
			
	        <div class="form-group">
			    <label for="exampleInputEmail1">账号状态</label>
			  	<label class="radio-inline">
					<input type="radio" name="empState" id="inlineRadio1" value="true"> 启用
				</label>
				<label class="radio-inline">
					<input type="radio" name="empState" id="inlineRadio2" value="false"> 禁用
				</label>
			</div>
			<label for="exampleInputEmail1">工作单位</label>
			<select class="form-control" name="unitId" id="unitSelect">
			  <option value="1">1</option>
			  <option value="2">2</option>
			  <option value="3">3</option>
			</select>
	        <label class="checkbox-inline">
				<input type="checkbox" id="inlineCheckbox1" value="option1" name="unitName">角色1
			</label>
	        <label class="checkbox-inline">
				<input type="checkbox" id="inlineCheckbox1" value="option2" name="unitName">角色1
			</label>
	        <label class="checkbox-inline">
				<input type="checkbox" id="inlineCheckbox1" value="option3" name="unitName">角色1
			</label>
        </form>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
          <button type="submit" class="btn btn-primary" id="tijian">Save changes</button>
        </div>

      </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div>

<script type="text/javascript">
	$("#unitSelect").click(function() {
		console.log($("#unitSelect option:selected").val());
		
	})
	$("#tijian").click(function(){
		
		$.get("./showform",$("#addUserForm").serializeArray(),function (ret) {
			//alert(ret)
			if (ret != null) {
				console.log(ret);
			} else {
				alert("Null");
			}
		}, "json")
		console.log($("#myModal").serializeArray());
	})
</script>

<%@ include file="../../seting/bottom.jsp"%>



