[![build status](https://github.com/opengoofy/hippo4j/actions/workflows/ci.yml/badge.svg?event=push)](https://github.com/opengoofy/hippo4j)
[![codecov](https://codecov.io/gh/opengoofy/hippo4j/branch/develop/graph/badge.svg?token=WBUVJN107I)](https://codecov.io/gh/opengoofy/hippo4j)
![maven](https://img.shields.io/maven-central/v/com.alibaba.otter/canal.svg)
[![license](https://img.shields.io/badge/license-Apache--2.0-green.svg)](http://www.apache.org/licenses/LICENSE-2.0)
![](https://img.shields.io/github/contributors/opengoofy/hippo4j)
[![percentage of issues still open](http://isitmaintained.com/badge/open/opengoofy/hippo4j.svg)](http://isitmaintained.com/project/opengoofy/hippo4j "percentage of issues still open")

![GitHub last commit (branch)](https://img.shields.io/github/last-commit/opengoofy/hippo4j/develop?color=orange)

## 简介

![](https://oss.open8gu.com/image-20231115133642504.png)

短链接（Short Link）是指将一个原始的长 URL（Uniform Resource Locator）通过特定的算法或服务转化为一个更短、易于记忆的
URL。短链接通常只包含几个字符，而原始的长 URL 可能会非常长。

短链接的原理非常简单，通过一个原始链接生成个相对短的链接，然后通过访问短链接跳转到原始链接。

如果更细节一些的话，那就是：

1. **生成唯一标识符**：当用户输入或提交一个长 URL 时，短链接服务会生成一个唯一的标识符或者短码。
2. **将标识符与长 URL 关联**：短链接服务将这个唯一标识符与用户提供的长 URL 关联起来，并将其保存在数据库或者其他持久化存储中。
3. **创建短链接**：将生成的唯一标识符加上短链接服务的域名（例如：http://nurl.ink ）作为前缀，构成一个短链接。
4. **重定向**：当用户访问该短链接时，短链接服务接收到请求后会根据唯一标识符查找关联的长 URL，然后将用户重定向到这个长 URL。
5. **跟踪统计**：一些短链接服务还会提供访问统计和分析功能，记录访问量、来源、地理位置等信息。
