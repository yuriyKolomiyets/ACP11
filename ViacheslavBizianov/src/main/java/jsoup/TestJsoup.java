package jsoup;


public class TestJsoup {
    public static void main(String[] args) {

        ExDownloader exDownloader = new ExDownloader();

        final String PATH1 = "http://tpa.kiev.ua";
        final String PATH2 = "http://www.ex.ua/78657081?r=82416,80928";

        //JsoupUtils.getLinks(PATH1);
        //JsoupUtils.getLinks(PATH2);

        exDownloader.downloadAllFiles(PATH2);

    }
}
