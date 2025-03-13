package com.example.demo1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        DataBase.addwords(
                new word("elma", "apple", "/ˈæp.əl/"),
                new word("kitap", "book", "/bʊk/"),
                new word("ev", "house", "/haʊs/"),
                new word("araba", "car", "/kɑːr/"),
                new word("ağaç", "tree", "/triː/")
        );

        DataBase.addwords(
                new word("su", "water", "/ˈwɔː.tər/"),
                new word("güneş", "sun", "/sʌn/"),
                new word("arkadaş", "friend", "/frɛnd/"),
                new word("okul", "school", "/skuːl/"),
                new word("bilgisayar", "computer", "/kəmˈpjuː.tər/")
        );

        DataBase.addwords(
                new word("masa", "table", "/ˈteɪ.bəl/"),
                new word("kalem", "pen", "/pɛn/"),
                new word("defter", "notebook", "/ˈnoʊt.bʊk/"),
                new word("sandalye", "chair", "/tʃeər/"),
                new word("kapı", "door", "/dɔːr/")
        );

        DataBase.addwords(
                new word("pencere", "window", "/ˈwɪn.doʊ/"),
                new word("çanta", "bag", "/bæɡ/"),
                new word("telefon", "phone", "/foʊn/"),
                new word("yazılım", "software", "/ˈsɒft.weər/"),
                new word("televizyon", "television", "/ˈtel.ɪ.vɪʒ.ən/")
        );

        DataBase.addwords(
                new word("yemek", "food", "/fuːd/"),
                new word("balık", "fish", "/fɪʃ/"),
                new word("uçak", "airplane", "/ˈɛər.pleɪn/"),
                new word("yol", "road", "/roʊd/"),
                new word("şehir", "city", "/ˈsɪt.i/")
        );

        DataBase.addwords(
                new word("köpek", "dog", "/dɔːɡ/"),
                new word("kedi", "cat", "/kæt/"),
                new word("kuş", "bird", "/bɜːrd/"),
                new word("bahçe", "garden", "/ˈɡɑːr.dən/"),
                new word("deniz", "sea", "/siː/")
        );

        DataBase.addwords(
                new word("baş", "head", "/hɛd/"),
                new word("göz", "eye", "/aɪ/"),
                new word("kulak", "ear", "/ɪər/"),
                new word("ağız", "mouth", "/maʊθ/"),
                new word("burun", "nose", "/noʊz/"));
        DataBase.addwords(
                new word("kol", "arm", "/ɑːrm/"),
                new word("el", "hand", "/hænd/"),
                new word("bacak", "leg", "/lɛɡ/"),
                new word("ayak", "foot", "/fʊt/"),
                new word("diz", "knee", "/niː/"));
        DataBase.addwords(
                new word("sırt", "back", "/bæk/"),
                new word("karın", "belly", "/ˈbɛli/"),
                new word("omuz", "shoulder", "/ˈʃoʊldər/"),
                new word("boyun", "neck", "/nɛk/"),
                new word("saç", "hair", "/hɛr/"));
        DataBase.addwords(
                new word("diş", "tooth", "/tuːθ/"),
                new word("dudak", "lip", "/lɪp/"),
                new word("tırnak", "nail", "/neɪl/"),
                new word("karın", "stomach", "/ˈstʌmək/"),
                new word("beyin", "brain", "/breɪn/"));
        DataBase.addwords(

                new word("ekmek", "bread", "/brɛd/"),
                new word("peynir", "cheese", "/ʧiːz/"),
                new word("yumurta", "egg", "/ɛɡ/"),
                new word("et", "meat", "/miːt/"),
                new word("balık", "fish", "/fɪʃ/"));
        DataBase.addwords(
                new word("sebze", "vegetable", "/ˈvɛdʒtəbl/"),
                new word("meyve", "fruit", "/fruːt/"),
                new word("tavuk", "chicken", "/ˈʧɪkɪn/"),
                new word("pirinç", "rice", "/raɪs/"),
                new word("makarna", "pasta", "/ˈpɑːstə/"));
        DataBase.addwords(
                new word("çorba", "soup", "/suːp/"),
                new word("salata", "salad", "/ˈsæləd/"),
                new word("sandviç", "sandwich", "/ˈsænwɪʧ/"),
                new word("tatlı", "dessert", "/dɪˈzɜːt/"),
                new word("pide", "pita", "/ˈpiːtə/"));
        DataBase.addwords(
                new word("çikolata", "chocolate", "/ˈʧɒklət/"),
                new word("kek", "cake", "/keɪk/"),
                new word("dondurma", "ice cream", "/aɪs kriːm/"),
                new word("kahve", "coffee", "/ˈkɔːfi/"),
                new word("çay", "tea", "/tiː/"));
        DataBase.addwords(
                new word("futbol", "football", "/ˈfʊt.bɔːl/"),
                new word("basketbol", "basketball", "/ˈbɑː.skɪt.bɔːl/"),
                new word("voleybol", "volleyball", "/ˈvɒl.i.bɔːl/"),
                new word("tenis", "tennis", "/ˈtɛn.ɪs/"),
                new word("yüzme", "swimming", "/ˈswɪm.ɪŋ/"));
        DataBase.addwords(
                new word("koşu", "running", "/ˈrʌn.ɪŋ/"),
                new word("bisiklet", "cycling", "/ˈsaɪ.klɪŋ/"),
                new word("golf", "golf", "/ɡɒlf/"),
                new word("boks", "boxing", "/ˈbɒk.sɪŋ/"),
                new word("yoga", "yoga", "/ˈjoʊ.ɡə/"));
        DataBase.addwords(
                new word("kayak", "skiing", "/ˈskiː.ɪŋ/"),
                new word("snowboard", "snowboarding", "/ˈsnoʊˌbɔːrd.ɪŋ/"),
                new word("atletizm", "athletics", "/æθˈlɛt.ɪks/"),
                new word("ragbi", "rugby", "/ˈrʌɡ.bi/"),
                new word("dalgıçlık", "diving", "/ˈdaɪ.vɪŋ/"));
        DataBase.addwords(
                new word("okçuluk", "archery", "/ˈɑː.tʃər.i/"),
                new word("jimnastik", "gymnastics", "/dʒɪmˈnæs.tɪks/"),
                new word("masa tenisi", "table tennis", "/ˈteɪ.bl ˈtɛn.ɪs/"),
                new word("dağcılık", "mountaineering", "/ˌmaʊn.tɪˈnɪə.rɪŋ/"),
                new word("halter", "weightlifting", "/ˈweɪtˌlɪf.tɪŋ/"));
        DataBase.addwords(
                new word("Türkiye", "Turkey", "/ˈtɜː.ki/"),
                new word("Amerika", "United States", "/juˈnaɪ.tɪd ˈsteɪts/"),
                new word("İngiltere", "United Kingdom", "/juˈnaɪ.tɪd ˈkɪŋ.dəm/"),
                new word("Almanya", "Germany", "/ˈdʒɜː.mə.ni/"),
                new word("Fransa", "France", "/frɑːns/"));
        DataBase.addwords(
                new word("İtalya", "Italy", "/ˈɪt.əl.i/"),
                new word("İspanya", "Spain", "/speɪn/"),
                new word("Rusya", "Russia", "/ˈrʌʃ.ə/"),
                new word("Çin", "China", "/ˈtʃaɪ.nə/"),
                new word("Japonya", "Japan", "/dʒəˈpæn/"));
        DataBase.addwords(
                new word("Kanada", "Canada", "/ˈkæn.ə.də/"),
                new word("Brezilya", "Brazil", "/brəˈzɪl/"),
                new word("Hindistan", "India", "/ˈɪn.di.ə/"),
                new word("Avustralya", "Australia", "/ɒˈstreɪ.li.ə/"),
                new word("Meksika", "Mexico", "/ˈmɛk.sɪ.koʊ/"));
        DataBase.addwords(
                new word("Güney Kore", "South Korea", "/saʊθ kəˈriː.ə/"),
                new word("Yunanistan", "Greece", "/ɡriːs/"),
                new word("Hollanda", "Netherlands", "/ˈnɛð.ər.ləndz/"),
                new word("Mısır", "Egypt", "/ˈiː.dʒɪpt/"),
                new word("İsveç", "Sweden", "/ˈswiː.dən/"));
        DataBase.addwords(
                new word("kedi", "cat", "/kæt/"),
                new word("köpek", "dog", "/dɒɡ/"),
                new word("kuş", "bird", "/bɜːrd/"),
                new word("balık", "fish", "/fɪʃ/"),
                new word("at", "horse", "/hɔːrs/"));
        DataBase.addwords(
                new word("tavşan", "rabbit", "/ˈræb.ɪt/"),
                new word("inek", "cow", "/kaʊ/"),
                new word("koyun", "sheep", "/ʃiːp/"),
                new word("keçi", "goat", "/ɡoʊt/"),
                new word("tavuk", "chicken", "/ˈtʃɪk.ɪn/"));
        DataBase.addwords(
                new word("ayı", "bear", "/bɛər/"),
                new word("aslan", "lion", "/ˈlaɪ.ən/"),
                new word("kaplan", "tiger", "/ˈtaɪ.ɡər/"),
                new word("fil", "elephant", "/ˈɛl.ɪ.fənt/"),
                new word("zebra", "zebra", "/ˈziː.brə/"));
        DataBase.addwords(
                new word("maymun", "monkey", "/ˈmʌŋ.ki/"),
                new word("kurbağa", "frog", "/frɒɡ/"),
                new word("yılan", "snake", "/sneɪk/"),
                new word("tilki", "fox", "/fɒks/"),
                new word("panda", "panda", "/ˈpæn.də/"));
        DataBase.addwords(
                new word("doktor", "doctor", "/ˈdɒk.tər/"),
                new word("mühendis", "engineer", "/ˌɛn.dʒɪˈnɪr/"),
                new word("öğretmen", "teacher", "/ˈtiː.tʃər/"),
                new word("hemşire", "nurse", "/nɜːrs/"),
                new word("polis", "police officer", "/pəˈliːs ˈɒf.ɪ.sər/"));
        DataBase.addwords(
                new word("avukat", "lawyer", "/ˈlɔɪ.ər/"),
                new word("şoför", "driver", "/ˈdraɪ.vər/"),
                new word("aşçı", "chef", "/ʃɛf/"),
                new word("çiftçi", "farmer", "/ˈfɑːr.mər/"),
                new word("sanatçı", "artist", "/ˈɑːr.tɪst/"));
        DataBase.addwords(
                new word("mimar", "architect", "/ˈɑːr.kɪ.tekt/"),
                new word("veteriner", "veterinarian", "/ˌvɛt.ər.ɪˈnɛə.ri.ən/"),
                new word("yazılımcı", "software developer", "/ˈsɒf.twɛər dɪˈvɛləpər/"),
                new word("pilot", "pilot", "/ˈpaɪ.lət/"),
                new word("sekreter", "secretary", "/ˈsɛk.rɪ.tər.i/"));
        DataBase.addwords(
                new word("asker", "soldier", "/ˈsoʊl.dʒər/"),
                new word("diş hekimi", "dentist", "/ˈdɛn.tɪst/"),
                new word("gazeteci", "journalist", "/ˈdʒɜːr.nə.lɪst/"),
                new word("barmen", "bartender", "/ˈbɑːr.tɛndər/"),
                new word("kasiyer", "cashier", "/kæʃˈɪər/"));
        DataBase.addwords(
                new word("merhaba", "hello", "/həˈloʊ/"),
                new word("teşekkürler", "thank you", "/ˌθæŋk ˈjuː/"),
                new word("evet", "yes", "/jɛs/"),
                new word("hayır", "no", "/noʊ/"),
                new word("lütfen", "please", "/pliːz/"));
        DataBase.addwords(
                new word("özür dilerim", "sorry", "/ˈsɑːr.i/"),
                new word("günaydın", "good morning", "/ɡʊd ˈmɔːrnɪŋ/"),
                new word("iyi akşamlar", "good evening", "/ɡʊd ˈiːvnɪŋ/"),
                new word("hoşça kal", "goodbye", "/ɡʊdˈbaɪ/"),
                new word("isim", "name", "/neɪm/"));
        DataBase.addwords(
                new word("arkadaş", "friend", "/frɛnd/"),
                new word("aile", "family", "/ˈfæm.əl.i/"),
                new word("mutlu", "happy", "/ˈhæp.i/"),
                new word("üzgün", "sad", "/sæd/"),
                new word("zaman", "time", "/taɪm/"));
        DataBase.addwords(
                new word("yer", "place", "/pleɪs/"),
                new word("insan", "person", "/ˈpɜːr.sən/"),
                new word("iş", "work", "/wɜːrk/"),
                new word("okul", "school", "/skuːl/"),
                new word("şehir", "city", "/ˈsɪt.i/"));
        DataBase.addwords(new word(
                        "kırmızı", "red", "/rɛd/"),
                new word("mavi", "blue", "/bluː/"),
                new word("yeşil", "green", "/ɡriːn/"),
                new word("sarı", "yellow", "/ˈjɛl.oʊ/"),
                new word("turuncu", "orange", "/ˈɔːr.ɪndʒ/"));
        DataBase.addwords(
                new word("mor", "purple", "/ˈpɜːr.pəl/"),
                new word("pembe", "pink", "/pɪŋk/"),
                new word("kahverengi", "brown", "/braʊn/"),
                new word("beyaz", "white", "/waɪt/"),
                new word("siyah", "black", "/blæk/"));
        DataBase.addwords(
                new word("mor", "purple", "/ˈpɜːr.pəl/"),
                new word("pembe", "pink", "/pɪŋk/"),
                new word("kahverengi", "brown", "/braʊn/"),
                new word("beyaz", "white", "/waɪt/"),
                new word("siyah", "black", "/blæk/"));


        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("anasayfa.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700, 480 );
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}