package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;


public class hunter_controller {
    int mem=50;

    int ID = HelloController.getSavedID();

    public void initialize() {
        if(ID>20000){
            mem=999;
        }
    }
    public void AddColors(){
        if(DataBase.getStudent(HelloController.getSavedID()).getIsFirst(0)){
            if(DataBase.getStudent(HelloController.getSavedID()).get_mylist().size()>mem){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Eklenme başarısız");
                alert.setContentText(mem+"'den fazla kelimeniz bulunmaktadır\nPremium deneyin");
                alert.showAndWait();
                return;
            }

            DataBase.getStudent(HelloController.getSavedID()).add_mylist(
                    new word("kırmızı", "red", "/rɛd/"),
                    new word("mavi", "blue", "/bluː/"),
                    new word("yeşil", "green", "/ɡriːn/"),
                    new word("sarı", "yellow", "/ˈjɛl.oʊ/"),
                    new word("turuncu", "orange", "/ˈɔːr.ɪndʒ/"));
            DataBase.getStudent(HelloController.getSavedID()).add_mylist(
                    new word("mor", "purple", "/ˈpɜːr.pəl/"),
                    new word("pembe", "pink", "/pɪŋk/"),
                    new word("kahverengi", "brown", "/braʊn/"),
                    new word("beyaz", "white", "/waɪt/"),
                    new word("siyah", "black", "/blæk/"));
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Eklenme başarılı");
            alert.setContentText("Colors paketi listenize eklendi");
            alert.showAndWait();
            DataBase.getStudent(HelloController.getSavedID()).SetIsfirst(0,false);;
        }else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Eklenme başarısız");
            alert.setContentText("Bu listeyi daha önce aldınız");
            alert.showAndWait();
        }




    }

    public void Add_mostpop_20(){
        if(DataBase.getStudent(HelloController.getSavedID()).getIsFirst(1)) {
            if(DataBase.getStudent(HelloController.getSavedID()).get_mylist().size()>mem){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Eklenme başarısız");
                alert.setContentText(mem+"'den fazla kelimeniz bulunmaktadır\nPremium deneyin");
                alert.showAndWait();
                return;
            }
            DataBase.getStudent(HelloController.getSavedID()).add_mylist(
                    new word("merhaba", "hello", "/həˈloʊ/"),
                    new word("teşekkürler", "thank you", "/ˌθæŋk ˈjuː/"),
                    new word("evet", "yes", "/jɛs/"),
                    new word("hayır", "no", "/noʊ/"),
                    new word("lütfen", "please", "/pliːz/"));
            DataBase.getStudent(HelloController.getSavedID()).add_mylist(
                    new word("özür dilerim", "sorry", "/ˈsɑːr.i/"),
                    new word("günaydın", "good morning", "/ɡʊd ˈmɔːrnɪŋ/"),
                    new word("iyi akşamlar", "good evening", "/ɡʊd ˈiːvnɪŋ/"),
                    new word("hoşça kal", "goodbye", "/ɡʊdˈbaɪ/"),
                    new word("isim", "name", "/neɪm/"));
            DataBase.getStudent(HelloController.getSavedID()).add_mylist(
                    new word("arkadaş", "friend", "/frɛnd/"),
                    new word("aile", "family", "/ˈfæm.əl.i/"),
                    new word("mutlu", "happy", "/ˈhæp.i/"),
                    new word("üzgün", "sad", "/sæd/"),
                    new word("zaman", "time", "/taɪm/"));
            DataBase.getStudent(HelloController.getSavedID()).add_mylist(
                    new word("yer", "place", "/pleɪs/"),
                    new word("insan", "person", "/ˈpɜːr.sən/"),
                    new word("iş", "work", "/wɜːrk/"),
                    new word("okul", "school", "/skuːl/"),
                    new word("şehir", "city", "/ˈsɪt.i/"));
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Eklenme başarılı");
            alert.setContentText("Most Pop. 20 paketi listenize eklendi");
            alert.showAndWait();
            DataBase.getStudent(HelloController.getSavedID()).SetIsfirst(1,false);;
        }else{
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Eklenme başarısız");
                alert.setContentText("Bu listeyi daha önce aldınız");
                alert.showAndWait();
        }

    }
    public void Addjobs(){
        if(DataBase.getStudent(HelloController.getSavedID()).getIsFirst(2)) {
            if(DataBase.getStudent(HelloController.getSavedID()).get_mylist().size()>mem){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Eklenme başarısız");
                alert.setContentText(mem+"'den fazla kelimeniz bulunmaktadır\nPremium deneyin");
                alert.showAndWait();
                return;
            }
            DataBase.getStudent(HelloController.getSavedID()).add_mylist(new word(
                            "doktor", "doctor", "/ˈdɒk.tər/"),
                    new word("mühendis", "engineer", "/ˌɛn.dʒɪˈnɪr/"),
                    new word("öğretmen", "teacher", "/ˈtiː.tʃər/"),
                    new word("hemşire", "nurse", "/nɜːrs/"),
                    new word("polis", "police officer", "/pəˈliːs ˈɒf.ɪ.sər/"));
            DataBase.getStudent(HelloController.getSavedID()).add_mylist(
                    new word("avukat", "lawyer", "/ˈlɔɪ.ər/"),
                    new word("şoför", "driver", "/ˈdraɪ.vər/"),
                    new word("aşçı", "chef", "/ʃɛf/"),
                    new word("çiftçi", "farmer", "/ˈfɑːr.mər/"),
                    new word("sanatçı", "artist", "/ˈɑːr.tɪst/"));
            DataBase.getStudent(HelloController.getSavedID()).add_mylist(
                    new word("mimar", "architect", "/ˈɑːr.kɪ.tekt/"),
                    new word("veteriner", "veterinarian", "/ˌvɛt.ər.ɪˈnɛə.ri.ən/"),
                    new word("yazılımcı", "software developer", "/ˈsɒf.twɛər dɪˈvɛləpər/"),
                    new word("pilot", "pilot", "/ˈpaɪ.lət/"),
                    new word("sekreter", "secretary", "/ˈsɛk.rɪ.tər.i/"));
            DataBase.getStudent(HelloController.getSavedID()).add_mylist(
                    new word("asker", "soldier", "/ˈsoʊl.dʒər/"),
                    new word("diş hekimi", "dentist", "/ˈdɛn.tɪst/"),
                    new word("gazeteci", "journalist", "/ˈdʒɜːr.nə.lɪst/"),
                    new word("barmen", "bartender", "/ˈbɑːr.tɛndər/"),
                    new word("kasiyer", "cashier", "/kæʃˈɪər/"));

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Eklenme başarılı");
            alert.setContentText("Jobs paketi listenize eklendi");
            alert.showAndWait();
            DataBase.getStudent(HelloController.getSavedID()).SetIsfirst(2,false);;
        }else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Eklenme başarısız");
            alert.setContentText("Bu listeyi daha önce aldınız");
            alert.showAndWait();
        }


        }
    public void AddAnimals(){
        if(DataBase.getStudent(HelloController.getSavedID()).getIsFirst(3)) {
            if(DataBase.getStudent(HelloController.getSavedID()).get_mylist().size()>mem){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Eklenme başarısız");
                alert.setContentText(mem+"'den fazla kelimeniz bulunmaktadır\nPremium deneyin");
                alert.showAndWait();
                return;
            }
            DataBase.getStudent(HelloController.getSavedID()).add_mylist(
                    new word("kedi", "cat", "/kæt/"),
                    new word("köpek", "dog", "/dɒɡ/"),
                    new word("kuş", "bird", "/bɜːrd/"),
                    new word("balık", "fish", "/fɪʃ/"),
                    new word("at", "horse", "/hɔːrs/"));
            DataBase.getStudent(HelloController.getSavedID()).add_mylist(
                    new word("tavşan", "rabbit", "/ˈræb.ɪt/"),
                    new word("inek", "cow", "/kaʊ/"),
                    new word("koyun", "sheep", "/ʃiːp/"),
                    new word("keçi", "goat", "/ɡoʊt/"),
                    new word("tavuk", "chicken", "/ˈtʃɪk.ɪn/"));
            DataBase.getStudent(HelloController.getSavedID()).add_mylist(
                    new word("ayı", "bear", "/bɛər/"),
                    new word("aslan", "lion", "/ˈlaɪ.ən/"),
                    new word("kaplan", "tiger", "/ˈtaɪ.ɡər/"),
                    new word("fil", "elephant", "/ˈɛl.ɪ.fənt/"),
                    new word("zebra", "zebra", "/ˈziː.brə/"));
            DataBase.getStudent(HelloController.getSavedID()).add_mylist(
                    new word("maymun", "monkey", "/ˈmʌŋ.ki/"),
                    new word("kurbağa", "frog", "/frɒɡ/"),
                    new word("yılan", "snake", "/sneɪk/"),
                    new word("tilki", "fox", "/fɒks/"),
                    new word("panda", "panda", "/ˈpæn.də/"));
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Eklenme başarılı");
            alert.setContentText("Animals paketi listenize eklendi");
            alert.showAndWait();
            DataBase.getStudent(HelloController.getSavedID()).SetIsfirst(3,false);;
        }else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Eklenme başarısız");
            alert.setContentText("Bu listeyi daha önce aldınız");
            alert.showAndWait();
        }


    }
    public void AddCountries(){
        if(DataBase.getStudent(HelloController.getSavedID()).getIsFirst(4)) {
            if(DataBase.getStudent(HelloController.getSavedID()).get_mylist().size()>mem){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Eklenme başarısız");
                alert.setContentText(mem+"'den fazla kelimeniz bulunmaktadır\nPremium deneyin");
                alert.showAndWait();
                return;
            }
            DataBase.getStudent(HelloController.getSavedID()).add_mylist(
                    new word("Türkiye", "Turkey", "/ˈtɜː.ki/"),
                    new word("Amerika", "United States", "/juˈnaɪ.tɪd ˈsteɪts/"),
                    new word("İngiltere", "United Kingdom", "/juˈnaɪ.tɪd ˈkɪŋ.dəm/"),
                    new word("Almanya", "Germany", "/ˈdʒɜː.mə.ni/"),
                    new word("Fransa", "France", "/frɑːns/"));
            DataBase.getStudent(HelloController.getSavedID()).add_mylist(
                    new word("İtalya", "Italy", "/ˈɪt.əl.i/"),
                    new word("İspanya", "Spain", "/speɪn/"),
                    new word("Rusya", "Russia", "/ˈrʌʃ.ə/"),
                    new word("Çin", "China", "/ˈtʃaɪ.nə/"),
                    new word("Japonya", "Japan", "/dʒəˈpæn/"));
            DataBase.getStudent(HelloController.getSavedID()).add_mylist(
                    new word("Kanada", "Canada", "/ˈkæn.ə.də/"),
                    new word("Brezilya", "Brazil", "/brəˈzɪl/"),
                    new word("Hindistan", "India", "/ˈɪn.di.ə/"),
                    new word("Avustralya", "Australia", "/ɒˈstreɪ.li.ə/"),
                    new word("Meksika", "Mexico", "/ˈmɛk.sɪ.koʊ/"));
            DataBase.getStudent(HelloController.getSavedID()).add_mylist(
                    new word("Güney Kore", "South Korea", "/saʊθ kəˈriː.ə/"),
                    new word("Yunanistan", "Greece", "/ɡriːs/"),
                    new word("Hollanda", "Netherlands", "/ˈnɛð.ər.ləndz/"),
                    new word("Mısır", "Egypt", "/ˈiː.dʒɪpt/"),
                    new word("İsveç", "Sweden", "/ˈswiː.dən/"));
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Eklenme başarılı");
            alert.setContentText("Countries paketi listenize eklendi");
            alert.showAndWait();
            DataBase.getStudent(HelloController.getSavedID()).SetIsfirst(4,false);;
        }else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Eklenme başarısız");
            alert.setContentText("Bu listeyi daha önce aldınız");
            alert.showAndWait();
        }
    }
    public void AddSports(){
        if(DataBase.getStudent(HelloController.getSavedID()).getIsFirst(5)) {
            if(DataBase.getStudent(HelloController.getSavedID()).get_mylist().size()>mem){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Eklenme başarısız");
                alert.setContentText(mem+"'den fazla kelimeniz bulunmaktadır\nPremium deneyin");
                alert.showAndWait();
                return;
            }
            DataBase.getStudent(HelloController.getSavedID()).add_mylist(
                    new word("futbol", "football", "/ˈfʊt.bɔːl/"),
                    new word("basketbol", "basketball", "/ˈbɑː.skɪt.bɔːl/"),
                    new word("voleybol", "volleyball", "/ˈvɒl.i.bɔːl/"),
                    new word("tenis", "tennis", "/ˈtɛn.ɪs/"),
                    new word("yüzme", "swimming", "/ˈswɪm.ɪŋ/"));
            DataBase.getStudent(HelloController.getSavedID()).add_mylist(
                    new word("koşu", "running", "/ˈrʌn.ɪŋ/"),
                    new word("bisiklet", "cycling", "/ˈsaɪ.klɪŋ/"),
                    new word("golf", "golf", "/ɡɒlf/"),
                    new word("boks", "boxing", "/ˈbɒk.sɪŋ/"),
                    new word("yoga", "yoga", "/ˈjoʊ.ɡə/"));
            DataBase.getStudent(HelloController.getSavedID()).add_mylist(
                    new word("kayak", "skiing", "/ˈskiː.ɪŋ/"),
                    new word("snowboard", "snowboarding", "/ˈsnoʊˌbɔːrd.ɪŋ/"),
                    new word("atletizm", "athletics", "/æθˈlɛt.ɪks/"),
                    new word("ragbi", "rugby", "/ˈrʌɡ.bi/"),
                    new word("dalgıçlık", "diving", "/ˈdaɪ.vɪŋ/"));
            DataBase.getStudent(HelloController.getSavedID()).add_mylist(
                    new word("okçuluk", "archery", "/ˈɑː.tʃər.i/"),
                    new word("jimnastik", "gymnastics", "/dʒɪmˈnæs.tɪks/"),
                    new word("masa tenisi", "table tennis", "/ˈteɪ.bl ˈtɛn.ɪs/"),
                    new word("dağcılık", "mountaineering", "/ˌmaʊn.tɪˈnɪə.rɪŋ/"),
                    new word("halter", "weightlifting", "/ˈweɪtˌlɪf.tɪŋ/"));
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Eklenme başarılı");
            alert.setContentText("Sports paketi listenize eklendi");
            alert.showAndWait();
            DataBase.getStudent(HelloController.getSavedID()).SetIsfirst(5,false);;
        }else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Eklenme başarısız");
            alert.setContentText("Bu listeyi daha önce aldınız");
            alert.showAndWait();
        }
    }
    public void AddFoods(){
        if(DataBase.getStudent(HelloController.getSavedID()).getIsFirst(6)) {
            if(DataBase.getStudent(HelloController.getSavedID()).get_mylist().size()>mem){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Eklenme başarısız");
                alert.setContentText(mem+"'den fazla kelimeniz bulunmaktadır\nPremium deneyin");
                alert.showAndWait();
                return;
            }
            DataBase.getStudent(HelloController.getSavedID()).add_mylist(

                    new word("ekmek", "bread", "/brɛd/"),
                    new word("peynir", "cheese", "/ʧiːz/"),
                    new word("yumurta", "egg", "/ɛɡ/"),
                    new word("et", "meat", "/miːt/"),
                    new word("balık", "fish", "/fɪʃ/"));
            DataBase.getStudent(HelloController.getSavedID()).add_mylist(
                    new word("sebze", "vegetable", "/ˈvɛdʒtəbl/"),
                    new word("meyve", "fruit", "/fruːt/"),
                    new word("tavuk", "chicken", "/ˈʧɪkɪn/"),
                    new word("pirinç", "rice", "/raɪs/"),
                    new word("makarna", "pasta", "/ˈpɑːstə/"));
            DataBase.getStudent(HelloController.getSavedID()).add_mylist(
                    new word("çorba", "soup", "/suːp/"),
                    new word("salata", "salad", "/ˈsæləd/"),
                    new word("sandviç", "sandwich", "/ˈsænwɪʧ/"),
                    new word("tatlı", "dessert", "/dɪˈzɜːt/"),
                    new word("pide", "pita", "/ˈpiːtə/"));
            DataBase.getStudent(HelloController.getSavedID()).add_mylist(
                    new word("çikolata", "chocolate", "/ˈʧɒklət/"),
                    new word("kek", "cake", "/keɪk/"),
                    new word("dondurma", "ice cream", "/aɪs kriːm/"),
                    new word("kahve", "coffee", "/ˈkɔːfi/"),
                    new word("çay", "tea", "/tiː/"));
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Eklenme başarılı");
            alert.setContentText("Food paketi listenize eklendi");
            alert.showAndWait();
            DataBase.getStudent(HelloController.getSavedID()).SetIsfirst(6,false);;
        }else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Eklenme başarısız");
            alert.setContentText("Bu listeyi daha önce aldınız");
            alert.showAndWait();
        }
    }
    public void AddBodyParts(){
        if(DataBase.getStudent(HelloController.getSavedID()).getIsFirst(7)) {
            if(DataBase.getStudent(HelloController.getSavedID()).get_mylist().size()>mem){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Eklenme başarısız");
                alert.setContentText(mem+"'den fazla kelimeniz bulunmaktadır\nPremium deneyin");
                alert.showAndWait();
                return;
            }
            DataBase.getStudent(HelloController.getSavedID()).add_mylist(
                    new word("baş", "head", "/hɛd/"),
                    new word("göz", "eye", "/aɪ/"),
                    new word("kulak", "ear", "/ɪər/"),
                    new word("ağız", "mouth", "/maʊθ/"),
                    new word("burun", "nose", "/noʊz/"));
            DataBase.getStudent(HelloController.getSavedID()).add_mylist(
                    new word("kol", "arm", "/ɑːrm/"),
                    new word("el", "hand", "/hænd/"),
                    new word("bacak", "leg", "/lɛɡ/"),
                    new word("ayak", "foot", "/fʊt/"),
                    new word("diz", "knee", "/niː/"));
            DataBase.getStudent(HelloController.getSavedID()).add_mylist(
                    new word("sırt", "back", "/bæk/"),
                    new word("karın", "belly", "/ˈbɛli/"),
                    new word("omuz", "shoulder", "/ˈʃoʊldər/"),
                    new word("boyun", "neck", "/nɛk/"),
                    new word("saç", "hair", "/hɛr/"));
            DataBase.getStudent(HelloController.getSavedID()).add_mylist(
                    new word("diş", "tooth", "/tuːθ/"),
                    new word("dudak", "lip", "/lɪp/"),
                    new word("tırnak", "nail", "/neɪl/"),
                    new word("karın", "stomach", "/ˈstʌmək/"),
                    new word("beyin", "brain", "/breɪn/"));
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Eklenme başarılı");
            alert.setContentText("Body Part paketi listenize eklendi");
            alert.showAndWait();
            DataBase.getStudent(HelloController.getSavedID()).SetIsfirst(7,false);

        }else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Eklenme başarısız");
            alert.setContentText("Bu listeyi daha önce aldınız");
            alert.showAndWait();
        }

    }
        public void switchToInfoPage(ActionEvent e) throws IOException {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Info.fxml")));
            Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }



    public void switchToEnterancePage(ActionEvent e) throws IOException {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("enterance.fxml")));
            Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
    }
}
