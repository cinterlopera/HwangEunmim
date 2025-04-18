/**
 * @author: 吴佳隆
 * @date: 2020年7月19日 上午10:55:20
 * @Description: d7c 系统 js 工具类，需要依赖 layui 的 layer 模块
 */
;
// 错误提示
function errorMsg(msg) {
    layer.msg(msg, {
        icon: 5,
        time: 2000,
        anim: 6
    });
}

// 成功提示
function successMsg(msg) {
    layer.msg(msg, {
        icon: 1,
        time: 2000,
        anim: 6
    });
}
