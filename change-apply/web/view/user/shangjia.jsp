<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title></title>
    <link rel="stylesheet" href="../../css/bootstrap4.min.css">
    <link rel="stylesheet" type="text/css" href="../../css/base.css"/>

    <link rel="stylesheet" href="../../css/user/center.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/user/shangjia.css">
</head>

<body>
<div class="head">
    <div class="container">
        <nav class="navbar navbar-expand-lg navbar-light ">
            <a class="navbar-brand" href="#">Change 工作平台</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
                    aria-controls="navbarSupportedContent"
                    aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item ">
                        <a class="nav-link" href="center.jsp">卖家</a>
                    </li>
                    <li class="nav-item active">
                        <a class="nav-link" href="./shangjia.jsp">商家<span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">设置</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                           data-toggle="dropdown" aria-haspopup="true"
                           aria-expanded="false">
                            服务
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item" href="#">Action</a>
                            <a class="dropdown-item" href="#">Another action</a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="#">Something else here</a>
                        </div>
                    </li>
                </ul>
                <form class="form-inline my-2 my-lg-0">
                    <input class="form-control mr-sm-2" type="search" placeholder="请输入你要搜索的服务">
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">搜索</button>
                </form>
            </div>
        </nav>
    </div>
</div>

<div class="container mt-3">
    <div class="row ">
        <div class="col-md-3 col-12">
            <div class="whitebag left-op">
              
                <h6>商家快捷入口</h6>
                <ul>
                    <li>
                        <a href="#" class="" data-index='home'>上架商品</a>
                    </li>
                    <li>
                        <a href="#" class="active" data-index='order'>订单管理</a>
                    </li>
                    
                </ul>
                
                <h6>商家管理</h6>
                <ul>
                    <li>
                        <a href="#">账号信息</a>
                    </li>
                    <li>
                        <a href="#">账号安全</a>
                    </li>
                    <li>
                        <a href="#">交易资料管理</a>
                    </li>
                </ul>
            </div>
        </div>
        <div class="col-9 whitebag">
            <div class="tab-content" id="panes">
                <!-- 上架商品 -->
                <div class="tab-pane pt-3" id="home">
                    <form>
                        <div class="form-group">
                          <label for="inputAddress">商品名称：</label>
                          <input type="text" class="form-control" id="inputAddress" placeholder="1234 Main St">
                        </div>
                      <div class="form-row">
                        <div class="form-group col-md-6">
                          <label for="inputEmail4">Email</label>
                          <input type="email" class="form-control" id="inputEmail4" placeholder="Email">
                        </div>
                        <div class="form-group col-md-6">
                          <label for="inputPassword4">Password</label>
                          <input type="password" class="form-control" id="inputPassword4" placeholder="Password">
                        </div>
                      </div>
                      <div class="form-group">
                        <label for="inputAddress">Address</label>
                        <input type="text" class="form-control" id="inputAddress" placeholder="1234 Main St">
                      </div>
                      <div class="form-group">
                        <label for="inputAddress2">Address 2</label>
                        <input type="text" class="form-control" id="inputAddress2" placeholder="Apartment, studio, or floor">
                      </div>
                      <div class="form-row">
                        <div class="form-group col-md-6">
                          <label for="inputCity">City</label>
                          <input type="text" class="form-control" id="inputCity">
                        </div>
                        <div class="form-group col-md-4">
                          <label for="inputState">State</label>
                          <select id="inputState" class="form-control">
                            <option selected>Choose...</option>
                            <option>...</option>
                          </select>
                        </div>
                        <div class="form-group col-md-2">
                          <label for="inputZip">Zip</label>
                          <input type="text" class="form-control" id="inputZip">
                        </div>
                      </div>
                      <div class="form-group">
                        <div class="form-check">
                          <input class="form-check-input" type="checkbox" id="gridCheck">
                          <label class="form-check-label" for="gridCheck">
                            Check me out
                          </label>
                        </div>
                      </div>
                      <button type="submit" class="btn btn-primary">Sign in</button>
                    </form>

                </div>
                <!-- 订单管理 -->
                <div class="tab-pane active" id="order">
                    <div class="row pt-4">
                        <div class="col-12">
                            <nav>
                              <div class="nav nav-tabs" id="nav-tab" role="tablist">
                                <a class="nav-item nav-link active" id="nav-home-tab" data-toggle="tab" href="#nav-home" role="tab" aria-controls="nav-home" aria-selected="true">已上架</a>
                                <a class="nav-item nav-link" id="nav-profile-tab" data-toggle="tab" href="#nav-profile" role="tab" aria-controls="nav-profile" aria-selected="false">待发货</a>
                                <a class="nav-item nav-link" id="nav-contact-tab" data-toggle="tab" href="#nav-contact" role="tab" aria-controls="nav-contact" aria-selected="false">撤回中</a>
                                <a class="nav-item nav-link" id="nav-contact-tab" data-toggle="tab" href="#nav-contact" role="tab" aria-controls="nav-contact" aria-selected="false">购买订单</a>
                              </div>
                            </nav>
                            <div class="tab-content" id="nav-tabContent">
                              <div class="tab-pane fade show active" id="nav-home">
                                  <div class="row products">
                                      <div class="col-md-4 col-12 mb-2">
                                        <a href="#" class="item">
                                            <div class="img">
                                                <img src="../../img/commodity/4.webp.jpg">
                                            </div>
                                            <p class="product-name">高清照相机</p>
                                            <div class="info clearfix">
                                                <span class="float-left">单价：99.98</span>
                                                <span class="float-right">库存：99999</span>
                                            </div>
                                            <div class="info clearfix">
                                                <span class="float-left">分类：数码设备</span>
                                                <span class="float-right">状态：可购买</span>
                                            </div>
                                            <p class="info">上架时间：2018-5-11 11:15:23</p>
                                            <div class="op text-right">
                                                <button class="btn btn-primary">修改</button>
                                                <button class="btn btn-danger">下架</button>
                                            </div>

                                        </a>
                                      </div>
                                      <div class="col-md-4 col-12 mb-2">
                                        <a href="#" class="item">
                                            <div class="img">
                                                <img src="../../img/commodity/4.webp.jpg">
                                            </div>
                                            <p class="product-name">高清照相机</p>
                                            <div class="info clearfix">
                                                <span class="float-left">单价：99.98</span>
                                                <span class="float-right">库存：99999</span>
                                            </div>
                                            <div class="info clearfix">
                                                <span class="float-left">分类：数码设备</span>
                                                <span class="float-right">状态：可购买</span>
                                            </div>
                                            <p class="info">上架时间：2018-5-11 11:15:23</p>
                                            <div class="op text-right">
                                                <button class="btn btn-primary">修改</button>
                                                <button class="btn btn-danger">下架</button>
                                            </div>

                                        </a>
                                      </div>
                                      <div class="col-md-4 col-12 mb-2">
                                        <a href="#" class="item">
                                            <div class="img">
                                                <img src="../../img/commodity/4.webp.jpg">
                                            </div>
                                            <p class="product-name">高清照相机</p>
                                            <div class="info clearfix">
                                                <span class="float-left">单价：99.98</span>
                                                <span class="float-right">库存：99999</span>
                                            </div>
                                            <div class="info clearfix">
                                                <span class="float-left">分类：数码设备</span>
                                                <span class="float-right">状态：可购买</span>
                                            </div>
                                            <p class="info">上架时间：2018-5-11 11:15:23</p>
                                            <div class="op text-right">
                                                <button class="btn btn-primary">修改</button>
                                                <button class="btn btn-danger">下架</button>
                                            </div>

                                        </a>
                                      </div>
                                      <div class="col-md-4 col-12 mb-2">
                                        <a href="#" class="item">
                                            <div class="img">
                                                <img src="../../img/commodity/4.webp.jpg">
                                            </div>
                                            <p class="product-name">高清照相机</p>
                                            <div class="info clearfix">
                                                <span class="float-left">单价：99.98</span>
                                                <span class="float-right">库存：99999</span>
                                            </div>
                                            <div class="info clearfix">
                                                <span class="float-left">分类：数码设备</span>
                                                <span class="float-right">状态：可购买</span>
                                            </div>
                                            <p class="info">上架时间：2018-5-11 11:15:23</p>
                                            <div class="op text-right">
                                                <button class="btn btn-primary">修改</button>
                                                <button class="btn btn-danger">下架</button>
                                            </div>

                                        </a>
                                      </div>
                                  </div>
                              </div>
                              <div class="tab-pane fade" id="nav-profile" role="tabpanel" aria-labelledby="nav-profile-tab">...</div>
                              <div class="tab-pane fade" id="nav-contact" role="tabpanel" aria-labelledby="nav-contact-tab">...</div>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="tab-pane" id="shoppingcart">.32..</div>
                <div class="tab-pane" id="collection">4...</div>
            </div>
        </div>
    </div>
</div>
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS  -->
<script src="../../js/jquery-3.2.1.min.js"></script>
<script src="../../js/popper.min.js"></script>
<script src="../../js/bootstrap.min.js"></script>
<script type="text/javascript">
    $('.left-op').on('click', 'ul li a', function (e) {
        e.preventDefault();
        // 左边选择
        $('.left-op ul li a').removeClass('active');
        $(this).addClass('active')
        let index = $(this).data("index");
        // alert(index)
        //右边面板改变
        $('#' + index).siblings().removeClass('active')
        $('#' + index).addClass('active')

        //window.location.href = window.location.href + '#' + index;
    })
</script>

</body>

</html>