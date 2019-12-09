var timer;
var offset = 0;
$(function () {
    $(".cont .wr #cont .slid .shoplist>li").hover(function () {
        var t = $(this).index()+"px";
        $(this).children().css("display","block")
            .css("top",t).css("left","210px");
    },function () {
        $(this).children().css("display","none");
        $(this).children().hover(function () {
        },function () {
            $(this).css("display","none");
        });
    });
    autoplay();
    $(".cont .wr #cont .lunbo .imglist").hover(function () {
        clearInterval(timer);
    },function () {
        autoplay();
    });

    $(".cont .wr #cont .selectli .ullist>li").hover(function () {
        var i = $(this).index();
        $(".cont .wr #cont .lunbo>.imglist").css("marginLeft",-633 *i);
        clearInterval(timer);
    },function () {
        var i = $(this).index();
        offset = -633 *i;
        autoplay();
    });

    $("#open").click(function () {
        $("#close").css("display","block");
        $("#open").css("display","none");
        $(this).parent().children(".shoplist").css("height","600px");
        $(".cont .wr #cont .slid .shoplist>li:nth-child(n+10)").css("display","block");
    });
    $("#close").click(function () {
        $("#open").css("display","block");
        $("#close").css("display","none");
        $(this).parent().children(".shoplist").css("height","300px");
        $(".cont .wr #cont .slid .shoplist>li:nth-child(n+10)").css("display","none");
    });

});

function autoplay() {
    clearInterval(timer);
    timer = setInterval(function () {
        offset -= 10;
        if (offset<=-2560){
            offset = 0;
        }
        $(".cont .wr #cont .lunbo .imglist").css("marginLeft",offset);
    },50);
}