(self.webpackChunk_N_E=self.webpackChunk_N_E||[]).push([[405],{3261:function(e,n,t){(window.__NEXT_P=window.__NEXT_P||[]).push(["/",function(){return t(6313)}])},6313:function(e,n,t){"use strict";t.r(n),t.d(n,{default:function(){return l}});var o=t(1527),r=t(1161),a=t.n(r),s=t(1463),u=t(959),i=t(4822),c=t.n(i);function l(){var e=(0,u.useState)(""),n=e[0],t=e[1],r=(0,u.useState)(""),i=r[0],l=r[1],_=(0,u.useState)(""),d=_[0],m=_[1],p=(0,u.useState)(""),h=p[0],f=p[1],g=(0,s.useRouter)(),x=function(e){console.log(e.target.value),t(e.target.value)},w=function(e){console.log(e.target.value),l(e.target.value)},j=function(e){e.preventDefault(),console.log(JSON.stringify({userType:d,username:n,password:i})),e.preventDefault(),fetch("/login",{method:"POST",body:"userType=".concat(d,"&userName=").concat(n,"&userPwd=").concat(i),headers:{"Content-Type":"application/x-www-form-urlencoded"}}).then(function(e){return e.json()}).then(function(e){return y(e)})},y=function(e){switch(console.log(e),e.userType){case"stu":case"tea":localStorage.setItem("user",JSON.stringify(e)),g.push("/main");break;case"none":f("wrong username or password");break;default:f("unknown error")}};return(0,o.jsxs)(o.Fragment,{children:[(0,o.jsx)(a(),{children:(0,o.jsx)("title",{children:"Login"})}),(0,o.jsx)("main",{className:c().main,children:(0,o.jsxs)("form",{className:c().form,children:[(0,o.jsxs)("div",{children:[(0,o.jsx)("input",{type:"radio",name:"userType",value:"stu",id:"stu",onChange:function(e){return m(e.target.value)},checked:"stu"===d}),(0,o.jsx)("label",{htmlFor:"stu",children:"Student"}),(0,o.jsx)("input",{id:"tea",type:"radio",name:"userType",value:"tea",onChange:function(e){return m(e.target.value)},checked:"tea"===d}),(0,o.jsx)("label",{htmlFor:"tea",children:"Teacher"})]}),(0,o.jsx)("input",{className:c().input,type:"text",placeholder:"username",name:"userName",onChange:x}),(0,o.jsx)("input",{className:c().input,type:"password",placeholder:"password",name:"userPwd",onChange:w}),(0,o.jsx)("p",{className:c().message,style:{color:"red"},children:h}),(0,o.jsx)("button",{className:c().login,type:"submit",onClick:j,children:"Login"})]})})]})}},4822:function(e){e.exports={container:"Home_container__bCOhY",input:"Home_input__ZarWZ",login:"Home_login___4DHh",form:"Home_form__k2xMg",main:"Home_main__nLjiQ",footer:"Home_footer____T7K",title:"Home_title__T09hD",description:"Home_description__41Owk",code:"Home_code__suPER",grid:"Home_grid__GxQ85",card:"Home_card___LpL1",logo:"Home_logo__27_tb"}},1161:function(e,n,t){e.exports=t(2894)},1463:function(e,n,t){e.exports=t(6070)}},function(e){e.O(0,[774,888,179],function(){return e(e.s=3261)}),_N_E=e.O()}]);