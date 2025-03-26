const base = {
    get() {
                return {
            url : "http://localhost:8080/springboottof36/",
            name: "springboottof36",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboottof36/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "准妈妈孕期交流平台"
        } 
    }
}
export default base
