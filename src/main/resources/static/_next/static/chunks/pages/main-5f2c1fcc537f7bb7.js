(self.webpackChunk_N_E=self.webpackChunk_N_E||[]).push([[671],{1941:function(e,t,n){(window.__NEXT_P=window.__NEXT_P||[]).push(["/main",function(){return n(7948)}])},7948:function(e,t,n){"use strict";function o(e,t){(null==t||t>e.length)&&(t=e.length);for(var n=0,o=Array(t);n<t;n++)o[n]=e[n];return o}function r(e,t){return function(e){if(Array.isArray(e))return e}(e)||function(e){if("undefined"!=typeof Symbol&&null!=e[Symbol.iterator]||null!=e["@@iterator"])return Array.from(e)}(e,t)||function(e,t){if(e){if("string"==typeof e)return o(e,t);var n=Object.prototype.toString.call(e).slice(8,-1);if("Object"===n&&e.constructor&&(n=e.constructor.name),"Map"===n||"Set"===n)return Array.from(n);if("Arguments"===n||/^(?:Ui|I)nt(?:8|16|32)(?:Clamped)?Array$/.test(n))return o(e,t)}}(e,t)||function(){throw TypeError("Invalid attempt to destructure non-iterable instance.\\nIn order to be iterable, non-array objects must have a [Symbol.iterator]() method.")}()}n.r(t),n.d(t,{default:function(){return x}});var c=n(1527),a=n(1161),s=n.n(a),i=n(1463),u=n(959),d=n(7160),l=n.n(d);function m(e){var t=e.children,n=e.close,o=e.setClose,r=function(){o(!1)};return(0,c.jsxs)("div",{className:n?"":l().close,children:[(0,c.jsx)("div",{className:l().bg,onClick:r}),(0,c.jsx)("div",{className:l().content,children:t})]})}var f=n(4822),h=n.n(f),_=n(3325),p=n.n(_);function x(){var e=r(u.useState(""),2),t=e[0],n=e[1],o=(0,u.useState)({}),a=o[0],d=o[1],l=(0,i.useRouter)();(0,u.useEffect)(function(){var e,t=localStorage.getItem("user");e="stu"==JSON.parse(t).userType?"courseByStu":"courseByTea",console.log(e,JSON.parse(t).userType),t||l.push("/index.html"),fetch(e,{method:"POST",body:"id=".concat(t.userId)}).then(function(e){return e.json()}).then(function(e){T(e),y(!0)}),d(JSON.parse(t)),console.log(t)},[]);var f=r(u.useState([]),2),_=f[0],x=f[1],v=(0,u.useState)(!1),g=v[0],y=v[1],j=(0,u.useState)([]),N=j[0],T=j[1],b=function(e){n(e.target.dataset.date),fetch("/course?date=".concat(e.target.dataset.date),{method:"GET"}).then(function(e){return e.json()}).then(function(e){x(e),w(!0)})},C=["1-1","1-2","1-3","1-4","1-5","2-1","2-2","2-3","2-4","2-5","3-1","3-2","3-3","3-4","3-5","4-1","4-2","4-3","4-4","4-5","5-1","5-2","5-3","5-4","5-5","6-1","6-2","6-3","6-4","6-5","7-1","7-2","7-3","7-4","7-5",].map(function(e,t){var n;return(0,c.jsx)("div",{"data-date":e,className:p().item,onClick:b,style:{gridArea:"".concat(e[2],"/").concat(e[0],"/").concat(+e[2]+1,"/").concat(+e[0]+1)},children:null===(n=null==N?void 0:N.find(function(t){return t.courseTime===e}))||void 0===n?void 0:n.courseName},t)}),S=function(){return g?(0,c.jsx)("main",{className:p().main,children:C}):(0,c.jsx)("div",{children:"loading..."})},A=r(u.useState(!1),2),I=A[0],w=A[1],O=function(e){e.preventDefault(),fetch("/selectCourse",{method:"POST",headers:{"Content-Type":"application/x-www-form-urlencoded"},body:"courseId=".concat(e.target.dataset.id,"&stuId=").concat(a.userId)}),T(N.concat({courseId:1,courseName:"香袋",courseTime:t,teaName:"1",courseAddress:"208"})),console.log(N)},k=function(e){e.preventDefault(),fetch("/deleteStuCourse",{method:"POST",headers:{"Content-Type":"application/x-www-form-urlencoded"},body:"courseId=".concat(e.target.dataset.id,"&stuId=").concat(a.userId)}),T(N.filter(function(e){return e.courseTime!==t}))},H=function(e){var t=e.courses,n=e.date,o=e.Courses;console.log(t);var r=null==o?void 0:o.find(function(e){return e.courseTime===n}),a=t.map(function(e,t){return(0,c.jsxs)(c.Fragment,{children:[(0,c.jsxs)("div",{className:p().course,children:[(0,c.jsx)("div",{style:{gridArea:"".concat(t+1,"/1/").concat(t+2,"/2")},children:e.courseName}),(0,c.jsx)("div",{style:{gridArea:"".concat(t+1,"/2/").concat(t+2,"/3")},children:e.teaName}),(0,c.jsx)("div",{style:{gridArea:"".concat(t+1,"/3/").concat(t+2,"/4")},children:e.courseAddress}),(0,c.jsx)("button",{"data-id":e.courseId,"data-date":n,"data-name":e.courseName,"data-tea":e.teaName,"data-address":e.courseAddress,onClick:O,disabled:r,style:{gridArea:"".concat(t+1,"/4/").concat(t+2,"/5"),maxWidth:"100px"},children:"选课"})]},t),r?(0,c.jsxs)("div",{className:p().course,children:[(0,c.jsx)("div",{style:{gridArea:"".concat(t+2,"/1/").concat(t+3,"/2")},children:r.courseName}),(0,c.jsx)("div",{style:{gridArea:"".concat(t+2,"/2/").concat(t+3,"/3")},children:r.teaName}),(0,c.jsx)("div",{style:{gridArea:"".concat(t+2,"/3/").concat(t+3,"/4")},children:r.courseAddress}),(0,c.jsx)("button",{"data-id":r.courseId,"data-date":n,"data-name":r.courseName,"data-tea":r.teaName,"data-address":r.courseAddress,onClick:k,style:{gridArea:"".concat(t+2,"/4/").concat(t+3,"/5"),maxWidth:"100px"},children:"退课"})]},r.courseId):null]})});return(0,c.jsxs)("div",{className:p().courses,children:[(0,c.jsxs)("div",{className:p().course,children:[(0,c.jsx)("div",{style:{gridArea:"1/1/2/2"},children:"课程名称"}),(0,c.jsx)("div",{style:{gridArea:"1/2/2/3"},children:"任课教师"}),(0,c.jsx)("div",{style:{gridArea:"1/3/2/4"},children:"课程地址"})]}),a]})},P="",D="",E=function(e){P=e.target.value},M=function(e){D=e.target.value},W=function(e){e.preventDefault(),fetch("/addCourse",{method:"POST",headers:{"Content-Type":"application/x-www-form-urlencoded"},body:"courseName=".concat(P,"\n			&courseAddress=").concat(D,"\n			&teaId=").concat(a.userId,"\n			&courseTime=").concat(t,"\n			&teaName=").concat(a.userName)}),w(!1)},R=function(e){var t=e.date,n=null==N?void 0:N.find(function(e){return e.courseTime===t}),o=function(){return(0,c.jsxs)("div",{className:p().form,style:{maxWidth:"240px"},children:[(0,c.jsx)("input",{className:h().input,type:"text",placeholder:"课程名称",onChange:E}),(0,c.jsx)("input",{className:h().input,type:"text",placeholder:"课程教室",onChange:M}),(0,c.jsx)("button",{className:h().login,onClick:W,children:"发布"})]})},r=function(){var e=(0,u.useState)((null==n?void 0:n.courseName)||""),o=e[0],r=e[1],s=(0,u.useState)((null==n?void 0:n.courseAddress)||""),i=s[0],d=s[1],l=function(e){r(e.target.value)},m=function(e){d(e.target.value)},f=function(e){e.preventDefault(),fetch("/updateCourse",{method:"POST",body:"courseId=".concat(n.courseId,"&teaName=").concat(a.userName,"&courseTime=").concat(t,"&courseName=").concat(o,"&courseAddress=").concat(i)}),w(!I)},_=function(e){e.preventDefault(),fetch("/deleteCourseById",{method:"POST",body:"id=".concat(n.courseId)}),w(!I)};return(0,c.jsxs)("div",{className:p().form,style:{maxWidth:"240px"},children:[(0,c.jsx)("input",{className:h().input,type:"text",value:o,onChange:l}),(0,c.jsx)("input",{className:h().input,type:"text",value:i,onChange:m}),(0,c.jsx)("button",{className:h().login,onClick:f,children:"修改"}),(0,c.jsx)("button",{className:h().login,onClick:_,children:"删除"})]})};return(0,c.jsx)("div",{className:p().center,children:n?(0,c.jsx)(r,{}):(0,c.jsx)(o,{})})},J=function(e){e.preventDefault(),localStorage.removeItem("user"),l.push("/index.html")},X="stu"==a.userType?"deleteStu":"deleteTea",Z=function(e){e.preventDefault(),fetch(X,{method:"POST",headers:{"Content-Type":"application/x-www-form-urlencoded"},body:"id=".concat(a.userId)}),localStorage.removeItem("user"),l.push("/index.html")},B=function(e){var t=e.date;return(0,c.jsx)(H,{courses:_,date:t,Courses:N})},L="stu"==a.userType?(0,c.jsx)(B,{date:t}):(0,c.jsx)(R,{date:t});return(0,c.jsxs)("div",{style:{position:"relative"},children:[(0,c.jsx)(s(),{children:(0,c.jsx)("title",{children:"选课系统"})}),(0,c.jsxs)("h1",{children:["welcome ",a.userName]}),(0,c.jsx)("button",{onClick:J,children:"退出登录"}),(0,c.jsx)("button",{onClick:Z,children:"注销"}),(0,c.jsx)(S,{}),(0,c.jsx)(m,{close:I,setClose:w,children:L})]})}},4822:function(e){e.exports={container:"Home_container__bCOhY",input:"Home_input__ZarWZ",login:"Home_login___4DHh",form:"Home_form__k2xMg",main:"Home_main__nLjiQ",footer:"Home_footer____T7K",title:"Home_title__T09hD",description:"Home_description__41Owk",code:"Home_code__suPER",grid:"Home_grid__GxQ85",card:"Home_card___LpL1",logo:"Home_logo__27_tb"}},3325:function(e){e.exports={main:"Main_main__IbvWf",item:"Main_item__JARc6",center:"Main_center__T3EMy",form:"Main_form__4TDFZ",course:"Main_course__uZtOX",open:"Main_open__3qw__"}},7160:function(e){e.exports={close:"modal_close__vM0TR",bg:"modal_bg__hPkR_",content:"modal_content__u9sXU"}},1161:function(e,t,n){e.exports=n(2894)},1463:function(e,t,n){e.exports=n(6070)}},function(e){e.O(0,[774,888,179],function(){return e(e.s=1941)}),_N_E=e.O()}]);