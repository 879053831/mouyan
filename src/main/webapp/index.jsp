<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./seting/header.jsp"%>
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
                        <a class="page-scroll" href="/asd">登录</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="contact.html">Contacts</a>
                    </li>
				</ul>
			</div>
		</div>
	</nav>
	
	<div class="slide">
		<div class="container">
			<div class="row">
				<!-- Carousel -->
				<div id="carousel-example-generic" class="carousel slide box-shadow" data-ride="carousel">
					<!-- Indicators -->
					<ol class="carousel-indicators">
						<li data-target="#carousel-example-generic" data-slide-to="0" class=""></li>
						<li data-target="#carousel-example-generic" data-slide-to="1" class="active"></li>
						<li data-target="#carousel-example-generic" data-slide-to="2"></li>
					</ol>
					<!-- Wrapper for slides -->
					<div class="carousel-inner">
						<div class="item">
							<img src="${baseUrl}/style/images/1.jpg" alt="First slide">
							<!-- Static Header -->
						</div>
						<div class="item active">
							<img src="${baseUrl}/style/images/2.jpg" alt="Second slide">
							<!-- Static Header -->
						</div>
					</div>
					<!-- Controls -->
					<a class="left carousel-control" href="#carousel-example-generic" data-slide="prev">
						<span class="glyphicon glyphicon-chevron-left"></span>
					</a>
					<a class="right carousel-control" href="#carousel-example-generic" data-slide="next">
						<span class="glyphicon glyphicon-chevron-right"></span>
					</a>
				</div><!-- /carousel -->
			</div>
		</div>
	</div>
	
	<a id="backTop" class="red" style="right: 40px; bottom: 40px; position: fixed;">Back To Top</a>
	<!-- /Back To Top -->
	<div class="tlinks">Collect from <a href="http://www.cssmoban.com/">自助建站</a></div>
	
	<!-- /////////////////////////////////////////Content -->
	<div id="page-content" class="index-page">
	
		<!-- ////////////Content Box 01 -->
		<div id="services"></div>
		<section class="box-content container box-1">
			<div class="row">
				<div class="col-sm-4 ">
					<div class="service">
						<a href="#"><img src="${baseUrl}/style/images/icon1.png" title="icon-name"></a>
						<h3>The largest network of laboratory centers</h3>
						<p>We have contracts with laboratories all over the world to provide lab services at the best prices. We also contract with the free-standing independent laboratories for... </p>
						<a class="btn btn-2 btn-sm" href="#">Read More</a>
					</div>
				</div>
				<div class="col-sm-4 ">
					<div class="service">
						<a href="#"><img src="${baseUrl}/style/images/icon3.png" title="icon-name"></a>
						<h3>The modern laboratory facilities</h3>
						<p>We’ve done our research to ensure that the medical laboratory equipment we use has been industry approved and has surpassed statistical benchmarks for risk assessment. Our team members are highly trained...</p>
						<a class="btn btn-2 btn-sm" href="#">Read More</a>
					</div>
				</div>
				<div class="col-sm-4 ">
					<div class="service">
						<a href="#"><img src="${baseUrl}/style/images/icon2.png" title="icon-name"></a>
						<h3>Helpful test tips</h3>
						<p>If you are nervous or have a tendency to feel woozy or faint, tell the phlebotomist before you begin. Your blood can be drawn while you are lying down, which will help you avoid fainting and injuring yourself. If, at any time, you feel faint or lightheaded... </p>
						<a class="btn btn-2 btn-sm" href="#">Read More</a>
					</div>
				</div>		
			</div>
		</section>
	
		<!-- ////////////Content Box 02 -->
		<section class="box-content box-2 container box-style-1 box-shadow">
			<div class="row">
				<div class="col-md-12">
					<h3>Offering a wide range of laboratory services</h3>
					<p>Our fully computerised laboratory group offers a high quality, cost-effective service and clinical expertise to local general practitioners and other trusts, hospitals and healthcare providers. Our innovative laboratory services enhance patient health.</p>
					<a class="btn btn-lg btn-blue box-shadow" href="#">Read More</a>
				</div>
			</div>
		</section>
		
		<!-- ////////////Content Box 03 -->
		<section class="box-content container box-3 box-shadow">
			<div class="row">
				<div class="col-md-4">	
					<img src="${baseUrl}/style/images/6.jpg" alt="">
	            </div>
				<div class="col-md-4">	
					<h4>Most common tests</h4>
					<p>Our laboratory provides comprehensive, multidisciplinary pathology services. As part of a regular checkup, to get a diagnosis, or perhaps to provide a benchmark, your doctor may request one or more laboratory tests. Here is a list of the most common tests ordered and their purpose. Most tests are done using a blood sample. Some standard tests are usually performed on admission to a hospital or as part of an annual physical.</p>
	            </div>
				<div class="col-md-4">	
					<h4>The List Links</h4>
					<ul class="list-unstyled">
						<li><a href="#"><i class="fa fa-check"></i> Flu tests</a></li>
						<li><a href="#"><i class="fa fa-check"></i> Glucose</a></li>
						<li><a href="#"><i class="fa fa-check"></i> Semen Analysis</a></li>
						<li><a href="#"><i class="fa fa-check"></i> Uric Acid</a></li>
						<li><a href="#"><i class="fa fa-check"></i> Complete Blood Count</a></li>
						<li><a href="#"><i class="fa fa-check"></i> Hemoglobin or Glycohemoglobin</a></li>
					</ul>
	            </div>
			</div>
		</section>
	
		<section class="box-content box-4 container box-style-2 box-shadow">
			<div class="row">
				<div class="col-md-12">
					<h3>Offering a wide range of laboratory services</h3>
					<p>Our fully computerised laboratory group offers a high quality, cost-effective service and clinical expertise to local general practitioners and other trusts, hospitals and healthcare providers. Our innovative laboratory services enhance patient health.</p>
					<a class="btn btn-lg btn-red box-shadow" href="#">Read More</a>
				</div>
			</div>
		</section>
		
		<!-- ////////////Content Box 05 -->
		<section class="box-content container box-5 box-shadow">
			<div id="owl-brand" class="owl-carousel owl-theme" style="opacity: 1; display: block;">
				<div class="owl-wrapper-outer"><div class="owl-wrapper" style="width: 4360px; left: 0px; display: block; transition: all 800ms ease; transform: translate3d(-1090px, 0px, 0px);"><div class="owl-item" style="width: 1090px;"><div class="row item">
					<div class="col-md-4 text-center">
						<img src="${baseUrl}/style/images/tester1.jpg" class="testimonials img-circle" alt="">
					</div>
					<div class="col-md-8">
						<div class="box-comment">
							Your company understands today’s requirements, but that’s not what makes you stand apart. You also understand today’s business world and how to keep customers happy.
						</div>
						<a class="author" href="#">Timmy</a>
					</div>
				</div></div><div class="owl-item" style="width: 1090px;"><div class="row item">
					<div class="col-md-4 text-center">
						<img src="${baseUrl}/style/images/tester2.jpg" class="testimonials img-circle" alt="">
					</div>
					<div class="col-md-8">
						<div class="box-comment">
							Your company understands today’s requirements, but that’s not what makes you stand apart. You also understand today’s business world and how to keep customers happy.
						</div>
						<a class="author" href="#">Timmy</a>
					</div>
				</div></div></div></div>
				
			<div class="owl-controls clickable"><div class="owl-pagination"><div class="owl-page"><span class=""></span></div><div class="owl-page active"><span class=""></span></div></div></div></div>
		</section>
	</div>

	<footer>
		<div class="wrap-footer">
			<div class="container">
				<div class="row">
					<div class="col-md-3 col-footer footer-1">
						<div class="footer-heading"><h4>Partners</h4></div>
						<div class="content">
							<div class="row">
								<div class="col-md-6">
									<a href="#"><img src="${baseUrl}/style/images/22.jpg"></a>
								</div>
								<div class="col-md-6">
									<a href="#"><img src="${baseUrl}/style/images/23.jpg"></a>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<a href="#"><img src="${baseUrl}/style/images/24.jpg"></a>
								</div>
								<div class="col-md-6">
									<a href="#"><img src="${baseUrl}/style/images/18.jpg"></a>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<a href="#"><img src="${baseUrl}/style/images/19.jpg"></a>
								</div>
								<div class="col-md-6">
									<a href="#"><img src="${baseUrl}/style/images/20.jpg"></a>
								</div>
							</div>
							
						</div>
					</div>
					<div class="col-md-3 col-footer footer-2">
						<div class="footer-heading"><h4>About Us</h4></div>
						<div class="content">
							<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad. Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad</p>
						</div>
					</div>
					<div class="col-md-3 col-footer footer-3">
						<div class="footer-heading"><h4>Follow us</h4></div>
						<div class="content">
							<ul>
								<li><a href="#"><i class="fa fa-facebook"></i> Facebook</a></li>
								<li><a href="#"><i class="fa fa-twitter"></i> Twitter</a></li>
								<li><a href="#"><i class="fa fa-rss"></i> RSS</a></li>
							</ul>
						</div>
					</div>
					<div class="col-md-3 col-footer footer-4">
						<div class="footer-heading"><h4>Navigation</h4></div>
						<div class="content">
							<ul>
								<li><a href="index.html"><i class="fa fa-home"></i> 首页</a></li>
								<li><a href="single.html"><i class="fa fa-users"></i> 关于我们</a></li>
								<li><a href="service.html"><i class="fa fa-ambulance"></i> 服务</a></li>
								<li><a href="archive.html"><i class="fa fa-folder-open-o"></i>  Blogs</a></li>
								<li><a href="contact.html"><i class="fa fa-envelope-o"></i> Contacts</a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
	</footer>
	<div class="coppy-right">
		<div class="wrap-footer">
			<div class="clearfix">
				<div class="col-md-6 col-md-offset-3">
				</div>
			</div>	
		</div>
	</div>
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
	
