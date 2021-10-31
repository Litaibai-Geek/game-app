<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
<meta name="renderer" content="webkit">
<meta name="force-rendering" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,Chrome=1">
<meta name="applicable-device" content="pc,mobile">
<title>某某有限公司官网</title>
<meta name="author" content="order by hnymwl.com" />
<meta name="keywords" content="网站关键词" />
<meta name="description" content="网站描述" />
<link href="../skin/css/font.css" rel="stylesheet">
<link href="../skin/css/style.css" rel="stylesheet">
<link href="..//skin/css/swiper.min.css" rel="stylesheet">
<script src="../skin/js/jquery.min.js"></script>
<script src="../skin/js/zblogphp.js" type="text/javascript"></script>
<style type="text/css">
a:hover, .c-title::after, .pc-nav .active, .pc-nav .sub-nav a:hover, #aside_hot .list-1, #aside_hot .list-2, #aside_hot .list-3, .recommend-b .category, .full-post .read-more, .flink a.iconfont:hover, .thumbs-btn, #cancel-reply, .art-content a, #tbCalendar a, .table_card .active, .table_card .tab li:hover, .footer a:hover, .app-list .download, .commentname a, .comment-at {
color:#;
}
.recommend-b .category, .full-post .read-more, .thumbs-btn, .art-content .tags:hover, #divCatalog li a:hover, #divContorPanel .cp-login a:hover, #divContorPanel .cp-vrs a:hover, .app-list .download:hover, .app-list .download, .app-main figure .download, #divCommentPost input.button, #divSearchPanel input[type='submit'] {
border:1px solid #;
}
.art-content a:hover {
border-bottom:1px dashed #;
}
.art-content blockquote {
border-left:4px solid #;
}
::selection, ::-moz-selection {
background:#;
}
.thumbs_done, .thumbs-btn:hover, .pc-nav li a::before, .pc-nav .active::before, .art-content .tags:hover, #widget_aside_author .level, .full-post .read-more:hover, .recommend-b .category:hover, #middle_1 .download, #left_1 .download, .m-nav .sub-nav, .com-submit, .page-numbers, a.page-numbers:hover, #divCatalog li a:hover, #divTags li a:hover, #divContorPanel .cp-login a:hover, #divContorPanel .cp-vrs a:hover, #qr:hover, .btn.qq:hover, .toolbar .btn:hover, .dropdown-nav li a:hover, .dropdown-nav .active a, .dropdown-nav .active a:hover, #divSearchPanel input[type='submit'], #tbCalendar tbody a, .toolbar .btn, .app-list .download:hover, .app-main figure .download, .app-content .title-css .i, .related-item .download, #divCommentPost input.button, .header-top a:hover {
background-color:#;
}
</style>
</head>
<body>
<header id="header" class="header header-fixed sb">
  <div class="h-wrap container clearfix">
    <div class="logo-area fl"> <a href="/" title="极速递（廊坊）网络科技有限公司"> <img class="img" src="../skin/picture/logo_default.png" alt="极速递（廊坊）网络科技有限公司" title="极速递（廊坊）网络科技有限公司"/> </a> </div>
    <div class="m-nav-btn"><i class="iconfont icon-menu"></i></div>
    <nav class="responsive-nav">
      <div class="pc-nav m-nav fl" data-type="article"  data-infoid="9">
        <ul class="nav-ul">
          <li><a href="index.html" class="active">网站首页</a></li>
        <#list gameTypeList as list>
            <li><a href="${list.typePath}" class=""> ${list.typeName}</a></li>
        </#list>
        </ul>
      </div>
    </nav>
    <span id="search-button" class="search-button hidden fr"><i class="iconfont icon-search"></i></span>
    <div id="search-area" class="container br">
      <form  class="searchform clearfix" name="formsearch" action="/plus/search.php">
        <input type="hidden" name="kwtype" value="0" />
        <input class="s-input br fl" type="text" name="q" placeholder="请输入关键词...">
        <button class="s-button fr br iconfont icon-search" type="submit" id="submit"></button>
      </form>
    </div>
  </div>
</header>

