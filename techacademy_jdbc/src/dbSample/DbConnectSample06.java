package dbSample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import javax.xml.crypto.dsig.keyinfo.KeyInfo;

import dbSample.dao.CountryDAO;
import dbSample.entity.Country;

public class DbConnectSample06 {
    public static void main(String[] args) {
        //Countryクラスにアクセスするために、CountryDAOをインスタンス化
        CountryDAO dao = new CountryDAO();
        
        //検索用キーワードを入力
        System.out.print("検索キーワードを入力してください＞");
        String name = KeyIn();
        
        //入力された値を引数に指定し、検索処理を実行し、Listオブジェクトを取得
        List<Country> list = dao.getCountryFromName(name);
        
        //取得したListオブジェクトを順番に取り出し、出力
        for(Country item: list) {
            System.out.println(item.getName());
            System.out.print(item.getPopulation());
        }
    }
    
    private static String KeyIn() {
        String line = null;
        try {
            BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
            line = key.readLine();
        }catch (IOException e) {
    
        }
        return line;
    }
    
    

}
