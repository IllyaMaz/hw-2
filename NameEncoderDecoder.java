class NameEncoderDecoder{
    public String encode(String name){
    String a = name.replace("e","1");
      a = a.replace("u","2");
      a = a.replace("i","3");
      a = a.replace("o","4");
      a = a.replace("a","5");
      a = "NOTFORYOU" + a + "YESNOTFORYOU";
      return a;
    }
  
    public String decode(String name){
    String a = name.replace("1","e");
      a = a.replace("2","u");
      a = a.replace("3","i");
      a = a.replace("4","o");
      a = a.replace("5","a");
      a = a.replace("NOTFORYOU","");
      a = a.replace("YES","");
      return a;
    }  
}