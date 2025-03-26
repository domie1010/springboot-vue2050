
var projectName = '准妈妈孕期交流平台';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的发布',
	url: '../forum/list-my.html'
},

]


var indexNav = [

{
	name: '早教知识',
	url: './pages/zaojiaozhishi/list.html'
}, 
{
	name: '待产经验分享',
	url: './pages/daichanjingyanfenxiang/list.html'
}, 
{
	name: '怀孕常识',
	url: './pages/huaiyunchangshi/list.html'
}, 
{
	name: '月子食谱',
	url: './pages/yuezishipu/list.html'
}, 
{
	name: '好物推荐',
	url: './pages/haowutuijian/list.html'
}, 

{
	name: '圈子交流',
	url: './pages/forum/list.html'
}, 
]

var adminurl =  "http://localhost:8080/springboottof36/admin/dist/index.html";

var cartFlag = false

var chatFlag = false


chatFlag = true


var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"早教知识","menuJump":"列表","tableName":"zaojiaozhishi"}],"menu":"早教知识管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"待产经验分享","menuJump":"列表","tableName":"daichanjingyanfenxiang"}],"menu":"待产经验分享管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"怀孕常识","menuJump":"列表","tableName":"huaiyunchangshi"}],"menu":"怀孕常识管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"月子食谱","menuJump":"列表","tableName":"yuezishipu"}],"menu":"月子食谱管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"好物推荐","menuJump":"列表","tableName":"haowutuijian"}],"menu":"好物推荐管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"好物类型","menuJump":"列表","tableName":"haowuleixing"}],"menu":"好物类型管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"圈子交流","tableName":"forum"}],"menu":"圈子交流"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"buttons":["新增","查看","修改","删除"],"menu":"专家交流","tableName":"chat"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"早教知识列表","menuJump":"列表","tableName":"zaojiaozhishi"}],"menu":"早教知识模块"},{"child":[{"buttons":["查看"],"menu":"待产经验分享列表","menuJump":"列表","tableName":"daichanjingyanfenxiang"}],"menu":"待产经验分享模块"},{"child":[{"buttons":["查看"],"menu":"怀孕常识列表","menuJump":"列表","tableName":"huaiyunchangshi"}],"menu":"怀孕常识模块"},{"child":[{"buttons":["查看"],"menu":"月子食谱列表","menuJump":"列表","tableName":"yuezishipu"}],"menu":"月子食谱模块"},{"child":[{"buttons":["查看"],"menu":"好物推荐列表","menuJump":"列表","tableName":"haowutuijian"}],"menu":"好物推荐模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"待产经验分享","menuJump":"列表","tableName":"daichanjingyanfenxiang"}],"menu":"待产经验分享管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"好物推荐","menuJump":"列表","tableName":"haowutuijian"}],"menu":"好物推荐管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"早教知识列表","menuJump":"列表","tableName":"zaojiaozhishi"}],"menu":"早教知识模块"},{"child":[{"buttons":["查看"],"menu":"待产经验分享列表","menuJump":"列表","tableName":"daichanjingyanfenxiang"}],"menu":"待产经验分享模块"},{"child":[{"buttons":["查看"],"menu":"怀孕常识列表","menuJump":"列表","tableName":"huaiyunchangshi"}],"menu":"怀孕常识模块"},{"child":[{"buttons":["查看"],"menu":"月子食谱列表","menuJump":"列表","tableName":"yuezishipu"}],"menu":"月子食谱模块"},{"child":[{"buttons":["查看"],"menu":"好物推荐列表","menuJump":"列表","tableName":"haowutuijian"}],"menu":"好物推荐模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
