package android.support.test.espresso.web.webdriver;
// GENERATED CODE DO NOT EDIT
final class WebDriverAtomScripts {
/* field: CLEAR_ANDROID license: 

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
  static final String CLEAR_ANDROID =
  new StringBuilder(
    "function(){return(function(){function g(a){return function(){retur" +
    "n this[a]}}function k(a){return function(){return a}}var l,p=this;" +
    "function r(a){return void 0!==a}function aa(a,b){var c=a.split(\".\"" +
    "),d=p;c[0]in d||!d.execScript||d.execScript(\"var \"+c[0]);for(var e" +
    ";c.length&&(e=c.shift());)!c.length&&r(b)?d[e]=b:d[e]?d=d[e]:d=d[e" +
    "]={}}\nfunction ba(a){var b=typeof a;if(\"object\"==b)if(a){if(a inst" +
    "anceof Array)return\"array\";if(a instanceof Object)return b;var c=O" +
    "bject.prototype.toString.call(a);if(\"[object Window]\"==c)return\"ob" +
    "ject\";if(\"[object Array]\"==c||\"number\"==typeof a.length&&\"undefine" +
    "d\"!=typeof a.splice&&\"undefined\"!=typeof a.propertyIsEnumerable&&!" +
    "a.propertyIsEnumerable(\"splice\"))return\"array\";if(\"[object Functio" +
    "n]\"==c||\"undefined\"!=typeof a.call&&\"undefined\"!=typeof a.property" +
    "IsEnumerable&&!a.propertyIsEnumerable(\"call\"))return\"function\"}els" +
    "e return\"null\";\nelse if(\"function\"==b&&\"undefined\"==typeof a.call)" +
    "return\"object\";return b}function t(a){return\"string\"==typeof a}fun" +
    "ction ca(a){return\"number\"==typeof a}function da(a){return\"functio" +
    "n\"==ba(a)}function ea(a,b,c){return a.call.apply(a.bind,arguments)" +
    "}\nfunction fa(a,b,c){if(!a)throw Error();if(2<arguments.length){va" +
    "r d=Array.prototype.slice.call(arguments,2);return function(){var " +
    "c=Array.prototype.slice.call(arguments);Array.prototype.unshift.ap" +
    "ply(c,d);return a.apply(b,c)}}return function(){return a.apply(b,a" +
    "rguments)}}function ga(a,b,c){ga=Function.prototype.bind&&-1!=Func" +
    "tion.prototype.bind.toString().indexOf(\"native code\")?ea:fa;return" +
    " ga.apply(null,arguments)}\nfunction ha(a,b){var c=Array.prototype." +
    "slice.call(arguments,1);return function(){var b=c.slice();b.push.a" +
    "pply(b,arguments);return a.apply(this,b)}}function v(a,b){function" +
    " c(){}c.prototype=b.prototype;a.R=b.prototype;a.prototype=new c;a." +
    "prototype.constructor=a;a.O=function(a,c,f){for(var h=Array(argume" +
    "nts.length-2),q=2;q<arguments.length;q++)h[q-2]=arguments[q];retur" +
    "n b.prototype[c].apply(a,h)}};function ia(a){if(Error.captureStack" +
    "Trace)Error.captureStackTrace(this,ia);else{var b=Error().stack;b&" +
    "&(this.stack=b)}a&&(this.message=String(a))}v(ia,Error);ia.prototy" +
    "pe.name=\"CustomError\";function ja(a,b){for(var c=a.split(\"%s\"),d=\"" +
    "\",e=Array.prototype.slice.call(arguments,1);e.length&&1<c.length;)" +
    "d+=c.shift()+e.shift();return d+c.join(\"%s\")}var ka=String.prototy" +
    "pe.trim?function(a){return a.trim()}:function(a){return a.replace(" +
    "/^[\\s\\xa0]+|[\\s\\xa0]+$/g,\"\")};function la(a,b){return a<b?-1:a>b?1" +
    ":0}function ma(a){return String(a).replace(/\\-([a-z])/g,function(a" +
    ",c){return c.toUpperCase()})};function na(a,b){b.unshift(a);ia.cal" +
    "l(this,ja.apply(null,b));b.shift()}v(na,ia);na.prototype.name=\"Ass" +
    "ertionError\";function oa(a,b,c){if(!a){var d=\"Assertion failed\";if" +
    "(b)var d=d+(\": \"+b),e=Array.prototype.slice.call(arguments,2);thro" +
    "w new na(\"\"+d,e||[]);}};var pa=Array.prototype;function qa(a,b){if" +
    "(t(a))return t(b)&&1==b.length?a.indexOf(b,0):-1;for(var c=0;c<a.l" +
    "ength;c++)if(c in a&&a[c]===b)return c;return-1}function w(a,b){fo" +
    "r(var c=a.length,d=t(a)?a.split(\"\"):a,e=0;e<c;e++)e in d&&b.call(v" +
    "oid 0,d[e],e,a)}function ra(a,b,c){var d=c;w(a,function(c,f){d=b.c" +
    "all(void 0,d,c,f,a)});return d}function sa(a,b){for(var c=a.length" +
    ",d=t(a)?a.split(\"\"):a,e=0;e<c;e++)if(e in d&&b.call(void 0,d[e],e," +
    "a))return!0;return!1}\nfunction ta(a,b){for(var c=a.length,d=t(a)?a" +
    ".split(\"\"):a,e=0;e<c;e++)if(e in d&&!b.call(void 0,d[e],e,a))retur" +
    "n!1;return!0}function ua(a){return pa.concat.apply(pa,arguments)}f" +
    "unction va(a,b,c){oa(null!=a.length);return 2>=arguments.length?pa" +
    ".slice.call(a,b):pa.slice.call(a,b,c)};function wa(a,b){this.x=r(a" +
    ")?a:0;this.y=r(b)?b:0}l=wa.prototype;l.clone=function(){return new" +
    " wa(this.x,this.y)};l.toString=function(){return\"(\"+this.x+\", \"+th" +
    "is.y+\")\"};l.ceil=function(){this.x=Math.ceil(this.x);this.y=Math.c" +
    "eil(this.y);return this};l.floor=function(){this.x=Math.floor(this" +
    ".x);this.y=Math.floor(this.y);return this};l.round=function(){this" +
    ".x=Math.round(this.x);this.y=Math.round(this.y);return this};l.sca" +
    "le=function(a,b){var c=ca(b)?b:a;this.x*=a;this.y*=c;return this};" +
    "function xa(a,b){this.width=a;this.height=b}l=xa.prototype;l.clone" +
    "=function(){return new xa(this.width,this.height)};l.toString=func" +
    "tion(){return\"(\"+this.width+\" x \"+this.height+\")\"};l.ceil=function" +
    "(){this.width=Math.ceil(this.width);this.height=Math.ceil(this.hei" +
    "ght);return this};l.floor=function(){this.width=Math.floor(this.wi" +
    "dth);this.height=Math.floor(this.height);return this};l.round=func" +
    "tion(){this.width=Math.round(this.width);this.height=Math.round(th" +
    "is.height);return this};\nl.scale=function(a,b){var c=ca(b)?b:a;thi" +
    "s.width*=a;this.height*=c;return this};var ya;a:{var za=p.navigato" +
    "r;if(za){var Aa=za.userAgent;if(Aa){ya=Aa;break a}}ya=\"\"};var Ba=-" +
    "1!=ya.indexOf(\"Macintosh\"),Ca=-1!=ya.indexOf(\"Windows\");function D" +
    "a(a){for(;a&&1!=a.nodeType;)a=a.previousSibling;return a}function " +
    "Ea(a,b){if(a.contains&&1==b.nodeType)return a==b||a.contains(b);if" +
    "(\"undefined\"!=typeof a.compareDocumentPosition)return a==b||Boolea" +
    "n(a.compareDocumentPosition(b)&16);for(;b&&a!=b;)b=b.parentNode;re" +
    "turn b==a}\nfunction Fa(a,b){if(a==b)return 0;if(a.compareDocumentP" +
    "osition)return a.compareDocumentPosition(b)&2?1:-1;if(\"sourceIndex" +
    "\"in a||a.parentNode&&\"sourceIndex\"in a.parentNode){var c=1==a.node" +
    "Type,d=1==b.nodeType;if(c&&d)return a.sourceIndex-b.sourceIndex;va" +
    "r e=a.parentNode,f=b.parentNode;return e==f?Ga(a,b):!c&&Ea(e,b)?-1" +
    "*Ha(a,b):!d&&Ea(f,a)?Ha(b,a):(c?a.sourceIndex:e.sourceIndex)-(d?b." +
    "sourceIndex:f.sourceIndex)}d=x(a);c=d.createRange();c.selectNode(a" +
    ");c.collapse(!0);d=d.createRange();d.selectNode(b);\nd.collapse(!0)" +
    ";return c.compareBoundaryPoints(p.Range.START_TO_END,d)}function H" +
    "a(a,b){var c=a.parentNode;if(c==b)return-1;for(var d=b;d.parentNod" +
    "e!=c;)d=d.parentNode;return Ga(d,a)}function Ga(a,b){for(var c=b;c" +
    "=c.previousSibling;)if(c==a)return-1;return 1}function x(a){oa(a,\"" +
    "Node cannot be null or undefined.\");return 9==a.nodeType?a:a.owner" +
    "Document||a.document}function Ia(a,b,c){c||(a=a.parentNode);for(c=" +
    "0;a;){oa(\"parentNode\"!=a.name);if(b(a))return a;a=a.parentNode;c++" +
    "}return null}\nfunction Ja(a){try{return a&&a.activeElement}catch(b" +
    "){}return null}function Ka(a){this.a=a||p.document||document}Ka.pr" +
    "ototype.contains=Ea;function La(a,b,c,d){this.top=a;this.right=b;t" +
    "his.bottom=c;this.left=d}l=La.prototype;l.clone=function(){return " +
    "new La(this.top,this.right,this.bottom,this.left)};l.toString=func" +
    "tion(){return\"(\"+this.top+\"t, \"+this.right+\"r, \"+this.bottom+\"b, \"" +
    "+this.left+\"l)\"};l.contains=function(a){return this&&a?a instanceo" +
    "f La?a.left>=this.left&&a.right<=this.right&&a.top>=this.top&&a.bo" +
    "ttom<=this.bottom:a.x>=this.left&&a.x<=this.right&&a.y>=this.top&&" +
    "a.y<=this.bottom:!1};\nl.ceil=function(){this.top=Math.ceil(this.to" +
    "p);this.right=Math.ceil(this.right);this.bottom=Math.ceil(this.bot" +
    "tom);this.left=Math.ceil(this.left);return this};l.floor=function(" +
    "){this.top=Math.floor(this.top);this.right=Math.floor(this.right);" +
    "this.bottom=Math.floor(this.bottom);this.left=Math.floor(this.left" +
    ");return this};l.round=function(){this.top=Math.round(this.top);th" +
    "is.right=Math.round(this.right);this.bottom=Math.round(this.bottom" +
    ");this.left=Math.round(this.left);return this};\nl.scale=function(a" +
    ",b){var c=ca(b)?b:a;this.left*=a;this.right*=a;this.top*=c;this.bo" +
    "ttom*=c;return this};function y(a,b,c,d){this.left=a;this.top=b;th" +
    "is.width=c;this.height=d}l=y.prototype;l.clone=function(){return n" +
    "ew y(this.left,this.top,this.width,this.height)};l.toString=functi" +
    "on(){return\"(\"+this.left+\", \"+this.top+\" - \"+this.width+\"w x \"+thi" +
    "s.height+\"h)\"};l.contains=function(a){return a instanceof y?this.l" +
    "eft<=a.left&&this.left+this.width>=a.left+a.width&&this.top<=a.top" +
    "&&this.top+this.height>=a.top+a.height:a.x>=this.left&&a.x<=this.l" +
    "eft+this.width&&a.y>=this.top&&a.y<=this.top+this.height};\nl.ceil=" +
    "function(){this.left=Math.ceil(this.left);this.top=Math.ceil(this." +
    "top);this.width=Math.ceil(this.width);this.height=Math.ceil(this.h" +
    "eight);return this};l.floor=function(){this.left=Math.floor(this.l" +
    "eft);this.top=Math.floor(this.top);this.width=Math.floor(this.widt" +
    "h);this.height=Math.floor(this.height);return this};l.round=functi" +
    "on(){this.left=Math.round(this.left);this.top=Math.round(this.top)" +
    ";this.width=Math.round(this.width);this.height=Math.round(this.hei" +
    "ght);return this};\nl.scale=function(a,b){var c=ca(b)?b:a;this.left" +
    "*=a;this.width*=a;this.top*=c;this.height*=c;return this};/*xxx_rp" +
    "l_lic*/\nvar Ma=window;function Na(a,b){this.code=a;this.a=Oa[a]||\"" +
    "unknown error\";this.message=b||\"\";var c=this.a.replace(/((?:^|\\s+)" +
    "[a-z])/g,function(a){return a.toUpperCase().replace(/^[\\s\\xa0]+/g," +
    "\"\")}),d=c.length-5;if(0>d||c.indexOf(\"Error\",d)!=d)c+=\"Error\";this" +
    ".name=c;c=Error(this.message);c.name=this.name;this.stack=c.stack|" +
    "|\"\"}v(Na,Error);\nvar Oa={15:\"element not selectable\",11:\"element n" +
    "ot visible\",31:\"unknown error\",30:\"unknown error\",24:\"invalid cook" +
    "ie domain\",29:\"invalid element coordinates\",12:\"invalid element st" +
    "ate\",32:\"invalid selector\",51:\"invalid selector\",52:\"invalid selec" +
    "tor\",17:\"javascript error\",405:\"unsupported operation\",34:\"move ta" +
    "rget out of bounds\",27:\"no such alert\",7:\"no such element\",8:\"no s" +
    "uch frame\",23:\"no such window\",28:\"script timeout\",33:\"session not" +
    " created\",10:\"stale element reference\",21:\"timeout\",25:\"unable to " +
    "set cookie\",\n26:\"unexpected alert open\",13:\"unknown error\",9:\"unkn" +
    "own command\"};Na.prototype.toString=function(){return this.name+\":" +
    " \"+this.message};function Pa(a){return(a=a.exec(ya))?a[1]:\"\"}Pa(/A" +
    "ndroid\\s+([0-9.]+)/)||Pa(/Version\\/([0-9.]+)/);function Qa(a){var " +
    "b=0,c=ka(String(Ra)).split(\".\");a=ka(String(a)).split(\".\");for(var" +
    " d=Math.max(c.length,a.length),e=0;0==b&&e<d;e++){var f=c[e]||\"\",h" +
    "=a[e]||\"\",q=RegExp(\"(\\\\d*)(\\\\D*)\",\"g\"),u=RegExp(\"(\\\\d*)(\\\\D*)\",\"g\"" +
    ");do{var n=q.exec(f)||[\"\",\"\",\"\"],m=u.exec(h)||[\"\",\"\",\"\"];if(0==n[0" +
    "].length&&0==m[0].length)break;b=la(0==n[1].length?0:parseInt(n[1]" +
    ",10),0==m[1].length?0:parseInt(m[1],10))||la(0==n[2].length,0==m[2" +
    "].length)||la(n[2],m[2])}while(0==b)}}\nvar Sa=/Android\\s+([0-9\\.]+" +
    ")/.exec(ya),Ra=Sa?Sa[1]:\"0\";Qa(2.3);Qa(4);/*\n\n The MIT License\n\n C" +
    "opyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc" +
    ".\n\n Permission is hereby granted, free of charge, to any person ob" +
    "taining a copy\n of this software and associated documentation file" +
    "s (the \"Software\"), to\n deal in the Software without restriction, " +
    "including without limitation the\n rights to use, copy, modify, mer" +
    "ge, publish, distribute, sublicense, and/or\n sell copies of the So" +
    "ftware, and to permit persons to whom the Software is\n furnished t" +
    "o do so, subject to the following conditions:\n\n The above copyrigh" +
    "t notice and this permission notice shall be included in\n all copi" +
    "es or substantial portions of the Software.\n\n THE SOFTWARE IS PROV" +
    "IDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, I" +
    "NCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FI" +
    "TNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SH" +
    "ALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAM" +
    "AGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT O" +
    "R OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTW" +
    "ARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction Ta(" +
    "a,b,c){this.a=a;this.b=b||1;this.h=c||1};function Ua(a){this.b=a;t" +
    "his.a=0}function Va(a){a=a.match(Wa);for(var b=0;b<a.length;b++)Xa" +
    ".test(a[b])&&a.splice(b,1);return new Ua(a)}var Wa=RegExp(\"\\\\$?(?:" +
    "(?![0-9-])[\\\\w-]+:)?(?![0-9-])[\\\\w-]+|\\\\/\\\\/|\\\\.\\\\.|::|\\\\d+(?:\\\\.\\" +
    "\\d*)?|\\\\.\\\\d+|\\\"[^\\\"]*\\\"|'[^']*'|[!<>]=|\\\\s+|.\",\"g\"),Xa=/^\\s/;func" +
    "tion z(a,b){return a.b[a.a+(b||0)]}function A(a){return a.b[a.a++]" +
    "}function Ya(a){return a.b.length<=a.a};function B(a){var b=null,c" +
    "=a.nodeType;1==c&&(b=a.textContent,b=void 0==b||null==b?a.innerTex" +
    "t:b,b=void 0==b||null==b?\"\":b);if(\"string\"!=typeof b)if(9==c||1==c" +
    "){a=9==c?a.documentElement:a.firstChild;for(var c=0,d=[],b=\"\";a;){" +
    "do 1!=a.nodeType&&(b+=a.nodeValue),d[c++]=a;while(a=a.firstChild);" +
    "for(;c&&!(a=d[--c].nextSibling););}}else b=a.nodeValue;return\"\"+b}" +
    "\nfunction Za(a,b,c){if(null===b)return!0;try{if(!a.getAttribute)re" +
    "turn!1}catch(d){return!1}return null==c?!!a.getAttribute(b):a.getA" +
    "ttribute(b,2)==c}function $a(a,b,c,d,e){return ab.call(null,a,b,t(" +
    "c)?c:null,t(d)?d:null,e||new D)}\nfunction ab(a,b,c,d,e){b.getEleme" +
    "ntsByName&&d&&\"name\"==c?(b=b.getElementsByName(d),w(b,function(b){" +
    "a.a(b)&&E(e,b)})):b.getElementsByClassName&&d&&\"class\"==c?(b=b.get" +
    "ElementsByClassName(d),w(b,function(b){b.className==d&&a.a(b)&&E(e" +
    ",b)})):a instanceof F?bb(a,b,c,d,e):b.getElementsByTagName&&(b=b.g" +
    "etElementsByTagName(a.h()),w(b,function(a){Za(a,c,d)&&E(e,a)}));re" +
    "turn e}function cb(a,b,c,d,e){for(b=b.firstChild;b;b=b.nextSibling" +
    ")Za(b,c,d)&&a.a(b)&&E(e,b);return e}\nfunction bb(a,b,c,d,e){for(b=" +
    "b.firstChild;b;b=b.nextSibling)Za(b,c,d)&&a.a(b)&&E(e,b),bb(a,b,c," +
    "d,e)};function D(){this.b=this.a=null;this.s=0}function db(a){this" +
    ".node=a;this.a=this.b=null}function eb(a,b){if(!a.a)return b;if(!b" +
    ".a)return a;for(var c=a.a,d=b.a,e=null,f=null,h=0;c&&d;)c.node==d." +
    "node?(f=c,c=c.a,d=d.a):0<Fa(c.node,d.node)?(f=d,d=d.a):(f=c,c=c.a)" +
    ",(f.b=e)?e.a=f:a.a=f,e=f,h++;for(f=c||d;f;)f.b=e,e=e.a=f,h++,f=f.a" +
    ";a.b=e;a.s=h;return a}function fb(a,b){var c=new db(b);c.a=a.a;a.b" +
    "?a.a.b=c:a.a=a.b=c;a.a=c;a.s++}function E(a,b){var c=new db(b);c.b" +
    "=a.b;a.a?a.b.a=c:a.a=a.b=c;a.b=c;a.s++}\nfunction gb(a){return(a=a." +
    "a)?a.node:null}function hb(a){return(a=gb(a))?B(a):\"\"}function G(a" +
    ",b){return new ib(a,!!b)}function ib(a,b){this.h=a;this.b=(this.c=" +
    "b)?a.b:a.a;this.a=null}function H(a){var b=a.b;if(null==b)return n" +
    "ull;var c=a.a=b;a.b=a.c?b.b:b.a;return c.node};function jb(a){swit" +
    "ch(a.nodeType){case 1:return ha(kb,a);case 9:return jb(a.documentE" +
    "lement);case 11:case 10:case 6:case 12:return lb;default:return a." +
    "parentNode?jb(a.parentNode):lb}}function lb(){return null}function" +
    " kb(a,b){if(a.prefix==b)return a.namespaceURI||\"http://www.w3.org/" +
    "1999/xhtml\";var c=a.getAttributeNode(\"xmlns:\"+b);return c&&c.speci" +
    "fied?c.value||null:a.parentNode&&9!=a.parentNode.nodeType?kb(a.par" +
    "entNode,b):null};function I(a){this.m=a;this.b=this.i=!1;this.h=nu" +
    "ll}function J(a){return\"\\n  \"+a.toString().split(\"\\n\").join(\"\\n  \"" +
    ")}function mb(a,b){a.i=b}function nb(a,b){a.b=b}function K(a,b){va" +
    "r c=a.a(b);return c instanceof D?+hb(c):+c}function L(a,b){var c=a" +
    ".a(b);return c instanceof D?hb(c):\"\"+c}function ob(a,b){var c=a.a(" +
    "b);return c instanceof D?!!c.s:!!c};function pb(a,b,c){I.call(this" +
    ",a.m);this.c=a;this.j=b;this.w=c;this.i=b.i||c.i;this.b=b.b||c.b;t" +
    "his.c==qb&&(c.b||c.i||4==c.m||0==c.m||!b.h?b.b||b.i||4==b.m||0==b." +
    "m||!c.h||(this.h={name:c.h.name,A:b}):this.h={name:b.h.name,A:c})}" +
    "v(pb,I);\nfunction rb(a,b,c,d,e){b=b.a(d);c=c.a(d);var f;if(b insta" +
    "nceof D&&c instanceof D){e=G(b);for(d=H(e);d;d=H(e))for(b=G(c),f=H" +
    "(b);f;f=H(b))if(a(B(d),B(f)))return!0;return!1}if(b instanceof D||" +
    "c instanceof D){b instanceof D?e=b:(e=c,c=b);e=G(e);b=typeof c;for" +
    "(d=H(e);d;d=H(e)){switch(b){case \"number\":d=+B(d);break;case \"bool" +
    "ean\":d=!!B(d);break;case \"string\":d=B(d);break;default:throw Error" +
    "(\"Illegal primitive type for comparison.\");}if(a(d,c))return!0}ret" +
    "urn!1}return e?\"boolean\"==typeof b||\"boolean\"==typeof c?\na(!!b,!!c" +
    "):\"number\"==typeof b||\"number\"==typeof c?a(+b,+c):a(b,c):a(+b,+c)}" +
    "pb.prototype.a=function(a){return this.c.u(this.j,this.w,a)};pb.pr" +
    "ototype.toString=function(){var a=\"Binary Expression: \"+this.c,a=a" +
    "+J(this.j);return a+=J(this.w)};function sb(a,b,c,d){this.a=a;this" +
    ".H=b;this.m=c;this.u=d}sb.prototype.toString=g(\"a\");var tb={};func" +
    "tion M(a,b,c,d){if(tb.hasOwnProperty(a))throw Error(\"Binary operat" +
    "or already created: \"+a);a=new sb(a,b,c,d);return tb[a.toString()]" +
    "=a}\nM(\"div\",6,1,function(a,b,c){return K(a,c)/K(b,c)});M(\"mod\",6,1" +
    ",function(a,b,c){return K(a,c)%K(b,c)});M(\"*\",6,1,function(a,b,c){" +
    "return K(a,c)*K(b,c)});M(\"+\",5,1,function(a,b,c){return K(a,c)+K(b" +
    ",c)});M(\"-\",5,1,function(a,b,c){return K(a,c)-K(b,c)});M(\"<\",4,2,f" +
    "unction(a,b,c){return rb(function(a,b){return a<b},a,b,c)});M(\">\"," +
    "4,2,function(a,b,c){return rb(function(a,b){return a>b},a,b,c)});M" +
    "(\"<=\",4,2,function(a,b,c){return rb(function(a,b){return a<=b},a,b" +
    ",c)});\nM(\">=\",4,2,function(a,b,c){return rb(function(a,b){return a" +
    ">=b},a,b,c)});var qb=M(\"=\",3,2,function(a,b,c){return rb(function(" +
    "a,b){return a==b},a,b,c,!0)});M(\"!=\",3,2,function(a,b,c){return rb" +
    "(function(a,b){return a!=b},a,b,c,!0)});M(\"and\",2,2,function(a,b,c" +
    "){return ob(a,c)&&ob(b,c)});M(\"or\",1,2,function(a,b,c){return ob(a" +
    ",c)||ob(b,c)});function ub(a,b){if(b.a.length&&4!=a.m)throw Error(" +
    "\"Primary expression must evaluate to nodeset if filter has predica" +
    "te(s).\");I.call(this,a.m);this.c=a;this.j=b;this.i=a.i;this.b=a.b}" +
    "v(ub,I);ub.prototype.a=function(a){a=this.c.a(a);return vb(this.j," +
    "a)};ub.prototype.toString=function(){var a;a=\"Filter:\"+J(this.c);r" +
    "eturn a+=J(this.j)};function wb(a,b){if(b.length<a.I)throw Error(\"" +
    "Function \"+a.o+\" expects at least\"+a.I+\" arguments, \"+b.length+\" g" +
    "iven\");if(null!==a.C&&b.length>a.C)throw Error(\"Function \"+a.o+\" e" +
    "xpects at most \"+a.C+\" arguments, \"+b.length+\" given\");a.N&&w(b,fu" +
    "nction(b,d){if(4!=b.m)throw Error(\"Argument \"+d+\" to function \"+a." +
    "o+\" is not of type Nodeset: \"+b);});I.call(this,a.m);this.j=a;this" +
    ".c=b;mb(this,a.i||sa(b,function(a){return a.i}));nb(this,a.M&&!b.l" +
    "ength||a.L&&!!b.length||sa(b,function(a){return a.b}))}\nv(wb,I);wb" +
    ".prototype.a=function(a){return this.j.u.apply(null,ua(a,this.c))}" +
    ";wb.prototype.toString=function(){var a=\"Function: \"+this.j;if(thi" +
    "s.c.length)var b=ra(this.c,function(a,b){return a+J(b)},\"Arguments" +
    ":\"),a=a+J(b);return a};function xb(a,b,c,d,e,f,h,q,u){this.o=a;thi" +
    "s.m=b;this.i=c;this.M=d;this.L=e;this.u=f;this.I=h;this.C=r(q)?q:h" +
    ";this.N=!!u}xb.prototype.toString=g(\"o\");var yb={};\nfunction O(a,b" +
    ",c,d,e,f,h,q){if(yb.hasOwnProperty(a))throw Error(\"Function alread" +
    "y created: \"+a+\".\");yb[a]=new xb(a,b,c,d,!1,e,f,h,q)}O(\"boolean\",2" +
    ",!1,!1,function(a,b){return ob(b,a)},1);O(\"ceiling\",1,!1,!1,functi" +
    "on(a,b){return Math.ceil(K(b,a))},1);O(\"concat\",3,!1,!1,function(a" +
    ",b){var c=va(arguments,1);return ra(c,function(b,c){return b+L(c,a" +
    ")},\"\")},2,null);O(\"contains\",2,!1,!1,function(a,b,c){b=L(b,a);a=L(" +
    "c,a);return-1!=b.indexOf(a)},2);O(\"count\",1,!1,!1,function(a,b){re" +
    "turn b.a(a).s},1,1,!0);\nO(\"false\",2,!1,!1,k(!1),0);O(\"floor\",1,!1," +
    "!1,function(a,b){return Math.floor(K(b,a))},1);O(\"id\",4,!1,!1,func" +
    "tion(a,b){var c=a.a,d=9==c.nodeType?c:c.ownerDocument,c=L(b,a).spl" +
    "it(/\\s+/),e=[];w(c,function(a){a=d.getElementById(a);!a||0<=qa(e,a" +
    ")||e.push(a)});e.sort(Fa);var f=new D;w(e,function(a){E(f,a)});ret" +
    "urn f},1);O(\"lang\",2,!1,!1,k(!1),1);O(\"last\",1,!0,!1,function(a){i" +
    "f(1!=arguments.length)throw Error(\"Function last expects ()\");retu" +
    "rn a.h},0);\nO(\"local-name\",3,!1,!0,function(a,b){var c=b?gb(b.a(a)" +
    "):a.a;return c?c.localName||c.nodeName.toLowerCase():\"\"},0,1,!0);O" +
    "(\"name\",3,!1,!0,function(a,b){var c=b?gb(b.a(a)):a.a;return c?c.no" +
    "deName.toLowerCase():\"\"},0,1,!0);O(\"namespace-uri\",3,!0,!1,k(\"\"),0" +
    ",1,!0);O(\"normalize-space\",3,!1,!0,function(a,b){return(b?L(b,a):B" +
    "(a.a)).replace(/[\\s\\xa0]+/g,\" \").replace(/^\\s+|\\s+$/g,\"\")},0,1);O(" +
    "\"not\",2,!1,!1,function(a,b){return!ob(b,a)},1);O(\"number\",1,!1,!0," +
    "function(a,b){return b?K(b,a):+B(a.a)},0,1);\nO(\"position\",1,!0,!1," +
    "function(a){return a.b},0);O(\"round\",1,!1,!1,function(a,b){return " +
    "Math.round(K(b,a))},1);O(\"starts-with\",2,!1,!1,function(a,b,c){b=L" +
    "(b,a);a=L(c,a);return 0==b.lastIndexOf(a,0)},2);O(\"string\",3,!1,!0" +
    ",function(a,b){return b?L(b,a):B(a.a)},0,1);O(\"string-length\",1,!1" +
    ",!0,function(a,b){return(b?L(b,a):B(a.a)).length},0,1);\nO(\"substri" +
    "ng\",3,!1,!1,function(a,b,c,d){c=K(c,a);if(isNaN(c)||Infinity==c||-" +
    "Infinity==c)return\"\";d=d?K(d,a):Infinity;if(isNaN(d)||-Infinity===" +
    "d)return\"\";c=Math.round(c)-1;var e=Math.max(c,0);a=L(b,a);if(Infin" +
    "ity==d)return a.substring(e);b=Math.round(d);return a.substring(e," +
    "c+b)},2,3);O(\"substring-after\",3,!1,!1,function(a,b,c){b=L(b,a);a=" +
    "L(c,a);c=b.indexOf(a);return-1==c?\"\":b.substring(c+a.length)},2);\n" +
    "O(\"substring-before\",3,!1,!1,function(a,b,c){b=L(b,a);a=L(c,a);a=b" +
    ".indexOf(a);return-1==a?\"\":b.substring(0,a)},2);O(\"sum\",1,!1,!1,fu" +
    "nction(a,b){for(var c=G(b.a(a)),d=0,e=H(c);e;e=H(c))d+=+B(e);retur" +
    "n d},1,1,!0);O(\"translate\",3,!1,!1,function(a,b,c,d){b=L(b,a);c=L(" +
    "c,a);var e=L(d,a);a=[];for(d=0;d<c.length;d++){var f=c.charAt(d);f" +
    " in a||(a[f]=e.charAt(d))}c=\"\";for(d=0;d<b.length;d++)f=b.charAt(d" +
    "),c+=f in a?a[f]:f;return c},3);O(\"true\",2,!1,!1,k(!0),0);function" +
    " F(a,b){this.j=a;this.c=r(b)?b:null;this.b=null;switch(a){case \"co" +
    "mment\":this.b=8;break;case \"text\":this.b=3;break;case \"processing-" +
    "instruction\":this.b=7;break;case \"node\":break;default:throw Error(" +
    "\"Unexpected argument\");}}function zb(a){return\"comment\"==a||\"text\"" +
    "==a||\"processing-instruction\"==a||\"node\"==a}F.prototype.a=function" +
    "(a){return null===this.b||this.b==a.nodeType};F.prototype.h=g(\"j\")" +
    ";F.prototype.toString=function(){var a=\"Kind Test: \"+this.j;null==" +
    "=this.c||(a+=J(this.c));return a};function Ab(a){I.call(this,3);th" +
    "is.c=a.substring(1,a.length-1)}v(Ab,I);Ab.prototype.a=g(\"c\");Ab.pr" +
    "ototype.toString=function(){return\"Literal: \"+this.c};function Bb(" +
    "a,b){this.o=a.toLowerCase();this.b=b?b.toLowerCase():\"http://www.w" +
    "3.org/1999/xhtml\"}Bb.prototype.a=function(a){var b=a.nodeType;retu" +
    "rn 1!=b&&2!=b?!1:\"*\"!=this.o&&this.o!=a.nodeName.toLowerCase()?!1:" +
    "this.b==(a.namespaceURI?a.namespaceURI.toLowerCase():\"http://www.w" +
    "3.org/1999/xhtml\")};Bb.prototype.h=g(\"o\");Bb.prototype.toString=fu" +
    "nction(){return\"Name Test: \"+(\"http://www.w3.org/1999/xhtml\"==this" +
    ".b?\"\":this.b+\":\")+this.o};function Cb(a){I.call(this,1);this.c=a}v" +
    "(Cb,I);Cb.prototype.a=g(\"c\");Cb.prototype.toString=function(){retu" +
    "rn\"Number: \"+this.c};function Db(a,b){I.call(this,a.m);this.j=a;th" +
    "is.c=b;this.i=a.i;this.b=a.b;if(1==this.c.length){var c=this.c[0];" +
    "c.B||c.c!=Eb||(c=c.w,\"*\"!=c.h()&&(this.h={name:c.h(),A:null}))}}v(" +
    "Db,I);function Fb(){I.call(this,4)}v(Fb,I);Fb.prototype.a=function" +
    "(a){var b=new D;a=a.a;9==a.nodeType?E(b,a):E(b,a.ownerDocument);re" +
    "turn b};Fb.prototype.toString=k(\"Root Helper Expression\");function" +
    " Gb(){I.call(this,4)}v(Gb,I);Gb.prototype.a=function(a){var b=new " +
    "D;E(b,a.a);return b};Gb.prototype.toString=k(\"Context Helper Expre" +
    "ssion\");\nfunction Hb(a){return\"/\"==a||\"//\"==a}Db.prototype.a=funct" +
    "ion(a){var b=this.j.a(a);if(!(b instanceof D))throw Error(\"Filter " +
    "expression must evaluate to nodeset.\");a=this.c;for(var c=0,d=a.le" +
    "ngth;c<d&&b.s;c++){var e=a[c],f=G(b,e.c.a),h;if(e.i||e.c!=Ib)if(e." +
    "i||e.c!=Jb)for(h=H(f),b=e.a(new Ta(h));null!=(h=H(f));)h=e.a(new T" +
    "a(h)),b=eb(b,h);else h=H(f),b=e.a(new Ta(h));else{for(h=H(f);(b=H(" +
    "f))&&(!h.contains||h.contains(b))&&b.compareDocumentPosition(h)&8;" +
    "h=b);b=e.a(new Ta(h))}}return b};\nDb.prototype.toString=function()" +
    "{var a;a=\"Path Expression:\"+J(this.j);if(this.c.length){var b=ra(t" +
    "his.c,function(a,b){return a+J(b)},\"Steps:\");a+=J(b)}return a};fun" +
    "ction Kb(a,b){this.a=a;this.b=!!b}\nfunction vb(a,b,c){for(c=c||0;c" +
    "<a.a.length;c++)for(var d=a.a[c],e=G(b),f=b.s,h,q=0;h=H(e);q++){va" +
    "r u=a.b?f-q:q+1;h=d.a(new Ta(h,u,f));if(\"number\"==typeof h)u=u==h;" +
    "else if(\"string\"==typeof h||\"boolean\"==typeof h)u=!!h;else if(h in" +
    "stanceof D)u=0<h.s;else throw Error(\"Predicate.evaluate returned a" +
    "n unexpected type.\");if(!u){u=e;h=u.h;var n=u.a;if(!n)throw Error(" +
    "\"Next must be called at least once before remove.\");var m=n.b,n=n." +
    "a;m?m.a=n:h.a=n;n?n.b=m:h.b=m;h.s--;u.a=null}}return b}\nKb.prototy" +
    "pe.toString=function(){return ra(this.a,function(a,b){return a+J(b" +
    ")},\"Predicates:\")};function P(a,b,c,d){I.call(this,4);this.c=a;thi" +
    "s.w=b;this.j=c||new Kb([]);this.B=!!d;b=this.j;b=0<b.a.length?b.a[" +
    "0].h:null;a.b&&b&&(this.h={name:b.name,A:b.A});a:{a=this.j;for(b=0" +
    ";b<a.a.length;b++)if(c=a.a[b],c.i||1==c.m||0==c.m){a=!0;break a}a=" +
    "!1}this.i=a}v(P,I);\nP.prototype.a=function(a){var b=a.a,c=null,c=t" +
    "his.h,d=null,e=null,f=0;c&&(d=c.name,e=c.A?L(c.A,a):null,f=1);if(t" +
    "his.B)if(this.i||this.c!=Lb)if(a=G((new P(Mb,new F(\"node\"))).a(a))" +
    ",b=H(a))for(c=this.u(b,d,e,f);null!=(b=H(a));)c=eb(c,this.u(b,d,e," +
    "f));else c=new D;else c=$a(this.w,b,d,e),c=vb(this.j,c,f);else c=t" +
    "his.u(a.a,d,e,f);return c};P.prototype.u=function(a,b,c,d){a=this." +
    "c.h(this.w,a,b,c);return a=vb(this.j,a,d)};\nP.prototype.toString=f" +
    "unction(){var a;a=\"Step:\"+J(\"Operator: \"+(this.B?\"//\":\"/\"));this.c" +
    ".o&&(a+=J(\"Axis: \"+this.c));a+=J(this.w);if(this.j.a.length){var b" +
    "=ra(this.j.a,function(a,b){return a+J(b)},\"Predicates:\");a+=J(b)}r" +
    "eturn a};function Nb(a,b,c,d){this.o=a;this.h=b;this.a=c;this.b=d}" +
    "Nb.prototype.toString=g(\"o\");var Ob={};function Q(a,b,c,d){if(Ob.h" +
    "asOwnProperty(a))throw Error(\"Axis already created: \"+a);b=new Nb(" +
    "a,b,c,!!d);return Ob[a]=b}\nQ(\"ancestor\",function(a,b){for(var c=ne" +
    "w D,d=b;d=d.parentNode;)a.a(d)&&fb(c,d);return c},!0);Q(\"ancestor-" +
    "or-self\",function(a,b){var c=new D,d=b;do a.a(d)&&fb(c,d);while(d=" +
    "d.parentNode);return c},!0);var Eb=Q(\"attribute\",function(a,b){var" +
    " c=new D,d=a.h(),e=b.attributes;if(e)if(a instanceof F&&null===a.b" +
    "||\"*\"==d)for(var d=0,f;f=e[d];d++)E(c,f);else(f=e.getNamedItem(d))" +
    "&&E(c,f);return c},!1),Lb=Q(\"child\",function(a,b,c,d,e){return cb." +
    "call(null,a,b,t(c)?c:null,t(d)?d:null,e||new D)},!1,!0);\nQ(\"descen" +
    "dant\",$a,!1,!0);var Mb=Q(\"descendant-or-self\",function(a,b,c,d){va" +
    "r e=new D;Za(b,c,d)&&a.a(b)&&E(e,b);return $a(a,b,c,d,e)},!1,!0),I" +
    "b=Q(\"following\",function(a,b,c,d){var e=new D;do for(var f=b;f=f.n" +
    "extSibling;)Za(f,c,d)&&a.a(f)&&E(e,f),e=$a(a,f,c,d,e);while(b=b.pa" +
    "rentNode);return e},!1,!0);Q(\"following-sibling\",function(a,b){for" +
    "(var c=new D,d=b;d=d.nextSibling;)a.a(d)&&E(c,d);return c},!1);Q(\"" +
    "namespace\",function(){return new D},!1);\nvar Qb=Q(\"parent\",functio" +
    "n(a,b){var c=new D;if(9==b.nodeType)return c;if(2==b.nodeType)retu" +
    "rn E(c,b.ownerElement),c;var d=b.parentNode;a.a(d)&&E(c,d);return " +
    "c},!1),Jb=Q(\"preceding\",function(a,b,c,d){var e=new D,f=[];do f.un" +
    "shift(b);while(b=b.parentNode);for(var h=1,q=f.length;h<q;h++){var" +
    " u=[];for(b=f[h];b=b.previousSibling;)u.unshift(b);for(var n=0,m=u" +
    ".length;n<m;n++)b=u[n],Za(b,c,d)&&a.a(b)&&E(e,b),e=$a(a,b,c,d,e)}r" +
    "eturn e},!0,!0);\nQ(\"preceding-sibling\",function(a,b){for(var c=new" +
    " D,d=b;d=d.previousSibling;)a.a(d)&&fb(c,d);return c},!0);var Rb=Q" +
    "(\"self\",function(a,b){var c=new D;a.a(b)&&E(c,b);return c},!1);fun" +
    "ction Sb(a){I.call(this,1);this.c=a;this.i=a.i;this.b=a.b}v(Sb,I);" +
    "Sb.prototype.a=function(a){return-K(this.c,a)};Sb.prototype.toStri" +
    "ng=function(){return\"Unary Expression: -\"+J(this.c)};function Tb(a" +
    "){I.call(this,4);this.c=a;mb(this,sa(this.c,function(a){return a.i" +
    "}));nb(this,sa(this.c,function(a){return a.b}))}v(Tb,I);Tb.prototy" +
    "pe.a=function(a){var b=new D;w(this.c,function(c){c=c.a(a);if(!(c " +
    "instanceof D))throw Error(\"Path expression must evaluate to NodeSe" +
    "t.\");b=eb(b,c)});return b};Tb.prototype.toString=function(){return" +
    " ra(this.c,function(a,b){return a+J(b)},\"Union Expression:\")};func"
  )
      .append(
    "tion Ub(a,b){this.a=a;this.b=b}function Vb(a){for(var b,c=[];;){R(" +
    "a,\"Missing right hand side of binary expression.\");b=Wb(a);var d=A" +
    "(a.a);if(!d)break;var e=(d=tb[d]||null)&&d.H;if(!e){a.a.a--;break}" +
    "for(;c.length&&e<=c[c.length-1].H;)b=new pb(c.pop(),c.pop(),b);c.p" +
    "ush(b,d)}for(;c.length;)b=new pb(c.pop(),c.pop(),b);return b}funct" +
    "ion R(a,b){if(Ya(a.a))throw Error(b);}function Xb(a,b){var c=A(a.a" +
    ");if(c!=b)throw Error(\"Bad token, expected: \"+b+\" got: \"+c);}\nfunc" +
    "tion Yb(a){a=A(a.a);if(\")\"!=a)throw Error(\"Bad token: \"+a);}functi" +
    "on Zb(a){a=A(a.a);if(2>a.length)throw Error(\"Unclosed literal stri" +
    "ng\");return new Ab(a)}function $b(a){var b=A(a.a),c=b.indexOf(\":\")" +
    ";if(-1==c)return new Bb(b);var d=b.substring(0,c);a=a.b(d);if(!a)t" +
    "hrow Error(\"Namespace prefix not declared: \"+d);b=b.substr(c+1);re" +
    "turn new Bb(b,a)}\nfunction ac(a){var b,c=[],d;if(Hb(z(a.a))){b=A(a" +
    ".a);d=z(a.a);if(\"/\"==b&&(Ya(a.a)||\".\"!=d&&\"..\"!=d&&\"@\"!=d&&\"*\"!=d&" +
    "&!/(?![0-9])[\\w]/.test(d)))return new Fb;d=new Fb;R(a,\"Missing nex" +
    "t location step.\");b=bc(a,b);c.push(b)}else{a:{b=z(a.a);d=b.charAt" +
    "(0);switch(d){case \"$\":throw Error(\"Variable reference not allowed" +
    " in HTML XPath\");case \"(\":A(a.a);b=Vb(a);R(a,'unclosed \"(\"');Xb(a," +
    "\")\");break;case '\"':case \"'\":b=Zb(a);break;default:if(isNaN(+b))if" +
    "(!zb(b)&&/(?![0-9])[\\w]/.test(d)&&\"(\"==z(a.a,1)){b=A(a.a);\nb=yb[b]" +
    "||null;A(a.a);for(d=[];\")\"!=z(a.a);){R(a,\"Missing function argumen" +
    "t list.\");d.push(Vb(a));if(\",\"!=z(a.a))break;A(a.a)}R(a,\"Unclosed " +
    "function argument list.\");Yb(a);b=new wb(b,d)}else{b=null;break a}" +
    "else b=new Cb(+A(a.a))}\"[\"==z(a.a)&&(d=new Kb(cc(a)),b=new ub(b,d)" +
    ")}if(b)if(Hb(z(a.a)))d=b;else return b;else b=bc(a,\"/\"),d=new Gb,c" +
    ".push(b)}for(;Hb(z(a.a));)b=A(a.a),R(a,\"Missing next location step" +
    ".\"),b=bc(a,b),c.push(b);return new Db(d,c)}\nfunction bc(a,b){var c" +
    ",d,e;if(\"/\"!=b&&\"//\"!=b)throw Error('Step op should be \"/\" or \"//\"" +
    "');if(\".\"==z(a.a))return d=new P(Rb,new F(\"node\")),A(a.a),d;if(\".." +
    "\"==z(a.a))return d=new P(Qb,new F(\"node\")),A(a.a),d;var f;if(\"@\"==" +
    "z(a.a))f=Eb,A(a.a),R(a,\"Missing attribute name\");else if(\"::\"==z(a" +
    ".a,1)){if(!/(?![0-9])[\\w]/.test(z(a.a).charAt(0)))throw Error(\"Bad" +
    " token: \"+A(a.a));c=A(a.a);f=Ob[c]||null;if(!f)throw Error(\"No axi" +
    "s with name: \"+c);A(a.a);R(a,\"Missing node name\")}else f=Lb;c=z(a." +
    "a);if(/(?![0-9])[\\w]/.test(c.charAt(0)))if(\"(\"==\nz(a.a,1)){if(!zb(" +
    "c))throw Error(\"Invalid node type: \"+c);c=A(a.a);if(!zb(c))throw E" +
    "rror(\"Invalid type name: \"+c);Xb(a,\"(\");R(a,\"Bad nodetype\");e=z(a." +
    "a).charAt(0);var h=null;if('\"'==e||\"'\"==e)h=Zb(a);R(a,\"Bad nodetyp" +
    "e\");Yb(a);c=new F(c,h)}else c=$b(a);else if(\"*\"==c)c=$b(a);else th" +
    "row Error(\"Bad token: \"+A(a.a));e=new Kb(cc(a),f.a);return d||new " +
    "P(f,c,e,\"//\"==b)}\nfunction cc(a){for(var b=[];\"[\"==z(a.a);){A(a.a)" +
    ";R(a,\"Missing predicate expression.\");var c=Vb(a);b.push(c);R(a,\"U" +
    "nclosed predicate expression.\");Xb(a,\"]\")}return b}function Wb(a){" +
    "if(\"-\"==z(a.a))return A(a.a),new Sb(Wb(a));var b=ac(a);if(\"|\"!=z(a" +
    ".a))a=b;else{for(b=[b];\"|\"==A(a.a);)R(a,\"Missing next union locati" +
    "on path.\"),b.push(ac(a));a.a.a--;a=new Tb(b)}return a};function dc" +
    "(a,b){if(!a.length)throw Error(\"Empty XPath expression.\");var c=Va" +
    "(a);if(Ya(c))throw Error(\"Invalid XPath expression.\");b?da(b)||(b=" +
    "ga(b.lookupNamespaceURI,b)):b=k(null);var d=Vb(new Ub(c,b));if(!Ya" +
    "(c))throw Error(\"Bad token: \"+A(c));this.evaluate=function(a,b){va" +
    "r c=d.a(new Ta(a));return new S(c,b)}}\nfunction S(a,b){if(0==b)if(" +
    "a instanceof D)b=4;else if(\"string\"==typeof a)b=2;else if(\"number\"" +
    "==typeof a)b=1;else if(\"boolean\"==typeof a)b=3;else throw Error(\"U" +
    "nexpected evaluation result.\");if(2!=b&&1!=b&&3!=b&&!(a instanceof" +
    " D))throw Error(\"value could not be converted to the specified typ" +
    "e\");this.resultType=b;var c;switch(b){case 2:this.stringValue=a in" +
    "stanceof D?hb(a):\"\"+a;break;case 1:this.numberValue=a instanceof D" +
    "?+hb(a):+a;break;case 3:this.booleanValue=a instanceof D?0<a.s:!!a" +
    ";break;case 4:case 5:case 6:case 7:var d=\nG(a);c=[];for(var e=H(d)" +
    ";e;e=H(d))c.push(e);this.snapshotLength=a.s;this.invalidIteratorSt" +
    "ate=!1;break;case 8:case 9:this.singleNodeValue=gb(a);break;defaul" +
    "t:throw Error(\"Unknown XPathResult type.\");}var f=0;this.iterateNe" +
    "xt=function(){if(4!=b&&5!=b)throw Error(\"iterateNext called with w" +
    "rong result type\");return f>=c.length?null:c[f++]};this.snapshotIt" +
    "em=function(a){if(6!=b&&7!=b)throw Error(\"snapshotItem called with" +
    " wrong result type\");return a>=c.length||0>a?null:c[a]}}S.ANY_TYPE" +
    "=0;\nS.NUMBER_TYPE=1;S.STRING_TYPE=2;S.BOOLEAN_TYPE=3;S.UNORDERED_N" +
    "ODE_ITERATOR_TYPE=4;S.ORDERED_NODE_ITERATOR_TYPE=5;S.UNORDERED_NOD" +
    "E_SNAPSHOT_TYPE=6;S.ORDERED_NODE_SNAPSHOT_TYPE=7;S.ANY_UNORDERED_N" +
    "ODE_TYPE=8;S.FIRST_ORDERED_NODE_TYPE=9;function ec(a){this.lookupN" +
    "amespaceURI=jb(a)}\nfunction fc(a){a=a||p;var b=a.document;b.evalua" +
    "te||(a.XPathResult=S,b.evaluate=function(a,b,e,f){return(new dc(a," +
    "e)).evaluate(b,f)},b.createExpression=function(a,b){return new dc(" +
    "a,b)},b.createNSResolver=function(a){return new ec(a)})}aa(\"wgxpat" +
    "h.install\",fc);var T={};T.D=function(){var a={S:\"http://www.w3.org" +
    "/2000/svg\"};return function(b){return a[b]||null}}();\nT.u=function" +
    "(a,b,c){var d=x(a);if(!d.documentElement)return null;fc(d?d.parent" +
    "Window||d.defaultView:window);try{for(var e=d.createNSResolver?d.c" +
    "reateNSResolver(d.documentElement):T.D,f={},h=d.getElementsByTagNa" +
    "me(\"*\"),q=0;q<h.length;++q){var u=h[q],n=u.namespaceURI;if(n&&!f[n" +
    "]){var m=u.lookupPrefix(n);if(!m){var C=n.match(\".*/(\\\\w+)/?$\");C?" +
    "m=C[1]:m=\"xhtml\"}f[n]=m}}var N={},V;for(V in f)N[f[V]]=V;e=functio" +
    "n(a){return N[a]||null};try{return d.evaluate(b,a,e,c,null)}catch(" +
    "Pb){if(\"TypeError\"===Pb.name)return e=\nd.createNSResolver?d.create" +
    "NSResolver(d.documentElement):T.D,d.evaluate(b,a,e,c,null);throw P" +
    "b;}}catch(Ac){throw new Na(32,\"Unable to locate an element with th" +
    "e xpath expression \"+b+\" because of the following error:\\n\"+Ac);}}" +
    ";T.F=function(a,b){if(!a||1!=a.nodeType)throw new Na(32,'The resul" +
    "t of the xpath expression \"'+b+'\" is: '+a+\". It should be an eleme" +
    "nt.\");};\nT.K=function(a,b){var c=function(){var c=T.u(b,a,9);retur" +
    "n c?c.singleNodeValue||null:b.selectSingleNode?(c=x(b),c.setProper" +
    "ty&&c.setProperty(\"SelectionLanguage\",\"XPath\"),b.selectSingleNode(" +
    "a)):null}();null===c||T.F(c,a);return c};\nT.P=function(a,b){var c=" +
    "function(){var c=T.u(b,a,7);if(c){for(var e=c.snapshotLength,f=[]," +
    "h=0;h<e;++h)f.push(c.snapshotItem(h));return f}return b.selectNode" +
    "s?(c=x(b),c.setProperty&&c.setProperty(\"SelectionLanguage\",\"XPath\"" +
    "),b.selectNodes(a)):[]}();w(c,function(b){T.F(b,a)});return c};var" +
    " gc={aliceblue:\"#f0f8ff\",antiquewhite:\"#faebd7\",aqua:\"#00ffff\",aqu" +
    "amarine:\"#7fffd4\",azure:\"#f0ffff\",beige:\"#f5f5dc\",bisque:\"#ffe4c4\"" +
    ",black:\"#000000\",blanchedalmond:\"#ffebcd\",blue:\"#0000ff\",blueviole" +
    "t:\"#8a2be2\",brown:\"#a52a2a\",burlywood:\"#deb887\",cadetblue:\"#5f9ea0" +
    "\",chartreuse:\"#7fff00\",chocolate:\"#d2691e\",coral:\"#ff7f50\",cornflo" +
    "werblue:\"#6495ed\",cornsilk:\"#fff8dc\",crimson:\"#dc143c\",cyan:\"#00ff" +
    "ff\",darkblue:\"#00008b\",darkcyan:\"#008b8b\",darkgoldenrod:\"#b8860b\"," +
    "darkgray:\"#a9a9a9\",darkgreen:\"#006400\",\ndarkgrey:\"#a9a9a9\",darkkha" +
    "ki:\"#bdb76b\",darkmagenta:\"#8b008b\",darkolivegreen:\"#556b2f\",darkor" +
    "ange:\"#ff8c00\",darkorchid:\"#9932cc\",darkred:\"#8b0000\",darksalmon:\"" +
    "#e9967a\",darkseagreen:\"#8fbc8f\",darkslateblue:\"#483d8b\",darkslateg" +
    "ray:\"#2f4f4f\",darkslategrey:\"#2f4f4f\",darkturquoise:\"#00ced1\",dark" +
    "violet:\"#9400d3\",deeppink:\"#ff1493\",deepskyblue:\"#00bfff\",dimgray:" +
    "\"#696969\",dimgrey:\"#696969\",dodgerblue:\"#1e90ff\",firebrick:\"#b2222" +
    "2\",floralwhite:\"#fffaf0\",forestgreen:\"#228b22\",fuchsia:\"#ff00ff\",g" +
    "ainsboro:\"#dcdcdc\",\nghostwhite:\"#f8f8ff\",gold:\"#ffd700\",goldenrod:" +
    "\"#daa520\",gray:\"#808080\",green:\"#008000\",greenyellow:\"#adff2f\",gre" +
    "y:\"#808080\",honeydew:\"#f0fff0\",hotpink:\"#ff69b4\",indianred:\"#cd5c5" +
    "c\",indigo:\"#4b0082\",ivory:\"#fffff0\",khaki:\"#f0e68c\",lavender:\"#e6e" +
    "6fa\",lavenderblush:\"#fff0f5\",lawngreen:\"#7cfc00\",lemonchiffon:\"#ff" +
    "facd\",lightblue:\"#add8e6\",lightcoral:\"#f08080\",lightcyan:\"#e0ffff\"" +
    ",lightgoldenrodyellow:\"#fafad2\",lightgray:\"#d3d3d3\",lightgreen:\"#9" +
    "0ee90\",lightgrey:\"#d3d3d3\",lightpink:\"#ffb6c1\",lightsalmon:\"#ffa07" +
    "a\",\nlightseagreen:\"#20b2aa\",lightskyblue:\"#87cefa\",lightslategray:" +
    "\"#778899\",lightslategrey:\"#778899\",lightsteelblue:\"#b0c4de\",lighty" +
    "ellow:\"#ffffe0\",lime:\"#00ff00\",limegreen:\"#32cd32\",linen:\"#faf0e6\"" +
    ",magenta:\"#ff00ff\",maroon:\"#800000\",mediumaquamarine:\"#66cdaa\",med" +
    "iumblue:\"#0000cd\",mediumorchid:\"#ba55d3\",mediumpurple:\"#9370db\",me" +
    "diumseagreen:\"#3cb371\",mediumslateblue:\"#7b68ee\",mediumspringgreen" +
    ":\"#00fa9a\",mediumturquoise:\"#48d1cc\",mediumvioletred:\"#c71585\",mid" +
    "nightblue:\"#191970\",mintcream:\"#f5fffa\",mistyrose:\"#ffe4e1\",\nmocca" +
    "sin:\"#ffe4b5\",navajowhite:\"#ffdead\",navy:\"#000080\",oldlace:\"#fdf5e" +
    "6\",olive:\"#808000\",olivedrab:\"#6b8e23\",orange:\"#ffa500\",orangered:" +
    "\"#ff4500\",orchid:\"#da70d6\",palegoldenrod:\"#eee8aa\",palegreen:\"#98f" +
    "b98\",paleturquoise:\"#afeeee\",palevioletred:\"#db7093\",papayawhip:\"#" +
    "ffefd5\",peachpuff:\"#ffdab9\",peru:\"#cd853f\",pink:\"#ffc0cb\",plum:\"#d" +
    "da0dd\",powderblue:\"#b0e0e6\",purple:\"#800080\",red:\"#ff0000\",rosybro" +
    "wn:\"#bc8f8f\",royalblue:\"#4169e1\",saddlebrown:\"#8b4513\",salmon:\"#fa" +
    "8072\",sandybrown:\"#f4a460\",seagreen:\"#2e8b57\",\nseashell:\"#fff5ee\"," +
    "sienna:\"#a0522d\",silver:\"#c0c0c0\",skyblue:\"#87ceeb\",slateblue:\"#6a" +
    "5acd\",slategray:\"#708090\",slategrey:\"#708090\",snow:\"#fffafa\",sprin" +
    "ggreen:\"#00ff7f\",steelblue:\"#4682b4\",tan:\"#d2b48c\",teal:\"#008080\"," +
    "thistle:\"#d8bfd8\",tomato:\"#ff6347\",turquoise:\"#40e0d0\",violet:\"#ee" +
    "82ee\",wheat:\"#f5deb3\",white:\"#ffffff\",whitesmoke:\"#f5f5f5\",yellow:" +
    "\"#ffff00\",yellowgreen:\"#9acd32\"};var hc=\"backgroundColor borderTop" +
    "Color borderRightColor borderBottomColor borderLeftColor color out" +
    "lineColor\".split(\" \"),ic=/#([0-9a-fA-F])([0-9a-fA-F])([0-9a-fA-F])" +
    "/,jc=/^#(?:[0-9a-f]{3}){1,2}$/i,kc=/^(?:rgba)?\\((\\d{1,3}),\\s?(\\d{1" +
    ",3}),\\s?(\\d{1,3}),\\s?(0|1|0\\.\\d*)\\)$/i,lc=/^(?:rgb)?\\((0|[1-9]\\d{0" +
    ",2}),\\s?(0|[1-9]\\d{0,2}),\\s?(0|[1-9]\\d{0,2})\\)$/i;function U(a,b){" +
    "return!!a&&1==a.nodeType&&(!b||a.tagName.toUpperCase()==b)}var mc=" +
    "\"BUTTON INPUT OPTGROUP OPTION SELECT TEXTAREA\".split(\" \");\nfunctio" +
    "n nc(a){var b=a.tagName.toUpperCase();return 0<=qa(mc,b)?a.disable" +
    "d?!1:a.parentNode&&1==a.parentNode.nodeType&&\"OPTGROUP\"==b||\"OPTIO" +
    "N\"==b?nc(a.parentNode):!Ia(a,function(a){var b=a.parentNode;if(b&&" +
    "U(b,\"FIELDSET\")&&b.disabled){if(!U(a,\"LEGEND\"))return!0;for(;a=r(a" +
    ".previousElementSibling)?a.previousElementSibling:Da(a.previousSib" +
    "ling);)if(U(a,\"LEGEND\"))return!0}return!1},!0):!0}var oc=\"text sea" +
    "rch tel url email password number\".split(\" \");\nfunction pc(a){func" +
    "tion b(a){return\"inherit\"==a.contentEditable?(a=qc(a))?b(a):!1:\"tr" +
    "ue\"==a.contentEditable}return r(a.contentEditable)?r(a.isContentEd" +
    "itable)?a.isContentEditable:b(a):!1}function qc(a){for(a=a.parentN" +
    "ode;a&&1!=a.nodeType&&9!=a.nodeType&&11!=a.nodeType;)a=a.parentNod" +
    "e;return U(a)?a:null}\nfunction W(a,b){var c=ma(b);if(\"float\"==c||\"" +
    "cssFloat\"==c||\"styleFloat\"==c)c=\"cssFloat\";var d;a:{d=c;var e=x(a)" +
    ";if(e.defaultView&&e.defaultView.getComputedStyle&&(e=e.defaultVie" +
    "w.getComputedStyle(a,null))){d=e[d]||e.getPropertyValue(d)||\"\";bre" +
    "ak a}d=\"\"}d=d||rc(a,c);if(null===d)d=null;else if(0<=qa(hc,c)){b:{" +
    "var f=d.match(kc);if(f){var c=Number(f[1]),e=Number(f[2]),h=Number" +
    "(f[3]),f=Number(f[4]);if(0<=c&&255>=c&&0<=e&&255>=e&&0<=h&&255>=h&" +
    "&0<=f&&1>=f){c=[c,e,h,f];break b}}c=null}if(!c)b:{if(h=d.match(lc)" +
    ")if(c=\nNumber(h[1]),e=Number(h[2]),h=Number(h[3]),0<=c&&255>=c&&0<" +
    "=e&&255>=e&&0<=h&&255>=h){c=[c,e,h,1];break b}c=null}if(!c)b:{c=d." +
    "toLowerCase();e=gc[c.toLowerCase()];if(!e&&(e=\"#\"==c.charAt(0)?c:\"" +
    "#\"+c,4==e.length&&(e=e.replace(ic,\"#$1$1$2$2$3$3\")),!jc.test(e))){" +
    "c=null;break b}c=[parseInt(e.substr(1,2),16),parseInt(e.substr(3,2" +
    "),16),parseInt(e.substr(5,2),16),1]}d=c?\"rgba(\"+c.join(\", \")+\")\":d" +
    "}return d}\nfunction rc(a,b){var c=a.currentStyle||a.style,d=c[b];!" +
    "r(d)&&da(c.getPropertyValue)&&(d=c.getPropertyValue(b));return\"inh" +
    "erit\"!=d?r(d)?d:null:(c=qc(a))?rc(c,b):null}\nfunction sc(a,b,c){fu" +
    "nction d(a){var b=tc(a);return 0<b.height&&0<b.width?!0:U(a,\"PATH\"" +
    ")&&(0<b.height||0<b.width)?(a=W(a,\"stroke-width\"),!!a&&0<parseInt(" +
    "a,10)):\"hidden\"!=W(a,\"overflow\")&&sa(a.childNodes,function(a){retu" +
    "rn 3==a.nodeType||U(a)&&d(a)})}function e(a){return\"hidden\"==uc(a)" +
    "&&ta(a.childNodes,function(a){return!U(a)||e(a)||!d(a)})}if(!U(a))" +
    "throw Error(\"Argument to isShown must be of type Element\");if(U(a," +
    "\"BODY\"))return!0;if(U(a,\"OPTION\")||U(a,\"OPTGROUP\"))return a=Ia(a,f" +
    "unction(a){return U(a,\n\"SELECT\")}),!!a&&sc(a,!0,c);var f=vc(a);if(" +
    "f)return!!f.G&&0<f.rect.width&&0<f.rect.height&&sc(f.G,b,c);if(U(a" +
    ",\"INPUT\")&&\"hidden\"==a.type.toLowerCase()||U(a,\"NOSCRIPT\"))return!" +
    "1;f=W(a,\"visibility\");return\"collapse\"!=f&&\"hidden\"!=f&&c(a)&&(b||" +
    "0!=wc(a))&&d(a)?!e(a):!1}function xc(a){function b(a){if(\"none\"==W" +
    "(a,\"display\"))return!1;a=qc(a);return!a||b(a)}return sc(a,!0,b)}\nf" +
    "unction uc(a){function b(a){function b(a){return a==h?!0:0==W(a,\"d" +
    "isplay\").lastIndexOf(\"inline\",0)||\"absolute\"==c&&\"static\"==W(a,\"po" +
    "sition\")?!1:!0}var c=W(a,\"position\");if(\"fixed\"==c)return n=!0,a==" +
    "h?null:h;for(a=qc(a);a&&!b(a);)a=qc(a);return a}function c(a){var " +
    "b=a;if(\"visible\"==u)if(a==h&&q)b=q;else if(a==q)return{x:\"visible\"" +
    ",y:\"visible\"};b={x:W(b,\"overflow-x\"),y:W(b,\"overflow-y\")};a==h&&(b" +
    ".x=\"visible\"==b.x?\"auto\":b.x,b.y=\"visible\"==b.y?\"auto\":b.y);return" +
    " b}function d(a){if(a==h){var b=(new Ka(f)).a;\na=b.scrollingElemen" +
    "t?b.scrollingElement:b.body||b.documentElement;b=b.parentWindow||b" +
    ".defaultView;a=new wa(b.pageXOffset||a.scrollLeft,b.pageYOffset||a" +
    ".scrollTop)}else a=new wa(a.scrollLeft,a.scrollTop);return a}var e" +
    "=yc(a),f=x(a),h=f.documentElement,q=f.body,u=W(h,\"overflow\"),n;for" +
    "(a=b(a);a;a=b(a)){var m=c(a);if(\"visible\"!=m.x||\"visible\"!=m.y){va" +
    "r C=tc(a);if(0==C.width||0==C.height)return\"hidden\";var N=e.right<" +
    "C.left,V=e.bottom<C.top;if(N&&\"hidden\"==m.x||V&&\"hidden\"==m.y)retu" +
    "rn\"hidden\";if(N&&\"visible\"!=\nm.x||V&&\"visible\"!=m.y){N=d(a);V=e.bo" +
    "ttom<C.top-N.y;if(e.right<C.left-N.x&&\"visible\"!=m.x||V&&\"visible\"" +
    "!=m.x)return\"hidden\";e=uc(a);return\"hidden\"==e?\"hidden\":\"scroll\"}N" +
    "=e.left>=C.left+C.width;C=e.top>=C.top+C.height;if(N&&\"hidden\"==m." +
    "x||C&&\"hidden\"==m.y)return\"hidden\";if(N&&\"visible\"!=m.x||C&&\"visib" +
    "le\"!=m.y){if(n&&(m=d(a),e.left>=h.scrollWidth-m.x||e.right>=h.scro" +
    "llHeight-m.y))return\"hidden\";e=uc(a);return\"hidden\"==e?\"hidden\":\"s" +
    "croll\"}}}return\"none\"}\nfunction tc(a){var b=vc(a);if(b)return b.re" +
    "ct;if(U(a,\"HTML\"))return a=x(a),a=((a?a.parentWindow||a.defaultVie" +
    "w:window)||window).document,a=\"CSS1Compat\"==a.compatMode?a.documen" +
    "tElement:a.body,a=new xa(a.clientWidth,a.clientHeight),new y(0,0,a" +
    ".width,a.height);var c;try{c=a.getBoundingClientRect()}catch(d){re" +
    "turn new y(0,0,0,0)}return new y(c.left,c.top,c.right-c.left,c.bot" +
    "tom-c.top)}\nfunction vc(a){var b=U(a,\"MAP\");if(!b&&!U(a,\"AREA\"))re" +
    "turn null;var c=b?a:U(a.parentNode,\"MAP\")?a.parentNode:null,d=null" +
    ",e=null;if(c&&c.name&&(d=x(c),d=T.K('/descendant::*[@usemap = \"#'+" +
    "c.name+'\"]',d))&&(e=tc(d),!b&&\"default\"!=a.shape.toLowerCase())){v" +
    "ar f=zc(a);a=Math.min(Math.max(f.left,0),e.width);b=Math.min(Math." +
    "max(f.top,0),e.height);c=Math.min(f.width,e.width-a);f=Math.min(f." +
    "height,e.height-b);e=new y(a+e.left,b+e.top,c,f)}return{G:d,rect:e" +
    "||new y(0,0,0,0)}}\nfunction zc(a){var b=a.shape.toLowerCase();a=a." +
    "coords.split(\",\");if(\"rect\"==b&&4==a.length){var b=a[0],c=a[1];ret" +
    "urn new y(b,c,a[2]-b,a[3]-c)}if(\"circle\"==b&&3==a.length)return b=" +
    "a[2],new y(a[0]-b,a[1]-b,2*b,2*b);if(\"poly\"==b&&2<a.length){for(va" +
    "r b=a[0],c=a[1],d=b,e=c,f=2;f+1<a.length;f+=2)b=Math.min(b,a[f]),d" +
    "=Math.max(d,a[f]),c=Math.min(c,a[f+1]),e=Math.max(e,a[f+1]);return" +
    " new y(b,c,d-b,e-c)}return new y(0,0,0,0)}function yc(a){a=tc(a);r" +
    "eturn new La(a.top,a.left+a.width,a.top+a.height,a.left)}\nfunction" +
    " wc(a){var b=1,c=W(a,\"opacity\");c&&(b=Number(c));(a=qc(a))&&(b*=wc" +
    "(a));return b};function Bc(){this.a=Ma.document.documentElement;th" +
    "is.b=null;var a=Ja(x(this.a));a&&Cc(this,a)}function Cc(a,b){a.a=b" +
    ";U(b,\"OPTION\")?a.b=Ia(b,function(a){return U(a,\"SELECT\")}):a.b=nul" +
    "l};Qa(4);function Dc(a,b,c){this.a=a;this.b=b;this.h=c}Dc.prototyp" +
    "e.toString=g(\"a\");var Ec=new Dc(\"change\",!0,!1);var Fc=\"StopIterat" +
    "ion\"in p?p.StopIteration:{message:\"StopIteration\",stack:\"\"};functi" +
    "on Gc(){}Gc.prototype.a=function(){throw Fc;};Gc.prototype.J=funct" +
    "ion(){return this};function Hc(a,b){this.v={};this.l=[];this.b=thi" +
    "s.a=0;var c=arguments.length;if(1<c){if(c%2)throw Error(\"Uneven nu" +
    "mber of arguments\");for(var d=0;d<c;d+=2)X(this,arguments[d],argum" +
    "ents[d+1])}else if(a){var e;if(a instanceof Hc)for(d=Ic(a),Jc(a),e" +
    "=[],c=0;c<a.l.length;c++)e.push(a.v[a.l[c]]);else{var c=[],f=0;for" +
    "(d in a)c[f++]=d;d=c;c=[];f=0;for(e in a)c[f++]=a[e];e=c}for(c=0;c" +
    "<d.length;c++)X(this,d[c],e[c])}}function Ic(a){Jc(a);return a.l.c" +
    "oncat()}l=Hc.prototype;\nl.clear=function(){this.v={};this.b=this.a" +
    "=this.l.length=0};function Jc(a){if(a.a!=a.l.length){for(var b=0,c" +
    "=0;b<a.l.length;){var d=a.l[b];Object.prototype.hasOwnProperty.cal" +
    "l(a.v,d)&&(a.l[c++]=d);b++}a.l.length=c}if(a.a!=a.l.length){for(va" +
    "r e={},c=b=0;b<a.l.length;)d=a.l[b],Object.prototype.hasOwnPropert" +
    "y.call(e,d)||(a.l[c++]=d,e[d]=1),b++;a.l.length=c}}l.get=function(" +
    "a,b){return Object.prototype.hasOwnProperty.call(this.v,a)?this.v[" +
    "a]:b};\nfunction X(a,b,c){Object.prototype.hasOwnProperty.call(a.v," +
    "b)||(a.a++,a.l.push(b),a.b++);a.v[b]=c}l.forEach=function(a,b){for" +
    "(var c=Ic(this),d=0;d<c.length;d++){var e=c[d],f=this.get(e);a.cal" +
    "l(b,f,e,this)}};l.clone=function(){return new Hc(this)};l.J=functi" +
    "on(a){Jc(this);var b=0,c=this.b,d=this,e=new Gc;e.a=function(){if(" +
    "c!=d.b)throw Error(\"The map has changed since the iterator was cre" +
    "ated\");if(b>=d.l.length)throw Fc;var e=d.l[b++];return a?e:d.v[e]}" +
    ";return e};var Kc={};function Y(a,b,c){var d=typeof a;(\"object\"==d" +
    "&&null!=a||\"function\"==d)&&(a=a.f);a=new Lc(a);!b||b in Kc&&!c||(K" +
    "c[b]={key:a,shift:!1},c&&(Kc[c]={key:a,shift:!0}));return a}functi" +
    "on Lc(a){this.code=a}Y(8);Y(9);Y(13);var Mc=Y(16),Nc=Y(17),Oc=Y(18" +
    ");Y(19);Y(20);Y(27);Y(32,\" \");Y(33);Y(34);Y(35);Y(36);Y(37);Y(38);" +
    "Y(39);Y(40);Y(44);Y(45);Y(46);Y(48,\"0\",\")\");Y(49,\"1\",\"!\");Y(50,\"2\"" +
    ",\"@\");Y(51,\"3\",\"#\");Y(52,\"4\",\"$\");Y(53,\"5\",\"%\");Y(54,\"6\",\"^\");Y(55" +
    ",\"7\",\"&\");Y(56,\"8\",\"*\");Y(57,\"9\",\"(\");Y(65,\"a\",\"A\");\nY(66,\"b\",\"B\")" +
    ";Y(67,\"c\",\"C\");Y(68,\"d\",\"D\");Y(69,\"e\",\"E\");Y(70,\"f\",\"F\");Y(71,\"g\"," +
    "\"G\");Y(72,\"h\",\"H\");Y(73,\"i\",\"I\");Y(74,\"j\",\"J\");Y(75,\"k\",\"K\");Y(76," +
    "\"l\",\"L\");Y(77,\"m\",\"M\");Y(78,\"n\",\"N\");Y(79,\"o\",\"O\");Y(80,\"p\",\"P\");Y" +
    "(81,\"q\",\"Q\");Y(82,\"r\",\"R\");Y(83,\"s\",\"S\");Y(84,\"t\",\"T\");Y(85,\"u\",\"U" +
    "\");Y(86,\"v\",\"V\");Y(87,\"w\",\"W\");Y(88,\"x\",\"X\");Y(89,\"y\",\"Y\");Y(90,\"z" +
    "\",\"Z\");var Pc=Y(Ca?{g:91,f:91}:Ba?{g:224,f:91}:{g:0,f:91});Y(Ca?{g" +
    ":92,f:92}:Ba?{g:224,f:93}:{g:0,f:92});Y(Ca?{g:93,f:93}:Ba?{g:0,f:0" +
    "}:{g:93,f:null});\nY({g:96,f:96},\"0\");Y({g:97,f:97},\"1\");Y({g:98,f:" +
    "98},\"2\");Y({g:99,f:99},\"3\");Y({g:100,f:100},\"4\");Y({g:101,f:101},\"" +
    "5\");Y({g:102,f:102},\"6\");Y({g:103,f:103},\"7\");Y({g:104,f:104},\"8\")" +
    ";Y({g:105,f:105},\"9\");Y({g:106,f:106},\"*\");Y({g:107,f:107},\"+\");Y(" +
    "{g:109,f:109},\"-\");Y({g:110,f:110},\".\");Y({g:111,f:111},\"/\");Y(144" +
    ");Y(112);Y(113);Y(114);Y(115);Y(116);Y(117);Y(118);Y(119);Y(120);Y" +
    "(121);Y(122);Y(123);Y({g:107,f:187},\"=\",\"+\");Y(108,\",\");Y({g:109,f" +
    ":189},\"-\",\"_\");Y(188,\",\",\"<\");Y(190,\".\",\">\");Y(191,\"/\",\"?\");\nY(192" +
    ",\"`\",\"~\");Y(219,\"[\",\"{\");Y(220,\"\\\\\",\"|\");Y(221,\"]\",\"}\");Y({g:59,f:" +
    "186},\";\",\":\");Y(222,\"'\",'\"');var Qc=new Hc;X(Qc,1,Mc);X(Qc,2,Nc);X" +
    "(Qc,4,Oc);X(Qc,8,Pc);(function(a){var b=new Hc;w(Ic(a),function(c)" +
    "{X(b,a.get(c).code,c)});return b})(Qc);function Z(){Bc.call(this)}" +
    "v(Z,Bc);Z.i=function(){return Z.a?Z.a:Z.a=new Z};aa(\"_\",function(a" +
    "){if(!xc(a)||!nc(a)||\"none\"==W(a,\"pointer-events\"))throw new Na(12" +
    ",\"Element is not currently interactable and may not be manipulated" +
    "\");var b;(b=!(U(a,\"TEXTAREA\")||(U(a,\"INPUT\")?0<=qa(oc,a.type.toLow" +
    "erCase()):pc(a)))&&!(U(a,\"INPUT\")&&\"file\"==a.type.toLowerCase()))|" +
    "|(b=a.readOnly);if(b)throw new Na(12,\"Element must be user-editabl" +
    "e in order to clear it.\");b=Z.i();Cc(b,a);b=b.b||b.a;var c=Ja(x(b)" +
    ");if(b!=c){if(c&&da(c.blur)&&!U(c,\"BODY\"))try{c.blur()}catch(d){th" +
    "row d;}da(b.focus)&&b.focus()}a.value&&\n(a.value=\"\",b=x(a).createE" +
    "vent(\"HTMLEvents\"),b.initEvent(Ec.a,Ec.b,Ec.h),\"isTrusted\"in b||(b" +
    ".isTrusted=!1),a.dispatchEvent(b));pc(a)&&(a.innerHTML=\" \")});;ret" +
    "urn this._.apply(null,arguments);}).apply({navigator:typeof window" +
    "!=\"undefined\"?window.navigator:null},arguments);}\n"
  )
  .toString();
  static final String CLEAR_ANDROID_license =
    "\n\n Copyright 2014 Software Freedom Conservancy\n\n Licensed under th" +
    "e Apache License, Version 2.0 (the \"License\");\n you may not use th" +
    "is file except in compliance with the License.\n You may obtain a c" +
    "opy of the License at\n\n      http://www.apache.org/licenses/LICENS" +
    "E-2.0\n\n Unless required by applicable law or agreed to in writing," +
    " software\n distributed under the License is distributed on an \"AS " +
    "IS\" BASIS,\n WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either e" +
    "xpress or implied.\n See the License for the specific language gove" +
    "rning permissions and\n limitations under the License.\n";
  private static final String CLEAR_ANDROID_original() {
    return CLEAR_ANDROID.replaceAll("xxx_rpl_lic", CLEAR_ANDROID_license);
  }

/* field: CLICK_ANDROID license: 

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
  static final String CLICK_ANDROID =
  new StringBuilder(
    "function(){return(function(){function g(a){return function(){retur" +
    "n this[a]}}function aa(a){return function(){return a}}var l,ba=thi" +
    "s;function p(a){return void 0!==a}function ca(a,b){var c=a.split(\"" +
    ".\"),d=ba;c[0]in d||!d.execScript||d.execScript(\"var \"+c[0]);for(va" +
    "r e;c.length&&(e=c.shift());)!c.length&&p(b)?d[e]=b:d[e]?d=d[e]:d=" +
    "d[e]={}}\nfunction da(a){var b=typeof a;if(\"object\"==b)if(a){if(a i" +
    "nstanceof Array)return\"array\";if(a instanceof Object)return b;var " +
    "c=Object.prototype.toString.call(a);if(\"[object Window]\"==c)return" +
    "\"object\";if(\"[object Array]\"==c||\"number\"==typeof a.length&&\"undef" +
    "ined\"!=typeof a.splice&&\"undefined\"!=typeof a.propertyIsEnumerable" +
    "&&!a.propertyIsEnumerable(\"splice\"))return\"array\";if(\"[object Func" +
    "tion]\"==c||\"undefined\"!=typeof a.call&&\"undefined\"!=typeof a.prope" +
    "rtyIsEnumerable&&!a.propertyIsEnumerable(\"call\"))return\"function\"}" +
    "else return\"null\";\nelse if(\"function\"==b&&\"undefined\"==typeof a.ca" +
    "ll)return\"object\";return b}function q(a){return\"string\"==typeof a}" +
    "function ea(a){return\"number\"==typeof a}function fa(a){return\"func" +
    "tion\"==da(a)}function ga(a,b,c){return a.call.apply(a.bind,argumen" +
    "ts)}\nfunction ha(a,b,c){if(!a)throw Error();if(2<arguments.length)" +
    "{var d=Array.prototype.slice.call(arguments,2);return function(){v" +
    "ar c=Array.prototype.slice.call(arguments);Array.prototype.unshift" +
    ".apply(c,d);return a.apply(b,c)}}return function(){return a.apply(" +
    "b,arguments)}}function ia(a,b,c){ia=Function.prototype.bind&&-1!=F" +
    "unction.prototype.bind.toString().indexOf(\"native code\")?ga:ha;ret" +
    "urn ia.apply(null,arguments)}\nfunction ja(a,b){var c=Array.prototy" +
    "pe.slice.call(arguments,1);return function(){var b=c.slice();b.pus" +
    "h.apply(b,arguments);return a.apply(this,b)}}function r(a,b){funct" +
    "ion c(){}c.prototype=b.prototype;a.R=b.prototype;a.prototype=new c" +
    ";a.prototype.constructor=a;a.O=function(a,c,f){for(var h=Array(arg" +
    "uments.length-2),k=2;k<arguments.length;k++)h[k-2]=arguments[k];re" +
    "turn b.prototype[c].apply(a,h)}};function ka(a){if(Error.captureSt" +
    "ackTrace)Error.captureStackTrace(this,ka);else{var b=Error().stack" +
    ";b&&(this.stack=b)}a&&(this.message=String(a))}r(ka,Error);ka.prot" +
    "otype.name=\"CustomError\";function la(a,b){for(var c=a.split(\"%s\")," +
    "d=\"\",e=Array.prototype.slice.call(arguments,1);e.length&&1<c.lengt" +
    "h;)d+=c.shift()+e.shift();return d+c.join(\"%s\")}var ma=String.prot" +
    "otype.trim?function(a){return a.trim()}:function(a){return a.repla" +
    "ce(/^[\\s\\xa0]+|[\\s\\xa0]+$/g,\"\")};function na(a,b){return a<b?-1:a>" +
    "b?1:0}function pa(a){return String(a).replace(/\\-([a-z])/g,functio" +
    "n(a,c){return c.toUpperCase()})};function qa(a,b){b.unshift(a);ka." +
    "call(this,la.apply(null,b));b.shift()}r(qa,ka);qa.prototype.name=\"" +
    "AssertionError\";function ra(a,b,c){if(!a){var d=\"Assertion failed\"" +
    ";if(b)var d=d+(\": \"+b),e=Array.prototype.slice.call(arguments,2);t" +
    "hrow new qa(\"\"+d,e||[]);}};var sa=Array.prototype;function ta(a,b)" +
    "{if(q(a))return q(b)&&1==b.length?a.indexOf(b,0):-1;for(var c=0;c<" +
    "a.length;c++)if(c in a&&a[c]===b)return c;return-1}function t(a,b)" +
    "{for(var c=a.length,d=q(a)?a.split(\"\"):a,e=0;e<c;e++)e in d&&b.cal" +
    "l(void 0,d[e],e,a)}function ua(a,b,c){var d=c;t(a,function(c,f){d=" +
    "b.call(void 0,d,c,f,a)});return d}function va(a,b){for(var c=a.len" +
    "gth,d=q(a)?a.split(\"\"):a,e=0;e<c;e++)if(e in d&&b.call(void 0,d[e]" +
    ",e,a))return!0;return!1}\nfunction wa(a,b){for(var c=a.length,d=q(a" +
    ")?a.split(\"\"):a,e=0;e<c;e++)if(e in d&&!b.call(void 0,d[e],e,a))re" +
    "turn!1;return!0}function xa(a){return sa.concat.apply(sa,arguments" +
    ")}function ya(a,b,c){ra(null!=a.length);return 2>=arguments.length" +
    "?sa.slice.call(a,b):sa.slice.call(a,b,c)};function za(a,b,c){retur" +
    "n Math.min(Math.max(a,b),c)};function v(a,b){this.x=p(a)?a:0;this." +
    "y=p(b)?b:0}l=v.prototype;l.clone=function(){return new v(this.x,th" +
    "is.y)};l.toString=function(){return\"(\"+this.x+\", \"+this.y+\")\"};l.c" +
    "eil=function(){this.x=Math.ceil(this.x);this.y=Math.ceil(this.y);r" +
    "eturn this};l.floor=function(){this.x=Math.floor(this.x);this.y=Ma" +
    "th.floor(this.y);return this};l.round=function(){this.x=Math.round" +
    "(this.x);this.y=Math.round(this.y);return this};l.scale=function(a" +
    ",b){var c=ea(b)?b:a;this.x*=a;this.y*=c;return this};function Aa(a" +
    ",b){this.x=a;this.y=b}r(Aa,v);Aa.prototype.clone=function(){return" +
    " new Aa(this.x,this.y)};Aa.prototype.scale=v.prototype.scale;Aa.pr" +
    "ototype.rotate=function(a){var b=Math.cos(a);a=Math.sin(a);var c=t" +
    "his.y*b+this.x*a;this.x=this.x*b-this.y*a;this.y=c;return this};fu" +
    "nction Ba(a,b){this.width=a;this.height=b}l=Ba.prototype;l.clone=f" +
    "unction(){return new Ba(this.width,this.height)};l.toString=functi" +
    "on(){return\"(\"+this.width+\" x \"+this.height+\")\"};l.ceil=function()" +
    "{this.width=Math.ceil(this.width);this.height=Math.ceil(this.heigh" +
    "t);return this};l.floor=function(){this.width=Math.floor(this.widt" +
    "h);this.height=Math.floor(this.height);return this};l.round=functi" +
    "on(){this.width=Math.round(this.width);this.height=Math.round(this" +
    ".height);return this};\nl.scale=function(a,b){var c=ea(b)?b:a;this." +
    "width*=a;this.height*=c;return this};var Ca;a:{var Da=ba.navigator" +
    ";if(Da){var Ea=Da.userAgent;if(Ea){Ca=Ea;break a}}Ca=\"\"};var Fa=-1" +
    "!=Ca.indexOf(\"Macintosh\"),Ga=-1!=Ca.indexOf(\"Windows\");function Ha" +
    "(a){return a?a.parentWindow||a.defaultView:window}function Ia(a){f" +
    "or(;a&&1!=a.nodeType;)a=a.previousSibling;return a}function Ja(a,b" +
    "){if(a.contains&&1==b.nodeType)return a==b||a.contains(b);if(\"unde" +
    "fined\"!=typeof a.compareDocumentPosition)return a==b||Boolean(a.co" +
    "mpareDocumentPosition(b)&16);for(;b&&a!=b;)b=b.parentNode;return b" +
    "==a}\nfunction Ka(a,b){if(a==b)return 0;if(a.compareDocumentPositio" +
    "n)return a.compareDocumentPosition(b)&2?1:-1;if(\"sourceIndex\"in a|" +
    "|a.parentNode&&\"sourceIndex\"in a.parentNode){var c=1==a.nodeType,d" +
    "=1==b.nodeType;if(c&&d)return a.sourceIndex-b.sourceIndex;var e=a." +
    "parentNode,f=b.parentNode;return e==f?La(a,b):!c&&Ja(e,b)?-1*Ma(a," +
    "b):!d&&Ja(f,a)?Ma(b,a):(c?a.sourceIndex:e.sourceIndex)-(d?b.source" +
    "Index:f.sourceIndex)}d=x(a);c=d.createRange();c.selectNode(a);c.co" +
    "llapse(!0);d=d.createRange();d.selectNode(b);\nd.collapse(!0);retur" +
    "n c.compareBoundaryPoints(ba.Range.START_TO_END,d)}function Ma(a,b" +
    "){var c=a.parentNode;if(c==b)return-1;for(var d=b;d.parentNode!=c;" +
    ")d=d.parentNode;return La(d,a)}function La(a,b){for(var c=b;c=c.pr" +
    "eviousSibling;)if(c==a)return-1;return 1}function x(a){ra(a,\"Node " +
    "cannot be null or undefined.\");return 9==a.nodeType?a:a.ownerDocum" +
    "ent||a.document}function Na(a,b,c){c||(a=a.parentNode);for(c=0;a;)" +
    "{ra(\"parentNode\"!=a.name);if(b(a))return a;a=a.parentNode;c++}retu" +
    "rn null}\nfunction Oa(a){try{return a&&a.activeElement}catch(b){}re" +
    "turn null}function Pa(a){this.a=a||ba.document||document}Pa.protot" +
    "ype.contains=Ja;function Qa(a,b,c,d){this.top=a;this.right=b;this." +
    "bottom=c;this.left=d}l=Qa.prototype;l.clone=function(){return new " +
    "Qa(this.top,this.right,this.bottom,this.left)};l.toString=function" +
    "(){return\"(\"+this.top+\"t, \"+this.right+\"r, \"+this.bottom+\"b, \"+thi" +
    "s.left+\"l)\"};l.contains=function(a){return this&&a?a instanceof Qa" +
    "?a.left>=this.left&&a.right<=this.right&&a.top>=this.top&&a.bottom" +
    "<=this.bottom:a.x>=this.left&&a.x<=this.right&&a.y>=this.top&&a.y<" +
    "=this.bottom:!1};\nl.ceil=function(){this.top=Math.ceil(this.top);t" +
    "his.right=Math.ceil(this.right);this.bottom=Math.ceil(this.bottom)" +
    ";this.left=Math.ceil(this.left);return this};l.floor=function(){th" +
    "is.top=Math.floor(this.top);this.right=Math.floor(this.right);this" +
    ".bottom=Math.floor(this.bottom);this.left=Math.floor(this.left);re" +
    "turn this};l.round=function(){this.top=Math.round(this.top);this.r" +
    "ight=Math.round(this.right);this.bottom=Math.round(this.bottom);th" +
    "is.left=Math.round(this.left);return this};\nl.scale=function(a,b){" +
    "var c=ea(b)?b:a;this.left*=a;this.right*=a;this.top*=c;this.bottom" +
    "*=c;return this};function y(a,b,c,d){this.left=a;this.top=b;this.w" +
    "idth=c;this.height=d}l=y.prototype;l.clone=function(){return new y" +
    "(this.left,this.top,this.width,this.height)};l.toString=function()" +
    "{return\"(\"+this.left+\", \"+this.top+\" - \"+this.width+\"w x \"+this.he" +
    "ight+\"h)\"};l.contains=function(a){return a instanceof y?this.left<" +
    "=a.left&&this.left+this.width>=a.left+a.width&&this.top<=a.top&&th" +
    "is.top+this.height>=a.top+a.height:a.x>=this.left&&a.x<=this.left+" +
    "this.width&&a.y>=this.top&&a.y<=this.top+this.height};\nl.ceil=func" +
    "tion(){this.left=Math.ceil(this.left);this.top=Math.ceil(this.top)" +
    ";this.width=Math.ceil(this.width);this.height=Math.ceil(this.heigh" +
    "t);return this};l.floor=function(){this.left=Math.floor(this.left)" +
    ";this.top=Math.floor(this.top);this.width=Math.floor(this.width);t" +
    "his.height=Math.floor(this.height);return this};l.round=function()" +
    "{this.left=Math.round(this.left);this.top=Math.round(this.top);thi" +
    "s.width=Math.round(this.width);this.height=Math.round(this.height)" +
    ";return this};\nl.scale=function(a,b){var c=ea(b)?b:a;this.left*=a;" +
    "this.width*=a;this.top*=c;this.height*=c;return this};function Ra(" +
    "a,b){var c=x(a);return c.defaultView&&c.defaultView.getComputedSty" +
    "le&&(c=c.defaultView.getComputedStyle(a,null))?c[b]||c.getProperty" +
    "Value(b)||\"\":\"\"}function Sa(a){var b=a.offsetWidth,c=a.offsetHeigh" +
    "t;if((!p(b)||!b&&!c)&&a.getBoundingClientRect){a:{var d;try{d=a.ge" +
    "tBoundingClientRect()}catch(e){a={left:0,top:0,right:0,bottom:0};b" +
    "reak a}a=d}return new Ba(a.right-a.left,a.bottom-a.top)}return new" +
    " Ba(b,c)};/*xxx_rpl_lic*/\nvar Ta=window;function z(a,b){this.code=" +
    "a;this.a=Ua[a]||\"unknown error\";this.message=b||\"\";var c=this.a.re" +
    "place(/((?:^|\\s+)[a-z])/g,function(a){return a.toUpperCase().repla" +
    "ce(/^[\\s\\xa0]+/g,\"\")}),d=c.length-5;if(0>d||c.indexOf(\"Error\",d)!=" +
    "d)c+=\"Error\";this.name=c;c=Error(this.message);c.name=this.name;th" +
    "is.stack=c.stack||\"\"}r(z,Error);\nvar Ua={15:\"element not selectabl" +
    "e\",11:\"element not visible\",31:\"unknown error\",30:\"unknown error\"," +
    "24:\"invalid cookie domain\",29:\"invalid element coordinates\",12:\"in" +
    "valid element state\",32:\"invalid selector\",51:\"invalid selector\",5" +
    "2:\"invalid selector\",17:\"javascript error\",405:\"unsupported operat" +
    "ion\",34:\"move target out of bounds\",27:\"no such alert\",7:\"no such " +
    "element\",8:\"no such frame\",23:\"no such window\",28:\"script timeout\"" +
    ",33:\"session not created\",10:\"stale element reference\",21:\"timeout" +
    "\",25:\"unable to set cookie\",\n26:\"unexpected alert open\",13:\"unknow" +
    "n error\",9:\"unknown command\"};z.prototype.toString=function(){retu" +
    "rn this.name+\": \"+this.message};function Va(a){return(a=a.exec(Ca)" +
    ")?a[1]:\"\"}Va(/Android\\s+([0-9.]+)/)||Va(/Version\\/([0-9.]+)/);func" +
    "tion Wa(a){var b=0,c=ma(String(Xa)).split(\".\");a=ma(String(a)).spl" +
    "it(\".\");for(var d=Math.max(c.length,a.length),e=0;0==b&&e<d;e++){v" +
    "ar f=c[e]||\"\",h=a[e]||\"\",k=RegExp(\"(\\\\d*)(\\\\D*)\",\"g\"),m=RegExp(\"(\\" +
    "\\d*)(\\\\D*)\",\"g\");do{var n=k.exec(f)||[\"\",\"\",\"\"],u=m.exec(h)||[\"\",\"" +
    "\",\"\"];if(0==n[0].length&&0==u[0].length)break;b=na(0==n[1].length?" +
    "0:parseInt(n[1],10),0==u[1].length?0:parseInt(u[1],10))||na(0==n[2" +
    "].length,0==u[2].length)||na(n[2],u[2])}while(0==b)}return 0<=b}\nv" +
    "ar Ya=/Android\\s+([0-9\\.]+)/.exec(Ca),Xa=Ya?Ya[1]:\"0\";Wa(2.3);Wa(4" +
    ");/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Cop" +
    "yright (c) 2012 Google Inc.\n\n Permission is hereby granted, free o" +
    "f charge, to any person obtaining a copy\n of this software and ass" +
    "ociated documentation files (the \"Software\"), to\n deal in the Soft" +
    "ware without restriction, including without limitation the\n rights" +
    " to use, copy, modify, merge, publish, distribute, sublicense, and" +
    "/or\n sell copies of the Software, and to permit persons to whom th" +
    "e Software is\n furnished to do so, subject to the following condit" +
    "ions:\n\n The above copyright notice and this permission notice shal" +
    "l be included in\n all copies or substantial portions of the Softwa" +
    "re.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KI" +
    "ND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTI" +
    "ES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONIN" +
    "FRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE" +
    " LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN " +
    "ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN" +
    " CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE" +
    " SOFTWARE.\n*/\nfunction Za(a,b,c){this.a=a;this.b=b||1;this.f=c||1}" +
    ";function $a(a){this.b=a;this.a=0}function ab(a){a=a.match(bb);for" +
    "(var b=0;b<a.length;b++)cb.test(a[b])&&a.splice(b,1);return new $a" +
    "(a)}var bb=RegExp(\"\\\\$?(?:(?![0-9-])[\\\\w-]+:)?(?![0-9-])[\\\\w-]+|\\\\" +
    "/\\\\/|\\\\.\\\\.|::|\\\\d+(?:\\\\.\\\\d*)?|\\\\.\\\\d+|\\\"[^\\\"]*\\\"|'[^']*'|[!<>]=|" +
    "\\\\s+|.\",\"g\"),cb=/^\\s/;function A(a,b){return a.b[a.a+(b||0)]}funct" +
    "ion B(a){return a.b[a.a++]}function db(a){return a.b.length<=a.a};" +
    "function D(a){var b=null,c=a.nodeType;1==c&&(b=a.textContent,b=voi" +
    "d 0==b||null==b?a.innerText:b,b=void 0==b||null==b?\"\":b);if(\"strin" +
    "g\"!=typeof b)if(9==c||1==c){a=9==c?a.documentElement:a.firstChild;" +
    "for(var c=0,d=[],b=\"\";a;){do 1!=a.nodeType&&(b+=a.nodeValue),d[c++" +
    "]=a;while(a=a.firstChild);for(;c&&!(a=d[--c].nextSibling););}}else" +
    " b=a.nodeValue;return\"\"+b}\nfunction eb(a,b,c){if(null===b)return!0" +
    ";try{if(!a.getAttribute)return!1}catch(d){return!1}return null==c?" +
    "!!a.getAttribute(b):a.getAttribute(b,2)==c}function fb(a,b,c,d,e){" +
    "return gb.call(null,a,b,q(c)?c:null,q(d)?d:null,e||new E)}\nfunctio" +
    "n gb(a,b,c,d,e){b.getElementsByName&&d&&\"name\"==c?(b=b.getElements" +
    "ByName(d),t(b,function(b){a.a(b)&&G(e,b)})):b.getElementsByClassNa" +
    "me&&d&&\"class\"==c?(b=b.getElementsByClassName(d),t(b,function(b){b" +
    ".className==d&&a.a(b)&&G(e,b)})):a instanceof H?hb(a,b,c,d,e):b.ge" +
    "tElementsByTagName&&(b=b.getElementsByTagName(a.f()),t(b,function(" +
    "a){eb(a,c,d)&&G(e,a)}));return e}function ib(a,b,c,d,e){for(b=b.fi" +
    "rstChild;b;b=b.nextSibling)eb(b,c,d)&&a.a(b)&&G(e,b);return e}\nfun" +
    "ction hb(a,b,c,d,e){for(b=b.firstChild;b;b=b.nextSibling)eb(b,c,d)" +
    "&&a.a(b)&&G(e,b),hb(a,b,c,d,e)};function E(){this.b=this.a=null;th" +
    "is.u=0}function jb(a){this.node=a;this.a=this.b=null}function kb(a" +
    ",b){if(!a.a)return b;if(!b.a)return a;for(var c=a.a,d=b.a,e=null,f" +
    "=null,h=0;c&&d;)c.node==d.node?(f=c,c=c.a,d=d.a):0<Ka(c.node,d.nod" +
    "e)?(f=d,d=d.a):(f=c,c=c.a),(f.b=e)?e.a=f:a.a=f,e=f,h++;for(f=c||d;" +
    "f;)f.b=e,e=e.a=f,h++,f=f.a;a.b=e;a.u=h;return a}function lb(a,b){v" +
    "ar c=new jb(b);c.a=a.a;a.b?a.a.b=c:a.a=a.b=c;a.a=c;a.u++}function " +
    "G(a,b){var c=new jb(b);c.b=a.b;a.a?a.b.a=c:a.a=a.b=c;a.b=c;a.u++}\n" +
    "function mb(a){return(a=a.a)?a.node:null}function nb(a){return(a=m" +
    "b(a))?D(a):\"\"}function I(a,b){return new ob(a,!!b)}function ob(a,b" +
    "){this.f=a;this.b=(this.c=b)?a.b:a.a;this.a=null}function J(a){var" +
    " b=a.b;if(null==b)return null;var c=a.a=b;a.b=a.c?b.b:b.a;return c" +
    ".node};function pb(a){switch(a.nodeType){case 1:return ja(qb,a);ca" +
    "se 9:return pb(a.documentElement);case 11:case 10:case 6:case 12:r" +
    "eturn rb;default:return a.parentNode?pb(a.parentNode):rb}}function" +
    " rb(){return null}function qb(a,b){if(a.prefix==b)return a.namespa" +
    "ceURI||\"http://www.w3.org/1999/xhtml\";var c=a.getAttributeNode(\"xm" +
    "lns:\"+b);return c&&c.specified?c.value||null:a.parentNode&&9!=a.pa" +
    "rentNode.nodeType?qb(a.parentNode,b):null};function K(a){this.m=a;" +
    "this.b=this.j=!1;this.f=null}function M(a){return\"\\n  \"+a.toString" +
    "().split(\"\\n\").join(\"\\n  \")}function sb(a,b){a.j=b}function tb(a,b" +
    "){a.b=b}function N(a,b){var c=a.a(b);return c instanceof E?+nb(c):" +
    "+c}function O(a,b){var c=a.a(b);return c instanceof E?nb(c):\"\"+c}f" +
    "unction ub(a,b){var c=a.a(b);return c instanceof E?!!c.u:!!c};func" +
    "tion vb(a,b,c){K.call(this,a.m);this.c=a;this.h=b;this.s=c;this.j=" +
    "b.j||c.j;this.b=b.b||c.b;this.c==wb&&(c.b||c.j||4==c.m||0==c.m||!b" +
    ".f?b.b||b.j||4==b.m||0==b.m||!c.f||(this.f={name:c.f.name,B:b}):th" +
    "is.f={name:b.f.name,B:c})}r(vb,K);\nfunction xb(a,b,c,d,e){b=b.a(d)" +
    ";c=c.a(d);var f;if(b instanceof E&&c instanceof E){e=I(b);for(d=J(" +
    "e);d;d=J(e))for(b=I(c),f=J(b);f;f=J(b))if(a(D(d),D(f)))return!0;re" +
    "turn!1}if(b instanceof E||c instanceof E){b instanceof E?e=b:(e=c," +
    "c=b);e=I(e);b=typeof c;for(d=J(e);d;d=J(e)){switch(b){case \"number" +
    "\":d=+D(d);break;case \"boolean\":d=!!D(d);break;case \"string\":d=D(d)" +
    ";break;default:throw Error(\"Illegal primitive type for comparison." +
    "\");}if(a(d,c))return!0}return!1}return e?\"boolean\"==typeof b||\"boo" +
    "lean\"==typeof c?\na(!!b,!!c):\"number\"==typeof b||\"number\"==typeof c" +
    "?a(+b,+c):a(b,c):a(+b,+c)}vb.prototype.a=function(a){return this.c" +
    ".v(this.h,this.s,a)};vb.prototype.toString=function(){var a=\"Binar" +
    "y Expression: \"+this.c,a=a+M(this.h);return a+=M(this.s)};function" +
    " yb(a,b,c,d){this.a=a;this.H=b;this.m=c;this.v=d}yb.prototype.toSt" +
    "ring=g(\"a\");var zb={};function P(a,b,c,d){if(zb.hasOwnProperty(a))" +
    "throw Error(\"Binary operator already created: \"+a);a=new yb(a,b,c," +
    "d);return zb[a.toString()]=a}\nP(\"div\",6,1,function(a,b,c){return N" +
    "(a,c)/N(b,c)});P(\"mod\",6,1,function(a,b,c){return N(a,c)%N(b,c)});" +
    "P(\"*\",6,1,function(a,b,c){return N(a,c)*N(b,c)});P(\"+\",5,1,functio" +
    "n(a,b,c){return N(a,c)+N(b,c)});P(\"-\",5,1,function(a,b,c){return N" +
    "(a,c)-N(b,c)});P(\"<\",4,2,function(a,b,c){return xb(function(a,b){r" +
    "eturn a<b},a,b,c)});P(\">\",4,2,function(a,b,c){return xb(function(a" +
    ",b){return a>b},a,b,c)});P(\"<=\",4,2,function(a,b,c){return xb(func" +
    "tion(a,b){return a<=b},a,b,c)});\nP(\">=\",4,2,function(a,b,c){return" +
    " xb(function(a,b){return a>=b},a,b,c)});var wb=P(\"=\",3,2,function(" +
    "a,b,c){return xb(function(a,b){return a==b},a,b,c,!0)});P(\"!=\",3,2" +
    ",function(a,b,c){return xb(function(a,b){return a!=b},a,b,c,!0)});" +
    "P(\"and\",2,2,function(a,b,c){return ub(a,c)&&ub(b,c)});P(\"or\",1,2,f" +
    "unction(a,b,c){return ub(a,c)||ub(b,c)});function Ab(a,b){if(b.a.l" +
    "ength&&4!=a.m)throw Error(\"Primary expression must evaluate to nod" +
    "eset if filter has predicate(s).\");K.call(this,a.m);this.c=a;this." +
    "h=b;this.j=a.j;this.b=a.b}r(Ab,K);Ab.prototype.a=function(a){a=thi" +
    "s.c.a(a);return Bb(this.h,a)};Ab.prototype.toString=function(){var" +
    " a;a=\"Filter:\"+M(this.c);return a+=M(this.h)};function Cb(a,b){if(" +
    "b.length<a.I)throw Error(\"Function \"+a.o+\" expects at least\"+a.I+\"" +
    " arguments, \"+b.length+\" given\");if(null!==a.C&&b.length>a.C)throw" +
    " Error(\"Function \"+a.o+\" expects at most \"+a.C+\" arguments, \"+b.le" +
    "ngth+\" given\");a.N&&t(b,function(b,d){if(4!=b.m)throw Error(\"Argum" +
    "ent \"+d+\" to function \"+a.o+\" is not of type Nodeset: \"+b);});K.ca" +
    "ll(this,a.m);this.h=a;this.c=b;sb(this,a.j||va(b,function(a){retur" +
    "n a.j}));tb(this,a.M&&!b.length||a.L&&!!b.length||va(b,function(a)" +
    "{return a.b}))}\nr(Cb,K);Cb.prototype.a=function(a){return this.h.v" +
    ".apply(null,xa(a,this.c))};Cb.prototype.toString=function(){var a=" +
    "\"Function: \"+this.h;if(this.c.length)var b=ua(this.c,function(a,b)" +
    "{return a+M(b)},\"Arguments:\"),a=a+M(b);return a};function Db(a,b,c" +
    ",d,e,f,h,k,m){this.o=a;this.m=b;this.j=c;this.M=d;this.L=e;this.v=" +
    "f;this.I=h;this.C=p(k)?k:h;this.N=!!m}Db.prototype.toString=g(\"o\")" +
    ";var Eb={};\nfunction Q(a,b,c,d,e,f,h,k){if(Eb.hasOwnProperty(a))th" +
    "row Error(\"Function already created: \"+a+\".\");Eb[a]=new Db(a,b,c,d" +
    ",!1,e,f,h,k)}Q(\"boolean\",2,!1,!1,function(a,b){return ub(b,a)},1);" +
    "Q(\"ceiling\",1,!1,!1,function(a,b){return Math.ceil(N(b,a))},1);Q(\"" +
    "concat\",3,!1,!1,function(a,b){var c=ya(arguments,1);return ua(c,fu" +
    "nction(b,c){return b+O(c,a)},\"\")},2,null);Q(\"contains\",2,!1,!1,fun" +
    "ction(a,b,c){b=O(b,a);a=O(c,a);return-1!=b.indexOf(a)},2);Q(\"count" +
    "\",1,!1,!1,function(a,b){return b.a(a).u},1,1,!0);\nQ(\"false\",2,!1,!" +
    "1,aa(!1),0);Q(\"floor\",1,!1,!1,function(a,b){return Math.floor(N(b," +
    "a))},1);Q(\"id\",4,!1,!1,function(a,b){var c=a.a,d=9==c.nodeType?c:c" +
    ".ownerDocument,c=O(b,a).split(/\\s+/),e=[];t(c,function(a){a=d.getE" +
    "lementById(a);!a||0<=ta(e,a)||e.push(a)});e.sort(Ka);var f=new E;t" +
    "(e,function(a){G(f,a)});return f},1);Q(\"lang\",2,!1,!1,aa(!1),1);Q(" +
    "\"last\",1,!0,!1,function(a){if(1!=arguments.length)throw Error(\"Fun" +
    "ction last expects ()\");return a.f},0);\nQ(\"local-name\",3,!1,!0,fun" +
    "ction(a,b){var c=b?mb(b.a(a)):a.a;return c?c.localName||c.nodeName" +
    ".toLowerCase():\"\"},0,1,!0);Q(\"name\",3,!1,!0,function(a,b){var c=b?" +
    "mb(b.a(a)):a.a;return c?c.nodeName.toLowerCase():\"\"},0,1,!0);Q(\"na" +
    "mespace-uri\",3,!0,!1,aa(\"\"),0,1,!0);Q(\"normalize-space\",3,!1,!0,fu" +
    "nction(a,b){return(b?O(b,a):D(a.a)).replace(/[\\s\\xa0]+/g,\" \").repl" +
    "ace(/^\\s+|\\s+$/g,\"\")},0,1);Q(\"not\",2,!1,!1,function(a,b){return!ub" +
    "(b,a)},1);Q(\"number\",1,!1,!0,function(a,b){return b?N(b,a):+D(a.a)" +
    "},0,1);\nQ(\"position\",1,!0,!1,function(a){return a.b},0);Q(\"round\"," +
    "1,!1,!1,function(a,b){return Math.round(N(b,a))},1);Q(\"starts-with" +
    "\",2,!1,!1,function(a,b,c){b=O(b,a);a=O(c,a);return 0==b.lastIndexO" +
    "f(a,0)},2);Q(\"string\",3,!1,!0,function(a,b){return b?O(b,a):D(a.a)" +
    "},0,1);Q(\"string-length\",1,!1,!0,function(a,b){return(b?O(b,a):D(a" +
    ".a)).length},0,1);\nQ(\"substring\",3,!1,!1,function(a,b,c,d){c=N(c,a" +
    ");if(isNaN(c)||Infinity==c||-Infinity==c)return\"\";d=d?N(d,a):Infin" +
    "ity;if(isNaN(d)||-Infinity===d)return\"\";c=Math.round(c)-1;var e=Ma" +
    "th.max(c,0);a=O(b,a);if(Infinity==d)return a.substring(e);b=Math.r" +
    "ound(d);return a.substring(e,c+b)},2,3);Q(\"substring-after\",3,!1,!" +
    "1,function(a,b,c){b=O(b,a);a=O(c,a);c=b.indexOf(a);return-1==c?\"\":" +
    "b.substring(c+a.length)},2);\nQ(\"substring-before\",3,!1,!1,function" +
    "(a,b,c){b=O(b,a);a=O(c,a);a=b.indexOf(a);return-1==a?\"\":b.substrin" +
    "g(0,a)},2);Q(\"sum\",1,!1,!1,function(a,b){for(var c=I(b.a(a)),d=0,e" +
    "=J(c);e;e=J(c))d+=+D(e);return d},1,1,!0);Q(\"translate\",3,!1,!1,fu" +
    "nction(a,b,c,d){b=O(b,a);c=O(c,a);var e=O(d,a);a=[];for(d=0;d<c.le" +
    "ngth;d++){var f=c.charAt(d);f in a||(a[f]=e.charAt(d))}c=\"\";for(d=" +
    "0;d<b.length;d++)f=b.charAt(d),c+=f in a?a[f]:f;return c},3);Q(\"tr" +
    "ue\",2,!1,!1,aa(!0),0);function H(a,b){this.h=a;this.c=p(b)?b:null;" +
    "this.b=null;switch(a){case \"comment\":this.b=8;break;case \"text\":th" +
    "is.b=3;break;case \"processing-instruction\":this.b=7;break;case \"no" +
    "de\":break;default:throw Error(\"Unexpected argument\");}}function Fb" +
    "(a){return\"comment\"==a||\"text\"==a||\"processing-instruction\"==a||\"n" +
    "ode\"==a}H.prototype.a=function(a){return null===this.b||this.b==a." +
    "nodeType};H.prototype.f=g(\"h\");H.prototype.toString=function(){var" +
    " a=\"Kind Test: \"+this.h;null===this.c||(a+=M(this.c));return a};fu" +
    "nction Gb(a){K.call(this,3);this.c=a.substring(1,a.length-1)}r(Gb," +
    "K);Gb.prototype.a=g(\"c\");Gb.prototype.toString=function(){return\"L" +
    "iteral: \"+this.c};function Hb(a,b){this.o=a.toLowerCase();this.b=b" +
    "?b.toLowerCase():\"http://www.w3.org/1999/xhtml\"}Hb.prototype.a=fun" +
    "ction(a){var b=a.nodeType;return 1!=b&&2!=b?!1:\"*\"!=this.o&&this.o" +
    "!=a.nodeName.toLowerCase()?!1:this.b==(a.namespaceURI?a.namespaceU" +
    "RI.toLowerCase():\"http://www.w3.org/1999/xhtml\")};Hb.prototype.f=g" +
    "(\"o\");Hb.prototype.toString=function(){return\"Name Test: \"+(\"http:" +
    "//www.w3.org/1999/xhtml\"==this.b?\"\":this.b+\":\")+this.o};function I" +
    "b(a){K.call(this,1);this.c=a}r(Ib,K);Ib.prototype.a=g(\"c\");Ib.prot" +
    "otype.toString=function(){return\"Number: \"+this.c};function Jb(a,b" +
    "){K.call(this,a.m);this.h=a;this.c=b;this.j=a.j;this.b=a.b;if(1==t" +
    "his.c.length){var c=this.c[0];c.A||c.c!=Kb||(c=c.s,\"*\"!=c.f()&&(th" +
    "is.f={name:c.f(),B:null}))}}r(Jb,K);function Lb(){K.call(this,4)}r" +
    "(Lb,K);Lb.prototype.a=function(a){var b=new E;a=a.a;9==a.nodeType?" +
    "G(b,a):G(b,a.ownerDocument);return b};Lb.prototype.toString=aa(\"Ro" +
    "ot Helper Expression\");function Mb(){K.call(this,4)}r(Mb,K);Mb.pro" +
    "totype.a=function(a){var b=new E;G(b,a.a);return b};Mb.prototype.t" +
    "oString=aa(\"Context Helper Expression\");\nfunction Nb(a){return\"/\"=" +
    "=a||\"//\"==a}Jb.prototype.a=function(a){var b=this.h.a(a);if(!(b in" +
    "stanceof E))throw Error(\"Filter expression must evaluate to nodese" +
    "t.\");a=this.c;for(var c=0,d=a.length;c<d&&b.u;c++){var e=a[c],f=I(" +
    "b,e.c.a),h;if(e.j||e.c!=Ob)if(e.j||e.c!=Pb)for(h=J(f),b=e.a(new Za" +
    "(h));null!=(h=J(f));)h=e.a(new Za(h)),b=kb(b,h);else h=J(f),b=e.a(" +
    "new Za(h));else{for(h=J(f);(b=J(f))&&(!h.contains||h.contains(b))&" +
    "&b.compareDocumentPosition(h)&8;h=b);b=e.a(new Za(h))}}return b};\n" +
    "Jb.prototype.toString=function(){var a;a=\"Path Expression:\"+M(this" +
    ".h);if(this.c.length){var b=ua(this.c,function(a,b){return a+M(b)}" +
    ",\"Steps:\");a+=M(b)}return a};function Qb(a,b){this.a=a;this.b=!!b}" +
    "\nfunction Bb(a,b,c){for(c=c||0;c<a.a.length;c++)for(var d=a.a[c],e" +
    "=I(b),f=b.u,h,k=0;h=J(e);k++){var m=a.b?f-k:k+1;h=d.a(new Za(h,m,f" +
    "));if(\"number\"==typeof h)m=m==h;else if(\"string\"==typeof h||\"boole" +
    "an\"==typeof h)m=!!h;else if(h instanceof E)m=0<h.u;else throw Erro" +
    "r(\"Predicate.evaluate returned an unexpected type.\");if(!m){m=e;h=" +
    "m.f;var n=m.a;if(!n)throw Error(\"Next must be called at least once" +
    " before remove.\");var u=n.b,n=n.a;u?u.a=n:h.a=n;n?n.b=u:h.b=u;h.u-" +
    "-;m.a=null}}return b}\nQb.prototype.toString=function(){return ua(t" +
    "his.a,function(a,b){return a+M(b)},\"Predicates:\")};function Rb(a,b" +
    ",c,d){K.call(this,4);this.c=a;this.s=b;this.h=c||new Qb([]);this.A" +
    "=!!d;b=this.h;b=0<b.a.length?b.a[0].f:null;a.b&&b&&(this.f={name:b" +
    ".name,B:b.B});a:{a=this.h;for(b=0;b<a.a.length;b++)if(c=a.a[b],c.j" +
    "||1==c.m||0==c.m){a=!0;break a}a=!1}this.j=a}r(Rb,K);\nRb.prototype" +
    ".a=function(a){var b=a.a,c=null,c=this.f,d=null,e=null,f=0;c&&(d=c" +
    ".name,e=c.B?O(c.B,a):null,f=1);if(this.A)if(this.j||this.c!=Sb)if(" +
    "a=I((new Rb(Tb,new H(\"node\"))).a(a)),b=J(a))for(c=this.v(b,d,e,f);" +
    "null!=(b=J(a));)c=kb(c,this.v(b,d,e,f));else c=new E;else c=fb(thi" +
    "s.s,b,d,e),c=Bb(this.h,c,f);else c=this.v(a.a,d,e,f);return c};Rb." +
    "prototype.v=function(a,b,c,d){a=this.c.f(this.s,a,b,c);return a=Bb" +
    "(this.h,a,d)};\nRb.prototype.toString=function(){var a;a=\"Step:\"+M(" +
    "\"Operator: \"+(this.A?\"//\":\"/\"));this.c.o&&(a+=M(\"Axis: \"+this.c));" +
    "a+=M(this.s);if(this.h.a.length){var b=ua(this.h.a,function(a,b){r" +
    "eturn a+M(b)},\"Predicates:\");a+=M(b)}return a};function Ub(a,b,c,d" +
    "){this.o=a;this.f=b;this.a=c;this.b=d}Ub.prototype.toString=g(\"o\")" +
    ";var Vb={};function R(a,b,c,d){if(Vb.hasOwnProperty(a))throw Error" +
    "(\"Axis already created: \"+a);b=new Ub(a,b,c,!!d);return Vb[a]=b}\nR" +
    "(\"ancestor\",function(a,b){for(var c=new E,d=b;d=d.parentNode;)a.a(" +
    "d)&&lb(c,d);return c},!0);R(\"ancestor-or-self\",function(a,b){var c" +
    "=new E,d=b;do a.a(d)&&lb(c,d);while(d=d.parentNode);return c},!0);" +
    "var Kb=R(\"attribute\",function(a,b){var c=new E,d=a.f(),e=b.attribu" +
    "tes;if(e)if(a instanceof H&&null===a.b||\"*\"==d)for(var d=0,f;f=e[d" +
    "];d++)G(c,f);else(f=e.getNamedItem(d))&&G(c,f);return c},!1),Sb=R(" +
    "\"child\",function(a,b,c,d,e){return ib.call(null,a,b,q(c)?c:null,q(" +
    "d)?d:null,e||new E)},!1,!0);\nR(\"descendant\",fb,!1,!0);var Tb=R(\"de" +
    "scendant-or-self\",function(a,b,c,d){var e=new E;eb(b,c,d)&&a.a(b)&" +
    "&G(e,b);return fb(a,b,c,d,e)},!1,!0),Ob=R(\"following\",function(a,b" +
    ",c,d){var e=new E;do for(var f=b;f=f.nextSibling;)eb(f,c,d)&&a.a(f" +
    ")&&G(e,f),e=fb(a,f,c,d,e);while(b=b.parentNode);return e},!1,!0);R" +
    "(\"following-sibling\",function(a,b){for(var c=new E,d=b;d=d.nextSib" +
    "ling;)a.a(d)&&G(c,d);return c},!1);R(\"namespace\",function(){return" +
    " new E},!1);\nvar Wb=R(\"parent\",function(a,b){var c=new E;if(9==b.n" +
    "odeType)return c;if(2==b.nodeType)return G(c,b.ownerElement),c;var" +
    " d=b.parentNode;a.a(d)&&G(c,d);return c},!1),Pb=R(\"preceding\",func" +
    "tion(a,b,c,d){var e=new E,f=[];do f.unshift(b);while(b=b.parentNod" +
    "e);for(var h=1,k=f.length;h<k;h++){var m=[];for(b=f[h];b=b.previou" +
    "sSibling;)m.unshift(b);for(var n=0,u=m.length;n<u;n++)b=m[n],eb(b,"
  )
      .append(
    "c,d)&&a.a(b)&&G(e,b),e=fb(a,b,c,d,e)}return e},!0,!0);\nR(\"precedin" +
    "g-sibling\",function(a,b){for(var c=new E,d=b;d=d.previousSibling;)" +
    "a.a(d)&&lb(c,d);return c},!0);var Xb=R(\"self\",function(a,b){var c=" +
    "new E;a.a(b)&&G(c,b);return c},!1);function Yb(a){K.call(this,1);t" +
    "his.c=a;this.j=a.j;this.b=a.b}r(Yb,K);Yb.prototype.a=function(a){r" +
    "eturn-N(this.c,a)};Yb.prototype.toString=function(){return\"Unary E" +
    "xpression: -\"+M(this.c)};function Zb(a){K.call(this,4);this.c=a;sb" +
    "(this,va(this.c,function(a){return a.j}));tb(this,va(this.c,functi" +
    "on(a){return a.b}))}r(Zb,K);Zb.prototype.a=function(a){var b=new E" +
    ";t(this.c,function(c){c=c.a(a);if(!(c instanceof E))throw Error(\"P" +
    "ath expression must evaluate to NodeSet.\");b=kb(b,c)});return b};Z" +
    "b.prototype.toString=function(){return ua(this.c,function(a,b){ret" +
    "urn a+M(b)},\"Union Expression:\")};function $b(a,b){this.a=a;this.b" +
    "=b}function ac(a){for(var b,c=[];;){S(a,\"Missing right hand side o" +
    "f binary expression.\");b=bc(a);var d=B(a.a);if(!d)break;var e=(d=z" +
    "b[d]||null)&&d.H;if(!e){a.a.a--;break}for(;c.length&&e<=c[c.length" +
    "-1].H;)b=new vb(c.pop(),c.pop(),b);c.push(b,d)}for(;c.length;)b=ne" +
    "w vb(c.pop(),c.pop(),b);return b}function S(a,b){if(db(a.a))throw " +
    "Error(b);}function cc(a,b){var c=B(a.a);if(c!=b)throw Error(\"Bad t" +
    "oken, expected: \"+b+\" got: \"+c);}\nfunction dc(a){a=B(a.a);if(\")\"!=" +
    "a)throw Error(\"Bad token: \"+a);}function ec(a){a=B(a.a);if(2>a.len" +
    "gth)throw Error(\"Unclosed literal string\");return new Gb(a)}functi" +
    "on fc(a){var b=B(a.a),c=b.indexOf(\":\");if(-1==c)return new Hb(b);v" +
    "ar d=b.substring(0,c);a=a.b(d);if(!a)throw Error(\"Namespace prefix" +
    " not declared: \"+d);b=b.substr(c+1);return new Hb(b,a)}\nfunction g" +
    "c(a){var b,c=[],d;if(Nb(A(a.a))){b=B(a.a);d=A(a.a);if(\"/\"==b&&(db(" +
    "a.a)||\".\"!=d&&\"..\"!=d&&\"@\"!=d&&\"*\"!=d&&!/(?![0-9])[\\w]/.test(d)))r" +
    "eturn new Lb;d=new Lb;S(a,\"Missing next location step.\");b=hc(a,b)" +
    ";c.push(b)}else{a:{b=A(a.a);d=b.charAt(0);switch(d){case \"$\":throw" +
    " Error(\"Variable reference not allowed in HTML XPath\");case \"(\":B(" +
    "a.a);b=ac(a);S(a,'unclosed \"(\"');cc(a,\")\");break;case '\"':case \"'\"" +
    ":b=ec(a);break;default:if(isNaN(+b))if(!Fb(b)&&/(?![0-9])[\\w]/.tes" +
    "t(d)&&\"(\"==A(a.a,1)){b=B(a.a);\nb=Eb[b]||null;B(a.a);for(d=[];\")\"!=" +
    "A(a.a);){S(a,\"Missing function argument list.\");d.push(ac(a));if(\"" +
    ",\"!=A(a.a))break;B(a.a)}S(a,\"Unclosed function argument list.\");dc" +
    "(a);b=new Cb(b,d)}else{b=null;break a}else b=new Ib(+B(a.a))}\"[\"==" +
    "A(a.a)&&(d=new Qb(ic(a)),b=new Ab(b,d))}if(b)if(Nb(A(a.a)))d=b;els" +
    "e return b;else b=hc(a,\"/\"),d=new Mb,c.push(b)}for(;Nb(A(a.a));)b=" +
    "B(a.a),S(a,\"Missing next location step.\"),b=hc(a,b),c.push(b);retu" +
    "rn new Jb(d,c)}\nfunction hc(a,b){var c,d,e;if(\"/\"!=b&&\"//\"!=b)thro" +
    "w Error('Step op should be \"/\" or \"//\"');if(\".\"==A(a.a))return d=n" +
    "ew Rb(Xb,new H(\"node\")),B(a.a),d;if(\"..\"==A(a.a))return d=new Rb(W" +
    "b,new H(\"node\")),B(a.a),d;var f;if(\"@\"==A(a.a))f=Kb,B(a.a),S(a,\"Mi" +
    "ssing attribute name\");else if(\"::\"==A(a.a,1)){if(!/(?![0-9])[\\w]/" +
    ".test(A(a.a).charAt(0)))throw Error(\"Bad token: \"+B(a.a));c=B(a.a)" +
    ";f=Vb[c]||null;if(!f)throw Error(\"No axis with name: \"+c);B(a.a);S" +
    "(a,\"Missing node name\")}else f=Sb;c=A(a.a);if(/(?![0-9])[\\w]/.test" +
    "(c.charAt(0)))if(\"(\"==\nA(a.a,1)){if(!Fb(c))throw Error(\"Invalid no" +
    "de type: \"+c);c=B(a.a);if(!Fb(c))throw Error(\"Invalid type name: \"" +
    "+c);cc(a,\"(\");S(a,\"Bad nodetype\");e=A(a.a).charAt(0);var h=null;if" +
    "('\"'==e||\"'\"==e)h=ec(a);S(a,\"Bad nodetype\");dc(a);c=new H(c,h)}els" +
    "e c=fc(a);else if(\"*\"==c)c=fc(a);else throw Error(\"Bad token: \"+B(" +
    "a.a));e=new Qb(ic(a),f.a);return d||new Rb(f,c,e,\"//\"==b)}\nfunctio" +
    "n ic(a){for(var b=[];\"[\"==A(a.a);){B(a.a);S(a,\"Missing predicate e" +
    "xpression.\");var c=ac(a);b.push(c);S(a,\"Unclosed predicate express" +
    "ion.\");cc(a,\"]\")}return b}function bc(a){if(\"-\"==A(a.a))return B(a" +
    ".a),new Yb(bc(a));var b=gc(a);if(\"|\"!=A(a.a))a=b;else{for(b=[b];\"|" +
    "\"==B(a.a);)S(a,\"Missing next union location path.\"),b.push(gc(a));" +
    "a.a.a--;a=new Zb(b)}return a};function jc(a,b){if(!a.length)throw " +
    "Error(\"Empty XPath expression.\");var c=ab(a);if(db(c))throw Error(" +
    "\"Invalid XPath expression.\");b?fa(b)||(b=ia(b.lookupNamespaceURI,b" +
    ")):b=aa(null);var d=ac(new $b(c,b));if(!db(c))throw Error(\"Bad tok" +
    "en: \"+B(c));this.evaluate=function(a,b){var c=d.a(new Za(a));retur" +
    "n new T(c,b)}}\nfunction T(a,b){if(0==b)if(a instanceof E)b=4;else " +
    "if(\"string\"==typeof a)b=2;else if(\"number\"==typeof a)b=1;else if(\"" +
    "boolean\"==typeof a)b=3;else throw Error(\"Unexpected evaluation res" +
    "ult.\");if(2!=b&&1!=b&&3!=b&&!(a instanceof E))throw Error(\"value c" +
    "ould not be converted to the specified type\");this.resultType=b;va" +
    "r c;switch(b){case 2:this.stringValue=a instanceof E?nb(a):\"\"+a;br" +
    "eak;case 1:this.numberValue=a instanceof E?+nb(a):+a;break;case 3:" +
    "this.booleanValue=a instanceof E?0<a.u:!!a;break;case 4:case 5:cas" +
    "e 6:case 7:var d=\nI(a);c=[];for(var e=J(d);e;e=J(d))c.push(e);this" +
    ".snapshotLength=a.u;this.invalidIteratorState=!1;break;case 8:case" +
    " 9:this.singleNodeValue=mb(a);break;default:throw Error(\"Unknown X" +
    "PathResult type.\");}var f=0;this.iterateNext=function(){if(4!=b&&5" +
    "!=b)throw Error(\"iterateNext called with wrong result type\");retur" +
    "n f>=c.length?null:c[f++]};this.snapshotItem=function(a){if(6!=b&&" +
    "7!=b)throw Error(\"snapshotItem called with wrong result type\");ret" +
    "urn a>=c.length||0>a?null:c[a]}}T.ANY_TYPE=0;\nT.NUMBER_TYPE=1;T.ST" +
    "RING_TYPE=2;T.BOOLEAN_TYPE=3;T.UNORDERED_NODE_ITERATOR_TYPE=4;T.OR" +
    "DERED_NODE_ITERATOR_TYPE=5;T.UNORDERED_NODE_SNAPSHOT_TYPE=6;T.ORDE" +
    "RED_NODE_SNAPSHOT_TYPE=7;T.ANY_UNORDERED_NODE_TYPE=8;T.FIRST_ORDER" +
    "ED_NODE_TYPE=9;function kc(a){this.lookupNamespaceURI=pb(a)}\nfunct" +
    "ion lc(a){a=a||ba;var b=a.document;b.evaluate||(a.XPathResult=T,b." +
    "evaluate=function(a,b,e,f){return(new jc(a,e)).evaluate(b,f)},b.cr" +
    "eateExpression=function(a,b){return new jc(a,b)},b.createNSResolve" +
    "r=function(a){return new kc(a)})}ca(\"wgxpath.install\",lc);var U={}" +
    ";U.D=function(){var a={S:\"http://www.w3.org/2000/svg\"};return func" +
    "tion(b){return a[b]||null}}();\nU.v=function(a,b,c){var d=x(a);if(!" +
    "d.documentElement)return null;lc(Ha(d));try{for(var e=d.createNSRe" +
    "solver?d.createNSResolver(d.documentElement):U.D,f={},h=d.getEleme" +
    "ntsByTagName(\"*\"),k=0;k<h.length;++k){var m=h[k],n=m.namespaceURI;" +
    "if(n&&!f[n]){var u=m.lookupPrefix(n);if(!u){var F=n.match(\".*/(\\\\w" +
    "+)/?$\");F?u=F[1]:u=\"xhtml\"}f[n]=u}}var w={},C;for(C in f)w[f[C]]=C" +
    ";e=function(a){return w[a]||null};try{return d.evaluate(b,a,e,c,nu" +
    "ll)}catch(L){if(\"TypeError\"===L.name)return e=d.createNSResolver?d" +
    ".createNSResolver(d.documentElement):\nU.D,d.evaluate(b,a,e,c,null)" +
    ";throw L;}}catch(oa){throw new z(32,\"Unable to locate an element w" +
    "ith the xpath expression \"+b+\" because of the following error:\\n\"+" +
    "oa);}};U.F=function(a,b){if(!a||1!=a.nodeType)throw new z(32,'The " +
    "result of the xpath expression \"'+b+'\" is: '+a+\". It should be an " +
    "element.\");};\nU.K=function(a,b){var c=function(){var c=U.v(b,a,9);" +
    "return c?c.singleNodeValue||null:b.selectSingleNode?(c=x(b),c.setP" +
    "roperty&&c.setProperty(\"SelectionLanguage\",\"XPath\"),b.selectSingle" +
    "Node(a)):null}();null===c||U.F(c,a);return c};\nU.P=function(a,b){v" +
    "ar c=function(){var c=U.v(b,a,7);if(c){for(var e=c.snapshotLength," +
    "f=[],h=0;h<e;++h)f.push(c.snapshotItem(h));return f}return b.selec" +
    "tNodes?(c=x(b),c.setProperty&&c.setProperty(\"SelectionLanguage\",\"X" +
    "Path\"),b.selectNodes(a)):[]}();t(c,function(b){U.F(b,a)});return c" +
    "};var mc={aliceblue:\"#f0f8ff\",antiquewhite:\"#faebd7\",aqua:\"#00ffff" +
    "\",aquamarine:\"#7fffd4\",azure:\"#f0ffff\",beige:\"#f5f5dc\",bisque:\"#ff" +
    "e4c4\",black:\"#000000\",blanchedalmond:\"#ffebcd\",blue:\"#0000ff\",blue" +
    "violet:\"#8a2be2\",brown:\"#a52a2a\",burlywood:\"#deb887\",cadetblue:\"#5" +
    "f9ea0\",chartreuse:\"#7fff00\",chocolate:\"#d2691e\",coral:\"#ff7f50\",co" +
    "rnflowerblue:\"#6495ed\",cornsilk:\"#fff8dc\",crimson:\"#dc143c\",cyan:\"" +
    "#00ffff\",darkblue:\"#00008b\",darkcyan:\"#008b8b\",darkgoldenrod:\"#b88" +
    "60b\",darkgray:\"#a9a9a9\",darkgreen:\"#006400\",\ndarkgrey:\"#a9a9a9\",da" +
    "rkkhaki:\"#bdb76b\",darkmagenta:\"#8b008b\",darkolivegreen:\"#556b2f\",d" +
    "arkorange:\"#ff8c00\",darkorchid:\"#9932cc\",darkred:\"#8b0000\",darksal" +
    "mon:\"#e9967a\",darkseagreen:\"#8fbc8f\",darkslateblue:\"#483d8b\",darks" +
    "lategray:\"#2f4f4f\",darkslategrey:\"#2f4f4f\",darkturquoise:\"#00ced1\"" +
    ",darkviolet:\"#9400d3\",deeppink:\"#ff1493\",deepskyblue:\"#00bfff\",dim" +
    "gray:\"#696969\",dimgrey:\"#696969\",dodgerblue:\"#1e90ff\",firebrick:\"#" +
    "b22222\",floralwhite:\"#fffaf0\",forestgreen:\"#228b22\",fuchsia:\"#ff00" +
    "ff\",gainsboro:\"#dcdcdc\",\nghostwhite:\"#f8f8ff\",gold:\"#ffd700\",golde" +
    "nrod:\"#daa520\",gray:\"#808080\",green:\"#008000\",greenyellow:\"#adff2f" +
    "\",grey:\"#808080\",honeydew:\"#f0fff0\",hotpink:\"#ff69b4\",indianred:\"#" +
    "cd5c5c\",indigo:\"#4b0082\",ivory:\"#fffff0\",khaki:\"#f0e68c\",lavender:" +
    "\"#e6e6fa\",lavenderblush:\"#fff0f5\",lawngreen:\"#7cfc00\",lemonchiffon" +
    ":\"#fffacd\",lightblue:\"#add8e6\",lightcoral:\"#f08080\",lightcyan:\"#e0" +
    "ffff\",lightgoldenrodyellow:\"#fafad2\",lightgray:\"#d3d3d3\",lightgree" +
    "n:\"#90ee90\",lightgrey:\"#d3d3d3\",lightpink:\"#ffb6c1\",lightsalmon:\"#" +
    "ffa07a\",\nlightseagreen:\"#20b2aa\",lightskyblue:\"#87cefa\",lightslate" +
    "gray:\"#778899\",lightslategrey:\"#778899\",lightsteelblue:\"#b0c4de\",l" +
    "ightyellow:\"#ffffe0\",lime:\"#00ff00\",limegreen:\"#32cd32\",linen:\"#fa" +
    "f0e6\",magenta:\"#ff00ff\",maroon:\"#800000\",mediumaquamarine:\"#66cdaa" +
    "\",mediumblue:\"#0000cd\",mediumorchid:\"#ba55d3\",mediumpurple:\"#9370d" +
    "b\",mediumseagreen:\"#3cb371\",mediumslateblue:\"#7b68ee\",mediumspring" +
    "green:\"#00fa9a\",mediumturquoise:\"#48d1cc\",mediumvioletred:\"#c71585" +
    "\",midnightblue:\"#191970\",mintcream:\"#f5fffa\",mistyrose:\"#ffe4e1\",\n" +
    "moccasin:\"#ffe4b5\",navajowhite:\"#ffdead\",navy:\"#000080\",oldlace:\"#" +
    "fdf5e6\",olive:\"#808000\",olivedrab:\"#6b8e23\",orange:\"#ffa500\",orang" +
    "ered:\"#ff4500\",orchid:\"#da70d6\",palegoldenrod:\"#eee8aa\",palegreen:" +
    "\"#98fb98\",paleturquoise:\"#afeeee\",palevioletred:\"#db7093\",papayawh" +
    "ip:\"#ffefd5\",peachpuff:\"#ffdab9\",peru:\"#cd853f\",pink:\"#ffc0cb\",plu" +
    "m:\"#dda0dd\",powderblue:\"#b0e0e6\",purple:\"#800080\",red:\"#ff0000\",ro" +
    "sybrown:\"#bc8f8f\",royalblue:\"#4169e1\",saddlebrown:\"#8b4513\",salmon" +
    ":\"#fa8072\",sandybrown:\"#f4a460\",seagreen:\"#2e8b57\",\nseashell:\"#fff" +
    "5ee\",sienna:\"#a0522d\",silver:\"#c0c0c0\",skyblue:\"#87ceeb\",slateblue" +
    ":\"#6a5acd\",slategray:\"#708090\",slategrey:\"#708090\",snow:\"#fffafa\"," +
    "springgreen:\"#00ff7f\",steelblue:\"#4682b4\",tan:\"#d2b48c\",teal:\"#008" +
    "080\",thistle:\"#d8bfd8\",tomato:\"#ff6347\",turquoise:\"#40e0d0\",violet" +
    ":\"#ee82ee\",wheat:\"#f5deb3\",white:\"#ffffff\",whitesmoke:\"#f5f5f5\",ye" +
    "llow:\"#ffff00\",yellowgreen:\"#9acd32\"};var nc=\"backgroundColor bord" +
    "erTopColor borderRightColor borderBottomColor borderLeftColor colo" +
    "r outlineColor\".split(\" \"),oc=/#([0-9a-fA-F])([0-9a-fA-F])([0-9a-f" +
    "A-F])/,pc=/^#(?:[0-9a-f]{3}){1,2}$/i,qc=/^(?:rgba)?\\((\\d{1,3}),\\s?" +
    "(\\d{1,3}),\\s?(\\d{1,3}),\\s?(0|1|0\\.\\d*)\\)$/i,rc=/^(?:rgb)?\\((0|[1-9" +
    "]\\d{0,2}),\\s?(0|[1-9]\\d{0,2}),\\s?(0|[1-9]\\d{0,2})\\)$/i;function V(" +
    "a,b){return!!a&&1==a.nodeType&&(!b||a.tagName.toUpperCase()==b)}fu" +
    "nction sc(a){return tc(a)&&uc(a)&&\"none\"!=W(a,\"pointer-events\")}fu" +
    "nction vc(a){return V(a,\"OPTION\")?!0:V(a,\"INPUT\")?(a=a.type.toLowe" +
    "rCase(),\"checkbox\"==a||\"radio\"==a):!1}function wc(a){if(!vc(a))thr" +
    "ow new z(15,\"Element is not selectable\");var b=\"selected\",c=a.type" +
    "&&a.type.toLowerCase();if(\"checkbox\"==c||\"radio\"==c)b=\"checked\";re" +
    "turn!!a[b]}var xc=\"BUTTON INPUT OPTGROUP OPTION SELECT TEXTAREA\".s" +
    "plit(\" \");\nfunction uc(a){var b=a.tagName.toUpperCase();return 0<=" +
    "ta(xc,b)?a.disabled?!1:a.parentNode&&1==a.parentNode.nodeType&&\"OP" +
    "TGROUP\"==b||\"OPTION\"==b?uc(a.parentNode):!Na(a,function(a){var b=a" +
    ".parentNode;if(b&&V(b,\"FIELDSET\")&&b.disabled){if(!V(a,\"LEGEND\"))r" +
    "eturn!0;for(;a=p(a.previousElementSibling)?a.previousElementSiblin" +
    "g:Ia(a.previousSibling);)if(V(a,\"LEGEND\"))return!0}return!1},!0):!" +
    "0}\nfunction yc(a){for(a=a.parentNode;a&&1!=a.nodeType&&9!=a.nodeTy" +
    "pe&&11!=a.nodeType;)a=a.parentNode;return V(a)?a:null}\nfunction W(" +
    "a,b){var c=pa(b);if(\"float\"==c||\"cssFloat\"==c||\"styleFloat\"==c)c=\"" +
    "cssFloat\";var d=Ra(a,c)||zc(a,c);if(null===d)d=null;else if(0<=ta(" +
    "nc,c)){b:{var e=d.match(qc);if(e){var c=Number(e[1]),f=Number(e[2]" +
    "),h=Number(e[3]),e=Number(e[4]);if(0<=c&&255>=c&&0<=f&&255>=f&&0<=" +
    "h&&255>=h&&0<=e&&1>=e){c=[c,f,h,e];break b}}c=null}if(!c)b:{if(h=d" +
    ".match(rc))if(c=Number(h[1]),f=Number(h[2]),h=Number(h[3]),0<=c&&2" +
    "55>=c&&0<=f&&255>=f&&0<=h&&255>=h){c=[c,f,h,1];break b}c=null}if(!" +
    "c)b:{c=d.toLowerCase();f=mc[c.toLowerCase()];\nif(!f&&(f=\"#\"==c.cha" +
    "rAt(0)?c:\"#\"+c,4==f.length&&(f=f.replace(oc,\"#$1$1$2$2$3$3\")),!pc." +
    "test(f))){c=null;break b}c=[parseInt(f.substr(1,2),16),parseInt(f." +
    "substr(3,2),16),parseInt(f.substr(5,2),16),1]}d=c?\"rgba(\"+c.join(\"" +
    ", \")+\")\":d}return d}function zc(a,b){var c=a.currentStyle||a.style" +
    ",d=c[b];!p(d)&&fa(c.getPropertyValue)&&(d=c.getPropertyValue(b));r" +
    "eturn\"inherit\"!=d?p(d)?d:null:(c=yc(a))?zc(c,b):null}\nfunction Ac(" +
    "a,b,c){function d(a){var b=Bc(a);return 0<b.height&&0<b.width?!0:V" +
    "(a,\"PATH\")&&(0<b.height||0<b.width)?(a=W(a,\"stroke-width\"),!!a&&0<" +
    "parseInt(a,10)):\"hidden\"!=W(a,\"overflow\")&&va(a.childNodes,functio" +
    "n(a){return 3==a.nodeType||V(a)&&d(a)})}function e(a){return\"hidde" +
    "n\"==Cc(a)&&wa(a.childNodes,function(a){return!V(a)||e(a)||!d(a)})}" +
    "if(!V(a))throw Error(\"Argument to isShown must be of type Element\"" +
    ");if(V(a,\"BODY\"))return!0;if(V(a,\"OPTION\")||V(a,\"OPTGROUP\"))return" +
    " a=Na(a,function(a){return V(a,\n\"SELECT\")}),!!a&&Ac(a,!0,c);var f=" +
    "Dc(a);if(f)return!!f.G&&0<f.rect.width&&0<f.rect.height&&Ac(f.G,b," +
    "c);if(V(a,\"INPUT\")&&\"hidden\"==a.type.toLowerCase()||V(a,\"NOSCRIPT\"" +
    "))return!1;f=W(a,\"visibility\");return\"collapse\"!=f&&\"hidden\"!=f&&c" +
    "(a)&&(b||0!=Ec(a))&&d(a)?!e(a):!1}function tc(a){function b(a){if(" +
    "\"none\"==W(a,\"display\"))return!1;a=yc(a);return!a||b(a)}return Ac(a" +
    ",!0,b)}\nfunction Cc(a,b){function c(a){function b(a){return a==k?!" +
    "0:0==W(a,\"display\").lastIndexOf(\"inline\",0)||\"absolute\"==c&&\"stati" +
    "c\"==W(a,\"position\")?!1:!0}var c=W(a,\"position\");if(\"fixed\"==c)retu" +
    "rn u=!0,a==k?null:k;for(a=yc(a);a&&!b(a);)a=yc(a);return a}functio" +
    "n d(a){var b=a;if(\"visible\"==n)if(a==k&&m)b=m;else if(a==m)return{" +
    "x:\"visible\",y:\"visible\"};b={x:W(b,\"overflow-x\"),y:W(b,\"overflow-y\"" +
    ")};a==k&&(b.x=\"visible\"==b.x?\"auto\":b.x,b.y=\"visible\"==b.y?\"auto\":" +
    "b.y);return b}function e(a){if(a==k){var b=(new Pa(h)).a;\na=b.scro" +
    "llingElement?b.scrollingElement:b.body||b.documentElement;b=b.pare" +
    "ntWindow||b.defaultView;a=new v(b.pageXOffset||a.scrollLeft,b.page" +
    "YOffset||a.scrollTop)}else a=new v(a.scrollLeft,a.scrollTop);retur" +
    "n a}for(var f=Fc(a,b),h=x(a),k=h.documentElement,m=h.body,n=W(k,\"o" +
    "verflow\"),u,F=c(a);F;F=c(F)){var w=d(F);if(\"visible\"!=w.x||\"visibl" +
    "e\"!=w.y){var C=Bc(F);if(0==C.width||0==C.height)return\"hidden\";var" +
    " L=f.right<C.left,oa=f.bottom<C.top;if(L&&\"hidden\"==w.x||oa&&\"hidd" +
    "en\"==w.y)return\"hidden\";if(L&&\"visible\"!=\nw.x||oa&&\"visible\"!=w.y)" +
    "{L=e(F);oa=f.bottom<C.top-L.y;if(f.right<C.left-L.x&&\"visible\"!=w." +
    "x||oa&&\"visible\"!=w.x)return\"hidden\";f=Cc(F);return\"hidden\"==f?\"hi" +
    "dden\":\"scroll\"}L=f.left>=C.left+C.width;C=f.top>=C.top+C.height;if" +
    "(L&&\"hidden\"==w.x||C&&\"hidden\"==w.y)return\"hidden\";if(L&&\"visible\"" +
    "!=w.x||C&&\"visible\"!=w.y){if(u&&(w=e(F),f.left>=k.scrollWidth-w.x|" +
    "|f.right>=k.scrollHeight-w.y))return\"hidden\";f=Cc(F);return\"hidden" +
    "\"==f?\"hidden\":\"scroll\"}}}return\"none\"}\nfunction Bc(a){var b=Dc(a);" +
    "if(b)return b.rect;if(V(a,\"HTML\"))return a=x(a),a=(Ha(a)||window)." +
    "document,a=\"CSS1Compat\"==a.compatMode?a.documentElement:a.body,a=n" +
    "ew Ba(a.clientWidth,a.clientHeight),new y(0,0,a.width,a.height);va" +
    "r c;try{c=a.getBoundingClientRect()}catch(d){return new y(0,0,0,0)" +
    "}return new y(c.left,c.top,c.right-c.left,c.bottom-c.top)}\nfunctio" +
    "n Dc(a){var b=V(a,\"MAP\");if(!b&&!V(a,\"AREA\"))return null;var c=b?a" +
    ":V(a.parentNode,\"MAP\")?a.parentNode:null,d=null,e=null;if(c&&c.nam" +
    "e&&(d=x(c),d=U.K('/descendant::*[@usemap = \"#'+c.name+'\"]',d))&&(e" +
    "=Bc(d),!b&&\"default\"!=a.shape.toLowerCase())){var f=Gc(a);a=Math.m" +
    "in(Math.max(f.left,0),e.width);b=Math.min(Math.max(f.top,0),e.heig" +
    "ht);c=Math.min(f.width,e.width-a);f=Math.min(f.height,e.height-b);" +
    "e=new y(a+e.left,b+e.top,c,f)}return{G:d,rect:e||new y(0,0,0,0)}}\n" +
    "function Gc(a){var b=a.shape.toLowerCase();a=a.coords.split(\",\");i" +
    "f(\"rect\"==b&&4==a.length){var b=a[0],c=a[1];return new y(b,c,a[2]-" +
    "b,a[3]-c)}if(\"circle\"==b&&3==a.length)return b=a[2],new y(a[0]-b,a" +
    "[1]-b,2*b,2*b);if(\"poly\"==b&&2<a.length){for(var b=a[0],c=a[1],d=b" +
    ",e=c,f=2;f+1<a.length;f+=2)b=Math.min(b,a[f]),d=Math.max(d,a[f]),c" +
    "=Math.min(c,a[f+1]),e=Math.max(e,a[f+1]);return new y(b,c,d-b,e-c)" +
    "}return new y(0,0,0,0)}\nfunction Fc(a,b){var c;c=Bc(a);c=new Qa(c." +
    "top,c.left+c.width,c.top+c.height,c.left);if(b){var d=b instanceof" +
    " y?b:new y(b.x,b.y,1,1);c.left=za(c.left+d.left,c.left,c.right);c." +
    "top=za(c.top+d.top,c.top,c.bottom);c.right=za(c.left+d.width,c.lef" +
    "t,c.right);c.bottom=za(c.top+d.height,c.top,c.bottom)}return c}fun" +
    "ction Ec(a){var b=1,c=W(a,\"opacity\");c&&(b=Number(c));(a=yc(a))&&(" +
    "b*=Ec(a));return b};function Hc(){this.a=Ta.document.documentEleme" +
    "nt;this.f=null;var a=Oa(x(this.a));a&&Ic(this,a)}function Ic(a,b){" +
    "a.a=b;V(b,\"OPTION\")?a.f=Na(b,function(a){return V(a,\"SELECT\")}):a." +
    "f=null}\nfunction Jc(a,b,c,d,e,f,h,k){if(!h&&!sc(a.a))return!1;if(e" +
    "&&Kc!=b&&Lc!=b)throw new z(12,\"Event type does not allow related t" +
    "arget: \"+b);c={clientX:c.x,clientY:c.y,button:d,altKey:!1,ctrlKey:" +
    "!1,shiftKey:!1,metaKey:!1,wheelDelta:f||0,relatedTarget:e||null};k" +
    "=k||1;d=a.a;if(b!=Mc&&b!=Nc&&k in Oc)d=Oc[k];else if(a.f)a:switch(" +
    "b){case Mc:case Pc:d=a.f.multiple?a.a:a.f;break a;default:d=a.f.mu" +
    "ltiple?a.a:null}return d?Qc(d,b,c):!0}var Oc={};Wa(4);function Rc(" +
    "a,b,c){this.a=a;this.f=b;this.c=c}Rc.prototype.b=function(a){a=x(a" +
    ").createEvent(\"HTMLEvents\");a.initEvent(this.a,this.f,this.c);retu" +
    "rn a};Rc.prototype.toString=g(\"a\");function X(a,b,c){Rc.call(this," +
    "a,b,c)}r(X,Rc);\nX.prototype.b=function(a,b){if(this==Sc)throw new " +
    "z(9,\"Browser does not support a mouse pixel scroll event.\");var c=" +
    "x(a),d=Ha(c),c=c.createEvent(\"MouseEvents\");this==Tc&&(c.wheelDelt" +
    "a=b.wheelDelta);c.initMouseEvent(this.a,this.f,this.c,d,1,b.client" +
    "X,b.clientY,b.clientX,b.clientY,b.ctrlKey,b.altKey,b.shiftKey,b.me" +
    "taKey,b.button,b.relatedTarget);return c};\nvar Uc=new Rc(\"change\"," +
    "!0,!1),Mc=new X(\"click\",!0,!0),Vc=new X(\"contextmenu\",!0,!0),Wc=ne" +
    "w X(\"dblclick\",!0,!0),Nc=new X(\"mousedown\",!0,!0),Xc=new X(\"mousem" +
    "ove\",!0,!1),Lc=new X(\"mouseout\",!0,!0),Kc=new X(\"mouseover\",!0,!0)" +
    ",Pc=new X(\"mouseup\",!0,!0),Tc=new X(\"mousewheel\",!0,!0),Sc=new X(\"" +
    "MozMousePixelScroll\",!0,!0);function Qc(a,b,c){b=b.b(a,c);\"isTrust" +
    "ed\"in b||(b.isTrusted=!1);return a.dispatchEvent(b)};var Yc=\"StopI" +
    "teration\"in ba?ba.StopIteration:{message:\"StopIteration\",stack:\"\"}" +
    ";function Zc(){}Zc.prototype.a=function(){throw Yc;};Zc.prototype." +
    "J=function(){return this};function $c(a,b){this.w={};this.l=[];thi" +
    "s.b=this.a=0;var c=arguments.length;if(1<c){if(c%2)throw Error(\"Un" +
    "even number of arguments\");for(var d=0;d<c;d+=2)ad(this,arguments[" +
    "d],arguments[d+1])}else if(a){var e;if(a instanceof $c)for(d=bd(a)" +
    ",cd(a),e=[],c=0;c<a.l.length;c++)e.push(a.w[a.l[c]]);else{var c=[]" +
    ",f=0;for(d in a)c[f++]=d;d=c;c=[];f=0;for(e in a)c[f++]=a[e];e=c}f" +
    "or(c=0;c<d.length;c++)ad(this,d[c],e[c])}}function bd(a){cd(a);ret" +
    "urn a.l.concat()}l=$c.prototype;\nl.clear=function(){this.w={};this" +
    ".b=this.a=this.l.length=0};function cd(a){if(a.a!=a.l.length){for(" +
    "var b=0,c=0;b<a.l.length;){var d=a.l[b];Object.prototype.hasOwnPro" +
    "perty.call(a.w,d)&&(a.l[c++]=d);b++}a.l.length=c}if(a.a!=a.l.lengt" +
    "h){for(var e={},c=b=0;b<a.l.length;)d=a.l[b],Object.prototype.hasO" +
    "wnProperty.call(e,d)||(a.l[c++]=d,e[d]=1),b++;a.l.length=c}}l.get=" +
    "function(a,b){return Object.prototype.hasOwnProperty.call(this.w,a" +
    ")?this.w[a]:b};\nfunction ad(a,b,c){Object.prototype.hasOwnProperty" +
    ".call(a.w,b)||(a.a++,a.l.push(b),a.b++);a.w[b]=c}l.forEach=functio" +
    "n(a,b){for(var c=bd(this),d=0;d<c.length;d++){var e=c[d],f=this.ge" +
    "t(e);a.call(b,f,e,this)}};l.clone=function(){return new $c(this)};" +
    "l.J=function(a){cd(this);var b=0,c=this.b,d=this,e=new Zc;e.a=func" +
    "tion(){if(c!=d.b)throw Error(\"The map has changed since the iterat" +
    "or was created\");if(b>=d.l.length)throw Yc;var e=d.l[b++];return a" +
    "?e:d.w[e]};return e};var dd={};function Y(a,b,c){var d=typeof a;(\"" +
    "object\"==d&&null!=a||\"function\"==d)&&(a=a.g);a=new ed(a);!b||b in " +
    "dd&&!c||(dd[b]={key:a,shift:!1},c&&(dd[c]={key:a,shift:!0}));retur" +
    "n a}function ed(a){this.code=a}Y(8);Y(9);Y(13);var fd=Y(16),gd=Y(1" +
    "7),hd=Y(18);Y(19);Y(20);Y(27);Y(32,\" \");Y(33);Y(34);Y(35);Y(36);Y(" +
    "37);Y(38);Y(39);Y(40);Y(44);Y(45);Y(46);Y(48,\"0\",\")\");Y(49,\"1\",\"!\"" +
    ");Y(50,\"2\",\"@\");Y(51,\"3\",\"#\");Y(52,\"4\",\"$\");Y(53,\"5\",\"%\");Y(54,\"6\"" +
    ",\"^\");Y(55,\"7\",\"&\");Y(56,\"8\",\"*\");Y(57,\"9\",\"(\");Y(65,\"a\",\"A\");\nY(6" +
    "6,\"b\",\"B\");Y(67,\"c\",\"C\");Y(68,\"d\",\"D\");Y(69,\"e\",\"E\");Y(70,\"f\",\"F\")" +
    ";Y(71,\"g\",\"G\");Y(72,\"h\",\"H\");Y(73,\"i\",\"I\");Y(74,\"j\",\"J\");Y(75,\"k\"," +
    "\"K\");Y(76,\"l\",\"L\");Y(77,\"m\",\"M\");Y(78,\"n\",\"N\");Y(79,\"o\",\"O\");Y(80," +
    "\"p\",\"P\");Y(81,\"q\",\"Q\");Y(82,\"r\",\"R\");Y(83,\"s\",\"S\");Y(84,\"t\",\"T\");Y" +
    "(85,\"u\",\"U\");Y(86,\"v\",\"V\");Y(87,\"w\",\"W\");Y(88,\"x\",\"X\");Y(89,\"y\",\"Y" +
    "\");Y(90,\"z\",\"Z\");var id=Y(Ga?{i:91,g:91}:Fa?{i:224,g:91}:{i:0,g:91" +
    "});Y(Ga?{i:92,g:92}:Fa?{i:224,g:93}:{i:0,g:92});Y(Ga?{i:93,g:93}:F" +
    "a?{i:0,g:0}:{i:93,g:null});\nY({i:96,g:96},\"0\");Y({i:97,g:97},\"1\");" +
    "Y({i:98,g:98},\"2\");Y({i:99,g:99},\"3\");Y({i:100,g:100},\"4\");Y({i:10" +
    "1,g:101},\"5\");Y({i:102,g:102},\"6\");Y({i:103,g:103},\"7\");Y({i:104,g" +
    ":104},\"8\");Y({i:105,g:105},\"9\");Y({i:106,g:106},\"*\");Y({i:107,g:10" +
    "7},\"+\");Y({i:109,g:109},\"-\");Y({i:110,g:110},\".\");Y({i:111,g:111}," +
    "\"/\");Y(144);Y(112);Y(113);Y(114);Y(115);Y(116);Y(117);Y(118);Y(119" +
    ");Y(120);Y(121);Y(122);Y(123);Y({i:107,g:187},\"=\",\"+\");Y(108,\",\");" +
    "Y({i:109,g:189},\"-\",\"_\");Y(188,\",\",\"<\");Y(190,\".\",\">\");Y(191,\"/\",\"" +
    "?\");\nY(192,\"`\",\"~\");Y(219,\"[\",\"{\");Y(220,\"\\\\\",\"|\");Y(221,\"]\",\"}\");" +
    "Y({i:59,g:186},\";\",\":\");Y(222,\"'\",'\"');var jd=new $c;ad(jd,1,fd);a" +
    "d(jd,2,gd);ad(jd,4,hd);ad(jd,8,id);(function(a){var b=new $c;t(bd(" +
    "a),function(c){ad(b,a.get(c).code,c)});return b})(jd);function kd(" +
    "a){Hc.call(this);this.s=this.b=null;this.c=new v(0,0);this.A=this." +
    "h=!1;if(a){ea(a.buttonPressed)&&(this.b=a.buttonPressed);try{V(a.e" +
    "lementPressed)&&(this.s=a.elementPressed)}catch(b){this.b=null}thi" +
    "s.c=new v(a.clientXY.x,a.clientXY.y);this.h=!!a.nextClickIsDoubleC" +
    "lick;this.A=!!a.hasEverInteracted;try{a.element&&V(a.element)&&Ic(" +
    "this,a.element)}catch(c){this.b=null}}}r(kd,Hc);var Z={};Z[Mc]=[0," +
    "1,2,null];Z[Vc]=[null,null,2,null];Z[Pc]=[0,1,2,null];Z[Lc]=[0,1,2" +
    ",0];Z[Xc]=[0,1,2,0];Z[Wc]=Z[Mc];\nZ[Nc]=Z[Pc];Z[Kc]=Z[Lc];function " +
    "ld(a,b,c,d,e){a.A=!0;return Jc(a,b,a.c,md(a,b),c,d,e)}function md(" +
    "a,b){if(!(b in Z))return 0;var c=Z[b][null===a.b?3:a.b];if(null===" +
    "c)throw new z(13,\"Event does not permit the specified mouse button" +
    ".\");return c};function nd(a){var b;(b=Ra(a,\"display\"))||(b=a.curre" +
    "ntStyle?a.currentStyle.display:null);if(\"none\"!=(b||a.style&&a.sty" +
    "le.display))b=Sa(a);else{b=a.style;var c=b.display,d=b.visibility," +
    "e=b.position;b.visibility=\"hidden\";b.position=\"absolute\";b.display" +
    "=\"inline\";var f=Sa(a);b.display=c;b.position=e;b.visibility=d;b=f}" +
    "return 0<b.width&&0<b.height||!a.offsetParent?b:nd(a.offsetParent)" +
    "};ca(\"_\",function(a,b,c){if(!tc(a))throw new z(11,\"Element is not " +
    "currently visible and may not be manipulated\");b:{var d=b||void 0;" +
    "if(\"scroll\"==Cc(a,d)){if(a.scrollIntoView&&(a.scrollIntoView(),\"no" +
    "ne\"==Cc(a,d)))break b;for(var e=Fc(a,d),f=yc(a);f;f=yc(f)){var h=f" +
    ",k=Bc(h),m,n=h,u=m=void 0,F=void 0,w=void 0,w=Ra(n,\"borderLeftWidt" +
    "h\"),F=Ra(n,\"borderRightWidth\"),u=Ra(n,\"borderTopWidth\");m=Ra(n,\"bo" +
    "rderBottomWidth\");m=new Qa(parseFloat(u),parseFloat(F),parseFloat(" +
    "m),parseFloat(w));n=e.left-k.left-m.left;\nk=e.top-k.top-m.top;m=h." +
    "clientHeight+e.top-e.bottom;h.scrollLeft+=Math.min(n,Math.max(n-(h" +
    ".clientWidth+e.left-e.right),0));h.scrollTop+=Math.min(k,Math.max(" +
    "k-m,0))}Cc(a,d)}}b?b=new Aa(b.x,b.y):(b=nd(a),b=new Aa(b.width/2,b" +
    ".height/2));c=c||new kd;d=b;b=sc(a);e=Bc(a);c.c.x=d.x+e.left;c.c.y" +
    "=d.y+e.top;d=c.a;if(a!=d){try{Ha(x(d)).closed&&(d=null)}catch(C){d" +
    "=null}d&&(e=d===Ta.document.documentElement||d===Ta.document.body," +
    "d=!c.A&&e?null:d,ld(c,Lc,a));Ic(c,a);ld(c,Kc,d,null,b)}ld(c,Xc,nul" +
    "l,null,b);c.h=!1;\nif(null!==c.b)throw new z(13,\"Cannot press more " +
    "then one button or an already pressed button.\");c.b=0;c.s=c.a;if(V" +
    "(c.a,\"OPTION\")||V(c.a,\"SELECT\")||ld(c,Nc))if(a=c.f||c.a,b=Oa(x(a))" +
    ",a!=b){if(b&&fa(b.blur)&&!V(b,\"BODY\"))try{b.blur()}catch(L){throw " +
    "L;}fa(a.focus)&&a.focus()}if(null===c.b)throw new z(13,\"Cannot rel" +
    "ease a button when no button is pressed.\");c.f&&sc(c.a)&&(a=c.f,b=" +
    "wc(c.a),!b||a.multiple)&&(c.a.selected=!b,a.multiple&&!Wa(4)||Qc(a" +
    ",Uc));a=sc(c.a);ld(c,Pc);if(0==c.b&&c.a==c.s){b=c.c;d=md(c,\nMc);if" +
    "(a||sc(c.a))!c.f&&vc(c.a)&&wc(c.a),Jc(c,Mc,b,d,null,0,a,void 0);c." +
    "h&&ld(c,Wc);c.h=!c.h}else 2==c.b&&ld(c,Vc);Oc={};c.b=null;c.s=null" +
    "});;return this._.apply(null,arguments);}).apply({navigator:typeof" +
    " window!=\"undefined\"?window.navigator:null},arguments);}\n"
  )
  .toString();
  static final String CLICK_ANDROID_license =
    "\n\n Copyright 2014 Software Freedom Conservancy\n\n Licensed under th" +
    "e Apache License, Version 2.0 (the \"License\");\n you may not use th" +
    "is file except in compliance with the License.\n You may obtain a c" +
    "opy of the License at\n\n      http://www.apache.org/licenses/LICENS" +
    "E-2.0\n\n Unless required by applicable law or agreed to in writing," +
    " software\n distributed under the License is distributed on an \"AS " +
    "IS\" BASIS,\n WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either e" +
    "xpress or implied.\n See the License for the specific language gove" +
    "rning permissions and\n limitations under the License.\n";
  private static final String CLICK_ANDROID_original() {
    return CLICK_ANDROID.replaceAll("xxx_rpl_lic", CLICK_ANDROID_license);
  }

/* field: FIND_ELEMENT_ANDROID license: 

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
  static final String FIND_ELEMENT_ANDROID =
  new StringBuilder(
    "function(){return(function(){function l(a){return function(){retur" +
    "n this[a]}}function n(a){return function(){return a}}var aa=this;f" +
    "unction q(a){return void 0!==a}function ba(a,b){var c=a.split(\".\")" +
    ",d=aa;c[0]in d||!d.execScript||d.execScript(\"var \"+c[0]);for(var e" +
    ";c.length&&(e=c.shift());)!c.length&&q(b)?d[e]=b:d[e]?d=d[e]:d=d[e" +
    "]={}}\nfunction ca(a){var b=typeof a;if(\"object\"==b)if(a){if(a inst" +
    "anceof Array)return\"array\";if(a instanceof Object)return b;var c=O" +
    "bject.prototype.toString.call(a);if(\"[object Window]\"==c)return\"ob" +
    "ject\";if(\"[object Array]\"==c||\"number\"==typeof a.length&&\"undefine" +
    "d\"!=typeof a.splice&&\"undefined\"!=typeof a.propertyIsEnumerable&&!" +
    "a.propertyIsEnumerable(\"splice\"))return\"array\";if(\"[object Functio" +
    "n]\"==c||\"undefined\"!=typeof a.call&&\"undefined\"!=typeof a.property" +
    "IsEnumerable&&!a.propertyIsEnumerable(\"call\"))return\"function\"}els" +
    "e return\"null\";\nelse if(\"function\"==b&&\"undefined\"==typeof a.call)" +
    "return\"object\";return b}function r(a){return\"string\"==typeof a}fun" +
    "ction da(a){return\"function\"==ca(a)}function ea(a,b,c){return a.ca" +
    "ll.apply(a.bind,arguments)}function fa(a,b,c){if(!a)throw Error();" +
    "if(2<arguments.length){var d=Array.prototype.slice.call(arguments," +
    "2);return function(){var c=Array.prototype.slice.call(arguments);A" +
    "rray.prototype.unshift.apply(c,d);return a.apply(b,c)}}return func" +
    "tion(){return a.apply(b,arguments)}}\nfunction ga(a,b,c){ga=Functio" +
    "n.prototype.bind&&-1!=Function.prototype.bind.toString().indexOf(\"" +
    "native code\")?ea:fa;return ga.apply(null,arguments)}function ha(a," +
    "b){var c=Array.prototype.slice.call(arguments,1);return function()" +
    "{var b=c.slice();b.push.apply(b,arguments);return a.apply(this,b)}" +
    "}\nfunction t(a,b){function c(){}c.prototype=b.prototype;a.P=b.prot" +
    "otype;a.prototype=new c;a.prototype.constructor=a;a.O=function(a,c" +
    ",f){for(var g=Array(arguments.length-2),k=2;k<arguments.length;k++" +
    ")g[k-2]=arguments[k];return b.prototype[c].apply(a,g)}};function i" +
    "a(a){if(Error.captureStackTrace)Error.captureStackTrace(this,ia);e" +
    "lse{var b=Error().stack;b&&(this.stack=b)}a&&(this.message=String(" +
    "a))}t(ia,Error);ia.prototype.name=\"CustomError\";var ja;function ka" +
    "(a){var b=a.length-1;return 0<=b&&a.indexOf(\" \",b)==b}function la(" +
    "a,b){for(var c=a.split(\"%s\"),d=\"\",e=Array.prototype.slice.call(arg" +
    "uments,1);e.length&&1<c.length;)d+=c.shift()+e.shift();return d+c." +
    "join(\"%s\")}var ma=String.prototype.trim?function(a){return a.trim(" +
    ")}:function(a){return a.replace(/^[\\s\\xa0]+|[\\s\\xa0]+$/g,\"\")};func" +
    "tion na(a,b){return a<b?-1:a>b?1:0}function oa(a){return String(a)" +
    ".replace(/\\-([a-z])/g,function(a,c){return c.toUpperCase()})};func" +
    "tion pa(a,b){b.unshift(a);ia.call(this,la.apply(null,b));b.shift()" +
    "}t(pa,ia);pa.prototype.name=\"AssertionError\";function qa(a,b,c){if" +
    "(!a){var d=\"Assertion failed\";if(b)var d=d+(\": \"+b),e=Array.protot" +
    "ype.slice.call(arguments,2);throw new pa(\"\"+d,e||[]);}};var ra=Arr" +
    "ay.prototype;function sa(a,b){if(r(a))return r(b)&&1==b.length?a.i" +
    "ndexOf(b,0):-1;for(var c=0;c<a.length;c++)if(c in a&&a[c]===b)retu" +
    "rn c;return-1}function u(a,b){for(var c=a.length,d=r(a)?a.split(\"\"" +
    "):a,e=0;e<c;e++)e in d&&b.call(void 0,d[e],e,a)}function ta(a,b){f" +
    "or(var c=a.length,d=[],e=0,f=r(a)?a.split(\"\"):a,g=0;g<c;g++)if(g i" +
    "n f){var k=f[g];b.call(void 0,k,g,a)&&(d[e++]=k)}return d}function" +
    " ua(a,b,c){var d=c;u(a,function(c,f){d=b.call(void 0,d,c,f,a)});re" +
    "turn d}\nfunction va(a,b){for(var c=a.length,d=r(a)?a.split(\"\"):a,e" +
    "=0;e<c;e++)if(e in d&&b.call(void 0,d[e],e,a))return!0;return!1}fu" +
    "nction wa(a,b){for(var c=a.length,d=r(a)?a.split(\"\"):a,e=0;e<c;e++" +
    ")if(e in d&&!b.call(void 0,d[e],e,a))return!1;return!0}function xa" +
    "(a,b){var c;a:{c=a.length;for(var d=r(a)?a.split(\"\"):a,e=0;e<c;e++" +
    ")if(e in d&&b.call(void 0,d[e],e,a)){c=e;break a}c=-1}return 0>c?n" +
    "ull:r(a)?a.charAt(c):a[c]}function ya(a){return ra.concat.apply(ra" +
    ",arguments)}\nfunction za(a,b,c){qa(null!=a.length);return 2>=argum" +
    "ents.length?ra.slice.call(a,b):ra.slice.call(a,b,c)};/*xxx_rpl_lic" +
    "*/\nvar Aa=window;function v(a,b){this.x=q(a)?a:0;this.y=q(b)?b:0}v" +
    ".prototype.clone=function(){return new v(this.x,this.y)};v.prototy" +
    "pe.toString=function(){return\"(\"+this.x+\", \"+this.y+\")\"};v.prototy" +
    "pe.ceil=function(){this.x=Math.ceil(this.x);this.y=Math.ceil(this." +
    "y);return this};v.prototype.floor=function(){this.x=Math.floor(thi" +
    "s.x);this.y=Math.floor(this.y);return this};v.prototype.round=func" +
    "tion(){this.x=Math.round(this.x);this.y=Math.round(this.y);return " +
    "this};function Ba(a,b){this.width=a;this.height=b}Ba.prototype.clo" +
    "ne=function(){return new Ba(this.width,this.height)};Ba.prototype." +
    "toString=function(){return\"(\"+this.width+\" x \"+this.height+\")\"};Ba" +
    ".prototype.ceil=function(){this.width=Math.ceil(this.width);this.h" +
    "eight=Math.ceil(this.height);return this};Ba.prototype.floor=funct" +
    "ion(){this.width=Math.floor(this.width);this.height=Math.floor(thi" +
    "s.height);return this};\nBa.prototype.round=function(){this.width=M" +
    "ath.round(this.width);this.height=Math.round(this.height);return t" +
    "his};var Ca;a:{var Da=aa.navigator;if(Da){var Ea=Da.userAgent;if(E" +
    "a){Ca=Ea;break a}}Ca=\"\"};function w(a){return a?new Fa(x(a)):ja||(" +
    "ja=new Fa)}function Ga(a){for(;a&&1!=a.nodeType;)a=a.previousSibli" +
    "ng;return a}function Ha(a,b){if(a.contains&&1==b.nodeType)return a" +
    "==b||a.contains(b);if(\"undefined\"!=typeof a.compareDocumentPositio" +
    "n)return a==b||Boolean(a.compareDocumentPosition(b)&16);for(;b&&a!" +
    "=b;)b=b.parentNode;return b==a}\nfunction Ia(a,b){if(a==b)return 0;" +
    "if(a.compareDocumentPosition)return a.compareDocumentPosition(b)&2" +
    "?1:-1;if(\"sourceIndex\"in a||a.parentNode&&\"sourceIndex\"in a.parent" +
    "Node){var c=1==a.nodeType,d=1==b.nodeType;if(c&&d)return a.sourceI" +
    "ndex-b.sourceIndex;var e=a.parentNode,f=b.parentNode;return e==f?J" +
    "a(a,b):!c&&Ha(e,b)?-1*Ka(a,b):!d&&Ha(f,a)?Ka(b,a):(c?a.sourceIndex" +
    ":e.sourceIndex)-(d?b.sourceIndex:f.sourceIndex)}d=x(a);c=d.createR" +
    "ange();c.selectNode(a);c.collapse(!0);d=d.createRange();d.selectNo" +
    "de(b);\nd.collapse(!0);return c.compareBoundaryPoints(aa.Range.STAR" +
    "T_TO_END,d)}function Ka(a,b){var c=a.parentNode;if(c==b)return-1;f" +
    "or(var d=b;d.parentNode!=c;)d=d.parentNode;return Ja(d,a)}function" +
    " Ja(a,b){for(var c=b;c=c.previousSibling;)if(c==a)return-1;return " +
    "1}function x(a){qa(a,\"Node cannot be null or undefined.\");return 9" +
    "==a.nodeType?a:a.ownerDocument||a.document}function La(a,b){a=a.pa" +
    "rentNode;for(var c=0;a;){qa(\"parentNode\"!=a.name);if(b(a))return a" +
    ";a=a.parentNode;c++}return null}\nfunction Fa(a){this.a=a||aa.docum" +
    "ent||document}\nfunction y(a,b,c,d){a=d||a.a;var e=b&&\"*\"!=b?b.toUp" +
    "perCase():\"\";if(a.querySelectorAll&&a.querySelector&&(e||c))c=a.qu" +
    "erySelectorAll(e+(c?\".\"+c:\"\"));else if(c&&a.getElementsByClassName" +
    ")if(b=a.getElementsByClassName(c),e){a={};for(var f=d=0,g;g=b[f];f" +
    "++)e==g.nodeName&&(a[d++]=g);a.length=d;c=a}else c=b;else if(b=a.g" +
    "etElementsByTagName(e||\"*\"),c){a={};for(f=d=0;g=b[f];f++){var e=g." +
    "className,k;if(k=\"function\"==typeof e.split)k=0<=sa(e.split(/\\s+/)" +
    ",c);k&&(a[d++]=g)}a.length=d;c=a}else c=b;return c};function z(a,b" +
    "){this.a=Ma[a]||\"unknown error\";this.message=b||\"\";var c=this.a.re" +
    "place(/((?:^|\\s+)[a-z])/g,function(a){return a.toUpperCase().repla" +
    "ce(/^[\\s\\xa0]+/g,\"\")}),d=c.length-5;if(0>d||c.indexOf(\"Error\",d)!=" +
    "d)c+=\"Error\";this.name=c;c=Error(this.message);c.name=this.name;th" +
    "is.stack=c.stack||\"\"}t(z,Error);\nvar Ma={15:\"element not selectabl" +
    "e\",11:\"element not visible\",31:\"unknown error\",30:\"unknown error\"," +
    "24:\"invalid cookie domain\",29:\"invalid element coordinates\",12:\"in" +
    "valid element state\",32:\"invalid selector\",51:\"invalid selector\",5" +
    "2:\"invalid selector\",17:\"javascript error\",405:\"unsupported operat" +
    "ion\",34:\"move target out of bounds\",27:\"no such alert\",7:\"no such " +
    "element\",8:\"no such frame\",23:\"no such window\",28:\"script timeout\"" +
    ",33:\"session not created\",10:\"stale element reference\",21:\"timeout" +
    "\",25:\"unable to set cookie\",\n26:\"unexpected alert open\",13:\"unknow" +
    "n error\",9:\"unknown command\"};z.prototype.toString=function(){retu" +
    "rn this.name+\": \"+this.message};var Na={w:function(a){return!(!a.q" +
    "uerySelectorAll||!a.querySelector)},o:function(a,b){if(!a)throw ne" +
    "w z(32,\"No class name specified\");a=ma(a);if(-1!==a.indexOf(\" \"))t" +
    "hrow new z(32,\"Compound class names not permitted\");if(Na.w(b))try" +
    "{return b.querySelector(\".\"+a.replace(/\\./g,\"\\\\.\"))||null}catch(c)" +
    "{throw new z(32,\"An invalid or illegal class name was specified\");" +
    "}var d=y(w(b),\"*\",a,b);return d.length?d[0]:null},s:function(a,b){" +
    "if(!a)throw new z(32,\"No class name specified\");a=ma(a);if(-1!==a." +
    "indexOf(\" \"))throw new z(32,\n\"Compound class names not permitted\")" +
    ";if(Na.w(b))try{return b.querySelectorAll(\".\"+a.replace(/\\./g,\"\\\\." +
    "\"))}catch(c){throw new z(32,\"An invalid or illegal class name was " +
    "specified\");}return y(w(b),\"*\",a,b)}};function Oa(a){return(a=a.ex" +
    "ec(Ca))?a[1]:\"\"}Oa(/Android\\s+([0-9.]+)/)||Oa(/Version\\/([0-9.]+)/" +
    ");function Pa(a){var b=0,c=ma(String(Qa)).split(\".\");a=ma(String(a" +
    ")).split(\".\");for(var d=Math.max(c.length,a.length),e=0;0==b&&e<d;" +
    "e++){var f=c[e]||\"\",g=a[e]||\"\",k=RegExp(\"(\\\\d*)(\\\\D*)\",\"g\"),p=RegE" +
    "xp(\"(\\\\d*)(\\\\D*)\",\"g\");do{var m=k.exec(f)||[\"\",\"\",\"\"],h=p.exec(g)|" +
    "|[\"\",\"\",\"\"];if(0==m[0].length&&0==h[0].length)break;b=na(0==m[1].l" +
    "ength?0:parseInt(m[1],10),0==h[1].length?0:parseInt(h[1],10))||na(" +
    "0==m[2].length,0==h[2].length)||na(m[2],h[2])}while(0==b)}}\nvar Ra" +
    "=/Android\\s+([0-9\\.]+)/.exec(Ca),Qa=Ra?Ra[1]:\"0\";Pa(2.3);Pa(4);var" +
    " Sa={o:function(a,b){da(b.querySelector);if(!a)throw new z(32,\"No " +
    "selector specified\");a=ma(a);var c;try{c=b.querySelector(a)}catch(" +
    "d){throw new z(32,\"An invalid or illegal selector was specified\");" +
    "}return c&&1==c.nodeType?c:null},s:function(a,b){da(b.querySelecto" +
    "rAll);if(!a)throw new z(32,\"No selector specified\");a=ma(a);try{re" +
    "turn b.querySelectorAll(a)}catch(c){throw new z(32,\"An invalid or " +
    "illegal selector was specified\");}}};function Ta(a,b,c,d){this.top" +
    "=a;this.right=b;this.bottom=c;this.left=d}Ta.prototype.clone=funct" +
    "ion(){return new Ta(this.top,this.right,this.bottom,this.left)};Ta" +
    ".prototype.toString=function(){return\"(\"+this.top+\"t, \"+this.right" +
    "+\"r, \"+this.bottom+\"b, \"+this.left+\"l)\"};Ta.prototype.ceil=functio" +
    "n(){this.top=Math.ceil(this.top);this.right=Math.ceil(this.right);" +
    "this.bottom=Math.ceil(this.bottom);this.left=Math.ceil(this.left);" +
    "return this};\nTa.prototype.floor=function(){this.top=Math.floor(th" +
    "is.top);this.right=Math.floor(this.right);this.bottom=Math.floor(t" +
    "his.bottom);this.left=Math.floor(this.left);return this};Ta.protot" +
    "ype.round=function(){this.top=Math.round(this.top);this.right=Math" +
    ".round(this.right);this.bottom=Math.round(this.bottom);this.left=M" +
    "ath.round(this.left);return this};function A(a,b,c,d){this.left=a;" +
    "this.top=b;this.width=c;this.height=d}A.prototype.clone=function()" +
    "{return new A(this.left,this.top,this.width,this.height)};A.protot" +
    "ype.toString=function(){return\"(\"+this.left+\", \"+this.top+\" - \"+th" +
    "is.width+\"w x \"+this.height+\"h)\"};A.prototype.ceil=function(){this" +
    ".left=Math.ceil(this.left);this.top=Math.ceil(this.top);this.width" +
    "=Math.ceil(this.width);this.height=Math.ceil(this.height);return t" +
    "his};\nA.prototype.floor=function(){this.left=Math.floor(this.left)" +
    ";this.top=Math.floor(this.top);this.width=Math.floor(this.width);t" +
    "his.height=Math.floor(this.height);return this};A.prototype.round=" +
    "function(){this.left=Math.round(this.left);this.top=Math.round(thi" +
    "s.top);this.width=Math.round(this.width);this.height=Math.round(th" +
    "is.height);return this};/*\n\n The MIT License\n\n Copyright (c) 2007 " +
    "Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is " +
    "hereby granted, free of charge, to any person obtaining a copy\n of" +
    " this software and associated documentation files (the \"Software\")" +
    ", to\n deal in the Software without restriction, including without " +
    "limitation the\n rights to use, copy, modify, merge, publish, distr" +
    "ibute, sublicense, and/or\n sell copies of the Software, and to per" +
    "mit persons to whom the Software is\n furnished to do so, subject t" +
    "o the following conditions:\n\n The above copyright notice and this " +
    "permission notice shall be included in\n all copies or substantial " +
    "portions of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITH" +
    "OUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT L" +
    "IMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTIC" +
    "ULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS O" +
    "R COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIA" +
    "BILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISI" +
    "NG\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR " +
    "OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction Ua(a,b,c){this.a=a;th" +
    "is.b=b||1;this.f=c||1};function Va(a){this.b=a;this.a=0}function W" +
    "a(a){a=a.match(Xa);for(var b=0;b<a.length;b++)Ya.test(a[b])&&a.spl" +
    "ice(b,1);return new Va(a)}var Xa=RegExp(\"\\\\$?(?:(?![0-9-])[\\\\w-]+:" +
    ")?(?![0-9-])[\\\\w-]+|\\\\/\\\\/|\\\\.\\\\.|::|\\\\d+(?:\\\\.\\\\d*)?|\\\\.\\\\d+|\\\"[^" +
    "\\\"]*\\\"|'[^']*'|[!<>]=|\\\\s+|.\",\"g\"),Ya=/^\\s/;function C(a,b){return" +
    " a.b[a.a+(b||0)]}function D(a){return a.b[a.a++]}function Za(a){re" +
    "turn a.b.length<=a.a};function E(a){var b=null,c=a.nodeType;1==c&&" +
    "(b=a.textContent,b=void 0==b||null==b?a.innerText:b,b=void 0==b||n" +
    "ull==b?\"\":b);if(\"string\"!=typeof b)if(9==c||1==c){a=9==c?a.documen" +
    "tElement:a.firstChild;for(var c=0,d=[],b=\"\";a;){do 1!=a.nodeType&&" +
    "(b+=a.nodeValue),d[c++]=a;while(a=a.firstChild);for(;c&&!(a=d[--c]" +
    ".nextSibling););}}else b=a.nodeValue;return\"\"+b}\nfunction $a(a,b,c" +
    "){if(null===b)return!0;try{if(!a.getAttribute)return!1}catch(d){re" +
    "turn!1}return null==c?!!a.getAttribute(b):a.getAttribute(b,2)==c}f" +
    "unction ab(a,b,c,d,e){return bb.call(null,a,b,r(c)?c:null,r(d)?d:n" +
    "ull,e||new F)}\nfunction bb(a,b,c,d,e){b.getElementsByName&&d&&\"nam" +
    "e\"==c?(b=b.getElementsByName(d),u(b,function(b){a.a(b)&&G(e,b)})):" +
    "b.getElementsByClassName&&d&&\"class\"==c?(b=b.getElementsByClassNam" +
    "e(d),u(b,function(b){b.className==d&&a.a(b)&&G(e,b)})):a instanceo" +
    "f H?cb(a,b,c,d,e):b.getElementsByTagName&&(b=b.getElementsByTagNam" +
    "e(a.f()),u(b,function(a){$a(a,c,d)&&G(e,a)}));return e}function db" +
    "(a,b,c,d,e){for(b=b.firstChild;b;b=b.nextSibling)$a(b,c,d)&&a.a(b)" +
    "&&G(e,b);return e}\nfunction cb(a,b,c,d,e){for(b=b.firstChild;b;b=b" +
    ".nextSibling)$a(b,c,d)&&a.a(b)&&G(e,b),cb(a,b,c,d,e)};function F()" +
    "{this.b=this.a=null;this.l=0}function eb(a){this.node=a;this.a=thi" +
    "s.b=null}function fb(a,b){if(!a.a)return b;if(!b.a)return a;for(va" +
    "r c=a.a,d=b.a,e=null,f=null,g=0;c&&d;)c.node==d.node?(f=c,c=c.a,d=" +
    "d.a):0<Ia(c.node,d.node)?(f=d,d=d.a):(f=c,c=c.a),(f.b=e)?e.a=f:a.a" +
    "=f,e=f,g++;for(f=c||d;f;)f.b=e,e=e.a=f,g++,f=f.a;a.b=e;a.l=g;retur" +
    "n a}function gb(a,b){var c=new eb(b);c.a=a.a;a.b?a.a.b=c:a.a=a.b=c" +
    ";a.a=c;a.l++}function G(a,b){var c=new eb(b);c.b=a.b;a.a?a.b.a=c:a" +
    ".a=a.b=c;a.b=c;a.l++}\nfunction hb(a){return(a=a.a)?a.node:null}fun" +
    "ction ib(a){return(a=hb(a))?E(a):\"\"}function I(a,b){return new jb(" +
    "a,!!b)}function jb(a,b){this.f=a;this.b=(this.c=b)?a.b:a.a;this.a=" +
    "null}function J(a){var b=a.b;if(null==b)return null;var c=a.a=b;a." +
    "b=a.c?b.b:b.a;return c.node};function kb(a){switch(a.nodeType){cas" +
    "e 1:return ha(lb,a);case 9:return kb(a.documentElement);case 11:ca" +
    "se 10:case 6:case 12:return mb;default:return a.parentNode?kb(a.pa" +
    "rentNode):mb}}function mb(){return null}function lb(a,b){if(a.pref" +
    "ix==b)return a.namespaceURI||\"http://www.w3.org/1999/xhtml\";var c=" +
    "a.getAttributeNode(\"xmlns:\"+b);return c&&c.specified?c.value||null" +
    ":a.parentNode&&9!=a.parentNode.nodeType?lb(a.parentNode,b):null};f" +
    "unction K(a){this.i=a;this.b=this.g=!1;this.f=null}function L(a){r" +
    "eturn\"\\n  \"+a.toString().split(\"\\n\").join(\"\\n  \")}function nb(a,b)" +
    "{a.g=b}function ob(a,b){a.b=b}function M(a,b){var c=a.a(b);return " +
    "c instanceof F?+ib(c):+c}function O(a,b){var c=a.a(b);return c ins" +
    "tanceof F?ib(c):\"\"+c}function pb(a,b){var c=a.a(b);return c instan" +
    "ceof F?!!c.l:!!c};function qb(a,b,c){K.call(this,a.i);this.c=a;thi" +
    "s.h=b;this.u=c;this.g=b.g||c.g;this.b=b.b||c.b;this.c==rb&&(c.b||c" +
    ".g||4==c.i||0==c.i||!b.f?b.b||b.g||4==b.i||0==b.i||!c.f||(this.f={" +
    "name:c.f.name,v:b}):this.f={name:b.f.name,v:c})}t(qb,K);\nfunction " +
    "sb(a,b,c,d,e){b=b.a(d);c=c.a(d);var f;if(b instanceof F&&c instanc" +
    "eof F){e=I(b);for(d=J(e);d;d=J(e))for(b=I(c),f=J(b);f;f=J(b))if(a(" +
    "E(d),E(f)))return!0;return!1}if(b instanceof F||c instanceof F){b " +
    "instanceof F?e=b:(e=c,c=b);e=I(e);b=typeof c;for(d=J(e);d;d=J(e)){" +
    "switch(b){case \"number\":d=+E(d);break;case \"boolean\":d=!!E(d);brea" +
    "k;case \"string\":d=E(d);break;default:throw Error(\"Illegal primitiv" +
    "e type for comparison.\");}if(a(d,c))return!0}return!1}return e?\"bo" +
    "olean\"==typeof b||\"boolean\"==typeof c?\na(!!b,!!c):\"number\"==typeof" +
    " b||\"number\"==typeof c?a(+b,+c):a(b,c):a(+b,+c)}qb.prototype.a=fun" +
    "ction(a){return this.c.m(this.h,this.u,a)};qb.prototype.toString=f" +
    "unction(){var a=\"Binary Expression: \"+this.c,a=a+L(this.h);return " +
    "a+=L(this.u)};function tb(a,b,c,d){this.a=a;this.H=b;this.i=c;this" +
    ".m=d}tb.prototype.toString=l(\"a\");var ub={};function P(a,b,c,d){if" +
    "(ub.hasOwnProperty(a))throw Error(\"Binary operator already created" +
    ": \"+a);a=new tb(a,b,c,d);return ub[a.toString()]=a}\nP(\"div\",6,1,fu" +
    "nction(a,b,c){return M(a,c)/M(b,c)});P(\"mod\",6,1,function(a,b,c){r" +
    "eturn M(a,c)%M(b,c)});P(\"*\",6,1,function(a,b,c){return M(a,c)*M(b," +
    "c)});P(\"+\",5,1,function(a,b,c){return M(a,c)+M(b,c)});P(\"-\",5,1,fu" +
    "nction(a,b,c){return M(a,c)-M(b,c)});P(\"<\",4,2,function(a,b,c){ret" +
    "urn sb(function(a,b){return a<b},a,b,c)});P(\">\",4,2,function(a,b,c" +
    "){return sb(function(a,b){return a>b},a,b,c)});P(\"<=\",4,2,function" +
    "(a,b,c){return sb(function(a,b){return a<=b},a,b,c)});\nP(\">=\",4,2," +
    "function(a,b,c){return sb(function(a,b){return a>=b},a,b,c)});var " +
    "rb=P(\"=\",3,2,function(a,b,c){return sb(function(a,b){return a==b}," +
    "a,b,c,!0)});P(\"!=\",3,2,function(a,b,c){return sb(function(a,b){ret" +
    "urn a!=b},a,b,c,!0)});P(\"and\",2,2,function(a,b,c){return pb(a,c)&&" +
    "pb(b,c)});P(\"or\",1,2,function(a,b,c){return pb(a,c)||pb(b,c)});fun" +
    "ction vb(a,b){if(b.a.length&&4!=a.i)throw Error(\"Primary expressio" +
    "n must evaluate to nodeset if filter has predicate(s).\");K.call(th" +
    "is,a.i);this.c=a;this.h=b;this.g=a.g;this.b=a.b}t(vb,K);vb.prototy" +
    "pe.a=function(a){a=this.c.a(a);return wb(this.h,a)};vb.prototype.t" +
    "oString=function(){var a;a=\"Filter:\"+L(this.c);return a+=L(this.h)" +
    "};function xb(a,b){if(b.length<a.I)throw Error(\"Function \"+a.j+\" e" +
    "xpects at least\"+a.I+\" arguments, \"+b.length+\" given\");if(null!==a" +
    ".B&&b.length>a.B)throw Error(\"Function \"+a.j+\" expects at most \"+a" +
    ".B+\" arguments, \"+b.length+\" given\");a.N&&u(b,function(b,d){if(4!=" +
    "b.i)throw Error(\"Argument \"+d+\" to function \"+a.j+\" is not of type" +
    " Nodeset: \"+b);});K.call(this,a.i);this.h=a;this.c=b;nb(this,a.g||" +
    "va(b,function(a){return a.g}));ob(this,a.M&&!b.length||a.L&&!!b.le" +
    "ngth||va(b,function(a){return a.b}))}\nt(xb,K);xb.prototype.a=funct" +
    "ion(a){return this.h.m.apply(null,ya(a,this.c))};xb.prototype.toSt" +
    "ring=function(){var a=\"Function: \"+this.h;if(this.c.length)var b=u" +
    "a(this.c,function(a,b){return a+L(b)},\"Arguments:\"),a=a+L(b);retur" +
    "n a};function yb(a,b,c,d,e,f,g,k,p){this.j=a;this.i=b;this.g=c;thi" +
    "s.M=d;this.L=e;this.m=f;this.I=g;this.B=q(k)?k:g;this.N=!!p}yb.pro" +
    "totype.toString=l(\"j\");var zb={};\nfunction Q(a,b,c,d,e,f,g,k){if(z" +
    "b.hasOwnProperty(a))throw Error(\"Function already created: \"+a+\".\"" +
    ");zb[a]=new yb(a,b,c,d,!1,e,f,g,k)}Q(\"boolean\",2,!1,!1,function(a," +
    "b){return pb(b,a)},1);Q(\"ceiling\",1,!1,!1,function(a,b){return Mat" +
    "h.ceil(M(b,a))},1);Q(\"concat\",3,!1,!1,function(a,b){var c=za(argum" +
    "ents,1);return ua(c,function(b,c){return b+O(c,a)},\"\")},2,null);Q(" +
    "\"contains\",2,!1,!1,function(a,b,c){b=O(b,a);a=O(c,a);return-1!=b.i" +
    "ndexOf(a)},2);Q(\"count\",1,!1,!1,function(a,b){return b.a(a).l},1,1" +
    ",!0);\nQ(\"false\",2,!1,!1,n(!1),0);Q(\"floor\",1,!1,!1,function(a,b){r" +
    "eturn Math.floor(M(b,a))},1);Q(\"id\",4,!1,!1,function(a,b){var c=a." +
    "a,d=9==c.nodeType?c:c.ownerDocument,c=O(b,a).split(/\\s+/),e=[];u(c" +
    ",function(a){a=d.getElementById(a);!a||0<=sa(e,a)||e.push(a)});e.s" +
    "ort(Ia);var f=new F;u(e,function(a){G(f,a)});return f},1);Q(\"lang\"" +
    ",2,!1,!1,n(!1),1);Q(\"last\",1,!0,!1,function(a){if(1!=arguments.len" +
    "gth)throw Error(\"Function last expects ()\");return a.f},0);\nQ(\"loc" +
    "al-name\",3,!1,!0,function(a,b){var c=b?hb(b.a(a)):a.a;return c?c.l" +
    "ocalName||c.nodeName.toLowerCase():\"\"},0,1,!0);Q(\"name\",3,!1,!0,fu" +
    "nction(a,b){var c=b?hb(b.a(a)):a.a;return c?c.nodeName.toLowerCase" +
    "():\"\"},0,1,!0);Q(\"namespace-uri\",3,!0,!1,n(\"\"),0,1,!0);Q(\"normaliz" +
    "e-space\",3,!1,!0,function(a,b){return(b?O(b,a):E(a.a)).replace(/[\\" +
    "s\\xa0]+/g,\" \").replace(/^\\s+|\\s+$/g,\"\")},0,1);Q(\"not\",2,!1,!1,func" +
    "tion(a,b){return!pb(b,a)},1);Q(\"number\",1,!1,!0,function(a,b){retu" +
    "rn b?M(b,a):+E(a.a)},0,1);\nQ(\"position\",1,!0,!1,function(a){return" +
    " a.b},0);Q(\"round\",1,!1,!1,function(a,b){return Math.round(M(b,a))" +
    "},1);Q(\"starts-with\",2,!1,!1,function(a,b,c){b=O(b,a);a=O(c,a);ret" +
    "urn 0==b.lastIndexOf(a,0)},2);Q(\"string\",3,!1,!0,function(a,b){ret" +
    "urn b?O(b,a):E(a.a)},0,1);Q(\"string-length\",1,!1,!0,function(a,b){" +
    "return(b?O(b,a):E(a.a)).length},0,1);\nQ(\"substring\",3,!1,!1,functi" +
    "on(a,b,c,d){c=M(c,a);if(isNaN(c)||Infinity==c||-Infinity==c)return" +
    "\"\";d=d?M(d,a):Infinity;if(isNaN(d)||-Infinity===d)return\"\";c=Math." +
    "round(c)-1;var e=Math.max(c,0);a=O(b,a);if(Infinity==d)return a.su" +
    "bstring(e);b=Math.round(d);return a.substring(e,c+b)},2,3);Q(\"subs" +
    "tring-after\",3,!1,!1,function(a,b,c){b=O(b,a);a=O(c,a);c=b.indexOf" +
    "(a);return-1==c?\"\":b.substring(c+a.length)},2);\nQ(\"substring-befor" +
    "e\",3,!1,!1,function(a,b,c){b=O(b,a);a=O(c,a);a=b.indexOf(a);return" +
    "-1==a?\"\":b.substring(0,a)},2);Q(\"sum\",1,!1,!1,function(a,b){for(va" +
    "r c=I(b.a(a)),d=0,e=J(c);e;e=J(c))d+=+E(e);return d},1,1,!0);Q(\"tr" +
    "anslate\",3,!1,!1,function(a,b,c,d){b=O(b,a);c=O(c,a);var e=O(d,a);" +
    "a=[];for(d=0;d<c.length;d++){var f=c.charAt(d);f in a||(a[f]=e.cha" +
    "rAt(d))}c=\"\";for(d=0;d<b.length;d++)f=b.charAt(d),c+=f in a?a[f]:f" +
    ";return c},3);Q(\"true\",2,!1,!1,n(!0),0);function H(a,b){this.h=a;t" +
    "his.c=q(b)?b:null;this.b=null;switch(a){case \"comment\":this.b=8;br" +
    "eak;case \"text\":this.b=3;break;case \"processing-instruction\":this." +
    "b=7;break;case \"node\":break;default:throw Error(\"Unexpected argume" +
    "nt\");}}function Ab(a){return\"comment\"==a||\"text\"==a||\"processing-i" +
    "nstruction\"==a||\"node\"==a}H.prototype.a=function(a){return null===" +
    "this.b||this.b==a.nodeType};H.prototype.f=l(\"h\");H.prototype.toStr" +
    "ing=function(){var a=\"Kind Test: \"+this.h;null===this.c||(a+=L(thi" +
    "s.c));return a};function Bb(a){K.call(this,3);this.c=a.substring(1" +
    ",a.length-1)}t(Bb,K);Bb.prototype.a=l(\"c\");Bb.prototype.toString=f" +
    "unction(){return\"Literal: \"+this.c};function Cb(a,b){this.j=a.toLo" +
    "werCase();this.b=b?b.toLowerCase():\"http://www.w3.org/1999/xhtml\"}" +
    "Cb.prototype.a=function(a){var b=a.nodeType;return 1!=b&&2!=b?!1:\"" +
    "*\"!=this.j&&this.j!=a.nodeName.toLowerCase()?!1:this.b==(a.namespa" +
    "ceURI?a.namespaceURI.toLowerCase():\"http://www.w3.org/1999/xhtml\")" +
    "};Cb.prototype.f=l(\"j\");Cb.prototype.toString=function(){return\"Na" +
    "me Test: \"+(\"http://www.w3.org/1999/xhtml\"==this.b?\"\":this.b+\":\")+" +
    "this.j};function Db(a){K.call(this,1);this.c=a}t(Db,K);Db.prototyp" +
    "e.a=l(\"c\");Db.prototype.toString=function(){return\"Number: \"+this." +
    "c};function Eb(a,b){K.call(this,a.i);this.h=a;this.c=b;this.g=a.g;" +
    "this.b=a.b;if(1==this.c.length){var c=this.c[0];c.A||c.c!=Fb||(c=c" +
    ".u,\"*\"!=c.f()&&(this.f={name:c.f(),v:null}))}}t(Eb,K);function Gb(" +
    "){K.call(this,4)}t(Gb,K);Gb.prototype.a=function(a){var b=new F;a=" +
    "a.a;9==a.nodeType?G(b,a):G(b,a.ownerDocument);return b};Gb.prototy" +
    "pe.toString=n(\"Root Helper Expression\");function Hb(){K.call(this," +
    "4)}t(Hb,K);Hb.prototype.a=function(a){var b=new F;G(b,a.a);return " +
    "b};Hb.prototype.toString=n(\"Context Helper Expression\");\nfunction " +
    "Ib(a){return\"/\"==a||\"//\"==a}Eb.prototype.a=function(a){var b=this." +
    "h.a(a);if(!(b instanceof F))throw Error(\"Filter expression must ev" +
    "aluate to nodeset.\");a=this.c;for(var c=0,d=a.length;c<d&&b.l;c++)" +
    "{var e=a[c],f=I(b,e.c.a),g;if(e.g||e.c!=Jb)if(e.g||e.c!=Kb)for(g=J" +
    "(f),b=e.a(new Ua(g));null!=(g=J(f));)g=e.a(new Ua(g)),b=fb(b,g);el" +
    "se g=J(f),b=e.a(new Ua(g));else{for(g=J(f);(b=J(f))&&(!g.contains|" +
    "|g.contains(b))&&b.compareDocumentPosition(g)&8;g=b);b=e.a(new Ua(" +
    "g))}}return b};\nEb.prototype.toString=function(){var a;a=\"Path Exp" +
    "ression:\"+L(this.h);if(this.c.length){var b=ua(this.c,function(a,b" +
    "){return a+L(b)},\"Steps:\");a+=L(b)}return a};function Mb(a,b){this" +
    ".a=a;this.b=!!b}\nfunction wb(a,b,c){for(c=c||0;c<a.a.length;c++)fo" +
    "r(var d=a.a[c],e=I(b),f=b.l,g,k=0;g=J(e);k++){var p=a.b?f-k:k+1;g=" +
    "d.a(new Ua(g,p,f));if(\"number\"==typeof g)p=p==g;else if(\"string\"==" +
    "typeof g||\"boolean\"==typeof g)p=!!g;else if(g instanceof F)p=0<g.l" +
    ";else throw Error(\"Predicate.evaluate returned an unexpected type." +
    "\");if(!p){p=e;g=p.f;var m=p.a;if(!m)throw Error(\"Next must be call" +
    "ed at least once before remove.\");var h=m.b,m=m.a;h?h.a=m:g.a=m;m?" +
    "m.b=h:g.b=h;g.l--;p.a=null}}return b}\nMb.prototype.toString=functi" +
    "on(){return ua(this.a,function(a,b){return a+L(b)},\"Predicates:\")}" +
    ";function R(a,b,c,d){K.call(this,4);this.c=a;this.u=b;this.h=c||ne" +
    "w Mb([]);this.A=!!d;b=this.h;b=0<b.a.length?b.a[0].f:null;a.b&&b&&" +
    "(this.f={name:b.name,v:b.v});a:{a=this.h;for(b=0;b<a.a.length;b++)" +
    "if(c=a.a[b],c.g||1==c.i||0==c.i){a=!0;break a}a=!1}this.g=a}t(R,K)" +
    ";\nR.prototype.a=function(a){var b=a.a,c=null,c=this.f,d=null,e=nul" +
    "l,f=0;c&&(d=c.name,e=c.v?O(c.v,a):null,f=1);if(this.A)if(this.g||t" +
    "his.c!=Nb)if(a=I((new R(Ob,new H(\"node\"))).a(a)),b=J(a))for(c=this" +
    ".m(b,d,e,f);null!=(b=J(a));)c=fb(c,this.m(b,d,e,f));else c=new F;e" +
    "lse c=ab(this.u,b,d,e),c=wb(this.h,c,f);else c=this.m(a.a,d,e,f);r" +
    "eturn c};R.prototype.m=function(a,b,c,d){a=this.c.f(this.u,a,b,c);" +
    "return a=wb(this.h,a,d)};\nR.prototype.toString=function(){var a;a=" +
    "\"Step:\"+L(\"Operator: \"+(this.A?\"//\":\"/\"));this.c.j&&(a+=L(\"Axis: \"" +
    "+this.c));a+=L(this.u);if(this.h.a.length){var b=ua(this.h.a,funct" +
    "ion(a,b){return a+L(b)},\"Predicates:\");a+=L(b)}return a};function " +
    "Pb(a,b,c,d){this.j=a;this.f=b;this.a=c;this.b=d}Pb.prototype.toStr" +
    "ing=l(\"j\");var Qb={};function S(a,b,c,d){if(Qb.hasOwnProperty(a))t" +
    "hrow Error(\"Axis already created: \"+a);b=new Pb(a,b,c,!!d);return " +
    "Qb[a]=b}\nS(\"ancestor\",function(a,b){for(var c=new F,d=b;d=d.parent" +
    "Node;)a.a(d)&&gb(c,d);return c},!0);S(\"ancestor-or-self\",function(" +
    "a,b){var c=new F,d=b;do a.a(d)&&gb(c,d);while(d=d.parentNode);retu" +
    "rn c},!0);var Fb=S(\"attribute\",function(a,b){var c=new F,d=a.f(),e" +
    "=b.attributes;if(e)if(a instanceof H&&null===a.b||\"*\"==d)for(var d" +
    "=0,f;f=e[d];d++)G(c,f);else(f=e.getNamedItem(d))&&G(c,f);return c}" +
    ",!1),Nb=S(\"child\",function(a,b,c,d,e){return db.call(null,a,b,r(c)" +
    "?c:null,r(d)?d:null,e||new F)},!1,!0);\nS(\"descendant\",ab,!1,!0);va" +
    "r Ob=S(\"descendant-or-self\",function(a,b,c,d){var e=new F;$a(b,c,d" +
    ")&&a.a(b)&&G(e,b);return ab(a,b,c,d,e)},!1,!0),Jb=S(\"following\",fu" +
    "nction(a,b,c,d){var e=new F;do for(var f=b;f=f.nextSibling;)$a(f,c" +
    ",d)&&a.a(f)&&G(e,f),e=ab(a,f,c,d,e);while(b=b.parentNode);return e" +
    "},!1,!0);S(\"following-sibling\",function(a,b){for(var c=new F,d=b;d" +
    "=d.nextSibling;)a.a(d)&&G(c,d);return c},!1);S(\"namespace\",functio"
  )
      .append(
    "n(){return new F},!1);\nvar Rb=S(\"parent\",function(a,b){var c=new F" +
    ";if(9==b.nodeType)return c;if(2==b.nodeType)return G(c,b.ownerElem" +
    "ent),c;var d=b.parentNode;a.a(d)&&G(c,d);return c},!1),Kb=S(\"prece" +
    "ding\",function(a,b,c,d){var e=new F,f=[];do f.unshift(b);while(b=b" +
    ".parentNode);for(var g=1,k=f.length;g<k;g++){var p=[];for(b=f[g];b" +
    "=b.previousSibling;)p.unshift(b);for(var m=0,h=p.length;m<h;m++)b=" +
    "p[m],$a(b,c,d)&&a.a(b)&&G(e,b),e=ab(a,b,c,d,e)}return e},!0,!0);\nS" +
    "(\"preceding-sibling\",function(a,b){for(var c=new F,d=b;d=d.previou" +
    "sSibling;)a.a(d)&&gb(c,d);return c},!0);var Sb=S(\"self\",function(a" +
    ",b){var c=new F;a.a(b)&&G(c,b);return c},!1);function Tb(a){K.call" +
    "(this,1);this.c=a;this.g=a.g;this.b=a.b}t(Tb,K);Tb.prototype.a=fun" +
    "ction(a){return-M(this.c,a)};Tb.prototype.toString=function(){retu" +
    "rn\"Unary Expression: -\"+L(this.c)};function Ub(a){K.call(this,4);t" +
    "his.c=a;nb(this,va(this.c,function(a){return a.g}));ob(this,va(thi" +
    "s.c,function(a){return a.b}))}t(Ub,K);Ub.prototype.a=function(a){v" +
    "ar b=new F;u(this.c,function(c){c=c.a(a);if(!(c instanceof F))thro" +
    "w Error(\"Path expression must evaluate to NodeSet.\");b=fb(b,c)});r" +
    "eturn b};Ub.prototype.toString=function(){return ua(this.c,functio" +
    "n(a,b){return a+L(b)},\"Union Expression:\")};function Vb(a,b){this." +
    "a=a;this.b=b}function Wb(a){for(var b,c=[];;){T(a,\"Missing right h" +
    "and side of binary expression.\");b=Xb(a);var d=D(a.a);if(!d)break;" +
    "var e=(d=ub[d]||null)&&d.H;if(!e){a.a.a--;break}for(;c.length&&e<=" +
    "c[c.length-1].H;)b=new qb(c.pop(),c.pop(),b);c.push(b,d)}for(;c.le" +
    "ngth;)b=new qb(c.pop(),c.pop(),b);return b}function T(a,b){if(Za(a" +
    ".a))throw Error(b);}function Yb(a,b){var c=D(a.a);if(c!=b)throw Er" +
    "ror(\"Bad token, expected: \"+b+\" got: \"+c);}\nfunction Zb(a){a=D(a.a" +
    ");if(\")\"!=a)throw Error(\"Bad token: \"+a);}function $b(a){a=D(a.a);" +
    "if(2>a.length)throw Error(\"Unclosed literal string\");return new Bb" +
    "(a)}function ac(a){var b=D(a.a),c=b.indexOf(\":\");if(-1==c)return n" +
    "ew Cb(b);var d=b.substring(0,c);a=a.b(d);if(!a)throw Error(\"Namesp" +
    "ace prefix not declared: \"+d);b=b.substr(c+1);return new Cb(b,a)}\n" +
    "function bc(a){var b,c=[],d;if(Ib(C(a.a))){b=D(a.a);d=C(a.a);if(\"/" +
    "\"==b&&(Za(a.a)||\".\"!=d&&\"..\"!=d&&\"@\"!=d&&\"*\"!=d&&!/(?![0-9])[\\w]/." +
    "test(d)))return new Gb;d=new Gb;T(a,\"Missing next location step.\")" +
    ";b=cc(a,b);c.push(b)}else{a:{b=C(a.a);d=b.charAt(0);switch(d){case" +
    " \"$\":throw Error(\"Variable reference not allowed in HTML XPath\");c" +
    "ase \"(\":D(a.a);b=Wb(a);T(a,'unclosed \"(\"');Yb(a,\")\");break;case '\"" +
    "':case \"'\":b=$b(a);break;default:if(isNaN(+b))if(!Ab(b)&&/(?![0-9]" +
    ")[\\w]/.test(d)&&\"(\"==C(a.a,1)){b=D(a.a);\nb=zb[b]||null;D(a.a);for(" +
    "d=[];\")\"!=C(a.a);){T(a,\"Missing function argument list.\");d.push(W" +
    "b(a));if(\",\"!=C(a.a))break;D(a.a)}T(a,\"Unclosed function argument " +
    "list.\");Zb(a);b=new xb(b,d)}else{b=null;break a}else b=new Db(+D(a" +
    ".a))}\"[\"==C(a.a)&&(d=new Mb(dc(a)),b=new vb(b,d))}if(b)if(Ib(C(a.a" +
    ")))d=b;else return b;else b=cc(a,\"/\"),d=new Hb,c.push(b)}for(;Ib(C" +
    "(a.a));)b=D(a.a),T(a,\"Missing next location step.\"),b=cc(a,b),c.pu" +
    "sh(b);return new Eb(d,c)}\nfunction cc(a,b){var c,d,e;if(\"/\"!=b&&\"/" +
    "/\"!=b)throw Error('Step op should be \"/\" or \"//\"');if(\".\"==C(a.a))" +
    "return d=new R(Sb,new H(\"node\")),D(a.a),d;if(\"..\"==C(a.a))return d" +
    "=new R(Rb,new H(\"node\")),D(a.a),d;var f;if(\"@\"==C(a.a))f=Fb,D(a.a)" +
    ",T(a,\"Missing attribute name\");else if(\"::\"==C(a.a,1)){if(!/(?![0-" +
    "9])[\\w]/.test(C(a.a).charAt(0)))throw Error(\"Bad token: \"+D(a.a));" +
    "c=D(a.a);f=Qb[c]||null;if(!f)throw Error(\"No axis with name: \"+c);" +
    "D(a.a);T(a,\"Missing node name\")}else f=Nb;c=C(a.a);if(/(?![0-9])[\\" +
    "w]/.test(c.charAt(0)))if(\"(\"==\nC(a.a,1)){if(!Ab(c))throw Error(\"In" +
    "valid node type: \"+c);c=D(a.a);if(!Ab(c))throw Error(\"Invalid type" +
    " name: \"+c);Yb(a,\"(\");T(a,\"Bad nodetype\");e=C(a.a).charAt(0);var g" +
    "=null;if('\"'==e||\"'\"==e)g=$b(a);T(a,\"Bad nodetype\");Zb(a);c=new H(" +
    "c,g)}else c=ac(a);else if(\"*\"==c)c=ac(a);else throw Error(\"Bad tok" +
    "en: \"+D(a.a));e=new Mb(dc(a),f.a);return d||new R(f,c,e,\"//\"==b)}\n" +
    "function dc(a){for(var b=[];\"[\"==C(a.a);){D(a.a);T(a,\"Missing pred" +
    "icate expression.\");var c=Wb(a);b.push(c);T(a,\"Unclosed predicate " +
    "expression.\");Yb(a,\"]\")}return b}function Xb(a){if(\"-\"==C(a.a))ret" +
    "urn D(a.a),new Tb(Xb(a));var b=bc(a);if(\"|\"!=C(a.a))a=b;else{for(b" +
    "=[b];\"|\"==D(a.a);)T(a,\"Missing next union location path.\"),b.push(" +
    "bc(a));a.a.a--;a=new Ub(b)}return a};function ec(a,b){if(!a.length" +
    ")throw Error(\"Empty XPath expression.\");var c=Wa(a);if(Za(c))throw" +
    " Error(\"Invalid XPath expression.\");b?da(b)||(b=ga(b.lookupNamespa" +
    "ceURI,b)):b=n(null);var d=Wb(new Vb(c,b));if(!Za(c))throw Error(\"B" +
    "ad token: \"+D(c));this.evaluate=function(a,b){var c=d.a(new Ua(a))" +
    ";return new U(c,b)}}\nfunction U(a,b){if(0==b)if(a instanceof F)b=4" +
    ";else if(\"string\"==typeof a)b=2;else if(\"number\"==typeof a)b=1;els" +
    "e if(\"boolean\"==typeof a)b=3;else throw Error(\"Unexpected evaluati" +
    "on result.\");if(2!=b&&1!=b&&3!=b&&!(a instanceof F))throw Error(\"v" +
    "alue could not be converted to the specified type\");this.resultTyp" +
    "e=b;var c;switch(b){case 2:this.stringValue=a instanceof F?ib(a):\"" +
    "\"+a;break;case 1:this.numberValue=a instanceof F?+ib(a):+a;break;c" +
    "ase 3:this.booleanValue=a instanceof F?0<a.l:!!a;break;case 4:case" +
    " 5:case 6:case 7:var d=\nI(a);c=[];for(var e=J(d);e;e=J(d))c.push(e" +
    ");this.snapshotLength=a.l;this.invalidIteratorState=!1;break;case " +
    "8:case 9:this.singleNodeValue=hb(a);break;default:throw Error(\"Unk" +
    "nown XPathResult type.\");}var f=0;this.iterateNext=function(){if(4" +
    "!=b&&5!=b)throw Error(\"iterateNext called with wrong result type\")" +
    ";return f>=c.length?null:c[f++]};this.snapshotItem=function(a){if(" +
    "6!=b&&7!=b)throw Error(\"snapshotItem called with wrong result type" +
    "\");return a>=c.length||0>a?null:c[a]}}U.ANY_TYPE=0;\nU.NUMBER_TYPE=" +
    "1;U.STRING_TYPE=2;U.BOOLEAN_TYPE=3;U.UNORDERED_NODE_ITERATOR_TYPE=" +
    "4;U.ORDERED_NODE_ITERATOR_TYPE=5;U.UNORDERED_NODE_SNAPSHOT_TYPE=6;" +
    "U.ORDERED_NODE_SNAPSHOT_TYPE=7;U.ANY_UNORDERED_NODE_TYPE=8;U.FIRST" +
    "_ORDERED_NODE_TYPE=9;function fc(a){this.lookupNamespaceURI=kb(a)}" +
    "\nfunction gc(a){a=a||aa;var b=a.document;b.evaluate||(a.XPathResul" +
    "t=U,b.evaluate=function(a,b,e,f){return(new ec(a,e)).evaluate(b,f)" +
    "},b.createExpression=function(a,b){return new ec(a,b)},b.createNSR" +
    "esolver=function(a){return new fc(a)})}ba(\"wgxpath.install\",gc);va" +
    "r V={};V.C=function(){var a={R:\"http://www.w3.org/2000/svg\"};retur" +
    "n function(b){return a[b]||null}}();\nV.m=function(a,b,c){var d=x(a" +
    ");if(!d.documentElement)return null;gc(d?d.parentWindow||d.default" +
    "View:window);try{for(var e=d.createNSResolver?d.createNSResolver(d" +
    ".documentElement):V.C,f={},g=d.getElementsByTagName(\"*\"),k=0;k<g.l" +
    "ength;++k){var p=g[k],m=p.namespaceURI;if(m&&!f[m]){var h=p.lookup" +
    "Prefix(m);if(!h){var B=m.match(\".*/(\\\\w+)/?$\");B?h=B[1]:h=\"xhtml\"}" +
    "f[m]=h}}var N={},X;for(X in f)N[f[X]]=X;e=function(a){return N[a]|" +
    "|null};try{return d.evaluate(b,a,e,c,null)}catch(Lb){if(\"TypeError" +
    "\"===Lb.name)return e=\nd.createNSResolver?d.createNSResolver(d.docu" +
    "mentElement):V.C,d.evaluate(b,a,e,c,null);throw Lb;}}catch(vc){thr" +
    "ow new z(32,\"Unable to locate an element with the xpath expression" +
    " \"+b+\" because of the following error:\\n\"+vc);}};V.D=function(a,b)" +
    "{if(!a||1!=a.nodeType)throw new z(32,'The result of the xpath expr" +
    "ession \"'+b+'\" is: '+a+\". It should be an element.\");};\nV.o=functi" +
    "on(a,b){var c=function(){var c=V.m(b,a,9);return c?c.singleNodeVal" +
    "ue||null:b.selectSingleNode?(c=x(b),c.setProperty&&c.setProperty(\"" +
    "SelectionLanguage\",\"XPath\"),b.selectSingleNode(a)):null}();null===" +
    "c||V.D(c,a);return c};\nV.s=function(a,b){var c=function(){var c=V." +
    "m(b,a,7);if(c){for(var e=c.snapshotLength,f=[],g=0;g<e;++g)f.push(" +
    "c.snapshotItem(g));return f}return b.selectNodes?(c=x(b),c.setProp" +
    "erty&&c.setProperty(\"SelectionLanguage\",\"XPath\"),b.selectNodes(a))" +
    ":[]}();u(c,function(b){V.D(b,a)});return c};var hc={aliceblue:\"#f0" +
    "f8ff\",antiquewhite:\"#faebd7\",aqua:\"#00ffff\",aquamarine:\"#7fffd4\",a" +
    "zure:\"#f0ffff\",beige:\"#f5f5dc\",bisque:\"#ffe4c4\",black:\"#000000\",bl" +
    "anchedalmond:\"#ffebcd\",blue:\"#0000ff\",blueviolet:\"#8a2be2\",brown:\"" +
    "#a52a2a\",burlywood:\"#deb887\",cadetblue:\"#5f9ea0\",chartreuse:\"#7fff" +
    "00\",chocolate:\"#d2691e\",coral:\"#ff7f50\",cornflowerblue:\"#6495ed\",c" +
    "ornsilk:\"#fff8dc\",crimson:\"#dc143c\",cyan:\"#00ffff\",darkblue:\"#0000" +
    "8b\",darkcyan:\"#008b8b\",darkgoldenrod:\"#b8860b\",darkgray:\"#a9a9a9\"," +
    "darkgreen:\"#006400\",\ndarkgrey:\"#a9a9a9\",darkkhaki:\"#bdb76b\",darkma" +
    "genta:\"#8b008b\",darkolivegreen:\"#556b2f\",darkorange:\"#ff8c00\",dark" +
    "orchid:\"#9932cc\",darkred:\"#8b0000\",darksalmon:\"#e9967a\",darkseagre" +
    "en:\"#8fbc8f\",darkslateblue:\"#483d8b\",darkslategray:\"#2f4f4f\",darks" +
    "lategrey:\"#2f4f4f\",darkturquoise:\"#00ced1\",darkviolet:\"#9400d3\",de" +
    "eppink:\"#ff1493\",deepskyblue:\"#00bfff\",dimgray:\"#696969\",dimgrey:\"" +
    "#696969\",dodgerblue:\"#1e90ff\",firebrick:\"#b22222\",floralwhite:\"#ff" +
    "faf0\",forestgreen:\"#228b22\",fuchsia:\"#ff00ff\",gainsboro:\"#dcdcdc\"," +
    "\nghostwhite:\"#f8f8ff\",gold:\"#ffd700\",goldenrod:\"#daa520\",gray:\"#80" +
    "8080\",green:\"#008000\",greenyellow:\"#adff2f\",grey:\"#808080\",honeyde" +
    "w:\"#f0fff0\",hotpink:\"#ff69b4\",indianred:\"#cd5c5c\",indigo:\"#4b0082\"" +
    ",ivory:\"#fffff0\",khaki:\"#f0e68c\",lavender:\"#e6e6fa\",lavenderblush:" +
    "\"#fff0f5\",lawngreen:\"#7cfc00\",lemonchiffon:\"#fffacd\",lightblue:\"#a" +
    "dd8e6\",lightcoral:\"#f08080\",lightcyan:\"#e0ffff\",lightgoldenrodyell" +
    "ow:\"#fafad2\",lightgray:\"#d3d3d3\",lightgreen:\"#90ee90\",lightgrey:\"#" +
    "d3d3d3\",lightpink:\"#ffb6c1\",lightsalmon:\"#ffa07a\",\nlightseagreen:\"" +
    "#20b2aa\",lightskyblue:\"#87cefa\",lightslategray:\"#778899\",lightslat" +
    "egrey:\"#778899\",lightsteelblue:\"#b0c4de\",lightyellow:\"#ffffe0\",lim" +
    "e:\"#00ff00\",limegreen:\"#32cd32\",linen:\"#faf0e6\",magenta:\"#ff00ff\"," +
    "maroon:\"#800000\",mediumaquamarine:\"#66cdaa\",mediumblue:\"#0000cd\",m" +
    "ediumorchid:\"#ba55d3\",mediumpurple:\"#9370db\",mediumseagreen:\"#3cb3" +
    "71\",mediumslateblue:\"#7b68ee\",mediumspringgreen:\"#00fa9a\",mediumtu" +
    "rquoise:\"#48d1cc\",mediumvioletred:\"#c71585\",midnightblue:\"#191970\"" +
    ",mintcream:\"#f5fffa\",mistyrose:\"#ffe4e1\",\nmoccasin:\"#ffe4b5\",navaj" +
    "owhite:\"#ffdead\",navy:\"#000080\",oldlace:\"#fdf5e6\",olive:\"#808000\"," +
    "olivedrab:\"#6b8e23\",orange:\"#ffa500\",orangered:\"#ff4500\",orchid:\"#" +
    "da70d6\",palegoldenrod:\"#eee8aa\",palegreen:\"#98fb98\",paleturquoise:" +
    "\"#afeeee\",palevioletred:\"#db7093\",papayawhip:\"#ffefd5\",peachpuff:\"" +
    "#ffdab9\",peru:\"#cd853f\",pink:\"#ffc0cb\",plum:\"#dda0dd\",powderblue:\"" +
    "#b0e0e6\",purple:\"#800080\",red:\"#ff0000\",rosybrown:\"#bc8f8f\",royalb" +
    "lue:\"#4169e1\",saddlebrown:\"#8b4513\",salmon:\"#fa8072\",sandybrown:\"#" +
    "f4a460\",seagreen:\"#2e8b57\",\nseashell:\"#fff5ee\",sienna:\"#a0522d\",si" +
    "lver:\"#c0c0c0\",skyblue:\"#87ceeb\",slateblue:\"#6a5acd\",slategray:\"#7" +
    "08090\",slategrey:\"#708090\",snow:\"#fffafa\",springgreen:\"#00ff7f\",st" +
    "eelblue:\"#4682b4\",tan:\"#d2b48c\",teal:\"#008080\",thistle:\"#d8bfd8\",t" +
    "omato:\"#ff6347\",turquoise:\"#40e0d0\",violet:\"#ee82ee\",wheat:\"#f5deb" +
    "3\",white:\"#ffffff\",whitesmoke:\"#f5f5f5\",yellow:\"#ffff00\",yellowgre" +
    "en:\"#9acd32\"};var ic=\"backgroundColor borderTopColor borderRightCo" +
    "lor borderBottomColor borderLeftColor color outlineColor\".split(\" " +
    "\"),jc=/#([0-9a-fA-F])([0-9a-fA-F])([0-9a-fA-F])/,kc=/^#(?:[0-9a-f]" +
    "{3}){1,2}$/i,lc=/^(?:rgba)?\\((\\d{1,3}),\\s?(\\d{1,3}),\\s?(\\d{1,3}),\\" +
    "s?(0|1|0\\.\\d*)\\)$/i,mc=/^(?:rgb)?\\((0|[1-9]\\d{0,2}),\\s?(0|[1-9]\\d{" +
    "0,2}),\\s?(0|[1-9]\\d{0,2})\\)$/i;function W(a,b){return!!a&&1==a.nod" +
    "eType&&(!b||a.tagName.toUpperCase()==b)}var nc=/[;]+(?=(?:(?:[^\"]*" +
    "\"){2})*[^\"]*$)(?=(?:(?:[^']*'){2})*[^']*$)(?=(?:[^()]*\\([^()]*\\))*" +
    "[^()]*$)/;function oc(a){var b=[];u(a.split(nc),function(a){var d=" +
    "a.indexOf(\":\");0<d&&(a=[a.slice(0,d),a.slice(d+1)],2==a.length&&b." +
    "push(a[0].toLowerCase(),\":\",a[1],\";\"))});b=b.join(\"\");return b=\";\"" +
    "==b.charAt(b.length-1)?b:b+\";\"}\nfunction pc(a,b){b=b.toLowerCase()" +
    ";if(\"style\"==b)return oc(a.style.cssText);var c=a.getAttributeNode" +
    "(b);return c&&c.specified?c.value:null}function qc(a){for(a=a.pare" +
    "ntNode;a&&1!=a.nodeType&&9!=a.nodeType&&11!=a.nodeType;)a=a.parent" +
    "Node;return W(a)?a:null}\nfunction Y(a,b){var c=oa(b);if(\"float\"==c" +
    "||\"cssFloat\"==c||\"styleFloat\"==c)c=\"cssFloat\";var d;a:{d=c;var e=x" +
    "(a);if(e.defaultView&&e.defaultView.getComputedStyle&&(e=e.default" +
    "View.getComputedStyle(a,null))){d=e[d]||e.getPropertyValue(d)||\"\";" +
    "break a}d=\"\"}d=d||rc(a,c);if(null===d)d=null;else if(0<=sa(ic,c)){" +
    "b:{var f=d.match(lc);if(f){var c=Number(f[1]),e=Number(f[2]),g=Num" +
    "ber(f[3]),f=Number(f[4]);if(0<=c&&255>=c&&0<=e&&255>=e&&0<=g&&255>" +
    "=g&&0<=f&&1>=f){c=[c,e,g,f];break b}}c=null}if(!c)b:{if(g=d.match(" +
    "mc))if(c=\nNumber(g[1]),e=Number(g[2]),g=Number(g[3]),0<=c&&255>=c&" +
    "&0<=e&&255>=e&&0<=g&&255>=g){c=[c,e,g,1];break b}c=null}if(!c)b:{c" +
    "=d.toLowerCase();e=hc[c.toLowerCase()];if(!e&&(e=\"#\"==c.charAt(0)?" +
    "c:\"#\"+c,4==e.length&&(e=e.replace(jc,\"#$1$1$2$2$3$3\")),!kc.test(e)" +
    ")){c=null;break b}c=[parseInt(e.substr(1,2),16),parseInt(e.substr(" +
    "3,2),16),parseInt(e.substr(5,2),16),1]}d=c?\"rgba(\"+c.join(\", \")+\")" +
    "\":d}return d}\nfunction rc(a,b){var c=a.currentStyle||a.style,d=c[b" +
    "];!q(d)&&da(c.getPropertyValue)&&(d=c.getPropertyValue(b));return\"" +
    "inherit\"!=d?q(d)?d:null:(c=qc(a))?rc(c,b):null}\nfunction sc(a,b,c)" +
    "{function d(a){var b=tc(a);return 0<b.height&&0<b.width?!0:W(a,\"PA" +
    "TH\")&&(0<b.height||0<b.width)?(a=Y(a,\"stroke-width\"),!!a&&0<parseI" +
    "nt(a,10)):\"hidden\"!=Y(a,\"overflow\")&&va(a.childNodes,function(a){r" +
    "eturn 3==a.nodeType||W(a)&&d(a)})}function e(a){return\"hidden\"==uc" +
    "(a)&&wa(a.childNodes,function(a){return!W(a)||e(a)||!d(a)})}if(!W(" +
    "a))throw Error(\"Argument to isShown must be of type Element\");if(W" +
    "(a,\"BODY\"))return!0;if(W(a,\"OPTION\")||W(a,\"OPTGROUP\"))return a=La(" +
    "a,function(a){return W(a,\n\"SELECT\")}),!!a&&sc(a,!0,c);var f=wc(a);" +
    "if(f)return!!f.F&&0<f.rect.width&&0<f.rect.height&&sc(f.F,b,c);if(" +
    "W(a,\"INPUT\")&&\"hidden\"==a.type.toLowerCase()||W(a,\"NOSCRIPT\"))retu" +
    "rn!1;f=Y(a,\"visibility\");return\"collapse\"!=f&&\"hidden\"!=f&&c(a)&&(" +
    "b||0!=xc(a))&&d(a)?!e(a):!1}function yc(a){function b(a){if(\"none\"" +
    "==Y(a,\"display\"))return!1;a=qc(a);return!a||b(a)}return sc(a,!1,b)" +
    "}\nfunction uc(a){function b(a){function b(a){return a==g?!0:0==Y(a" +
    ",\"display\").lastIndexOf(\"inline\",0)||\"absolute\"==c&&\"static\"==Y(a," +
    "\"position\")?!1:!0}var c=Y(a,\"position\");if(\"fixed\"==c)return m=!0," +
    "a==g?null:g;for(a=qc(a);a&&!b(a);)a=qc(a);return a}function c(a){v" +
    "ar b=a;if(\"visible\"==p)if(a==g&&k)b=k;else if(a==k)return{x:\"visib" +
    "le\",y:\"visible\"};b={x:Y(b,\"overflow-x\"),y:Y(b,\"overflow-y\")};a==g&" +
    "&(b.x=\"visible\"==b.x?\"auto\":b.x,b.y=\"visible\"==b.y?\"auto\":b.y);ret" +
    "urn b}function d(a){if(a==g){var b=(new Fa(f)).a;\na=b.scrollingEle" +
    "ment?b.scrollingElement:b.body||b.documentElement;b=b.parentWindow" +
    "||b.defaultView;a=new v(b.pageXOffset||a.scrollLeft,b.pageYOffset|" +
    "|a.scrollTop)}else a=new v(a.scrollLeft,a.scrollTop);return a}var " +
    "e=zc(a),f=x(a),g=f.documentElement,k=f.body,p=Y(g,\"overflow\"),m;fo" +
    "r(a=b(a);a;a=b(a)){var h=c(a);if(\"visible\"!=h.x||\"visible\"!=h.y){v" +
    "ar B=tc(a);if(0==B.width||0==B.height)return\"hidden\";var N=e.right" +
    "<B.left,X=e.bottom<B.top;if(N&&\"hidden\"==h.x||X&&\"hidden\"==h.y)ret" +
    "urn\"hidden\";if(N&&\"visible\"!=\nh.x||X&&\"visible\"!=h.y){N=d(a);X=e.b" +
    "ottom<B.top-N.y;if(e.right<B.left-N.x&&\"visible\"!=h.x||X&&\"visible" +
    "\"!=h.x)return\"hidden\";e=uc(a);return\"hidden\"==e?\"hidden\":\"scroll\"}" +
    "N=e.left>=B.left+B.width;B=e.top>=B.top+B.height;if(N&&\"hidden\"==h" +
    ".x||B&&\"hidden\"==h.y)return\"hidden\";if(N&&\"visible\"!=h.x||B&&\"visi" +
    "ble\"!=h.y){if(m&&(h=d(a),e.left>=g.scrollWidth-h.x||e.right>=g.scr" +
    "ollHeight-h.y))return\"hidden\";e=uc(a);return\"hidden\"==e?\"hidden\":\"" +
    "scroll\"}}}return\"none\"}\nfunction tc(a){var b=wc(a);if(b)return b.r" +
    "ect;if(W(a,\"HTML\"))return a=x(a),a=((a?a.parentWindow||a.defaultVi" +
    "ew:window)||window).document,a=\"CSS1Compat\"==a.compatMode?a.docume" +
    "ntElement:a.body,a=new Ba(a.clientWidth,a.clientHeight),new A(0,0," +
    "a.width,a.height);var c;try{c=a.getBoundingClientRect()}catch(d){r" +
    "eturn new A(0,0,0,0)}return new A(c.left,c.top,c.right-c.left,c.bo" +
    "ttom-c.top)}\nfunction wc(a){var b=W(a,\"MAP\");if(!b&&!W(a,\"AREA\"))r" +
    "eturn null;var c=b?a:W(a.parentNode,\"MAP\")?a.parentNode:null,d=nul" +
    "l,e=null;if(c&&c.name&&(d=x(c),d=V.o('/descendant::*[@usemap = \"#'" +
    "+c.name+'\"]',d))&&(e=tc(d),!b&&\"default\"!=a.shape.toLowerCase())){" +
    "var f=Ac(a);a=Math.min(Math.max(f.left,0),e.width);b=Math.min(Math" +
    ".max(f.top,0),e.height);c=Math.min(f.width,e.width-a);f=Math.min(f" +
    ".height,e.height-b);e=new A(a+e.left,b+e.top,c,f)}return{F:d,rect:" +
    "e||new A(0,0,0,0)}}\nfunction Ac(a){var b=a.shape.toLowerCase();a=a" +
    ".coords.split(\",\");if(\"rect\"==b&&4==a.length){var b=a[0],c=a[1];re" +
    "turn new A(b,c,a[2]-b,a[3]-c)}if(\"circle\"==b&&3==a.length)return b" +
    "=a[2],new A(a[0]-b,a[1]-b,2*b,2*b);if(\"poly\"==b&&2<a.length){for(v" +
    "ar b=a[0],c=a[1],d=b,e=c,f=2;f+1<a.length;f+=2)b=Math.min(b,a[f])," +
    "d=Math.max(d,a[f]),c=Math.min(c,a[f+1]),e=Math.max(e,a[f+1]);retur" +
    "n new A(b,c,d-b,e-c)}return new A(0,0,0,0)}function zc(a){a=tc(a);" +
    "return new Ta(a.top,a.left+a.width,a.top+a.height,a.left)}\nfunctio" +
    "n Bc(a){return a.replace(/^[^\\S\\xa0]+|[^\\S\\xa0]+$/g,\"\")}function C" +
    "c(a){var b=[];Dc(a,b);var c=b;a=c.length;for(var b=Array(a),c=r(c)" +
    "?c.split(\"\"):c,d=0;d<a;d++)d in c&&(b[d]=Bc.call(void 0,c[d]));ret" +
    "urn Bc(b.join(\"\\n\")).replace(/\\xa0/g,\" \")}\nfunction Ec(a,b,c){if(W" +
    "(a,\"BR\"))b.push(\"\");else{var d=W(a,\"TD\"),e=Y(a,\"display\"),f=!d&&!(" +
    "0<=sa(Fc,e)),g=q(a.previousElementSibling)?a.previousElementSiblin" +
    "g:Ga(a.previousSibling),g=g?Y(g,\"display\"):\"\",k=Y(a,\"float\")||Y(a," +
    "\"cssFloat\")||Y(a,\"styleFloat\");!f||\"run-in\"==g&&\"none\"==k||/^[\\s\\x" +
    "a0]*$/.test(b[b.length-1]||\"\")||b.push(\"\");var p=yc(a),m=null,h=nu" +
    "ll;p&&(m=Y(a,\"white-space\"),h=Y(a,\"text-transform\"));u(a.childNode" +
    "s,function(a){c(a,b,p,m,h)});a=b[b.length-1]||\"\";!d&&\"table-cell\"!" +
    "=e||!a||ka(a)||(b[b.length-\n1]+=\" \");f&&\"run-in\"!=e&&!/^[\\s\\xa0]*$" +
    "/.test(a)&&b.push(\"\")}}function Dc(a,b){Ec(a,b,function(a,b,e,f,g)" +
    "{3==a.nodeType&&e?Gc(a,b,f,g):W(a)&&Dc(a,b)})}var Fc=\"inline inlin" +
    "e-block inline-table none table-cell table-column table-column-gro" +
    "up\".split(\" \");\nfunction Gc(a,b,c,d){a=a.nodeValue.replace(/[\\u200" +
    "b\\u200e\\u200f]/g,\"\");a=a.replace(/(\\r\\n|\\r|\\n)/g,\"\\n\");if(\"normal\"" +
    "==c||\"nowrap\"==c)a=a.replace(/\\n/g,\" \");a=\"pre\"==c||\"pre-wrap\"==c?" +
    "a.replace(/[ \\f\\t\\v\\u2028\\u2029]/g,\"\\u00a0\"):a.replace(/[\\ \\f\\t\\v\\" +
    "u2028\\u2029]+/g,\" \");\"capitalize\"==d?a=a.replace(/(^|\\s)(\\S)/g,fun" +
    "ction(a,b,c){return b+c.toUpperCase()}):\"uppercase\"==d?a=a.toUpper" +
    "Case():\"lowercase\"==d&&(a=a.toLowerCase());c=b.pop()||\"\";ka(c)&&0=" +
    "=a.lastIndexOf(\" \",0)&&(a=a.substr(1));b.push(c+a)}\nfunction xc(a)" +
    "{var b=1,c=Y(a,\"opacity\");c&&(b=Number(c));(a=qc(a))&&(b*=xc(a));r" +
    "eturn b};var Hc={w:function(a,b){return!(!a.querySelectorAll||!a.q" +
    "uerySelector)&&!/^\\d.*/.test(b)},o:function(a,b){var c=w(b),d=r(a)" +
    "?c.a.getElementById(a):a;if(!d)return null;if(pc(d,\"id\")==a&&Ha(b," +
    "d))return d;c=y(c,\"*\");return xa(c,function(c){return pc(c,\"id\")==" +
    "a&&Ha(b,c)})},s:function(a,b){if(!a)return[];if(Hc.w(b,a))try{retu" +
    "rn b.querySelectorAll(\"#\"+Hc.K(a))}catch(c){return[]}var d=y(w(b)," +
    "\"*\",null,b);return ta(d,function(b){return pc(b,\"id\")==a})},K:func" +
    "tion(a){return a.replace(/(['\"\\\\#.:;,!?+<>=~*^$|%&@`{}\\-\\/\\[\\]\\(\\)" +
    "])/g,\n\"\\\\$1\")}};var Z={},Ic={};Z.J=function(a,b,c){var d;try{d=Sa." +
    "s(\"a\",b)}catch(e){d=y(w(b),\"A\",null,b)}return xa(d,function(b){b=C" +
    "c(b);return c&&-1!=b.indexOf(a)||b==a})};Z.G=function(a,b,c){var d" +
    ";try{d=Sa.s(\"a\",b)}catch(e){d=y(w(b),\"A\",null,b)}return ta(d,funct" +
    "ion(b){b=Cc(b);return c&&-1!=b.indexOf(a)||b==a})};Z.o=function(a," +
    "b){return Z.J(a,b,!1)};Z.s=function(a,b){return Z.G(a,b,!1)};Ic.o=" +
    "function(a,b){return Z.J(a,b,!0)};Ic.s=function(a,b){return Z.G(a," +
    "b,!0)};var Jc={o:function(a,b){return b.getElementsByTagName(a)[0]" +
    "||null},s:function(a,b){return b.getElementsByTagName(a)}};var Kc=" +
    "{className:Na,\"class name\":Na,css:Sa,\"css selector\":Sa,id:Hc,linkT" +
    "ext:Z,\"link text\":Z,name:{o:function(a,b){var c=y(w(b),\"*\",null,b)" +
    ";return xa(c,function(b){return pc(b,\"name\")==a})},s:function(a,b)" +
    "{var c=y(w(b),\"*\",null,b);return ta(c,function(b){return pc(b,\"nam" +
    "e\")==a})}},partialLinkText:Ic,\"partial link text\":Ic,tagName:Jc,\"t" +
    "ag name\":Jc,xpath:V};ba(\"_\",function(a,b){var c;a:{for(c in a)if(a" +
    ".hasOwnProperty(c))break a;c=null}if(c){var d=Kc[c];if(d&&da(d.o))" +
    "return d.o(a[c],b||Aa.document)}throw Error(\"Unsupported locator s" +
    "trategy: \"+c);});;return this._.apply(null,arguments);}).apply({na" +
    "vigator:typeof window!=\"undefined\"?window.navigator:null},argument" +
    "s);}\n"
  )
  .toString();
  static final String FIND_ELEMENT_ANDROID_license =
    "\n\n Copyright 2014 Software Freedom Conservancy\n\n Licensed under th" +
    "e Apache License, Version 2.0 (the \"License\");\n you may not use th" +
    "is file except in compliance with the License.\n You may obtain a c" +
    "opy of the License at\n\n      http://www.apache.org/licenses/LICENS" +
    "E-2.0\n\n Unless required by applicable law or agreed to in writing," +
    " software\n distributed under the License is distributed on an \"AS " +
    "IS\" BASIS,\n WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either e" +
    "xpress or implied.\n See the License for the specific language gove" +
    "rning permissions and\n limitations under the License.\n";
  private static final String FIND_ELEMENT_ANDROID_original() {
    return FIND_ELEMENT_ANDROID.replaceAll("xxx_rpl_lic", FIND_ELEMENT_ANDROID_license);
  }

/* field: FIND_ELEMENTS_ANDROID license: 

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
  static final String FIND_ELEMENTS_ANDROID =
  new StringBuilder(
    "function(){return(function(){function l(a){return function(){retur" +
    "n this[a]}}function n(a){return function(){return a}}var aa=this;f" +
    "unction q(a){return void 0!==a}function ba(a,b){var c=a.split(\".\")" +
    ",d=aa;c[0]in d||!d.execScript||d.execScript(\"var \"+c[0]);for(var e" +
    ";c.length&&(e=c.shift());)!c.length&&q(b)?d[e]=b:d[e]?d=d[e]:d=d[e" +
    "]={}}\nfunction ca(a){var b=typeof a;if(\"object\"==b)if(a){if(a inst" +
    "anceof Array)return\"array\";if(a instanceof Object)return b;var c=O" +
    "bject.prototype.toString.call(a);if(\"[object Window]\"==c)return\"ob" +
    "ject\";if(\"[object Array]\"==c||\"number\"==typeof a.length&&\"undefine" +
    "d\"!=typeof a.splice&&\"undefined\"!=typeof a.propertyIsEnumerable&&!" +
    "a.propertyIsEnumerable(\"splice\"))return\"array\";if(\"[object Functio" +
    "n]\"==c||\"undefined\"!=typeof a.call&&\"undefined\"!=typeof a.property" +
    "IsEnumerable&&!a.propertyIsEnumerable(\"call\"))return\"function\"}els" +
    "e return\"null\";\nelse if(\"function\"==b&&\"undefined\"==typeof a.call)" +
    "return\"object\";return b}function r(a){return\"string\"==typeof a}fun" +
    "ction da(a){return\"function\"==ca(a)}function ea(a,b,c){return a.ca" +
    "ll.apply(a.bind,arguments)}function fa(a,b,c){if(!a)throw Error();" +
    "if(2<arguments.length){var d=Array.prototype.slice.call(arguments," +
    "2);return function(){var c=Array.prototype.slice.call(arguments);A" +
    "rray.prototype.unshift.apply(c,d);return a.apply(b,c)}}return func" +
    "tion(){return a.apply(b,arguments)}}\nfunction ga(a,b,c){ga=Functio" +
    "n.prototype.bind&&-1!=Function.prototype.bind.toString().indexOf(\"" +
    "native code\")?ea:fa;return ga.apply(null,arguments)}function ha(a," +
    "b){var c=Array.prototype.slice.call(arguments,1);return function()" +
    "{var b=c.slice();b.push.apply(b,arguments);return a.apply(this,b)}" +
    "}\nfunction t(a,b){function c(){}c.prototype=b.prototype;a.P=b.prot" +
    "otype;a.prototype=new c;a.prototype.constructor=a;a.O=function(a,c" +
    ",f){for(var g=Array(arguments.length-2),k=2;k<arguments.length;k++" +
    ")g[k-2]=arguments[k];return b.prototype[c].apply(a,g)}};function i" +
    "a(a){if(Error.captureStackTrace)Error.captureStackTrace(this,ia);e" +
    "lse{var b=Error().stack;b&&(this.stack=b)}a&&(this.message=String(" +
    "a))}t(ia,Error);ia.prototype.name=\"CustomError\";var ja;function ka" +
    "(a){var b=a.length-1;return 0<=b&&a.indexOf(\" \",b)==b}function la(" +
    "a,b){for(var c=a.split(\"%s\"),d=\"\",e=Array.prototype.slice.call(arg" +
    "uments,1);e.length&&1<c.length;)d+=c.shift()+e.shift();return d+c." +
    "join(\"%s\")}var ma=String.prototype.trim?function(a){return a.trim(" +
    ")}:function(a){return a.replace(/^[\\s\\xa0]+|[\\s\\xa0]+$/g,\"\")};func" +
    "tion na(a,b){return a<b?-1:a>b?1:0}function oa(a){return String(a)" +
    ".replace(/\\-([a-z])/g,function(a,c){return c.toUpperCase()})};func" +
    "tion pa(a,b){b.unshift(a);ia.call(this,la.apply(null,b));b.shift()" +
    "}t(pa,ia);pa.prototype.name=\"AssertionError\";function qa(a,b,c){if" +
    "(!a){var d=\"Assertion failed\";if(b)var d=d+(\": \"+b),e=Array.protot" +
    "ype.slice.call(arguments,2);throw new pa(\"\"+d,e||[]);}};var ra=Arr" +
    "ay.prototype;function sa(a,b){if(r(a))return r(b)&&1==b.length?a.i" +
    "ndexOf(b,0):-1;for(var c=0;c<a.length;c++)if(c in a&&a[c]===b)retu" +
    "rn c;return-1}function u(a,b){for(var c=a.length,d=r(a)?a.split(\"\"" +
    "):a,e=0;e<c;e++)e in d&&b.call(void 0,d[e],e,a)}function ta(a,b){f" +
    "or(var c=a.length,d=[],e=0,f=r(a)?a.split(\"\"):a,g=0;g<c;g++)if(g i" +
    "n f){var k=f[g];b.call(void 0,k,g,a)&&(d[e++]=k)}return d}function" +
    " ua(a,b,c){var d=c;u(a,function(c,f){d=b.call(void 0,d,c,f,a)});re" +
    "turn d}\nfunction va(a,b){for(var c=a.length,d=r(a)?a.split(\"\"):a,e" +
    "=0;e<c;e++)if(e in d&&b.call(void 0,d[e],e,a))return!0;return!1}fu" +
    "nction wa(a,b){for(var c=a.length,d=r(a)?a.split(\"\"):a,e=0;e<c;e++" +
    ")if(e in d&&!b.call(void 0,d[e],e,a))return!1;return!0}function xa" +
    "(a,b){var c;a:{c=a.length;for(var d=r(a)?a.split(\"\"):a,e=0;e<c;e++" +
    ")if(e in d&&b.call(void 0,d[e],e,a)){c=e;break a}c=-1}return 0>c?n" +
    "ull:r(a)?a.charAt(c):a[c]}function ya(a){return ra.concat.apply(ra" +
    ",arguments)}\nfunction za(a,b,c){qa(null!=a.length);return 2>=argum" +
    "ents.length?ra.slice.call(a,b):ra.slice.call(a,b,c)};/*xxx_rpl_lic" +
    "*/\nvar Aa=window;function v(a,b){this.x=q(a)?a:0;this.y=q(b)?b:0}v" +
    ".prototype.clone=function(){return new v(this.x,this.y)};v.prototy" +
    "pe.toString=function(){return\"(\"+this.x+\", \"+this.y+\")\"};v.prototy" +
    "pe.ceil=function(){this.x=Math.ceil(this.x);this.y=Math.ceil(this." +
    "y);return this};v.prototype.floor=function(){this.x=Math.floor(thi" +
    "s.x);this.y=Math.floor(this.y);return this};v.prototype.round=func" +
    "tion(){this.x=Math.round(this.x);this.y=Math.round(this.y);return " +
    "this};function Ba(a,b){this.width=a;this.height=b}Ba.prototype.clo" +
    "ne=function(){return new Ba(this.width,this.height)};Ba.prototype." +
    "toString=function(){return\"(\"+this.width+\" x \"+this.height+\")\"};Ba" +
    ".prototype.ceil=function(){this.width=Math.ceil(this.width);this.h" +
    "eight=Math.ceil(this.height);return this};Ba.prototype.floor=funct" +
    "ion(){this.width=Math.floor(this.width);this.height=Math.floor(thi" +
    "s.height);return this};\nBa.prototype.round=function(){this.width=M" +
    "ath.round(this.width);this.height=Math.round(this.height);return t" +
    "his};var Ca;a:{var Da=aa.navigator;if(Da){var Ea=Da.userAgent;if(E" +
    "a){Ca=Ea;break a}}Ca=\"\"};function w(a){return a?new Fa(x(a)):ja||(" +
    "ja=new Fa)}function Ga(a){for(;a&&1!=a.nodeType;)a=a.previousSibli" +
    "ng;return a}function Ha(a,b){if(a.contains&&1==b.nodeType)return a" +
    "==b||a.contains(b);if(\"undefined\"!=typeof a.compareDocumentPositio" +
    "n)return a==b||Boolean(a.compareDocumentPosition(b)&16);for(;b&&a!" +
    "=b;)b=b.parentNode;return b==a}\nfunction Ia(a,b){if(a==b)return 0;" +
    "if(a.compareDocumentPosition)return a.compareDocumentPosition(b)&2" +
    "?1:-1;if(\"sourceIndex\"in a||a.parentNode&&\"sourceIndex\"in a.parent" +
    "Node){var c=1==a.nodeType,d=1==b.nodeType;if(c&&d)return a.sourceI" +
    "ndex-b.sourceIndex;var e=a.parentNode,f=b.parentNode;return e==f?J" +
    "a(a,b):!c&&Ha(e,b)?-1*Ka(a,b):!d&&Ha(f,a)?Ka(b,a):(c?a.sourceIndex" +
    ":e.sourceIndex)-(d?b.sourceIndex:f.sourceIndex)}d=x(a);c=d.createR" +
    "ange();c.selectNode(a);c.collapse(!0);d=d.createRange();d.selectNo" +
    "de(b);\nd.collapse(!0);return c.compareBoundaryPoints(aa.Range.STAR" +
    "T_TO_END,d)}function Ka(a,b){var c=a.parentNode;if(c==b)return-1;f" +
    "or(var d=b;d.parentNode!=c;)d=d.parentNode;return Ja(d,a)}function" +
    " Ja(a,b){for(var c=b;c=c.previousSibling;)if(c==a)return-1;return " +
    "1}function x(a){qa(a,\"Node cannot be null or undefined.\");return 9" +
    "==a.nodeType?a:a.ownerDocument||a.document}function La(a,b){a=a.pa" +
    "rentNode;for(var c=0;a;){qa(\"parentNode\"!=a.name);if(b(a))return a" +
    ";a=a.parentNode;c++}return null}\nfunction Fa(a){this.a=a||aa.docum" +
    "ent||document}\nfunction y(a,b,c,d){a=d||a.a;var e=b&&\"*\"!=b?b.toUp" +
    "perCase():\"\";if(a.querySelectorAll&&a.querySelector&&(e||c))c=a.qu" +
    "erySelectorAll(e+(c?\".\"+c:\"\"));else if(c&&a.getElementsByClassName" +
    ")if(b=a.getElementsByClassName(c),e){a={};for(var f=d=0,g;g=b[f];f" +
    "++)e==g.nodeName&&(a[d++]=g);a.length=d;c=a}else c=b;else if(b=a.g" +
    "etElementsByTagName(e||\"*\"),c){a={};for(f=d=0;g=b[f];f++){var e=g." +
    "className,k;if(k=\"function\"==typeof e.split)k=0<=sa(e.split(/\\s+/)" +
    ",c);k&&(a[d++]=g)}a.length=d;c=a}else c=b;return c};function z(a,b" +
    "){this.a=Ma[a]||\"unknown error\";this.message=b||\"\";var c=this.a.re" +
    "place(/((?:^|\\s+)[a-z])/g,function(a){return a.toUpperCase().repla" +
    "ce(/^[\\s\\xa0]+/g,\"\")}),d=c.length-5;if(0>d||c.indexOf(\"Error\",d)!=" +
    "d)c+=\"Error\";this.name=c;c=Error(this.message);c.name=this.name;th" +
    "is.stack=c.stack||\"\"}t(z,Error);\nvar Ma={15:\"element not selectabl" +
    "e\",11:\"element not visible\",31:\"unknown error\",30:\"unknown error\"," +
    "24:\"invalid cookie domain\",29:\"invalid element coordinates\",12:\"in" +
    "valid element state\",32:\"invalid selector\",51:\"invalid selector\",5" +
    "2:\"invalid selector\",17:\"javascript error\",405:\"unsupported operat" +
    "ion\",34:\"move target out of bounds\",27:\"no such alert\",7:\"no such " +
    "element\",8:\"no such frame\",23:\"no such window\",28:\"script timeout\"" +
    ",33:\"session not created\",10:\"stale element reference\",21:\"timeout" +
    "\",25:\"unable to set cookie\",\n26:\"unexpected alert open\",13:\"unknow" +
    "n error\",9:\"unknown command\"};z.prototype.toString=function(){retu" +
    "rn this.name+\": \"+this.message};var Na={w:function(a){return!(!a.q" +
    "uerySelectorAll||!a.querySelector)},s:function(a,b){if(!a)throw ne" +
    "w z(32,\"No class name specified\");a=ma(a);if(-1!==a.indexOf(\" \"))t" +
    "hrow new z(32,\"Compound class names not permitted\");if(Na.w(b))try" +
    "{return b.querySelector(\".\"+a.replace(/\\./g,\"\\\\.\"))||null}catch(c)" +
    "{throw new z(32,\"An invalid or illegal class name was specified\");" +
    "}var d=y(w(b),\"*\",a,b);return d.length?d[0]:null},m:function(a,b){" +
    "if(!a)throw new z(32,\"No class name specified\");a=ma(a);if(-1!==a." +
    "indexOf(\" \"))throw new z(32,\n\"Compound class names not permitted\")" +
    ";if(Na.w(b))try{return b.querySelectorAll(\".\"+a.replace(/\\./g,\"\\\\." +
    "\"))}catch(c){throw new z(32,\"An invalid or illegal class name was " +
    "specified\");}return y(w(b),\"*\",a,b)}};function Oa(a){return(a=a.ex" +
    "ec(Ca))?a[1]:\"\"}Oa(/Android\\s+([0-9.]+)/)||Oa(/Version\\/([0-9.]+)/" +
    ");function Pa(a){var b=0,c=ma(String(Qa)).split(\".\");a=ma(String(a" +
    ")).split(\".\");for(var d=Math.max(c.length,a.length),e=0;0==b&&e<d;" +
    "e++){var f=c[e]||\"\",g=a[e]||\"\",k=RegExp(\"(\\\\d*)(\\\\D*)\",\"g\"),p=RegE" +
    "xp(\"(\\\\d*)(\\\\D*)\",\"g\");do{var m=k.exec(f)||[\"\",\"\",\"\"],h=p.exec(g)|" +
    "|[\"\",\"\",\"\"];if(0==m[0].length&&0==h[0].length)break;b=na(0==m[1].l" +
    "ength?0:parseInt(m[1],10),0==h[1].length?0:parseInt(h[1],10))||na(" +
    "0==m[2].length,0==h[2].length)||na(m[2],h[2])}while(0==b)}}\nvar Ra" +
    "=/Android\\s+([0-9\\.]+)/.exec(Ca),Qa=Ra?Ra[1]:\"0\";Pa(2.3);Pa(4);var" +
    " Sa={s:function(a,b){da(b.querySelector);if(!a)throw new z(32,\"No " +
    "selector specified\");a=ma(a);var c;try{c=b.querySelector(a)}catch(" +
    "d){throw new z(32,\"An invalid or illegal selector was specified\");" +
    "}return c&&1==c.nodeType?c:null},m:function(a,b){da(b.querySelecto" +
    "rAll);if(!a)throw new z(32,\"No selector specified\");a=ma(a);try{re" +
    "turn b.querySelectorAll(a)}catch(c){throw new z(32,\"An invalid or " +
    "illegal selector was specified\");}}};function Ta(a,b,c,d){this.top" +
    "=a;this.right=b;this.bottom=c;this.left=d}Ta.prototype.clone=funct" +
    "ion(){return new Ta(this.top,this.right,this.bottom,this.left)};Ta" +
    ".prototype.toString=function(){return\"(\"+this.top+\"t, \"+this.right" +
    "+\"r, \"+this.bottom+\"b, \"+this.left+\"l)\"};Ta.prototype.ceil=functio" +
    "n(){this.top=Math.ceil(this.top);this.right=Math.ceil(this.right);" +
    "this.bottom=Math.ceil(this.bottom);this.left=Math.ceil(this.left);" +
    "return this};\nTa.prototype.floor=function(){this.top=Math.floor(th" +
    "is.top);this.right=Math.floor(this.right);this.bottom=Math.floor(t" +
    "his.bottom);this.left=Math.floor(this.left);return this};Ta.protot" +
    "ype.round=function(){this.top=Math.round(this.top);this.right=Math" +
    ".round(this.right);this.bottom=Math.round(this.bottom);this.left=M" +
    "ath.round(this.left);return this};function A(a,b,c,d){this.left=a;" +
    "this.top=b;this.width=c;this.height=d}A.prototype.clone=function()" +
    "{return new A(this.left,this.top,this.width,this.height)};A.protot" +
    "ype.toString=function(){return\"(\"+this.left+\", \"+this.top+\" - \"+th" +
    "is.width+\"w x \"+this.height+\"h)\"};A.prototype.ceil=function(){this" +
    ".left=Math.ceil(this.left);this.top=Math.ceil(this.top);this.width" +
    "=Math.ceil(this.width);this.height=Math.ceil(this.height);return t" +
    "his};\nA.prototype.floor=function(){this.left=Math.floor(this.left)" +
    ";this.top=Math.floor(this.top);this.width=Math.floor(this.width);t" +
    "his.height=Math.floor(this.height);return this};A.prototype.round=" +
    "function(){this.left=Math.round(this.left);this.top=Math.round(thi" +
    "s.top);this.width=Math.round(this.width);this.height=Math.round(th" +
    "is.height);return this};/*\n\n The MIT License\n\n Copyright (c) 2007 " +
    "Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is " +
    "hereby granted, free of charge, to any person obtaining a copy\n of" +
    " this software and associated documentation files (the \"Software\")" +
    ", to\n deal in the Software without restriction, including without " +
    "limitation the\n rights to use, copy, modify, merge, publish, distr" +
    "ibute, sublicense, and/or\n sell copies of the Software, and to per" +
    "mit persons to whom the Software is\n furnished to do so, subject t" +
    "o the following conditions:\n\n The above copyright notice and this " +
    "permission notice shall be included in\n all copies or substantial " +
    "portions of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITH" +
    "OUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT L" +
    "IMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTIC" +
    "ULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS O" +
    "R COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIA" +
    "BILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISI" +
    "NG\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR " +
    "OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction Ua(a,b,c){this.a=a;th" +
    "is.b=b||1;this.f=c||1};function Va(a){this.b=a;this.a=0}function W" +
    "a(a){a=a.match(Xa);for(var b=0;b<a.length;b++)Ya.test(a[b])&&a.spl" +
    "ice(b,1);return new Va(a)}var Xa=RegExp(\"\\\\$?(?:(?![0-9-])[\\\\w-]+:" +
    ")?(?![0-9-])[\\\\w-]+|\\\\/\\\\/|\\\\.\\\\.|::|\\\\d+(?:\\\\.\\\\d*)?|\\\\.\\\\d+|\\\"[^" +
    "\\\"]*\\\"|'[^']*'|[!<>]=|\\\\s+|.\",\"g\"),Ya=/^\\s/;function C(a,b){return" +
    " a.b[a.a+(b||0)]}function D(a){return a.b[a.a++]}function Za(a){re" +
    "turn a.b.length<=a.a};function E(a){var b=null,c=a.nodeType;1==c&&" +
    "(b=a.textContent,b=void 0==b||null==b?a.innerText:b,b=void 0==b||n" +
    "ull==b?\"\":b);if(\"string\"!=typeof b)if(9==c||1==c){a=9==c?a.documen" +
    "tElement:a.firstChild;for(var c=0,d=[],b=\"\";a;){do 1!=a.nodeType&&" +
    "(b+=a.nodeValue),d[c++]=a;while(a=a.firstChild);for(;c&&!(a=d[--c]" +
    ".nextSibling););}}else b=a.nodeValue;return\"\"+b}\nfunction $a(a,b,c" +
    "){if(null===b)return!0;try{if(!a.getAttribute)return!1}catch(d){re" +
    "turn!1}return null==c?!!a.getAttribute(b):a.getAttribute(b,2)==c}f" +
    "unction ab(a,b,c,d,e){return bb.call(null,a,b,r(c)?c:null,r(d)?d:n" +
    "ull,e||new F)}\nfunction bb(a,b,c,d,e){b.getElementsByName&&d&&\"nam" +
    "e\"==c?(b=b.getElementsByName(d),u(b,function(b){a.a(b)&&G(e,b)})):" +
    "b.getElementsByClassName&&d&&\"class\"==c?(b=b.getElementsByClassNam" +
    "e(d),u(b,function(b){b.className==d&&a.a(b)&&G(e,b)})):a instanceo" +
    "f H?cb(a,b,c,d,e):b.getElementsByTagName&&(b=b.getElementsByTagNam" +
    "e(a.f()),u(b,function(a){$a(a,c,d)&&G(e,a)}));return e}function db" +
    "(a,b,c,d,e){for(b=b.firstChild;b;b=b.nextSibling)$a(b,c,d)&&a.a(b)" +
    "&&G(e,b);return e}\nfunction cb(a,b,c,d,e){for(b=b.firstChild;b;b=b" +
    ".nextSibling)$a(b,c,d)&&a.a(b)&&G(e,b),cb(a,b,c,d,e)};function F()" +
    "{this.b=this.a=null;this.l=0}function eb(a){this.node=a;this.a=thi" +
    "s.b=null}function fb(a,b){if(!a.a)return b;if(!b.a)return a;for(va" +
    "r c=a.a,d=b.a,e=null,f=null,g=0;c&&d;)c.node==d.node?(f=c,c=c.a,d=" +
    "d.a):0<Ia(c.node,d.node)?(f=d,d=d.a):(f=c,c=c.a),(f.b=e)?e.a=f:a.a" +
    "=f,e=f,g++;for(f=c||d;f;)f.b=e,e=e.a=f,g++,f=f.a;a.b=e;a.l=g;retur" +
    "n a}function gb(a,b){var c=new eb(b);c.a=a.a;a.b?a.a.b=c:a.a=a.b=c" +
    ";a.a=c;a.l++}function G(a,b){var c=new eb(b);c.b=a.b;a.a?a.b.a=c:a" +
    ".a=a.b=c;a.b=c;a.l++}\nfunction hb(a){return(a=a.a)?a.node:null}fun" +
    "ction ib(a){return(a=hb(a))?E(a):\"\"}function I(a,b){return new jb(" +
    "a,!!b)}function jb(a,b){this.f=a;this.b=(this.c=b)?a.b:a.a;this.a=" +
    "null}function J(a){var b=a.b;if(null==b)return null;var c=a.a=b;a." +
    "b=a.c?b.b:b.a;return c.node};function kb(a){switch(a.nodeType){cas" +
    "e 1:return ha(lb,a);case 9:return kb(a.documentElement);case 11:ca" +
    "se 10:case 6:case 12:return mb;default:return a.parentNode?kb(a.pa" +
    "rentNode):mb}}function mb(){return null}function lb(a,b){if(a.pref" +
    "ix==b)return a.namespaceURI||\"http://www.w3.org/1999/xhtml\";var c=" +
    "a.getAttributeNode(\"xmlns:\"+b);return c&&c.specified?c.value||null" +
    ":a.parentNode&&9!=a.parentNode.nodeType?lb(a.parentNode,b):null};f" +
    "unction K(a){this.i=a;this.b=this.g=!1;this.f=null}function L(a){r" +
    "eturn\"\\n  \"+a.toString().split(\"\\n\").join(\"\\n  \")}function nb(a,b)" +
    "{a.g=b}function ob(a,b){a.b=b}function M(a,b){var c=a.a(b);return " +
    "c instanceof F?+ib(c):+c}function O(a,b){var c=a.a(b);return c ins" +
    "tanceof F?ib(c):\"\"+c}function pb(a,b){var c=a.a(b);return c instan" +
    "ceof F?!!c.l:!!c};function qb(a,b,c){K.call(this,a.i);this.c=a;thi" +
    "s.h=b;this.u=c;this.g=b.g||c.g;this.b=b.b||c.b;this.c==rb&&(c.b||c" +
    ".g||4==c.i||0==c.i||!b.f?b.b||b.g||4==b.i||0==b.i||!c.f||(this.f={" +
    "name:c.f.name,v:b}):this.f={name:b.f.name,v:c})}t(qb,K);\nfunction " +
    "sb(a,b,c,d,e){b=b.a(d);c=c.a(d);var f;if(b instanceof F&&c instanc" +
    "eof F){e=I(b);for(d=J(e);d;d=J(e))for(b=I(c),f=J(b);f;f=J(b))if(a(" +
    "E(d),E(f)))return!0;return!1}if(b instanceof F||c instanceof F){b " +
    "instanceof F?e=b:(e=c,c=b);e=I(e);b=typeof c;for(d=J(e);d;d=J(e)){" +
    "switch(b){case \"number\":d=+E(d);break;case \"boolean\":d=!!E(d);brea" +
    "k;case \"string\":d=E(d);break;default:throw Error(\"Illegal primitiv" +
    "e type for comparison.\");}if(a(d,c))return!0}return!1}return e?\"bo" +
    "olean\"==typeof b||\"boolean\"==typeof c?\na(!!b,!!c):\"number\"==typeof" +
    " b||\"number\"==typeof c?a(+b,+c):a(b,c):a(+b,+c)}qb.prototype.a=fun" +
    "ction(a){return this.c.o(this.h,this.u,a)};qb.prototype.toString=f" +
    "unction(){var a=\"Binary Expression: \"+this.c,a=a+L(this.h);return " +
    "a+=L(this.u)};function tb(a,b,c,d){this.a=a;this.H=b;this.i=c;this" +
    ".o=d}tb.prototype.toString=l(\"a\");var ub={};function P(a,b,c,d){if" +
    "(ub.hasOwnProperty(a))throw Error(\"Binary operator already created" +
    ": \"+a);a=new tb(a,b,c,d);return ub[a.toString()]=a}\nP(\"div\",6,1,fu" +
    "nction(a,b,c){return M(a,c)/M(b,c)});P(\"mod\",6,1,function(a,b,c){r" +
    "eturn M(a,c)%M(b,c)});P(\"*\",6,1,function(a,b,c){return M(a,c)*M(b," +
    "c)});P(\"+\",5,1,function(a,b,c){return M(a,c)+M(b,c)});P(\"-\",5,1,fu" +
    "nction(a,b,c){return M(a,c)-M(b,c)});P(\"<\",4,2,function(a,b,c){ret" +
    "urn sb(function(a,b){return a<b},a,b,c)});P(\">\",4,2,function(a,b,c" +
    "){return sb(function(a,b){return a>b},a,b,c)});P(\"<=\",4,2,function" +
    "(a,b,c){return sb(function(a,b){return a<=b},a,b,c)});\nP(\">=\",4,2," +
    "function(a,b,c){return sb(function(a,b){return a>=b},a,b,c)});var " +
    "rb=P(\"=\",3,2,function(a,b,c){return sb(function(a,b){return a==b}," +
    "a,b,c,!0)});P(\"!=\",3,2,function(a,b,c){return sb(function(a,b){ret" +
    "urn a!=b},a,b,c,!0)});P(\"and\",2,2,function(a,b,c){return pb(a,c)&&" +
    "pb(b,c)});P(\"or\",1,2,function(a,b,c){return pb(a,c)||pb(b,c)});fun" +
    "ction vb(a,b){if(b.a.length&&4!=a.i)throw Error(\"Primary expressio" +
    "n must evaluate to nodeset if filter has predicate(s).\");K.call(th" +
    "is,a.i);this.c=a;this.h=b;this.g=a.g;this.b=a.b}t(vb,K);vb.prototy" +
    "pe.a=function(a){a=this.c.a(a);return wb(this.h,a)};vb.prototype.t" +
    "oString=function(){var a;a=\"Filter:\"+L(this.c);return a+=L(this.h)" +
    "};function xb(a,b){if(b.length<a.I)throw Error(\"Function \"+a.j+\" e" +
    "xpects at least\"+a.I+\" arguments, \"+b.length+\" given\");if(null!==a" +
    ".B&&b.length>a.B)throw Error(\"Function \"+a.j+\" expects at most \"+a" +
    ".B+\" arguments, \"+b.length+\" given\");a.N&&u(b,function(b,d){if(4!=" +
    "b.i)throw Error(\"Argument \"+d+\" to function \"+a.j+\" is not of type" +
    " Nodeset: \"+b);});K.call(this,a.i);this.h=a;this.c=b;nb(this,a.g||" +
    "va(b,function(a){return a.g}));ob(this,a.M&&!b.length||a.L&&!!b.le" +
    "ngth||va(b,function(a){return a.b}))}\nt(xb,K);xb.prototype.a=funct" +
    "ion(a){return this.h.o.apply(null,ya(a,this.c))};xb.prototype.toSt" +
    "ring=function(){var a=\"Function: \"+this.h;if(this.c.length)var b=u" +
    "a(this.c,function(a,b){return a+L(b)},\"Arguments:\"),a=a+L(b);retur" +
    "n a};function yb(a,b,c,d,e,f,g,k,p){this.j=a;this.i=b;this.g=c;thi" +
    "s.M=d;this.L=e;this.o=f;this.I=g;this.B=q(k)?k:g;this.N=!!p}yb.pro" +
    "totype.toString=l(\"j\");var zb={};\nfunction Q(a,b,c,d,e,f,g,k){if(z" +
    "b.hasOwnProperty(a))throw Error(\"Function already created: \"+a+\".\"" +
    ");zb[a]=new yb(a,b,c,d,!1,e,f,g,k)}Q(\"boolean\",2,!1,!1,function(a," +
    "b){return pb(b,a)},1);Q(\"ceiling\",1,!1,!1,function(a,b){return Mat" +
    "h.ceil(M(b,a))},1);Q(\"concat\",3,!1,!1,function(a,b){var c=za(argum" +
    "ents,1);return ua(c,function(b,c){return b+O(c,a)},\"\")},2,null);Q(" +
    "\"contains\",2,!1,!1,function(a,b,c){b=O(b,a);a=O(c,a);return-1!=b.i" +
    "ndexOf(a)},2);Q(\"count\",1,!1,!1,function(a,b){return b.a(a).l},1,1" +
    ",!0);\nQ(\"false\",2,!1,!1,n(!1),0);Q(\"floor\",1,!1,!1,function(a,b){r" +
    "eturn Math.floor(M(b,a))},1);Q(\"id\",4,!1,!1,function(a,b){var c=a." +
    "a,d=9==c.nodeType?c:c.ownerDocument,c=O(b,a).split(/\\s+/),e=[];u(c" +
    ",function(a){a=d.getElementById(a);!a||0<=sa(e,a)||e.push(a)});e.s" +
    "ort(Ia);var f=new F;u(e,function(a){G(f,a)});return f},1);Q(\"lang\"" +
    ",2,!1,!1,n(!1),1);Q(\"last\",1,!0,!1,function(a){if(1!=arguments.len" +
    "gth)throw Error(\"Function last expects ()\");return a.f},0);\nQ(\"loc" +
    "al-name\",3,!1,!0,function(a,b){var c=b?hb(b.a(a)):a.a;return c?c.l" +
    "ocalName||c.nodeName.toLowerCase():\"\"},0,1,!0);Q(\"name\",3,!1,!0,fu" +
    "nction(a,b){var c=b?hb(b.a(a)):a.a;return c?c.nodeName.toLowerCase" +
    "():\"\"},0,1,!0);Q(\"namespace-uri\",3,!0,!1,n(\"\"),0,1,!0);Q(\"normaliz" +
    "e-space\",3,!1,!0,function(a,b){return(b?O(b,a):E(a.a)).replace(/[\\" +
    "s\\xa0]+/g,\" \").replace(/^\\s+|\\s+$/g,\"\")},0,1);Q(\"not\",2,!1,!1,func" +
    "tion(a,b){return!pb(b,a)},1);Q(\"number\",1,!1,!0,function(a,b){retu" +
    "rn b?M(b,a):+E(a.a)},0,1);\nQ(\"position\",1,!0,!1,function(a){return" +
    " a.b},0);Q(\"round\",1,!1,!1,function(a,b){return Math.round(M(b,a))" +
    "},1);Q(\"starts-with\",2,!1,!1,function(a,b,c){b=O(b,a);a=O(c,a);ret" +
    "urn 0==b.lastIndexOf(a,0)},2);Q(\"string\",3,!1,!0,function(a,b){ret" +
    "urn b?O(b,a):E(a.a)},0,1);Q(\"string-length\",1,!1,!0,function(a,b){" +
    "return(b?O(b,a):E(a.a)).length},0,1);\nQ(\"substring\",3,!1,!1,functi" +
    "on(a,b,c,d){c=M(c,a);if(isNaN(c)||Infinity==c||-Infinity==c)return" +
    "\"\";d=d?M(d,a):Infinity;if(isNaN(d)||-Infinity===d)return\"\";c=Math." +
    "round(c)-1;var e=Math.max(c,0);a=O(b,a);if(Infinity==d)return a.su" +
    "bstring(e);b=Math.round(d);return a.substring(e,c+b)},2,3);Q(\"subs" +
    "tring-after\",3,!1,!1,function(a,b,c){b=O(b,a);a=O(c,a);c=b.indexOf" +
    "(a);return-1==c?\"\":b.substring(c+a.length)},2);\nQ(\"substring-befor" +
    "e\",3,!1,!1,function(a,b,c){b=O(b,a);a=O(c,a);a=b.indexOf(a);return" +
    "-1==a?\"\":b.substring(0,a)},2);Q(\"sum\",1,!1,!1,function(a,b){for(va" +
    "r c=I(b.a(a)),d=0,e=J(c);e;e=J(c))d+=+E(e);return d},1,1,!0);Q(\"tr" +
    "anslate\",3,!1,!1,function(a,b,c,d){b=O(b,a);c=O(c,a);var e=O(d,a);" +
    "a=[];for(d=0;d<c.length;d++){var f=c.charAt(d);f in a||(a[f]=e.cha" +
    "rAt(d))}c=\"\";for(d=0;d<b.length;d++)f=b.charAt(d),c+=f in a?a[f]:f" +
    ";return c},3);Q(\"true\",2,!1,!1,n(!0),0);function H(a,b){this.h=a;t" +
    "his.c=q(b)?b:null;this.b=null;switch(a){case \"comment\":this.b=8;br" +
    "eak;case \"text\":this.b=3;break;case \"processing-instruction\":this." +
    "b=7;break;case \"node\":break;default:throw Error(\"Unexpected argume" +
    "nt\");}}function Ab(a){return\"comment\"==a||\"text\"==a||\"processing-i" +
    "nstruction\"==a||\"node\"==a}H.prototype.a=function(a){return null===" +
    "this.b||this.b==a.nodeType};H.prototype.f=l(\"h\");H.prototype.toStr" +
    "ing=function(){var a=\"Kind Test: \"+this.h;null===this.c||(a+=L(thi" +
    "s.c));return a};function Bb(a){K.call(this,3);this.c=a.substring(1" +
    ",a.length-1)}t(Bb,K);Bb.prototype.a=l(\"c\");Bb.prototype.toString=f" +
    "unction(){return\"Literal: \"+this.c};function Cb(a,b){this.j=a.toLo" +
    "werCase();this.b=b?b.toLowerCase():\"http://www.w3.org/1999/xhtml\"}" +
    "Cb.prototype.a=function(a){var b=a.nodeType;return 1!=b&&2!=b?!1:\"" +
    "*\"!=this.j&&this.j!=a.nodeName.toLowerCase()?!1:this.b==(a.namespa" +
    "ceURI?a.namespaceURI.toLowerCase():\"http://www.w3.org/1999/xhtml\")" +
    "};Cb.prototype.f=l(\"j\");Cb.prototype.toString=function(){return\"Na" +
    "me Test: \"+(\"http://www.w3.org/1999/xhtml\"==this.b?\"\":this.b+\":\")+" +
    "this.j};function Db(a){K.call(this,1);this.c=a}t(Db,K);Db.prototyp" +
    "e.a=l(\"c\");Db.prototype.toString=function(){return\"Number: \"+this." +
    "c};function Eb(a,b){K.call(this,a.i);this.h=a;this.c=b;this.g=a.g;" +
    "this.b=a.b;if(1==this.c.length){var c=this.c[0];c.A||c.c!=Fb||(c=c" +
    ".u,\"*\"!=c.f()&&(this.f={name:c.f(),v:null}))}}t(Eb,K);function Gb(" +
    "){K.call(this,4)}t(Gb,K);Gb.prototype.a=function(a){var b=new F;a=" +
    "a.a;9==a.nodeType?G(b,a):G(b,a.ownerDocument);return b};Gb.prototy" +
    "pe.toString=n(\"Root Helper Expression\");function Hb(){K.call(this," +
    "4)}t(Hb,K);Hb.prototype.a=function(a){var b=new F;G(b,a.a);return " +
    "b};Hb.prototype.toString=n(\"Context Helper Expression\");\nfunction " +
    "Ib(a){return\"/\"==a||\"//\"==a}Eb.prototype.a=function(a){var b=this." +
    "h.a(a);if(!(b instanceof F))throw Error(\"Filter expression must ev" +
    "aluate to nodeset.\");a=this.c;for(var c=0,d=a.length;c<d&&b.l;c++)" +
    "{var e=a[c],f=I(b,e.c.a),g;if(e.g||e.c!=Jb)if(e.g||e.c!=Kb)for(g=J" +
    "(f),b=e.a(new Ua(g));null!=(g=J(f));)g=e.a(new Ua(g)),b=fb(b,g);el" +
    "se g=J(f),b=e.a(new Ua(g));else{for(g=J(f);(b=J(f))&&(!g.contains|" +
    "|g.contains(b))&&b.compareDocumentPosition(g)&8;g=b);b=e.a(new Ua(" +
    "g))}}return b};\nEb.prototype.toString=function(){var a;a=\"Path Exp" +
    "ression:\"+L(this.h);if(this.c.length){var b=ua(this.c,function(a,b" +
    "){return a+L(b)},\"Steps:\");a+=L(b)}return a};function Mb(a,b){this" +
    ".a=a;this.b=!!b}\nfunction wb(a,b,c){for(c=c||0;c<a.a.length;c++)fo" +
    "r(var d=a.a[c],e=I(b),f=b.l,g,k=0;g=J(e);k++){var p=a.b?f-k:k+1;g=" +
    "d.a(new Ua(g,p,f));if(\"number\"==typeof g)p=p==g;else if(\"string\"==" +
    "typeof g||\"boolean\"==typeof g)p=!!g;else if(g instanceof F)p=0<g.l" +
    ";else throw Error(\"Predicate.evaluate returned an unexpected type." +
    "\");if(!p){p=e;g=p.f;var m=p.a;if(!m)throw Error(\"Next must be call" +
    "ed at least once before remove.\");var h=m.b,m=m.a;h?h.a=m:g.a=m;m?" +
    "m.b=h:g.b=h;g.l--;p.a=null}}return b}\nMb.prototype.toString=functi" +
    "on(){return ua(this.a,function(a,b){return a+L(b)},\"Predicates:\")}" +
    ";function R(a,b,c,d){K.call(this,4);this.c=a;this.u=b;this.h=c||ne" +
    "w Mb([]);this.A=!!d;b=this.h;b=0<b.a.length?b.a[0].f:null;a.b&&b&&" +
    "(this.f={name:b.name,v:b.v});a:{a=this.h;for(b=0;b<a.a.length;b++)" +
    "if(c=a.a[b],c.g||1==c.i||0==c.i){a=!0;break a}a=!1}this.g=a}t(R,K)" +
    ";\nR.prototype.a=function(a){var b=a.a,c=null,c=this.f,d=null,e=nul" +
    "l,f=0;c&&(d=c.name,e=c.v?O(c.v,a):null,f=1);if(this.A)if(this.g||t" +
    "his.c!=Nb)if(a=I((new R(Ob,new H(\"node\"))).a(a)),b=J(a))for(c=this" +
    ".o(b,d,e,f);null!=(b=J(a));)c=fb(c,this.o(b,d,e,f));else c=new F;e" +
    "lse c=ab(this.u,b,d,e),c=wb(this.h,c,f);else c=this.o(a.a,d,e,f);r" +
    "eturn c};R.prototype.o=function(a,b,c,d){a=this.c.f(this.u,a,b,c);" +
    "return a=wb(this.h,a,d)};\nR.prototype.toString=function(){var a;a=" +
    "\"Step:\"+L(\"Operator: \"+(this.A?\"//\":\"/\"));this.c.j&&(a+=L(\"Axis: \"" +
    "+this.c));a+=L(this.u);if(this.h.a.length){var b=ua(this.h.a,funct" +
    "ion(a,b){return a+L(b)},\"Predicates:\");a+=L(b)}return a};function " +
    "Pb(a,b,c,d){this.j=a;this.f=b;this.a=c;this.b=d}Pb.prototype.toStr" +
    "ing=l(\"j\");var Qb={};function S(a,b,c,d){if(Qb.hasOwnProperty(a))t" +
    "hrow Error(\"Axis already created: \"+a);b=new Pb(a,b,c,!!d);return " +
    "Qb[a]=b}\nS(\"ancestor\",function(a,b){for(var c=new F,d=b;d=d.parent" +
    "Node;)a.a(d)&&gb(c,d);return c},!0);S(\"ancestor-or-self\",function(" +
    "a,b){var c=new F,d=b;do a.a(d)&&gb(c,d);while(d=d.parentNode);retu" +
    "rn c},!0);var Fb=S(\"attribute\",function(a,b){var c=new F,d=a.f(),e" +
    "=b.attributes;if(e)if(a instanceof H&&null===a.b||\"*\"==d)for(var d" +
    "=0,f;f=e[d];d++)G(c,f);else(f=e.getNamedItem(d))&&G(c,f);return c}" +
    ",!1),Nb=S(\"child\",function(a,b,c,d,e){return db.call(null,a,b,r(c)" +
    "?c:null,r(d)?d:null,e||new F)},!1,!0);\nS(\"descendant\",ab,!1,!0);va" +
    "r Ob=S(\"descendant-or-self\",function(a,b,c,d){var e=new F;$a(b,c,d" +
    ")&&a.a(b)&&G(e,b);return ab(a,b,c,d,e)},!1,!0),Jb=S(\"following\",fu" +
    "nction(a,b,c,d){var e=new F;do for(var f=b;f=f.nextSibling;)$a(f,c" +
    ",d)&&a.a(f)&&G(e,f),e=ab(a,f,c,d,e);while(b=b.parentNode);return e" +
    "},!1,!0);S(\"following-sibling\",function(a,b){for(var c=new F,d=b;d" +
    "=d.nextSibling;)a.a(d)&&G(c,d);return c},!1);S(\"namespace\",functio"
  )
      .append(
    "n(){return new F},!1);\nvar Rb=S(\"parent\",function(a,b){var c=new F" +
    ";if(9==b.nodeType)return c;if(2==b.nodeType)return G(c,b.ownerElem" +
    "ent),c;var d=b.parentNode;a.a(d)&&G(c,d);return c},!1),Kb=S(\"prece" +
    "ding\",function(a,b,c,d){var e=new F,f=[];do f.unshift(b);while(b=b" +
    ".parentNode);for(var g=1,k=f.length;g<k;g++){var p=[];for(b=f[g];b" +
    "=b.previousSibling;)p.unshift(b);for(var m=0,h=p.length;m<h;m++)b=" +
    "p[m],$a(b,c,d)&&a.a(b)&&G(e,b),e=ab(a,b,c,d,e)}return e},!0,!0);\nS" +
    "(\"preceding-sibling\",function(a,b){for(var c=new F,d=b;d=d.previou" +
    "sSibling;)a.a(d)&&gb(c,d);return c},!0);var Sb=S(\"self\",function(a" +
    ",b){var c=new F;a.a(b)&&G(c,b);return c},!1);function Tb(a){K.call" +
    "(this,1);this.c=a;this.g=a.g;this.b=a.b}t(Tb,K);Tb.prototype.a=fun" +
    "ction(a){return-M(this.c,a)};Tb.prototype.toString=function(){retu" +
    "rn\"Unary Expression: -\"+L(this.c)};function Ub(a){K.call(this,4);t" +
    "his.c=a;nb(this,va(this.c,function(a){return a.g}));ob(this,va(thi" +
    "s.c,function(a){return a.b}))}t(Ub,K);Ub.prototype.a=function(a){v" +
    "ar b=new F;u(this.c,function(c){c=c.a(a);if(!(c instanceof F))thro" +
    "w Error(\"Path expression must evaluate to NodeSet.\");b=fb(b,c)});r" +
    "eturn b};Ub.prototype.toString=function(){return ua(this.c,functio" +
    "n(a,b){return a+L(b)},\"Union Expression:\")};function Vb(a,b){this." +
    "a=a;this.b=b}function Wb(a){for(var b,c=[];;){T(a,\"Missing right h" +
    "and side of binary expression.\");b=Xb(a);var d=D(a.a);if(!d)break;" +
    "var e=(d=ub[d]||null)&&d.H;if(!e){a.a.a--;break}for(;c.length&&e<=" +
    "c[c.length-1].H;)b=new qb(c.pop(),c.pop(),b);c.push(b,d)}for(;c.le" +
    "ngth;)b=new qb(c.pop(),c.pop(),b);return b}function T(a,b){if(Za(a" +
    ".a))throw Error(b);}function Yb(a,b){var c=D(a.a);if(c!=b)throw Er" +
    "ror(\"Bad token, expected: \"+b+\" got: \"+c);}\nfunction Zb(a){a=D(a.a" +
    ");if(\")\"!=a)throw Error(\"Bad token: \"+a);}function $b(a){a=D(a.a);" +
    "if(2>a.length)throw Error(\"Unclosed literal string\");return new Bb" +
    "(a)}function ac(a){var b=D(a.a),c=b.indexOf(\":\");if(-1==c)return n" +
    "ew Cb(b);var d=b.substring(0,c);a=a.b(d);if(!a)throw Error(\"Namesp" +
    "ace prefix not declared: \"+d);b=b.substr(c+1);return new Cb(b,a)}\n" +
    "function bc(a){var b,c=[],d;if(Ib(C(a.a))){b=D(a.a);d=C(a.a);if(\"/" +
    "\"==b&&(Za(a.a)||\".\"!=d&&\"..\"!=d&&\"@\"!=d&&\"*\"!=d&&!/(?![0-9])[\\w]/." +
    "test(d)))return new Gb;d=new Gb;T(a,\"Missing next location step.\")" +
    ";b=cc(a,b);c.push(b)}else{a:{b=C(a.a);d=b.charAt(0);switch(d){case" +
    " \"$\":throw Error(\"Variable reference not allowed in HTML XPath\");c" +
    "ase \"(\":D(a.a);b=Wb(a);T(a,'unclosed \"(\"');Yb(a,\")\");break;case '\"" +
    "':case \"'\":b=$b(a);break;default:if(isNaN(+b))if(!Ab(b)&&/(?![0-9]" +
    ")[\\w]/.test(d)&&\"(\"==C(a.a,1)){b=D(a.a);\nb=zb[b]||null;D(a.a);for(" +
    "d=[];\")\"!=C(a.a);){T(a,\"Missing function argument list.\");d.push(W" +
    "b(a));if(\",\"!=C(a.a))break;D(a.a)}T(a,\"Unclosed function argument " +
    "list.\");Zb(a);b=new xb(b,d)}else{b=null;break a}else b=new Db(+D(a" +
    ".a))}\"[\"==C(a.a)&&(d=new Mb(dc(a)),b=new vb(b,d))}if(b)if(Ib(C(a.a" +
    ")))d=b;else return b;else b=cc(a,\"/\"),d=new Hb,c.push(b)}for(;Ib(C" +
    "(a.a));)b=D(a.a),T(a,\"Missing next location step.\"),b=cc(a,b),c.pu" +
    "sh(b);return new Eb(d,c)}\nfunction cc(a,b){var c,d,e;if(\"/\"!=b&&\"/" +
    "/\"!=b)throw Error('Step op should be \"/\" or \"//\"');if(\".\"==C(a.a))" +
    "return d=new R(Sb,new H(\"node\")),D(a.a),d;if(\"..\"==C(a.a))return d" +
    "=new R(Rb,new H(\"node\")),D(a.a),d;var f;if(\"@\"==C(a.a))f=Fb,D(a.a)" +
    ",T(a,\"Missing attribute name\");else if(\"::\"==C(a.a,1)){if(!/(?![0-" +
    "9])[\\w]/.test(C(a.a).charAt(0)))throw Error(\"Bad token: \"+D(a.a));" +
    "c=D(a.a);f=Qb[c]||null;if(!f)throw Error(\"No axis with name: \"+c);" +
    "D(a.a);T(a,\"Missing node name\")}else f=Nb;c=C(a.a);if(/(?![0-9])[\\" +
    "w]/.test(c.charAt(0)))if(\"(\"==\nC(a.a,1)){if(!Ab(c))throw Error(\"In" +
    "valid node type: \"+c);c=D(a.a);if(!Ab(c))throw Error(\"Invalid type" +
    " name: \"+c);Yb(a,\"(\");T(a,\"Bad nodetype\");e=C(a.a).charAt(0);var g" +
    "=null;if('\"'==e||\"'\"==e)g=$b(a);T(a,\"Bad nodetype\");Zb(a);c=new H(" +
    "c,g)}else c=ac(a);else if(\"*\"==c)c=ac(a);else throw Error(\"Bad tok" +
    "en: \"+D(a.a));e=new Mb(dc(a),f.a);return d||new R(f,c,e,\"//\"==b)}\n" +
    "function dc(a){for(var b=[];\"[\"==C(a.a);){D(a.a);T(a,\"Missing pred" +
    "icate expression.\");var c=Wb(a);b.push(c);T(a,\"Unclosed predicate " +
    "expression.\");Yb(a,\"]\")}return b}function Xb(a){if(\"-\"==C(a.a))ret" +
    "urn D(a.a),new Tb(Xb(a));var b=bc(a);if(\"|\"!=C(a.a))a=b;else{for(b" +
    "=[b];\"|\"==D(a.a);)T(a,\"Missing next union location path.\"),b.push(" +
    "bc(a));a.a.a--;a=new Ub(b)}return a};function ec(a,b){if(!a.length" +
    ")throw Error(\"Empty XPath expression.\");var c=Wa(a);if(Za(c))throw" +
    " Error(\"Invalid XPath expression.\");b?da(b)||(b=ga(b.lookupNamespa" +
    "ceURI,b)):b=n(null);var d=Wb(new Vb(c,b));if(!Za(c))throw Error(\"B" +
    "ad token: \"+D(c));this.evaluate=function(a,b){var c=d.a(new Ua(a))" +
    ";return new U(c,b)}}\nfunction U(a,b){if(0==b)if(a instanceof F)b=4" +
    ";else if(\"string\"==typeof a)b=2;else if(\"number\"==typeof a)b=1;els" +
    "e if(\"boolean\"==typeof a)b=3;else throw Error(\"Unexpected evaluati" +
    "on result.\");if(2!=b&&1!=b&&3!=b&&!(a instanceof F))throw Error(\"v" +
    "alue could not be converted to the specified type\");this.resultTyp" +
    "e=b;var c;switch(b){case 2:this.stringValue=a instanceof F?ib(a):\"" +
    "\"+a;break;case 1:this.numberValue=a instanceof F?+ib(a):+a;break;c" +
    "ase 3:this.booleanValue=a instanceof F?0<a.l:!!a;break;case 4:case" +
    " 5:case 6:case 7:var d=\nI(a);c=[];for(var e=J(d);e;e=J(d))c.push(e" +
    ");this.snapshotLength=a.l;this.invalidIteratorState=!1;break;case " +
    "8:case 9:this.singleNodeValue=hb(a);break;default:throw Error(\"Unk" +
    "nown XPathResult type.\");}var f=0;this.iterateNext=function(){if(4" +
    "!=b&&5!=b)throw Error(\"iterateNext called with wrong result type\")" +
    ";return f>=c.length?null:c[f++]};this.snapshotItem=function(a){if(" +
    "6!=b&&7!=b)throw Error(\"snapshotItem called with wrong result type" +
    "\");return a>=c.length||0>a?null:c[a]}}U.ANY_TYPE=0;\nU.NUMBER_TYPE=" +
    "1;U.STRING_TYPE=2;U.BOOLEAN_TYPE=3;U.UNORDERED_NODE_ITERATOR_TYPE=" +
    "4;U.ORDERED_NODE_ITERATOR_TYPE=5;U.UNORDERED_NODE_SNAPSHOT_TYPE=6;" +
    "U.ORDERED_NODE_SNAPSHOT_TYPE=7;U.ANY_UNORDERED_NODE_TYPE=8;U.FIRST" +
    "_ORDERED_NODE_TYPE=9;function fc(a){this.lookupNamespaceURI=kb(a)}" +
    "\nfunction gc(a){a=a||aa;var b=a.document;b.evaluate||(a.XPathResul" +
    "t=U,b.evaluate=function(a,b,e,f){return(new ec(a,e)).evaluate(b,f)" +
    "},b.createExpression=function(a,b){return new ec(a,b)},b.createNSR" +
    "esolver=function(a){return new fc(a)})}ba(\"wgxpath.install\",gc);va" +
    "r V={};V.C=function(){var a={R:\"http://www.w3.org/2000/svg\"};retur" +
    "n function(b){return a[b]||null}}();\nV.o=function(a,b,c){var d=x(a" +
    ");if(!d.documentElement)return null;gc(d?d.parentWindow||d.default" +
    "View:window);try{for(var e=d.createNSResolver?d.createNSResolver(d" +
    ".documentElement):V.C,f={},g=d.getElementsByTagName(\"*\"),k=0;k<g.l" +
    "ength;++k){var p=g[k],m=p.namespaceURI;if(m&&!f[m]){var h=p.lookup" +
    "Prefix(m);if(!h){var B=m.match(\".*/(\\\\w+)/?$\");B?h=B[1]:h=\"xhtml\"}" +
    "f[m]=h}}var N={},X;for(X in f)N[f[X]]=X;e=function(a){return N[a]|" +
    "|null};try{return d.evaluate(b,a,e,c,null)}catch(Lb){if(\"TypeError" +
    "\"===Lb.name)return e=\nd.createNSResolver?d.createNSResolver(d.docu" +
    "mentElement):V.C,d.evaluate(b,a,e,c,null);throw Lb;}}catch(vc){thr" +
    "ow new z(32,\"Unable to locate an element with the xpath expression" +
    " \"+b+\" because of the following error:\\n\"+vc);}};V.D=function(a,b)" +
    "{if(!a||1!=a.nodeType)throw new z(32,'The result of the xpath expr" +
    "ession \"'+b+'\" is: '+a+\". It should be an element.\");};\nV.s=functi" +
    "on(a,b){var c=function(){var c=V.o(b,a,9);return c?c.singleNodeVal" +
    "ue||null:b.selectSingleNode?(c=x(b),c.setProperty&&c.setProperty(\"" +
    "SelectionLanguage\",\"XPath\"),b.selectSingleNode(a)):null}();null===" +
    "c||V.D(c,a);return c};\nV.m=function(a,b){var c=function(){var c=V." +
    "o(b,a,7);if(c){for(var e=c.snapshotLength,f=[],g=0;g<e;++g)f.push(" +
    "c.snapshotItem(g));return f}return b.selectNodes?(c=x(b),c.setProp" +
    "erty&&c.setProperty(\"SelectionLanguage\",\"XPath\"),b.selectNodes(a))" +
    ":[]}();u(c,function(b){V.D(b,a)});return c};var hc={aliceblue:\"#f0" +
    "f8ff\",antiquewhite:\"#faebd7\",aqua:\"#00ffff\",aquamarine:\"#7fffd4\",a" +
    "zure:\"#f0ffff\",beige:\"#f5f5dc\",bisque:\"#ffe4c4\",black:\"#000000\",bl" +
    "anchedalmond:\"#ffebcd\",blue:\"#0000ff\",blueviolet:\"#8a2be2\",brown:\"" +
    "#a52a2a\",burlywood:\"#deb887\",cadetblue:\"#5f9ea0\",chartreuse:\"#7fff" +
    "00\",chocolate:\"#d2691e\",coral:\"#ff7f50\",cornflowerblue:\"#6495ed\",c" +
    "ornsilk:\"#fff8dc\",crimson:\"#dc143c\",cyan:\"#00ffff\",darkblue:\"#0000" +
    "8b\",darkcyan:\"#008b8b\",darkgoldenrod:\"#b8860b\",darkgray:\"#a9a9a9\"," +
    "darkgreen:\"#006400\",\ndarkgrey:\"#a9a9a9\",darkkhaki:\"#bdb76b\",darkma" +
    "genta:\"#8b008b\",darkolivegreen:\"#556b2f\",darkorange:\"#ff8c00\",dark" +
    "orchid:\"#9932cc\",darkred:\"#8b0000\",darksalmon:\"#e9967a\",darkseagre" +
    "en:\"#8fbc8f\",darkslateblue:\"#483d8b\",darkslategray:\"#2f4f4f\",darks" +
    "lategrey:\"#2f4f4f\",darkturquoise:\"#00ced1\",darkviolet:\"#9400d3\",de" +
    "eppink:\"#ff1493\",deepskyblue:\"#00bfff\",dimgray:\"#696969\",dimgrey:\"" +
    "#696969\",dodgerblue:\"#1e90ff\",firebrick:\"#b22222\",floralwhite:\"#ff" +
    "faf0\",forestgreen:\"#228b22\",fuchsia:\"#ff00ff\",gainsboro:\"#dcdcdc\"," +
    "\nghostwhite:\"#f8f8ff\",gold:\"#ffd700\",goldenrod:\"#daa520\",gray:\"#80" +
    "8080\",green:\"#008000\",greenyellow:\"#adff2f\",grey:\"#808080\",honeyde" +
    "w:\"#f0fff0\",hotpink:\"#ff69b4\",indianred:\"#cd5c5c\",indigo:\"#4b0082\"" +
    ",ivory:\"#fffff0\",khaki:\"#f0e68c\",lavender:\"#e6e6fa\",lavenderblush:" +
    "\"#fff0f5\",lawngreen:\"#7cfc00\",lemonchiffon:\"#fffacd\",lightblue:\"#a" +
    "dd8e6\",lightcoral:\"#f08080\",lightcyan:\"#e0ffff\",lightgoldenrodyell" +
    "ow:\"#fafad2\",lightgray:\"#d3d3d3\",lightgreen:\"#90ee90\",lightgrey:\"#" +
    "d3d3d3\",lightpink:\"#ffb6c1\",lightsalmon:\"#ffa07a\",\nlightseagreen:\"" +
    "#20b2aa\",lightskyblue:\"#87cefa\",lightslategray:\"#778899\",lightslat" +
    "egrey:\"#778899\",lightsteelblue:\"#b0c4de\",lightyellow:\"#ffffe0\",lim" +
    "e:\"#00ff00\",limegreen:\"#32cd32\",linen:\"#faf0e6\",magenta:\"#ff00ff\"," +
    "maroon:\"#800000\",mediumaquamarine:\"#66cdaa\",mediumblue:\"#0000cd\",m" +
    "ediumorchid:\"#ba55d3\",mediumpurple:\"#9370db\",mediumseagreen:\"#3cb3" +
    "71\",mediumslateblue:\"#7b68ee\",mediumspringgreen:\"#00fa9a\",mediumtu" +
    "rquoise:\"#48d1cc\",mediumvioletred:\"#c71585\",midnightblue:\"#191970\"" +
    ",mintcream:\"#f5fffa\",mistyrose:\"#ffe4e1\",\nmoccasin:\"#ffe4b5\",navaj" +
    "owhite:\"#ffdead\",navy:\"#000080\",oldlace:\"#fdf5e6\",olive:\"#808000\"," +
    "olivedrab:\"#6b8e23\",orange:\"#ffa500\",orangered:\"#ff4500\",orchid:\"#" +
    "da70d6\",palegoldenrod:\"#eee8aa\",palegreen:\"#98fb98\",paleturquoise:" +
    "\"#afeeee\",palevioletred:\"#db7093\",papayawhip:\"#ffefd5\",peachpuff:\"" +
    "#ffdab9\",peru:\"#cd853f\",pink:\"#ffc0cb\",plum:\"#dda0dd\",powderblue:\"" +
    "#b0e0e6\",purple:\"#800080\",red:\"#ff0000\",rosybrown:\"#bc8f8f\",royalb" +
    "lue:\"#4169e1\",saddlebrown:\"#8b4513\",salmon:\"#fa8072\",sandybrown:\"#" +
    "f4a460\",seagreen:\"#2e8b57\",\nseashell:\"#fff5ee\",sienna:\"#a0522d\",si" +
    "lver:\"#c0c0c0\",skyblue:\"#87ceeb\",slateblue:\"#6a5acd\",slategray:\"#7" +
    "08090\",slategrey:\"#708090\",snow:\"#fffafa\",springgreen:\"#00ff7f\",st" +
    "eelblue:\"#4682b4\",tan:\"#d2b48c\",teal:\"#008080\",thistle:\"#d8bfd8\",t" +
    "omato:\"#ff6347\",turquoise:\"#40e0d0\",violet:\"#ee82ee\",wheat:\"#f5deb" +
    "3\",white:\"#ffffff\",whitesmoke:\"#f5f5f5\",yellow:\"#ffff00\",yellowgre" +
    "en:\"#9acd32\"};var ic=\"backgroundColor borderTopColor borderRightCo" +
    "lor borderBottomColor borderLeftColor color outlineColor\".split(\" " +
    "\"),jc=/#([0-9a-fA-F])([0-9a-fA-F])([0-9a-fA-F])/,kc=/^#(?:[0-9a-f]" +
    "{3}){1,2}$/i,lc=/^(?:rgba)?\\((\\d{1,3}),\\s?(\\d{1,3}),\\s?(\\d{1,3}),\\" +
    "s?(0|1|0\\.\\d*)\\)$/i,mc=/^(?:rgb)?\\((0|[1-9]\\d{0,2}),\\s?(0|[1-9]\\d{" +
    "0,2}),\\s?(0|[1-9]\\d{0,2})\\)$/i;function W(a,b){return!!a&&1==a.nod" +
    "eType&&(!b||a.tagName.toUpperCase()==b)}var nc=/[;]+(?=(?:(?:[^\"]*" +
    "\"){2})*[^\"]*$)(?=(?:(?:[^']*'){2})*[^']*$)(?=(?:[^()]*\\([^()]*\\))*" +
    "[^()]*$)/;function oc(a){var b=[];u(a.split(nc),function(a){var d=" +
    "a.indexOf(\":\");0<d&&(a=[a.slice(0,d),a.slice(d+1)],2==a.length&&b." +
    "push(a[0].toLowerCase(),\":\",a[1],\";\"))});b=b.join(\"\");return b=\";\"" +
    "==b.charAt(b.length-1)?b:b+\";\"}\nfunction pc(a,b){b=b.toLowerCase()" +
    ";if(\"style\"==b)return oc(a.style.cssText);var c=a.getAttributeNode" +
    "(b);return c&&c.specified?c.value:null}function qc(a){for(a=a.pare" +
    "ntNode;a&&1!=a.nodeType&&9!=a.nodeType&&11!=a.nodeType;)a=a.parent" +
    "Node;return W(a)?a:null}\nfunction Y(a,b){var c=oa(b);if(\"float\"==c" +
    "||\"cssFloat\"==c||\"styleFloat\"==c)c=\"cssFloat\";var d;a:{d=c;var e=x" +
    "(a);if(e.defaultView&&e.defaultView.getComputedStyle&&(e=e.default" +
    "View.getComputedStyle(a,null))){d=e[d]||e.getPropertyValue(d)||\"\";" +
    "break a}d=\"\"}d=d||rc(a,c);if(null===d)d=null;else if(0<=sa(ic,c)){" +
    "b:{var f=d.match(lc);if(f){var c=Number(f[1]),e=Number(f[2]),g=Num" +
    "ber(f[3]),f=Number(f[4]);if(0<=c&&255>=c&&0<=e&&255>=e&&0<=g&&255>" +
    "=g&&0<=f&&1>=f){c=[c,e,g,f];break b}}c=null}if(!c)b:{if(g=d.match(" +
    "mc))if(c=\nNumber(g[1]),e=Number(g[2]),g=Number(g[3]),0<=c&&255>=c&" +
    "&0<=e&&255>=e&&0<=g&&255>=g){c=[c,e,g,1];break b}c=null}if(!c)b:{c" +
    "=d.toLowerCase();e=hc[c.toLowerCase()];if(!e&&(e=\"#\"==c.charAt(0)?" +
    "c:\"#\"+c,4==e.length&&(e=e.replace(jc,\"#$1$1$2$2$3$3\")),!kc.test(e)" +
    ")){c=null;break b}c=[parseInt(e.substr(1,2),16),parseInt(e.substr(" +
    "3,2),16),parseInt(e.substr(5,2),16),1]}d=c?\"rgba(\"+c.join(\", \")+\")" +
    "\":d}return d}\nfunction rc(a,b){var c=a.currentStyle||a.style,d=c[b" +
    "];!q(d)&&da(c.getPropertyValue)&&(d=c.getPropertyValue(b));return\"" +
    "inherit\"!=d?q(d)?d:null:(c=qc(a))?rc(c,b):null}\nfunction sc(a,b,c)" +
    "{function d(a){var b=tc(a);return 0<b.height&&0<b.width?!0:W(a,\"PA" +
    "TH\")&&(0<b.height||0<b.width)?(a=Y(a,\"stroke-width\"),!!a&&0<parseI" +
    "nt(a,10)):\"hidden\"!=Y(a,\"overflow\")&&va(a.childNodes,function(a){r" +
    "eturn 3==a.nodeType||W(a)&&d(a)})}function e(a){return\"hidden\"==uc" +
    "(a)&&wa(a.childNodes,function(a){return!W(a)||e(a)||!d(a)})}if(!W(" +
    "a))throw Error(\"Argument to isShown must be of type Element\");if(W" +
    "(a,\"BODY\"))return!0;if(W(a,\"OPTION\")||W(a,\"OPTGROUP\"))return a=La(" +
    "a,function(a){return W(a,\n\"SELECT\")}),!!a&&sc(a,!0,c);var f=wc(a);" +
    "if(f)return!!f.F&&0<f.rect.width&&0<f.rect.height&&sc(f.F,b,c);if(" +
    "W(a,\"INPUT\")&&\"hidden\"==a.type.toLowerCase()||W(a,\"NOSCRIPT\"))retu" +
    "rn!1;f=Y(a,\"visibility\");return\"collapse\"!=f&&\"hidden\"!=f&&c(a)&&(" +
    "b||0!=xc(a))&&d(a)?!e(a):!1}function yc(a){function b(a){if(\"none\"" +
    "==Y(a,\"display\"))return!1;a=qc(a);return!a||b(a)}return sc(a,!1,b)" +
    "}\nfunction uc(a){function b(a){function b(a){return a==g?!0:0==Y(a" +
    ",\"display\").lastIndexOf(\"inline\",0)||\"absolute\"==c&&\"static\"==Y(a," +
    "\"position\")?!1:!0}var c=Y(a,\"position\");if(\"fixed\"==c)return m=!0," +
    "a==g?null:g;for(a=qc(a);a&&!b(a);)a=qc(a);return a}function c(a){v" +
    "ar b=a;if(\"visible\"==p)if(a==g&&k)b=k;else if(a==k)return{x:\"visib" +
    "le\",y:\"visible\"};b={x:Y(b,\"overflow-x\"),y:Y(b,\"overflow-y\")};a==g&" +
    "&(b.x=\"visible\"==b.x?\"auto\":b.x,b.y=\"visible\"==b.y?\"auto\":b.y);ret" +
    "urn b}function d(a){if(a==g){var b=(new Fa(f)).a;\na=b.scrollingEle" +
    "ment?b.scrollingElement:b.body||b.documentElement;b=b.parentWindow" +
    "||b.defaultView;a=new v(b.pageXOffset||a.scrollLeft,b.pageYOffset|" +
    "|a.scrollTop)}else a=new v(a.scrollLeft,a.scrollTop);return a}var " +
    "e=zc(a),f=x(a),g=f.documentElement,k=f.body,p=Y(g,\"overflow\"),m;fo" +
    "r(a=b(a);a;a=b(a)){var h=c(a);if(\"visible\"!=h.x||\"visible\"!=h.y){v" +
    "ar B=tc(a);if(0==B.width||0==B.height)return\"hidden\";var N=e.right" +
    "<B.left,X=e.bottom<B.top;if(N&&\"hidden\"==h.x||X&&\"hidden\"==h.y)ret" +
    "urn\"hidden\";if(N&&\"visible\"!=\nh.x||X&&\"visible\"!=h.y){N=d(a);X=e.b" +
    "ottom<B.top-N.y;if(e.right<B.left-N.x&&\"visible\"!=h.x||X&&\"visible" +
    "\"!=h.x)return\"hidden\";e=uc(a);return\"hidden\"==e?\"hidden\":\"scroll\"}" +
    "N=e.left>=B.left+B.width;B=e.top>=B.top+B.height;if(N&&\"hidden\"==h" +
    ".x||B&&\"hidden\"==h.y)return\"hidden\";if(N&&\"visible\"!=h.x||B&&\"visi" +
    "ble\"!=h.y){if(m&&(h=d(a),e.left>=g.scrollWidth-h.x||e.right>=g.scr" +
    "ollHeight-h.y))return\"hidden\";e=uc(a);return\"hidden\"==e?\"hidden\":\"" +
    "scroll\"}}}return\"none\"}\nfunction tc(a){var b=wc(a);if(b)return b.r" +
    "ect;if(W(a,\"HTML\"))return a=x(a),a=((a?a.parentWindow||a.defaultVi" +
    "ew:window)||window).document,a=\"CSS1Compat\"==a.compatMode?a.docume" +
    "ntElement:a.body,a=new Ba(a.clientWidth,a.clientHeight),new A(0,0," +
    "a.width,a.height);var c;try{c=a.getBoundingClientRect()}catch(d){r" +
    "eturn new A(0,0,0,0)}return new A(c.left,c.top,c.right-c.left,c.bo" +
    "ttom-c.top)}\nfunction wc(a){var b=W(a,\"MAP\");if(!b&&!W(a,\"AREA\"))r" +
    "eturn null;var c=b?a:W(a.parentNode,\"MAP\")?a.parentNode:null,d=nul" +
    "l,e=null;if(c&&c.name&&(d=x(c),d=V.s('/descendant::*[@usemap = \"#'" +
    "+c.name+'\"]',d))&&(e=tc(d),!b&&\"default\"!=a.shape.toLowerCase())){" +
    "var f=Ac(a);a=Math.min(Math.max(f.left,0),e.width);b=Math.min(Math" +
    ".max(f.top,0),e.height);c=Math.min(f.width,e.width-a);f=Math.min(f" +
    ".height,e.height-b);e=new A(a+e.left,b+e.top,c,f)}return{F:d,rect:" +
    "e||new A(0,0,0,0)}}\nfunction Ac(a){var b=a.shape.toLowerCase();a=a" +
    ".coords.split(\",\");if(\"rect\"==b&&4==a.length){var b=a[0],c=a[1];re" +
    "turn new A(b,c,a[2]-b,a[3]-c)}if(\"circle\"==b&&3==a.length)return b" +
    "=a[2],new A(a[0]-b,a[1]-b,2*b,2*b);if(\"poly\"==b&&2<a.length){for(v" +
    "ar b=a[0],c=a[1],d=b,e=c,f=2;f+1<a.length;f+=2)b=Math.min(b,a[f])," +
    "d=Math.max(d,a[f]),c=Math.min(c,a[f+1]),e=Math.max(e,a[f+1]);retur" +
    "n new A(b,c,d-b,e-c)}return new A(0,0,0,0)}function zc(a){a=tc(a);" +
    "return new Ta(a.top,a.left+a.width,a.top+a.height,a.left)}\nfunctio" +
    "n Bc(a){return a.replace(/^[^\\S\\xa0]+|[^\\S\\xa0]+$/g,\"\")}function C" +
    "c(a){var b=[];Dc(a,b);var c=b;a=c.length;for(var b=Array(a),c=r(c)" +
    "?c.split(\"\"):c,d=0;d<a;d++)d in c&&(b[d]=Bc.call(void 0,c[d]));ret" +
    "urn Bc(b.join(\"\\n\")).replace(/\\xa0/g,\" \")}\nfunction Ec(a,b,c){if(W" +
    "(a,\"BR\"))b.push(\"\");else{var d=W(a,\"TD\"),e=Y(a,\"display\"),f=!d&&!(" +
    "0<=sa(Fc,e)),g=q(a.previousElementSibling)?a.previousElementSiblin" +
    "g:Ga(a.previousSibling),g=g?Y(g,\"display\"):\"\",k=Y(a,\"float\")||Y(a," +
    "\"cssFloat\")||Y(a,\"styleFloat\");!f||\"run-in\"==g&&\"none\"==k||/^[\\s\\x" +
    "a0]*$/.test(b[b.length-1]||\"\")||b.push(\"\");var p=yc(a),m=null,h=nu" +
    "ll;p&&(m=Y(a,\"white-space\"),h=Y(a,\"text-transform\"));u(a.childNode" +
    "s,function(a){c(a,b,p,m,h)});a=b[b.length-1]||\"\";!d&&\"table-cell\"!" +
    "=e||!a||ka(a)||(b[b.length-\n1]+=\" \");f&&\"run-in\"!=e&&!/^[\\s\\xa0]*$" +
    "/.test(a)&&b.push(\"\")}}function Dc(a,b){Ec(a,b,function(a,b,e,f,g)" +
    "{3==a.nodeType&&e?Gc(a,b,f,g):W(a)&&Dc(a,b)})}var Fc=\"inline inlin" +
    "e-block inline-table none table-cell table-column table-column-gro" +
    "up\".split(\" \");\nfunction Gc(a,b,c,d){a=a.nodeValue.replace(/[\\u200" +
    "b\\u200e\\u200f]/g,\"\");a=a.replace(/(\\r\\n|\\r|\\n)/g,\"\\n\");if(\"normal\"" +
    "==c||\"nowrap\"==c)a=a.replace(/\\n/g,\" \");a=\"pre\"==c||\"pre-wrap\"==c?" +
    "a.replace(/[ \\f\\t\\v\\u2028\\u2029]/g,\"\\u00a0\"):a.replace(/[\\ \\f\\t\\v\\" +
    "u2028\\u2029]+/g,\" \");\"capitalize\"==d?a=a.replace(/(^|\\s)(\\S)/g,fun" +
    "ction(a,b,c){return b+c.toUpperCase()}):\"uppercase\"==d?a=a.toUpper" +
    "Case():\"lowercase\"==d&&(a=a.toLowerCase());c=b.pop()||\"\";ka(c)&&0=" +
    "=a.lastIndexOf(\" \",0)&&(a=a.substr(1));b.push(c+a)}\nfunction xc(a)" +
    "{var b=1,c=Y(a,\"opacity\");c&&(b=Number(c));(a=qc(a))&&(b*=xc(a));r" +
    "eturn b};var Hc={w:function(a,b){return!(!a.querySelectorAll||!a.q" +
    "uerySelector)&&!/^\\d.*/.test(b)},s:function(a,b){var c=w(b),d=r(a)" +
    "?c.a.getElementById(a):a;if(!d)return null;if(pc(d,\"id\")==a&&Ha(b," +
    "d))return d;c=y(c,\"*\");return xa(c,function(c){return pc(c,\"id\")==" +
    "a&&Ha(b,c)})},m:function(a,b){if(!a)return[];if(Hc.w(b,a))try{retu" +
    "rn b.querySelectorAll(\"#\"+Hc.K(a))}catch(c){return[]}var d=y(w(b)," +
    "\"*\",null,b);return ta(d,function(b){return pc(b,\"id\")==a})},K:func" +
    "tion(a){return a.replace(/(['\"\\\\#.:;,!?+<>=~*^$|%&@`{}\\-\\/\\[\\]\\(\\)" +
    "])/g,\n\"\\\\$1\")}};var Z={},Ic={};Z.J=function(a,b,c){var d;try{d=Sa." +
    "m(\"a\",b)}catch(e){d=y(w(b),\"A\",null,b)}return xa(d,function(b){b=C" +
    "c(b);return c&&-1!=b.indexOf(a)||b==a})};Z.G=function(a,b,c){var d" +
    ";try{d=Sa.m(\"a\",b)}catch(e){d=y(w(b),\"A\",null,b)}return ta(d,funct" +
    "ion(b){b=Cc(b);return c&&-1!=b.indexOf(a)||b==a})};Z.s=function(a," +
    "b){return Z.J(a,b,!1)};Z.m=function(a,b){return Z.G(a,b,!1)};Ic.s=" +
    "function(a,b){return Z.J(a,b,!0)};Ic.m=function(a,b){return Z.G(a," +
    "b,!0)};var Jc={s:function(a,b){return b.getElementsByTagName(a)[0]" +
    "||null},m:function(a,b){return b.getElementsByTagName(a)}};var Kc=" +
    "{className:Na,\"class name\":Na,css:Sa,\"css selector\":Sa,id:Hc,linkT" +
    "ext:Z,\"link text\":Z,name:{s:function(a,b){var c=y(w(b),\"*\",null,b)" +
    ";return xa(c,function(b){return pc(b,\"name\")==a})},m:function(a,b)" +
    "{var c=y(w(b),\"*\",null,b);return ta(c,function(b){return pc(b,\"nam" +
    "e\")==a})}},partialLinkText:Ic,\"partial link text\":Ic,tagName:Jc,\"t" +
    "ag name\":Jc,xpath:V};ba(\"_\",function(a,b){var c;a:{for(c in a)if(a" +
    ".hasOwnProperty(c))break a;c=null}if(c){var d=Kc[c];if(d&&da(d.m))" +
    "return d.m(a[c],b||Aa.document)}throw Error(\"Unsupported locator s" +
    "trategy: \"+c);});;return this._.apply(null,arguments);}).apply({na" +
    "vigator:typeof window!=\"undefined\"?window.navigator:null},argument" +
    "s);}\n"
  )
  .toString();
  static final String FIND_ELEMENTS_ANDROID_license =
    "\n\n Copyright 2014 Software Freedom Conservancy\n\n Licensed under th" +
    "e Apache License, Version 2.0 (the \"License\");\n you may not use th" +
    "is file except in compliance with the License.\n You may obtain a c" +
    "opy of the License at\n\n      http://www.apache.org/licenses/LICENS" +
    "E-2.0\n\n Unless required by applicable law or agreed to in writing," +
    " software\n distributed under the License is distributed on an \"AS " +
    "IS\" BASIS,\n WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either e" +
    "xpress or implied.\n See the License for the specific language gove" +
    "rning permissions and\n limitations under the License.\n";
  private static final String FIND_ELEMENTS_ANDROID_original() {
    return FIND_ELEMENTS_ANDROID.replaceAll("xxx_rpl_lic", FIND_ELEMENTS_ANDROID_license);
  }

/* field: SEND_KEYS_ANDROID license: 

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
  static final String SEND_KEYS_ANDROID =
  new StringBuilder(
    "function(){return(function(){function aa(a){return function(){retu" +
    "rn this[a]}}function ba(a){return function(){return a}}var h,ca=th" +
    "is;function l(a){return void 0!==a}function da(a,b){var c=a.split(" +
    "\".\"),d=ca;c[0]in d||!d.execScript||d.execScript(\"var \"+c[0]);for(v" +
    "ar e;c.length&&(e=c.shift());)!c.length&&l(b)?d[e]=b:d[e]?d=d[e]:d" +
    "=d[e]={}}\nfunction ea(a){var b=typeof a;if(\"object\"==b)if(a){if(a " +
    "instanceof Array)return\"array\";if(a instanceof Object)return b;var" +
    " c=Object.prototype.toString.call(a);if(\"[object Window]\"==c)retur" +
    "n\"object\";if(\"[object Array]\"==c||\"number\"==typeof a.length&&\"unde" +
    "fined\"!=typeof a.splice&&\"undefined\"!=typeof a.propertyIsEnumerabl" +
    "e&&!a.propertyIsEnumerable(\"splice\"))return\"array\";if(\"[object Fun" +
    "ction]\"==c||\"undefined\"!=typeof a.call&&\"undefined\"!=typeof a.prop" +
    "ertyIsEnumerable&&!a.propertyIsEnumerable(\"call\"))return\"function\"" +
    "}else return\"null\";\nelse if(\"function\"==b&&\"undefined\"==typeof a.c" +
    "all)return\"object\";return b}function m(a){return\"string\"==typeof a" +
    "}function fa(a){return\"number\"==typeof a}function ga(a){return\"fun" +
    "ction\"==ea(a)}var ha=\"closure_uid_\"+(1E9*Math.random()>>>0),ia=0;f" +
    "unction ja(a,b,c){return a.call.apply(a.bind,arguments)}\nfunction " +
    "ka(a,b,c){if(!a)throw Error();if(2<arguments.length){var d=Array.p" +
    "rototype.slice.call(arguments,2);return function(){var c=Array.pro" +
    "totype.slice.call(arguments);Array.prototype.unshift.apply(c,d);re" +
    "turn a.apply(b,c)}}return function(){return a.apply(b,arguments)}}" +
    "function la(a,b,c){la=Function.prototype.bind&&-1!=Function.protot" +
    "ype.bind.toString().indexOf(\"native code\")?ja:ka;return la.apply(n" +
    "ull,arguments)}\nfunction ma(a,b){var c=Array.prototype.slice.call(" +
    "arguments,1);return function(){var b=c.slice();b.push.apply(b,argu" +
    "ments);return a.apply(this,b)}}function n(a,b){function c(){}c.pro" +
    "totype=b.prototype;a.R=b.prototype;a.prototype=new c;a.prototype.c" +
    "onstructor=a;a.O=function(a,c,f){for(var g=Array(arguments.length-" +
    "2),k=2;k<arguments.length;k++)g[k-2]=arguments[k];return b.prototy" +
    "pe[c].apply(a,g)}};function na(a){if(Error.captureStackTrace)Error" +
    ".captureStackTrace(this,na);else{var b=Error().stack;b&&(this.stac" +
    "k=b)}a&&(this.message=String(a))}n(na,Error);na.prototype.name=\"Cu" +
    "stomError\";function oa(a,b){for(var c=a.split(\"%s\"),d=\"\",e=Array.p" +
    "rototype.slice.call(arguments,1);e.length&&1<c.length;)d+=c.shift(" +
    ")+e.shift();return d+c.join(\"%s\")}var qa=String.prototype.trim?fun" +
    "ction(a){return a.trim()}:function(a){return a.replace(/^[\\s\\xa0]+" +
    "|[\\s\\xa0]+$/g,\"\")};\nfunction ra(a,b){for(var c=0,d=qa(String(a)).s" +
    "plit(\".\"),e=qa(String(b)).split(\".\"),f=Math.max(d.length,e.length)" +
    ",g=0;0==c&&g<f;g++){var k=d[g]||\"\",p=e[g]||\"\",r=RegExp(\"(\\\\d*)(\\\\D" +
    "*)\",\"g\"),G=RegExp(\"(\\\\d*)(\\\\D*)\",\"g\");do{var x=r.exec(k)||[\"\",\"\",\"" +
    "\"],t=G.exec(p)||[\"\",\"\",\"\"];if(0==x[0].length&&0==t[0].length)break" +
    ";c=sa(0==x[1].length?0:parseInt(x[1],10),0==t[1].length?0:parseInt" +
    "(t[1],10))||sa(0==x[2].length,0==t[2].length)||sa(x[2],t[2])}while" +
    "(0==c)}return c}function sa(a,b){return a<b?-1:a>b?1:0}\nfunction t" +
    "a(a){return String(a).replace(/\\-([a-z])/g,function(a,c){return c." +
    "toUpperCase()})};function ua(a,b){b.unshift(a);na.call(this,oa.app" +
    "ly(null,b));b.shift()}n(ua,na);ua.prototype.name=\"AssertionError\";" +
    "function va(a,b,c){if(!a){var d=\"Assertion failed\";if(b)var d=d+(\"" +
    ": \"+b),e=Array.prototype.slice.call(arguments,2);throw new ua(\"\"+d" +
    ",e||[]);}};var wa=Array.prototype;function xa(a,b){if(m(a))return " +
    "m(b)&&1==b.length?a.indexOf(b,0):-1;for(var c=0;c<a.length;c++)if(" +
    "c in a&&a[c]===b)return c;return-1}function q(a,b,c){for(var d=a.l" +
    "ength,e=m(a)?a.split(\"\"):a,f=0;f<d;f++)f in e&&b.call(c,e[f],f,a)}" +
    "function ya(a,b,c){var d=c;q(a,function(c,f){d=b.call(void 0,d,c,f" +
    ",a)});return d}function za(a,b){for(var c=a.length,d=m(a)?a.split(" +
    "\"\"):a,e=0;e<c;e++)if(e in d&&b.call(void 0,d[e],e,a))return!0;retu" +
    "rn!1}\nfunction Aa(a,b){for(var c=a.length,d=m(a)?a.split(\"\"):a,e=0" +
    ";e<c;e++)if(e in d&&!b.call(void 0,d[e],e,a))return!1;return!0}fun" +
    "ction Ba(a){return wa.concat.apply(wa,arguments)}function Ca(a,b,c" +
    "){va(null!=a.length);return 2>=arguments.length?wa.slice.call(a,b)" +
    ":wa.slice.call(a,b,c)};function Da(a){var b=[],c=0,d;for(d in a)b[" +
    "c++]=a[d];return b};function Ea(a,b,c){return Math.min(Math.max(a," +
    "b),c)};function Fa(a,b){this.x=l(a)?a:0;this.y=l(b)?b:0}h=Fa.proto" +
    "type;h.clone=function(){return new Fa(this.x,this.y)};h.toString=f" +
    "unction(){return\"(\"+this.x+\", \"+this.y+\")\"};h.ceil=function(){this" +
    ".x=Math.ceil(this.x);this.y=Math.ceil(this.y);return this};h.floor" +
    "=function(){this.x=Math.floor(this.x);this.y=Math.floor(this.y);re" +
    "turn this};h.round=function(){this.x=Math.round(this.x);this.y=Mat" +
    "h.round(this.y);return this};h.scale=function(a,b){var c=fa(b)?b:a" +
    ";this.x*=a;this.y*=c;return this};function Ga(a,b){this.width=a;th" +
    "is.height=b}h=Ga.prototype;h.clone=function(){return new Ga(this.w" +
    "idth,this.height)};h.toString=function(){return\"(\"+this.width+\" x " +
    "\"+this.height+\")\"};h.ceil=function(){this.width=Math.ceil(this.wid" +
    "th);this.height=Math.ceil(this.height);return this};h.floor=functi" +
    "on(){this.width=Math.floor(this.width);this.height=Math.floor(this" +
    ".height);return this};h.round=function(){this.width=Math.round(thi" +
    "s.width);this.height=Math.round(this.height);return this};\nh.scale" +
    "=function(a,b){var c=fa(b)?b:a;this.width*=a;this.height*=c;return" +
    " this};var Ha;a:{var Ia=ca.navigator;if(Ia){var Ja=Ia.userAgent;if" +
    "(Ja){Ha=Ja;break a}}Ha=\"\"};var Ka=-1!=Ha.indexOf(\"Macintosh\"),La=-" +
    "1!=Ha.indexOf(\"Windows\"),Ma=\"\",Na=/WebKit\\/(\\S+)/.exec(Ha);Na&&(Ma" +
    "=Na?Na[1]:\"\");var Oa=Ma,Pa={};function Qa(a){for(;a&&1!=a.nodeType" +
    ";)a=a.previousSibling;return a}function Ra(a,b){if(a.contains&&1==" +
    "b.nodeType)return a==b||a.contains(b);if(\"undefined\"!=typeof a.com" +
    "pareDocumentPosition)return a==b||Boolean(a.compareDocumentPositio" +
    "n(b)&16);for(;b&&a!=b;)b=b.parentNode;return b==a}\nfunction Sa(a,b" +
    "){if(a==b)return 0;if(a.compareDocumentPosition)return a.compareDo" +
    "cumentPosition(b)&2?1:-1;if(\"sourceIndex\"in a||a.parentNode&&\"sour" +
    "ceIndex\"in a.parentNode){var c=1==a.nodeType,d=1==b.nodeType;if(c&" +
    "&d)return a.sourceIndex-b.sourceIndex;var e=a.parentNode,f=b.paren" +
    "tNode;return e==f?Ta(a,b):!c&&Ra(e,b)?-1*Ua(a,b):!d&&Ra(f,a)?Ua(b," +
    "a):(c?a.sourceIndex:e.sourceIndex)-(d?b.sourceIndex:f.sourceIndex)" +
    "}d=u(a);c=d.createRange();c.selectNode(a);c.collapse(!0);d=d.creat" +
    "eRange();d.selectNode(b);\nd.collapse(!0);return c.compareBoundaryP" +
    "oints(ca.Range.START_TO_END,d)}function Ua(a,b){var c=a.parentNode" +
    ";if(c==b)return-1;for(var d=b;d.parentNode!=c;)d=d.parentNode;retu" +
    "rn Ta(d,a)}function Ta(a,b){for(var c=b;c=c.previousSibling;)if(c=" +
    "=a)return-1;return 1}function u(a){va(a,\"Node cannot be null or un" +
    "defined.\");return 9==a.nodeType?a:a.ownerDocument||a.document}func" +
    "tion Va(a,b,c){c||(a=a.parentNode);for(c=0;a;){va(\"parentNode\"!=a." +
    "name);if(b(a))return a;a=a.parentNode;c++}return null}\nfunction Wa" +
    "(a){try{return a&&a.activeElement}catch(b){}return null}function X" +
    "a(a){this.a=a||ca.document||document}Xa.prototype.contains=Ra;func" +
    "tion Ya(a,b,c,d){this.top=a;this.right=b;this.bottom=c;this.left=d" +
    "}h=Ya.prototype;h.clone=function(){return new Ya(this.top,this.rig" +
    "ht,this.bottom,this.left)};h.toString=function(){return\"(\"+this.to" +
    "p+\"t, \"+this.right+\"r, \"+this.bottom+\"b, \"+this.left+\"l)\"};h.conta" +
    "ins=function(a){return this&&a?a instanceof Ya?a.left>=this.left&&" +
    "a.right<=this.right&&a.top>=this.top&&a.bottom<=this.bottom:a.x>=t" +
    "his.left&&a.x<=this.right&&a.y>=this.top&&a.y<=this.bottom:!1};\nh." +
    "ceil=function(){this.top=Math.ceil(this.top);this.right=Math.ceil(" +
    "this.right);this.bottom=Math.ceil(this.bottom);this.left=Math.ceil" +
    "(this.left);return this};h.floor=function(){this.top=Math.floor(th" +
    "is.top);this.right=Math.floor(this.right);this.bottom=Math.floor(t" +
    "his.bottom);this.left=Math.floor(this.left);return this};h.round=f" +
    "unction(){this.top=Math.round(this.top);this.right=Math.round(this" +
    ".right);this.bottom=Math.round(this.bottom);this.left=Math.round(t" +
    "his.left);return this};\nh.scale=function(a,b){var c=fa(b)?b:a;this" +
    ".left*=a;this.right*=a;this.top*=c;this.bottom*=c;return this};fun" +
    "ction v(a,b,c,d){this.left=a;this.top=b;this.width=c;this.height=d" +
    "}h=v.prototype;h.clone=function(){return new v(this.left,this.top," +
    "this.width,this.height)};h.toString=function(){return\"(\"+this.left" +
    "+\", \"+this.top+\" - \"+this.width+\"w x \"+this.height+\"h)\"};h.contain" +
    "s=function(a){return a instanceof v?this.left<=a.left&&this.left+t" +
    "his.width>=a.left+a.width&&this.top<=a.top&&this.top+this.height>=" +
    "a.top+a.height:a.x>=this.left&&a.x<=this.left+this.width&&a.y>=thi" +
    "s.top&&a.y<=this.top+this.height};\nh.ceil=function(){this.left=Mat" +
    "h.ceil(this.left);this.top=Math.ceil(this.top);this.width=Math.cei" +
    "l(this.width);this.height=Math.ceil(this.height);return this};h.fl" +
    "oor=function(){this.left=Math.floor(this.left);this.top=Math.floor" +
    "(this.top);this.width=Math.floor(this.width);this.height=Math.floo" +
    "r(this.height);return this};h.round=function(){this.left=Math.roun" +
    "d(this.left);this.top=Math.round(this.top);this.width=Math.round(t" +
    "his.width);this.height=Math.round(this.height);return this};\nh.sca" +
    "le=function(a,b){var c=fa(b)?b:a;this.left*=a;this.width*=a;this.t" +
    "op*=c;this.height*=c;return this};function Za(a,b){var c=u(a);retu" +
    "rn c.defaultView&&c.defaultView.getComputedStyle&&(c=c.defaultView" +
    ".getComputedStyle(a,null))?c[b]||c.getPropertyValue(b)||\"\":\"\"};/*x" +
    "xx_rpl_lic*/\nvar $a=window;function w(a,b){this.code=a;this.a=ab[a" +
    "]||\"unknown error\";this.message=b||\"\";var c=this.a.replace(/((?:^|" +
    "\\s+)[a-z])/g,function(a){return a.toUpperCase().replace(/^[\\s\\xa0]" +
    "+/g,\"\")}),d=c.length-5;if(0>d||c.indexOf(\"Error\",d)!=d)c+=\"Error\";" +
    "this.name=c;c=Error(this.message);c.name=this.name;this.stack=c.st" +
    "ack||\"\"}n(w,Error);\nvar ab={15:\"element not selectable\",11:\"elemen" +
    "t not visible\",31:\"unknown error\",30:\"unknown error\",24:\"invalid c" +
    "ookie domain\",29:\"invalid element coordinates\",12:\"invalid element" +
    " state\",32:\"invalid selector\",51:\"invalid selector\",52:\"invalid se" +
    "lector\",17:\"javascript error\",405:\"unsupported operation\",34:\"move" +
    " target out of bounds\",27:\"no such alert\",7:\"no such element\",8:\"n" +
    "o such frame\",23:\"no such window\",28:\"script timeout\",33:\"session " +
    "not created\",10:\"stale element reference\",21:\"timeout\",25:\"unable " +
    "to set cookie\",\n26:\"unexpected alert open\",13:\"unknown error\",9:\"u" +
    "nknown command\"};w.prototype.toString=function(){return this.name+" +
    "\": \"+this.message};function bb(a){return(a=a.exec(Ha))?a[1]:\"\"}bb(" +
    "/Android\\s+([0-9.]+)/)||bb(/Version\\/([0-9.]+)/);var cb=/Android\\s" +
    "+([0-9\\.]+)/.exec(Ha),db=cb?cb[1]:\"0\";ra(db,2.3);ra(db,4);/*\n\n The" +
    " MIT License\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c)" +
    " 2012 Google Inc.\n\n Permission is hereby granted, free of charge, " +
    "to any person obtaining a copy\n of this software and associated do" +
    "cumentation files (the \"Software\"), to\n deal in the Software witho" +
    "ut restriction, including without limitation the\n rights to use, c" +
    "opy, modify, merge, publish, distribute, sublicense, and/or\n sell " +
    "copies of the Software, and to permit persons to whom the Software" +
    " is\n furnished to do so, subject to the following conditions:\n\n Th" +
    "e above copyright notice and this permission notice shall be inclu" +
    "ded in\n all copies or substantial portions of the Software.\n\n THE " +
    "SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRES" +
    "S OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERC" +
    "HANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT" +
    ". IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FO" +
    "R ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF " +
    "CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTIO" +
    "N WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE." +
    "\n*/\nfunction eb(a,b,c){this.a=a;this.b=b||1;this.f=c||1};function " +
    "fb(a){this.b=a;this.a=0}function gb(a){a=a.match(hb);for(var b=0;b" +
    "<a.length;b++)ib.test(a[b])&&a.splice(b,1);return new fb(a)}var hb" +
    "=RegExp(\"\\\\$?(?:(?![0-9-])[\\\\w-]+:)?(?![0-9-])[\\\\w-]+|\\\\/\\\\/|\\\\.\\\\" +
    ".|::|\\\\d+(?:\\\\.\\\\d*)?|\\\\.\\\\d+|\\\"[^\\\"]*\\\"|'[^']*'|[!<>]=|\\\\s+|.\",\"g" +
    "\"),ib=/^\\s/;function y(a,b){return a.b[a.a+(b||0)]}function z(a){r" +
    "eturn a.b[a.a++]}function jb(a){return a.b.length<=a.a};function A" +
    "(a){var b=null,c=a.nodeType;1==c&&(b=a.textContent,b=void 0==b||nu" +
    "ll==b?a.innerText:b,b=void 0==b||null==b?\"\":b);if(\"string\"!=typeof" +
    " b)if(9==c||1==c){a=9==c?a.documentElement:a.firstChild;for(var c=" +
    "0,d=[],b=\"\";a;){do 1!=a.nodeType&&(b+=a.nodeValue),d[c++]=a;while(" +
    "a=a.firstChild);for(;c&&!(a=d[--c].nextSibling););}}else b=a.nodeV" +
    "alue;return\"\"+b}\nfunction kb(a,b,c){if(null===b)return!0;try{if(!a" +
    ".getAttribute)return!1}catch(d){return!1}return null==c?!!a.getAtt" +
    "ribute(b):a.getAttribute(b,2)==c}function lb(a,b,c,d,e){return mb." +
    "call(null,a,b,m(c)?c:null,m(d)?d:null,e||new B)}\nfunction mb(a,b,c" +
    ",d,e){b.getElementsByName&&d&&\"name\"==c?(b=b.getElementsByName(d)," +
    "q(b,function(b){a.a(b)&&C(e,b)})):b.getElementsByClassName&&d&&\"cl" +
    "ass\"==c?(b=b.getElementsByClassName(d),q(b,function(b){b.className" +
    "==d&&a.a(b)&&C(e,b)})):a instanceof D?nb(a,b,c,d,e):b.getElementsB" +
    "yTagName&&(b=b.getElementsByTagName(a.f()),q(b,function(a){kb(a,c," +
    "d)&&C(e,a)}));return e}function ob(a,b,c,d,e){for(b=b.firstChild;b" +
    ";b=b.nextSibling)kb(b,c,d)&&a.a(b)&&C(e,b);return e}\nfunction nb(a" +
    ",b,c,d,e){for(b=b.firstChild;b;b=b.nextSibling)kb(b,c,d)&&a.a(b)&&" +
    "C(e,b),nb(a,b,c,d,e)};function B(){this.b=this.a=null;this.o=0}fun" +
    "ction pb(a){this.node=a;this.a=this.b=null}function qb(a,b){if(!a." +
    "a)return b;if(!b.a)return a;for(var c=a.a,d=b.a,e=null,f=null,g=0;" +
    "c&&d;)c.node==d.node?(f=c,c=c.a,d=d.a):0<Sa(c.node,d.node)?(f=d,d=" +
    "d.a):(f=c,c=c.a),(f.b=e)?e.a=f:a.a=f,e=f,g++;for(f=c||d;f;)f.b=e,e" +
    "=e.a=f,g++,f=f.a;a.b=e;a.o=g;return a}function rb(a,b){var c=new p" +
    "b(b);c.a=a.a;a.b?a.a.b=c:a.a=a.b=c;a.a=c;a.o++}function C(a,b){var" +
    " c=new pb(b);c.b=a.b;a.a?a.b.a=c:a.a=a.b=c;a.b=c;a.o++}\nfunction s" +
    "b(a){return(a=a.a)?a.node:null}function tb(a){return(a=sb(a))?A(a)" +
    ":\"\"}function ub(a,b){return new vb(a,!!b)}function vb(a,b){this.f=" +
    "a;this.b=(this.c=b)?a.b:a.a;this.a=null}function F(a){var b=a.b;if" +
    "(null==b)return null;var c=a.a=b;a.b=a.c?b.b:b.a;return c.node};fu" +
    "nction wb(a){switch(a.nodeType){case 1:return ma(xb,a);case 9:retu" +
    "rn wb(a.documentElement);case 11:case 10:case 6:case 12:return yb;" +
    "default:return a.parentNode?wb(a.parentNode):yb}}function yb(){ret" +
    "urn null}function xb(a,b){if(a.prefix==b)return a.namespaceURI||\"h" +
    "ttp://www.w3.org/1999/xhtml\";var c=a.getAttributeNode(\"xmlns:\"+b);" +
    "return c&&c.specified?c.value||null:a.parentNode&&9!=a.parentNode." +
    "nodeType?xb(a.parentNode,b):null};function H(a){this.l=a;this.b=th" +
    "is.j=!1;this.f=null}function I(a){return\"\\n  \"+a.toString().split(" +
    "\"\\n\").join(\"\\n  \")}function zb(a,b){a.j=b}function Ab(a,b){a.b=b}f" +
    "unction J(a,b){var c=a.a(b);return c instanceof B?+tb(c):+c}functi" +
    "on K(a,b){var c=a.a(b);return c instanceof B?tb(c):\"\"+c}function B" +
    "b(a,b){var c=a.a(b);return c instanceof B?!!c.o:!!c};function Cb(a" +
    ",b,c){H.call(this,a.l);this.c=a;this.i=b;this.u=c;this.j=b.j||c.j;" +
    "this.b=b.b||c.b;this.c==Db&&(c.b||c.j||4==c.l||0==c.l||!b.f?b.b||b" +
    ".j||4==b.l||0==b.l||!c.f||(this.f={name:c.f.name,w:b}):this.f={nam" +
    "e:b.f.name,w:c})}n(Cb,H);\nfunction Eb(a,b,c,d,e){b=b.a(d);c=c.a(d)" +
    ";var f;if(b instanceof B&&c instanceof B){e=ub(b);for(d=F(e);d;d=F" +
    "(e))for(b=ub(c),f=F(b);f;f=F(b))if(a(A(d),A(f)))return!0;return!1}" +
    "if(b instanceof B||c instanceof B){b instanceof B?e=b:(e=c,c=b);e=" +
    "ub(e);b=typeof c;for(d=F(e);d;d=F(e)){switch(b){case \"number\":d=+A" +
    "(d);break;case \"boolean\":d=!!A(d);break;case \"string\":d=A(d);break" +
    ";default:throw Error(\"Illegal primitive type for comparison.\");}if" +
    "(a(d,c))return!0}return!1}return e?\"boolean\"==typeof b||\"boolean\"=" +
    "=\ntypeof c?a(!!b,!!c):\"number\"==typeof b||\"number\"==typeof c?a(+b," +
    "+c):a(b,c):a(+b,+c)}Cb.prototype.a=function(a){return this.c.s(thi" +
    "s.i,this.u,a)};Cb.prototype.toString=function(){var a=\"Binary Expr" +
    "ession: \"+this.c,a=a+I(this.i);return a+=I(this.u)};function Fb(a," +
    "b,c,d){this.a=a;this.I=b;this.l=c;this.s=d}Fb.prototype.toString=a" +
    "a(\"a\");var Gb={};function L(a,b,c,d){if(Gb.hasOwnProperty(a))throw" +
    " Error(\"Binary operator already created: \"+a);a=new Fb(a,b,c,d);re" +
    "turn Gb[a.toString()]=a}\nL(\"div\",6,1,function(a,b,c){return J(a,c)" +
    "/J(b,c)});L(\"mod\",6,1,function(a,b,c){return J(a,c)%J(b,c)});L(\"*\"" +
    ",6,1,function(a,b,c){return J(a,c)*J(b,c)});L(\"+\",5,1,function(a,b" +
    ",c){return J(a,c)+J(b,c)});L(\"-\",5,1,function(a,b,c){return J(a,c)" +
    "-J(b,c)});L(\"<\",4,2,function(a,b,c){return Eb(function(a,b){return" +
    " a<b},a,b,c)});L(\">\",4,2,function(a,b,c){return Eb(function(a,b){r" +
    "eturn a>b},a,b,c)});L(\"<=\",4,2,function(a,b,c){return Eb(function(" +
    "a,b){return a<=b},a,b,c)});\nL(\">=\",4,2,function(a,b,c){return Eb(f" +
    "unction(a,b){return a>=b},a,b,c)});var Db=L(\"=\",3,2,function(a,b,c" +
    "){return Eb(function(a,b){return a==b},a,b,c,!0)});L(\"!=\",3,2,func" +
    "tion(a,b,c){return Eb(function(a,b){return a!=b},a,b,c,!0)});L(\"an" +
    "d\",2,2,function(a,b,c){return Bb(a,c)&&Bb(b,c)});L(\"or\",1,2,functi" +
    "on(a,b,c){return Bb(a,c)||Bb(b,c)});function Hb(a,b){if(b.a.length" +
    "&&4!=a.l)throw Error(\"Primary expression must evaluate to nodeset " +
    "if filter has predicate(s).\");H.call(this,a.l);this.c=a;this.i=b;t" +
    "his.j=a.j;this.b=a.b}n(Hb,H);Hb.prototype.a=function(a){a=this.c.a" +
    "(a);return Ib(this.i,a)};Hb.prototype.toString=function(){var a;a=" +
    "\"Filter:\"+I(this.c);return a+=I(this.i)};function Jb(a,b){if(b.len" +
    "gth<a.J)throw Error(\"Function \"+a.m+\" expects at least\"+a.J+\" argu" +
    "ments, \"+b.length+\" given\");if(null!==a.C&&b.length>a.C)throw Erro" +
    "r(\"Function \"+a.m+\" expects at most \"+a.C+\" arguments, \"+b.length+" +
    "\" given\");a.N&&q(b,function(b,d){if(4!=b.l)throw Error(\"Argument \"" +
    "+d+\" to function \"+a.m+\" is not of type Nodeset: \"+b);});H.call(th" +
    "is,a.l);this.i=a;this.c=b;zb(this,a.j||za(b,function(a){return a.j" +
    "}));Ab(this,a.M&&!b.length||a.L&&!!b.length||za(b,function(a){retu" +
    "rn a.b}))}\nn(Jb,H);Jb.prototype.a=function(a){return this.i.s.appl" +
    "y(null,Ba(a,this.c))};Jb.prototype.toString=function(){var a=\"Func" +
    "tion: \"+this.i;if(this.c.length)var b=ya(this.c,function(a,b){retu" +
    "rn a+I(b)},\"Arguments:\"),a=a+I(b);return a};function Kb(a,b,c,d,e," +
    "f,g,k,p){this.m=a;this.l=b;this.j=c;this.M=d;this.L=e;this.s=f;thi" +
    "s.J=g;this.C=l(k)?k:g;this.N=!!p}Kb.prototype.toString=aa(\"m\");var" +
    " Lb={};\nfunction M(a,b,c,d,e,f,g,k){if(Lb.hasOwnProperty(a))throw " +
    "Error(\"Function already created: \"+a+\".\");Lb[a]=new Kb(a,b,c,d,!1," +
    "e,f,g,k)}M(\"boolean\",2,!1,!1,function(a,b){return Bb(b,a)},1);M(\"c" +
    "eiling\",1,!1,!1,function(a,b){return Math.ceil(J(b,a))},1);M(\"conc" +
    "at\",3,!1,!1,function(a,b){var c=Ca(arguments,1);return ya(c,functi" +
    "on(b,c){return b+K(c,a)},\"\")},2,null);M(\"contains\",2,!1,!1,functio" +
    "n(a,b,c){b=K(b,a);a=K(c,a);return-1!=b.indexOf(a)},2);M(\"count\",1," +
    "!1,!1,function(a,b){return b.a(a).o},1,1,!0);\nM(\"false\",2,!1,!1,ba" +
    "(!1),0);M(\"floor\",1,!1,!1,function(a,b){return Math.floor(J(b,a))}" +
    ",1);M(\"id\",4,!1,!1,function(a,b){var c=a.a,d=9==c.nodeType?c:c.own" +
    "erDocument,c=K(b,a).split(/\\s+/),e=[];q(c,function(a){a=d.getEleme" +
    "ntById(a);!a||0<=xa(e,a)||e.push(a)});e.sort(Sa);var f=new B;q(e,f" +
    "unction(a){C(f,a)});return f},1);M(\"lang\",2,!1,!1,ba(!1),1);M(\"las" +
    "t\",1,!0,!1,function(a){if(1!=arguments.length)throw Error(\"Functio" +
    "n last expects ()\");return a.f},0);\nM(\"local-name\",3,!1,!0,functio" +
    "n(a,b){var c=b?sb(b.a(a)):a.a;return c?c.localName||c.nodeName.toL" +
    "owerCase():\"\"},0,1,!0);M(\"name\",3,!1,!0,function(a,b){var c=b?sb(b" +
    ".a(a)):a.a;return c?c.nodeName.toLowerCase():\"\"},0,1,!0);M(\"namesp" +
    "ace-uri\",3,!0,!1,ba(\"\"),0,1,!0);M(\"normalize-space\",3,!1,!0,functi" +
    "on(a,b){return(b?K(b,a):A(a.a)).replace(/[\\s\\xa0]+/g,\" \").replace(" +
    "/^\\s+|\\s+$/g,\"\")},0,1);M(\"not\",2,!1,!1,function(a,b){return!Bb(b,a" +
    ")},1);M(\"number\",1,!1,!0,function(a,b){return b?J(b,a):+A(a.a)},0," +
    "1);\nM(\"position\",1,!0,!1,function(a){return a.b},0);M(\"round\",1,!1" +
    ",!1,function(a,b){return Math.round(J(b,a))},1);M(\"starts-with\",2," +
    "!1,!1,function(a,b,c){b=K(b,a);a=K(c,a);return 0==b.lastIndexOf(a," +
    "0)},2);M(\"string\",3,!1,!0,function(a,b){return b?K(b,a):A(a.a)},0," +
    "1);M(\"string-length\",1,!1,!0,function(a,b){return(b?K(b,a):A(a.a))" +
    ".length},0,1);\nM(\"substring\",3,!1,!1,function(a,b,c,d){c=J(c,a);if" +
    "(isNaN(c)||Infinity==c||-Infinity==c)return\"\";d=d?J(d,a):Infinity;" +
    "if(isNaN(d)||-Infinity===d)return\"\";c=Math.round(c)-1;var e=Math.m" +
    "ax(c,0);a=K(b,a);if(Infinity==d)return a.substring(e);b=Math.round" +
    "(d);return a.substring(e,c+b)},2,3);M(\"substring-after\",3,!1,!1,fu" +
    "nction(a,b,c){b=K(b,a);a=K(c,a);c=b.indexOf(a);return-1==c?\"\":b.su" +
    "bstring(c+a.length)},2);\nM(\"substring-before\",3,!1,!1,function(a,b" +
    ",c){b=K(b,a);a=K(c,a);a=b.indexOf(a);return-1==a?\"\":b.substring(0," +
    "a)},2);M(\"sum\",1,!1,!1,function(a,b){for(var c=ub(b.a(a)),d=0,e=F(" +
    "c);e;e=F(c))d+=+A(e);return d},1,1,!0);M(\"translate\",3,!1,!1,funct" +
    "ion(a,b,c,d){b=K(b,a);c=K(c,a);var e=K(d,a);a=[];for(d=0;d<c.lengt" +
    "h;d++){var f=c.charAt(d);f in a||(a[f]=e.charAt(d))}c=\"\";for(d=0;d" +
    "<b.length;d++)f=b.charAt(d),c+=f in a?a[f]:f;return c},3);M(\"true\"" +
    ",2,!1,!1,ba(!0),0);function D(a,b){this.i=a;this.c=l(b)?b:null;thi" +
    "s.b=null;switch(a){case \"comment\":this.b=8;break;case \"text\":this." +
    "b=3;break;case \"processing-instruction\":this.b=7;break;case \"node\"" +
    ":break;default:throw Error(\"Unexpected argument\");}}function Mb(a)" +
    "{return\"comment\"==a||\"text\"==a||\"processing-instruction\"==a||\"node" +
    "\"==a}D.prototype.a=function(a){return null===this.b||this.b==a.nod" +
    "eType};D.prototype.f=aa(\"i\");D.prototype.toString=function(){var a" +
    "=\"Kind Test: \"+this.i;null===this.c||(a+=I(this.c));return a};func" +
    "tion Nb(a){H.call(this,3);this.c=a.substring(1,a.length-1)}n(Nb,H)" +
    ";Nb.prototype.a=aa(\"c\");Nb.prototype.toString=function(){return\"Li" +
    "teral: \"+this.c};function Ob(a,b){this.m=a.toLowerCase();this.b=b?" +
    "b.toLowerCase():\"http://www.w3.org/1999/xhtml\"}Ob.prototype.a=func" +
    "tion(a){var b=a.nodeType;return 1!=b&&2!=b?!1:\"*\"!=this.m&&this.m!" +
    "=a.nodeName.toLowerCase()?!1:this.b==(a.namespaceURI?a.namespaceUR" +
    "I.toLowerCase():\"http://www.w3.org/1999/xhtml\")};Ob.prototype.f=aa" +
    "(\"m\");Ob.prototype.toString=function(){return\"Name Test: \"+(\"http:" +
    "//www.w3.org/1999/xhtml\"==this.b?\"\":this.b+\":\")+this.m};function P" +
    "b(a){H.call(this,1);this.c=a}n(Pb,H);Pb.prototype.a=aa(\"c\");Pb.pro" +
    "totype.toString=function(){return\"Number: \"+this.c};function Qb(a," +
    "b){H.call(this,a.l);this.i=a;this.c=b;this.j=a.j;this.b=a.b;if(1==" +
    "this.c.length){var c=this.c[0];c.B||c.c!=Rb||(c=c.u,\"*\"!=c.f()&&(t" +
    "his.f={name:c.f(),w:null}))}}n(Qb,H);function Sb(){H.call(this,4)}" +
    "n(Sb,H);Sb.prototype.a=function(a){var b=new B;a=a.a;9==a.nodeType" +
    "?C(b,a):C(b,a.ownerDocument);return b};Sb.prototype.toString=ba(\"R" +
    "oot Helper Expression\");function Tb(){H.call(this,4)}n(Tb,H);Tb.pr" +
    "ototype.a=function(a){var b=new B;C(b,a.a);return b};Tb.prototype." +
    "toString=ba(\"Context Helper Expression\");\nfunction Ub(a){return\"/\"" +
    "==a||\"//\"==a}Qb.prototype.a=function(a){var b=this.i.a(a);if(!(b i" +
    "nstanceof B))throw Error(\"Filter expression must evaluate to nodes" +
    "et.\");a=this.c;for(var c=0,d=a.length;c<d&&b.o;c++){var e=a[c],f=u" +
    "b(b,e.c.a),g;if(e.j||e.c!=Vb)if(e.j||e.c!=Wb)for(g=F(f),b=e.a(new " +
    "eb(g));null!=(g=F(f));)g=e.a(new eb(g)),b=qb(b,g);else g=F(f),b=e." +
    "a(new eb(g));else{for(g=F(f);(b=F(f))&&(!g.contains||g.contains(b)" +
    ")&&b.compareDocumentPosition(g)&8;g=b);b=e.a(new eb(g))}}return b}" +
    ";\nQb.prototype.toString=function(){var a;a=\"Path Expression:\"+I(th" +
    "is.i);if(this.c.length){var b=ya(this.c,function(a,b){return a+I(b" +
    ")},\"Steps:\");a+=I(b)}return a};function Xb(a,b){this.a=a;this.b=!!" +
    "b}\nfunction Ib(a,b,c){for(c=c||0;c<a.a.length;c++)for(var d=a.a[c]" +
    ",e=ub(b),f=b.o,g,k=0;g=F(e);k++){var p=a.b?f-k:k+1;g=d.a(new eb(g," +
    "p,f));if(\"number\"==typeof g)p=p==g;else if(\"string\"==typeof g||\"bo" +
    "olean\"==typeof g)p=!!g;else if(g instanceof B)p=0<g.o;else throw E" +
    "rror(\"Predicate.evaluate returned an unexpected type.\");if(!p){p=e" +
    ";g=p.f;var r=p.a;if(!r)throw Error(\"Next must be called at least o" +
    "nce before remove.\");var G=r.b,r=r.a;G?G.a=r:g.a=r;r?r.b=G:g.b=G;g" +
    ".o--;p.a=null}}return b}\nXb.prototype.toString=function(){return y" +
    "a(this.a,function(a,b){return a+I(b)},\"Predicates:\")};function Yb(" +
    "a,b,c,d){H.call(this,4);this.c=a;this.u=b;this.i=c||new Xb([]);thi" +
    "s.B=!!d;b=this.i;b=0<b.a.length?b.a[0].f:null;a.b&&b&&(this.f={nam" +
    "e:b.name,w:b.w});a:{a=this.i;for(b=0;b<a.a.length;b++)if(c=a.a[b]," +
    "c.j||1==c.l||0==c.l){a=!0;break a}a=!1}this.j=a}n(Yb,H);\nYb.protot" +
    "ype.a=function(a){var b=a.a,c=null,c=this.f,d=null,e=null,f=0;c&&(" +
    "d=c.name,e=c.w?K(c.w,a):null,f=1);if(this.B)if(this.j||this.c!=Zb)" +
    "if(a=ub((new Yb($b,new D(\"node\"))).a(a)),b=F(a))for(c=this.s(b,d,e" +
    ",f);null!=(b=F(a));)c=qb(c,this.s(b,d,e,f));else c=new B;else c=lb" +
    "(this.u,b,d,e),c=Ib(this.i,c,f);else c=this.s(a.a,d,e,f);return c}" +
    ";Yb.prototype.s=function(a,b,c,d){a=this.c.f(this.u,a,b,c);return " +
    "a=Ib(this.i,a,d)};\nYb.prototype.toString=function(){var a;a=\"Step:" +
    "\"+I(\"Operator: \"+(this.B?\"//\":\"/\"));this.c.m&&(a+=I(\"Axis: \"+this." +
    "c));a+=I(this.u);if(this.i.a.length){var b=ya(this.i.a,function(a," +
    "b){return a+I(b)},\"Predicates:\");a+=I(b)}return a};function ac(a,b" +
    ",c,d){this.m=a;this.f=b;this.a=c;this.b=d}ac.prototype.toString=aa" +
    "(\"m\");var bc={};function N(a,b,c,d){if(bc.hasOwnProperty(a))throw " +
    "Error(\"Axis already created: \"+a);b=new ac(a,b,c,!!d);return bc[a]" +
    "=b}\nN(\"ancestor\",function(a,b){for(var c=new B,d=b;d=d.parentNode;" +
    ")a.a(d)&&rb(c,d);return c},!0);N(\"ancestor-or-self\",function(a,b){" +
    "var c=new B,d=b;do a.a(d)&&rb(c,d);while(d=d.parentNode);return c}" +
    ",!0);var Rb=N(\"attribute\",function(a,b){var c=new B,d=a.f(),e=b.at" +
    "tributes;if(e)if(a instanceof D&&null===a.b||\"*\"==d)for(var d=0,f;" +
    "f=e[d];d++)C(c,f);else(f=e.getNamedItem(d))&&C(c,f);return c},!1)," +
    "Zb=N(\"child\",function(a,b,c,d,e){return ob.call(null,a,b,m(c)?c:nu" +
    "ll,m(d)?d:null,e||new B)},!1,!0);\nN(\"descendant\",lb,!1,!0);var $b=" +
    "N(\"descendant-or-self\",function(a,b,c,d){var e=new B;kb(b,c,d)&&a." +
    "a(b)&&C(e,b);return lb(a,b,c,d,e)},!1,!0),Vb=N(\"following\",functio" +
    "n(a,b,c,d){var e=new B;do for(var f=b;f=f.nextSibling;)kb(f,c,d)&&" +
    "a.a(f)&&C(e,f),e=lb(a,f,c,d,e);while(b=b.parentNode);return e},!1," +
    "!0);N(\"following-sibling\",function(a,b){for(var c=new B,d=b;d=d.ne" +
    "xtSibling;)a.a(d)&&C(c,d);return c},!1);N(\"namespace\",function(){r" +
    "eturn new B},!1);\nvar cc=N(\"parent\",function(a,b){var c=new B;if(9" +
    "==b.nodeType)return c;if(2==b.nodeType)return C(c,b.ownerElement)," +
    "c;var d=b.parentNode;a.a(d)&&C(c,d);return c},!1),Wb=N(\"preceding\"" +
    ",function(a,b,c,d){var e=new B,f=[];do f.unshift(b);while(b=b.pare" +
    "ntNode);for(var g=1,k=f.length;g<k;g++){var p=[];for(b=f[g];b=b.pr" +
    "eviousSibling;)p.unshift(b);for(var r=0,G=p.length;r<G;r++)b=p[r]," +
    "kb(b,c,d)&&a.a(b)&&C(e,b),e=lb(a,b,c,d,e)}return e},!0,!0);\nN(\"pre" +
    "ceding-sibling\",function(a,b){for(var c=new B,d=b;d=d.previousSibl" +
    "ing;)a.a(d)&&rb(c,d);return c},!0);var dc=N(\"self\",function(a,b){v" +
    "ar c=new B;a.a(b)&&C(c,b);return c},!1);function ec(a){H.call(this" +
    ",1);this.c=a;this.j=a.j;this.b=a.b}n(ec,H);ec.prototype.a=function" +
    "(a){return-J(this.c,a)};ec.prototype.toString=function(){return\"Un"
  )
      .append(
    "ary Expression: -\"+I(this.c)};function fc(a){H.call(this,4);this.c" +
    "=a;zb(this,za(this.c,function(a){return a.j}));Ab(this,za(this.c,f" +
    "unction(a){return a.b}))}n(fc,H);fc.prototype.a=function(a){var b=" +
    "new B;q(this.c,function(c){c=c.a(a);if(!(c instanceof B))throw Err" +
    "or(\"Path expression must evaluate to NodeSet.\");b=qb(b,c)});return" +
    " b};fc.prototype.toString=function(){return ya(this.c,function(a,b" +
    "){return a+I(b)},\"Union Expression:\")};function gc(a,b){this.a=a;t" +
    "his.b=b}function hc(a){for(var b,c=[];;){O(a,\"Missing right hand s" +
    "ide of binary expression.\");b=ic(a);var d=z(a.a);if(!d)break;var e" +
    "=(d=Gb[d]||null)&&d.I;if(!e){a.a.a--;break}for(;c.length&&e<=c[c.l" +
    "ength-1].I;)b=new Cb(c.pop(),c.pop(),b);c.push(b,d)}for(;c.length;" +
    ")b=new Cb(c.pop(),c.pop(),b);return b}function O(a,b){if(jb(a.a))t" +
    "hrow Error(b);}function jc(a,b){var c=z(a.a);if(c!=b)throw Error(\"" +
    "Bad token, expected: \"+b+\" got: \"+c);}\nfunction kc(a){a=z(a.a);if(" +
    "\")\"!=a)throw Error(\"Bad token: \"+a);}function lc(a){a=z(a.a);if(2>" +
    "a.length)throw Error(\"Unclosed literal string\");return new Nb(a)}f" +
    "unction mc(a){var b=z(a.a),c=b.indexOf(\":\");if(-1==c)return new Ob" +
    "(b);var d=b.substring(0,c);a=a.b(d);if(!a)throw Error(\"Namespace p" +
    "refix not declared: \"+d);b=b.substr(c+1);return new Ob(b,a)}\nfunct" +
    "ion nc(a){var b,c=[],d;if(Ub(y(a.a))){b=z(a.a);d=y(a.a);if(\"/\"==b&" +
    "&(jb(a.a)||\".\"!=d&&\"..\"!=d&&\"@\"!=d&&\"*\"!=d&&!/(?![0-9])[\\w]/.test(" +
    "d)))return new Sb;d=new Sb;O(a,\"Missing next location step.\");b=oc" +
    "(a,b);c.push(b)}else{a:{b=y(a.a);d=b.charAt(0);switch(d){case \"$\":" +
    "throw Error(\"Variable reference not allowed in HTML XPath\");case \"" +
    "(\":z(a.a);b=hc(a);O(a,'unclosed \"(\"');jc(a,\")\");break;case '\"':cas" +
    "e \"'\":b=lc(a);break;default:if(isNaN(+b))if(!Mb(b)&&/(?![0-9])[\\w]" +
    "/.test(d)&&\"(\"==y(a.a,1)){b=z(a.a);\nb=Lb[b]||null;z(a.a);for(d=[];" +
    "\")\"!=y(a.a);){O(a,\"Missing function argument list.\");d.push(hc(a))" +
    ";if(\",\"!=y(a.a))break;z(a.a)}O(a,\"Unclosed function argument list." +
    "\");kc(a);b=new Jb(b,d)}else{b=null;break a}else b=new Pb(+z(a.a))}" +
    "\"[\"==y(a.a)&&(d=new Xb(pc(a)),b=new Hb(b,d))}if(b)if(Ub(y(a.a)))d=" +
    "b;else return b;else b=oc(a,\"/\"),d=new Tb,c.push(b)}for(;Ub(y(a.a)" +
    ");)b=z(a.a),O(a,\"Missing next location step.\"),b=oc(a,b),c.push(b)" +
    ";return new Qb(d,c)}\nfunction oc(a,b){var c,d,e;if(\"/\"!=b&&\"//\"!=b" +
    ")throw Error('Step op should be \"/\" or \"//\"');if(\".\"==y(a.a))retur" +
    "n d=new Yb(dc,new D(\"node\")),z(a.a),d;if(\"..\"==y(a.a))return d=new" +
    " Yb(cc,new D(\"node\")),z(a.a),d;var f;if(\"@\"==y(a.a))f=Rb,z(a.a),O(" +
    "a,\"Missing attribute name\");else if(\"::\"==y(a.a,1)){if(!/(?![0-9])" +
    "[\\w]/.test(y(a.a).charAt(0)))throw Error(\"Bad token: \"+z(a.a));c=z" +
    "(a.a);f=bc[c]||null;if(!f)throw Error(\"No axis with name: \"+c);z(a" +
    ".a);O(a,\"Missing node name\")}else f=Zb;c=y(a.a);if(/(?![0-9])[\\w]/" +
    ".test(c.charAt(0)))if(\"(\"==\ny(a.a,1)){if(!Mb(c))throw Error(\"Inval" +
    "id node type: \"+c);c=z(a.a);if(!Mb(c))throw Error(\"Invalid type na" +
    "me: \"+c);jc(a,\"(\");O(a,\"Bad nodetype\");e=y(a.a).charAt(0);var g=nu" +
    "ll;if('\"'==e||\"'\"==e)g=lc(a);O(a,\"Bad nodetype\");kc(a);c=new D(c,g" +
    ")}else c=mc(a);else if(\"*\"==c)c=mc(a);else throw Error(\"Bad token:" +
    " \"+z(a.a));e=new Xb(pc(a),f.a);return d||new Yb(f,c,e,\"//\"==b)}\nfu" +
    "nction pc(a){for(var b=[];\"[\"==y(a.a);){z(a.a);O(a,\"Missing predic" +
    "ate expression.\");var c=hc(a);b.push(c);O(a,\"Unclosed predicate ex" +
    "pression.\");jc(a,\"]\")}return b}function ic(a){if(\"-\"==y(a.a))retur" +
    "n z(a.a),new ec(ic(a));var b=nc(a);if(\"|\"!=y(a.a))a=b;else{for(b=[" +
    "b];\"|\"==z(a.a);)O(a,\"Missing next union location path.\"),b.push(nc" +
    "(a));a.a.a--;a=new fc(b)}return a};function qc(a,b){if(!a.length)t" +
    "hrow Error(\"Empty XPath expression.\");var c=gb(a);if(jb(c))throw E" +
    "rror(\"Invalid XPath expression.\");b?ga(b)||(b=la(b.lookupNamespace" +
    "URI,b)):b=ba(null);var d=hc(new gc(c,b));if(!jb(c))throw Error(\"Ba" +
    "d token: \"+z(c));this.evaluate=function(a,b){var c=d.a(new eb(a));" +
    "return new P(c,b)}}\nfunction P(a,b){if(0==b)if(a instanceof B)b=4;" +
    "else if(\"string\"==typeof a)b=2;else if(\"number\"==typeof a)b=1;else" +
    " if(\"boolean\"==typeof a)b=3;else throw Error(\"Unexpected evaluatio" +
    "n result.\");if(2!=b&&1!=b&&3!=b&&!(a instanceof B))throw Error(\"va" +
    "lue could not be converted to the specified type\");this.resultType" +
    "=b;var c;switch(b){case 2:this.stringValue=a instanceof B?tb(a):\"\"" +
    "+a;break;case 1:this.numberValue=a instanceof B?+tb(a):+a;break;ca" +
    "se 3:this.booleanValue=a instanceof B?0<a.o:!!a;break;case 4:case " +
    "5:case 6:case 7:var d=\nub(a);c=[];for(var e=F(d);e;e=F(d))c.push(e" +
    ");this.snapshotLength=a.o;this.invalidIteratorState=!1;break;case " +
    "8:case 9:this.singleNodeValue=sb(a);break;default:throw Error(\"Unk" +
    "nown XPathResult type.\");}var f=0;this.iterateNext=function(){if(4" +
    "!=b&&5!=b)throw Error(\"iterateNext called with wrong result type\")" +
    ";return f>=c.length?null:c[f++]};this.snapshotItem=function(a){if(" +
    "6!=b&&7!=b)throw Error(\"snapshotItem called with wrong result type" +
    "\");return a>=c.length||0>a?null:c[a]}}P.ANY_TYPE=0;\nP.NUMBER_TYPE=" +
    "1;P.STRING_TYPE=2;P.BOOLEAN_TYPE=3;P.UNORDERED_NODE_ITERATOR_TYPE=" +
    "4;P.ORDERED_NODE_ITERATOR_TYPE=5;P.UNORDERED_NODE_SNAPSHOT_TYPE=6;" +
    "P.ORDERED_NODE_SNAPSHOT_TYPE=7;P.ANY_UNORDERED_NODE_TYPE=8;P.FIRST" +
    "_ORDERED_NODE_TYPE=9;function rc(a){this.lookupNamespaceURI=wb(a)}" +
    "\nfunction sc(a){a=a||ca;var b=a.document;b.evaluate||(a.XPathResul" +
    "t=P,b.evaluate=function(a,b,e,f){return(new qc(a,e)).evaluate(b,f)" +
    "},b.createExpression=function(a,b){return new qc(a,b)},b.createNSR" +
    "esolver=function(a){return new rc(a)})}da(\"wgxpath.install\",sc);va" +
    "r Q={};Q.D=function(){var a={S:\"http://www.w3.org/2000/svg\"};retur" +
    "n function(b){return a[b]||null}}();\nQ.s=function(a,b,c){var d=u(a" +
    ");if(!d.documentElement)return null;sc(d?d.parentWindow||d.default" +
    "View:window);try{for(var e=d.createNSResolver?d.createNSResolver(d" +
    ".documentElement):Q.D,f={},g=d.getElementsByTagName(\"*\"),k=0;k<g.l" +
    "ength;++k){var p=g[k],r=p.namespaceURI;if(r&&!f[r]){var G=p.lookup" +
    "Prefix(r);if(!G){var x=r.match(\".*/(\\\\w+)/?$\");x?G=x[1]:G=\"xhtml\"}" +
    "f[r]=G}}var t={},E;for(E in f)t[f[E]]=E;e=function(a){return t[a]|" +
    "|null};try{return d.evaluate(b,a,e,c,null)}catch(V){if(\"TypeError\"" +
    "===V.name)return e=\nd.createNSResolver?d.createNSResolver(d.docume" +
    "ntElement):Q.D,d.evaluate(b,a,e,c,null);throw V;}}catch(pa){throw " +
    "new w(32,\"Unable to locate an element with the xpath expression \"+" +
    "b+\" because of the following error:\\n\"+pa);}};Q.F=function(a,b){if" +
    "(!a||1!=a.nodeType)throw new w(32,'The result of the xpath express" +
    "ion \"'+b+'\" is: '+a+\". It should be an element.\");};\nQ.K=function(" +
    "a,b){var c=function(){var c=Q.s(b,a,9);return c?c.singleNodeValue|" +
    "|null:b.selectSingleNode?(c=u(b),c.setProperty&&c.setProperty(\"Sel" +
    "ectionLanguage\",\"XPath\"),b.selectSingleNode(a)):null}();null===c||" +
    "Q.F(c,a);return c};\nQ.P=function(a,b){var c=function(){var c=Q.s(b" +
    ",a,7);if(c){for(var e=c.snapshotLength,f=[],g=0;g<e;++g)f.push(c.s" +
    "napshotItem(g));return f}return b.selectNodes?(c=u(b),c.setPropert" +
    "y&&c.setProperty(\"SelectionLanguage\",\"XPath\"),b.selectNodes(a)):[]" +
    "}();q(c,function(b){Q.F(b,a)});return c};var tc={aliceblue:\"#f0f8f" +
    "f\",antiquewhite:\"#faebd7\",aqua:\"#00ffff\",aquamarine:\"#7fffd4\",azur" +
    "e:\"#f0ffff\",beige:\"#f5f5dc\",bisque:\"#ffe4c4\",black:\"#000000\",blanc" +
    "hedalmond:\"#ffebcd\",blue:\"#0000ff\",blueviolet:\"#8a2be2\",brown:\"#a5" +
    "2a2a\",burlywood:\"#deb887\",cadetblue:\"#5f9ea0\",chartreuse:\"#7fff00\"" +
    ",chocolate:\"#d2691e\",coral:\"#ff7f50\",cornflowerblue:\"#6495ed\",corn" +
    "silk:\"#fff8dc\",crimson:\"#dc143c\",cyan:\"#00ffff\",darkblue:\"#00008b\"" +
    ",darkcyan:\"#008b8b\",darkgoldenrod:\"#b8860b\",darkgray:\"#a9a9a9\",dar" +
    "kgreen:\"#006400\",\ndarkgrey:\"#a9a9a9\",darkkhaki:\"#bdb76b\",darkmagen" +
    "ta:\"#8b008b\",darkolivegreen:\"#556b2f\",darkorange:\"#ff8c00\",darkorc" +
    "hid:\"#9932cc\",darkred:\"#8b0000\",darksalmon:\"#e9967a\",darkseagreen:" +
    "\"#8fbc8f\",darkslateblue:\"#483d8b\",darkslategray:\"#2f4f4f\",darkslat" +
    "egrey:\"#2f4f4f\",darkturquoise:\"#00ced1\",darkviolet:\"#9400d3\",deepp" +
    "ink:\"#ff1493\",deepskyblue:\"#00bfff\",dimgray:\"#696969\",dimgrey:\"#69" +
    "6969\",dodgerblue:\"#1e90ff\",firebrick:\"#b22222\",floralwhite:\"#fffaf" +
    "0\",forestgreen:\"#228b22\",fuchsia:\"#ff00ff\",gainsboro:\"#dcdcdc\",\ngh" +
    "ostwhite:\"#f8f8ff\",gold:\"#ffd700\",goldenrod:\"#daa520\",gray:\"#80808" +
    "0\",green:\"#008000\",greenyellow:\"#adff2f\",grey:\"#808080\",honeydew:\"" +
    "#f0fff0\",hotpink:\"#ff69b4\",indianred:\"#cd5c5c\",indigo:\"#4b0082\",iv" +
    "ory:\"#fffff0\",khaki:\"#f0e68c\",lavender:\"#e6e6fa\",lavenderblush:\"#f" +
    "ff0f5\",lawngreen:\"#7cfc00\",lemonchiffon:\"#fffacd\",lightblue:\"#add8" +
    "e6\",lightcoral:\"#f08080\",lightcyan:\"#e0ffff\",lightgoldenrodyellow:" +
    "\"#fafad2\",lightgray:\"#d3d3d3\",lightgreen:\"#90ee90\",lightgrey:\"#d3d" +
    "3d3\",lightpink:\"#ffb6c1\",lightsalmon:\"#ffa07a\",\nlightseagreen:\"#20" +
    "b2aa\",lightskyblue:\"#87cefa\",lightslategray:\"#778899\",lightslategr" +
    "ey:\"#778899\",lightsteelblue:\"#b0c4de\",lightyellow:\"#ffffe0\",lime:\"" +
    "#00ff00\",limegreen:\"#32cd32\",linen:\"#faf0e6\",magenta:\"#ff00ff\",mar" +
    "oon:\"#800000\",mediumaquamarine:\"#66cdaa\",mediumblue:\"#0000cd\",medi" +
    "umorchid:\"#ba55d3\",mediumpurple:\"#9370db\",mediumseagreen:\"#3cb371\"" +
    ",mediumslateblue:\"#7b68ee\",mediumspringgreen:\"#00fa9a\",mediumturqu" +
    "oise:\"#48d1cc\",mediumvioletred:\"#c71585\",midnightblue:\"#191970\",mi" +
    "ntcream:\"#f5fffa\",mistyrose:\"#ffe4e1\",\nmoccasin:\"#ffe4b5\",navajowh" +
    "ite:\"#ffdead\",navy:\"#000080\",oldlace:\"#fdf5e6\",olive:\"#808000\",oli" +
    "vedrab:\"#6b8e23\",orange:\"#ffa500\",orangered:\"#ff4500\",orchid:\"#da7" +
    "0d6\",palegoldenrod:\"#eee8aa\",palegreen:\"#98fb98\",paleturquoise:\"#a" +
    "feeee\",palevioletred:\"#db7093\",papayawhip:\"#ffefd5\",peachpuff:\"#ff" +
    "dab9\",peru:\"#cd853f\",pink:\"#ffc0cb\",plum:\"#dda0dd\",powderblue:\"#b0" +
    "e0e6\",purple:\"#800080\",red:\"#ff0000\",rosybrown:\"#bc8f8f\",royalblue" +
    ":\"#4169e1\",saddlebrown:\"#8b4513\",salmon:\"#fa8072\",sandybrown:\"#f4a" +
    "460\",seagreen:\"#2e8b57\",\nseashell:\"#fff5ee\",sienna:\"#a0522d\",silve" +
    "r:\"#c0c0c0\",skyblue:\"#87ceeb\",slateblue:\"#6a5acd\",slategray:\"#7080" +
    "90\",slategrey:\"#708090\",snow:\"#fffafa\",springgreen:\"#00ff7f\",steel" +
    "blue:\"#4682b4\",tan:\"#d2b48c\",teal:\"#008080\",thistle:\"#d8bfd8\",toma" +
    "to:\"#ff6347\",turquoise:\"#40e0d0\",violet:\"#ee82ee\",wheat:\"#f5deb3\"," +
    "white:\"#ffffff\",whitesmoke:\"#f5f5f5\",yellow:\"#ffff00\",yellowgreen:" +
    "\"#9acd32\"};var uc=\"backgroundColor borderTopColor borderRightColor" +
    " borderBottomColor borderLeftColor color outlineColor\".split(\" \")," +
    "vc=/#([0-9a-fA-F])([0-9a-fA-F])([0-9a-fA-F])/,wc=/^#(?:[0-9a-f]{3}" +
    "){1,2}$/i,xc=/^(?:rgba)?\\((\\d{1,3}),\\s?(\\d{1,3}),\\s?(\\d{1,3}),\\s?(" +
    "0|1|0\\.\\d*)\\)$/i,yc=/^(?:rgb)?\\((0|[1-9]\\d{0,2}),\\s?(0|[1-9]\\d{0,2" +
    "}),\\s?(0|[1-9]\\d{0,2})\\)$/i;function R(a,b){return!!a&&1==a.nodeTy" +
    "pe&&(!b||a.tagName.toUpperCase()==b)}function zc(a){return Ac(a)&&" +
    "Bc(a)&&\"none\"!=S(a,\"pointer-events\")}var Cc=\"BUTTON INPUT OPTGROUP" +
    " OPTION SELECT TEXTAREA\".split(\" \");\nfunction Bc(a){var b=a.tagNam" +
    "e.toUpperCase();return 0<=xa(Cc,b)?a.disabled?!1:a.parentNode&&1==" +
    "a.parentNode.nodeType&&\"OPTGROUP\"==b||\"OPTION\"==b?Bc(a.parentNode)" +
    ":!Va(a,function(a){var b=a.parentNode;if(b&&R(b,\"FIELDSET\")&&b.dis" +
    "abled){if(!R(a,\"LEGEND\"))return!0;for(;a=l(a.previousElementSiblin" +
    "g)?a.previousElementSibling:Qa(a.previousSibling);)if(R(a,\"LEGEND\"" +
    "))return!0}return!1},!0):!0}var Dc=\"text search tel url email pass" +
    "word number\".split(\" \");\nfunction Ec(a){function b(a){return\"inher" +
    "it\"==a.contentEditable?(a=Fc(a))?b(a):!1:\"true\"==a.contentEditable" +
    "}return l(a.contentEditable)?l(a.isContentEditable)?a.isContentEdi" +
    "table:b(a):!1}function Gc(a){return((R(a,\"TEXTAREA\")?!0:R(a,\"INPUT" +
    "\")?0<=xa(Dc,a.type.toLowerCase()):Ec(a)?!0:!1)||(R(a,\"INPUT\")?\"fil" +
    "e\"==a.type.toLowerCase():!1))&&!a.readOnly}function Fc(a){for(a=a." +
    "parentNode;a&&1!=a.nodeType&&9!=a.nodeType&&11!=a.nodeType;)a=a.pa" +
    "rentNode;return R(a)?a:null}\nfunction S(a,b){var c=ta(b);if(\"float" +
    "\"==c||\"cssFloat\"==c||\"styleFloat\"==c)c=\"cssFloat\";var d=Za(a,c)||H" +
    "c(a,c);if(null===d)d=null;else if(0<=xa(uc,c)){b:{var e=d.match(xc" +
    ");if(e){var c=Number(e[1]),f=Number(e[2]),g=Number(e[3]),e=Number(" +
    "e[4]);if(0<=c&&255>=c&&0<=f&&255>=f&&0<=g&&255>=g&&0<=e&&1>=e){c=[" +
    "c,f,g,e];break b}}c=null}if(!c)b:{if(g=d.match(yc))if(c=Number(g[1" +
    "]),f=Number(g[2]),g=Number(g[3]),0<=c&&255>=c&&0<=f&&255>=f&&0<=g&" +
    "&255>=g){c=[c,f,g,1];break b}c=null}if(!c)b:{c=d.toLowerCase();f=t" +
    "c[c.toLowerCase()];\nif(!f&&(f=\"#\"==c.charAt(0)?c:\"#\"+c,4==f.length" +
    "&&(f=f.replace(vc,\"#$1$1$2$2$3$3\")),!wc.test(f))){c=null;break b}c" +
    "=[parseInt(f.substr(1,2),16),parseInt(f.substr(3,2),16),parseInt(f" +
    ".substr(5,2),16),1]}d=c?\"rgba(\"+c.join(\", \")+\")\":d}return d}functi" +
    "on Hc(a,b){var c=a.currentStyle||a.style,d=c[b];!l(d)&&ga(c.getPro" +
    "pertyValue)&&(d=c.getPropertyValue(b));return\"inherit\"!=d?l(d)?d:n" +
    "ull:(c=Fc(a))?Hc(c,b):null}\nfunction Ic(a,b,c){function d(a){var b" +
    "=Jc(a);return 0<b.height&&0<b.width?!0:R(a,\"PATH\")&&(0<b.height||0" +
    "<b.width)?(a=S(a,\"stroke-width\"),!!a&&0<parseInt(a,10)):\"hidden\"!=" +
    "S(a,\"overflow\")&&za(a.childNodes,function(a){return 3==a.nodeType|" +
    "|R(a)&&d(a)})}function e(a){return\"hidden\"==Kc(a)&&Aa(a.childNodes" +
    ",function(a){return!R(a)||e(a)||!d(a)})}if(!R(a))throw Error(\"Argu" +
    "ment to isShown must be of type Element\");if(R(a,\"BODY\"))return!0;" +
    "if(R(a,\"OPTION\")||R(a,\"OPTGROUP\"))return a=Va(a,function(a){return" +
    " R(a,\n\"SELECT\")}),!!a&&Ic(a,!0,c);var f=Lc(a);if(f)return!!f.G&&0<" +
    "f.rect.width&&0<f.rect.height&&Ic(f.G,b,c);if(R(a,\"INPUT\")&&\"hidde" +
    "n\"==a.type.toLowerCase()||R(a,\"NOSCRIPT\"))return!1;f=S(a,\"visibili" +
    "ty\");return\"collapse\"!=f&&\"hidden\"!=f&&c(a)&&(b||0!=Mc(a))&&d(a)?!" +
    "e(a):!1}function Ac(a){function b(a){if(\"none\"==S(a,\"display\"))ret" +
    "urn!1;a=Fc(a);return!a||b(a)}return Ic(a,!0,b)}\nfunction Kc(a,b){f" +
    "unction c(a){function b(a){return a==k?!0:0==S(a,\"display\").lastIn" +
    "dexOf(\"inline\",0)||\"absolute\"==c&&\"static\"==S(a,\"position\")?!1:!0}" +
    "var c=S(a,\"position\");if(\"fixed\"==c)return G=!0,a==k?null:k;for(a=" +
    "Fc(a);a&&!b(a);)a=Fc(a);return a}function d(a){var b=a;if(\"visible" +
    "\"==r)if(a==k&&p)b=p;else if(a==p)return{x:\"visible\",y:\"visible\"};b" +
    "={x:S(b,\"overflow-x\"),y:S(b,\"overflow-y\")};a==k&&(b.x=\"visible\"==b" +
    ".x?\"auto\":b.x,b.y=\"visible\"==b.y?\"auto\":b.y);return b}function e(a" +
    "){if(a==k){var b=(new Xa(g)).a;\na=b.scrollingElement?b.scrollingEl" +
    "ement:b.body||b.documentElement;b=b.parentWindow||b.defaultView;a=" +
    "new Fa(b.pageXOffset||a.scrollLeft,b.pageYOffset||a.scrollTop)}els" +
    "e a=new Fa(a.scrollLeft,a.scrollTop);return a}for(var f=Nc(a,b),g=" +
    "u(a),k=g.documentElement,p=g.body,r=S(k,\"overflow\"),G,x=c(a);x;x=c" +
    "(x)){var t=d(x);if(\"visible\"!=t.x||\"visible\"!=t.y){var E=Jc(x);if(" +
    "0==E.width||0==E.height)return\"hidden\";var V=f.right<E.left,pa=f.b" +
    "ottom<E.top;if(V&&\"hidden\"==t.x||pa&&\"hidden\"==t.y)return\"hidden\";" +
    "if(V&&\n\"visible\"!=t.x||pa&&\"visible\"!=t.y){V=e(x);pa=f.bottom<E.to" +
    "p-V.y;if(f.right<E.left-V.x&&\"visible\"!=t.x||pa&&\"visible\"!=t.x)re" +
    "turn\"hidden\";f=Kc(x);return\"hidden\"==f?\"hidden\":\"scroll\"}V=f.left>" +
    "=E.left+E.width;E=f.top>=E.top+E.height;if(V&&\"hidden\"==t.x||E&&\"h" +
    "idden\"==t.y)return\"hidden\";if(V&&\"visible\"!=t.x||E&&\"visible\"!=t.y" +
    "){if(G&&(t=e(x),f.left>=k.scrollWidth-t.x||f.right>=k.scrollHeight" +
    "-t.y))return\"hidden\";f=Kc(x);return\"hidden\"==f?\"hidden\":\"scroll\"}}" +
    "}return\"none\"}\nfunction Jc(a){var b=Lc(a);if(b)return b.rect;if(R(" +
    "a,\"HTML\"))return a=u(a),a=((a?a.parentWindow||a.defaultView:window" +
    ")||window).document,a=\"CSS1Compat\"==a.compatMode?a.documentElement" +
    ":a.body,a=new Ga(a.clientWidth,a.clientHeight),new v(0,0,a.width,a" +
    ".height);var c;try{c=a.getBoundingClientRect()}catch(d){return new" +
    " v(0,0,0,0)}return new v(c.left,c.top,c.right-c.left,c.bottom-c.to" +
    "p)}\nfunction Lc(a){var b=R(a,\"MAP\");if(!b&&!R(a,\"AREA\"))return nul" +
    "l;var c=b?a:R(a.parentNode,\"MAP\")?a.parentNode:null,d=null,e=null;" +
    "if(c&&c.name&&(d=u(c),d=Q.K('/descendant::*[@usemap = \"#'+c.name+'" +
    "\"]',d))&&(e=Jc(d),!b&&\"default\"!=a.shape.toLowerCase())){var f=Oc(" +
    "a);a=Math.min(Math.max(f.left,0),e.width);b=Math.min(Math.max(f.to" +
    "p,0),e.height);c=Math.min(f.width,e.width-a);f=Math.min(f.height,e" +
    ".height-b);e=new v(a+e.left,b+e.top,c,f)}return{G:d,rect:e||new v(" +
    "0,0,0,0)}}\nfunction Oc(a){var b=a.shape.toLowerCase();a=a.coords.s" +
    "plit(\",\");if(\"rect\"==b&&4==a.length){var b=a[0],c=a[1];return new " +
    "v(b,c,a[2]-b,a[3]-c)}if(\"circle\"==b&&3==a.length)return b=a[2],new" +
    " v(a[0]-b,a[1]-b,2*b,2*b);if(\"poly\"==b&&2<a.length){for(var b=a[0]" +
    ",c=a[1],d=b,e=c,f=2;f+1<a.length;f+=2)b=Math.min(b,a[f]),d=Math.ma" +
    "x(d,a[f]),c=Math.min(c,a[f+1]),e=Math.max(e,a[f+1]);return new v(b" +
    ",c,d-b,e-c)}return new v(0,0,0,0)}\nfunction Nc(a,b){var c;c=Jc(a);" +
    "c=new Ya(c.top,c.left+c.width,c.top+c.height,c.left);if(b){var d=b" +
    " instanceof v?b:new v(b.x,b.y,1,1);c.left=Ea(c.left+d.left,c.left," +
    "c.right);c.top=Ea(c.top+d.top,c.top,c.bottom);c.right=Ea(c.left+d." +
    "width,c.left,c.right);c.bottom=Ea(c.top+d.height,c.top,c.bottom)}r" +
    "eturn c}function Mc(a){var b=1,c=S(a,\"opacity\");c&&(b=Number(c));(" +
    "a=Fc(a))&&(b*=Mc(a));return b};function Pc(a){this.a=$a.document.d" +
    "ocumentElement;this.i=null;var b=Wa(u(this.a));b&&Qc(this,b);this." +
    "u=a||new Rc}function Qc(a,b){a.a=b;R(b,\"OPTION\")?a.i=Va(b,function" +
    "(a){return R(a,\"SELECT\")}):a.i=null}function Sc(a){return R(a,\"FOR" +
    "M\")}function Tc(a){if(!Sc(a))throw new w(12,\"Element is not a form" +
    ", so could not submit.\");T(a,Uc)&&(R(a.submit)?a.constructor.proto" +
    "type.submit.call(a):a.submit())}function Rc(){this.a=0};ra(db,4);f" +
    "unction U(a,b,c){this.a=a;this.f=b;this.c=c}U.prototype.b=function" +
    "(a){a=u(a).createEvent(\"HTMLEvents\");a.initEvent(this.a,this.f,thi" +
    "s.c);return a};U.prototype.toString=aa(\"a\");function Vc(a,b,c){U.c" +
    "all(this,a,b,c)}n(Vc,U);Vc.prototype.b=function(a,b){var c;c=u(a)." +
    "createEvent(\"Events\");c.initEvent(this.a,this.f,this.c);c.altKey=b" +
    ".altKey;c.ctrlKey=b.ctrlKey;c.metaKey=b.metaKey;c.shiftKey=b.shift" +
    "Key;c.keyCode=b.charCode||b.keyCode;c.charCode=this==Wc?c.keyCode:" +
    "0;return c};\nvar Xc=new U(\"blur\",!1,!1),Yc=new U(\"change\",!0,!1),Z" +
    "c=new U(\"focus\",!1,!1),$c=new U(\"input\",!0,!1),Uc=new U(\"submit\",!" +
    "0,!0),ad=new U(\"textInput\",!0,!0),bd=new Vc(\"keydown\",!0,!0),Wc=ne" +
    "w Vc(\"keypress\",!0,!0),cd=new Vc(\"keyup\",!0,!0);function T(a,b,c){" +
    "b=b.b(a,c);\"isTrusted\"in b||(b.isTrusted=!1);return a.dispatchEven" +
    "t(b)};function dd(a,b){ed(a)&&(a.selectionStart=b)}function W(a,b)" +
    "{var c=0,d=0;ed(a)&&(c=a.selectionStart,d=b?-1:a.selectionEnd);ret" +
    "urn[c,d]}function fd(a,b){ed(a)&&(a.selectionEnd=b)}function gd(a," +
    "b){ed(a)&&(a.selectionStart=b,a.selectionEnd=b)}function hd(a,b){i" +
    "f(ed(a)){var c=a.value,d=a.selectionStart;a.value=c.substr(0,d)+b+" +
    "c.substr(a.selectionEnd);a.selectionStart=d;a.selectionEnd=d+b.len" +
    "gth}else throw Error(\"Cannot set the selection end\");}\nfunction ed" +
    "(a){try{return\"number\"==typeof a.selectionStart}catch(b){return!1}" +
    "};var id=\"StopIteration\"in ca?ca.StopIteration:{message:\"StopItera" +
    "tion\",stack:\"\"};function jd(){}jd.prototype.a=function(){throw id;" +
    "};jd.prototype.A=function(){return this};function kd(a,b){this.b={" +
    "};this.a=[];this.c=this.f=0;var c=arguments.length;if(1<c){if(c%2)" +
    "throw Error(\"Uneven number of arguments\");for(var d=0;d<c;d+=2)ld(" +
    "this,arguments[d],arguments[d+1])}else if(a){if(a instanceof kd)d=" +
    "md(a),c=a.v();else{var c=[],e=0;for(d in a)c[e++]=d;d=c;c=Da(a)}fo" +
    "r(e=0;e<d.length;e++)ld(this,d[e],c[e])}}h=kd.prototype;h.v=functi" +
    "on(){nd(this);for(var a=[],b=0;b<this.a.length;b++)a.push(this.b[t" +
    "his.a[b]]);return a};function md(a){nd(a);return a.a.concat()}\nh.c" +
    "lear=function(){this.b={};this.c=this.f=this.a.length=0};function " +
    "nd(a){if(a.f!=a.a.length){for(var b=0,c=0;b<a.a.length;){var d=a.a" +
    "[b];od(a.b,d)&&(a.a[c++]=d);b++}a.a.length=c}if(a.f!=a.a.length){f" +
    "or(var e={},c=b=0;b<a.a.length;)d=a.a[b],od(e,d)||(a.a[c++]=d,e[d]" +
    "=1),b++;a.a.length=c}}h.get=function(a,b){return od(this.b,a)?this" +
    ".b[a]:b};function ld(a,b,c){od(a.b,b)||(a.f++,a.a.push(b),a.c++);a" +
    ".b[b]=c}\nh.forEach=function(a,b){for(var c=md(this),d=0;d<c.length" +
    ";d++){var e=c[d],f=this.get(e);a.call(b,f,e,this)}};h.clone=functi" +
    "on(){return new kd(this)};h.A=function(a){nd(this);var b=0,c=this." +
    "c,d=this,e=new jd;e.a=function(){if(c!=d.c)throw Error(\"The map ha" +
    "s changed since the iterator was created\");if(b>=d.a.length)throw " +
    "id;var e=d.a[b++];return a?e:d.b[e]};return e};function od(a,b){re" +
    "turn Object.prototype.hasOwnProperty.call(a,b)};function pd(a){if(" +
    "\"function\"==typeof a.v)return a.v();if(m(a))return a.split(\"\");var" +
    " b=ea(a);if(\"array\"==b||\"object\"==b&&\"number\"==typeof a.length){fo" +
    "r(var b=[],c=a.length,d=0;d<c;d++)b.push(a[d]);return b}return Da(" +
    "a)};function qd(a){this.a=new kd;if(a){a=pd(a);for(var b=a.length," +
    "c=0;c<b;c++){var d=a[c];ld(this.a,rd(d),d)}}}function rd(a){var b=" +
    "typeof a;return\"object\"==b&&a||\"function\"==b?\"o\"+(a[ha]||(a[ha]=++" +
    "ia)):b.substr(0,1)+a}h=qd.prototype;h.clear=function(){this.a.clea" +
    "r()};h.contains=function(a){a=rd(a);return od(this.a.b,a)};h.v=fun" +
    "ction(){return this.a.v()};h.clone=function(){return new qd(this)}" +
    ";h.A=function(){return this.a.A(!1)};function sd(a){Pc.call(this);" +
    "this.c=Gc(this.a);this.b=0;this.f=new qd;a&&(q(a.pressed,function(" +
    "a){td(this,a,!0)},this),this.b=a.currentPos||0)}n(sd,Pc);var ud={}" +
    ";function X(a,b,c){var d=typeof a;(\"object\"==d&&null!=a||\"function" +
    "\"==d)&&(a=a.g);a=new vd(a,b,c);!b||b in ud&&!c||(ud[b]={key:a,shif" +
    "t:!1},c&&(ud[c]={key:a,shift:!0}));return a}function vd(a,b,c){thi" +
    "s.code=a;this.a=b||null;this.b=c||this.a}var wd=X(8),xd=X(9),yd=X(" +
    "13),Y=X(16),zd=X(17),Ad=X(18),Bd=X(19);X(20);\nvar Cd=X(27),Dd=X(32" +
    ",\" \"),Ed=X(33),Fd=X(34),Gd=X(35),Hd=X(36),Id=X(37),Jd=X(38),Kd=X(3" +
    "9),Ld=X(40);X(44);var Md=X(45),Nd=X(46);X(48,\"0\",\")\");X(49,\"1\",\"!\"" +
    ");X(50,\"2\",\"@\");X(51,\"3\",\"#\");X(52,\"4\",\"$\");X(53,\"5\",\"%\");X(54,\"6\"" +
    ",\"^\");X(55,\"7\",\"&\");X(56,\"8\",\"*\");X(57,\"9\",\"(\");X(65,\"a\",\"A\");X(66" +
    ",\"b\",\"B\");X(67,\"c\",\"C\");X(68,\"d\",\"D\");X(69,\"e\",\"E\");X(70,\"f\",\"F\");" +
    "X(71,\"g\",\"G\");X(72,\"h\",\"H\");X(73,\"i\",\"I\");X(74,\"j\",\"J\");X(75,\"k\",\"" +
    "K\");X(76,\"l\",\"L\");X(77,\"m\",\"M\");X(78,\"n\",\"N\");X(79,\"o\",\"O\");X(80,\"" +
    "p\",\"P\");X(81,\"q\",\"Q\");\nX(82,\"r\",\"R\");X(83,\"s\",\"S\");X(84,\"t\",\"T\");X" +
    "(85,\"u\",\"U\");X(86,\"v\",\"V\");X(87,\"w\",\"W\");X(88,\"x\",\"X\");X(89,\"y\",\"Y" +
    "\");X(90,\"z\",\"Z\");var Od=X(La?{h:91,g:91}:Ka?{h:224,g:91}:{h:0,g:91" +
    "});X(La?{h:92,g:92}:Ka?{h:224,g:93}:{h:0,g:92});X(La?{h:93,g:93}:K" +
    "a?{h:0,g:0}:{h:93,g:null});\nvar Pd=X({h:96,g:96},\"0\"),Qd=X({h:97,g" +
    ":97},\"1\"),Rd=X({h:98,g:98},\"2\"),Sd=X({h:99,g:99},\"3\"),Td=X({h:100," +
    "g:100},\"4\"),Ud=X({h:101,g:101},\"5\"),Vd=X({h:102,g:102},\"6\"),Wd=X({" +
    "h:103,g:103},\"7\"),Xd=X({h:104,g:104},\"8\"),Yd=X({h:105,g:105},\"9\")," +
    "Zd=X({h:106,g:106},\"*\"),$d=X({h:107,g:107},\"+\"),ae=X({h:109,g:109}" +
    ",\"-\"),be=X({h:110,g:110},\".\"),ce=X({h:111,g:111},\"/\");X(144);\nvar " +
    "de=X(112),ee=X(113),fe=X(114),ge=X(115),he=X(116),ie=X(117),je=X(1" +
    "18),ke=X(119),le=X(120),me=X(121),ne=X(122),oe=X(123),pe=X({h:107," +
    "g:187},\"=\",\"+\"),qe=X(108,\",\");X({h:109,g:189},\"-\",\"_\");X(188,\",\",\"" +
    "<\");X(190,\".\",\">\");X(191,\"/\",\"?\");X(192,\"`\",\"~\");X(219,\"[\",\"{\");X(" +
    "220,\"\\\\\",\"|\");X(221,\"]\",\"}\");var re=X({h:59,g:186},\";\",\":\");X(222," +
    "\"'\",'\"');var se=[Ad,zd,Od,Y],te=new kd;ld(te,1,Y);ld(te,2,zd);ld(t" +
    "e,4,Ad);ld(te,8,Od);var ue=function(a){var b=new kd;q(md(a),functi" +
    "on(c){ld(b,a.get(c).code,c)});return b}(te);\nfunction td(a,b,c){if" +
    "(0<=xa(se,b)){var d=ue.get(b.code),e=a.u;e.a=c?e.a|d:e.a&~d}c?ld(a" +
    ".f.a,rd(b),b):(a=a.f.a,b=rd(b),od(a.b,b)&&(delete a.b[b],a.f--,a.c" +
    "++,a.a.length>2*a.f&&nd(a)))}function Z(a,b){return a.f.contains(b" +
    ")}\nfunction ve(a,b){if(0<=xa(se,b)&&Z(a,b))throw new w(13,\"Cannot " +
    "press a modifier key that is already pressed.\");var c=null!==b.cod" +
    "e&&we(a,bd,b);if(c&&(!b.a&&b!=yd||we(a,Wc,b,!c))&&c&&(xe(a,b),a.c)" +
    ")if(b.a){var c=ye(a,b),d=W(a.a,!0)[0]+1;ze(a.a)?(hd(a.a,c),dd(a.a," +
    "d)):a.a.value+=c;T(a.a,ad);T(a.a,$c);a.b=d}else switch(b){case yd:" +
    "T(a.a,ad);R(a.a,\"TEXTAREA\")&&(c=W(a.a,!0)[0]+1,ze(a.a)?(hd(a.a,\"\\n" +
    "\"),dd(a.a,c)):a.a.value+=\"\\n\",T(a.a,$c),a.b=c);break;case wd:case " +
    "Nd:Ae(a.a);c=W(a.a,!1);c[0]==c[1]&&(b==wd?\n(dd(a.a,c[1]-1),fd(a.a," +
    "c[1])):fd(a.a,c[1]+1));c=W(a.a,!1);c=!(c[0]==a.a.value.length||0==" +
    "c[1]);hd(a.a,\"\");c&&T(a.a,$c);c=W(a.a,!1);a.b=c[1];break;case Id:c" +
    "ase Kd:Ae(a.a);var c=a.a,e=W(c,!0)[0],f=W(c,!1)[1],g=d=0;b==Id?Z(a" +
    ",Y)?a.b==e?(d=Math.max(e-1,0),g=f,e=d):(d=e,e=g=f-1):e=e==f?Math.m" +
    "ax(e-1,0):e:Z(a,Y)?a.b==f?(d=e,e=g=Math.min(f+1,c.value.length)):(" +
    "d=e+1,g=f,e=d):e=e==f?Math.min(f+1,c.value.length):f;Z(a,Y)?(dd(c," +
    "d),fd(c,g)):gd(c,e);a.b=e;break;case Hd:case Gd:Ae(a.a),c=a.a,d=W(" +
    "c,!0)[0],g=W(c,!1)[1],\nb==Hd?(Z(a,Y)?(dd(c,0),fd(c,a.b==d?g:d)):gd" +
    "(c,0),a.b=0):(Z(a,Y)?(a.b==d&&dd(c,g),fd(c,c.value.length)):gd(c,c" +
    ".value.length),a.b=c.value.length)}td(a,b,!0)}\nfunction xe(a,b){if" +
    "(b==yd&&R(a.a,\"INPUT\")){var c=Va(a.a,Sc,!0);if(c){var d=c.getEleme" +
    "ntsByTagName(\"input\");!za(d,function(a){a:{if(R(a,\"INPUT\")){var b=" +
    "a.type.toLowerCase();if(\"submit\"==b||\"image\"==b){a=!0;break a}}if(" +
    "R(a,\"BUTTON\")&&(b=a.type.toLowerCase(),\"submit\"==b)){a=!0;break a}" +
    "a=!1}return a})&&1!=d.length&&(Pa[534]||(Pa[534]=0<=ra(Oa,534)))||" +
    "Tc(c)}}}function Be(a,b){if(!Z(a,b))throw new w(13,\"Cannot release" +
    " a key that is not pressed. (\"+b.code+\")\");null===b.code||we(a,cd," +
    "b);td(a,b,!1)}\nfunction ye(a,b){if(!b.a)throw new w(13,\"not a char" +
    "acter key\");return Z(a,Y)?b.b:b.a}function Ae(a){try{a.selectionSt" +
    "art}catch(b){if(-1!=b.message.indexOf(\"does not support selection." +
    "\"))throw Error(b.message+\" (For more information, see https://code" +
    ".google.com/p/chromium/issues/detail?id=330456)\");throw b;}}functi" +
    "on ze(a){try{Ae(a)}catch(b){return!1}return!0}\nfunction we(a,b,c,d" +
    "){if(null===c.code)throw new w(13,\"Key must have a keycode to be f" +
    "ired.\");c={altKey:Z(a,Ad),ctrlKey:Z(a,zd),metaKey:Z(a,Od),shiftKey" +
    ":Z(a,Y),keyCode:c.code,charCode:c.a&&b==Wc?ye(a,c).charCodeAt(0):0" +
    ",preventDefault:!!d};return T(a.a,b,c)}function Ce(a,b){Qc(a,b);a." +
    "c=Gc(b);var c;c=a.i||a.a;var d=Wa(u(c));if(c==d)c=!1;else{if(d&&ga" +
    "(d.blur)&&!R(d,\"BODY\"))try{d.blur()}catch(e){throw e;}ga(c.focus)?" +
    "(c.focus(),c=!0):c=!1}a.c&&c&&(gd(b,b.value.length),a.b=b.value.le" +
    "ngth)};function De(a,b,c,d){function e(a){m(a)?q(a.split(\"\"),funct" +
    "ion(a){if(1!=a.length)throw new w(13,\"Argument not a single charac" +
    "ter: \"+a);var b=ud[a];b||(b=a.toUpperCase(),b=X(b.charCodeAt(0),a." +
    "toLowerCase(),b),b={key:b,shift:a!=b.a});a=b;b=Z(f,Y);a.shift&&!b&" +
    "&ve(f,Y);ve(f,a.key);Be(f,a.key);a.shift&&!b&&Be(f,Y)}):0<=xa(se,a" +
    ")?Z(f,a)?Be(f,a):ve(f,a):(ve(f,a),Be(f,a))}if(a!=Wa(u(a))){if(!zc(" +
    "a))throw new w(12,\"Element is not currently interactable and may n" +
    "ot be manipulated\");Ee(a)}var f=c||new sd;Ce(f,\na);if(\"date\"==a.ty" +
    "pe){c=\"array\"==ea(b)?b=b.join(\"\"):b;var g=/\\d{4}-\\d{2}-\\d{2}/;if(c" +
    ".match(g)){T(a,Zc);a.value=c.match(g)[0];T(a,Yc);T(a,Xc);return}}\"" +
    "array\"==ea(b)?q(b,e):e(b);d||q(se,function(a){Z(f,a)&&Be(f,a)})}\nf" +
    "unction Ee(a){if(\"scroll\"==Kc(a,void 0)){if(a.scrollIntoView&&(a.s" +
    "crollIntoView(),\"none\"==Kc(a,void 0)))return;for(var b=Nc(a,void 0" +
    "),c=Fc(a);c;c=Fc(c)){var d=c,e=Jc(d),f,g=d,k=f=void 0,p=void 0,r=v" +
    "oid 0,r=Za(g,\"borderLeftWidth\"),p=Za(g,\"borderRightWidth\"),k=Za(g," +
    "\"borderTopWidth\");f=Za(g,\"borderBottomWidth\");f=new Ya(parseFloat(" +
    "k),parseFloat(p),parseFloat(f),parseFloat(r));g=b.left-e.left-f.le" +
    "ft;e=b.top-e.top-f.top;f=d.clientHeight+b.top-b.bottom;d.scrollLef" +
    "t+=Math.min(g,Math.max(g-(d.clientWidth+\nb.left-b.right),0));d.scr" +
    "ollTop+=Math.min(e,Math.max(e-f,0))}Kc(a,void 0)}};function Fe(a,b" +
    ",c,d){function e(){return{H:f,keys:[]}}var f=!!d,g=[],k=e();g.push" +
    "(k);q(b,function(a){q(a.split(\"\"),function(a){if(\"\\ue000\"<=a&&\"\\ue"
  )
      .append(
    "03d\">=a){var b=Ge[a];if(null===b)g.push(k=e()),f&&(k.H=!1,g.push(k" +
    "=e()));else if(l(b))k.keys.push(b);else throw Error(\"Unsupported W" +
    "ebDriver key: \\\\u\"+a.charCodeAt(0).toString(16));}else switch(a){c" +
    "ase \"\\n\":k.keys.push(yd);break;case \"\\t\":k.keys.push(xd);break;cas" +
    "e \"\\b\":k.keys.push(wd);break;default:k.keys.push(a)}})});q(g,funct" +
    "ion(b){De(a,b.keys,c,b.H)})}\nvar Ge={\"\\ue000\":null,\"\\ue003\":wd,\"\\u" +
    "e004\":xd,\"\\ue006\":yd,\"\\ue007\":yd,\"\\ue008\":Y,\"\\ue009\":zd,\"\\ue00a\":A" +
    "d,\"\\ue00b\":Bd,\"\\ue00c\":Cd,\"\\ue00d\":Dd,\"\\ue00e\":Ed,\"\\ue00f\":Fd,\"\\ue" +
    "010\":Gd,\"\\ue011\":Hd,\"\\ue012\":Id,\"\\ue013\":Jd,\"\\ue014\":Kd,\"\\ue015\":L" +
    "d,\"\\ue016\":Md,\"\\ue017\":Nd,\"\\ue018\":re,\"\\ue019\":pe,\"\\ue01a\":Pd,\"\\ue" +
    "01b\":Qd,\"\\ue01c\":Rd,\"\\ue01d\":Sd,\"\\ue01e\":Td,\"\\ue01f\":Ud,\"\\ue020\":V" +
    "d,\"\\ue021\":Wd,\"\\ue022\":Xd,\"\\ue023\":Yd,\"\\ue024\":Zd,\"\\ue025\":$d,\"\\ue" +
    "027\":ae,\"\\ue028\":be,\"\\ue029\":ce,\"\\ue026\":qe,\"\\ue031\":de,\"\\ue032\":e" +
    "e,\n\"\\ue033\":fe,\"\\ue034\":ge,\"\\ue035\":he,\"\\ue036\":ie,\"\\ue037\":je,\"\\u" +
    "e038\":ke,\"\\ue039\":le,\"\\ue03a\":me,\"\\ue03b\":ne,\"\\ue03c\":oe,\"\\ue03d\":" +
    "Od};da(\"_\",function(a,b,c,d){c=new sd(c);a||(a=Wa(u(document)));if" +
    "(!a)throw Error(\"No element to send keys to\");Fe(a,b,c,d);return{p" +
    "ressed:c.f.v(),currentPos:c.b}});;return this._.apply(null,argumen" +
    "ts);}).apply({navigator:typeof window!=\"undefined\"?window.navigato" +
    "r:null},arguments);}\n"
  )
  .toString();
  static final String SEND_KEYS_ANDROID_license =
    "\n\n Copyright 2014 Software Freedom Conservancy\n\n Licensed under th" +
    "e Apache License, Version 2.0 (the \"License\");\n you may not use th" +
    "is file except in compliance with the License.\n You may obtain a c" +
    "opy of the License at\n\n      http://www.apache.org/licenses/LICENS" +
    "E-2.0\n\n Unless required by applicable law or agreed to in writing," +
    " software\n distributed under the License is distributed on an \"AS " +
    "IS\" BASIS,\n WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either e" +
    "xpress or implied.\n See the License for the specific language gove" +
    "rning permissions and\n limitations under the License.\n";
  private static final String SEND_KEYS_ANDROID_original() {
    return SEND_KEYS_ANDROID.replaceAll("xxx_rpl_lic", SEND_KEYS_ANDROID_license);
  }

/* field: ACTIVE_ELEMENT_ANDROID license: 

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
  static final String ACTIVE_ELEMENT_ANDROID =
  new StringBuilder(
    "function(){return(function(){function h(a){return function(){retur" +
    "n this[a]}}function k(a){return function(){return a}}var l=this;fu" +
    "nction aa(a,b){var c=a.split(\".\"),d=l;c[0]in d||!d.execScript||d.e" +
    "xecScript(\"var \"+c[0]);for(var e;c.length&&(e=c.shift());)c.length" +
    "||void 0===b?d[e]?d=d[e]:d=d[e]={}:d[e]=b}\nfunction ba(a){var b=ty" +
    "peof a;if(\"object\"==b)if(a){if(a instanceof Array)return\"array\";if" +
    "(a instanceof Object)return b;var c=Object.prototype.toString.call" +
    "(a);if(\"[object Window]\"==c)return\"object\";if(\"[object Array]\"==c|" +
    "|\"number\"==typeof a.length&&\"undefined\"!=typeof a.splice&&\"undefin" +
    "ed\"!=typeof a.propertyIsEnumerable&&!a.propertyIsEnumerable(\"splic" +
    "e\"))return\"array\";if(\"[object Function]\"==c||\"undefined\"!=typeof a" +
    ".call&&\"undefined\"!=typeof a.propertyIsEnumerable&&!a.propertyIsEn" +
    "umerable(\"call\"))return\"function\"}else return\"null\";\nelse if(\"func" +
    "tion\"==b&&\"undefined\"==typeof a.call)return\"object\";return b}funct" +
    "ion m(a){return\"string\"==typeof a}function ca(a,b,c){return a.call" +
    ".apply(a.bind,arguments)}function da(a,b,c){if(!a)throw Error();if" +
    "(2<arguments.length){var d=Array.prototype.slice.call(arguments,2)" +
    ";return function(){var c=Array.prototype.slice.call(arguments);Arr" +
    "ay.prototype.unshift.apply(c,d);return a.apply(b,c)}}return functi" +
    "on(){return a.apply(b,arguments)}}\nfunction ea(a,b,c){ea=Function." +
    "prototype.bind&&-1!=Function.prototype.bind.toString().indexOf(\"na" +
    "tive code\")?ca:da;return ea.apply(null,arguments)}function fa(a,b)" +
    "{var c=Array.prototype.slice.call(arguments,1);return function(){v" +
    "ar b=c.slice();b.push.apply(b,arguments);return a.apply(this,b)}}\n" +
    "function n(a,b){function c(){}c.prototype=b.prototype;a.G=b.protot" +
    "ype;a.prototype=new c;a.prototype.constructor=a;a.F=function(a,c,f" +
    "){for(var g=Array(arguments.length-2),w=2;w<arguments.length;w++)g" +
    "[w-2]=arguments[w];return b.prototype[c].apply(a,g)}};function r(a" +
    "){if(Error.captureStackTrace)Error.captureStackTrace(this,r);else{" +
    "var b=Error().stack;b&&(this.stack=b)}a&&(this.message=String(a))}" +
    "n(r,Error);r.prototype.name=\"CustomError\";function ga(a,b){for(var" +
    " c=a.split(\"%s\"),d=\"\",e=Array.prototype.slice.call(arguments,1);e." +
    "length&&1<c.length;)d+=c.shift()+e.shift();return d+c.join(\"%s\")}v" +
    "ar ha=String.prototype.trim?function(a){return a.trim()}:function(" +
    "a){return a.replace(/^[\\s\\xa0]+|[\\s\\xa0]+$/g,\"\")};function ia(a,b)" +
    "{return a<b?-1:a>b?1:0};function ja(a,b){b.unshift(a);r.call(this," +
    "ga.apply(null,b));b.shift()}n(ja,r);ja.prototype.name=\"AssertionEr" +
    "ror\";function ka(a,b,c){if(!a){var d=\"Assertion failed\";if(b)var d" +
    "=d+(\": \"+b),e=Array.prototype.slice.call(arguments,2);throw new ja" +
    "(\"\"+d,e||[]);}};var t=Array.prototype;function u(a,b){for(var c=a." +
    "length,d=m(a)?a.split(\"\"):a,e=0;e<c;e++)e in d&&b.call(void 0,d[e]" +
    ",e,a)}function v(a,b,c){var d=c;u(a,function(c,f){d=b.call(void 0," +
    "d,c,f,a)});return d}function x(a,b){for(var c=a.length,d=m(a)?a.sp" +
    "lit(\"\"):a,e=0;e<c;e++)if(e in d&&b.call(void 0,d[e],e,a))return!0;" +
    "return!1}function la(a){return t.concat.apply(t,arguments)}functio" +
    "n ma(a,b,c){ka(null!=a.length);return 2>=arguments.length?t.slice." +
    "call(a,b):t.slice.call(a,b,c)};var y;a:{var na=l.navigator;if(na){" +
    "var oa=na.userAgent;if(oa){y=oa;break a}}y=\"\"};function pa(a,b){if" +
    "(a.contains&&1==b.nodeType)return a==b||a.contains(b);if(\"undefine" +
    "d\"!=typeof a.compareDocumentPosition)return a==b||Boolean(a.compar" +
    "eDocumentPosition(b)&16);for(;b&&a!=b;)b=b.parentNode;return b==a}" +
    "\nfunction qa(a,b){if(a==b)return 0;if(a.compareDocumentPosition)re" +
    "turn a.compareDocumentPosition(b)&2?1:-1;if(\"sourceIndex\"in a||a.p" +
    "arentNode&&\"sourceIndex\"in a.parentNode){var c=1==a.nodeType,d=1==" +
    "b.nodeType;if(c&&d)return a.sourceIndex-b.sourceIndex;var e=a.pare" +
    "ntNode,f=b.parentNode;return e==f?ra(a,b):!c&&pa(e,b)?-1*sa(a,b):!" +
    "d&&pa(f,a)?sa(b,a):(c?a.sourceIndex:e.sourceIndex)-(d?b.sourceInde" +
    "x:f.sourceIndex)}ka(a,\"Node cannot be null or undefined.\");d=9==a." +
    "nodeType?a:a.ownerDocument||a.document;c=\nd.createRange();c.select" +
    "Node(a);c.collapse(!0);d=d.createRange();d.selectNode(b);d.collaps" +
    "e(!0);return c.compareBoundaryPoints(l.Range.START_TO_END,d)}funct" +
    "ion sa(a,b){var c=a.parentNode;if(c==b)return-1;for(var d=b;d.pare" +
    "ntNode!=c;)d=d.parentNode;return ra(d,a)}function ra(a,b){for(var " +
    "c=b;c=c.previousSibling;)if(c==a)return-1;return 1};/*xxx_rpl_lic*" +
    "/\nfunction ta(a){return(a=a.exec(y))?a[1]:\"\"}ta(/Android\\s+([0-9.]" +
    "+)/)||ta(/Version\\/([0-9.]+)/);function ua(a){var b=0,c=ha(String(" +
    "va)).split(\".\");a=ha(String(a)).split(\".\");for(var d=Math.max(c.le" +
    "ngth,a.length),e=0;0==b&&e<d;e++){var f=c[e]||\"\",g=a[e]||\"\",w=RegE" +
    "xp(\"(\\\\d*)(\\\\D*)\",\"g\"),p=RegExp(\"(\\\\d*)(\\\\D*)\",\"g\");do{var q=w.exe" +
    "c(f)||[\"\",\"\",\"\"],C=p.exec(g)||[\"\",\"\",\"\"];if(0==q[0].length&&0==C[0" +
    "].length)break;b=ia(0==q[1].length?0:parseInt(q[1],10),0==C[1].len" +
    "gth?0:parseInt(C[1],10))||ia(0==q[2].length,0==C[2].length)||ia(q[" +
    "2],C[2])}while(0==b)}}\nvar wa=/Android\\s+([0-9\\.]+)/.exec(y),va=wa" +
    "?wa[1]:\"0\";ua(2.3);ua(4);/*\n\n The MIT License\n\n Copyright (c) 2007" +
    " Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is" +
    " hereby granted, free of charge, to any person obtaining a copy\n o" +
    "f this software and associated documentation files (the \"Software\"" +
    "), to\n deal in the Software without restriction, including without" +
    " limitation the\n rights to use, copy, modify, merge, publish, dist" +
    "ribute, sublicense, and/or\n sell copies of the Software, and to pe" +
    "rmit persons to whom the Software is\n furnished to do so, subject " +
    "to the following conditions:\n\n The above copyright notice and this" +
    " permission notice shall be included in\n all copies or substantial" +
    " portions of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WIT" +
    "HOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT " +
    "LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTI" +
    "CULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS " +
    "OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LI" +
    "ABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARIS" +
    "ING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR" +
    " OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction z(a,b,c){this.a=a;th" +
    "is.b=b||1;this.f=c||1};function xa(a){this.b=a;this.a=0}function y" +
    "a(a){a=a.match(za);for(var b=0;b<a.length;b++)Aa.test(a[b])&&a.spl" +
    "ice(b,1);return new xa(a)}var za=RegExp(\"\\\\$?(?:(?![0-9-])[\\\\w-]+:" +
    ")?(?![0-9-])[\\\\w-]+|\\\\/\\\\/|\\\\.\\\\.|::|\\\\d+(?:\\\\.\\\\d*)?|\\\\.\\\\d+|\\\"[^" +
    "\\\"]*\\\"|'[^']*'|[!<>]=|\\\\s+|.\",\"g\"),Aa=/^\\s/;function A(a,b){return" +
    " a.b[a.a+(b||0)]}function B(a){return a.b[a.a++]}function Ba(a){re" +
    "turn a.b.length<=a.a};function D(a){var b=null,c=a.nodeType;1==c&&" +
    "(b=a.textContent,b=void 0==b||null==b?a.innerText:b,b=void 0==b||n" +
    "ull==b?\"\":b);if(\"string\"!=typeof b)if(9==c||1==c){a=9==c?a.documen" +
    "tElement:a.firstChild;for(var c=0,d=[],b=\"\";a;){do 1!=a.nodeType&&" +
    "(b+=a.nodeValue),d[c++]=a;while(a=a.firstChild);for(;c&&!(a=d[--c]" +
    ".nextSibling););}}else b=a.nodeValue;return\"\"+b}\nfunction E(a,b,c)" +
    "{if(null===b)return!0;try{if(!a.getAttribute)return!1}catch(d){ret" +
    "urn!1}return null==c?!!a.getAttribute(b):a.getAttribute(b,2)==c}fu" +
    "nction F(a,b,c,d,e){return Ca.call(null,a,b,m(c)?c:null,m(d)?d:nul" +
    "l,e||new G)}\nfunction Ca(a,b,c,d,e){b.getElementsByName&&d&&\"name\"" +
    "==c?(b=b.getElementsByName(d),u(b,function(b){a.a(b)&&H(e,b)})):b." +
    "getElementsByClassName&&d&&\"class\"==c?(b=b.getElementsByClassName(" +
    "d),u(b,function(b){b.className==d&&a.a(b)&&H(e,b)})):a instanceof " +
    "I?Da(a,b,c,d,e):b.getElementsByTagName&&(b=b.getElementsByTagName(" +
    "a.f()),u(b,function(a){E(a,c,d)&&H(e,a)}));return e}function Ea(a," +
    "b,c,d,e){for(b=b.firstChild;b;b=b.nextSibling)E(b,c,d)&&a.a(b)&&H(" +
    "e,b);return e}\nfunction Da(a,b,c,d,e){for(b=b.firstChild;b;b=b.nex" +
    "tSibling)E(b,c,d)&&a.a(b)&&H(e,b),Da(a,b,c,d,e)};function G(){this" +
    ".b=this.a=null;this.l=0}function Fa(a){this.node=a;this.a=this.b=n" +
    "ull}function Ga(a,b){if(!a.a)return b;if(!b.a)return a;for(var c=a" +
    ".a,d=b.a,e=null,f=null,g=0;c&&d;)c.node==d.node?(f=c,c=c.a,d=d.a):" +
    "0<qa(c.node,d.node)?(f=d,d=d.a):(f=c,c=c.a),(f.b=e)?e.a=f:a.a=f,e=" +
    "f,g++;for(f=c||d;f;)f.b=e,e=e.a=f,g++,f=f.a;a.b=e;a.l=g;return a}f" +
    "unction Ha(a,b){var c=new Fa(b);c.a=a.a;a.b?a.a.b=c:a.a=a.b=c;a.a=" +
    "c;a.l++}function H(a,b){var c=new Fa(b);c.b=a.b;a.a?a.b.a=c:a.a=a." +
    "b=c;a.b=c;a.l++}\nfunction Ia(a){return(a=a.a)?a.node:null}function" +
    " Ja(a){return(a=Ia(a))?D(a):\"\"}function J(a,b){return new Ka(a,!!b" +
    ")}function Ka(a,b){this.f=a;this.b=(this.c=b)?a.b:a.a;this.a=null}" +
    "function K(a){var b=a.b;if(null==b)return null;var c=a.a=b;a.b=a.c" +
    "?b.b:b.a;return c.node};function La(a){switch(a.nodeType){case 1:r" +
    "eturn fa(Ma,a);case 9:return La(a.documentElement);case 11:case 10" +
    ":case 6:case 12:return Na;default:return a.parentNode?La(a.parentN" +
    "ode):Na}}function Na(){return null}function Ma(a,b){if(a.prefix==b" +
    ")return a.namespaceURI||\"http://www.w3.org/1999/xhtml\";var c=a.get" +
    "AttributeNode(\"xmlns:\"+b);return c&&c.specified?c.value||null:a.pa" +
    "rentNode&&9!=a.parentNode.nodeType?Ma(a.parentNode,b):null};functi" +
    "on L(a){this.i=a;this.b=this.g=!1;this.f=null}function M(a){return" +
    "\"\\n  \"+a.toString().split(\"\\n\").join(\"\\n  \")}function Oa(a,b){a.g=" +
    "b}function Pa(a,b){a.b=b}function N(a,b){var c=a.a(b);return c ins" +
    "tanceof G?+Ja(c):+c}function O(a,b){var c=a.a(b);return c instance" +
    "of G?Ja(c):\"\"+c}function P(a,b){var c=a.a(b);return c instanceof G" +
    "?!!c.l:!!c};function Q(a,b,c){L.call(this,a.i);this.c=a;this.h=b;t" +
    "his.o=c;this.g=b.g||c.g;this.b=b.b||c.b;this.c==Qa&&(c.b||c.g||4==" +
    "c.i||0==c.i||!b.f?b.b||b.g||4==b.i||0==b.i||!c.f||(this.f={name:c." +
    "f.name,s:b}):this.f={name:b.f.name,s:c})}n(Q,L);\nfunction R(a,b,c," +
    "d,e){b=b.a(d);c=c.a(d);var f;if(b instanceof G&&c instanceof G){e=" +
    "J(b);for(d=K(e);d;d=K(e))for(b=J(c),f=K(b);f;f=K(b))if(a(D(d),D(f)" +
    "))return!0;return!1}if(b instanceof G||c instanceof G){b instanceo" +
    "f G?e=b:(e=c,c=b);e=J(e);b=typeof c;for(d=K(e);d;d=K(e)){switch(b)" +
    "{case \"number\":d=+D(d);break;case \"boolean\":d=!!D(d);break;case \"s" +
    "tring\":d=D(d);break;default:throw Error(\"Illegal primitive type fo" +
    "r comparison.\");}if(a(d,c))return!0}return!1}return e?\"boolean\"==t" +
    "ypeof b||\"boolean\"==typeof c?\na(!!b,!!c):\"number\"==typeof b||\"numb" +
    "er\"==typeof c?a(+b,+c):a(b,c):a(+b,+c)}Q.prototype.a=function(a){r" +
    "eturn this.c.m(this.h,this.o,a)};Q.prototype.toString=function(){v" +
    "ar a=\"Binary Expression: \"+this.c,a=a+M(this.h);return a+=M(this.o" +
    ")};function Ra(a,b,c,d){this.a=a;this.w=b;this.i=c;this.m=d}Ra.pro" +
    "totype.toString=h(\"a\");var Sa={};function S(a,b,c,d){if(Sa.hasOwnP" +
    "roperty(a))throw Error(\"Binary operator already created: \"+a);a=ne" +
    "w Ra(a,b,c,d);return Sa[a.toString()]=a}\nS(\"div\",6,1,function(a,b," +
    "c){return N(a,c)/N(b,c)});S(\"mod\",6,1,function(a,b,c){return N(a,c" +
    ")%N(b,c)});S(\"*\",6,1,function(a,b,c){return N(a,c)*N(b,c)});S(\"+\"," +
    "5,1,function(a,b,c){return N(a,c)+N(b,c)});S(\"-\",5,1,function(a,b," +
    "c){return N(a,c)-N(b,c)});S(\"<\",4,2,function(a,b,c){return R(funct" +
    "ion(a,b){return a<b},a,b,c)});S(\">\",4,2,function(a,b,c){return R(f" +
    "unction(a,b){return a>b},a,b,c)});S(\"<=\",4,2,function(a,b,c){retur" +
    "n R(function(a,b){return a<=b},a,b,c)});\nS(\">=\",4,2,function(a,b,c" +
    "){return R(function(a,b){return a>=b},a,b,c)});var Qa=S(\"=\",3,2,fu" +
    "nction(a,b,c){return R(function(a,b){return a==b},a,b,c,!0)});S(\"!" +
    "=\",3,2,function(a,b,c){return R(function(a,b){return a!=b},a,b,c,!" +
    "0)});S(\"and\",2,2,function(a,b,c){return P(a,c)&&P(b,c)});S(\"or\",1," +
    "2,function(a,b,c){return P(a,c)||P(b,c)});function Ta(a,b){if(b.a." +
    "length&&4!=a.i)throw Error(\"Primary expression must evaluate to no" +
    "deset if filter has predicate(s).\");L.call(this,a.i);this.c=a;this" +
    ".h=b;this.g=a.g;this.b=a.b}n(Ta,L);Ta.prototype.a=function(a){a=th" +
    "is.c.a(a);return Ua(this.h,a)};Ta.prototype.toString=function(){va" +
    "r a;a=\"Filter:\"+M(this.c);return a+=M(this.h)};function Va(a,b){if" +
    "(b.length<a.A)throw Error(\"Function \"+a.j+\" expects at least\"+a.A+" +
    "\" arguments, \"+b.length+\" given\");if(null!==a.v&&b.length>a.v)thro" +
    "w Error(\"Function \"+a.j+\" expects at most \"+a.v+\" arguments, \"+b.l" +
    "ength+\" given\");a.B&&u(b,function(b,d){if(4!=b.i)throw Error(\"Argu" +
    "ment \"+d+\" to function \"+a.j+\" is not of type Nodeset: \"+b);});L.c" +
    "all(this,a.i);this.h=a;this.c=b;Oa(this,a.g||x(b,function(a){retur" +
    "n a.g}));Pa(this,a.D&&!b.length||a.C&&!!b.length||x(b,function(a){" +
    "return a.b}))}n(Va,L);\nVa.prototype.a=function(a){return this.h.m." +
    "apply(null,la(a,this.c))};Va.prototype.toString=function(){var a=\"" +
    "Function: \"+this.h;if(this.c.length)var b=v(this.c,function(a,b){r" +
    "eturn a+M(b)},\"Arguments:\"),a=a+M(b);return a};function Wa(a,b,c,d" +
    ",e,f,g,w,p){this.j=a;this.i=b;this.g=c;this.D=d;this.C=e;this.m=f;" +
    "this.A=g;this.v=void 0!==w?w:g;this.B=!!p}Wa.prototype.toString=h(" +
    "\"j\");var Xa={};\nfunction T(a,b,c,d,e,f,g,w){if(Xa.hasOwnProperty(a" +
    "))throw Error(\"Function already created: \"+a+\".\");Xa[a]=new Wa(a,b" +
    ",c,d,!1,e,f,g,w)}T(\"boolean\",2,!1,!1,function(a,b){return P(b,a)}," +
    "1);T(\"ceiling\",1,!1,!1,function(a,b){return Math.ceil(N(b,a))},1);" +
    "T(\"concat\",3,!1,!1,function(a,b){var c=ma(arguments,1);return v(c," +
    "function(b,c){return b+O(c,a)},\"\")},2,null);T(\"contains\",2,!1,!1,f" +
    "unction(a,b,c){b=O(b,a);a=O(c,a);return-1!=b.indexOf(a)},2);T(\"cou" +
    "nt\",1,!1,!1,function(a,b){return b.a(a).l},1,1,!0);\nT(\"false\",2,!1" +
    ",!1,k(!1),0);T(\"floor\",1,!1,!1,function(a,b){return Math.floor(N(b" +
    ",a))},1);T(\"id\",4,!1,!1,function(a,b){var c=a.a,d=9==c.nodeType?c:" +
    "c.ownerDocument,c=O(b,a).split(/\\s+/),e=[];u(c,function(a){a=d.get" +
    "ElementById(a);var b;if(!(b=!a)){a:if(m(e))b=m(a)&&1==a.length?e.i" +
    "ndexOf(a,0):-1;else{for(b=0;b<e.length;b++)if(b in e&&e[b]===a)bre" +
    "ak a;b=-1}b=0<=b}b||e.push(a)});e.sort(qa);var f=new G;u(e,functio" +
    "n(a){H(f,a)});return f},1);T(\"lang\",2,!1,!1,k(!1),1);\nT(\"last\",1,!" +
    "0,!1,function(a){if(1!=arguments.length)throw Error(\"Function last" +
    " expects ()\");return a.f},0);T(\"local-name\",3,!1,!0,function(a,b){" +
    "var c=b?Ia(b.a(a)):a.a;return c?c.localName||c.nodeName.toLowerCas" +
    "e():\"\"},0,1,!0);T(\"name\",3,!1,!0,function(a,b){var c=b?Ia(b.a(a)):" +
    "a.a;return c?c.nodeName.toLowerCase():\"\"},0,1,!0);T(\"namespace-uri" +
    "\",3,!0,!1,k(\"\"),0,1,!0);T(\"normalize-space\",3,!1,!0,function(a,b){" +
    "return(b?O(b,a):D(a.a)).replace(/[\\s\\xa0]+/g,\" \").replace(/^\\s+|\\s" +
    "+$/g,\"\")},0,1);\nT(\"not\",2,!1,!1,function(a,b){return!P(b,a)},1);T(" +
    "\"number\",1,!1,!0,function(a,b){return b?N(b,a):+D(a.a)},0,1);T(\"po" +
    "sition\",1,!0,!1,function(a){return a.b},0);T(\"round\",1,!1,!1,funct" +
    "ion(a,b){return Math.round(N(b,a))},1);T(\"starts-with\",2,!1,!1,fun" +
    "ction(a,b,c){b=O(b,a);a=O(c,a);return 0==b.lastIndexOf(a,0)},2);T(" +
    "\"string\",3,!1,!0,function(a,b){return b?O(b,a):D(a.a)},0,1);T(\"str" +
    "ing-length\",1,!1,!0,function(a,b){return(b?O(b,a):D(a.a)).length}," +
    "0,1);\nT(\"substring\",3,!1,!1,function(a,b,c,d){c=N(c,a);if(isNaN(c)" +
    "||Infinity==c||-Infinity==c)return\"\";d=d?N(d,a):Infinity;if(isNaN(" +
    "d)||-Infinity===d)return\"\";c=Math.round(c)-1;var e=Math.max(c,0);a" +
    "=O(b,a);if(Infinity==d)return a.substring(e);b=Math.round(d);retur" +
    "n a.substring(e,c+b)},2,3);T(\"substring-after\",3,!1,!1,function(a," +
    "b,c){b=O(b,a);a=O(c,a);c=b.indexOf(a);return-1==c?\"\":b.substring(c" +
    "+a.length)},2);\nT(\"substring-before\",3,!1,!1,function(a,b,c){b=O(b" +
    ",a);a=O(c,a);a=b.indexOf(a);return-1==a?\"\":b.substring(0,a)},2);T(" +
    "\"sum\",1,!1,!1,function(a,b){for(var c=J(b.a(a)),d=0,e=K(c);e;e=K(c" +
    "))d+=+D(e);return d},1,1,!0);T(\"translate\",3,!1,!1,function(a,b,c," +
    "d){b=O(b,a);c=O(c,a);var e=O(d,a);a=[];for(d=0;d<c.length;d++){var" +
    " f=c.charAt(d);f in a||(a[f]=e.charAt(d))}c=\"\";for(d=0;d<b.length;" +
    "d++)f=b.charAt(d),c+=f in a?a[f]:f;return c},3);T(\"true\",2,!1,!1,k" +
    "(!0),0);function I(a,b){this.h=a;this.c=void 0!==b?b:null;this.b=n" +
    "ull;switch(a){case \"comment\":this.b=8;break;case \"text\":this.b=3;b" +
    "reak;case \"processing-instruction\":this.b=7;break;case \"node\":brea" +
    "k;default:throw Error(\"Unexpected argument\");}}function Ya(a){retu" +
    "rn\"comment\"==a||\"text\"==a||\"processing-instruction\"==a||\"node\"==a}" +
    "I.prototype.a=function(a){return null===this.b||this.b==a.nodeType" +
    "};I.prototype.f=h(\"h\");I.prototype.toString=function(){var a=\"Kind" +
    " Test: \"+this.h;null===this.c||(a+=M(this.c));return a};function Z" +
    "a(a){L.call(this,3);this.c=a.substring(1,a.length-1)}n(Za,L);Za.pr" +
    "ototype.a=h(\"c\");Za.prototype.toString=function(){return\"Literal: " +
    "\"+this.c};function U(a,b){this.j=a.toLowerCase();this.b=b?b.toLowe" +
    "rCase():\"http://www.w3.org/1999/xhtml\"}U.prototype.a=function(a){v" +
    "ar b=a.nodeType;return 1!=b&&2!=b?!1:\"*\"!=this.j&&this.j!=a.nodeNa" +
    "me.toLowerCase()?!1:this.b==(a.namespaceURI?a.namespaceURI.toLower" +
    "Case():\"http://www.w3.org/1999/xhtml\")};U.prototype.f=h(\"j\");U.pro" +
    "totype.toString=function(){return\"Name Test: \"+(\"http://www.w3.org" +
    "/1999/xhtml\"==this.b?\"\":this.b+\":\")+this.j};function $a(a){L.call(" +
    "this,1);this.c=a}n($a,L);$a.prototype.a=h(\"c\");$a.prototype.toStri" +
    "ng=function(){return\"Number: \"+this.c};function ab(a,b){L.call(thi" +
    "s,a.i);this.h=a;this.c=b;this.g=a.g;this.b=a.b;if(1==this.c.length" +
    "){var c=this.c[0];c.u||c.c!=bb||(c=c.o,\"*\"!=c.f()&&(this.f={name:c" +
    ".f(),s:null}))}}n(ab,L);function V(){L.call(this,4)}n(V,L);V.proto" +
    "type.a=function(a){var b=new G;a=a.a;9==a.nodeType?H(b,a):H(b,a.ow" +
    "nerDocument);return b};V.prototype.toString=k(\"Root Helper Express" +
    "ion\");function cb(){L.call(this,4)}n(cb,L);cb.prototype.a=function" +
    "(a){var b=new G;H(b,a.a);return b};cb.prototype.toString=k(\"Contex" +
    "t Helper Expression\");\nfunction db(a){return\"/\"==a||\"//\"==a}ab.pro" +
    "totype.a=function(a){var b=this.h.a(a);if(!(b instanceof G))throw " +
    "Error(\"Filter expression must evaluate to nodeset.\");a=this.c;for(" +
    "var c=0,d=a.length;c<d&&b.l;c++){var e=a[c],f=J(b,e.c.a),g;if(e.g|" +
    "|e.c!=eb)if(e.g||e.c!=fb)for(g=K(f),b=e.a(new z(g));null!=(g=K(f))" +
    ";)g=e.a(new z(g)),b=Ga(b,g);else g=K(f),b=e.a(new z(g));else{for(g" +
    "=K(f);(b=K(f))&&(!g.contains||g.contains(b))&&b.compareDocumentPos" +
    "ition(g)&8;g=b);b=e.a(new z(g))}}return b};\nab.prototype.toString=" +
    "function(){var a;a=\"Path Expression:\"+M(this.h);if(this.c.length){" +
    "var b=v(this.c,function(a,b){return a+M(b)},\"Steps:\");a+=M(b)}retu" +
    "rn a};function gb(a,b){this.a=a;this.b=!!b}\nfunction Ua(a,b,c){for" +
    "(c=c||0;c<a.a.length;c++)for(var d=a.a[c],e=J(b),f=b.l,g,w=0;g=K(e" +
    ");w++){var p=a.b?f-w:w+1;g=d.a(new z(g,p,f));if(\"number\"==typeof g" +
    ")p=p==g;else if(\"string\"==typeof g||\"boolean\"==typeof g)p=!!g;else" +
    " if(g instanceof G)p=0<g.l;else throw Error(\"Predicate.evaluate re" +
    "turned an unexpected type.\");if(!p){p=e;g=p.f;var q=p.a;if(!q)thro" +
    "w Error(\"Next must be called at least once before remove.\");var C=" +
    "q.b,q=q.a;C?C.a=q:g.a=q;q?q.b=C:g.b=C;g.l--;p.a=null}}return b}\ngb" +
    ".prototype.toString=function(){return v(this.a,function(a,b){retur" +
    "n a+M(b)},\"Predicates:\")};function W(a,b,c,d){L.call(this,4);this." +
    "c=a;this.o=b;this.h=c||new gb([]);this.u=!!d;b=this.h;b=0<b.a.leng" +
    "th?b.a[0].f:null;a.b&&b&&(this.f={name:b.name,s:b.s});a:{a=this.h;" +
    "for(b=0;b<a.a.length;b++)if(c=a.a[b],c.g||1==c.i||0==c.i){a=!0;bre" +
    "ak a}a=!1}this.g=a}n(W,L);\nW.prototype.a=function(a){var b=a.a,c=n" +
    "ull,c=this.f,d=null,e=null,f=0;c&&(d=c.name,e=c.s?O(c.s,a):null,f=" +
    "1);if(this.u)if(this.g||this.c!=hb)if(a=J((new W(ib,new I(\"node\"))" +
    ").a(a)),b=K(a))for(c=this.m(b,d,e,f);null!=(b=K(a));)c=Ga(c,this.m" +
    "(b,d,e,f));else c=new G;else c=F(this.o,b,d,e),c=Ua(this.h,c,f);el" +
    "se c=this.m(a.a,d,e,f);return c};W.prototype.m=function(a,b,c,d){a" +
    "=this.c.f(this.o,a,b,c);return a=Ua(this.h,a,d)};\nW.prototype.toSt" +
    "ring=function(){var a;a=\"Step:\"+M(\"Operator: \"+(this.u?\"//\":\"/\"));" +
    "this.c.j&&(a+=M(\"Axis: \"+this.c));a+=M(this.o);if(this.h.a.length)" +
    "{var b=v(this.h.a,function(a,b){return a+M(b)},\"Predicates:\");a+=M" +
    "(b)}return a};function jb(a,b,c,d){this.j=a;this.f=b;this.a=c;this" +
    ".b=d}jb.prototype.toString=h(\"j\");var kb={};function X(a,b,c,d){if" +
    "(kb.hasOwnProperty(a))throw Error(\"Axis already created: \"+a);b=ne" +
    "w jb(a,b,c,!!d);return kb[a]=b}\nX(\"ancestor\",function(a,b){for(var" +
    " c=new G,d=b;d=d.parentNode;)a.a(d)&&Ha(c,d);return c},!0);X(\"ance" +
    "stor-or-self\",function(a,b){var c=new G,d=b;do a.a(d)&&Ha(c,d);whi" +
    "le(d=d.parentNode);return c},!0);var bb=X(\"attribute\",function(a,b" +
    "){var c=new G,d=a.f(),e=b.attributes;if(e)if(a instanceof I&&null=" +
    "==a.b||\"*\"==d)for(var d=0,f;f=e[d];d++)H(c,f);else(f=e.getNamedIte" +
    "m(d))&&H(c,f);return c},!1),hb=X(\"child\",function(a,b,c,d,e){retur" +
    "n Ea.call(null,a,b,m(c)?c:null,m(d)?d:null,e||new G)},!1,!0);\nX(\"d" +
    "escendant\",F,!1,!0);var ib=X(\"descendant-or-self\",function(a,b,c,d" +
    "){var e=new G;E(b,c,d)&&a.a(b)&&H(e,b);return F(a,b,c,d,e)},!1,!0)" +
    ",eb=X(\"following\",function(a,b,c,d){var e=new G;do for(var f=b;f=f" +
    ".nextSibling;)E(f,c,d)&&a.a(f)&&H(e,f),e=F(a,f,c,d,e);while(b=b.pa" +
    "rentNode);return e},!1,!0);X(\"following-sibling\",function(a,b){for" +
    "(var c=new G,d=b;d=d.nextSibling;)a.a(d)&&H(c,d);return c},!1);X(\"" +
    "namespace\",function(){return new G},!1);\nvar lb=X(\"parent\",functio" +
    "n(a,b){var c=new G;if(9==b.nodeType)return c;if(2==b.nodeType)retu" +
    "rn H(c,b.ownerElement),c;var d=b.parentNode;a.a(d)&&H(c,d);return " +
    "c},!1),fb=X(\"preceding\",function(a,b,c,d){var e=new G,f=[];do f.un" +
    "shift(b);while(b=b.parentNode);for(var g=1,w=f.length;g<w;g++){var" +
    " p=[];for(b=f[g];b=b.previousSibling;)p.unshift(b);for(var q=0,C=p" +
    ".length;q<C;q++)b=p[q],E(b,c,d)&&a.a(b)&&H(e,b),e=F(a,b,c,d,e)}ret" +
    "urn e},!0,!0);\nX(\"preceding-sibling\",function(a,b){for(var c=new G" +
    ",d=b;d=d.previousSibling;)a.a(d)&&Ha(c,d);return c},!0);var mb=X(\"" +
    "self\",function(a,b){var c=new G;a.a(b)&&H(c,b);return c},!1);funct" +
    "ion nb(a){L.call(this,1);this.c=a;this.g=a.g;this.b=a.b}n(nb,L);nb" +
    ".prototype.a=function(a){return-N(this.c,a)};nb.prototype.toString" +
    "=function(){return\"Unary Expression: -\"+M(this.c)};function ob(a){" +
    "L.call(this,4);this.c=a;Oa(this,x(this.c,function(a){return a.g}))" +
    ";Pa(this,x(this.c,function(a){return a.b}))}n(ob,L);ob.prototype.a" +
    "=function(a){var b=new G;u(this.c,function(c){c=c.a(a);if(!(c inst" +
    "anceof G))throw Error(\"Path expression must evaluate to NodeSet.\")" +
    ";b=Ga(b,c)});return b};ob.prototype.toString=function(){return v(t" +
    "his.c,function(a,b){return a+M(b)},\"Union Expression:\")};function " +
    "pb(a,b){this.a=a;this.b=b}function qb(a){for(var b,c=[];;){Y(a,\"Mi" +
    "ssing right hand side of binary expression.\");b=rb(a);var d=B(a.a)" +
    ";if(!d)break;var e=(d=Sa[d]||null)&&d.w;if(!e){a.a.a--;break}for(;" +
    "c.length&&e<=c[c.length-1].w;)b=new Q(c.pop(),c.pop(),b);c.push(b," +
    "d)}for(;c.length;)b=new Q(c.pop(),c.pop(),b);return b}function Y(a" +
    ",b){if(Ba(a.a))throw Error(b);}function sb(a,b){var c=B(a.a);if(c!" +
    "=b)throw Error(\"Bad token, expected: \"+b+\" got: \"+c);}\nfunction tb" +
    "(a){a=B(a.a);if(\")\"!=a)throw Error(\"Bad token: \"+a);}function ub(a" +
    "){a=B(a.a);if(2>a.length)throw Error(\"Unclosed literal string\");re" +
    "turn new Za(a)}function vb(a){var b=B(a.a),c=b.indexOf(\":\");if(-1=" +
    "=c)return new U(b);var d=b.substring(0,c);a=a.b(d);if(!a)throw Err" +
    "or(\"Namespace prefix not declared: \"+d);b=b.substr(c+1);return new" +
    " U(b,a)}\nfunction wb(a){var b,c=[],d;if(db(A(a.a))){b=B(a.a);d=A(a" +
    ".a);if(\"/\"==b&&(Ba(a.a)||\".\"!=d&&\"..\"!=d&&\"@\"!=d&&\"*\"!=d&&!/(?![0-" +
    "9])[\\w]/.test(d)))return new V;d=new V;Y(a,\"Missing next location " +
    "step.\");b=xb(a,b);c.push(b)}else{a:{b=A(a.a);d=b.charAt(0);switch(" +
    "d){case \"$\":throw Error(\"Variable reference not allowed in HTML XP" +
    "ath\");case \"(\":B(a.a);b=qb(a);Y(a,'unclosed \"(\"');sb(a,\")\");break;" +
    "case '\"':case \"'\":b=ub(a);break;default:if(isNaN(+b))if(!Ya(b)&&/(" +
    "?![0-9])[\\w]/.test(d)&&\"(\"==A(a.a,1)){b=B(a.a);b=\nXa[b]||null;B(a." +
    "a);for(d=[];\")\"!=A(a.a);){Y(a,\"Missing function argument list.\");d" +
    ".push(qb(a));if(\",\"!=A(a.a))break;B(a.a)}Y(a,\"Unclosed function ar" +
    "gument list.\");tb(a);b=new Va(b,d)}else{b=null;break a}else b=new " +
    "$a(+B(a.a))}\"[\"==A(a.a)&&(d=new gb(yb(a)),b=new Ta(b,d))}if(b)if(d" +
    "b(A(a.a)))d=b;else return b;else b=xb(a,\"/\"),d=new cb,c.push(b)}fo" +
    "r(;db(A(a.a));)b=B(a.a),Y(a,\"Missing next location step.\"),b=xb(a," +
    "b),c.push(b);return new ab(d,c)}\nfunction xb(a,b){var c,d,e;if(\"/\"" +
    "!=b&&\"//\"!=b)throw Error('Step op should be \"/\" or \"//\"');if(\".\"==" +
    "A(a.a))return d=new W(mb,new I(\"node\")),B(a.a),d;if(\"..\"==A(a.a))r" +
    "eturn d=new W(lb,new I(\"node\")),B(a.a),d;var f;if(\"@\"==A(a.a))f=bb" +
    ",B(a.a),Y(a,\"Missing attribute name\");else if(\"::\"==A(a.a,1)){if(!" +
    "/(?![0-9])[\\w]/.test(A(a.a).charAt(0)))throw Error(\"Bad token: \"+B" +
    "(a.a));c=B(a.a);f=kb[c]||null;if(!f)throw Error(\"No axis with name" +
    ": \"+c);B(a.a);Y(a,\"Missing node name\")}else f=hb;c=A(a.a);if(/(?![" +
    "0-9])[\\w]/.test(c.charAt(0)))if(\"(\"==\nA(a.a,1)){if(!Ya(c))throw Er" +
    "ror(\"Invalid node type: \"+c);c=B(a.a);if(!Ya(c))throw Error(\"Inval" +
    "id type name: \"+c);sb(a,\"(\");Y(a,\"Bad nodetype\");e=A(a.a).charAt(0" +
    ");var g=null;if('\"'==e||\"'\"==e)g=ub(a);Y(a,\"Bad nodetype\");tb(a);c" +
    "=new I(c,g)}else c=vb(a);else if(\"*\"==c)c=vb(a);else throw Error(\"" +
    "Bad token: \"+B(a.a));e=new gb(yb(a),f.a);return d||new W(f,c,e,\"//" +
    "\"==b)}\nfunction yb(a){for(var b=[];\"[\"==A(a.a);){B(a.a);Y(a,\"Missi" +
    "ng predicate expression.\");var c=qb(a);b.push(c);Y(a,\"Unclosed pre" +
    "dicate expression.\");sb(a,\"]\")}return b}function rb(a){if(\"-\"==A(a" +
    ".a))return B(a.a),new nb(rb(a));var b=wb(a);if(\"|\"!=A(a.a))a=b;els" +
    "e{for(b=[b];\"|\"==B(a.a);)Y(a,\"Missing next union location path.\")," +
    "b.push(wb(a));a.a.a--;a=new ob(b)}return a};function zb(a,b){if(!a" +
    ".length)throw Error(\"Empty XPath expression.\");var c=ya(a);if(Ba(c" +
    "))throw Error(\"Invalid XPath expression.\");b?\"function\"==ba(b)||(b" +
    "=ea(b.lookupNamespaceURI,b)):b=k(null);var d=qb(new pb(c,b));if(!B" +
    "a(c))throw Error(\"Bad token: \"+B(c));this.evaluate=function(a,b){v" +
    "ar c=d.a(new z(a));return new Z(c,b)}}\nfunction Z(a,b){if(0==b)if(" +
    "a instanceof G)b=4;else if(\"string\"==typeof a)b=2;else if(\"number\"" +
    "==typeof a)b=1;else if(\"boolean\"==typeof a)b=3;else throw Error(\"U" +
    "nexpected evaluation result.\");if(2!=b&&1!=b&&3!=b&&!(a instanceof" +
    " G))throw Error(\"value could not be converted to the specified typ" +
    "e\");this.resultType=b;var c;switch(b){case 2:this.stringValue=a in" +
    "stanceof G?Ja(a):\"\"+a;break;case 1:this.numberValue=a instanceof G" +
    "?+Ja(a):+a;break;case 3:this.booleanValue=a instanceof G?0<a.l:!!a" +
    ";break;case 4:case 5:case 6:case 7:var d=\nJ(a);c=[];for(var e=K(d)" +
    ";e;e=K(d))c.push(e);this.snapshotLength=a.l;this.invalidIteratorSt" +
    "ate=!1;break;case 8:case 9:this.singleNodeValue=Ia(a);break;defaul" +
    "t:throw Error(\"Unknown XPathResult type.\");}var f=0;this.iterateNe" +
    "xt=function(){if(4!=b&&5!=b)throw Error(\"iterateNext called with w" +
    "rong result type\");return f>=c.length?null:c[f++]};this.snapshotIt" +
    "em=function(a){if(6!=b&&7!=b)throw Error(\"snapshotItem called with" +
    " wrong result type\");return a>=c.length||0>a?null:c[a]}}Z.ANY_TYPE" +
    "=0;\nZ.NUMBER_TYPE=1;Z.STRING_TYPE=2;Z.BOOLEAN_TYPE=3;Z.UNORDERED_N" +
    "ODE_ITERATOR_TYPE=4;Z.ORDERED_NODE_ITERATOR_TYPE=5;Z.UNORDERED_NOD" +
    "E_SNAPSHOT_TYPE=6;Z.ORDERED_NODE_SNAPSHOT_TYPE=7;Z.ANY_UNORDERED_N" +
    "ODE_TYPE=8;Z.FIRST_ORDERED_NODE_TYPE=9;function Ab(a){this.lookupN" +
    "amespaceURI=La(a)}aa(\"wgxpath.install\",function(a){a=a||l;var b=a." +
    "document;b.evaluate||(a.XPathResult=Z,b.evaluate=function(a,b,e,f)" +
    "{return(new zb(a,e)).evaluate(b,f)},b.createExpression=function(a," +
    "b){return new zb(a,b)},b.createNSResolver=function(a){return new A" +
    "b(a)})});aa(\"_\",function(){return document.activeElement||document" +
    ".body});;return this._.apply(null,arguments);}).apply({navigator:t"
  )
      .append(
    "ypeof window!=\"undefined\"?window.navigator:null},arguments);}\n"
  )
  .toString();
  static final String ACTIVE_ELEMENT_ANDROID_license =
    "\n\n Copyright 2014 Software Freedom Conservancy\n\n Licensed under th" +
    "e Apache License, Version 2.0 (the \"License\");\n you may not use th" +
    "is file except in compliance with the License.\n You may obtain a c" +
    "opy of the License at\n\n      http://www.apache.org/licenses/LICENS" +
    "E-2.0\n\n Unless required by applicable law or agreed to in writing," +
    " software\n distributed under the License is distributed on an \"AS " +
    "IS\" BASIS,\n WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either e" +
    "xpress or implied.\n See the License for the specific language gove" +
    "rning permissions and\n limitations under the License.\n";
  private static final String ACTIVE_ELEMENT_ANDROID_original() {
    return ACTIVE_ELEMENT_ANDROID.replaceAll("xxx_rpl_lic", ACTIVE_ELEMENT_ANDROID_license);
  }

/* field: FRAME_BY_ID_OR_NAME_ANDROID license: 

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
  static final String FRAME_BY_ID_OR_NAME_ANDROID =
  new StringBuilder(
    "function(){return(function(){function l(a){return function(){retur" +
    "n this[a]}}function n(a){return function(){return a}}var aa=this;f" +
    "unction q(a){return void 0!==a}function ba(a,b){var c=a.split(\".\")" +
    ",d=aa;c[0]in d||!d.execScript||d.execScript(\"var \"+c[0]);for(var e" +
    ";c.length&&(e=c.shift());)!c.length&&q(b)?d[e]=b:d[e]?d=d[e]:d=d[e" +
    "]={}}\nfunction ca(a){var b=typeof a;if(\"object\"==b)if(a){if(a inst" +
    "anceof Array)return\"array\";if(a instanceof Object)return b;var c=O" +
    "bject.prototype.toString.call(a);if(\"[object Window]\"==c)return\"ob" +
    "ject\";if(\"[object Array]\"==c||\"number\"==typeof a.length&&\"undefine" +
    "d\"!=typeof a.splice&&\"undefined\"!=typeof a.propertyIsEnumerable&&!" +
    "a.propertyIsEnumerable(\"splice\"))return\"array\";if(\"[object Functio" +
    "n]\"==c||\"undefined\"!=typeof a.call&&\"undefined\"!=typeof a.property" +
    "IsEnumerable&&!a.propertyIsEnumerable(\"call\"))return\"function\"}els" +
    "e return\"null\";\nelse if(\"function\"==b&&\"undefined\"==typeof a.call)" +
    "return\"object\";return b}function r(a){return\"string\"==typeof a}fun" +
    "ction da(a){return\"function\"==ca(a)}function ea(a,b,c){return a.ca" +
    "ll.apply(a.bind,arguments)}function fa(a,b,c){if(!a)throw Error();" +
    "if(2<arguments.length){var d=Array.prototype.slice.call(arguments," +
    "2);return function(){var c=Array.prototype.slice.call(arguments);A" +
    "rray.prototype.unshift.apply(c,d);return a.apply(b,c)}}return func" +
    "tion(){return a.apply(b,arguments)}}\nfunction ga(a,b,c){ga=Functio" +
    "n.prototype.bind&&-1!=Function.prototype.bind.toString().indexOf(\"" +
    "native code\")?ea:fa;return ga.apply(null,arguments)}function ha(a," +
    "b){var c=Array.prototype.slice.call(arguments,1);return function()" +
    "{var b=c.slice();b.push.apply(b,arguments);return a.apply(this,b)}" +
    "}\nfunction t(a,b){function c(){}c.prototype=b.prototype;a.P=b.prot" +
    "otype;a.prototype=new c;a.prototype.constructor=a;a.O=function(a,c" +
    ",f){for(var g=Array(arguments.length-2),k=2;k<arguments.length;k++" +
    ")g[k-2]=arguments[k];return b.prototype[c].apply(a,g)}};function i" +
    "a(a){if(Error.captureStackTrace)Error.captureStackTrace(this,ia);e" +
    "lse{var b=Error().stack;b&&(this.stack=b)}a&&(this.message=String(" +
    "a))}t(ia,Error);ia.prototype.name=\"CustomError\";var ja;function ka" +
    "(a){var b=a.length-1;return 0<=b&&a.indexOf(\" \",b)==b}function la(" +
    "a,b){for(var c=a.split(\"%s\"),d=\"\",e=Array.prototype.slice.call(arg" +
    "uments,1);e.length&&1<c.length;)d+=c.shift()+e.shift();return d+c." +
    "join(\"%s\")}var ma=String.prototype.trim?function(a){return a.trim(" +
    ")}:function(a){return a.replace(/^[\\s\\xa0]+|[\\s\\xa0]+$/g,\"\")};func" +
    "tion na(a,b){return a<b?-1:a>b?1:0}function oa(a){return String(a)" +
    ".replace(/\\-([a-z])/g,function(a,c){return c.toUpperCase()})};func" +
    "tion pa(a,b){b.unshift(a);ia.call(this,la.apply(null,b));b.shift()" +
    "}t(pa,ia);pa.prototype.name=\"AssertionError\";function qa(a,b,c){if" +
    "(!a){var d=\"Assertion failed\";if(b)var d=d+(\": \"+b),e=Array.protot" +
    "ype.slice.call(arguments,2);throw new pa(\"\"+d,e||[]);}};var ra=Arr" +
    "ay.prototype;function sa(a,b){if(r(a))return r(b)&&1==b.length?a.i" +
    "ndexOf(b,0):-1;for(var c=0;c<a.length;c++)if(c in a&&a[c]===b)retu" +
    "rn c;return-1}function u(a,b){for(var c=a.length,d=r(a)?a.split(\"\"" +
    "):a,e=0;e<c;e++)e in d&&b.call(void 0,d[e],e,a)}function ta(a,b){f" +
    "or(var c=a.length,d=[],e=0,f=r(a)?a.split(\"\"):a,g=0;g<c;g++)if(g i" +
    "n f){var k=f[g];b.call(void 0,k,g,a)&&(d[e++]=k)}return d}function" +
    " ua(a,b,c){var d=c;u(a,function(c,f){d=b.call(void 0,d,c,f,a)});re" +
    "turn d}\nfunction va(a,b){for(var c=a.length,d=r(a)?a.split(\"\"):a,e" +
    "=0;e<c;e++)if(e in d&&b.call(void 0,d[e],e,a))return!0;return!1}fu" +
    "nction wa(a,b){for(var c=a.length,d=r(a)?a.split(\"\"):a,e=0;e<c;e++" +
    ")if(e in d&&!b.call(void 0,d[e],e,a))return!1;return!0}function xa" +
    "(a,b){var c;a:{c=a.length;for(var d=r(a)?a.split(\"\"):a,e=0;e<c;e++" +
    ")if(e in d&&b.call(void 0,d[e],e,a)){c=e;break a}c=-1}return 0>c?n" +
    "ull:r(a)?a.charAt(c):a[c]}function ya(a){return ra.concat.apply(ra" +
    ",arguments)}\nfunction za(a,b,c){qa(null!=a.length);return 2>=argum" +
    "ents.length?ra.slice.call(a,b):ra.slice.call(a,b,c)};function v(a," +
    "b){this.x=q(a)?a:0;this.y=q(b)?b:0}v.prototype.clone=function(){re" +
    "turn new v(this.x,this.y)};v.prototype.toString=function(){return\"" +
    "(\"+this.x+\", \"+this.y+\")\"};v.prototype.ceil=function(){this.x=Math" +
    ".ceil(this.x);this.y=Math.ceil(this.y);return this};v.prototype.fl" +
    "oor=function(){this.x=Math.floor(this.x);this.y=Math.floor(this.y)" +
    ";return this};v.prototype.round=function(){this.x=Math.round(this." +
    "x);this.y=Math.round(this.y);return this};function Aa(a,b){this.wi" +
    "dth=a;this.height=b}Aa.prototype.clone=function(){return new Aa(th" +
    "is.width,this.height)};Aa.prototype.toString=function(){return\"(\"+" +
    "this.width+\" x \"+this.height+\")\"};Aa.prototype.ceil=function(){thi" +
    "s.width=Math.ceil(this.width);this.height=Math.ceil(this.height);r" +
    "eturn this};Aa.prototype.floor=function(){this.width=Math.floor(th" +
    "is.width);this.height=Math.floor(this.height);return this};\nAa.pro" +
    "totype.round=function(){this.width=Math.round(this.width);this.hei" +
    "ght=Math.round(this.height);return this};var Ba;a:{var Ca=aa.navig" +
    "ator;if(Ca){var Da=Ca.userAgent;if(Da){Ba=Da;break a}}Ba=\"\"};funct" +
    "ion w(a){return a?new Ea(x(a)):ja||(ja=new Ea)}function Fa(a){retu" +
    "rn a?a.parentWindow||a.defaultView:window}function Ga(a){for(;a&&1" +
    "!=a.nodeType;)a=a.previousSibling;return a}function Ha(a,b){if(a.c" +
    "ontains&&1==b.nodeType)return a==b||a.contains(b);if(\"undefined\"!=" +
    "typeof a.compareDocumentPosition)return a==b||Boolean(a.compareDoc" +
    "umentPosition(b)&16);for(;b&&a!=b;)b=b.parentNode;return b==a}\nfun" +
    "ction Ia(a,b){if(a==b)return 0;if(a.compareDocumentPosition)return" +
    " a.compareDocumentPosition(b)&2?1:-1;if(\"sourceIndex\"in a||a.paren" +
    "tNode&&\"sourceIndex\"in a.parentNode){var c=1==a.nodeType,d=1==b.no" +
    "deType;if(c&&d)return a.sourceIndex-b.sourceIndex;var e=a.parentNo" +
    "de,f=b.parentNode;return e==f?Ja(a,b):!c&&Ha(e,b)?-1*Ka(a,b):!d&&H" +
    "a(f,a)?Ka(b,a):(c?a.sourceIndex:e.sourceIndex)-(d?b.sourceIndex:f." +
    "sourceIndex)}d=x(a);c=d.createRange();c.selectNode(a);c.collapse(!" +
    "0);d=d.createRange();d.selectNode(b);\nd.collapse(!0);return c.comp" +
    "areBoundaryPoints(aa.Range.START_TO_END,d)}function Ka(a,b){var c=" +
    "a.parentNode;if(c==b)return-1;for(var d=b;d.parentNode!=c;)d=d.par" +
    "entNode;return Ja(d,a)}function Ja(a,b){for(var c=b;c=c.previousSi" +
    "bling;)if(c==a)return-1;return 1}function x(a){qa(a,\"Node cannot b" +
    "e null or undefined.\");return 9==a.nodeType?a:a.ownerDocument||a.d" +
    "ocument}function La(a,b){a=a.parentNode;for(var c=0;a;){qa(\"parent" +
    "Node\"!=a.name);if(b(a))return a;a=a.parentNode;c++}return null}\nfu" +
    "nction Ea(a){this.a=a||aa.document||document}\nfunction y(a,b,c,d){" +
    "a=d||a.a;var e=b&&\"*\"!=b?b.toUpperCase():\"\";if(a.querySelectorAll&" +
    "&a.querySelector&&(e||c))c=a.querySelectorAll(e+(c?\".\"+c:\"\"));else" +
    " if(c&&a.getElementsByClassName)if(b=a.getElementsByClassName(c),e" +
    "){a={};for(var f=d=0,g;g=b[f];f++)e==g.nodeName&&(a[d++]=g);a.leng" +
    "th=d;c=a}else c=b;else if(b=a.getElementsByTagName(e||\"*\"),c){a={}" +
    ";for(f=d=0;g=b[f];f++){var e=g.className,k;if(k=\"function\"==typeof" +
    " e.split)k=0<=sa(e.split(/\\s+/),c);k&&(a[d++]=g)}a.length=d;c=a}el" +
    "se c=b;return c};/*xxx_rpl_lic*/\nvar Ma=window;function z(a,b){thi" +
    "s.a=Na[a]||\"unknown error\";this.message=b||\"\";var c=this.a.replace" +
    "(/((?:^|\\s+)[a-z])/g,function(a){return a.toUpperCase().replace(/^" +
    "[\\s\\xa0]+/g,\"\")}),d=c.length-5;if(0>d||c.indexOf(\"Error\",d)!=d)c+=" +
    "\"Error\";this.name=c;c=Error(this.message);c.name=this.name;this.st" +
    "ack=c.stack||\"\"}t(z,Error);\nvar Na={15:\"element not selectable\",11" +
    ":\"element not visible\",31:\"unknown error\",30:\"unknown error\",24:\"i" +
    "nvalid cookie domain\",29:\"invalid element coordinates\",12:\"invalid" +
    " element state\",32:\"invalid selector\",51:\"invalid selector\",52:\"in" +
    "valid selector\",17:\"javascript error\",405:\"unsupported operation\"," +
    "34:\"move target out of bounds\",27:\"no such alert\",7:\"no such eleme" +
    "nt\",8:\"no such frame\",23:\"no such window\",28:\"script timeout\",33:\"" +
    "session not created\",10:\"stale element reference\",21:\"timeout\",25:" +
    "\"unable to set cookie\",\n26:\"unexpected alert open\",13:\"unknown err" +
    "or\",9:\"unknown command\"};z.prototype.toString=function(){return th" +
    "is.name+\": \"+this.message};var Oa={w:function(a){return!(!a.queryS" +
    "electorAll||!a.querySelector)},s:function(a,b){if(!a)throw new z(3" +
    "2,\"No class name specified\");a=ma(a);if(-1!==a.indexOf(\" \"))throw " +
    "new z(32,\"Compound class names not permitted\");if(Oa.w(b))try{retu" +
    "rn b.querySelector(\".\"+a.replace(/\\./g,\"\\\\.\"))||null}catch(c){thro" +
    "w new z(32,\"An invalid or illegal class name was specified\");}var " +
    "d=y(w(b),\"*\",a,b);return d.length?d[0]:null},m:function(a,b){if(!a" +
    ")throw new z(32,\"No class name specified\");a=ma(a);if(-1!==a.index" +
    "Of(\" \"))throw new z(32,\n\"Compound class names not permitted\");if(O" +
    "a.w(b))try{return b.querySelectorAll(\".\"+a.replace(/\\./g,\"\\\\.\"))}c" +
    "atch(c){throw new z(32,\"An invalid or illegal class name was speci" +
    "fied\");}return y(w(b),\"*\",a,b)}};function Pa(a){return(a=a.exec(Ba" +
    "))?a[1]:\"\"}Pa(/Android\\s+([0-9.]+)/)||Pa(/Version\\/([0-9.]+)/);fun" +
    "ction Qa(a){var b=0,c=ma(String(Ra)).split(\".\");a=ma(String(a)).sp" +
    "lit(\".\");for(var d=Math.max(c.length,a.length),e=0;0==b&&e<d;e++){" +
    "var f=c[e]||\"\",g=a[e]||\"\",k=RegExp(\"(\\\\d*)(\\\\D*)\",\"g\"),p=RegExp(\"(" +
    "\\\\d*)(\\\\D*)\",\"g\");do{var m=k.exec(f)||[\"\",\"\",\"\"],h=p.exec(g)||[\"\"," +
    "\"\",\"\"];if(0==m[0].length&&0==h[0].length)break;b=na(0==m[1].length" +
    "?0:parseInt(m[1],10),0==h[1].length?0:parseInt(h[1],10))||na(0==m[" +
    "2].length,0==h[2].length)||na(m[2],h[2])}while(0==b)}}\nvar Sa=/And" +
    "roid\\s+([0-9\\.]+)/.exec(Ba),Ra=Sa?Sa[1]:\"0\";Qa(2.3);Qa(4);var Ta={" +
    "s:function(a,b){da(b.querySelector);if(!a)throw new z(32,\"No selec" +
    "tor specified\");a=ma(a);var c;try{c=b.querySelector(a)}catch(d){th" +
    "row new z(32,\"An invalid or illegal selector was specified\");}retu" +
    "rn c&&1==c.nodeType?c:null},m:function(a,b){da(b.querySelectorAll)" +
    ";if(!a)throw new z(32,\"No selector specified\");a=ma(a);try{return " +
    "b.querySelectorAll(a)}catch(c){throw new z(32,\"An invalid or illeg" +
    "al selector was specified\");}}};function Ua(a,b,c,d){this.top=a;th" +
    "is.right=b;this.bottom=c;this.left=d}Ua.prototype.clone=function()" +
    "{return new Ua(this.top,this.right,this.bottom,this.left)};Ua.prot" +
    "otype.toString=function(){return\"(\"+this.top+\"t, \"+this.right+\"r, " +
    "\"+this.bottom+\"b, \"+this.left+\"l)\"};Ua.prototype.ceil=function(){t" +
    "his.top=Math.ceil(this.top);this.right=Math.ceil(this.right);this." +
    "bottom=Math.ceil(this.bottom);this.left=Math.ceil(this.left);retur" +
    "n this};\nUa.prototype.floor=function(){this.top=Math.floor(this.to" +
    "p);this.right=Math.floor(this.right);this.bottom=Math.floor(this.b" +
    "ottom);this.left=Math.floor(this.left);return this};Ua.prototype.r" +
    "ound=function(){this.top=Math.round(this.top);this.right=Math.roun" +
    "d(this.right);this.bottom=Math.round(this.bottom);this.left=Math.r" +
    "ound(this.left);return this};function A(a,b,c,d){this.left=a;this." +
    "top=b;this.width=c;this.height=d}A.prototype.clone=function(){retu" +
    "rn new A(this.left,this.top,this.width,this.height)};A.prototype.t" +
    "oString=function(){return\"(\"+this.left+\", \"+this.top+\" - \"+this.wi" +
    "dth+\"w x \"+this.height+\"h)\"};A.prototype.ceil=function(){this.left" +
    "=Math.ceil(this.left);this.top=Math.ceil(this.top);this.width=Math" +
    ".ceil(this.width);this.height=Math.ceil(this.height);return this};" +
    "\nA.prototype.floor=function(){this.left=Math.floor(this.left);this" +
    ".top=Math.floor(this.top);this.width=Math.floor(this.width);this.h" +
    "eight=Math.floor(this.height);return this};A.prototype.round=funct" +
    "ion(){this.left=Math.round(this.left);this.top=Math.round(this.top" +
    ");this.width=Math.round(this.width);this.height=Math.round(this.he" +
    "ight);return this};/*\n\n The MIT License\n\n Copyright (c) 2007 Cyboz" +
    "u Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is hereb" +
    "y granted, free of charge, to any person obtaining a copy\n of this" +
    " software and associated documentation files (the \"Software\"), to\n" +
    " deal in the Software without restriction, including without limit" +
    "ation the\n rights to use, copy, modify, merge, publish, distribute" +
    ", sublicense, and/or\n sell copies of the Software, and to permit p" +
    "ersons to whom the Software is\n furnished to do so, subject to the" +
    " following conditions:\n\n The above copyright notice and this permi" +
    "ssion notice shall be included in\n all copies or substantial porti" +
    "ons of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT W" +
    "ARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITE" +
    "D TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR " +
    "PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COP" +
    "YRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILIT" +
    "Y, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n F" +
    "ROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER" +
    " DEALINGS\n IN THE SOFTWARE.\n*/\nfunction Va(a,b,c){this.a=a;this.b=" +
    "b||1;this.f=c||1};function Wa(a){this.b=a;this.a=0}function Xa(a){" +
    "a=a.match(Ya);for(var b=0;b<a.length;b++)Za.test(a[b])&&a.splice(b" +
    ",1);return new Wa(a)}var Ya=RegExp(\"\\\\$?(?:(?![0-9-])[\\\\w-]+:)?(?!" +
    "[0-9-])[\\\\w-]+|\\\\/\\\\/|\\\\.\\\\.|::|\\\\d+(?:\\\\.\\\\d*)?|\\\\.\\\\d+|\\\"[^\\\"]*\\" +
    "\"|'[^']*'|[!<>]=|\\\\s+|.\",\"g\"),Za=/^\\s/;function C(a,b){return a.b[" +
    "a.a+(b||0)]}function D(a){return a.b[a.a++]}function $a(a){return " +
    "a.b.length<=a.a};function E(a){var b=null,c=a.nodeType;1==c&&(b=a." +
    "textContent,b=void 0==b||null==b?a.innerText:b,b=void 0==b||null==" +
    "b?\"\":b);if(\"string\"!=typeof b)if(9==c||1==c){a=9==c?a.documentElem" +
    "ent:a.firstChild;for(var c=0,d=[],b=\"\";a;){do 1!=a.nodeType&&(b+=a" +
    ".nodeValue),d[c++]=a;while(a=a.firstChild);for(;c&&!(a=d[--c].next" +
    "Sibling););}}else b=a.nodeValue;return\"\"+b}\nfunction ab(a,b,c){if(" +
    "null===b)return!0;try{if(!a.getAttribute)return!1}catch(d){return!" +
    "1}return null==c?!!a.getAttribute(b):a.getAttribute(b,2)==c}functi" +
    "on bb(a,b,c,d,e){return cb.call(null,a,b,r(c)?c:null,r(d)?d:null,e" +
    "||new F)}\nfunction cb(a,b,c,d,e){b.getElementsByName&&d&&\"name\"==c" +
    "?(b=b.getElementsByName(d),u(b,function(b){a.a(b)&&G(e,b)})):b.get" +
    "ElementsByClassName&&d&&\"class\"==c?(b=b.getElementsByClassName(d)," +
    "u(b,function(b){b.className==d&&a.a(b)&&G(e,b)})):a instanceof H?d" +
    "b(a,b,c,d,e):b.getElementsByTagName&&(b=b.getElementsByTagName(a.f" +
    "()),u(b,function(a){ab(a,c,d)&&G(e,a)}));return e}function eb(a,b," +
    "c,d,e){for(b=b.firstChild;b;b=b.nextSibling)ab(b,c,d)&&a.a(b)&&G(e" +
    ",b);return e}\nfunction db(a,b,c,d,e){for(b=b.firstChild;b;b=b.next" +
    "Sibling)ab(b,c,d)&&a.a(b)&&G(e,b),db(a,b,c,d,e)};function F(){this" +
    ".b=this.a=null;this.l=0}function fb(a){this.node=a;this.a=this.b=n" +
    "ull}function gb(a,b){if(!a.a)return b;if(!b.a)return a;for(var c=a" +
    ".a,d=b.a,e=null,f=null,g=0;c&&d;)c.node==d.node?(f=c,c=c.a,d=d.a):" +
    "0<Ia(c.node,d.node)?(f=d,d=d.a):(f=c,c=c.a),(f.b=e)?e.a=f:a.a=f,e=" +
    "f,g++;for(f=c||d;f;)f.b=e,e=e.a=f,g++,f=f.a;a.b=e;a.l=g;return a}f" +
    "unction hb(a,b){var c=new fb(b);c.a=a.a;a.b?a.a.b=c:a.a=a.b=c;a.a=" +
    "c;a.l++}function G(a,b){var c=new fb(b);c.b=a.b;a.a?a.b.a=c:a.a=a." +
    "b=c;a.b=c;a.l++}\nfunction ib(a){return(a=a.a)?a.node:null}function" +
    " jb(a){return(a=ib(a))?E(a):\"\"}function I(a,b){return new kb(a,!!b" +
    ")}function kb(a,b){this.f=a;this.b=(this.c=b)?a.b:a.a;this.a=null}" +
    "function J(a){var b=a.b;if(null==b)return null;var c=a.a=b;a.b=a.c" +
    "?b.b:b.a;return c.node};function lb(a){switch(a.nodeType){case 1:r" +
    "eturn ha(mb,a);case 9:return lb(a.documentElement);case 11:case 10" +
    ":case 6:case 12:return nb;default:return a.parentNode?lb(a.parentN" +
    "ode):nb}}function nb(){return null}function mb(a,b){if(a.prefix==b" +
    ")return a.namespaceURI||\"http://www.w3.org/1999/xhtml\";var c=a.get" +
    "AttributeNode(\"xmlns:\"+b);return c&&c.specified?c.value||null:a.pa" +
    "rentNode&&9!=a.parentNode.nodeType?mb(a.parentNode,b):null};functi" +
    "on K(a){this.i=a;this.b=this.g=!1;this.f=null}function L(a){return" +
    "\"\\n  \"+a.toString().split(\"\\n\").join(\"\\n  \")}function ob(a,b){a.g=" +
    "b}function pb(a,b){a.b=b}function M(a,b){var c=a.a(b);return c ins" +
    "tanceof F?+jb(c):+c}function O(a,b){var c=a.a(b);return c instance" +
    "of F?jb(c):\"\"+c}function qb(a,b){var c=a.a(b);return c instanceof " +
    "F?!!c.l:!!c};function rb(a,b,c){K.call(this,a.i);this.c=a;this.h=b" +
    ";this.u=c;this.g=b.g||c.g;this.b=b.b||c.b;this.c==sb&&(c.b||c.g||4" +
    "==c.i||0==c.i||!b.f?b.b||b.g||4==b.i||0==b.i||!c.f||(this.f={name:" +
    "c.f.name,v:b}):this.f={name:b.f.name,v:c})}t(rb,K);\nfunction tb(a," +
    "b,c,d,e){b=b.a(d);c=c.a(d);var f;if(b instanceof F&&c instanceof F" +
    "){e=I(b);for(d=J(e);d;d=J(e))for(b=I(c),f=J(b);f;f=J(b))if(a(E(d)," +
    "E(f)))return!0;return!1}if(b instanceof F||c instanceof F){b insta" +
    "nceof F?e=b:(e=c,c=b);e=I(e);b=typeof c;for(d=J(e);d;d=J(e)){switc" +
    "h(b){case \"number\":d=+E(d);break;case \"boolean\":d=!!E(d);break;cas" +
    "e \"string\":d=E(d);break;default:throw Error(\"Illegal primitive typ" +
    "e for comparison.\");}if(a(d,c))return!0}return!1}return e?\"boolean" +
    "\"==typeof b||\"boolean\"==typeof c?\na(!!b,!!c):\"number\"==typeof b||\"" +
    "number\"==typeof c?a(+b,+c):a(b,c):a(+b,+c)}rb.prototype.a=function" +
    "(a){return this.c.o(this.h,this.u,a)};rb.prototype.toString=functi" +
    "on(){var a=\"Binary Expression: \"+this.c,a=a+L(this.h);return a+=L(" +
    "this.u)};function ub(a,b,c,d){this.a=a;this.H=b;this.i=c;this.o=d}" +
    "ub.prototype.toString=l(\"a\");var vb={};function P(a,b,c,d){if(vb.h" +
    "asOwnProperty(a))throw Error(\"Binary operator already created: \"+a" +
    ");a=new ub(a,b,c,d);return vb[a.toString()]=a}\nP(\"div\",6,1,functio" +
    "n(a,b,c){return M(a,c)/M(b,c)});P(\"mod\",6,1,function(a,b,c){return" +
    " M(a,c)%M(b,c)});P(\"*\",6,1,function(a,b,c){return M(a,c)*M(b,c)});" +
    "P(\"+\",5,1,function(a,b,c){return M(a,c)+M(b,c)});P(\"-\",5,1,functio" +
    "n(a,b,c){return M(a,c)-M(b,c)});P(\"<\",4,2,function(a,b,c){return t" +
    "b(function(a,b){return a<b},a,b,c)});P(\">\",4,2,function(a,b,c){ret" +
    "urn tb(function(a,b){return a>b},a,b,c)});P(\"<=\",4,2,function(a,b," +
    "c){return tb(function(a,b){return a<=b},a,b,c)});\nP(\">=\",4,2,funct" +
    "ion(a,b,c){return tb(function(a,b){return a>=b},a,b,c)});var sb=P(" +
    "\"=\",3,2,function(a,b,c){return tb(function(a,b){return a==b},a,b,c" +
    ",!0)});P(\"!=\",3,2,function(a,b,c){return tb(function(a,b){return a" +
    "!=b},a,b,c,!0)});P(\"and\",2,2,function(a,b,c){return qb(a,c)&&qb(b," +
    "c)});P(\"or\",1,2,function(a,b,c){return qb(a,c)||qb(b,c)});function" +
    " wb(a,b){if(b.a.length&&4!=a.i)throw Error(\"Primary expression mus" +
    "t evaluate to nodeset if filter has predicate(s).\");K.call(this,a." +
    "i);this.c=a;this.h=b;this.g=a.g;this.b=a.b}t(wb,K);wb.prototype.a=" +
    "function(a){a=this.c.a(a);return xb(this.h,a)};wb.prototype.toStri" +
    "ng=function(){var a;a=\"Filter:\"+L(this.c);return a+=L(this.h)};fun" +
    "ction yb(a,b){if(b.length<a.I)throw Error(\"Function \"+a.j+\" expect" +
    "s at least\"+a.I+\" arguments, \"+b.length+\" given\");if(null!==a.B&&b" +
    ".length>a.B)throw Error(\"Function \"+a.j+\" expects at most \"+a.B+\" " +
    "arguments, \"+b.length+\" given\");a.N&&u(b,function(b,d){if(4!=b.i)t" +
    "hrow Error(\"Argument \"+d+\" to function \"+a.j+\" is not of type Node" +
    "set: \"+b);});K.call(this,a.i);this.h=a;this.c=b;ob(this,a.g||va(b," +
    "function(a){return a.g}));pb(this,a.M&&!b.length||a.L&&!!b.length|" +
    "|va(b,function(a){return a.b}))}\nt(yb,K);yb.prototype.a=function(a" +
    "){return this.h.o.apply(null,ya(a,this.c))};yb.prototype.toString=" +
    "function(){var a=\"Function: \"+this.h;if(this.c.length)var b=ua(thi" +
    "s.c,function(a,b){return a+L(b)},\"Arguments:\"),a=a+L(b);return a};" +
    "function zb(a,b,c,d,e,f,g,k,p){this.j=a;this.i=b;this.g=c;this.M=d" +
    ";this.L=e;this.o=f;this.I=g;this.B=q(k)?k:g;this.N=!!p}zb.prototyp" +
    "e.toString=l(\"j\");var Ab={};\nfunction Q(a,b,c,d,e,f,g,k){if(Ab.has" +
    "OwnProperty(a))throw Error(\"Function already created: \"+a+\".\");Ab[" +
    "a]=new zb(a,b,c,d,!1,e,f,g,k)}Q(\"boolean\",2,!1,!1,function(a,b){re" +
    "turn qb(b,a)},1);Q(\"ceiling\",1,!1,!1,function(a,b){return Math.cei" +
    "l(M(b,a))},1);Q(\"concat\",3,!1,!1,function(a,b){var c=za(arguments," +
    "1);return ua(c,function(b,c){return b+O(c,a)},\"\")},2,null);Q(\"cont" +
    "ains\",2,!1,!1,function(a,b,c){b=O(b,a);a=O(c,a);return-1!=b.indexO" +
    "f(a)},2);Q(\"count\",1,!1,!1,function(a,b){return b.a(a).l},1,1,!0);" +
    "\nQ(\"false\",2,!1,!1,n(!1),0);Q(\"floor\",1,!1,!1,function(a,b){return" +
    " Math.floor(M(b,a))},1);Q(\"id\",4,!1,!1,function(a,b){var c=a.a,d=9" +
    "==c.nodeType?c:c.ownerDocument,c=O(b,a).split(/\\s+/),e=[];u(c,func" +
    "tion(a){a=d.getElementById(a);!a||0<=sa(e,a)||e.push(a)});e.sort(I" +
    "a);var f=new F;u(e,function(a){G(f,a)});return f},1);Q(\"lang\",2,!1" +
    ",!1,n(!1),1);Q(\"last\",1,!0,!1,function(a){if(1!=arguments.length)t" +
    "hrow Error(\"Function last expects ()\");return a.f},0);\nQ(\"local-na" +
    "me\",3,!1,!0,function(a,b){var c=b?ib(b.a(a)):a.a;return c?c.localN" +
    "ame||c.nodeName.toLowerCase():\"\"},0,1,!0);Q(\"name\",3,!1,!0,functio" +
    "n(a,b){var c=b?ib(b.a(a)):a.a;return c?c.nodeName.toLowerCase():\"\"" +
    "},0,1,!0);Q(\"namespace-uri\",3,!0,!1,n(\"\"),0,1,!0);Q(\"normalize-spa" +
    "ce\",3,!1,!0,function(a,b){return(b?O(b,a):E(a.a)).replace(/[\\s\\xa0" +
    "]+/g,\" \").replace(/^\\s+|\\s+$/g,\"\")},0,1);Q(\"not\",2,!1,!1,function(" +
    "a,b){return!qb(b,a)},1);Q(\"number\",1,!1,!0,function(a,b){return b?" +
    "M(b,a):+E(a.a)},0,1);\nQ(\"position\",1,!0,!1,function(a){return a.b}" +
    ",0);Q(\"round\",1,!1,!1,function(a,b){return Math.round(M(b,a))},1);" +
    "Q(\"starts-with\",2,!1,!1,function(a,b,c){b=O(b,a);a=O(c,a);return 0" +
    "==b.lastIndexOf(a,0)},2);Q(\"string\",3,!1,!0,function(a,b){return b" +
    "?O(b,a):E(a.a)},0,1);Q(\"string-length\",1,!1,!0,function(a,b){retur" +
    "n(b?O(b,a):E(a.a)).length},0,1);\nQ(\"substring\",3,!1,!1,function(a," +
    "b,c,d){c=M(c,a);if(isNaN(c)||Infinity==c||-Infinity==c)return\"\";d=" +
    "d?M(d,a):Infinity;if(isNaN(d)||-Infinity===d)return\"\";c=Math.round" +
    "(c)-1;var e=Math.max(c,0);a=O(b,a);if(Infinity==d)return a.substri" +
    "ng(e);b=Math.round(d);return a.substring(e,c+b)},2,3);Q(\"substring" +
    "-after\",3,!1,!1,function(a,b,c){b=O(b,a);a=O(c,a);c=b.indexOf(a);r" +
    "eturn-1==c?\"\":b.substring(c+a.length)},2);\nQ(\"substring-before\",3," +
    "!1,!1,function(a,b,c){b=O(b,a);a=O(c,a);a=b.indexOf(a);return-1==a" +
    "?\"\":b.substring(0,a)},2);Q(\"sum\",1,!1,!1,function(a,b){for(var c=I" +
    "(b.a(a)),d=0,e=J(c);e;e=J(c))d+=+E(e);return d},1,1,!0);Q(\"transla" +
    "te\",3,!1,!1,function(a,b,c,d){b=O(b,a);c=O(c,a);var e=O(d,a);a=[];" +
    "for(d=0;d<c.length;d++){var f=c.charAt(d);f in a||(a[f]=e.charAt(d" +
    "))}c=\"\";for(d=0;d<b.length;d++)f=b.charAt(d),c+=f in a?a[f]:f;retu" +
    "rn c},3);Q(\"true\",2,!1,!1,n(!0),0);function H(a,b){this.h=a;this.c" +
    "=q(b)?b:null;this.b=null;switch(a){case \"comment\":this.b=8;break;c" +
    "ase \"text\":this.b=3;break;case \"processing-instruction\":this.b=7;b" +
    "reak;case \"node\":break;default:throw Error(\"Unexpected argument\");" +
    "}}function Bb(a){return\"comment\"==a||\"text\"==a||\"processing-instru" +
    "ction\"==a||\"node\"==a}H.prototype.a=function(a){return null===this." +
    "b||this.b==a.nodeType};H.prototype.f=l(\"h\");H.prototype.toString=f" +
    "unction(){var a=\"Kind Test: \"+this.h;null===this.c||(a+=L(this.c))" +
    ";return a};function Cb(a){K.call(this,3);this.c=a.substring(1,a.le" +
    "ngth-1)}t(Cb,K);Cb.prototype.a=l(\"c\");Cb.prototype.toString=functi" +
    "on(){return\"Literal: \"+this.c};function Db(a,b){this.j=a.toLowerCa" +
    "se();this.b=b?b.toLowerCase():\"http://www.w3.org/1999/xhtml\"}Db.pr" +
    "ototype.a=function(a){var b=a.nodeType;return 1!=b&&2!=b?!1:\"*\"!=t" +
    "his.j&&this.j!=a.nodeName.toLowerCase()?!1:this.b==(a.namespaceURI" +
    "?a.namespaceURI.toLowerCase():\"http://www.w3.org/1999/xhtml\")};Db." +
    "prototype.f=l(\"j\");Db.prototype.toString=function(){return\"Name Te" +
    "st: \"+(\"http://www.w3.org/1999/xhtml\"==this.b?\"\":this.b+\":\")+this." +
    "j};function Eb(a){K.call(this,1);this.c=a}t(Eb,K);Eb.prototype.a=l" +
    "(\"c\");Eb.prototype.toString=function(){return\"Number: \"+this.c};fu" +
    "nction Fb(a,b){K.call(this,a.i);this.h=a;this.c=b;this.g=a.g;this." +
    "b=a.b;if(1==this.c.length){var c=this.c[0];c.A||c.c!=Gb||(c=c.u,\"*" +
    "\"!=c.f()&&(this.f={name:c.f(),v:null}))}}t(Fb,K);function Hb(){K.c" +
    "all(this,4)}t(Hb,K);Hb.prototype.a=function(a){var b=new F;a=a.a;9" +
    "==a.nodeType?G(b,a):G(b,a.ownerDocument);return b};Hb.prototype.to" +
    "String=n(\"Root Helper Expression\");function Ib(){K.call(this,4)}t(" +
    "Ib,K);Ib.prototype.a=function(a){var b=new F;G(b,a.a);return b};Ib" +
    ".prototype.toString=n(\"Context Helper Expression\");\nfunction Jb(a)" +
    "{return\"/\"==a||\"//\"==a}Fb.prototype.a=function(a){var b=this.h.a(a" +
    ");if(!(b instanceof F))throw Error(\"Filter expression must evaluat" +
    "e to nodeset.\");a=this.c;for(var c=0,d=a.length;c<d&&b.l;c++){var " +
    "e=a[c],f=I(b,e.c.a),g;if(e.g||e.c!=Kb)if(e.g||e.c!=Lb)for(g=J(f),b" +
    "=e.a(new Va(g));null!=(g=J(f));)g=e.a(new Va(g)),b=gb(b,g);else g=" +
    "J(f),b=e.a(new Va(g));else{for(g=J(f);(b=J(f))&&(!g.contains||g.co" +
    "ntains(b))&&b.compareDocumentPosition(g)&8;g=b);b=e.a(new Va(g))}}" +
    "return b};\nFb.prototype.toString=function(){var a;a=\"Path Expressi" +
    "on:\"+L(this.h);if(this.c.length){var b=ua(this.c,function(a,b){ret" +
    "urn a+L(b)},\"Steps:\");a+=L(b)}return a};function Mb(a,b){this.a=a;" +
    "this.b=!!b}\nfunction xb(a,b,c){for(c=c||0;c<a.a.length;c++)for(var" +
    " d=a.a[c],e=I(b),f=b.l,g,k=0;g=J(e);k++){var p=a.b?f-k:k+1;g=d.a(n" +
    "ew Va(g,p,f));if(\"number\"==typeof g)p=p==g;else if(\"string\"==typeo" +
    "f g||\"boolean\"==typeof g)p=!!g;else if(g instanceof F)p=0<g.l;else" +
    " throw Error(\"Predicate.evaluate returned an unexpected type.\");if" +
    "(!p){p=e;g=p.f;var m=p.a;if(!m)throw Error(\"Next must be called at" +
    " least once before remove.\");var h=m.b,m=m.a;h?h.a=m:g.a=m;m?m.b=h" +
    ":g.b=h;g.l--;p.a=null}}return b}\nMb.prototype.toString=function(){" +
    "return ua(this.a,function(a,b){return a+L(b)},\"Predicates:\")};func" +
    "tion R(a,b,c,d){K.call(this,4);this.c=a;this.u=b;this.h=c||new Mb(" +
    "[]);this.A=!!d;b=this.h;b=0<b.a.length?b.a[0].f:null;a.b&&b&&(this" +
    ".f={name:b.name,v:b.v});a:{a=this.h;for(b=0;b<a.a.length;b++)if(c=" +
    "a.a[b],c.g||1==c.i||0==c.i){a=!0;break a}a=!1}this.g=a}t(R,K);\nR.p" +
    "rototype.a=function(a){var b=a.a,c=null,c=this.f,d=null,e=null,f=0" +
    ";c&&(d=c.name,e=c.v?O(c.v,a):null,f=1);if(this.A)if(this.g||this.c" +
    "!=Ob)if(a=I((new R(Pb,new H(\"node\"))).a(a)),b=J(a))for(c=this.o(b," +
    "d,e,f);null!=(b=J(a));)c=gb(c,this.o(b,d,e,f));else c=new F;else c" +
    "=bb(this.u,b,d,e),c=xb(this.h,c,f);else c=this.o(a.a,d,e,f);return" +
    " c};R.prototype.o=function(a,b,c,d){a=this.c.f(this.u,a,b,c);retur" +
    "n a=xb(this.h,a,d)};\nR.prototype.toString=function(){var a;a=\"Step" +
    ":\"+L(\"Operator: \"+(this.A?\"//\":\"/\"));this.c.j&&(a+=L(\"Axis: \"+this" +
    ".c));a+=L(this.u);if(this.h.a.length){var b=ua(this.h.a,function(a" +
    ",b){return a+L(b)},\"Predicates:\");a+=L(b)}return a};function Qb(a," +
    "b,c,d){this.j=a;this.f=b;this.a=c;this.b=d}Qb.prototype.toString=l" +
    "(\"j\");var Rb={};function S(a,b,c,d){if(Rb.hasOwnProperty(a))throw " +
    "Error(\"Axis already created: \"+a);b=new Qb(a,b,c,!!d);return Rb[a]" +
    "=b}\nS(\"ancestor\",function(a,b){for(var c=new F,d=b;d=d.parentNode;" +
    ")a.a(d)&&hb(c,d);return c},!0);S(\"ancestor-or-self\",function(a,b){" +
    "var c=new F,d=b;do a.a(d)&&hb(c,d);while(d=d.parentNode);return c}" +
    ",!0);var Gb=S(\"attribute\",function(a,b){var c=new F,d=a.f(),e=b.at" +
    "tributes;if(e)if(a instanceof H&&null===a.b||\"*\"==d)for(var d=0,f;" +
    "f=e[d];d++)G(c,f);else(f=e.getNamedItem(d))&&G(c,f);return c},!1)," +
    "Ob=S(\"child\",function(a,b,c,d,e){return eb.call(null,a,b,r(c)?c:nu" +
    "ll,r(d)?d:null,e||new F)},!1,!0);\nS(\"descendant\",bb,!1,!0);var Pb=" +
    "S(\"descendant-or-self\",function(a,b,c,d){var e=new F;ab(b,c,d)&&a." +
    "a(b)&&G(e,b);return bb(a,b,c,d,e)},!1,!0),Kb=S(\"following\",functio" +
    "n(a,b,c,d){var e=new F;do for(var f=b;f=f.nextSibling;)ab(f,c,d)&&" +
    "a.a(f)&&G(e,f),e=bb(a,f,c,d,e);while(b=b.parentNode);return e},!1," +
    "!0);S(\"following-sibling\",function(a,b){for(var c=new F,d=b;d=d.ne"
  )
      .append(
    "xtSibling;)a.a(d)&&G(c,d);return c},!1);S(\"namespace\",function(){r" +
    "eturn new F},!1);\nvar Sb=S(\"parent\",function(a,b){var c=new F;if(9" +
    "==b.nodeType)return c;if(2==b.nodeType)return G(c,b.ownerElement)," +
    "c;var d=b.parentNode;a.a(d)&&G(c,d);return c},!1),Lb=S(\"preceding\"" +
    ",function(a,b,c,d){var e=new F,f=[];do f.unshift(b);while(b=b.pare" +
    "ntNode);for(var g=1,k=f.length;g<k;g++){var p=[];for(b=f[g];b=b.pr" +
    "eviousSibling;)p.unshift(b);for(var m=0,h=p.length;m<h;m++)b=p[m]," +
    "ab(b,c,d)&&a.a(b)&&G(e,b),e=bb(a,b,c,d,e)}return e},!0,!0);\nS(\"pre" +
    "ceding-sibling\",function(a,b){for(var c=new F,d=b;d=d.previousSibl" +
    "ing;)a.a(d)&&hb(c,d);return c},!0);var Tb=S(\"self\",function(a,b){v" +
    "ar c=new F;a.a(b)&&G(c,b);return c},!1);function Ub(a){K.call(this" +
    ",1);this.c=a;this.g=a.g;this.b=a.b}t(Ub,K);Ub.prototype.a=function" +
    "(a){return-M(this.c,a)};Ub.prototype.toString=function(){return\"Un" +
    "ary Expression: -\"+L(this.c)};function Vb(a){K.call(this,4);this.c" +
    "=a;ob(this,va(this.c,function(a){return a.g}));pb(this,va(this.c,f" +
    "unction(a){return a.b}))}t(Vb,K);Vb.prototype.a=function(a){var b=" +
    "new F;u(this.c,function(c){c=c.a(a);if(!(c instanceof F))throw Err" +
    "or(\"Path expression must evaluate to NodeSet.\");b=gb(b,c)});return" +
    " b};Vb.prototype.toString=function(){return ua(this.c,function(a,b" +
    "){return a+L(b)},\"Union Expression:\")};function Wb(a,b){this.a=a;t" +
    "his.b=b}function Xb(a){for(var b,c=[];;){T(a,\"Missing right hand s" +
    "ide of binary expression.\");b=Yb(a);var d=D(a.a);if(!d)break;var e" +
    "=(d=vb[d]||null)&&d.H;if(!e){a.a.a--;break}for(;c.length&&e<=c[c.l" +
    "ength-1].H;)b=new rb(c.pop(),c.pop(),b);c.push(b,d)}for(;c.length;" +
    ")b=new rb(c.pop(),c.pop(),b);return b}function T(a,b){if($a(a.a))t" +
    "hrow Error(b);}function Zb(a,b){var c=D(a.a);if(c!=b)throw Error(\"" +
    "Bad token, expected: \"+b+\" got: \"+c);}\nfunction $b(a){a=D(a.a);if(" +
    "\")\"!=a)throw Error(\"Bad token: \"+a);}function ac(a){a=D(a.a);if(2>" +
    "a.length)throw Error(\"Unclosed literal string\");return new Cb(a)}f" +
    "unction bc(a){var b=D(a.a),c=b.indexOf(\":\");if(-1==c)return new Db" +
    "(b);var d=b.substring(0,c);a=a.b(d);if(!a)throw Error(\"Namespace p" +
    "refix not declared: \"+d);b=b.substr(c+1);return new Db(b,a)}\nfunct" +
    "ion cc(a){var b,c=[],d;if(Jb(C(a.a))){b=D(a.a);d=C(a.a);if(\"/\"==b&" +
    "&($a(a.a)||\".\"!=d&&\"..\"!=d&&\"@\"!=d&&\"*\"!=d&&!/(?![0-9])[\\w]/.test(" +
    "d)))return new Hb;d=new Hb;T(a,\"Missing next location step.\");b=dc" +
    "(a,b);c.push(b)}else{a:{b=C(a.a);d=b.charAt(0);switch(d){case \"$\":" +
    "throw Error(\"Variable reference not allowed in HTML XPath\");case \"" +
    "(\":D(a.a);b=Xb(a);T(a,'unclosed \"(\"');Zb(a,\")\");break;case '\"':cas" +
    "e \"'\":b=ac(a);break;default:if(isNaN(+b))if(!Bb(b)&&/(?![0-9])[\\w]" +
    "/.test(d)&&\"(\"==C(a.a,1)){b=D(a.a);\nb=Ab[b]||null;D(a.a);for(d=[];" +
    "\")\"!=C(a.a);){T(a,\"Missing function argument list.\");d.push(Xb(a))" +
    ";if(\",\"!=C(a.a))break;D(a.a)}T(a,\"Unclosed function argument list." +
    "\");$b(a);b=new yb(b,d)}else{b=null;break a}else b=new Eb(+D(a.a))}" +
    "\"[\"==C(a.a)&&(d=new Mb(ec(a)),b=new wb(b,d))}if(b)if(Jb(C(a.a)))d=" +
    "b;else return b;else b=dc(a,\"/\"),d=new Ib,c.push(b)}for(;Jb(C(a.a)" +
    ");)b=D(a.a),T(a,\"Missing next location step.\"),b=dc(a,b),c.push(b)" +
    ";return new Fb(d,c)}\nfunction dc(a,b){var c,d,e;if(\"/\"!=b&&\"//\"!=b" +
    ")throw Error('Step op should be \"/\" or \"//\"');if(\".\"==C(a.a))retur" +
    "n d=new R(Tb,new H(\"node\")),D(a.a),d;if(\"..\"==C(a.a))return d=new " +
    "R(Sb,new H(\"node\")),D(a.a),d;var f;if(\"@\"==C(a.a))f=Gb,D(a.a),T(a," +
    "\"Missing attribute name\");else if(\"::\"==C(a.a,1)){if(!/(?![0-9])[\\" +
    "w]/.test(C(a.a).charAt(0)))throw Error(\"Bad token: \"+D(a.a));c=D(a" +
    ".a);f=Rb[c]||null;if(!f)throw Error(\"No axis with name: \"+c);D(a.a" +
    ");T(a,\"Missing node name\")}else f=Ob;c=C(a.a);if(/(?![0-9])[\\w]/.t" +
    "est(c.charAt(0)))if(\"(\"==\nC(a.a,1)){if(!Bb(c))throw Error(\"Invalid" +
    " node type: \"+c);c=D(a.a);if(!Bb(c))throw Error(\"Invalid type name" +
    ": \"+c);Zb(a,\"(\");T(a,\"Bad nodetype\");e=C(a.a).charAt(0);var g=null" +
    ";if('\"'==e||\"'\"==e)g=ac(a);T(a,\"Bad nodetype\");$b(a);c=new H(c,g)}" +
    "else c=bc(a);else if(\"*\"==c)c=bc(a);else throw Error(\"Bad token: \"" +
    "+D(a.a));e=new Mb(ec(a),f.a);return d||new R(f,c,e,\"//\"==b)}\nfunct" +
    "ion ec(a){for(var b=[];\"[\"==C(a.a);){D(a.a);T(a,\"Missing predicate" +
    " expression.\");var c=Xb(a);b.push(c);T(a,\"Unclosed predicate expre" +
    "ssion.\");Zb(a,\"]\")}return b}function Yb(a){if(\"-\"==C(a.a))return D" +
    "(a.a),new Ub(Yb(a));var b=cc(a);if(\"|\"!=C(a.a))a=b;else{for(b=[b];" +
    "\"|\"==D(a.a);)T(a,\"Missing next union location path.\"),b.push(cc(a)" +
    ");a.a.a--;a=new Vb(b)}return a};function fc(a,b){if(!a.length)thro" +
    "w Error(\"Empty XPath expression.\");var c=Xa(a);if($a(c))throw Erro" +
    "r(\"Invalid XPath expression.\");b?da(b)||(b=ga(b.lookupNamespaceURI" +
    ",b)):b=n(null);var d=Xb(new Wb(c,b));if(!$a(c))throw Error(\"Bad to" +
    "ken: \"+D(c));this.evaluate=function(a,b){var c=d.a(new Va(a));retu" +
    "rn new U(c,b)}}\nfunction U(a,b){if(0==b)if(a instanceof F)b=4;else" +
    " if(\"string\"==typeof a)b=2;else if(\"number\"==typeof a)b=1;else if(" +
    "\"boolean\"==typeof a)b=3;else throw Error(\"Unexpected evaluation re" +
    "sult.\");if(2!=b&&1!=b&&3!=b&&!(a instanceof F))throw Error(\"value " +
    "could not be converted to the specified type\");this.resultType=b;v" +
    "ar c;switch(b){case 2:this.stringValue=a instanceof F?jb(a):\"\"+a;b" +
    "reak;case 1:this.numberValue=a instanceof F?+jb(a):+a;break;case 3" +
    ":this.booleanValue=a instanceof F?0<a.l:!!a;break;case 4:case 5:ca" +
    "se 6:case 7:var d=\nI(a);c=[];for(var e=J(d);e;e=J(d))c.push(e);thi" +
    "s.snapshotLength=a.l;this.invalidIteratorState=!1;break;case 8:cas" +
    "e 9:this.singleNodeValue=ib(a);break;default:throw Error(\"Unknown " +
    "XPathResult type.\");}var f=0;this.iterateNext=function(){if(4!=b&&" +
    "5!=b)throw Error(\"iterateNext called with wrong result type\");retu" +
    "rn f>=c.length?null:c[f++]};this.snapshotItem=function(a){if(6!=b&" +
    "&7!=b)throw Error(\"snapshotItem called with wrong result type\");re" +
    "turn a>=c.length||0>a?null:c[a]}}U.ANY_TYPE=0;\nU.NUMBER_TYPE=1;U.S" +
    "TRING_TYPE=2;U.BOOLEAN_TYPE=3;U.UNORDERED_NODE_ITERATOR_TYPE=4;U.O" +
    "RDERED_NODE_ITERATOR_TYPE=5;U.UNORDERED_NODE_SNAPSHOT_TYPE=6;U.ORD" +
    "ERED_NODE_SNAPSHOT_TYPE=7;U.ANY_UNORDERED_NODE_TYPE=8;U.FIRST_ORDE" +
    "RED_NODE_TYPE=9;function gc(a){this.lookupNamespaceURI=lb(a)}\nfunc" +
    "tion hc(a){a=a||aa;var b=a.document;b.evaluate||(a.XPathResult=U,b" +
    ".evaluate=function(a,b,e,f){return(new fc(a,e)).evaluate(b,f)},b.c" +
    "reateExpression=function(a,b){return new fc(a,b)},b.createNSResolv" +
    "er=function(a){return new gc(a)})}ba(\"wgxpath.install\",hc);var V={" +
    "};V.C=function(){var a={R:\"http://www.w3.org/2000/svg\"};return fun" +
    "ction(b){return a[b]||null}}();\nV.o=function(a,b,c){var d=x(a);if(" +
    "!d.documentElement)return null;hc(Fa(d));try{for(var e=d.createNSR" +
    "esolver?d.createNSResolver(d.documentElement):V.C,f={},g=d.getElem" +
    "entsByTagName(\"*\"),k=0;k<g.length;++k){var p=g[k],m=p.namespaceURI" +
    ";if(m&&!f[m]){var h=p.lookupPrefix(m);if(!h){var B=m.match(\".*/(\\\\" +
    "w+)/?$\");B?h=B[1]:h=\"xhtml\"}f[m]=h}}var N={},X;for(X in f)N[f[X]]=" +
    "X;e=function(a){return N[a]||null};try{return d.evaluate(b,a,e,c,n" +
    "ull)}catch(Nb){if(\"TypeError\"===Nb.name)return e=d.createNSResolve" +
    "r?d.createNSResolver(d.documentElement):\nV.C,d.evaluate(b,a,e,c,nu" +
    "ll);throw Nb;}}catch(wc){throw new z(32,\"Unable to locate an eleme" +
    "nt with the xpath expression \"+b+\" because of the following error:" +
    "\\n\"+wc);}};V.D=function(a,b){if(!a||1!=a.nodeType)throw new z(32,'" +
    "The result of the xpath expression \"'+b+'\" is: '+a+\". It should be" +
    " an element.\");};\nV.s=function(a,b){var c=function(){var c=V.o(b,a" +
    ",9);return c?c.singleNodeValue||null:b.selectSingleNode?(c=x(b),c." +
    "setProperty&&c.setProperty(\"SelectionLanguage\",\"XPath\"),b.selectSi" +
    "ngleNode(a)):null}();null===c||V.D(c,a);return c};\nV.m=function(a," +
    "b){var c=function(){var c=V.o(b,a,7);if(c){for(var e=c.snapshotLen" +
    "gth,f=[],g=0;g<e;++g)f.push(c.snapshotItem(g));return f}return b.s" +
    "electNodes?(c=x(b),c.setProperty&&c.setProperty(\"SelectionLanguage" +
    "\",\"XPath\"),b.selectNodes(a)):[]}();u(c,function(b){V.D(b,a)});retu" +
    "rn c};var ic={aliceblue:\"#f0f8ff\",antiquewhite:\"#faebd7\",aqua:\"#00" +
    "ffff\",aquamarine:\"#7fffd4\",azure:\"#f0ffff\",beige:\"#f5f5dc\",bisque:" +
    "\"#ffe4c4\",black:\"#000000\",blanchedalmond:\"#ffebcd\",blue:\"#0000ff\"," +
    "blueviolet:\"#8a2be2\",brown:\"#a52a2a\",burlywood:\"#deb887\",cadetblue" +
    ":\"#5f9ea0\",chartreuse:\"#7fff00\",chocolate:\"#d2691e\",coral:\"#ff7f50" +
    "\",cornflowerblue:\"#6495ed\",cornsilk:\"#fff8dc\",crimson:\"#dc143c\",cy" +
    "an:\"#00ffff\",darkblue:\"#00008b\",darkcyan:\"#008b8b\",darkgoldenrod:\"" +
    "#b8860b\",darkgray:\"#a9a9a9\",darkgreen:\"#006400\",\ndarkgrey:\"#a9a9a9" +
    "\",darkkhaki:\"#bdb76b\",darkmagenta:\"#8b008b\",darkolivegreen:\"#556b2" +
    "f\",darkorange:\"#ff8c00\",darkorchid:\"#9932cc\",darkred:\"#8b0000\",dar" +
    "ksalmon:\"#e9967a\",darkseagreen:\"#8fbc8f\",darkslateblue:\"#483d8b\",d" +
    "arkslategray:\"#2f4f4f\",darkslategrey:\"#2f4f4f\",darkturquoise:\"#00c" +
    "ed1\",darkviolet:\"#9400d3\",deeppink:\"#ff1493\",deepskyblue:\"#00bfff\"" +
    ",dimgray:\"#696969\",dimgrey:\"#696969\",dodgerblue:\"#1e90ff\",firebric" +
    "k:\"#b22222\",floralwhite:\"#fffaf0\",forestgreen:\"#228b22\",fuchsia:\"#" +
    "ff00ff\",gainsboro:\"#dcdcdc\",\nghostwhite:\"#f8f8ff\",gold:\"#ffd700\",g" +
    "oldenrod:\"#daa520\",gray:\"#808080\",green:\"#008000\",greenyellow:\"#ad" +
    "ff2f\",grey:\"#808080\",honeydew:\"#f0fff0\",hotpink:\"#ff69b4\",indianre" +
    "d:\"#cd5c5c\",indigo:\"#4b0082\",ivory:\"#fffff0\",khaki:\"#f0e68c\",laven" +
    "der:\"#e6e6fa\",lavenderblush:\"#fff0f5\",lawngreen:\"#7cfc00\",lemonchi" +
    "ffon:\"#fffacd\",lightblue:\"#add8e6\",lightcoral:\"#f08080\",lightcyan:" +
    "\"#e0ffff\",lightgoldenrodyellow:\"#fafad2\",lightgray:\"#d3d3d3\",light" +
    "green:\"#90ee90\",lightgrey:\"#d3d3d3\",lightpink:\"#ffb6c1\",lightsalmo" +
    "n:\"#ffa07a\",\nlightseagreen:\"#20b2aa\",lightskyblue:\"#87cefa\",lights" +
    "lategray:\"#778899\",lightslategrey:\"#778899\",lightsteelblue:\"#b0c4d" +
    "e\",lightyellow:\"#ffffe0\",lime:\"#00ff00\",limegreen:\"#32cd32\",linen:" +
    "\"#faf0e6\",magenta:\"#ff00ff\",maroon:\"#800000\",mediumaquamarine:\"#66" +
    "cdaa\",mediumblue:\"#0000cd\",mediumorchid:\"#ba55d3\",mediumpurple:\"#9" +
    "370db\",mediumseagreen:\"#3cb371\",mediumslateblue:\"#7b68ee\",mediumsp" +
    "ringgreen:\"#00fa9a\",mediumturquoise:\"#48d1cc\",mediumvioletred:\"#c7" +
    "1585\",midnightblue:\"#191970\",mintcream:\"#f5fffa\",mistyrose:\"#ffe4e" +
    "1\",\nmoccasin:\"#ffe4b5\",navajowhite:\"#ffdead\",navy:\"#000080\",oldlac" +
    "e:\"#fdf5e6\",olive:\"#808000\",olivedrab:\"#6b8e23\",orange:\"#ffa500\",o" +
    "rangered:\"#ff4500\",orchid:\"#da70d6\",palegoldenrod:\"#eee8aa\",palegr" +
    "een:\"#98fb98\",paleturquoise:\"#afeeee\",palevioletred:\"#db7093\",papa" +
    "yawhip:\"#ffefd5\",peachpuff:\"#ffdab9\",peru:\"#cd853f\",pink:\"#ffc0cb\"" +
    ",plum:\"#dda0dd\",powderblue:\"#b0e0e6\",purple:\"#800080\",red:\"#ff0000" +
    "\",rosybrown:\"#bc8f8f\",royalblue:\"#4169e1\",saddlebrown:\"#8b4513\",sa" +
    "lmon:\"#fa8072\",sandybrown:\"#f4a460\",seagreen:\"#2e8b57\",\nseashell:\"" +
    "#fff5ee\",sienna:\"#a0522d\",silver:\"#c0c0c0\",skyblue:\"#87ceeb\",slate" +
    "blue:\"#6a5acd\",slategray:\"#708090\",slategrey:\"#708090\",snow:\"#fffa" +
    "fa\",springgreen:\"#00ff7f\",steelblue:\"#4682b4\",tan:\"#d2b48c\",teal:\"" +
    "#008080\",thistle:\"#d8bfd8\",tomato:\"#ff6347\",turquoise:\"#40e0d0\",vi" +
    "olet:\"#ee82ee\",wheat:\"#f5deb3\",white:\"#ffffff\",whitesmoke:\"#f5f5f5" +
    "\",yellow:\"#ffff00\",yellowgreen:\"#9acd32\"};var jc=\"backgroundColor " +
    "borderTopColor borderRightColor borderBottomColor borderLeftColor " +
    "color outlineColor\".split(\" \"),kc=/#([0-9a-fA-F])([0-9a-fA-F])([0-" +
    "9a-fA-F])/,lc=/^#(?:[0-9a-f]{3}){1,2}$/i,mc=/^(?:rgba)?\\((\\d{1,3})" +
    ",\\s?(\\d{1,3}),\\s?(\\d{1,3}),\\s?(0|1|0\\.\\d*)\\)$/i,nc=/^(?:rgb)?\\((0|" +
    "[1-9]\\d{0,2}),\\s?(0|[1-9]\\d{0,2}),\\s?(0|[1-9]\\d{0,2})\\)$/i;functio" +
    "n W(a,b){return!!a&&1==a.nodeType&&(!b||a.tagName.toUpperCase()==b" +
    ")}var oc=/[;]+(?=(?:(?:[^\"]*\"){2})*[^\"]*$)(?=(?:(?:[^']*'){2})*[^'" +
    "]*$)(?=(?:[^()]*\\([^()]*\\))*[^()]*$)/;function pc(a){var b=[];u(a." +
    "split(oc),function(a){var d=a.indexOf(\":\");0<d&&(a=[a.slice(0,d),a" +
    ".slice(d+1)],2==a.length&&b.push(a[0].toLowerCase(),\":\",a[1],\";\"))" +
    "});b=b.join(\"\");return b=\";\"==b.charAt(b.length-1)?b:b+\";\"}\nfuncti" +
    "on qc(a,b){b=b.toLowerCase();if(\"style\"==b)return pc(a.style.cssTe" +
    "xt);var c=a.getAttributeNode(b);return c&&c.specified?c.value:null" +
    "}function rc(a){for(a=a.parentNode;a&&1!=a.nodeType&&9!=a.nodeType" +
    "&&11!=a.nodeType;)a=a.parentNode;return W(a)?a:null}\nfunction Y(a," +
    "b){var c=oa(b);if(\"float\"==c||\"cssFloat\"==c||\"styleFloat\"==c)c=\"cs" +
    "sFloat\";var d;a:{d=c;var e=x(a);if(e.defaultView&&e.defaultView.ge" +
    "tComputedStyle&&(e=e.defaultView.getComputedStyle(a,null))){d=e[d]" +
    "||e.getPropertyValue(d)||\"\";break a}d=\"\"}d=d||sc(a,c);if(null===d)" +
    "d=null;else if(0<=sa(jc,c)){b:{var f=d.match(mc);if(f){var c=Numbe" +
    "r(f[1]),e=Number(f[2]),g=Number(f[3]),f=Number(f[4]);if(0<=c&&255>" +
    "=c&&0<=e&&255>=e&&0<=g&&255>=g&&0<=f&&1>=f){c=[c,e,g,f];break b}}c" +
    "=null}if(!c)b:{if(g=d.match(nc))if(c=\nNumber(g[1]),e=Number(g[2])," +
    "g=Number(g[3]),0<=c&&255>=c&&0<=e&&255>=e&&0<=g&&255>=g){c=[c,e,g," +
    "1];break b}c=null}if(!c)b:{c=d.toLowerCase();e=ic[c.toLowerCase()]" +
    ";if(!e&&(e=\"#\"==c.charAt(0)?c:\"#\"+c,4==e.length&&(e=e.replace(kc,\"" +
    "#$1$1$2$2$3$3\")),!lc.test(e))){c=null;break b}c=[parseInt(e.substr" +
    "(1,2),16),parseInt(e.substr(3,2),16),parseInt(e.substr(5,2),16),1]" +
    "}d=c?\"rgba(\"+c.join(\", \")+\")\":d}return d}\nfunction sc(a,b){var c=a" +
    ".currentStyle||a.style,d=c[b];!q(d)&&da(c.getPropertyValue)&&(d=c." +
    "getPropertyValue(b));return\"inherit\"!=d?q(d)?d:null:(c=rc(a))?sc(c" +
    ",b):null}\nfunction tc(a,b,c){function d(a){var b=uc(a);return 0<b." +
    "height&&0<b.width?!0:W(a,\"PATH\")&&(0<b.height||0<b.width)?(a=Y(a,\"" +
    "stroke-width\"),!!a&&0<parseInt(a,10)):\"hidden\"!=Y(a,\"overflow\")&&v" +
    "a(a.childNodes,function(a){return 3==a.nodeType||W(a)&&d(a)})}func" +
    "tion e(a){return\"hidden\"==vc(a)&&wa(a.childNodes,function(a){retur" +
    "n!W(a)||e(a)||!d(a)})}if(!W(a))throw Error(\"Argument to isShown mu" +
    "st be of type Element\");if(W(a,\"BODY\"))return!0;if(W(a,\"OPTION\")||" +
    "W(a,\"OPTGROUP\"))return a=La(a,function(a){return W(a,\n\"SELECT\")})," +
    "!!a&&tc(a,!0,c);var f=xc(a);if(f)return!!f.F&&0<f.rect.width&&0<f." +
    "rect.height&&tc(f.F,b,c);if(W(a,\"INPUT\")&&\"hidden\"==a.type.toLower" +
    "Case()||W(a,\"NOSCRIPT\"))return!1;f=Y(a,\"visibility\");return\"collap" +
    "se\"!=f&&\"hidden\"!=f&&c(a)&&(b||0!=yc(a))&&d(a)?!e(a):!1}function z" +
    "c(a){function b(a){if(\"none\"==Y(a,\"display\"))return!1;a=rc(a);retu" +
    "rn!a||b(a)}return tc(a,!1,b)}\nfunction vc(a){function b(a){functio" +
    "n b(a){return a==g?!0:0==Y(a,\"display\").lastIndexOf(\"inline\",0)||\"" +
    "absolute\"==c&&\"static\"==Y(a,\"position\")?!1:!0}var c=Y(a,\"position\"" +
    ");if(\"fixed\"==c)return m=!0,a==g?null:g;for(a=rc(a);a&&!b(a);)a=rc" +
    "(a);return a}function c(a){var b=a;if(\"visible\"==p)if(a==g&&k)b=k;" +
    "else if(a==k)return{x:\"visible\",y:\"visible\"};b={x:Y(b,\"overflow-x\"" +
    "),y:Y(b,\"overflow-y\")};a==g&&(b.x=\"visible\"==b.x?\"auto\":b.x,b.y=\"v" +
    "isible\"==b.y?\"auto\":b.y);return b}function d(a){if(a==g){var b=(ne" +
    "w Ea(f)).a;\na=b.scrollingElement?b.scrollingElement:b.body||b.docu" +
    "mentElement;b=b.parentWindow||b.defaultView;a=new v(b.pageXOffset|" +
    "|a.scrollLeft,b.pageYOffset||a.scrollTop)}else a=new v(a.scrollLef" +
    "t,a.scrollTop);return a}var e=Ac(a),f=x(a),g=f.documentElement,k=f" +
    ".body,p=Y(g,\"overflow\"),m;for(a=b(a);a;a=b(a)){var h=c(a);if(\"visi" +
    "ble\"!=h.x||\"visible\"!=h.y){var B=uc(a);if(0==B.width||0==B.height)" +
    "return\"hidden\";var N=e.right<B.left,X=e.bottom<B.top;if(N&&\"hidden" +
    "\"==h.x||X&&\"hidden\"==h.y)return\"hidden\";if(N&&\"visible\"!=\nh.x||X&&" +
    "\"visible\"!=h.y){N=d(a);X=e.bottom<B.top-N.y;if(e.right<B.left-N.x&" +
    "&\"visible\"!=h.x||X&&\"visible\"!=h.x)return\"hidden\";e=vc(a);return\"h" +
    "idden\"==e?\"hidden\":\"scroll\"}N=e.left>=B.left+B.width;B=e.top>=B.to" +
    "p+B.height;if(N&&\"hidden\"==h.x||B&&\"hidden\"==h.y)return\"hidden\";if" +
    "(N&&\"visible\"!=h.x||B&&\"visible\"!=h.y){if(m&&(h=d(a),e.left>=g.scr" +
    "ollWidth-h.x||e.right>=g.scrollHeight-h.y))return\"hidden\";e=vc(a);" +
    "return\"hidden\"==e?\"hidden\":\"scroll\"}}}return\"none\"}\nfunction uc(a)" +
    "{var b=xc(a);if(b)return b.rect;if(W(a,\"HTML\"))return a=x(a),a=(Fa" +
    "(a)||window).document,a=\"CSS1Compat\"==a.compatMode?a.documentEleme" +
    "nt:a.body,a=new Aa(a.clientWidth,a.clientHeight),new A(0,0,a.width" +
    ",a.height);var c;try{c=a.getBoundingClientRect()}catch(d){return n" +
    "ew A(0,0,0,0)}return new A(c.left,c.top,c.right-c.left,c.bottom-c." +
    "top)}\nfunction xc(a){var b=W(a,\"MAP\");if(!b&&!W(a,\"AREA\"))return n" +
    "ull;var c=b?a:W(a.parentNode,\"MAP\")?a.parentNode:null,d=null,e=nul" +
    "l;if(c&&c.name&&(d=x(c),d=V.s('/descendant::*[@usemap = \"#'+c.name" +
    "+'\"]',d))&&(e=uc(d),!b&&\"default\"!=a.shape.toLowerCase())){var f=B" +
    "c(a);a=Math.min(Math.max(f.left,0),e.width);b=Math.min(Math.max(f." +
    "top,0),e.height);c=Math.min(f.width,e.width-a);f=Math.min(f.height" +
    ",e.height-b);e=new A(a+e.left,b+e.top,c,f)}return{F:d,rect:e||new " +
    "A(0,0,0,0)}}\nfunction Bc(a){var b=a.shape.toLowerCase();a=a.coords" +
    ".split(\",\");if(\"rect\"==b&&4==a.length){var b=a[0],c=a[1];return ne" +
    "w A(b,c,a[2]-b,a[3]-c)}if(\"circle\"==b&&3==a.length)return b=a[2],n" +
    "ew A(a[0]-b,a[1]-b,2*b,2*b);if(\"poly\"==b&&2<a.length){for(var b=a[" +
    "0],c=a[1],d=b,e=c,f=2;f+1<a.length;f+=2)b=Math.min(b,a[f]),d=Math." +
    "max(d,a[f]),c=Math.min(c,a[f+1]),e=Math.max(e,a[f+1]);return new A" +
    "(b,c,d-b,e-c)}return new A(0,0,0,0)}function Ac(a){a=uc(a);return " +
    "new Ua(a.top,a.left+a.width,a.top+a.height,a.left)}\nfunction Cc(a)" +
    "{return a.replace(/^[^\\S\\xa0]+|[^\\S\\xa0]+$/g,\"\")}function Dc(a){va" +
    "r b=[];Ec(a,b);var c=b;a=c.length;for(var b=Array(a),c=r(c)?c.spli" +
    "t(\"\"):c,d=0;d<a;d++)d in c&&(b[d]=Cc.call(void 0,c[d]));return Cc(" +
    "b.join(\"\\n\")).replace(/\\xa0/g,\" \")}\nfunction Fc(a,b,c){if(W(a,\"BR\"" +
    "))b.push(\"\");else{var d=W(a,\"TD\"),e=Y(a,\"display\"),f=!d&&!(0<=sa(G" +
    "c,e)),g=q(a.previousElementSibling)?a.previousElementSibling:Ga(a." +
    "previousSibling),g=g?Y(g,\"display\"):\"\",k=Y(a,\"float\")||Y(a,\"cssFlo" +
    "at\")||Y(a,\"styleFloat\");!f||\"run-in\"==g&&\"none\"==k||/^[\\s\\xa0]*$/." +
    "test(b[b.length-1]||\"\")||b.push(\"\");var p=zc(a),m=null,h=null;p&&(" +
    "m=Y(a,\"white-space\"),h=Y(a,\"text-transform\"));u(a.childNodes,funct" +
    "ion(a){c(a,b,p,m,h)});a=b[b.length-1]||\"\";!d&&\"table-cell\"!=e||!a|" +
    "|ka(a)||(b[b.length-\n1]+=\" \");f&&\"run-in\"!=e&&!/^[\\s\\xa0]*$/.test(" +
    "a)&&b.push(\"\")}}function Ec(a,b){Fc(a,b,function(a,b,e,f,g){3==a.n" +
    "odeType&&e?Hc(a,b,f,g):W(a)&&Ec(a,b)})}var Gc=\"inline inline-block" +
    " inline-table none table-cell table-column table-column-group\".spl" +
    "it(\" \");\nfunction Hc(a,b,c,d){a=a.nodeValue.replace(/[\\u200b\\u200e" +
    "\\u200f]/g,\"\");a=a.replace(/(\\r\\n|\\r|\\n)/g,\"\\n\");if(\"normal\"==c||\"n" +
    "owrap\"==c)a=a.replace(/\\n/g,\" \");a=\"pre\"==c||\"pre-wrap\"==c?a.repla" +
    "ce(/[ \\f\\t\\v\\u2028\\u2029]/g,\"\\u00a0\"):a.replace(/[\\ \\f\\t\\v\\u2028\\u" +
    "2029]+/g,\" \");\"capitalize\"==d?a=a.replace(/(^|\\s)(\\S)/g,function(a" +
    ",b,c){return b+c.toUpperCase()}):\"uppercase\"==d?a=a.toUpperCase():" +
    "\"lowercase\"==d&&(a=a.toLowerCase());c=b.pop()||\"\";ka(c)&&0==a.last" +
    "IndexOf(\" \",0)&&(a=a.substr(1));b.push(c+a)}\nfunction yc(a){var b=" +
    "1,c=Y(a,\"opacity\");c&&(b=Number(c));(a=rc(a))&&(b*=yc(a));return b" +
    "};var Ic={w:function(a,b){return!(!a.querySelectorAll||!a.querySel" +
    "ector)&&!/^\\d.*/.test(b)},s:function(a,b){var c=w(b),d=r(a)?c.a.ge" +
    "tElementById(a):a;if(!d)return null;if(qc(d,\"id\")==a&&Ha(b,d))retu" +
    "rn d;c=y(c,\"*\");return xa(c,function(c){return qc(c,\"id\")==a&&Ha(b" +
    ",c)})},m:function(a,b){if(!a)return[];if(Ic.w(b,a))try{return b.qu" +
    "erySelectorAll(\"#\"+Ic.K(a))}catch(c){return[]}var d=y(w(b),\"*\",nul" +
    "l,b);return ta(d,function(b){return qc(b,\"id\")==a})},K:function(a)" +
    "{return a.replace(/(['\"\\\\#.:;,!?+<>=~*^$|%&@`{}\\-\\/\\[\\]\\(\\)])/g,\n\"" +
    "\\\\$1\")}};var Z={},Jc={};Z.J=function(a,b,c){var d;try{d=Ta.m(\"a\",b" +
    ")}catch(e){d=y(w(b),\"A\",null,b)}return xa(d,function(b){b=Dc(b);re" +
    "turn c&&-1!=b.indexOf(a)||b==a})};Z.G=function(a,b,c){var d;try{d=" +
    "Ta.m(\"a\",b)}catch(e){d=y(w(b),\"A\",null,b)}return ta(d,function(b){" +
    "b=Dc(b);return c&&-1!=b.indexOf(a)||b==a})};Z.s=function(a,b){retu" +
    "rn Z.J(a,b,!1)};Z.m=function(a,b){return Z.G(a,b,!1)};Jc.s=functio" +
    "n(a,b){return Z.J(a,b,!0)};Jc.m=function(a,b){return Z.G(a,b,!0)};" +
    "var Kc={s:function(a,b){return b.getElementsByTagName(a)[0]||null}" +
    ",m:function(a,b){return b.getElementsByTagName(a)}};var Lc={classN" +
    "ame:Oa,\"class name\":Oa,css:Ta,\"css selector\":Ta,id:Ic,linkText:Z,\"" +
    "link text\":Z,name:{s:function(a,b){var c=y(w(b),\"*\",null,b);return" +
    " xa(c,function(b){return qc(b,\"name\")==a})},m:function(a,b){var c=" +
    "y(w(b),\"*\",null,b);return ta(c,function(b){return qc(b,\"name\")==a}" +
    ")}},partialLinkText:Jc,\"partial link text\":Jc,tagName:Kc,\"tag name" +
    "\":Kc,xpath:V};ba(\"_\",function(a,b){for(var c=b||Ma,d=c.frames.leng" +
    "th,e=0;e<d;e++){var f=c.frames[e];if((f.frameElement||f).name==a)r" +
    "eturn f.document?f:f.contentWindow||Fa(f.contentDocument||f.conten" +
    "tWindow.document)}var g;a:{e={id:a};c=c.document;b:{for(g in e)if(" +
    "e.hasOwnProperty(g))break b;g=null}if(g&&(d=Lc[g])&&da(d.m)){g=d.m" +
    "(e[g],c||Ma.document);break a}throw Error(\"Unsupported locator str" +
    "ategy: \"+g);}for(e=0;e<g.length;e++)if(c=g[e],W(c,\"FRAME\")||W(c,\"I" +
    "FRAME\"))return e=g[e],e.contentWindow||Fa(e.contentDocument||\ne.co" +
    "ntentWindow.document);return null});;return this._.apply(null,argu" +
    "ments);}).apply({navigator:typeof window!=\"undefined\"?window.navig" +
    "ator:null},arguments);}\n"
  )
  .toString();
  static final String FRAME_BY_ID_OR_NAME_ANDROID_license =
    "\n\n Copyright 2014 Software Freedom Conservancy\n\n Licensed under th" +
    "e Apache License, Version 2.0 (the \"License\");\n you may not use th" +
    "is file except in compliance with the License.\n You may obtain a c" +
    "opy of the License at\n\n      http://www.apache.org/licenses/LICENS" +
    "E-2.0\n\n Unless required by applicable law or agreed to in writing," +
    " software\n distributed under the License is distributed on an \"AS " +
    "IS\" BASIS,\n WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either e" +
    "xpress or implied.\n See the License for the specific language gove" +
    "rning permissions and\n limitations under the License.\n";
  private static final String FRAME_BY_ID_OR_NAME_ANDROID_original() {
    return FRAME_BY_ID_OR_NAME_ANDROID.replaceAll("xxx_rpl_lic", FRAME_BY_ID_OR_NAME_ANDROID_license);
  }

/* field: FRAME_BY_INDEX_ANDROID license: 

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
  static final String FRAME_BY_INDEX_ANDROID =
  new StringBuilder(
    "function(){return(function(){function h(a){return function(){retur" +
    "n this[a]}}function k(a){return function(){return a}}var l=this;fu" +
    "nction aa(a,b){var c=a.split(\".\"),d=l;c[0]in d||!d.execScript||d.e" +
    "xecScript(\"var \"+c[0]);for(var e;c.length&&(e=c.shift());)c.length" +
    "||void 0===b?d[e]?d=d[e]:d=d[e]={}:d[e]=b}\nfunction ba(a){var b=ty" +
    "peof a;if(\"object\"==b)if(a){if(a instanceof Array)return\"array\";if" +
    "(a instanceof Object)return b;var c=Object.prototype.toString.call" +
    "(a);if(\"[object Window]\"==c)return\"object\";if(\"[object Array]\"==c|" +
    "|\"number\"==typeof a.length&&\"undefined\"!=typeof a.splice&&\"undefin" +
    "ed\"!=typeof a.propertyIsEnumerable&&!a.propertyIsEnumerable(\"splic" +
    "e\"))return\"array\";if(\"[object Function]\"==c||\"undefined\"!=typeof a" +
    ".call&&\"undefined\"!=typeof a.propertyIsEnumerable&&!a.propertyIsEn" +
    "umerable(\"call\"))return\"function\"}else return\"null\";\nelse if(\"func" +
    "tion\"==b&&\"undefined\"==typeof a.call)return\"object\";return b}funct" +
    "ion m(a){return\"string\"==typeof a}function ca(a,b,c){return a.call" +
    ".apply(a.bind,arguments)}function da(a,b,c){if(!a)throw Error();if" +
    "(2<arguments.length){var d=Array.prototype.slice.call(arguments,2)" +
    ";return function(){var c=Array.prototype.slice.call(arguments);Arr" +
    "ay.prototype.unshift.apply(c,d);return a.apply(b,c)}}return functi" +
    "on(){return a.apply(b,arguments)}}\nfunction ea(a,b,c){ea=Function." +
    "prototype.bind&&-1!=Function.prototype.bind.toString().indexOf(\"na" +
    "tive code\")?ca:da;return ea.apply(null,arguments)}function fa(a,b)" +
    "{var c=Array.prototype.slice.call(arguments,1);return function(){v" +
    "ar b=c.slice();b.push.apply(b,arguments);return a.apply(this,b)}}\n" +
    "function n(a,b){function c(){}c.prototype=b.prototype;a.G=b.protot" +
    "ype;a.prototype=new c;a.prototype.constructor=a;a.F=function(a,c,f" +
    "){for(var g=Array(arguments.length-2),w=2;w<arguments.length;w++)g" +
    "[w-2]=arguments[w];return b.prototype[c].apply(a,g)}};function r(a" +
    "){if(Error.captureStackTrace)Error.captureStackTrace(this,r);else{" +
    "var b=Error().stack;b&&(this.stack=b)}a&&(this.message=String(a))}" +
    "n(r,Error);r.prototype.name=\"CustomError\";function ga(a,b){for(var" +
    " c=a.split(\"%s\"),d=\"\",e=Array.prototype.slice.call(arguments,1);e." +
    "length&&1<c.length;)d+=c.shift()+e.shift();return d+c.join(\"%s\")}v" +
    "ar ha=String.prototype.trim?function(a){return a.trim()}:function(" +
    "a){return a.replace(/^[\\s\\xa0]+|[\\s\\xa0]+$/g,\"\")};function ia(a,b)" +
    "{return a<b?-1:a>b?1:0};function ja(a,b){b.unshift(a);r.call(this," +
    "ga.apply(null,b));b.shift()}n(ja,r);ja.prototype.name=\"AssertionEr" +
    "ror\";function ka(a,b,c){if(!a){var d=\"Assertion failed\";if(b)var d" +
    "=d+(\": \"+b),e=Array.prototype.slice.call(arguments,2);throw new ja" +
    "(\"\"+d,e||[]);}};var t=Array.prototype;function u(a,b){for(var c=a." +
    "length,d=m(a)?a.split(\"\"):a,e=0;e<c;e++)e in d&&b.call(void 0,d[e]" +
    ",e,a)}function v(a,b,c){var d=c;u(a,function(c,f){d=b.call(void 0," +
    "d,c,f,a)});return d}function x(a,b){for(var c=a.length,d=m(a)?a.sp" +
    "lit(\"\"):a,e=0;e<c;e++)if(e in d&&b.call(void 0,d[e],e,a))return!0;" +
    "return!1}function la(a){return t.concat.apply(t,arguments)}functio" +
    "n ma(a,b,c){ka(null!=a.length);return 2>=arguments.length?t.slice." +
    "call(a,b):t.slice.call(a,b,c)};var y;a:{var na=l.navigator;if(na){" +
    "var oa=na.userAgent;if(oa){y=oa;break a}}y=\"\"};function pa(a,b){if" +
    "(a.contains&&1==b.nodeType)return a==b||a.contains(b);if(\"undefine" +
    "d\"!=typeof a.compareDocumentPosition)return a==b||Boolean(a.compar" +
    "eDocumentPosition(b)&16);for(;b&&a!=b;)b=b.parentNode;return b==a}" +
    "\nfunction qa(a,b){if(a==b)return 0;if(a.compareDocumentPosition)re" +
    "turn a.compareDocumentPosition(b)&2?1:-1;if(\"sourceIndex\"in a||a.p" +
    "arentNode&&\"sourceIndex\"in a.parentNode){var c=1==a.nodeType,d=1==" +
    "b.nodeType;if(c&&d)return a.sourceIndex-b.sourceIndex;var e=a.pare" +
    "ntNode,f=b.parentNode;return e==f?ra(a,b):!c&&pa(e,b)?-1*sa(a,b):!" +
    "d&&pa(f,a)?sa(b,a):(c?a.sourceIndex:e.sourceIndex)-(d?b.sourceInde" +
    "x:f.sourceIndex)}ka(a,\"Node cannot be null or undefined.\");d=9==a." +
    "nodeType?a:a.ownerDocument||a.document;c=\nd.createRange();c.select" +
    "Node(a);c.collapse(!0);d=d.createRange();d.selectNode(b);d.collaps" +
    "e(!0);return c.compareBoundaryPoints(l.Range.START_TO_END,d)}funct" +
    "ion sa(a,b){var c=a.parentNode;if(c==b)return-1;for(var d=b;d.pare" +
    "ntNode!=c;)d=d.parentNode;return ra(d,a)}function ra(a,b){for(var " +
    "c=b;c=c.previousSibling;)if(c==a)return-1;return 1};/*xxx_rpl_lic*" +
    "/\nvar ta=window;function ua(a){return(a=a.exec(y))?a[1]:\"\"}ua(/And" +
    "roid\\s+([0-9.]+)/)||ua(/Version\\/([0-9.]+)/);function va(a){var b=" +
    "0,c=ha(String(wa)).split(\".\");a=ha(String(a)).split(\".\");for(var d" +
    "=Math.max(c.length,a.length),e=0;0==b&&e<d;e++){var f=c[e]||\"\",g=a" +
    "[e]||\"\",w=RegExp(\"(\\\\d*)(\\\\D*)\",\"g\"),p=RegExp(\"(\\\\d*)(\\\\D*)\",\"g\");" +
    "do{var q=w.exec(f)||[\"\",\"\",\"\"],C=p.exec(g)||[\"\",\"\",\"\"];if(0==q[0]." +
    "length&&0==C[0].length)break;b=ia(0==q[1].length?0:parseInt(q[1],1" +
    "0),0==C[1].length?0:parseInt(C[1],10))||ia(0==q[2].length,0==C[2]." +
    "length)||ia(q[2],C[2])}while(0==b)}}\nvar xa=/Android\\s+([0-9\\.]+)/" +
    ".exec(y),wa=xa?xa[1]:\"0\";va(2.3);va(4);/*\n\n The MIT License\n\n Copy" +
    "right (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n" +
    " Permission is hereby granted, free of charge, to any person obtai" +
    "ning a copy\n of this software and associated documentation files (" +
    "the \"Software\"), to\n deal in the Software without restriction, inc" +
    "luding without limitation the\n rights to use, copy, modify, merge," +
    " publish, distribute, sublicense, and/or\n sell copies of the Softw" +
    "are, and to permit persons to whom the Software is\n furnished to d" +
    "o so, subject to the following conditions:\n\n The above copyright n" +
    "otice and this permission notice shall be included in\n all copies " +
    "or substantial portions of the Software.\n\n THE SOFTWARE IS PROVIDE" +
    "D \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCL" +
    "UDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNE" +
    "SS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL" +
    " THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGE" +
    "S OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR O" +
    "THERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE" +
    " OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction z(a,b," +
    "c){this.a=a;this.b=b||1;this.f=c||1};function ya(a){this.b=a;this." +
    "a=0}function za(a){a=a.match(Aa);for(var b=0;b<a.length;b++)Ba.tes" +
    "t(a[b])&&a.splice(b,1);return new ya(a)}var Aa=RegExp(\"\\\\$?(?:(?![" +
    "0-9-])[\\\\w-]+:)?(?![0-9-])[\\\\w-]+|\\\\/\\\\/|\\\\.\\\\.|::|\\\\d+(?:\\\\.\\\\d*)" +
    "?|\\\\.\\\\d+|\\\"[^\\\"]*\\\"|'[^']*'|[!<>]=|\\\\s+|.\",\"g\"),Ba=/^\\s/;function" +
    " A(a,b){return a.b[a.a+(b||0)]}function B(a){return a.b[a.a++]}fun" +
    "ction Ca(a){return a.b.length<=a.a};function D(a){var b=null,c=a.n" +
    "odeType;1==c&&(b=a.textContent,b=void 0==b||null==b?a.innerText:b," +
    "b=void 0==b||null==b?\"\":b);if(\"string\"!=typeof b)if(9==c||1==c){a=" +
    "9==c?a.documentElement:a.firstChild;for(var c=0,d=[],b=\"\";a;){do 1" +
    "!=a.nodeType&&(b+=a.nodeValue),d[c++]=a;while(a=a.firstChild);for(" +
    ";c&&!(a=d[--c].nextSibling););}}else b=a.nodeValue;return\"\"+b}\nfun" +
    "ction E(a,b,c){if(null===b)return!0;try{if(!a.getAttribute)return!" +
    "1}catch(d){return!1}return null==c?!!a.getAttribute(b):a.getAttrib" +
    "ute(b,2)==c}function F(a,b,c,d,e){return Da.call(null,a,b,m(c)?c:n" +
    "ull,m(d)?d:null,e||new G)}\nfunction Da(a,b,c,d,e){b.getElementsByN" +
    "ame&&d&&\"name\"==c?(b=b.getElementsByName(d),u(b,function(b){a.a(b)" +
    "&&H(e,b)})):b.getElementsByClassName&&d&&\"class\"==c?(b=b.getElemen" +
    "tsByClassName(d),u(b,function(b){b.className==d&&a.a(b)&&H(e,b)}))" +
    ":a instanceof I?Ea(a,b,c,d,e):b.getElementsByTagName&&(b=b.getElem" +
    "entsByTagName(a.f()),u(b,function(a){E(a,c,d)&&H(e,a)}));return e}" +
    "function Fa(a,b,c,d,e){for(b=b.firstChild;b;b=b.nextSibling)E(b,c," +
    "d)&&a.a(b)&&H(e,b);return e}\nfunction Ea(a,b,c,d,e){for(b=b.firstC" +
    "hild;b;b=b.nextSibling)E(b,c,d)&&a.a(b)&&H(e,b),Ea(a,b,c,d,e)};fun" +
    "ction G(){this.b=this.a=null;this.l=0}function Ga(a){this.node=a;t" +
    "his.a=this.b=null}function Ha(a,b){if(!a.a)return b;if(!b.a)return" +
    " a;for(var c=a.a,d=b.a,e=null,f=null,g=0;c&&d;)c.node==d.node?(f=c" +
    ",c=c.a,d=d.a):0<qa(c.node,d.node)?(f=d,d=d.a):(f=c,c=c.a),(f.b=e)?" +
    "e.a=f:a.a=f,e=f,g++;for(f=c||d;f;)f.b=e,e=e.a=f,g++,f=f.a;a.b=e;a." +
    "l=g;return a}function Ia(a,b){var c=new Ga(b);c.a=a.a;a.b?a.a.b=c:" +
    "a.a=a.b=c;a.a=c;a.l++}function H(a,b){var c=new Ga(b);c.b=a.b;a.a?" +
    "a.b.a=c:a.a=a.b=c;a.b=c;a.l++}\nfunction Ja(a){return(a=a.a)?a.node" +
    ":null}function Ka(a){return(a=Ja(a))?D(a):\"\"}function J(a,b){retur" +
    "n new La(a,!!b)}function La(a,b){this.f=a;this.b=(this.c=b)?a.b:a." +
    "a;this.a=null}function K(a){var b=a.b;if(null==b)return null;var c" +
    "=a.a=b;a.b=a.c?b.b:b.a;return c.node};function Ma(a){switch(a.node" +
    "Type){case 1:return fa(Na,a);case 9:return Ma(a.documentElement);c" +
    "ase 11:case 10:case 6:case 12:return Oa;default:return a.parentNod" +
    "e?Ma(a.parentNode):Oa}}function Oa(){return null}function Na(a,b){" +
    "if(a.prefix==b)return a.namespaceURI||\"http://www.w3.org/1999/xhtm" +
    "l\";var c=a.getAttributeNode(\"xmlns:\"+b);return c&&c.specified?c.va" +
    "lue||null:a.parentNode&&9!=a.parentNode.nodeType?Na(a.parentNode,b" +
    "):null};function L(a){this.i=a;this.b=this.g=!1;this.f=null}functi" +
    "on M(a){return\"\\n  \"+a.toString().split(\"\\n\").join(\"\\n  \")}functio" +
    "n Pa(a,b){a.g=b}function Qa(a,b){a.b=b}function N(a,b){var c=a.a(b" +
    ");return c instanceof G?+Ka(c):+c}function O(a,b){var c=a.a(b);ret" +
    "urn c instanceof G?Ka(c):\"\"+c}function P(a,b){var c=a.a(b);return " +
    "c instanceof G?!!c.l:!!c};function Q(a,b,c){L.call(this,a.i);this." +
    "c=a;this.h=b;this.o=c;this.g=b.g||c.g;this.b=b.b||c.b;this.c==Ra&&" +
    "(c.b||c.g||4==c.i||0==c.i||!b.f?b.b||b.g||4==b.i||0==b.i||!c.f||(t" +
    "his.f={name:c.f.name,s:b}):this.f={name:b.f.name,s:c})}n(Q,L);\nfun" +
    "ction R(a,b,c,d,e){b=b.a(d);c=c.a(d);var f;if(b instanceof G&&c in" +
    "stanceof G){e=J(b);for(d=K(e);d;d=K(e))for(b=J(c),f=K(b);f;f=K(b))" +
    "if(a(D(d),D(f)))return!0;return!1}if(b instanceof G||c instanceof " +
    "G){b instanceof G?e=b:(e=c,c=b);e=J(e);b=typeof c;for(d=K(e);d;d=K" +
    "(e)){switch(b){case \"number\":d=+D(d);break;case \"boolean\":d=!!D(d)" +
    ";break;case \"string\":d=D(d);break;default:throw Error(\"Illegal pri" +
    "mitive type for comparison.\");}if(a(d,c))return!0}return!1}return " +
    "e?\"boolean\"==typeof b||\"boolean\"==typeof c?\na(!!b,!!c):\"number\"==t" +
    "ypeof b||\"number\"==typeof c?a(+b,+c):a(b,c):a(+b,+c)}Q.prototype.a" +
    "=function(a){return this.c.m(this.h,this.o,a)};Q.prototype.toStrin" +
    "g=function(){var a=\"Binary Expression: \"+this.c,a=a+M(this.h);retu" +
    "rn a+=M(this.o)};function Sa(a,b,c,d){this.a=a;this.w=b;this.i=c;t" +
    "his.m=d}Sa.prototype.toString=h(\"a\");var Ta={};function S(a,b,c,d)" +
    "{if(Ta.hasOwnProperty(a))throw Error(\"Binary operator already crea" +
    "ted: \"+a);a=new Sa(a,b,c,d);return Ta[a.toString()]=a}\nS(\"div\",6,1" +
    ",function(a,b,c){return N(a,c)/N(b,c)});S(\"mod\",6,1,function(a,b,c" +
    "){return N(a,c)%N(b,c)});S(\"*\",6,1,function(a,b,c){return N(a,c)*N" +
    "(b,c)});S(\"+\",5,1,function(a,b,c){return N(a,c)+N(b,c)});S(\"-\",5,1" +
    ",function(a,b,c){return N(a,c)-N(b,c)});S(\"<\",4,2,function(a,b,c){" +
    "return R(function(a,b){return a<b},a,b,c)});S(\">\",4,2,function(a,b" +
    ",c){return R(function(a,b){return a>b},a,b,c)});S(\"<=\",4,2,functio" +
    "n(a,b,c){return R(function(a,b){return a<=b},a,b,c)});\nS(\">=\",4,2," +
    "function(a,b,c){return R(function(a,b){return a>=b},a,b,c)});var R" +
    "a=S(\"=\",3,2,function(a,b,c){return R(function(a,b){return a==b},a," +
    "b,c,!0)});S(\"!=\",3,2,function(a,b,c){return R(function(a,b){return" +
    " a!=b},a,b,c,!0)});S(\"and\",2,2,function(a,b,c){return P(a,c)&&P(b," +
    "c)});S(\"or\",1,2,function(a,b,c){return P(a,c)||P(b,c)});function U" +
    "a(a,b){if(b.a.length&&4!=a.i)throw Error(\"Primary expression must " +
    "evaluate to nodeset if filter has predicate(s).\");L.call(this,a.i)" +
    ";this.c=a;this.h=b;this.g=a.g;this.b=a.b}n(Ua,L);Ua.prototype.a=fu" +
    "nction(a){a=this.c.a(a);return Va(this.h,a)};Ua.prototype.toString" +
    "=function(){var a;a=\"Filter:\"+M(this.c);return a+=M(this.h)};funct" +
    "ion Wa(a,b){if(b.length<a.A)throw Error(\"Function \"+a.j+\" expects " +
    "at least\"+a.A+\" arguments, \"+b.length+\" given\");if(null!==a.v&&b.l" +
    "ength>a.v)throw Error(\"Function \"+a.j+\" expects at most \"+a.v+\" ar" +
    "guments, \"+b.length+\" given\");a.B&&u(b,function(b,d){if(4!=b.i)thr" +
    "ow Error(\"Argument \"+d+\" to function \"+a.j+\" is not of type Nodese" +
    "t: \"+b);});L.call(this,a.i);this.h=a;this.c=b;Pa(this,a.g||x(b,fun" +
    "ction(a){return a.g}));Qa(this,a.D&&!b.length||a.C&&!!b.length||x(" +
    "b,function(a){return a.b}))}n(Wa,L);\nWa.prototype.a=function(a){re" +
    "turn this.h.m.apply(null,la(a,this.c))};Wa.prototype.toString=func" +
    "tion(){var a=\"Function: \"+this.h;if(this.c.length)var b=v(this.c,f" +
    "unction(a,b){return a+M(b)},\"Arguments:\"),a=a+M(b);return a};funct" +
    "ion Xa(a,b,c,d,e,f,g,w,p){this.j=a;this.i=b;this.g=c;this.D=d;this" +
    ".C=e;this.m=f;this.A=g;this.v=void 0!==w?w:g;this.B=!!p}Xa.prototy" +
    "pe.toString=h(\"j\");var Ya={};\nfunction T(a,b,c,d,e,f,g,w){if(Ya.ha" +
    "sOwnProperty(a))throw Error(\"Function already created: \"+a+\".\");Ya" +
    "[a]=new Xa(a,b,c,d,!1,e,f,g,w)}T(\"boolean\",2,!1,!1,function(a,b){r" +
    "eturn P(b,a)},1);T(\"ceiling\",1,!1,!1,function(a,b){return Math.cei" +
    "l(N(b,a))},1);T(\"concat\",3,!1,!1,function(a,b){var c=ma(arguments," +
    "1);return v(c,function(b,c){return b+O(c,a)},\"\")},2,null);T(\"conta" +
    "ins\",2,!1,!1,function(a,b,c){b=O(b,a);a=O(c,a);return-1!=b.indexOf" +
    "(a)},2);T(\"count\",1,!1,!1,function(a,b){return b.a(a).l},1,1,!0);\n" +
    "T(\"false\",2,!1,!1,k(!1),0);T(\"floor\",1,!1,!1,function(a,b){return " +
    "Math.floor(N(b,a))},1);T(\"id\",4,!1,!1,function(a,b){var c=a.a,d=9=" +
    "=c.nodeType?c:c.ownerDocument,c=O(b,a).split(/\\s+/),e=[];u(c,funct" +
    "ion(a){a=d.getElementById(a);var b;if(!(b=!a)){a:if(m(e))b=m(a)&&1" +
    "==a.length?e.indexOf(a,0):-1;else{for(b=0;b<e.length;b++)if(b in e" +
    "&&e[b]===a)break a;b=-1}b=0<=b}b||e.push(a)});e.sort(qa);var f=new" +
    " G;u(e,function(a){H(f,a)});return f},1);T(\"lang\",2,!1,!1,k(!1),1)" +
    ";\nT(\"last\",1,!0,!1,function(a){if(1!=arguments.length)throw Error(" +
    "\"Function last expects ()\");return a.f},0);T(\"local-name\",3,!1,!0," +
    "function(a,b){var c=b?Ja(b.a(a)):a.a;return c?c.localName||c.nodeN" +
    "ame.toLowerCase():\"\"},0,1,!0);T(\"name\",3,!1,!0,function(a,b){var c" +
    "=b?Ja(b.a(a)):a.a;return c?c.nodeName.toLowerCase():\"\"},0,1,!0);T(" +
    "\"namespace-uri\",3,!0,!1,k(\"\"),0,1,!0);T(\"normalize-space\",3,!1,!0," +
    "function(a,b){return(b?O(b,a):D(a.a)).replace(/[\\s\\xa0]+/g,\" \").re" +
    "place(/^\\s+|\\s+$/g,\"\")},0,1);\nT(\"not\",2,!1,!1,function(a,b){return" +
    "!P(b,a)},1);T(\"number\",1,!1,!0,function(a,b){return b?N(b,a):+D(a." +
    "a)},0,1);T(\"position\",1,!0,!1,function(a){return a.b},0);T(\"round\"" +
    ",1,!1,!1,function(a,b){return Math.round(N(b,a))},1);T(\"starts-wit" +
    "h\",2,!1,!1,function(a,b,c){b=O(b,a);a=O(c,a);return 0==b.lastIndex" +
    "Of(a,0)},2);T(\"string\",3,!1,!0,function(a,b){return b?O(b,a):D(a.a" +
    ")},0,1);T(\"string-length\",1,!1,!0,function(a,b){return(b?O(b,a):D(" +
    "a.a)).length},0,1);\nT(\"substring\",3,!1,!1,function(a,b,c,d){c=N(c," +
    "a);if(isNaN(c)||Infinity==c||-Infinity==c)return\"\";d=d?N(d,a):Infi" +
    "nity;if(isNaN(d)||-Infinity===d)return\"\";c=Math.round(c)-1;var e=M" +
    "ath.max(c,0);a=O(b,a);if(Infinity==d)return a.substring(e);b=Math." +
    "round(d);return a.substring(e,c+b)},2,3);T(\"substring-after\",3,!1," +
    "!1,function(a,b,c){b=O(b,a);a=O(c,a);c=b.indexOf(a);return-1==c?\"\"" +
    ":b.substring(c+a.length)},2);\nT(\"substring-before\",3,!1,!1,functio" +
    "n(a,b,c){b=O(b,a);a=O(c,a);a=b.indexOf(a);return-1==a?\"\":b.substri" +
    "ng(0,a)},2);T(\"sum\",1,!1,!1,function(a,b){for(var c=J(b.a(a)),d=0," +
    "e=K(c);e;e=K(c))d+=+D(e);return d},1,1,!0);T(\"translate\",3,!1,!1,f" +
    "unction(a,b,c,d){b=O(b,a);c=O(c,a);var e=O(d,a);a=[];for(d=0;d<c.l" +
    "ength;d++){var f=c.charAt(d);f in a||(a[f]=e.charAt(d))}c=\"\";for(d" +
    "=0;d<b.length;d++)f=b.charAt(d),c+=f in a?a[f]:f;return c},3);T(\"t" +
    "rue\",2,!1,!1,k(!0),0);function I(a,b){this.h=a;this.c=void 0!==b?b" +
    ":null;this.b=null;switch(a){case \"comment\":this.b=8;break;case \"te" +
    "xt\":this.b=3;break;case \"processing-instruction\":this.b=7;break;ca" +
    "se \"node\":break;default:throw Error(\"Unexpected argument\");}}funct" +
    "ion Za(a){return\"comment\"==a||\"text\"==a||\"processing-instruction\"=" +
    "=a||\"node\"==a}I.prototype.a=function(a){return null===this.b||this" +
    ".b==a.nodeType};I.prototype.f=h(\"h\");I.prototype.toString=function" +
    "(){var a=\"Kind Test: \"+this.h;null===this.c||(a+=M(this.c));return" +
    " a};function $a(a){L.call(this,3);this.c=a.substring(1,a.length-1)" +
    "}n($a,L);$a.prototype.a=h(\"c\");$a.prototype.toString=function(){re" +
    "turn\"Literal: \"+this.c};function U(a,b){this.j=a.toLowerCase();thi" +
    "s.b=b?b.toLowerCase():\"http://www.w3.org/1999/xhtml\"}U.prototype.a" +
    "=function(a){var b=a.nodeType;return 1!=b&&2!=b?!1:\"*\"!=this.j&&th" +
    "is.j!=a.nodeName.toLowerCase()?!1:this.b==(a.namespaceURI?a.namesp" +
    "aceURI.toLowerCase():\"http://www.w3.org/1999/xhtml\")};U.prototype." +
    "f=h(\"j\");U.prototype.toString=function(){return\"Name Test: \"+(\"htt" +
    "p://www.w3.org/1999/xhtml\"==this.b?\"\":this.b+\":\")+this.j};function" +
    " ab(a){L.call(this,1);this.c=a}n(ab,L);ab.prototype.a=h(\"c\");ab.pr" +
    "ototype.toString=function(){return\"Number: \"+this.c};function bb(a" +
    ",b){L.call(this,a.i);this.h=a;this.c=b;this.g=a.g;this.b=a.b;if(1=" +
    "=this.c.length){var c=this.c[0];c.u||c.c!=cb||(c=c.o,\"*\"!=c.f()&&(" +
    "this.f={name:c.f(),s:null}))}}n(bb,L);function V(){L.call(this,4)}" +
    "n(V,L);V.prototype.a=function(a){var b=new G;a=a.a;9==a.nodeType?H" +
    "(b,a):H(b,a.ownerDocument);return b};V.prototype.toString=k(\"Root " +
    "Helper Expression\");function db(){L.call(this,4)}n(db,L);db.protot" +
    "ype.a=function(a){var b=new G;H(b,a.a);return b};db.prototype.toSt" +
    "ring=k(\"Context Helper Expression\");\nfunction eb(a){return\"/\"==a||" +
    "\"//\"==a}bb.prototype.a=function(a){var b=this.h.a(a);if(!(b instan" +
    "ceof G))throw Error(\"Filter expression must evaluate to nodeset.\")" +
    ";a=this.c;for(var c=0,d=a.length;c<d&&b.l;c++){var e=a[c],f=J(b,e." +
    "c.a),g;if(e.g||e.c!=fb)if(e.g||e.c!=gb)for(g=K(f),b=e.a(new z(g));" +
    "null!=(g=K(f));)g=e.a(new z(g)),b=Ha(b,g);else g=K(f),b=e.a(new z(" +
    "g));else{for(g=K(f);(b=K(f))&&(!g.contains||g.contains(b))&&b.comp" +
    "areDocumentPosition(g)&8;g=b);b=e.a(new z(g))}}return b};\nbb.proto" +
    "type.toString=function(){var a;a=\"Path Expression:\"+M(this.h);if(t" +
    "his.c.length){var b=v(this.c,function(a,b){return a+M(b)},\"Steps:\"" +
    ");a+=M(b)}return a};function hb(a,b){this.a=a;this.b=!!b}\nfunction" +
    " Va(a,b,c){for(c=c||0;c<a.a.length;c++)for(var d=a.a[c],e=J(b),f=b" +
    ".l,g,w=0;g=K(e);w++){var p=a.b?f-w:w+1;g=d.a(new z(g,p,f));if(\"num" +
    "ber\"==typeof g)p=p==g;else if(\"string\"==typeof g||\"boolean\"==typeo" +
    "f g)p=!!g;else if(g instanceof G)p=0<g.l;else throw Error(\"Predica" +
    "te.evaluate returned an unexpected type.\");if(!p){p=e;g=p.f;var q=" +
    "p.a;if(!q)throw Error(\"Next must be called at least once before re" +
    "move.\");var C=q.b,q=q.a;C?C.a=q:g.a=q;q?q.b=C:g.b=C;g.l--;p.a=null" +
    "}}return b}\nhb.prototype.toString=function(){return v(this.a,funct" +
    "ion(a,b){return a+M(b)},\"Predicates:\")};function W(a,b,c,d){L.call" +
    "(this,4);this.c=a;this.o=b;this.h=c||new hb([]);this.u=!!d;b=this." +
    "h;b=0<b.a.length?b.a[0].f:null;a.b&&b&&(this.f={name:b.name,s:b.s}" +
    ");a:{a=this.h;for(b=0;b<a.a.length;b++)if(c=a.a[b],c.g||1==c.i||0=" +
    "=c.i){a=!0;break a}a=!1}this.g=a}n(W,L);\nW.prototype.a=function(a)" +
    "{var b=a.a,c=null,c=this.f,d=null,e=null,f=0;c&&(d=c.name,e=c.s?O(" +
    "c.s,a):null,f=1);if(this.u)if(this.g||this.c!=ib)if(a=J((new W(jb," +
    "new I(\"node\"))).a(a)),b=K(a))for(c=this.m(b,d,e,f);null!=(b=K(a));" +
    ")c=Ha(c,this.m(b,d,e,f));else c=new G;else c=F(this.o,b,d,e),c=Va(" +
    "this.h,c,f);else c=this.m(a.a,d,e,f);return c};W.prototype.m=funct" +
    "ion(a,b,c,d){a=this.c.f(this.o,a,b,c);return a=Va(this.h,a,d)};\nW." +
    "prototype.toString=function(){var a;a=\"Step:\"+M(\"Operator: \"+(this" +
    ".u?\"//\":\"/\"));this.c.j&&(a+=M(\"Axis: \"+this.c));a+=M(this.o);if(th" +
    "is.h.a.length){var b=v(this.h.a,function(a,b){return a+M(b)},\"Pred" +
    "icates:\");a+=M(b)}return a};function kb(a,b,c,d){this.j=a;this.f=b" +
    ";this.a=c;this.b=d}kb.prototype.toString=h(\"j\");var lb={};function" +
    " X(a,b,c,d){if(lb.hasOwnProperty(a))throw Error(\"Axis already crea" +
    "ted: \"+a);b=new kb(a,b,c,!!d);return lb[a]=b}\nX(\"ancestor\",functio" +
    "n(a,b){for(var c=new G,d=b;d=d.parentNode;)a.a(d)&&Ia(c,d);return " +
    "c},!0);X(\"ancestor-or-self\",function(a,b){var c=new G,d=b;do a.a(d" +
    ")&&Ia(c,d);while(d=d.parentNode);return c},!0);var cb=X(\"attribute" +
    "\",function(a,b){var c=new G,d=a.f(),e=b.attributes;if(e)if(a insta" +
    "nceof I&&null===a.b||\"*\"==d)for(var d=0,f;f=e[d];d++)H(c,f);else(f" +
    "=e.getNamedItem(d))&&H(c,f);return c},!1),ib=X(\"child\",function(a," +
    "b,c,d,e){return Fa.call(null,a,b,m(c)?c:null,m(d)?d:null,e||new G)" +
    "},!1,!0);\nX(\"descendant\",F,!1,!0);var jb=X(\"descendant-or-self\",fu" +
    "nction(a,b,c,d){var e=new G;E(b,c,d)&&a.a(b)&&H(e,b);return F(a,b," +
    "c,d,e)},!1,!0),fb=X(\"following\",function(a,b,c,d){var e=new G;do f" +
    "or(var f=b;f=f.nextSibling;)E(f,c,d)&&a.a(f)&&H(e,f),e=F(a,f,c,d,e" +
    ");while(b=b.parentNode);return e},!1,!0);X(\"following-sibling\",fun" +
    "ction(a,b){for(var c=new G,d=b;d=d.nextSibling;)a.a(d)&&H(c,d);ret" +
    "urn c},!1);X(\"namespace\",function(){return new G},!1);\nvar mb=X(\"p" +
    "arent\",function(a,b){var c=new G;if(9==b.nodeType)return c;if(2==b" +
    ".nodeType)return H(c,b.ownerElement),c;var d=b.parentNode;a.a(d)&&" +
    "H(c,d);return c},!1),gb=X(\"preceding\",function(a,b,c,d){var e=new " +
    "G,f=[];do f.unshift(b);while(b=b.parentNode);for(var g=1,w=f.lengt" +
    "h;g<w;g++){var p=[];for(b=f[g];b=b.previousSibling;)p.unshift(b);f" +
    "or(var q=0,C=p.length;q<C;q++)b=p[q],E(b,c,d)&&a.a(b)&&H(e,b),e=F(" +
    "a,b,c,d,e)}return e},!0,!0);\nX(\"preceding-sibling\",function(a,b){f" +
    "or(var c=new G,d=b;d=d.previousSibling;)a.a(d)&&Ia(c,d);return c}," +
    "!0);var nb=X(\"self\",function(a,b){var c=new G;a.a(b)&&H(c,b);retur" +
    "n c},!1);function ob(a){L.call(this,1);this.c=a;this.g=a.g;this.b=" +
    "a.b}n(ob,L);ob.prototype.a=function(a){return-N(this.c,a)};ob.prot" +
    "otype.toString=function(){return\"Unary Expression: -\"+M(this.c)};f" +
    "unction pb(a){L.call(this,4);this.c=a;Pa(this,x(this.c,function(a)" +
    "{return a.g}));Qa(this,x(this.c,function(a){return a.b}))}n(pb,L);" +
    "pb.prototype.a=function(a){var b=new G;u(this.c,function(c){c=c.a(" +
    "a);if(!(c instanceof G))throw Error(\"Path expression must evaluate" +
    " to NodeSet.\");b=Ha(b,c)});return b};pb.prototype.toString=functio" +
    "n(){return v(this.c,function(a,b){return a+M(b)},\"Union Expression" +
    ":\")};function qb(a,b){this.a=a;this.b=b}function rb(a){for(var b,c" +
    "=[];;){Y(a,\"Missing right hand side of binary expression.\");b=sb(a" +
    ");var d=B(a.a);if(!d)break;var e=(d=Ta[d]||null)&&d.w;if(!e){a.a.a" +
    "--;break}for(;c.length&&e<=c[c.length-1].w;)b=new Q(c.pop(),c.pop(" +
    "),b);c.push(b,d)}for(;c.length;)b=new Q(c.pop(),c.pop(),b);return " +
    "b}function Y(a,b){if(Ca(a.a))throw Error(b);}function tb(a,b){var " +
    "c=B(a.a);if(c!=b)throw Error(\"Bad token, expected: \"+b+\" got: \"+c)" +
    ";}\nfunction ub(a){a=B(a.a);if(\")\"!=a)throw Error(\"Bad token: \"+a);" +
    "}function vb(a){a=B(a.a);if(2>a.length)throw Error(\"Unclosed liter" +
    "al string\");return new $a(a)}function wb(a){var b=B(a.a),c=b.index" +
    "Of(\":\");if(-1==c)return new U(b);var d=b.substring(0,c);a=a.b(d);i" +
    "f(!a)throw Error(\"Namespace prefix not declared: \"+d);b=b.substr(c" +
    "+1);return new U(b,a)}\nfunction xb(a){var b,c=[],d;if(eb(A(a.a))){" +
    "b=B(a.a);d=A(a.a);if(\"/\"==b&&(Ca(a.a)||\".\"!=d&&\"..\"!=d&&\"@\"!=d&&\"*" +
    "\"!=d&&!/(?![0-9])[\\w]/.test(d)))return new V;d=new V;Y(a,\"Missing " +
    "next location step.\");b=yb(a,b);c.push(b)}else{a:{b=A(a.a);d=b.cha" +
    "rAt(0);switch(d){case \"$\":throw Error(\"Variable reference not allo" +
    "wed in HTML XPath\");case \"(\":B(a.a);b=rb(a);Y(a,'unclosed \"(\"');tb" +
    "(a,\")\");break;case '\"':case \"'\":b=vb(a);break;default:if(isNaN(+b)" +
    ")if(!Za(b)&&/(?![0-9])[\\w]/.test(d)&&\"(\"==A(a.a,1)){b=B(a.a);b=\nYa" +
    "[b]||null;B(a.a);for(d=[];\")\"!=A(a.a);){Y(a,\"Missing function argu" +
    "ment list.\");d.push(rb(a));if(\",\"!=A(a.a))break;B(a.a)}Y(a,\"Unclos" +
    "ed function argument list.\");ub(a);b=new Wa(b,d)}else{b=null;break" +
    " a}else b=new ab(+B(a.a))}\"[\"==A(a.a)&&(d=new hb(zb(a)),b=new Ua(b" +
    ",d))}if(b)if(eb(A(a.a)))d=b;else return b;else b=yb(a,\"/\"),d=new d" +
    "b,c.push(b)}for(;eb(A(a.a));)b=B(a.a),Y(a,\"Missing next location s" +
    "tep.\"),b=yb(a,b),c.push(b);return new bb(d,c)}\nfunction yb(a,b){va" +
    "r c,d,e;if(\"/\"!=b&&\"//\"!=b)throw Error('Step op should be \"/\" or \"" +
    "//\"');if(\".\"==A(a.a))return d=new W(nb,new I(\"node\")),B(a.a),d;if(" +
    "\"..\"==A(a.a))return d=new W(mb,new I(\"node\")),B(a.a),d;var f;if(\"@" +
    "\"==A(a.a))f=cb,B(a.a),Y(a,\"Missing attribute name\");else if(\"::\"==" +
    "A(a.a,1)){if(!/(?![0-9])[\\w]/.test(A(a.a).charAt(0)))throw Error(\"" +
    "Bad token: \"+B(a.a));c=B(a.a);f=lb[c]||null;if(!f)throw Error(\"No " +
    "axis with name: \"+c);B(a.a);Y(a,\"Missing node name\")}else f=ib;c=A" +
    "(a.a);if(/(?![0-9])[\\w]/.test(c.charAt(0)))if(\"(\"==\nA(a.a,1)){if(!" +
    "Za(c))throw Error(\"Invalid node type: \"+c);c=B(a.a);if(!Za(c))thro" +
    "w Error(\"Invalid type name: \"+c);tb(a,\"(\");Y(a,\"Bad nodetype\");e=A" +
    "(a.a).charAt(0);var g=null;if('\"'==e||\"'\"==e)g=vb(a);Y(a,\"Bad node" +
    "type\");ub(a);c=new I(c,g)}else c=wb(a);else if(\"*\"==c)c=wb(a);else" +
    " throw Error(\"Bad token: \"+B(a.a));e=new hb(zb(a),f.a);return d||n" +
    "ew W(f,c,e,\"//\"==b)}\nfunction zb(a){for(var b=[];\"[\"==A(a.a);){B(a" +
    ".a);Y(a,\"Missing predicate expression.\");var c=rb(a);b.push(c);Y(a" +
    ",\"Unclosed predicate expression.\");tb(a,\"]\")}return b}function sb(" +
    "a){if(\"-\"==A(a.a))return B(a.a),new ob(sb(a));var b=xb(a);if(\"|\"!=" +
    "A(a.a))a=b;else{for(b=[b];\"|\"==B(a.a);)Y(a,\"Missing next union loc" +
    "ation path.\"),b.push(xb(a));a.a.a--;a=new pb(b)}return a};function" +
    " Ab(a,b){if(!a.length)throw Error(\"Empty XPath expression.\");var c" +
    "=za(a);if(Ca(c))throw Error(\"Invalid XPath expression.\");b?\"functi" +
    "on\"==ba(b)||(b=ea(b.lookupNamespaceURI,b)):b=k(null);var d=rb(new " +
    "qb(c,b));if(!Ca(c))throw Error(\"Bad token: \"+B(c));this.evaluate=f" +
    "unction(a,b){var c=d.a(new z(a));return new Z(c,b)}}\nfunction Z(a," +
    "b){if(0==b)if(a instanceof G)b=4;else if(\"string\"==typeof a)b=2;el" +
    "se if(\"number\"==typeof a)b=1;else if(\"boolean\"==typeof a)b=3;else " +
    "throw Error(\"Unexpected evaluation result.\");if(2!=b&&1!=b&&3!=b&&" +
    "!(a instanceof G))throw Error(\"value could not be converted to the" +
    " specified type\");this.resultType=b;var c;switch(b){case 2:this.st" +
    "ringValue=a instanceof G?Ka(a):\"\"+a;break;case 1:this.numberValue=" +
    "a instanceof G?+Ka(a):+a;break;case 3:this.booleanValue=a instance" +
    "of G?0<a.l:!!a;break;case 4:case 5:case 6:case 7:var d=\nJ(a);c=[];" +
    "for(var e=K(d);e;e=K(d))c.push(e);this.snapshotLength=a.l;this.inv" +
    "alidIteratorState=!1;break;case 8:case 9:this.singleNodeValue=Ja(a" +
    ");break;default:throw Error(\"Unknown XPathResult type.\");}var f=0;" +
    "this.iterateNext=function(){if(4!=b&&5!=b)throw Error(\"iterateNext" +
    " called with wrong result type\");return f>=c.length?null:c[f++]};t" +
    "his.snapshotItem=function(a){if(6!=b&&7!=b)throw Error(\"snapshotIt" +
    "em called with wrong result type\");return a>=c.length||0>a?null:c[" +
    "a]}}Z.ANY_TYPE=0;\nZ.NUMBER_TYPE=1;Z.STRING_TYPE=2;Z.BOOLEAN_TYPE=3" +
    ";Z.UNORDERED_NODE_ITERATOR_TYPE=4;Z.ORDERED_NODE_ITERATOR_TYPE=5;Z" +
    ".UNORDERED_NODE_SNAPSHOT_TYPE=6;Z.ORDERED_NODE_SNAPSHOT_TYPE=7;Z.A" +
    "NY_UNORDERED_NODE_TYPE=8;Z.FIRST_ORDERED_NODE_TYPE=9;function Bb(a" +
    "){this.lookupNamespaceURI=Ma(a)}aa(\"wgxpath.install\",function(a){a" +
    "=a||l;var b=a.document;b.evaluate||(a.XPathResult=Z,b.evaluate=fun" +
    "ction(a,b,e,f){return(new Ab(a,e)).evaluate(b,f)},b.createExpressi" +
    "on=function(a,b){return new Ab(a,b)},b.createNSResolver=function(a" +
    "){return new Bb(a)})});aa(\"_\",function(a,b){return(b||ta).frames[a" +
    "]||null});;return this._.apply(null,arguments);}).apply({navigator"
  )
      .append(
    ":typeof window!=\"undefined\"?window.navigator:null},arguments);}\n"
  )
  .toString();
  static final String FRAME_BY_INDEX_ANDROID_license =
    "\n\n Copyright 2014 Software Freedom Conservancy\n\n Licensed under th" +
    "e Apache License, Version 2.0 (the \"License\");\n you may not use th" +
    "is file except in compliance with the License.\n You may obtain a c" +
    "opy of the License at\n\n      http://www.apache.org/licenses/LICENS" +
    "E-2.0\n\n Unless required by applicable law or agreed to in writing," +
    " software\n distributed under the License is distributed on an \"AS " +
    "IS\" BASIS,\n WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either e" +
    "xpress or implied.\n See the License for the specific language gove" +
    "rning permissions and\n limitations under the License.\n";
  private static final String FRAME_BY_INDEX_ANDROID_original() {
    return FRAME_BY_INDEX_ANDROID.replaceAll("xxx_rpl_lic", FRAME_BY_INDEX_ANDROID_license);
  }

/* field: GET_VISIBLE_TEXT_ANDROID license: 

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
  static final String GET_VISIBLE_TEXT_ANDROID =
  new StringBuilder(
    "function(){return(function(){function h(a){return function(){retur" +
    "n this[a]}}function n(a){return function(){return a}}var aa=this;f" +
    "unction q(a){return void 0!==a}function ba(a,b){var c=a.split(\".\")" +
    ",d=aa;c[0]in d||!d.execScript||d.execScript(\"var \"+c[0]);for(var e" +
    ";c.length&&(e=c.shift());)!c.length&&q(b)?d[e]=b:d[e]?d=d[e]:d=d[e" +
    "]={}}\nfunction ca(a){var b=typeof a;if(\"object\"==b)if(a){if(a inst" +
    "anceof Array)return\"array\";if(a instanceof Object)return b;var c=O" +
    "bject.prototype.toString.call(a);if(\"[object Window]\"==c)return\"ob" +
    "ject\";if(\"[object Array]\"==c||\"number\"==typeof a.length&&\"undefine" +
    "d\"!=typeof a.splice&&\"undefined\"!=typeof a.propertyIsEnumerable&&!" +
    "a.propertyIsEnumerable(\"splice\"))return\"array\";if(\"[object Functio" +
    "n]\"==c||\"undefined\"!=typeof a.call&&\"undefined\"!=typeof a.property" +
    "IsEnumerable&&!a.propertyIsEnumerable(\"call\"))return\"function\"}els" +
    "e return\"null\";\nelse if(\"function\"==b&&\"undefined\"==typeof a.call)" +
    "return\"object\";return b}function r(a){return\"string\"==typeof a}fun" +
    "ction da(a,b,c){return a.call.apply(a.bind,arguments)}function ea(" +
    "a,b,c){if(!a)throw Error();if(2<arguments.length){var d=Array.prot" +
    "otype.slice.call(arguments,2);return function(){var c=Array.protot" +
    "ype.slice.call(arguments);Array.prototype.unshift.apply(c,d);retur" +
    "n a.apply(b,c)}}return function(){return a.apply(b,arguments)}}\nfu" +
    "nction fa(a,b,c){fa=Function.prototype.bind&&-1!=Function.prototyp" +
    "e.bind.toString().indexOf(\"native code\")?da:ea;return fa.apply(nul" +
    "l,arguments)}function ga(a,b){var c=Array.prototype.slice.call(arg" +
    "uments,1);return function(){var b=c.slice();b.push.apply(b,argumen" +
    "ts);return a.apply(this,b)}}\nfunction t(a,b){function c(){}c.proto" +
    "type=b.prototype;a.H=b.prototype;a.prototype=new c;a.prototype.con" +
    "structor=a;a.G=function(a,c,f){for(var g=Array(arguments.length-2)" +
    ",p=2;p<arguments.length;p++)g[p-2]=arguments[p];return b.prototype" +
    "[c].apply(a,g)}};function ha(a){if(Error.captureStackTrace)Error.c" +
    "aptureStackTrace(this,ha);else{var b=Error().stack;b&&(this.stack=" +
    "b)}a&&(this.message=String(a))}t(ha,Error);ha.prototype.name=\"Cust" +
    "omError\";function ia(a){var b=a.length-1;return 0<=b&&a.indexOf(\" " +
    "\",b)==b}function ja(a,b){for(var c=a.split(\"%s\"),d=\"\",e=Array.prot" +
    "otype.slice.call(arguments,1);e.length&&1<c.length;)d+=c.shift()+e" +
    ".shift();return d+c.join(\"%s\")}var ka=String.prototype.trim?functi" +
    "on(a){return a.trim()}:function(a){return a.replace(/^[\\s\\xa0]+|[\\" +
    "s\\xa0]+$/g,\"\")};function la(a,b){return a<b?-1:a>b?1:0}function ma" +
    "(a){return String(a).replace(/\\-([a-z])/g,function(a,c){return c.t" +
    "oUpperCase()})};function na(a,b){b.unshift(a);ha.call(this,ja.appl" +
    "y(null,b));b.shift()}t(na,ha);na.prototype.name=\"AssertionError\";f" +
    "unction oa(a,b,c){if(!a){var d=\"Assertion failed\";if(b)var d=d+(\":" +
    " \"+b),e=Array.prototype.slice.call(arguments,2);throw new na(\"\"+d," +
    "e||[]);}};var pa=Array.prototype;function qa(a,b){if(r(a))return r" +
    "(b)&&1==b.length?a.indexOf(b,0):-1;for(var c=0;c<a.length;c++)if(c" +
    " in a&&a[c]===b)return c;return-1}function u(a,b){for(var c=a.leng" +
    "th,d=r(a)?a.split(\"\"):a,e=0;e<c;e++)e in d&&b.call(void 0,d[e],e,a" +
    ")}function v(a,b,c){var d=c;u(a,function(c,f){d=b.call(void 0,d,c," +
    "f,a)});return d}function ra(a,b){for(var c=a.length,d=r(a)?a.split" +
    "(\"\"):a,e=0;e<c;e++)if(e in d&&b.call(void 0,d[e],e,a))return!0;ret" +
    "urn!1}\nfunction sa(a,b){for(var c=a.length,d=r(a)?a.split(\"\"):a,e=" +
    "0;e<c;e++)if(e in d&&!b.call(void 0,d[e],e,a))return!1;return!0}fu" +
    "nction ta(a){return pa.concat.apply(pa,arguments)}function ua(a,b," +
    "c){oa(null!=a.length);return 2>=arguments.length?pa.slice.call(a,b" +
    "):pa.slice.call(a,b,c)};function w(a,b){this.x=q(a)?a:0;this.y=q(b" +
    ")?b:0}w.prototype.clone=function(){return new w(this.x,this.y)};w." +
    "prototype.toString=function(){return\"(\"+this.x+\", \"+this.y+\")\"};w." +
    "prototype.ceil=function(){this.x=Math.ceil(this.x);this.y=Math.cei" +
    "l(this.y);return this};w.prototype.floor=function(){this.x=Math.fl" +
    "oor(this.x);this.y=Math.floor(this.y);return this};w.prototype.rou" +
    "nd=function(){this.x=Math.round(this.x);this.y=Math.round(this.y);" +
    "return this};function x(a,b){this.width=a;this.height=b}x.prototyp" +
    "e.clone=function(){return new x(this.width,this.height)};x.prototy" +
    "pe.toString=function(){return\"(\"+this.width+\" x \"+this.height+\")\"}" +
    ";x.prototype.ceil=function(){this.width=Math.ceil(this.width);this" +
    ".height=Math.ceil(this.height);return this};x.prototype.floor=func" +
    "tion(){this.width=Math.floor(this.width);this.height=Math.floor(th" +
    "is.height);return this};\nx.prototype.round=function(){this.width=M" +
    "ath.round(this.width);this.height=Math.round(this.height);return t" +
    "his};var va;a:{var wa=aa.navigator;if(wa){var xa=wa.userAgent;if(x" +
    "a){va=xa;break a}}va=\"\"};function ya(a){for(;a&&1!=a.nodeType;)a=a" +
    ".previousSibling;return a}function za(a,b){if(a.contains&&1==b.nod" +
    "eType)return a==b||a.contains(b);if(\"undefined\"!=typeof a.compareD" +
    "ocumentPosition)return a==b||Boolean(a.compareDocumentPosition(b)&" +
    "16);for(;b&&a!=b;)b=b.parentNode;return b==a}\nfunction Aa(a,b){if(" +
    "a==b)return 0;if(a.compareDocumentPosition)return a.compareDocumen" +
    "tPosition(b)&2?1:-1;if(\"sourceIndex\"in a||a.parentNode&&\"sourceInd" +
    "ex\"in a.parentNode){var c=1==a.nodeType,d=1==b.nodeType;if(c&&d)re" +
    "turn a.sourceIndex-b.sourceIndex;var e=a.parentNode,f=b.parentNode" +
    ";return e==f?Ba(a,b):!c&&za(e,b)?-1*Ca(a,b):!d&&za(f,a)?Ca(b,a):(c" +
    "?a.sourceIndex:e.sourceIndex)-(d?b.sourceIndex:f.sourceIndex)}d=y(" +
    "a);c=d.createRange();c.selectNode(a);c.collapse(!0);d=d.createRang" +
    "e();d.selectNode(b);\nd.collapse(!0);return c.compareBoundaryPoints" +
    "(aa.Range.START_TO_END,d)}function Ca(a,b){var c=a.parentNode;if(c" +
    "==b)return-1;for(var d=b;d.parentNode!=c;)d=d.parentNode;return Ba" +
    "(d,a)}function Ba(a,b){for(var c=b;c=c.previousSibling;)if(c==a)re" +
    "turn-1;return 1}function y(a){oa(a,\"Node cannot be null or undefin" +
    "ed.\");return 9==a.nodeType?a:a.ownerDocument||a.document}function " +
    "Da(a,b){a=a.parentNode;for(var c=0;a;){oa(\"parentNode\"!=a.name);if" +
    "(b(a))return a;a=a.parentNode;c++}return null}\nfunction Ea(a){this" +
    ".a=a||aa.document||document};function z(a,b,c,d){this.top=a;this.r" +
    "ight=b;this.bottom=c;this.left=d}z.prototype.clone=function(){retu" +
    "rn new z(this.top,this.right,this.bottom,this.left)};z.prototype.t" +
    "oString=function(){return\"(\"+this.top+\"t, \"+this.right+\"r, \"+this." +
    "bottom+\"b, \"+this.left+\"l)\"};z.prototype.ceil=function(){this.top=" +
    "Math.ceil(this.top);this.right=Math.ceil(this.right);this.bottom=M" +
    "ath.ceil(this.bottom);this.left=Math.ceil(this.left);return this};" +
    "\nz.prototype.floor=function(){this.top=Math.floor(this.top);this.r" +
    "ight=Math.floor(this.right);this.bottom=Math.floor(this.bottom);th" +
    "is.left=Math.floor(this.left);return this};z.prototype.round=funct" +
    "ion(){this.top=Math.round(this.top);this.right=Math.round(this.rig" +
    "ht);this.bottom=Math.round(this.bottom);this.left=Math.round(this." +
    "left);return this};function A(a,b,c,d){this.left=a;this.top=b;this" +
    ".width=c;this.height=d}A.prototype.clone=function(){return new A(t" +
    "his.left,this.top,this.width,this.height)};A.prototype.toString=fu" +
    "nction(){return\"(\"+this.left+\", \"+this.top+\" - \"+this.width+\"w x \"" +
    "+this.height+\"h)\"};A.prototype.ceil=function(){this.left=Math.ceil" +
    "(this.left);this.top=Math.ceil(this.top);this.width=Math.ceil(this" +
    ".width);this.height=Math.ceil(this.height);return this};\nA.prototy" +
    "pe.floor=function(){this.left=Math.floor(this.left);this.top=Math." +
    "floor(this.top);this.width=Math.floor(this.width);this.height=Math" +
    ".floor(this.height);return this};A.prototype.round=function(){this" +
    ".left=Math.round(this.left);this.top=Math.round(this.top);this.wid" +
    "th=Math.round(this.width);this.height=Math.round(this.height);retu" +
    "rn this};/*xxx_rpl_lic*/\nfunction Fa(a,b){this.a=Ga[a]||\"unknown e" +
    "rror\";this.message=b||\"\";var c=this.a.replace(/((?:^|\\s+)[a-z])/g," +
    "function(a){return a.toUpperCase().replace(/^[\\s\\xa0]+/g,\"\")}),d=c" +
    ".length-5;if(0>d||c.indexOf(\"Error\",d)!=d)c+=\"Error\";this.name=c;c" +
    "=Error(this.message);c.name=this.name;this.stack=c.stack||\"\"}t(Fa," +
    "Error);\nvar Ga={15:\"element not selectable\",11:\"element not visibl" +
    "e\",31:\"unknown error\",30:\"unknown error\",24:\"invalid cookie domain" +
    "\",29:\"invalid element coordinates\",12:\"invalid element state\",32:\"" +
    "invalid selector\",51:\"invalid selector\",52:\"invalid selector\",17:\"" +
    "javascript error\",405:\"unsupported operation\",34:\"move target out " +
    "of bounds\",27:\"no such alert\",7:\"no such element\",8:\"no such frame" +
    "\",23:\"no such window\",28:\"script timeout\",33:\"session not created\"" +
    ",10:\"stale element reference\",21:\"timeout\",25:\"unable to set cooki" +
    "e\",\n26:\"unexpected alert open\",13:\"unknown error\",9:\"unknown comma" +
    "nd\"};Fa.prototype.toString=function(){return this.name+\": \"+this.m" +
    "essage};/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu Labs, Inc" +
    ".\n Copyright (c) 2012 Google Inc.\n\n Permission is hereby granted, " +
    "free of charge, to any person obtaining a copy\n of this software a" +
    "nd associated documentation files (the \"Software\"), to\n deal in th" +
    "e Software without restriction, including without limitation the\n " +
    "rights to use, copy, modify, merge, publish, distribute, sublicens" +
    "e, and/or\n sell copies of the Software, and to permit persons to w" +
    "hom the Software is\n furnished to do so, subject to the following " +
    "conditions:\n\n The above copyright notice and this permission notic" +
    "e shall be included in\n all copies or substantial portions of the " +
    "Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF " +
    "ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE WA" +
    "RRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND" +
    " NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLD" +
    "ERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER " +
    "IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF" +
    " OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n " +
    "IN THE SOFTWARE.\n*/\nfunction C(a,b,c){this.a=a;this.b=b||1;this.f=" +
    "c||1};function Ha(a){this.b=a;this.a=0}function Ia(a){a=a.match(Ja" +
    ");for(var b=0;b<a.length;b++)Ka.test(a[b])&&a.splice(b,1);return n" +
    "ew Ha(a)}var Ja=RegExp(\"\\\\$?(?:(?![0-9-])[\\\\w-]+:)?(?![0-9-])[\\\\w-" +
    "]+|\\\\/\\\\/|\\\\.\\\\.|::|\\\\d+(?:\\\\.\\\\d*)?|\\\\.\\\\d+|\\\"[^\\\"]*\\\"|'[^']*'|[!" +
    "<>]=|\\\\s+|.\",\"g\"),Ka=/^\\s/;function D(a,b){return a.b[a.a+(b||0)]}" +
    "function E(a){return a.b[a.a++]}function La(a){return a.b.length<=" +
    "a.a};function F(a){var b=null,c=a.nodeType;1==c&&(b=a.textContent," +
    "b=void 0==b||null==b?a.innerText:b,b=void 0==b||null==b?\"\":b);if(\"" +
    "string\"!=typeof b)if(9==c||1==c){a=9==c?a.documentElement:a.firstC" +
    "hild;for(var c=0,d=[],b=\"\";a;){do 1!=a.nodeType&&(b+=a.nodeValue)," +
    "d[c++]=a;while(a=a.firstChild);for(;c&&!(a=d[--c].nextSibling););}" +
    "}else b=a.nodeValue;return\"\"+b}\nfunction G(a,b,c){if(null===b)retu" +
    "rn!0;try{if(!a.getAttribute)return!1}catch(d){return!1}return null" +
    "==c?!!a.getAttribute(b):a.getAttribute(b,2)==c}function Ma(a,b,c,d" +
    ",e){return Na.call(null,a,b,r(c)?c:null,r(d)?d:null,e||new H)}\nfun" +
    "ction Na(a,b,c,d,e){b.getElementsByName&&d&&\"name\"==c?(b=b.getElem" +
    "entsByName(d),u(b,function(b){a.a(b)&&J(e,b)})):b.getElementsByCla" +
    "ssName&&d&&\"class\"==c?(b=b.getElementsByClassName(d),u(b,function(" +
    "b){b.className==d&&a.a(b)&&J(e,b)})):a instanceof K?Oa(a,b,c,d,e):" +
    "b.getElementsByTagName&&(b=b.getElementsByTagName(a.f()),u(b,funct" +
    "ion(a){G(a,c,d)&&J(e,a)}));return e}function Pa(a,b,c,d,e){for(b=b" +
    ".firstChild;b;b=b.nextSibling)G(b,c,d)&&a.a(b)&&J(e,b);return e}\nf" +
    "unction Oa(a,b,c,d,e){for(b=b.firstChild;b;b=b.nextSibling)G(b,c,d" +
    ")&&a.a(b)&&J(e,b),Oa(a,b,c,d,e)};function H(){this.b=this.a=null;t" +
    "his.l=0}function Qa(a){this.node=a;this.a=this.b=null}function Ra(" +
    "a,b){if(!a.a)return b;if(!b.a)return a;for(var c=a.a,d=b.a,e=null," +
    "f=null,g=0;c&&d;)c.node==d.node?(f=c,c=c.a,d=d.a):0<Aa(c.node,d.no" +
    "de)?(f=d,d=d.a):(f=c,c=c.a),(f.b=e)?e.a=f:a.a=f,e=f,g++;for(f=c||d" +
    ";f;)f.b=e,e=e.a=f,g++,f=f.a;a.b=e;a.l=g;return a}function Sa(a,b){" +
    "var c=new Qa(b);c.a=a.a;a.b?a.a.b=c:a.a=a.b=c;a.a=c;a.l++}function" +
    " J(a,b){var c=new Qa(b);c.b=a.b;a.a?a.b.a=c:a.a=a.b=c;a.b=c;a.l++}" +
    "\nfunction Ta(a){return(a=a.a)?a.node:null}function Ua(a){return(a=" +
    "Ta(a))?F(a):\"\"}function L(a,b){return new Va(a,!!b)}function Va(a," +
    "b){this.f=a;this.b=(this.c=b)?a.b:a.a;this.a=null}function M(a){va" +
    "r b=a.b;if(null==b)return null;var c=a.a=b;a.b=a.c?b.b:b.a;return " +
    "c.node};function Wa(a){switch(a.nodeType){case 1:return ga(Xa,a);c" +
    "ase 9:return Wa(a.documentElement);case 11:case 10:case 6:case 12:" +
    "return Ya;default:return a.parentNode?Wa(a.parentNode):Ya}}functio" +
    "n Ya(){return null}function Xa(a,b){if(a.prefix==b)return a.namesp" +
    "aceURI||\"http://www.w3.org/1999/xhtml\";var c=a.getAttributeNode(\"x" +
    "mlns:\"+b);return c&&c.specified?c.value||null:a.parentNode&&9!=a.p" +
    "arentNode.nodeType?Xa(a.parentNode,b):null};function N(a){this.i=a" +
    ";this.b=this.g=!1;this.f=null}function O(a){return\"\\n  \"+a.toStrin" +
    "g().split(\"\\n\").join(\"\\n  \")}function Za(a,b){a.g=b}function $a(a," +
    "b){a.b=b}function P(a,b){var c=a.a(b);return c instanceof H?+Ua(c)" +
    ":+c}function Q(a,b){var c=a.a(b);return c instanceof H?Ua(c):\"\"+c}" +
    "function ab(a,b){var c=a.a(b);return c instanceof H?!!c.l:!!c};fun" +
    "ction bb(a,b,c){N.call(this,a.i);this.c=a;this.h=b;this.o=c;this.g" +
    "=b.g||c.g;this.b=b.b||c.b;this.c==cb&&(c.b||c.g||4==c.i||0==c.i||!" +
    "b.f?b.b||b.g||4==b.i||0==b.i||!c.f||(this.f={name:c.f.name,s:b}):t" +
    "his.f={name:b.f.name,s:c})}t(bb,N);\nfunction db(a,b,c,d,e){b=b.a(d" +
    ");c=c.a(d);var f;if(b instanceof H&&c instanceof H){e=L(b);for(d=M" +
    "(e);d;d=M(e))for(b=L(c),f=M(b);f;f=M(b))if(a(F(d),F(f)))return!0;r" +
    "eturn!1}if(b instanceof H||c instanceof H){b instanceof H?e=b:(e=c" +
    ",c=b);e=L(e);b=typeof c;for(d=M(e);d;d=M(e)){switch(b){case \"numbe" +
    "r\":d=+F(d);break;case \"boolean\":d=!!F(d);break;case \"string\":d=F(d" +
    ");break;default:throw Error(\"Illegal primitive type for comparison" +
    ".\");}if(a(d,c))return!0}return!1}return e?\"boolean\"==typeof b||\"bo" +
    "olean\"==typeof c?\na(!!b,!!c):\"number\"==typeof b||\"number\"==typeof " +
    "c?a(+b,+c):a(b,c):a(+b,+c)}bb.prototype.a=function(a){return this." +
    "c.m(this.h,this.o,a)};bb.prototype.toString=function(){var a=\"Bina" +
    "ry Expression: \"+this.c,a=a+O(this.h);return a+=O(this.o)};functio" +
    "n eb(a,b,c,d){this.a=a;this.A=b;this.i=c;this.m=d}eb.prototype.toS" +
    "tring=h(\"a\");var fb={};function R(a,b,c,d){if(fb.hasOwnProperty(a)" +
    ")throw Error(\"Binary operator already created: \"+a);a=new eb(a,b,c" +
    ",d);return fb[a.toString()]=a}\nR(\"div\",6,1,function(a,b,c){return " +
    "P(a,c)/P(b,c)});R(\"mod\",6,1,function(a,b,c){return P(a,c)%P(b,c)})" +
    ";R(\"*\",6,1,function(a,b,c){return P(a,c)*P(b,c)});R(\"+\",5,1,functi" +
    "on(a,b,c){return P(a,c)+P(b,c)});R(\"-\",5,1,function(a,b,c){return " +
    "P(a,c)-P(b,c)});R(\"<\",4,2,function(a,b,c){return db(function(a,b){" +
    "return a<b},a,b,c)});R(\">\",4,2,function(a,b,c){return db(function(" +
    "a,b){return a>b},a,b,c)});R(\"<=\",4,2,function(a,b,c){return db(fun" +
    "ction(a,b){return a<=b},a,b,c)});\nR(\">=\",4,2,function(a,b,c){retur" +
    "n db(function(a,b){return a>=b},a,b,c)});var cb=R(\"=\",3,2,function" +
    "(a,b,c){return db(function(a,b){return a==b},a,b,c,!0)});R(\"!=\",3," +
    "2,function(a,b,c){return db(function(a,b){return a!=b},a,b,c,!0)})" +
    ";R(\"and\",2,2,function(a,b,c){return ab(a,c)&&ab(b,c)});R(\"or\",1,2," +
    "function(a,b,c){return ab(a,c)||ab(b,c)});function gb(a,b){if(b.a." +
    "length&&4!=a.i)throw Error(\"Primary expression must evaluate to no" +
    "deset if filter has predicate(s).\");N.call(this,a.i);this.c=a;this" +
    ".h=b;this.g=a.g;this.b=a.b}t(gb,N);gb.prototype.a=function(a){a=th" +
    "is.c.a(a);return hb(this.h,a)};gb.prototype.toString=function(){va" +
    "r a;a=\"Filter:\"+O(this.c);return a+=O(this.h)};function ib(a,b){if" +
    "(b.length<a.B)throw Error(\"Function \"+a.j+\" expects at least\"+a.B+" +
    "\" arguments, \"+b.length+\" given\");if(null!==a.v&&b.length>a.v)thro" +
    "w Error(\"Function \"+a.j+\" expects at most \"+a.v+\" arguments, \"+b.l" +
    "ength+\" given\");a.C&&u(b,function(b,d){if(4!=b.i)throw Error(\"Argu" +
    "ment \"+d+\" to function \"+a.j+\" is not of type Nodeset: \"+b);});N.c" +
    "all(this,a.i);this.h=a;this.c=b;Za(this,a.g||ra(b,function(a){retu" +
    "rn a.g}));$a(this,a.F&&!b.length||a.D&&!!b.length||ra(b,function(a" +
    "){return a.b}))}\nt(ib,N);ib.prototype.a=function(a){return this.h." +
    "m.apply(null,ta(a,this.c))};ib.prototype.toString=function(){var a" +
    "=\"Function: \"+this.h;if(this.c.length)var b=v(this.c,function(a,b)" +
    "{return a+O(b)},\"Arguments:\"),a=a+O(b);return a};function jb(a,b,c" +
    ",d,e,f,g,p,l){this.j=a;this.i=b;this.g=c;this.F=d;this.D=e;this.m=" +
    "f;this.B=g;this.v=q(p)?p:g;this.C=!!l}jb.prototype.toString=h(\"j\")" +
    ";var kb={};\nfunction S(a,b,c,d,e,f,g,p){if(kb.hasOwnProperty(a))th" +
    "row Error(\"Function already created: \"+a+\".\");kb[a]=new jb(a,b,c,d" +
    ",!1,e,f,g,p)}S(\"boolean\",2,!1,!1,function(a,b){return ab(b,a)},1);" +
    "S(\"ceiling\",1,!1,!1,function(a,b){return Math.ceil(P(b,a))},1);S(\"" +
    "concat\",3,!1,!1,function(a,b){var c=ua(arguments,1);return v(c,fun" +
    "ction(b,c){return b+Q(c,a)},\"\")},2,null);S(\"contains\",2,!1,!1,func" +
    "tion(a,b,c){b=Q(b,a);a=Q(c,a);return-1!=b.indexOf(a)},2);S(\"count\"" +
    ",1,!1,!1,function(a,b){return b.a(a).l},1,1,!0);\nS(\"false\",2,!1,!1" +
    ",n(!1),0);S(\"floor\",1,!1,!1,function(a,b){return Math.floor(P(b,a)" +
    ")},1);S(\"id\",4,!1,!1,function(a,b){var c=a.a,d=9==c.nodeType?c:c.o" +
    "wnerDocument,c=Q(b,a).split(/\\s+/),e=[];u(c,function(a){a=d.getEle" +
    "mentById(a);!a||0<=qa(e,a)||e.push(a)});e.sort(Aa);var f=new H;u(e" +
    ",function(a){J(f,a)});return f},1);S(\"lang\",2,!1,!1,n(!1),1);S(\"la" +
    "st\",1,!0,!1,function(a){if(1!=arguments.length)throw Error(\"Functi" +
    "on last expects ()\");return a.f},0);\nS(\"local-name\",3,!1,!0,functi" +
    "on(a,b){var c=b?Ta(b.a(a)):a.a;return c?c.localName||c.nodeName.to" +
    "LowerCase():\"\"},0,1,!0);S(\"name\",3,!1,!0,function(a,b){var c=b?Ta(" +
    "b.a(a)):a.a;return c?c.nodeName.toLowerCase():\"\"},0,1,!0);S(\"names" +
    "pace-uri\",3,!0,!1,n(\"\"),0,1,!0);S(\"normalize-space\",3,!1,!0,functi" +
    "on(a,b){return(b?Q(b,a):F(a.a)).replace(/[\\s\\xa0]+/g,\" \").replace(" +
    "/^\\s+|\\s+$/g,\"\")},0,1);S(\"not\",2,!1,!1,function(a,b){return!ab(b,a" +
    ")},1);S(\"number\",1,!1,!0,function(a,b){return b?P(b,a):+F(a.a)},0," +
    "1);\nS(\"position\",1,!0,!1,function(a){return a.b},0);S(\"round\",1,!1" +
    ",!1,function(a,b){return Math.round(P(b,a))},1);S(\"starts-with\",2," +
    "!1,!1,function(a,b,c){b=Q(b,a);a=Q(c,a);return 0==b.lastIndexOf(a," +
    "0)},2);S(\"string\",3,!1,!0,function(a,b){return b?Q(b,a):F(a.a)},0," +
    "1);S(\"string-length\",1,!1,!0,function(a,b){return(b?Q(b,a):F(a.a))" +
    ".length},0,1);\nS(\"substring\",3,!1,!1,function(a,b,c,d){c=P(c,a);if" +
    "(isNaN(c)||Infinity==c||-Infinity==c)return\"\";d=d?P(d,a):Infinity;" +
    "if(isNaN(d)||-Infinity===d)return\"\";c=Math.round(c)-1;var e=Math.m" +
    "ax(c,0);a=Q(b,a);if(Infinity==d)return a.substring(e);b=Math.round" +
    "(d);return a.substring(e,c+b)},2,3);S(\"substring-after\",3,!1,!1,fu" +
    "nction(a,b,c){b=Q(b,a);a=Q(c,a);c=b.indexOf(a);return-1==c?\"\":b.su" +
    "bstring(c+a.length)},2);\nS(\"substring-before\",3,!1,!1,function(a,b" +
    ",c){b=Q(b,a);a=Q(c,a);a=b.indexOf(a);return-1==a?\"\":b.substring(0," +
    "a)},2);S(\"sum\",1,!1,!1,function(a,b){for(var c=L(b.a(a)),d=0,e=M(c" +
    ");e;e=M(c))d+=+F(e);return d},1,1,!0);S(\"translate\",3,!1,!1,functi" +
    "on(a,b,c,d){b=Q(b,a);c=Q(c,a);var e=Q(d,a);a=[];for(d=0;d<c.length" +
    ";d++){var f=c.charAt(d);f in a||(a[f]=e.charAt(d))}c=\"\";for(d=0;d<" +
    "b.length;d++)f=b.charAt(d),c+=f in a?a[f]:f;return c},3);S(\"true\"," +
    "2,!1,!1,n(!0),0);function K(a,b){this.h=a;this.c=q(b)?b:null;this." +
    "b=null;switch(a){case \"comment\":this.b=8;break;case \"text\":this.b=" +
    "3;break;case \"processing-instruction\":this.b=7;break;case \"node\":b" +
    "reak;default:throw Error(\"Unexpected argument\");}}function lb(a){r" +
    "eturn\"comment\"==a||\"text\"==a||\"processing-instruction\"==a||\"node\"=" +
    "=a}K.prototype.a=function(a){return null===this.b||this.b==a.nodeT" +
    "ype};K.prototype.f=h(\"h\");K.prototype.toString=function(){var a=\"K" +
    "ind Test: \"+this.h;null===this.c||(a+=O(this.c));return a};functio" +
    "n mb(a){N.call(this,3);this.c=a.substring(1,a.length-1)}t(mb,N);mb" +
    ".prototype.a=h(\"c\");mb.prototype.toString=function(){return\"Litera" +
    "l: \"+this.c};function nb(a,b){this.j=a.toLowerCase();this.b=b?b.to" +
    "LowerCase():\"http://www.w3.org/1999/xhtml\"}nb.prototype.a=function" +
    "(a){var b=a.nodeType;return 1!=b&&2!=b?!1:\"*\"!=this.j&&this.j!=a.n" +
    "odeName.toLowerCase()?!1:this.b==(a.namespaceURI?a.namespaceURI.to" +
    "LowerCase():\"http://www.w3.org/1999/xhtml\")};nb.prototype.f=h(\"j\")" +
    ";nb.prototype.toString=function(){return\"Name Test: \"+(\"http://www" +
    ".w3.org/1999/xhtml\"==this.b?\"\":this.b+\":\")+this.j};function ob(a){" +
    "N.call(this,1);this.c=a}t(ob,N);ob.prototype.a=h(\"c\");ob.prototype" +
    ".toString=function(){return\"Number: \"+this.c};function pb(a,b){N.c" +
    "all(this,a.i);this.h=a;this.c=b;this.g=a.g;this.b=a.b;if(1==this.c" +
    ".length){var c=this.c[0];c.u||c.c!=qb||(c=c.o,\"*\"!=c.f()&&(this.f=" +
    "{name:c.f(),s:null}))}}t(pb,N);function rb(){N.call(this,4)}t(rb,N" +
    ");rb.prototype.a=function(a){var b=new H;a=a.a;9==a.nodeType?J(b,a" +
    "):J(b,a.ownerDocument);return b};rb.prototype.toString=n(\"Root Hel" +
    "per Expression\");function sb(){N.call(this,4)}t(sb,N);sb.prototype" +
    ".a=function(a){var b=new H;J(b,a.a);return b};sb.prototype.toStrin" +
    "g=n(\"Context Helper Expression\");\nfunction tb(a){return\"/\"==a||\"//" +
    "\"==a}pb.prototype.a=function(a){var b=this.h.a(a);if(!(b instanceo" +
    "f H))throw Error(\"Filter expression must evaluate to nodeset.\");a=" +
    "this.c;for(var c=0,d=a.length;c<d&&b.l;c++){var e=a[c],f=L(b,e.c.a" +
    "),g;if(e.g||e.c!=ub)if(e.g||e.c!=vb)for(g=M(f),b=e.a(new C(g));nul" +
    "l!=(g=M(f));)g=e.a(new C(g)),b=Ra(b,g);else g=M(f),b=e.a(new C(g))" +
    ";else{for(g=M(f);(b=M(f))&&(!g.contains||g.contains(b))&&b.compare" +
    "DocumentPosition(g)&8;g=b);b=e.a(new C(g))}}return b};\npb.prototyp" +
    "e.toString=function(){var a;a=\"Path Expression:\"+O(this.h);if(this" +
    ".c.length){var b=v(this.c,function(a,b){return a+O(b)},\"Steps:\");a" +
    "+=O(b)}return a};function wb(a,b){this.a=a;this.b=!!b}\nfunction hb" +
    "(a,b,c){for(c=c||0;c<a.a.length;c++)for(var d=a.a[c],e=L(b),f=b.l," +
    "g,p=0;g=M(e);p++){var l=a.b?f-p:p+1;g=d.a(new C(g,l,f));if(\"number" +
    "\"==typeof g)l=l==g;else if(\"string\"==typeof g||\"boolean\"==typeof g" +
    ")l=!!g;else if(g instanceof H)l=0<g.l;else throw Error(\"Predicate." +
    "evaluate returned an unexpected type.\");if(!l){l=e;g=l.f;var m=l.a" +
    ";if(!m)throw Error(\"Next must be called at least once before remov" +
    "e.\");var k=m.b,m=m.a;k?k.a=m:g.a=m;m?m.b=k:g.b=k;g.l--;l.a=null}}r" +
    "eturn b}\nwb.prototype.toString=function(){return v(this.a,function" +
    "(a,b){return a+O(b)},\"Predicates:\")};function T(a,b,c,d){N.call(th" +
    "is,4);this.c=a;this.o=b;this.h=c||new wb([]);this.u=!!d;b=this.h;b" +
    "=0<b.a.length?b.a[0].f:null;a.b&&b&&(this.f={name:b.name,s:b.s});a" +
    ":{a=this.h;for(b=0;b<a.a.length;b++)if(c=a.a[b],c.g||1==c.i||0==c." +
    "i){a=!0;break a}a=!1}this.g=a}t(T,N);\nT.prototype.a=function(a){va" +
    "r b=a.a,c=null,c=this.f,d=null,e=null,f=0;c&&(d=c.name,e=c.s?Q(c.s" +
    ",a):null,f=1);if(this.u)if(this.g||this.c!=xb)if(a=L((new T(yb,new" +
    " K(\"node\"))).a(a)),b=M(a))for(c=this.m(b,d,e,f);null!=(b=M(a));)c=" +
    "Ra(c,this.m(b,d,e,f));else c=new H;else c=Ma(this.o,b,d,e),c=hb(th" +
    "is.h,c,f);else c=this.m(a.a,d,e,f);return c};T.prototype.m=functio" +
    "n(a,b,c,d){a=this.c.f(this.o,a,b,c);return a=hb(this.h,a,d)};\nT.pr" +
    "ototype.toString=function(){var a;a=\"Step:\"+O(\"Operator: \"+(this.u" +
    "?\"//\":\"/\"));this.c.j&&(a+=O(\"Axis: \"+this.c));a+=O(this.o);if(this" +
    ".h.a.length){var b=v(this.h.a,function(a,b){return a+O(b)},\"Predic" +
    "ates:\");a+=O(b)}return a};function zb(a,b,c,d){this.j=a;this.f=b;t" +
    "his.a=c;this.b=d}zb.prototype.toString=h(\"j\");var Ab={};function U" +
    "(a,b,c,d){if(Ab.hasOwnProperty(a))throw Error(\"Axis already create" +
    "d: \"+a);b=new zb(a,b,c,!!d);return Ab[a]=b}\nU(\"ancestor\",function(" +
    "a,b){for(var c=new H,d=b;d=d.parentNode;)a.a(d)&&Sa(c,d);return c}" +
    ",!0);U(\"ancestor-or-self\",function(a,b){var c=new H,d=b;do a.a(d)&" +
    "&Sa(c,d);while(d=d.parentNode);return c},!0);var qb=U(\"attribute\"," +
    "function(a,b){var c=new H,d=a.f(),e=b.attributes;if(e)if(a instanc" +
    "eof K&&null===a.b||\"*\"==d)for(var d=0,f;f=e[d];d++)J(c,f);else(f=e" +
    ".getNamedItem(d))&&J(c,f);return c},!1),xb=U(\"child\",function(a,b," +
    "c,d,e){return Pa.call(null,a,b,r(c)?c:null,r(d)?d:null,e||new H)}," +
    "!1,!0);\nU(\"descendant\",Ma,!1,!0);var yb=U(\"descendant-or-self\",fun" +
    "ction(a,b,c,d){var e=new H;G(b,c,d)&&a.a(b)&&J(e,b);return Ma(a,b," +
    "c,d,e)},!1,!0),ub=U(\"following\",function(a,b,c,d){var e=new H;do f" +
    "or(var f=b;f=f.nextSibling;)G(f,c,d)&&a.a(f)&&J(e,f),e=Ma(a,f,c,d," +
    "e);while(b=b.parentNode);return e},!1,!0);U(\"following-sibling\",fu" +
    "nction(a,b){for(var c=new H,d=b;d=d.nextSibling;)a.a(d)&&J(c,d);re" +
    "turn c},!1);U(\"namespace\",function(){return new H},!1);\nvar Bb=U(\"" +
    "parent\",function(a,b){var c=new H;if(9==b.nodeType)return c;if(2==" +
    "b.nodeType)return J(c,b.ownerElement),c;var d=b.parentNode;a.a(d)&" +
    "&J(c,d);return c},!1),vb=U(\"preceding\",function(a,b,c,d){var e=new" +
    " H,f=[];do f.unshift(b);while(b=b.parentNode);for(var g=1,p=f.leng" +
    "th;g<p;g++){var l=[];for(b=f[g];b=b.previousSibling;)l.unshift(b);" +
    "for(var m=0,k=l.length;m<k;m++)b=l[m],G(b,c,d)&&a.a(b)&&J(e,b),e=M" +
    "a(a,b,c,d,e)}return e},!0,!0);\nU(\"preceding-sibling\",function(a,b)" +
    "{for(var c=new H,d=b;d=d.previousSibling;)a.a(d)&&Sa(c,d);return c" +
    "},!0);var Cb=U(\"self\",function(a,b){var c=new H;a.a(b)&&J(c,b);ret" +
    "urn c},!1);function Db(a){N.call(this,1);this.c=a;this.g=a.g;this." +
    "b=a.b}t(Db,N);Db.prototype.a=function(a){return-P(this.c,a)};Db.pr" +
    "ototype.toString=function(){return\"Unary Expression: -\"+O(this.c)}" +
    ";function Eb(a){N.call(this,4);this.c=a;Za(this,ra(this.c,function" +
    "(a){return a.g}));$a(this,ra(this.c,function(a){return a.b}))}t(Eb" +
    ",N);Eb.prototype.a=function(a){var b=new H;u(this.c,function(c){c=" +
    "c.a(a);if(!(c instanceof H))throw Error(\"Path expression must eval" +
    "uate to NodeSet.\");b=Ra(b,c)});return b};Eb.prototype.toString=fun" +
    "ction(){return v(this.c,function(a,b){return a+O(b)},\"Union Expres" +
    "sion:\")};function Fb(a,b){this.a=a;this.b=b}function Gb(a){for(var" +
    " b,c=[];;){V(a,\"Missing right hand side of binary expression.\");b=" +
    "Hb(a);var d=E(a.a);if(!d)break;var e=(d=fb[d]||null)&&d.A;if(!e){a" +
    ".a.a--;break}for(;c.length&&e<=c[c.length-1].A;)b=new bb(c.pop(),c" +
    ".pop(),b);c.push(b,d)}for(;c.length;)b=new bb(c.pop(),c.pop(),b);r" +
    "eturn b}function V(a,b){if(La(a.a))throw Error(b);}function Ib(a,b" +
    "){var c=E(a.a);if(c!=b)throw Error(\"Bad token, expected: \"+b+\" got" +
    ": \"+c);}\nfunction Jb(a){a=E(a.a);if(\")\"!=a)throw Error(\"Bad token:" +
    " \"+a);}function Kb(a){a=E(a.a);if(2>a.length)throw Error(\"Unclosed" +
    " literal string\");return new mb(a)}function Lb(a){var b=E(a.a),c=b" +
    ".indexOf(\":\");if(-1==c)return new nb(b);var d=b.substring(0,c);a=a" +
    ".b(d);if(!a)throw Error(\"Namespace prefix not declared: \"+d);b=b.s" +
    "ubstr(c+1);return new nb(b,a)}\nfunction Mb(a){var b,c=[],d;if(tb(D" +
    "(a.a))){b=E(a.a);d=D(a.a);if(\"/\"==b&&(La(a.a)||\".\"!=d&&\"..\"!=d&&\"@" +
    "\"!=d&&\"*\"!=d&&!/(?![0-9])[\\w]/.test(d)))return new rb;d=new rb;V(a" +
    ",\"Missing next location step.\");b=Nb(a,b);c.push(b)}else{a:{b=D(a." +
    "a);d=b.charAt(0);switch(d){case \"$\":throw Error(\"Variable referenc" +
    "e not allowed in HTML XPath\");case \"(\":E(a.a);b=Gb(a);V(a,'unclose" +
    "d \"(\"');Ib(a,\")\");break;case '\"':case \"'\":b=Kb(a);break;default:if" +
    "(isNaN(+b))if(!lb(b)&&/(?![0-9])[\\w]/.test(d)&&\"(\"==D(a.a,1)){b=E(" +
    "a.a);\nb=kb[b]||null;E(a.a);for(d=[];\")\"!=D(a.a);){V(a,\"Missing fun" +
    "ction argument list.\");d.push(Gb(a));if(\",\"!=D(a.a))break;E(a.a)}V" +
    "(a,\"Unclosed function argument list.\");Jb(a);b=new ib(b,d)}else{b="
  )
      .append(
    "null;break a}else b=new ob(+E(a.a))}\"[\"==D(a.a)&&(d=new wb(Ob(a))," +
    "b=new gb(b,d))}if(b)if(tb(D(a.a)))d=b;else return b;else b=Nb(a,\"/" +
    "\"),d=new sb,c.push(b)}for(;tb(D(a.a));)b=E(a.a),V(a,\"Missing next " +
    "location step.\"),b=Nb(a,b),c.push(b);return new pb(d,c)}\nfunction " +
    "Nb(a,b){var c,d,e;if(\"/\"!=b&&\"//\"!=b)throw Error('Step op should b" +
    "e \"/\" or \"//\"');if(\".\"==D(a.a))return d=new T(Cb,new K(\"node\")),E(" +
    "a.a),d;if(\"..\"==D(a.a))return d=new T(Bb,new K(\"node\")),E(a.a),d;v" +
    "ar f;if(\"@\"==D(a.a))f=qb,E(a.a),V(a,\"Missing attribute name\");else" +
    " if(\"::\"==D(a.a,1)){if(!/(?![0-9])[\\w]/.test(D(a.a).charAt(0)))thr" +
    "ow Error(\"Bad token: \"+E(a.a));c=E(a.a);f=Ab[c]||null;if(!f)throw " +
    "Error(\"No axis with name: \"+c);E(a.a);V(a,\"Missing node name\")}els" +
    "e f=xb;c=D(a.a);if(/(?![0-9])[\\w]/.test(c.charAt(0)))if(\"(\"==\nD(a." +
    "a,1)){if(!lb(c))throw Error(\"Invalid node type: \"+c);c=E(a.a);if(!" +
    "lb(c))throw Error(\"Invalid type name: \"+c);Ib(a,\"(\");V(a,\"Bad node" +
    "type\");e=D(a.a).charAt(0);var g=null;if('\"'==e||\"'\"==e)g=Kb(a);V(a" +
    ",\"Bad nodetype\");Jb(a);c=new K(c,g)}else c=Lb(a);else if(\"*\"==c)c=" +
    "Lb(a);else throw Error(\"Bad token: \"+E(a.a));e=new wb(Ob(a),f.a);r" +
    "eturn d||new T(f,c,e,\"//\"==b)}\nfunction Ob(a){for(var b=[];\"[\"==D(" +
    "a.a);){E(a.a);V(a,\"Missing predicate expression.\");var c=Gb(a);b.p" +
    "ush(c);V(a,\"Unclosed predicate expression.\");Ib(a,\"]\")}return b}fu" +
    "nction Hb(a){if(\"-\"==D(a.a))return E(a.a),new Db(Hb(a));var b=Mb(a" +
    ");if(\"|\"!=D(a.a))a=b;else{for(b=[b];\"|\"==E(a.a);)V(a,\"Missing next" +
    " union location path.\"),b.push(Mb(a));a.a.a--;a=new Eb(b)}return a" +
    "};function Pb(a,b){if(!a.length)throw Error(\"Empty XPath expressio" +
    "n.\");var c=Ia(a);if(La(c))throw Error(\"Invalid XPath expression.\")" +
    ";b?\"function\"==ca(b)||(b=fa(b.lookupNamespaceURI,b)):b=n(null);var" +
    " d=Gb(new Fb(c,b));if(!La(c))throw Error(\"Bad token: \"+E(c));this." +
    "evaluate=function(a,b){var c=d.a(new C(a));return new X(c,b)}}\nfun" +
    "ction X(a,b){if(0==b)if(a instanceof H)b=4;else if(\"string\"==typeo" +
    "f a)b=2;else if(\"number\"==typeof a)b=1;else if(\"boolean\"==typeof a" +
    ")b=3;else throw Error(\"Unexpected evaluation result.\");if(2!=b&&1!" +
    "=b&&3!=b&&!(a instanceof H))throw Error(\"value could not be conver" +
    "ted to the specified type\");this.resultType=b;var c;switch(b){case" +
    " 2:this.stringValue=a instanceof H?Ua(a):\"\"+a;break;case 1:this.nu" +
    "mberValue=a instanceof H?+Ua(a):+a;break;case 3:this.booleanValue=" +
    "a instanceof H?0<a.l:!!a;break;case 4:case 5:case 6:case 7:var d=\n" +
    "L(a);c=[];for(var e=M(d);e;e=M(d))c.push(e);this.snapshotLength=a." +
    "l;this.invalidIteratorState=!1;break;case 8:case 9:this.singleNode" +
    "Value=Ta(a);break;default:throw Error(\"Unknown XPathResult type.\")" +
    ";}var f=0;this.iterateNext=function(){if(4!=b&&5!=b)throw Error(\"i" +
    "terateNext called with wrong result type\");return f>=c.length?null" +
    ":c[f++]};this.snapshotItem=function(a){if(6!=b&&7!=b)throw Error(\"" +
    "snapshotItem called with wrong result type\");return a>=c.length||0" +
    ">a?null:c[a]}}X.ANY_TYPE=0;\nX.NUMBER_TYPE=1;X.STRING_TYPE=2;X.BOOL" +
    "EAN_TYPE=3;X.UNORDERED_NODE_ITERATOR_TYPE=4;X.ORDERED_NODE_ITERATO" +
    "R_TYPE=5;X.UNORDERED_NODE_SNAPSHOT_TYPE=6;X.ORDERED_NODE_SNAPSHOT_" +
    "TYPE=7;X.ANY_UNORDERED_NODE_TYPE=8;X.FIRST_ORDERED_NODE_TYPE=9;fun" +
    "ction Qb(a){this.lookupNamespaceURI=Wa(a)}\nfunction Rb(a){a=a||aa;" +
    "var b=a.document;b.evaluate||(a.XPathResult=X,b.evaluate=function(" +
    "a,b,e,f){return(new Pb(a,e)).evaluate(b,f)},b.createExpression=fun" +
    "ction(a,b){return new Pb(a,b)},b.createNSResolver=function(a){retu" +
    "rn new Qb(a)})}ba(\"wgxpath.install\",Rb);var Sb=function(){var a={I" +
    ":\"http://www.w3.org/2000/svg\"};return function(b){return a[b]||nul" +
    "l}}();\nfunction Tb(a,b){var c=y(a);if(!c.documentElement)return nu" +
    "ll;Rb(c?c.parentWindow||c.defaultView:window);try{for(var d=c.crea" +
    "teNSResolver?c.createNSResolver(c.documentElement):Sb,e={},f=c.get" +
    "ElementsByTagName(\"*\"),g=0;g<f.length;++g){var p=f[g],l=p.namespac" +
    "eURI;if(l&&!e[l]){var m=p.lookupPrefix(l);if(!m){var k=l.match(\".*" +
    "/(\\\\w+)/?$\");k?m=k[1]:m=\"xhtml\"}e[l]=m}}var B={},I;for(I in e)B[e[" +
    "I]]=I;d=function(a){return B[a]||null};try{return c.evaluate(b,a,d" +
    ",9,null)}catch(W){if(\"TypeError\"===W.name)return d=\nc.createNSReso" +
    "lver?c.createNSResolver(c.documentElement):Sb,c.evaluate(b,a,d,9,n" +
    "ull);throw W;}}catch(fc){throw new Fa(32,\"Unable to locate an elem" +
    "ent with the xpath expression \"+b+\" because of the following error" +
    ":\\n\"+fc);}}\nfunction Ub(a,b){var c=function(){var c=Tb(b,a);return" +
    " c?c.singleNodeValue||null:b.selectSingleNode?(c=y(b),c.setPropert" +
    "y&&c.setProperty(\"SelectionLanguage\",\"XPath\"),b.selectSingleNode(a" +
    ")):null}();if(null!==c&&(!c||1!=c.nodeType))throw new Fa(32,'The r" +
    "esult of the xpath expression \"'+a+'\" is: '+c+\". It should be an e" +
    "lement.\");return c};var Vb={aliceblue:\"#f0f8ff\",antiquewhite:\"#fae" +
    "bd7\",aqua:\"#00ffff\",aquamarine:\"#7fffd4\",azure:\"#f0ffff\",beige:\"#f" +
    "5f5dc\",bisque:\"#ffe4c4\",black:\"#000000\",blanchedalmond:\"#ffebcd\",b" +
    "lue:\"#0000ff\",blueviolet:\"#8a2be2\",brown:\"#a52a2a\",burlywood:\"#deb" +
    "887\",cadetblue:\"#5f9ea0\",chartreuse:\"#7fff00\",chocolate:\"#d2691e\"," +
    "coral:\"#ff7f50\",cornflowerblue:\"#6495ed\",cornsilk:\"#fff8dc\",crimso" +
    "n:\"#dc143c\",cyan:\"#00ffff\",darkblue:\"#00008b\",darkcyan:\"#008b8b\",d" +
    "arkgoldenrod:\"#b8860b\",darkgray:\"#a9a9a9\",darkgreen:\"#006400\",\ndar" +
    "kgrey:\"#a9a9a9\",darkkhaki:\"#bdb76b\",darkmagenta:\"#8b008b\",darkoliv" +
    "egreen:\"#556b2f\",darkorange:\"#ff8c00\",darkorchid:\"#9932cc\",darkred" +
    ":\"#8b0000\",darksalmon:\"#e9967a\",darkseagreen:\"#8fbc8f\",darkslatebl" +
    "ue:\"#483d8b\",darkslategray:\"#2f4f4f\",darkslategrey:\"#2f4f4f\",darkt" +
    "urquoise:\"#00ced1\",darkviolet:\"#9400d3\",deeppink:\"#ff1493\",deepsky" +
    "blue:\"#00bfff\",dimgray:\"#696969\",dimgrey:\"#696969\",dodgerblue:\"#1e" +
    "90ff\",firebrick:\"#b22222\",floralwhite:\"#fffaf0\",forestgreen:\"#228b" +
    "22\",fuchsia:\"#ff00ff\",gainsboro:\"#dcdcdc\",\nghostwhite:\"#f8f8ff\",go" +
    "ld:\"#ffd700\",goldenrod:\"#daa520\",gray:\"#808080\",green:\"#008000\",gr" +
    "eenyellow:\"#adff2f\",grey:\"#808080\",honeydew:\"#f0fff0\",hotpink:\"#ff" +
    "69b4\",indianred:\"#cd5c5c\",indigo:\"#4b0082\",ivory:\"#fffff0\",khaki:\"" +
    "#f0e68c\",lavender:\"#e6e6fa\",lavenderblush:\"#fff0f5\",lawngreen:\"#7c" +
    "fc00\",lemonchiffon:\"#fffacd\",lightblue:\"#add8e6\",lightcoral:\"#f080" +
    "80\",lightcyan:\"#e0ffff\",lightgoldenrodyellow:\"#fafad2\",lightgray:\"" +
    "#d3d3d3\",lightgreen:\"#90ee90\",lightgrey:\"#d3d3d3\",lightpink:\"#ffb6" +
    "c1\",lightsalmon:\"#ffa07a\",\nlightseagreen:\"#20b2aa\",lightskyblue:\"#" +
    "87cefa\",lightslategray:\"#778899\",lightslategrey:\"#778899\",lightste" +
    "elblue:\"#b0c4de\",lightyellow:\"#ffffe0\",lime:\"#00ff00\",limegreen:\"#" +
    "32cd32\",linen:\"#faf0e6\",magenta:\"#ff00ff\",maroon:\"#800000\",mediuma" +
    "quamarine:\"#66cdaa\",mediumblue:\"#0000cd\",mediumorchid:\"#ba55d3\",me" +
    "diumpurple:\"#9370db\",mediumseagreen:\"#3cb371\",mediumslateblue:\"#7b" +
    "68ee\",mediumspringgreen:\"#00fa9a\",mediumturquoise:\"#48d1cc\",medium" +
    "violetred:\"#c71585\",midnightblue:\"#191970\",mintcream:\"#f5fffa\",mis" +
    "tyrose:\"#ffe4e1\",\nmoccasin:\"#ffe4b5\",navajowhite:\"#ffdead\",navy:\"#" +
    "000080\",oldlace:\"#fdf5e6\",olive:\"#808000\",olivedrab:\"#6b8e23\",oran" +
    "ge:\"#ffa500\",orangered:\"#ff4500\",orchid:\"#da70d6\",palegoldenrod:\"#" +
    "eee8aa\",palegreen:\"#98fb98\",paleturquoise:\"#afeeee\",palevioletred:" +
    "\"#db7093\",papayawhip:\"#ffefd5\",peachpuff:\"#ffdab9\",peru:\"#cd853f\"," +
    "pink:\"#ffc0cb\",plum:\"#dda0dd\",powderblue:\"#b0e0e6\",purple:\"#800080" +
    "\",red:\"#ff0000\",rosybrown:\"#bc8f8f\",royalblue:\"#4169e1\",saddlebrow" +
    "n:\"#8b4513\",salmon:\"#fa8072\",sandybrown:\"#f4a460\",seagreen:\"#2e8b5" +
    "7\",\nseashell:\"#fff5ee\",sienna:\"#a0522d\",silver:\"#c0c0c0\",skyblue:\"" +
    "#87ceeb\",slateblue:\"#6a5acd\",slategray:\"#708090\",slategrey:\"#70809" +
    "0\",snow:\"#fffafa\",springgreen:\"#00ff7f\",steelblue:\"#4682b4\",tan:\"#" +
    "d2b48c\",teal:\"#008080\",thistle:\"#d8bfd8\",tomato:\"#ff6347\",turquois" +
    "e:\"#40e0d0\",violet:\"#ee82ee\",wheat:\"#f5deb3\",white:\"#ffffff\",white" +
    "smoke:\"#f5f5f5\",yellow:\"#ffff00\",yellowgreen:\"#9acd32\"};var Wb=\"ba" +
    "ckgroundColor borderTopColor borderRightColor borderBottomColor bo" +
    "rderLeftColor color outlineColor\".split(\" \"),Xb=/#([0-9a-fA-F])([0" +
    "-9a-fA-F])([0-9a-fA-F])/,Yb=/^#(?:[0-9a-f]{3}){1,2}$/i,Zb=/^(?:rgb" +
    "a)?\\((\\d{1,3}),\\s?(\\d{1,3}),\\s?(\\d{1,3}),\\s?(0|1|0\\.\\d*)\\)$/i,$b=/" +
    "^(?:rgb)?\\((0|[1-9]\\d{0,2}),\\s?(0|[1-9]\\d{0,2}),\\s?(0|[1-9]\\d{0,2}" +
    ")\\)$/i;function ac(a){return(a=a.exec(va))?a[1]:\"\"}ac(/Android\\s+(" +
    "[0-9.]+)/)||ac(/Version\\/([0-9.]+)/);function bc(a){var b=0,c=ka(S" +
    "tring(cc)).split(\".\");a=ka(String(a)).split(\".\");for(var d=Math.ma" +
    "x(c.length,a.length),e=0;0==b&&e<d;e++){var f=c[e]||\"\",g=a[e]||\"\"," +
    "p=RegExp(\"(\\\\d*)(\\\\D*)\",\"g\"),l=RegExp(\"(\\\\d*)(\\\\D*)\",\"g\");do{var m" +
    "=p.exec(f)||[\"\",\"\",\"\"],k=l.exec(g)||[\"\",\"\",\"\"];if(0==m[0].length&&" +
    "0==k[0].length)break;b=la(0==m[1].length?0:parseInt(m[1],10),0==k[" +
    "1].length?0:parseInt(k[1],10))||la(0==m[2].length,0==k[2].length)|" +
    "|la(m[2],k[2])}while(0==b)}}\nvar dc=/Android\\s+([0-9\\.]+)/.exec(va" +
    "),cc=dc?dc[1]:\"0\";bc(2.3);bc(4);function Y(a,b){return!!a&&1==a.no" +
    "deType&&(!b||a.tagName.toUpperCase()==b)}function ec(a){for(a=a.pa" +
    "rentNode;a&&1!=a.nodeType&&9!=a.nodeType&&11!=a.nodeType;)a=a.pare" +
    "ntNode;return Y(a)?a:null}\nfunction Z(a,b){var c=ma(b);if(\"float\"=" +
    "=c||\"cssFloat\"==c||\"styleFloat\"==c)c=\"cssFloat\";var d;a:{d=c;var e" +
    "=y(a);if(e.defaultView&&e.defaultView.getComputedStyle&&(e=e.defau" +
    "ltView.getComputedStyle(a,null))){d=e[d]||e.getPropertyValue(d)||\"" +
    "\";break a}d=\"\"}d=d||gc(a,c);if(null===d)d=null;else if(0<=qa(Wb,c)" +
    "){b:{var f=d.match(Zb);if(f){var c=Number(f[1]),e=Number(f[2]),g=N" +
    "umber(f[3]),f=Number(f[4]);if(0<=c&&255>=c&&0<=e&&255>=e&&0<=g&&25" +
    "5>=g&&0<=f&&1>=f){c=[c,e,g,f];break b}}c=null}if(!c)b:{if(g=d.matc" +
    "h($b))if(c=\nNumber(g[1]),e=Number(g[2]),g=Number(g[3]),0<=c&&255>=" +
    "c&&0<=e&&255>=e&&0<=g&&255>=g){c=[c,e,g,1];break b}c=null}if(!c)b:" +
    "{c=d.toLowerCase();e=Vb[c.toLowerCase()];if(!e&&(e=\"#\"==c.charAt(0" +
    ")?c:\"#\"+c,4==e.length&&(e=e.replace(Xb,\"#$1$1$2$2$3$3\")),!Yb.test(" +
    "e))){c=null;break b}c=[parseInt(e.substr(1,2),16),parseInt(e.subst" +
    "r(3,2),16),parseInt(e.substr(5,2),16),1]}d=c?\"rgba(\"+c.join(\", \")+" +
    "\")\":d}return d}\nfunction gc(a,b){var c=a.currentStyle||a.style,d=c" +
    "[b];!q(d)&&\"function\"==ca(c.getPropertyValue)&&(d=c.getPropertyVal" +
    "ue(b));return\"inherit\"!=d?q(d)?d:null:(c=ec(a))?gc(c,b):null}\nfunc" +
    "tion hc(a,b,c){function d(a){var b=ic(a);return 0<b.height&&0<b.wi" +
    "dth?!0:Y(a,\"PATH\")&&(0<b.height||0<b.width)?(a=Z(a,\"stroke-width\")" +
    ",!!a&&0<parseInt(a,10)):\"hidden\"!=Z(a,\"overflow\")&&ra(a.childNodes" +
    ",function(a){return 3==a.nodeType||Y(a)&&d(a)})}function e(a){retu" +
    "rn\"hidden\"==jc(a)&&sa(a.childNodes,function(a){return!Y(a)||e(a)||" +
    "!d(a)})}if(!Y(a))throw Error(\"Argument to isShown must be of type " +
    "Element\");if(Y(a,\"BODY\"))return!0;if(Y(a,\"OPTION\")||Y(a,\"OPTGROUP\"" +
    "))return a=Da(a,function(a){return Y(a,\n\"SELECT\")}),!!a&&hc(a,!0,c" +
    ");var f=kc(a);if(f)return!!f.w&&0<f.rect.width&&0<f.rect.height&&h" +
    "c(f.w,b,c);if(Y(a,\"INPUT\")&&\"hidden\"==a.type.toLowerCase()||Y(a,\"N" +
    "OSCRIPT\"))return!1;f=Z(a,\"visibility\");return\"collapse\"!=f&&\"hidde" +
    "n\"!=f&&c(a)&&(b||0!=lc(a))&&d(a)?!e(a):!1}function mc(a){function " +
    "b(a){if(\"none\"==Z(a,\"display\"))return!1;a=ec(a);return!a||b(a)}ret" +
    "urn hc(a,!1,b)}\nfunction jc(a){function b(a){function b(a){return " +
    "a==g?!0:0==Z(a,\"display\").lastIndexOf(\"inline\",0)||\"absolute\"==c&&" +
    "\"static\"==Z(a,\"position\")?!1:!0}var c=Z(a,\"position\");if(\"fixed\"==" +
    "c)return m=!0,a==g?null:g;for(a=ec(a);a&&!b(a);)a=ec(a);return a}f" +
    "unction c(a){var b=a;if(\"visible\"==l)if(a==g&&p)b=p;else if(a==p)r" +
    "eturn{x:\"visible\",y:\"visible\"};b={x:Z(b,\"overflow-x\"),y:Z(b,\"overf" +
    "low-y\")};a==g&&(b.x=\"visible\"==b.x?\"auto\":b.x,b.y=\"visible\"==b.y?\"" +
    "auto\":b.y);return b}function d(a){if(a==g){var b=(new Ea(f)).a;\na=" +
    "b.scrollingElement?b.scrollingElement:b.body||b.documentElement;b=" +
    "b.parentWindow||b.defaultView;a=new w(b.pageXOffset||a.scrollLeft," +
    "b.pageYOffset||a.scrollTop)}else a=new w(a.scrollLeft,a.scrollTop)" +
    ";return a}var e=nc(a),f=y(a),g=f.documentElement,p=f.body,l=Z(g,\"o" +
    "verflow\"),m;for(a=b(a);a;a=b(a)){var k=c(a);if(\"visible\"!=k.x||\"vi" +
    "sible\"!=k.y){var B=ic(a);if(0==B.width||0==B.height)return\"hidden\"" +
    ";var I=e.right<B.left,W=e.bottom<B.top;if(I&&\"hidden\"==k.x||W&&\"hi" +
    "dden\"==k.y)return\"hidden\";if(I&&\"visible\"!=\nk.x||W&&\"visible\"!=k.y" +
    "){I=d(a);W=e.bottom<B.top-I.y;if(e.right<B.left-I.x&&\"visible\"!=k." +
    "x||W&&\"visible\"!=k.x)return\"hidden\";e=jc(a);return\"hidden\"==e?\"hid" +
    "den\":\"scroll\"}I=e.left>=B.left+B.width;B=e.top>=B.top+B.height;if(" +
    "I&&\"hidden\"==k.x||B&&\"hidden\"==k.y)return\"hidden\";if(I&&\"visible\"!" +
    "=k.x||B&&\"visible\"!=k.y){if(m&&(k=d(a),e.left>=g.scrollWidth-k.x||" +
    "e.right>=g.scrollHeight-k.y))return\"hidden\";e=jc(a);return\"hidden\"" +
    "==e?\"hidden\":\"scroll\"}}}return\"none\"}\nfunction ic(a){var b=kc(a);i" +
    "f(b)return b.rect;if(Y(a,\"HTML\"))return a=y(a),a=((a?a.parentWindo" +
    "w||a.defaultView:window)||window).document,a=\"CSS1Compat\"==a.compa" +
    "tMode?a.documentElement:a.body,a=new x(a.clientWidth,a.clientHeigh" +
    "t),new A(0,0,a.width,a.height);var c;try{c=a.getBoundingClientRect" +
    "()}catch(d){return new A(0,0,0,0)}return new A(c.left,c.top,c.righ" +
    "t-c.left,c.bottom-c.top)}\nfunction kc(a){var b=Y(a,\"MAP\");if(!b&&!" +
    "Y(a,\"AREA\"))return null;var c=b?a:Y(a.parentNode,\"MAP\")?a.parentNo" +
    "de:null,d=null,e=null;if(c&&c.name&&(d=y(c),d=Ub('/descendant::*[@" +
    "usemap = \"#'+c.name+'\"]',d))&&(e=ic(d),!b&&\"default\"!=a.shape.toLo" +
    "werCase())){var f=oc(a);a=Math.min(Math.max(f.left,0),e.width);b=M" +
    "ath.min(Math.max(f.top,0),e.height);c=Math.min(f.width,e.width-a);" +
    "f=Math.min(f.height,e.height-b);e=new A(a+e.left,b+e.top,c,f)}retu" +
    "rn{w:d,rect:e||new A(0,0,0,0)}}\nfunction oc(a){var b=a.shape.toLow" +
    "erCase();a=a.coords.split(\",\");if(\"rect\"==b&&4==a.length){var b=a[" +
    "0],c=a[1];return new A(b,c,a[2]-b,a[3]-c)}if(\"circle\"==b&&3==a.len" +
    "gth)return b=a[2],new A(a[0]-b,a[1]-b,2*b,2*b);if(\"poly\"==b&&2<a.l" +
    "ength){for(var b=a[0],c=a[1],d=b,e=c,f=2;f+1<a.length;f+=2)b=Math." +
    "min(b,a[f]),d=Math.max(d,a[f]),c=Math.min(c,a[f+1]),e=Math.max(e,a" +
    "[f+1]);return new A(b,c,d-b,e-c)}return new A(0,0,0,0)}function nc" +
    "(a){a=ic(a);return new z(a.top,a.left+a.width,a.top+a.height,a.lef" +
    "t)}\nfunction pc(a){return a.replace(/^[^\\S\\xa0]+|[^\\S\\xa0]+$/g,\"\")" +
    "}\nfunction qc(a,b,c){if(Y(a,\"BR\"))b.push(\"\");else{var d=Y(a,\"TD\")," +
    "e=Z(a,\"display\"),f=!d&&!(0<=qa(rc,e)),g=q(a.previousElementSibling" +
    ")?a.previousElementSibling:ya(a.previousSibling),g=g?Z(g,\"display\"" +
    "):\"\",p=Z(a,\"float\")||Z(a,\"cssFloat\")||Z(a,\"styleFloat\");!f||\"run-i" +
    "n\"==g&&\"none\"==p||/^[\\s\\xa0]*$/.test(b[b.length-1]||\"\")||b.push(\"\"" +
    ");var l=mc(a),m=null,k=null;l&&(m=Z(a,\"white-space\"),k=Z(a,\"text-t" +
    "ransform\"));u(a.childNodes,function(a){c(a,b,l,m,k)});a=b[b.length" +
    "-1]||\"\";!d&&\"table-cell\"!=e||!a||ia(a)||(b[b.length-\n1]+=\" \");f&&\"" +
    "run-in\"!=e&&!/^[\\s\\xa0]*$/.test(a)&&b.push(\"\")}}function sc(a,b){q" +
    "c(a,b,function(a,b,e,f,g){3==a.nodeType&&e?tc(a,b,f,g):Y(a)&&sc(a," +
    "b)})}var rc=\"inline inline-block inline-table none table-cell tabl" +
    "e-column table-column-group\".split(\" \");\nfunction tc(a,b,c,d){a=a." +
    "nodeValue.replace(/[\\u200b\\u200e\\u200f]/g,\"\");a=a.replace(/(\\r\\n|\\" +
    "r|\\n)/g,\"\\n\");if(\"normal\"==c||\"nowrap\"==c)a=a.replace(/\\n/g,\" \");a" +
    "=\"pre\"==c||\"pre-wrap\"==c?a.replace(/[ \\f\\t\\v\\u2028\\u2029]/g,\"\\u00a" +
    "0\"):a.replace(/[\\ \\f\\t\\v\\u2028\\u2029]+/g,\" \");\"capitalize\"==d?a=a." +
    "replace(/(^|\\s)(\\S)/g,function(a,b,c){return b+c.toUpperCase()}):\"" +
    "uppercase\"==d?a=a.toUpperCase():\"lowercase\"==d&&(a=a.toLowerCase()" +
    ");c=b.pop()||\"\";ia(c)&&0==a.lastIndexOf(\" \",0)&&(a=a.substr(1));b." +
    "push(c+a)}\nfunction lc(a){var b=1,c=Z(a,\"opacity\");c&&(b=Number(c)" +
    ");(a=ec(a))&&(b*=lc(a));return b};ba(\"_\",function(a){var b=[];sc(a" +
    ",b);var c=b;a=c.length;for(var b=Array(a),c=r(c)?c.split(\"\"):c,d=0" +
    ";d<a;d++)d in c&&(b[d]=pc.call(void 0,c[d]));return pc(b.join(\"\\n\"" +
    ")).replace(/\\xa0/g,\" \")});;return this._.apply(null,arguments);})." +
    "apply({navigator:typeof window!=\"undefined\"?window.navigator:null}" +
    ",arguments);}\n"
  )
  .toString();
  static final String GET_VISIBLE_TEXT_ANDROID_license =
    "\n\n Copyright 2014 Software Freedom Conservancy\n\n Licensed under th" +
    "e Apache License, Version 2.0 (the \"License\");\n you may not use th" +
    "is file except in compliance with the License.\n You may obtain a c" +
    "opy of the License at\n\n      http://www.apache.org/licenses/LICENS" +
    "E-2.0\n\n Unless required by applicable law or agreed to in writing," +
    " software\n distributed under the License is distributed on an \"AS " +
    "IS\" BASIS,\n WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either e" +
    "xpress or implied.\n See the License for the specific language gove" +
    "rning permissions and\n limitations under the License.\n";
  private static final String GET_VISIBLE_TEXT_ANDROID_original() {
    return GET_VISIBLE_TEXT_ANDROID.replaceAll("xxx_rpl_lic", GET_VISIBLE_TEXT_ANDROID_license);
  }

  public static void main(String[] args) {
    if (args.length == 0) {
      {
        String message =     "CLEAR_ANDROID third_party/javascript/browser_automation/bot/fragme" +
    "nts/clear_android.js";
        System.out.println(message);
      }
      {
        String message =     "CLICK_ANDROID third_party/javascript/browser_automation/bot/fragme" +
    "nts/click_android.js";
        System.out.println(message);
      }
      {
        String message =     "FIND_ELEMENT_ANDROID third_party/javascript/browser_automation/bot" +
    "/fragments/find_element_android.js";
        System.out.println(message);
      }
      {
        String message =     "FIND_ELEMENTS_ANDROID third_party/javascript/browser_automation/bo" +
    "t/fragments/find_elements_android.js";
        System.out.println(message);
      }
      {
        String message =     "SEND_KEYS_ANDROID third_party/javascript/browser_automation/webdri" +
    "ver/atoms/fragments/send_keys_android.js";
        System.out.println(message);
      }
      {
        String message =     "ACTIVE_ELEMENT_ANDROID tools/android/webdriver/atom/active_element" +
    "_android.js";
        System.out.println(message);
      }
      {
        String message =     "FRAME_BY_ID_OR_NAME_ANDROID tools/android/webdriver/atom/frame_by_" +
    "id_or_name_android.js";
        System.out.println(message);
      }
      {
        String message =     "FRAME_BY_INDEX_ANDROID tools/android/webdriver/atom/frame_by_index" +
    "_android.js";
        System.out.println(message);
      }
      {
        String message =     "GET_VISIBLE_TEXT_ANDROID tools/android/webdriver/atom/get_visible_" +
    "text_android.js";
        System.out.println(message);
      }
      System.exit(0);
    }
    String name = args[0];
    if("CLEAR_ANDROID".equals(name)) {
      System.out.print(WebDriverAtomScripts.CLEAR_ANDROID_original());
      System.exit(0);
    }
    if("CLICK_ANDROID".equals(name)) {
      System.out.print(WebDriverAtomScripts.CLICK_ANDROID_original());
      System.exit(0);
    }
    if("FIND_ELEMENT_ANDROID".equals(name)) {
      System.out.print(WebDriverAtomScripts.FIND_ELEMENT_ANDROID_original());
      System.exit(0);
    }
    if("FIND_ELEMENTS_ANDROID".equals(name)) {
      System.out.print(WebDriverAtomScripts.FIND_ELEMENTS_ANDROID_original());
      System.exit(0);
    }
    if("SEND_KEYS_ANDROID".equals(name)) {
      System.out.print(WebDriverAtomScripts.SEND_KEYS_ANDROID_original());
      System.exit(0);
    }
    if("ACTIVE_ELEMENT_ANDROID".equals(name)) {
      System.out.print(WebDriverAtomScripts.ACTIVE_ELEMENT_ANDROID_original());
      System.exit(0);
    }
    if("FRAME_BY_ID_OR_NAME_ANDROID".equals(name)) {
      System.out.print(WebDriverAtomScripts.FRAME_BY_ID_OR_NAME_ANDROID_original());
      System.exit(0);
    }
    if("FRAME_BY_INDEX_ANDROID".equals(name)) {
      System.out.print(WebDriverAtomScripts.FRAME_BY_INDEX_ANDROID_original());
      System.exit(0);
    }
    if("GET_VISIBLE_TEXT_ANDROID".equals(name)) {
      System.out.print(WebDriverAtomScripts.GET_VISIBLE_TEXT_ANDROID_original());
      System.exit(0);
    }
    System.exit(1);
  }
}