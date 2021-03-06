<%@page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>购物车</title>
    <link rel="stylesheet" href="../../../resources/css/bootstrap4.min.css">
    <link rel="stylesheet" href="../../../resources/css/user/login.css">
    <link rel="stylesheet" href="../../../resources/css/user/shoppingcart.css">
</head>

<body>
    <div class="container mt-4" id="app">
        <div class="row title">
            <div class="col-md-4 col-12 head ">
                <div class="row no-gutters">
                    <div class="col-7 ">
                        <div class="logo">Cheng</div>
                    </div>
                    <div class="col-5 ">
                        <div class="title ml-2 ">
                            <div class="name">跨境专供</div>
                            <div class="addrurl">kj.cheng.com</div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="vhr1"></div>
            <h3>购物车</h3>
        </div>

        <div class="row justify-content-center no-gutters table-head text-center d-none d-md-flex">
            <div class="col-md-4">
                商品信息
            </div>
            <div class="col-md-2">单价 (元)</div>
            <div class="col-md-2">数量</div>
            <div class="col-md-2">金额 (元)</div>
            <div class="col-md-2">操作</div>
        </div>

        <div class="cart mt-2 pt-2" v-for="(citem,index) in cart" >
            <div class="brand">
                <img src="../../../resources/img/shangjia.png">店铺：
                <a :href="'http://localthos/brand/'+citem.brand.id">{{citem.brand.name}}</a>
                <img src="../../../resources/img/liaotian.png" class="liaotian" />
            </div>
            <div class="row text-center justify-content-center align-items-center" v-for="(pitem,pindex) in citem.products" >
                <div class="col-md-4">
                    <div class="d-flex align-items-center product">
                        <img :src="pitem.pimg">
                        <div>{{pitem.pname}}</div>
                    </div>
                </div>
                <div class="col-md-2 col-6">
                    <span class="d-md-none d-inline">单价:</span>
                    ￥：
                    <b>{{pitem.pmoney}}</b>
                </div>
                <div class="col-md-2 col-6 d-flex number justify-content-center">
                    <button @click="pnumbermin(pitem)">-</button>
                    <input type="text" v-model="pitem.pnumber" />
                    <button @click="pnumberadd(pitem)">+</button>
                </div>
                <div class="col-md-2 col-6">
                    <span class="d-md-none d-inline">总价:</span>
                    ￥：
                    <b>{{(pitem.pmoney*pitem.pnumber).toFixed(2)}}</b>
                </div>
                <div class="col-md-2 op col-6 mt-mo-0 mt-2">
                    <a href="#">加入收藏夹</a>
                    <div></div>
                    <a href="#">删除</a>
                </div>
            </div>

            <div class="js row justify-content-end text-center">
                <div class="col-md-3">
                    <div>合计（不含运费）： ￥
                        <b>939.99</b>
                        </>
                        <button class="btn btn-danger btn-block">结算</button>
                    </div>
                </div>

            </div>

        </div>
    </div>



    <!-- jQuery first, then Popper.js, then Bootstrap JS  -->
    <script src="../../../resources/js/jquery-3.2.1.min.js"></script>
    <script src="../../../resources/js/popper.min.js"></script>
    <script src="../../../resources/js/bootstrap.min.js"></script>
    <script src="../../../resources/js/vue.js"></script>
    <script>
        let vue = new Vue({
            el: '#app',
            data: {
                cart: [{
                    brand: {
                        id: "123",
                        name: "youjie"
                    },
                    products: [{
                        pid: "456",
                        pimg: 'https://img.alicdn.com/bao/uploaded/i2/36054738/TB2e1_nXWAoBKNjSZSyXXaHAVXa_!!36054738.jpg_80x80.jpg',
                        pname: 'Intel/英特尔 i7 8700K 酷睿六核CPU中文盒装Z370主板吃鸡套装',
						pmoney:123.1,
                        pnumber: 1

                    }]
                }]
            },
			methods:{
				pnumbermin(pitem) {
					if(pitem.pnumber==1){
						pitem.pnumber=1
					}else
						pitem.pnumber=pitem.pnumber-1
				},
				pnumberadd(pitem) {
					pitem.pnumber=pitem.pnumber+1
				}
			}
        })
    </script>
</body>

</html>
