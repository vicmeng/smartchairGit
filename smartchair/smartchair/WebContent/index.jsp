<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<script src="js/jquery.min.js"></script>
	<script type="text/javascript">
		$(document).ready(function(){
			$("#testJson").click(function(){
				$.post(
						"menuController/queryAllMenu",
						
						function(result){
							for(var i=0;i<result.length;i++){
								alert("id:"+result[i].m_id+"m_name"+result[i].m_name+"m_introduce"+result[i].m_introduce)
							}
						}
						);
			});
		});
		
		$(document).ready(function(){
			$("#ChairJson").click(function(){
				$.post(
						"chairController/queryAllChair",
						
						function(result){
							for(var i=0;i<result.length;i++){
								alert("id:"+result[i].c_id+"m_mac"+result[i].c_mac)
							}
						}
						);
			});
		});
	</script>
</head>

<body>
	<input type="button" value="testJson" id="testJson"/>查询全部菜品<br>
	修改菜品
	<form action="menuController/updateMenuById" method="post">
			
			m_id:<input name="m_id" type="text"/>
			m_name:<input name="m_name" type="text"/>
			m_price:<input name="m_price" type="text"/>
			m_introduce:<input name="m_introduce" type="text"/>
			m_picture:<input name="m_picture" type="text"/>
			m_exit:<input name="m_exit" type="text"/>
			<input type="submit" value="修改">
		</form><br/>
	<a href="menuController/deleteMenuById/2">删除id为2的menu</a><br>
	<form action="menuController/insertMenu" method="post">
			
			
			m_name:<input name="m_name" type="text"/>
			m_price:<input name="m_price" type="text"/>
			m_introduce:<input name="m_introduce" type="text"/>
			m_picture:<input name="m_picture" type="text"/>
			m_exit:<input name="m_exit" type="text"/>
			<input type="submit" value="提交">
		</form><br/>
		
		
		
		
		
		
		
		
		
		
		<input type="button" value="ChairJson" id="ChairJson"/>查询全部座椅<br>
	修改座椅
	<form action="chairController/updateChairById" method="post">
			
			c_id:<input name="c_id" type="text"/>
			c_mac:<input name="c_mac" type="text"/>
			c_number:<input name="c_number" type="text"/>
			c_tele:<input name="c_tele" type="text"/>
			c_produce:<input name="c_produce" type="text"/>
			
			c_state:<input name="c_state" type="text"/>
			<input type="submit" value="修改">
		</form><br/>
	<a href="chairController/deleteChairById/2">删除id为2的chair</a><br>
	<form action="chairController/insertChair" method="post">
			
			
			
			c_mac:<input name="c_mac" type="text"/>
			c_number:<input name="c_number" type="text"/>
			c_tele:<input name="c_tele" type="text"/>
			c_produce:<input name="c_produce" type="text"/>
			
			c_state:<input name="c_state" type="text"/>
			<input type="submit" value="提交">
		</form><br/>
		
</body>

</html>