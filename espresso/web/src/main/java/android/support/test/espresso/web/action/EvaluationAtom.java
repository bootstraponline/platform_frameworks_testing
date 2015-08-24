package android.support.test.espresso.web.action;
// GENERATED CODE DO NOT EDIT
final class EvaluationAtom {
/* field: EXECUTE_SCRIPT_ANDROID license: 

 Copyright 2014 Software Freedom Conservancy

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
  static final String EXECUTE_SCRIPT_ANDROID =
    "function(){return(function(){function g(a){var b=typeof a;if(\"obje" +
    "ct\"==b)if(a){if(a instanceof Array)return\"array\";if(a instanceof O" +
    "bject)return b;var c=Object.prototype.toString.call(a);if(\"[object" +
    " Window]\"==c)return\"object\";if(\"[object Array]\"==c||\"number\"==type" +
    "of a.length&&\"undefined\"!=typeof a.splice&&\"undefined\"!=typeof a.p" +
    "ropertyIsEnumerable&&!a.propertyIsEnumerable(\"splice\"))return\"arra" +
    "y\";if(\"[object Function]\"==c||\"undefined\"!=typeof a.call&&\"undefin" +
    "ed\"!=typeof a.propertyIsEnumerable&&!a.propertyIsEnumerable(\"call\"" +
    "))return\"function\"}else return\"null\";\nelse if(\"function\"==b&&\"unde" +
    "fined\"==typeof a.call)return\"object\";return b}function k(a){var b=" +
    "g(a);return\"array\"==b||\"object\"==b&&\"number\"==typeof a.length}func" +
    "tion n(a){var b=typeof a;return\"object\"==b&&null!=a||\"function\"==b" +
    "}var p=Date.now||function(){return+new Date};var q=String.prototyp" +
    "e.trim?function(a){return a.trim()}:function(a){return a.replace(/" +
    "^[\\s\\xa0]+|[\\s\\xa0]+$/g,\"\")};function r(a,b){return a<b?-1:a>b?1:0" +
    "};function t(a,b){for(var c=a.length,d=Array(c),f=\"string\"==typeof" +
    " a?a.split(\"\"):a,e=0;e<c;e++)e in f&&(d[e]=b.call(void 0,f[e],e,a)" +
    ");return d};function u(a,b){var c={},d;for(d in a)b.call(void 0,a[" +
    "d],d,a)&&(c[d]=a[d]);return c}function v(a,b){var c={},d;for(d in " +
    "a)c[d]=b.call(void 0,a[d],d,a);return c}function w(a,b){for(var c " +
    "in a)if(b.call(void 0,a[c],c,a))return c};var z;a:{var A=this.navi" +
    "gator;if(A){var B=A.userAgent;if(B){z=B;break a}}z=\"\"};/*xxx_rpl_l" +
    "ic*/\nvar C=window;function D(a,b){this.code=a;this.b=E[a]||\"unknow" +
    "n error\";this.message=b||\"\";var c=this.b.replace(/((?:^|\\s+)[a-z])" +
    "/g,function(a){return a.toUpperCase().replace(/^[\\s\\xa0]+/g,\"\")})," +
    "d=c.length-5;if(0>d||c.indexOf(\"Error\",d)!=d)c+=\"Error\";this.name=" +
    "c;c=Error(this.message);c.name=this.name;this.stack=c.stack||\"\"}\n(" +
    "function(){var a=Error;function b(){}b.prototype=a.prototype;D.c=a" +
    ".prototype;D.prototype=new b;D.prototype.constructor=D;D.b=functio" +
    "n(b,d,f){for(var e=Array(arguments.length-2),l=2;l<arguments.lengt" +
    "h;l++)e[l-2]=arguments[l];return a.prototype[d].apply(b,e)}})();\nv" +
    "ar E={15:\"element not selectable\",11:\"element not visible\",31:\"unk" +
    "nown error\",30:\"unknown error\",24:\"invalid cookie domain\",29:\"inva" +
    "lid element coordinates\",12:\"invalid element state\",32:\"invalid se" +
    "lector\",51:\"invalid selector\",52:\"invalid selector\",17:\"javascript" +
    " error\",405:\"unsupported operation\",34:\"move target out of bounds\"" +
    ",27:\"no such alert\",7:\"no such element\",8:\"no such frame\",23:\"no s" +
    "uch window\",28:\"script timeout\",33:\"session not created\",10:\"stale" +
    " element reference\",21:\"timeout\",25:\"unable to set cookie\",\n26:\"un" +
    "expected alert open\",13:\"unknown error\",9:\"unknown command\"};D.pro" +
    "totype.toString=function(){return this.name+\": \"+this.message};fun" +
    "ction F(){}\nfunction G(a,b,c){if(null==b)c.push(\"null\");else{if(\"o" +
    "bject\"==typeof b){if(\"array\"==g(b)){var d=b;b=d.length;c.push(\"[\")" +
    ";for(var f=\"\",e=0;e<b;e++)c.push(f),G(a,d[e],c),f=\",\";c.push(\"]\");" +
    "return}if(b instanceof String||b instanceof Number||b instanceof B" +
    "oolean)b=b.valueOf();else{c.push(\"{\");f=\"\";for(d in b)Object.proto" +
    "type.hasOwnProperty.call(b,d)&&(e=b[d],\"function\"!=typeof e&&(c.pu" +
    "sh(f),H(d,c),c.push(\":\"),G(a,e,c),f=\",\"));c.push(\"}\");return}}swit" +
    "ch(typeof b){case \"string\":H(b,c);break;case \"number\":c.push(isFin" +
    "ite(b)&&\n!isNaN(b)?b:\"null\");break;case \"boolean\":c.push(b);break;" +
    "case \"function\":c.push(\"null\");break;default:throw Error(\"Unknown " +
    "type: \"+typeof b);}}}var I={'\"':'\\\\\"',\"\\\\\":\"\\\\\\\\\",\"/\":\"\\\\/\",\"\\b\":\"" +
    "\\\\b\",\"\\f\":\"\\\\f\",\"\\n\":\"\\\\n\",\"\\r\":\"\\\\r\",\"\\t\":\"\\\\t\",\"\\x0B\":\"\\\\u000b\"}" +
    ",J=/\\uffff/.test(\"\\uffff\")?/[\\\\\\\"\\x00-\\x1f\\x7f-\\uffff]/g:/[\\\\\\\"\\x0" +
    "0-\\x1f\\x7f-\\xff]/g;function H(a,b){b.push('\"',a.replace(J,function" +
    "(a){var b=I[a];b||(b=\"\\\\u\"+(a.charCodeAt(0)|65536).toString(16).su" +
    "bstr(1),I[a]=b);return b}),'\"')};function K(a){return(a=a.exec(z))" +
    "?a[1]:\"\"}K(/Android\\s+([0-9.]+)/)||K(/Version\\/([0-9.]+)/);functio" +
    "n L(a){var b=0,c=q(String(M)).split(\".\");a=q(String(a)).split(\".\")" +
    ";for(var d=Math.max(c.length,a.length),f=0;0==b&&f<d;f++){var e=c[" +
    "f]||\"\",l=a[f]||\"\",x=RegExp(\"(\\\\d*)(\\\\D*)\",\"g\"),y=RegExp(\"(\\\\d*)(\\\\" +
    "D*)\",\"g\");do{var h=x.exec(e)||[\"\",\"\",\"\"],m=y.exec(l)||[\"\",\"\",\"\"];i" +
    "f(0==h[0].length&&0==m[0].length)break;b=r(0==h[1].length?0:parseI" +
    "nt(h[1],10),0==m[1].length?0:parseInt(m[1],10))||r(0==h[2].length," +
    "0==m[2].length)||r(h[2],m[2])}while(0==b)}}var N=/Android\\s+([0-9\\" +
    ".]+)/.exec(z),M=N?N[1]:\"0\";L(2.3);\nL(4);function O(a){switch(g(a))" +
    "{case \"string\":case \"number\":case \"boolean\":return a;case \"functio" +
    "n\":return a.toString();case \"array\":return t(a,O);case \"object\":if" +
    "(\"nodeType\"in a&&(1==a.nodeType||9==a.nodeType)){var b={};b.ELEMEN" +
    "T=P(a);return b}if(\"document\"in a)return b={},b.WINDOW=P(a),b;if(k" +
    "(a))return t(a,O);a=u(a,function(a,b){return\"number\"==typeof b||\"s" +
    "tring\"==typeof b});return v(a,O);default:return null}}\nfunction Q(" +
    "a,b){return\"array\"==g(a)?t(a,function(a){return Q(a,b)}):n(a)?\"fun" +
    "ction\"==typeof a?a:\"ELEMENT\"in a?R(a.ELEMENT,b):\"WINDOW\"in a?R(a.W" +
    "INDOW,b):v(a,function(a){return Q(a,b)}):a}function S(a){a=a||docu" +
    "ment;var b=a.$wdc_;b||(b=a.$wdc_={},b.a=p());b.a||(b.a=p());return" +
    " b}function P(a){var b=S(a.ownerDocument),c=w(b,function(b){return" +
    " b==a});c||(c=\":wdc:\"+b.a++,b[c]=a);return c}\nfunction R(a,b){a=de" +
    "codeURIComponent(a);var c=b||document,d=S(c);if(!(a in d))throw ne" +
    "w D(10,\"Element does not exist in cache\");var f=d[a];if(\"setInterv" +
    "al\"in f){if(f.closed)throw delete d[a],new D(23,\"Window has been c" +
    "losed.\");return f}for(var e=f;e;){if(e==c.documentElement)return f" +
    ";e=e.parentNode}delete d[a];throw new D(10,\"Element is no longer a" +
    "ttached to the DOM\");};function T(a,b,c,d){d=d||C;var f;try{a:{var" +
    " e=a;if(\"string\"==typeof e)try{a=new d.Function(e);break a}catch(l" +
    "){throw l;}a=d==window?e:new d.Function(\"return (\"+e+\").apply(null" +
    ",arguments);\")}var x=Q(b,d.document),y=a.apply(null,x);f={status:0" +
    ",value:O(y)}}catch(h){f={status:\"code\"in h?h.code:13,value:{messag" +
    "e:h.message}}}c&&(a=[],G(new F,f,a),f=a.join(\"\"));return f}var U=[" +
    "\"_\"],V=this;U[0]in V||!V.execScript||V.execScript(\"var \"+U[0]);\nfo" +
    "r(var W;U.length&&(W=U.shift());){var X;if(X=!U.length)X=void 0!==" +
    "T;X?V[W]=T:V[W]?V=V[W]:V=V[W]={}};;return this._.apply(null,argume" +
    "nts);}).apply({navigator:typeof window!=\"undefined\"?window.navigat" +
    "or:null},arguments);}\n";
  static final String EXECUTE_SCRIPT_ANDROID_license =
    "\n\n Copyright 2014 Software Freedom Conservancy\n\n Licensed under th" +
    "e Apache License, Version 2.0 (the \"License\");\n you may not use th" +
    "is file except in compliance with the License.\n You may obtain a c" +
    "opy of the License at\n\n      http://www.apache.org/licenses/LICENS" +
    "E-2.0\n\n Unless required by applicable law or agreed to in writing," +
    " software\n distributed under the License is distributed on an \"AS " +
    "IS\" BASIS,\n WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either e" +
    "xpress or implied.\n See the License for the specific language gove" +
    "rning permissions and\n limitations under the License.\n";
  private static final String EXECUTE_SCRIPT_ANDROID_original() {
    return EXECUTE_SCRIPT_ANDROID.replaceAll("xxx_rpl_lic", EXECUTE_SCRIPT_ANDROID_license);
  }

/* field: GET_ELEMENT_ANDROID license: 

 Copyright 2014 Software Freedom Conservancy

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
  static final String GET_ELEMENT_ANDROID =
    "function(){return(function(){var f=Date.now||function(){return+new" +
    " Date};var g=String.prototype.trim?function(a){return a.trim()}:fu" +
    "nction(a){return a.replace(/^[\\s\\xa0]+|[\\s\\xa0]+$/g,\"\")};function " +
    "n(a,c){return a<c?-1:a>c?1:0};var p;a:{var q=this.navigator;if(q){" +
    "var r=q.userAgent;if(r){p=r;break a}}p=\"\"};/*xxx_rpl_lic*/\nfunctio" +
    "n t(a,c){this.code=a;this.a=u[a]||\"unknown error\";this.message=c||" +
    "\"\";var d=this.a.replace(/((?:^|\\s+)[a-z])/g,function(a){return a.t" +
    "oUpperCase().replace(/^[\\s\\xa0]+/g,\"\")}),e=d.length-5;if(0>e||d.in" +
    "dexOf(\"Error\",e)!=e)d+=\"Error\";this.name=d;d=Error(this.message);d" +
    ".name=this.name;this.stack=d.stack||\"\"}\n(function(){var a=Error;fu" +
    "nction c(){}c.prototype=a.prototype;t.c=a.prototype;t.prototype=ne" +
    "w c;t.prototype.constructor=t;t.a=function(d,e,b){for(var c=Array(" +
    "arguments.length-2),k=2;k<arguments.length;k++)c[k-2]=arguments[k]" +
    ";return a.prototype[e].apply(d,c)}})();\nvar u={15:\"element not sel" +
    "ectable\",11:\"element not visible\",31:\"unknown error\",30:\"unknown e" +
    "rror\",24:\"invalid cookie domain\",29:\"invalid element coordinates\"," +
    "12:\"invalid element state\",32:\"invalid selector\",51:\"invalid selec" +
    "tor\",52:\"invalid selector\",17:\"javascript error\",405:\"unsupported " +
    "operation\",34:\"move target out of bounds\",27:\"no such alert\",7:\"no" +
    " such element\",8:\"no such frame\",23:\"no such window\",28:\"script ti" +
    "meout\",33:\"session not created\",10:\"stale element reference\",21:\"t" +
    "imeout\",25:\"unable to set cookie\",\n26:\"unexpected alert open\",13:\"" +
    "unknown error\",9:\"unknown command\"};t.prototype.toString=function(" +
    "){return this.name+\": \"+this.message};function v(a){return(a=a.exe" +
    "c(p))?a[1]:\"\"}v(/Android\\s+([0-9.]+)/)||v(/Version\\/([0-9.]+)/);fu" +
    "nction w(a){var c=0,d=g(String(x)).split(\".\");a=g(String(a)).split" +
    "(\".\");for(var e=Math.max(d.length,a.length),b=0;0==c&&b<e;b++){var" +
    " h=d[b]||\"\",k=a[b]||\"\",E=RegExp(\"(\\\\d*)(\\\\D*)\",\"g\"),F=RegExp(\"(\\\\d" +
    "*)(\\\\D*)\",\"g\");do{var l=E.exec(h)||[\"\",\"\",\"\"],m=F.exec(k)||[\"\",\"\"," +
    "\"\"];if(0==l[0].length&&0==m[0].length)break;c=n(0==l[1].length?0:p" +
    "arseInt(l[1],10),0==m[1].length?0:parseInt(m[1],10))||n(0==l[2].le" +
    "ngth,0==m[2].length)||n(l[2],m[2])}while(0==c)}}var y=/Android\\s+(" +
    "[0-9\\.]+)/.exec(p),x=y?y[1]:\"0\";w(2.3);\nw(4);function z(a,c){a=dec" +
    "odeURIComponent(a);var d=c||document,e;e=d||document;var b=e.$wdc_" +
    ";b||(b=e.$wdc_={},b.b=f());b.b||(b.b=f());e=b;if(!(a in e))throw n" +
    "ew t(10,\"Element does not exist in cache\");b=e[a];if(\"setInterval\"" +
    "in b){if(b.closed)throw delete e[a],new t(23,\"Window has been clos" +
    "ed.\");return b}for(var h=b;h;){if(h==d.documentElement)return b;h=" +
    "h.parentNode}delete e[a];throw new t(10,\"Element is no longer atta" +
    "ched to the DOM\");}var A=[\"_\"],B=this;A[0]in B||!B.execScript||B.e" +
    "xecScript(\"var \"+A[0]);\nfor(var C;A.length&&(C=A.shift());){var D;" +
    "if(D=!A.length)D=void 0!==z;D?B[C]=z:B[C]?B=B[C]:B=B[C]={}};;retur" +
    "n this._.apply(null,arguments);}).apply({navigator:typeof window!=" +
    "\"undefined\"?window.navigator:null},arguments);}\n";
  static final String GET_ELEMENT_ANDROID_license =
    "\n\n Copyright 2014 Software Freedom Conservancy\n\n Licensed under th" +
    "e Apache License, Version 2.0 (the \"License\");\n you may not use th" +
    "is file except in compliance with the License.\n You may obtain a c" +
    "opy of the License at\n\n      http://www.apache.org/licenses/LICENS" +
    "E-2.0\n\n Unless required by applicable law or agreed to in writing," +
    " software\n distributed under the License is distributed on an \"AS " +
    "IS\" BASIS,\n WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either e" +
    "xpress or implied.\n See the License for the specific language gove" +
    "rning permissions and\n limitations under the License.\n";
  private static final String GET_ELEMENT_ANDROID_original() {
    return GET_ELEMENT_ANDROID.replaceAll("xxx_rpl_lic", GET_ELEMENT_ANDROID_license);
  }

  public static void main(String[] args) {
    if (args.length == 0) {
      {
        String message =     "EXECUTE_SCRIPT_ANDROID third_party/javascript/browser_automation/b" +
    "ot/fragments/execute_script_android.js";
        System.out.println(message);
      }
      {
        String message =     "GET_ELEMENT_ANDROID tools/android/webdriver/atom/get_element_andro" +
    "id.js";
        System.out.println(message);
      }
      System.exit(0);
    }
    String name = args[0];
    if("EXECUTE_SCRIPT_ANDROID".equals(name)) {
      System.out.print(EvaluationAtom.EXECUTE_SCRIPT_ANDROID_original());
      System.exit(0);
    }
    if("GET_ELEMENT_ANDROID".equals(name)) {
      System.out.print(EvaluationAtom.GET_ELEMENT_ANDROID_original());
      System.exit(0);
    }
    System.exit(1);
  }
}