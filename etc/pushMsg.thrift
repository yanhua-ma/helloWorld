namespace java com.sankuai.hello.thrift

service HelloWorld{
    string welcome(1:string words);
}