<p class="index-breadcrumb"></p>
<div id="index-content" class="content container"> 
  <!-- 广告位AD1  --> 
  <!-- 首页顶部推荐  -->
  <div id="top_recommend" class="related-item sb br mb"> <span class="tips">推荐</span>
    <ul class="ul clearfix">
        <#list gameAppList as list>
            <li class="item fl"> <a class="thumbnail" href="${list.appPath}" title="${list.appName}"> <img class="img-cover br" src="${list.appImg}" alt=" ${list.appName}" title=" ${list.appName}"> </a>
                <h2 class="title ellipsis"><a href="${list.appPath}" title="${list.appName}"> ${list.appName}</a><span class="sub ellipsis">${list.downNum}</span></h2>
                <a rel="nofollow" class="download br" href="${list.appPath}">下载</a> </li>
        </#list>
    </ul>
  </div>
  <div class="clearfix">
    <div id="index-right" class="index-right hidden-sm-md-lg fr">
      <div class="theiaStickySidebar">
      <section id="top10" class="widget widget_top10 sb br mb">
        <ul class="widget-content top10">
          <div class="table_card">
            <ul class="tab">
              <li class="active">热门</li>
              <li>点击</li>
              <li>最新</li>
            </ul>
            <div class="tabCon">


             <!-- 热门 -->
            <ul class="list on">
            <#list gameAppClickList as list>
                <li class="item">
                    <div class="clearfix"><span class="fl iconfont icon-top10 list list-${(list?index)+1}"><small>${(list?index)+1}</small></span><a class="thumbnail fl" href="${list.appPath}" title="${list.appName}"> <img class="img img-cover br" src="${list.appImg}" alt="${list.appName}" title="${list.appName}"> </a>
                        <div class="fr-wrap">
                            <div class="title-wrap">
                                <h2 class="title ellipsis"> <a href="${list.appPath}" title="${list.appName}">${list.appName}</a> </h2>
                                <p class="intro br clearfix ellipsis"> ${list.downNum}次下载 </p>
                            </div>
                        </div>
                    </div>
                </li>
            </#list>
            </ul>


            <!-- 点击 -->

              <ul class="list">
                  <#list gameAppNewList as list>
                      <li class="item">
                          <div class="clearfix"><span class="fl iconfont icon-top10 list list-${(list?index)+1}"><small>${(list?index)+1}</small></span><a class="thumbnail fl" href="${list.appPath}" title="${list.appName}"> <img class="img img-cover br" src="${list.appImg}" alt="${list.appName}" title="${list.appName}"> </a>
                              <div class="fr-wrap">
                                  <div class="title-wrap">
                                      <h2 class="title ellipsis"> <a href="${list.appPath}" title="${list.appName}">${list.appName}</a> </h2>
                                      <p class="intro br clearfix ellipsis"> ${list.downNum}次下载 </p>
                                  </div>
                              </div>
                          </div>
                      </li>
                  </#list>
              </ul>


                <!-- 最新 -->
                <ul class="list">
                    <#list gameAppHotList as list>
                        <li class="item">
                            <div class="clearfix"><span class="fl iconfont icon-top10 list list-${(list?index)+1}"><small>${(list?index)+1}</small></span><a class="thumbnail fl" href="${list.appPath}" title="${list.appName}"> <img class="img img-cover br" src="${list.appImg}" alt="${list.appName}" title="${list.appName}"> </a>
                                <div class="fr-wrap">
                                    <div class="title-wrap">
                                        <h2 class="title ellipsis"> <a href="${list.appPath}" title="${list.appName}">${list.appName}</a> </h2>
                                        <p class="intro br clearfix ellipsis"> ${list.downNum}次下载 </p>
                                    </div>
                                </div>
                            </div>
                        </li>
                    </#list>
                </ul>


            </div>
          </div>
        </ul>
      </section>
        <section id="divComments" class="widget widget_comments sb br mb">
          <p class="c-title mb10"><span class="name">最新手游资讯</span></p>
          <ul class="widget-content divComments">
          <#list gameStrategyInfoList as list>
              <li class="list clearfix"><span class="avatar fl"><a href="${list.strategyPath}"><img src="${list.strategyImg}" alt="${list.strategyTitle}" title="${list.strategyTitle}"></a></span>
                  <div class="title"><a class="a ellipsis" href="${list.strategyPath}" title="${list.strategyTitle}">${list.strategyTitle}</a>
                      <div class="info ellipsis"><span class="time"><i class="iconfont icon-time"></i>${list.createTime?string("yyyy年MM月dd日 HH:mm:ss")}</span><span class="author"><i class="iconfont icon-user"></i>${list.sendUserName} </span></div>
                  </div>
              </li>
          </#list>

          </ul>
        </section>
      </div>
    </div>
    <div id="index-middle" class="fr mr">
      <div class="swiper-container br">
        <ul class="swiper-wrapper">
            <#list gameSlideList as list>
          <li class="swiper-slide">
              <a class="link" href="#" title="${list.slideName}">
              <p class="p ellipsis"></p>
              <img src="${list.imgPath}" alt="${list.slideName}" />
              </a>
          </li>
            </#list>
			
        </ul>
        <div class="swiper-pagination"></div>
        <div class="hidden-sm-md-lg swiper-button-next iconfont icon-right"></div>
        <div class="hidden-sm-md-lg swiper-button-prev iconfont icon-left"></div>
      </div>
      <section>
        <div id="middle_2" class="wrap sb br mb clearfix">
          <p class="c-title"> <span>手游攻略</span> <a class="more" href="/html/yxgl/" title="更多手游攻略">更多</a> </p>
            <#list gameStrategyList as list>
                <#if (list_index == 0)>
                    <article class="item top">
                        <h2 class="top-title ellipsis"><a href="${list.strategyPath}" title="${list.strategyTitle}">${list.strategyTitle}</a></h2>
                        <p class="intro multi-ellipsis"> <i class="iconfont icon-yin"></i> ${list.strategyText} </p>
                    </article>
                <#else>
                    <article class="item fl">
                        <h2 class="title ellipsis"><i class="iconfont icon-dot"></i><a href="${list.strategyPath}" title="${list.strategyTitle}">${list.strategyText} </a></h2>
                    </article>
                </#if>

            </#list>

 </div>
      </section>

      <section>
          <div id="middle_1" class="wrap sb br mb clearfix">
          <p class="c-title"> <span>手机游戏</span> <a class="more" href="/html/sjyx/" title="更多手机游戏">更多</a> </p>
          <#list gameAppMobileList as list>
              <article class="item fl"> <a class="thumbnail" href="${list.appPath}" title="${list.appName}"> <img class="img-cover br" src="${list.appImg}" alt="${list.appName}" title="${list.appName}"> </a>
                  <h2 class="title ellipsis"><a href="${list.appPath}" title="${list.appName}">${list.appName}</a><span class="sub ellipsis">${list.downNum}下载</span></h2>
                  <a rel="nofollow" class="download br" href="${list.appPath}">下载</a> </article>
          </#list>
          </div>
      </section>

    </div>
    <div id="index-left" class="fr mr">
      <section id="left_1" class="sb br mb">
        <p class="c-title mb10"><span>每日一荐</span></p>
        <div class="br mb">
          <div class="wrap clearfix">
  <article class="item fl">
              <div class="clearfix"> <a class="thumbnail fl" href="${gameAppShare.appPath}" title="${gameAppShare.appName}"> <img class="img img-cover br" src="${gameAppShare.appImg}" alt="${gameAppShare.appName}" title="${gameAppShare.appName}"> </a>
                <div class="fr-wrap">
                  <div class="title-wrap">
                          <h2 class="title ellipsis"> <a href="${gameAppShare.appPath}" title="${gameAppShare.appName}">${gameAppShare.appName}</a> </h2>
                          <a class="category transition br" href="${gameAppShare.typePath!}"> ${gameAppShare.typeName!}</a>
                          <div class="div"><a rel="nofollow" class="download brightness transition br" href="${gameAppShare.appPath}">下载</a></div>
                  </div>
                </div>
              </div>
              <p class="intro br clearfix multi-ellipsis">${((gameAppShare.details!'')?length>0)?string((gameAppShare.details!''),"很好玩啊！")}</p>
            </article>

 </div>
        </div>
      </section>
      <section id="left_2" class="sb br mb">
        <div class="clearfix">
          <div class="br">
            <p class="c-title mb10"> <span>手游动态</span> <a class="more" href="/html/xydt/" title="更多手游动态">更多</a> </p>
              <#list gameStrategyNewList as list>
                  <#if (list_index == 0)>
                      <article class="item mb10"> <a class="thumbnail" href="${list.strategyPath}" title="${list.strategyTitle}"> <img class="img-cover br" src="${list.strategyImg}" alt="${list.strategyTitle}" title="${list.strategyTitle}">
                              <div class="absolute">
                                  <p class="p-title ellipsis">《${list.strategyTitle}</p>
                              </div>
                              <i class="mask br"></i> </a>
                      </article>
                  </#if>
              </#list>

              <ul class="ul">
              <#list gameStrategyNewList as list>
                  <#if (list_index != 0)>
                      <li class="title clearfix"> <a class="a ellipsis fl" href="${list.strategyPath}" title="${list.strategyTitle}"> <i class="iconfont icon-dot"></i>${list.strategyTitle}</a> </li>
                  </#if>
              </#list>
              </ul>

          </div>
        </div>
      </section>

      <section> <div id="left_3" class="wrap sb br mb">
          <p class="c-title"> <span>手游排行</span> </p>
          <#list gameAppScoreList as list>
              <article class="item">
                  <div class="clearfix"> <a class="thumbnail fl" href="${list.appPath}" title="${list.appName}"> <img class="img img-cover br" src="${list.appImg}" alt="${list.appName}" title="${list.appName}"> </a>
                      <div class="fr-wrap">
                          <div class="title-wrap">
                              <h2 class="title ellipsis"> <a href="${list.appPath}" title="${list.appName}">${list.appName}</a> </h2>
                              <p class="intro br clearfix ellipsis">${list.details} </p>
                          </div>
                      </div>
                  </div>
              </article>
          </#list>
        <a class="more" href="/html/sjrj/">查看全部></a> </div>
      </section>

    </div>
  </div>
  <div id="full-post" class="sb br mb">
    <p class="c-title mb10"> <span>手游资料</span> <a class="more" href="/html/yxzx/" title="更多手游资料">更多</a> </p>
    <div class="clearfix">
        <#list gameStrategyDataList as list>
            <article class="item fl"> <a class="thumbnail" href="${list.strategyPath}" title="${list.strategyTitle}"> <img class="img-cover br" src="${list.strategyImg}" alt="${list.strategyTitle}" title="${list.strategyTitle}">
                    <div class="absolute">
                        <p class="p-title ellipsis">${list.strategyTitle}</p>
                    </div>
                    <i class="mask br"></i> </a>
            </article>
        </#list>



 </div>
  </div>
  <div id="shuoming-post" class="sb br mb"> <img src="../skin/picture/logo_default.png"/>
    <p class="shuoming-title">游戏软件站——开启全新游戏玩法，发布最新游戏攻略新闻，上线公测网游内容专题活动，打造世界十大手游排行榜。 游戏开发名称题材包含：国风角色、人物剧情、职业、历史、策略、动作、武侠、休闲、卡牌等更多大型免费题材，最强玩家名称自拟，一款手机经典传奇游戏推荐如：九游、仙侠、纯正三国英雄-王者归来，自动更新下载</p>
  </div>
  <div class="flink sb br mb">
    <p class="c-title">友情链接</p>
    <ul id="flink" class="f-list clearfix">
