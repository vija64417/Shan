package demo

class FirstGroovy {
    static void main(args) {
        def urlContents= "https://github.com/bharathsurya24/gittest1".toURL().getText()
        urlContents.eachLine{
        println it
        }
        }
}