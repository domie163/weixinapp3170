const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm89in6/",
            name: "ssm89in6",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm89in6/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "家庭事务管理小程序"
        } 
    }
}
export default base
