#  这是一个前后端分离项目，包含了增删改查四个模块

所用技术栈：

1. springboot
2. vue
3. springmvc
4. mybatis
5. mysql
6. html
7. css
8. js

##项目博客地址：https://blog.csdn.net/weixin_43891901/article/details/113655444
# 1、VSCode创建项目

- 先选择**一个项目路径**，通过**终端命令行**进入：
- 进入命令行，进入项目**根目录**，打包创建项目

```xml
vue init webpack 项目名
```

![](https://cdn.jsdelivr.net/gh/JackieLing/mage1/img/20210125173728.png)

- 接下来命令行将进入用户交互模式：

![](https://cdn.jsdelivr.net/gh/JackieLing/mage1/img/20210125173841.png)

# 2、运行CLI脚手架项目

- 在 `1`中已经创建好了项目 **hello**，通过终端命令进入项目目录
- 通过命令 `npm start` 开始运行项目

![](https://cdn.jsdelivr.net/gh/JackieLing/mage1/img/20210125174813.png)

- 项目运行成功截图

![](https://cdn.jsdelivr.net/gh/JackieLing/mage1/img/20210125175143.png)

# 3、vue cli脚手架文件目录结构

![](https://cdn.jsdelivr.net/gh/JackieLing/mage1/img/20210125213751.png)

- `vue`项目的开发方式：

![](https://cdn.jsdelivr.net/gh/JackieLing/mage1/img/20210125214218.png)

# 4、如何开发Vue脚手架

- `在vue中的开发一切皆组件` 

# 5、在脚手架中使用axios

**安装--导入--配置**

- 直接安装！

```vue
npm install axios --save-dev
```

- 在`main.js`中引入`axios`。

```vue
import axios from 'axios'
```

- 修改内部的异步

```vue
Vue.prototype.$http=axios;//修改内部的异步
```

## 5.1使用axios

在需要发送异步请求的位置：

`this.$http.get("url").then((res)=>{})`



`this.$http.post("url").then((res)=>{})`

# 6、Vue Cli打包部署项目

- 在项目根目录下执行如下命令

```vue
npm run build
```

- 项目打包之后会生成一个 **新的目录**叫 `dist`，将这个目录文件直接放到后端项目的服务器上执行即可。这个目录文件又叫**生产目录**。
- 项目通过 `脚手架`打包之后，在拷贝到后端项目的 `static`静态文件目录下，并对 `index.html`文件作出如下修改

![](https://cdn.jsdelivr.net/gh/JackieLing/mage1/img/20210204162747.png)

**修改：**

![](https://cdn.jsdelivr.net/gh/JackieLing/mage1/img/20210204163750.png)

**通过项目访问路径**

`http://localhost:8989/vue/dist/index.html`

![](https://cdn.jsdelivr.net/gh/JackieLing/mage1/img/20210204164619.png)
