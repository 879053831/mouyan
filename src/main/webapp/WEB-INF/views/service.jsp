<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../../seting/header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>	
	
	<!-- /////////////////////////////////////////Top -->
	<header>
		<div class="container">
			<div class="row">
				<div class="col-md-6">
					<a href="#" class="logo"><img src="${baseUrl}/style/images/logo.png" alt="Third slide"></a>
				</div>
				<div class="col-md-6 text-right">
					<span>Information Service:</span><br>
					<strong class="contact-phone"><i class="fa fa-phone"></i> 800-2345-6789</strong>
				</div>
			</div>
		</div>
	</header>
	<!-- Header -->
	
	<!-- /////////////////////////////////////////Navigation -->
	<nav class="navbar navbar-default" role="navigation">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">
					Welcome to us !
				</a>
			</div>
			<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav navbar-right">
					<li>
                        <a class="page-scroll" href="index.html">首页</a>
                    </li>
					<li>
                        <a class="page-scroll" href="single.html">关于我们</a>
                    </li>
					<li>
                        <a class="page-scroll" href="service.html">服务</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="index/login">登录</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="contact.html">Contacts</a>
                    </li>
				</ul>
			</div>
		</div>
	</nav>
	
	
	<!-- Footer -->
	
	<!-- Core JavaScript Files -->
    <script src="${baseUrl}/style/js/bootstrap.min.js"></script>
	<script src="${baseUrl}/style/js/jquery.backTop.min.js"></script>
	<script>
		$(document).ready( function() {
			$('#backTop').backTop({
				'position' : 1200,
				'speed' : 500,
				'color' : 'red',
			});
		});
	</script>
	
	<!-- carousel -->
	<script src="${baseUrl}/style/owl-carousel/owl.carousel.js"></script>
    <script>
    $(document).ready(function() {
      $("#owl-brand").owlCarousel({
        autoPlay: 3000,
        items : 1,
		itemsDesktop : [1199,1],
        itemsDesktopSmall : [979,2],
		navigation: false,
      });
    });
    </script>


	
</body>
</html>
	
