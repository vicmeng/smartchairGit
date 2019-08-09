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
		
		$(document).ready(function(){
			$("#RestayrantJson").click(function(){
				$.post(
						"restaurantController/queryAllRestaurant",
						
						function(result){
							for(var i=0;i<result.length;i++){
								alert("id:"+result[i].r_id+"m_mac"+result[i].r_name)
							}
						}
						);
			});
		});
	</script>
</head>

<body>
	123456
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
	<a href="chairController/queryChairStateCount">查新chair的种类</a><br>
	<form action="chairController/insertChair" method="post">
			
			
			
			c_mac:<input name="c_mac" type="text"/>
			c_number:<input name="c_number" type="text"/>
			c_tele:<input name="c_tele" type="text"/>
			c_produce:<input name="c_produce" type="text"/>
			
			c_state:<input name="c_state" type="text"/>
			<input type="submit" value="提交">
		</form><br/>
		
		<input type="button" value="RestayrantJson" id="RestayrantJson"/>查询全部餐厅<br>
	修改餐厅
	<form action="restaurantController/updateRestaurantById" method="post">
			
			r_id:<input name="r_id" type="text"/>
			r_name:<input name="r_name" type="text"/>
			r_position:<input name="r_position" type="text"/>
			r_tele:<input name="r_tele" type="text"/>
			r_picture:<input name="r_picture" type="text"/>
			
			<input type="submit" value="修改">
		</form><br/>
	<a href="restaurantController/deleteRestaurantById/2">删除id为2的餐厅</a><br>
	<form action="restaurantController/insertRestaurant" method="post">
			
			
			
			
			r_name:<input name="r_name" type="text"/>
			r_position:<input name="r_position" type="text"/>
			r_tele:<input name="r_tele" type="text"/>
			r_picture:<input name="r_picture" type="text"/>
			<input type="submit" value="提交">
		</form><br/>
		time
		<form action="formController/insertFormById" method="post">

			f_state:<input name="f_state" type="text"/>
			f_food:<input name="f_food" type="text"/>
			f_money:<input name="f_money" type="text"/>
			
			f_id:<input name="f_id" type="text"/>
			<input type="submit" value="提交">
		</form><br/>
		改time
		<form action="formController/updateFormById" method="post">
			t_id:<input name="t_id" type="text"/>
			f_state:<input name="f_state" type="text"/>
			f_food:<input name="f_food" type="text"/>
			f_money:<input name="f_money" type="text"/>
			
			f_id:<input name="f_id" type="text"/>
			<input type="submit" value="提交">
		</form><br/>
</body>

</html>
