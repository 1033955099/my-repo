// class 版本
// 只要看到UnsupportedClassVersionError就表示当前要加载的class文件版本超过了JVM的能力，必须使用更高版本的JVM才能运行。
// java11输出的class文件高支持的版本是55，java17是61，61超过了55java17超过java11的极限，所以运行不了

// 如果指定输出的class版本要兼容Java 11（即class版本55），那么这样编译生成的class文件就可以在Java >=11的环境中运行。
// 1.在javac命令行中用参数--release设置
// $ javac --release 11 Main.java
// 参数--release 11表示源码兼容Java 11，编译的class输出版本为Java 11兼容，即class版本55。
// 2.用参数--source指定源码版本，用参数--target指定输出class版本：
// $ javac --source 9 --target 11 Main.java
// --release参数和--source --target参数只能二选一，不能同时设置。
// 指定版本如果低于当前的JDK版本，会有一些潜在的问题。

// 如果运行时的JVM版本是Java 11，则编译时也最好使用Java 11，而不是用高版本的JDK编译输出低版本的class。
// 如果使用javac编译时不指定任何版本参数，那么相当于使用--release 当前版本编译，即源码版本和输出版本均为当前版本。
// 在开发阶段，多个版本的JDK可以同时安装，当前使用的JDK版本可由JAVA_HOME环境变量切换。


// 源码版本
// 在编写源码的时候，通常会预设一个源码的版本。在编译的时候，如果用--source或--release指定源码版本，则使用指定的源码版本检查语法。

// 高版本的JDK可编译输出低版本兼容的class文件，但需注意，低版本的JDK可能不存在高版本JDK添加的类和方法，导致运行时报错。

// 运行时使用哪个JDK版本，编译时就尽量使用同一版本的JDK编译源码。