<li><a href='https://www.hnymwl.com/' target='_blank'>阿奇源码</a> </li><li><a href='https://www.hnymwl.com/' target='_blank'>织梦模板</a> </li>
    </ul>
  </div>
</div>
<footer class="footer">
  <div class="main container">
    <div class="f-about">
      <p>Copyright &copy; 2018 <a style="color:inherit" target="_blank" href="https://hnymwl.com/">hnymwl. 阿奇源码</a> 版权所有 网站备案号：<a class="icp" target="_blank" rel="nofollow" href="http://www.beian.miit.gov.cn/">京ICP备888xxx88</a> <span class="contact">客服QQ:282140068</span> 手游门户网站-让手机玩家开启另一个世界的真实平台，十大网游门户，公测专题齐更新上线，敬请期待！ <!--<span class="diy fr"> <a href="/">游戏软件站</a><i>|</i> <a href="/">手游排行</a><i>|</i> <a href="">网站地图</a><i>|</i> </span>--> </p>
    </div>
  </div>
  <div id="toolbar" class="toolbar ">
    <div id="totop" class="btn hidden br transition"><i class="iconfont icon-totop"></i></div>
  </div>
</footer>

<div id="mask-hidden" class="mask-hidden transition"></div>
<script src="../skin/js/common.js"></script>
<script src="../skin/js/headroom.min.js"></script>
<script src="../skin/js/swiper.min.js"></script>
<script>
    var swiper = new Swiper('.swiper-container', {
    pagination: '.swiper-pagination',
    nextButton: '.swiper-button-next',
    prevButton: '.swiper-button-prev',
    centeredSlides: true,
    autoplay: 3500,
    slidesPerView: 1,
    paginationClickable: true,
    autoplayDisableOnInteraction: false,
    spaceBetween: 0,
    loop: true
});
</script> 
<script type="text/javascript">
	$(document).ready(function(e) {
		$(".table_card .tab li").click(function() {
			$(".table_card .tab li").eq($(this).index()).addClass("active").siblings().removeClass("active");
			$(".table_card .tabCon ul").hide().eq($(this).index()).show();
		});

    // 这里是加载首页
    htmlobj=$.ajax({url:"/jquery/test1.txt",async:false});

	});
</script> 


<!--[if lt IE 9]>
<script src="../skin/js/html5shiv.min.js"></script><![endif]-->
</body>
</html>