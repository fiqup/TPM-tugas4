package com.example.tugas4.utils;

import com.example.tugas4.R;
import com.example.tugas4.model.AplikasiModel;

import java.util.ArrayList;

public class DataDummy {
    private static String[] nama = new String[] {
            "Pinterest",
            "Quora",
            "Medium",
            "Linkedin",
            "Netflix",
            "Spotify",
            "YouTube",
            "Line",
            "Shopee",
            "Lightroom"
    };

    private  static  String[] deskripsi = new String[]{
            "Pinterest is an American image sharing and social media service designed to enable saving and discovery of information on the internet using images and, on a smaller scale, animated GIFs and videos, in the form of pinboards.",
            "Quora is an American question-and-answer website where questions are asked, answered, followed, and edited by Internet users, either factually or in the form of opinions. Its owner, Quora Inc., is based in Mountain View, California, United States. ",
            "Medium is an American online publishing platform developed by Evan Williams and launched in August 2012. It is owned by A Medium Corporation. ",
            "LinkedIn is an American business and employment-oriented online service that operates via websites and mobile apps. Launched on May 5, 2003, the platform is mainly used for professional networking, and allows job seekers to post their CVs and employers to post jobs.",
            "Netflix, Inc. is an American over-the-top content platform and production company headquartered in Los Gatos, California. Netflix was founded in 1997 by Reed Hastings and Marc Randolph in Scotts Valley, California. ",
            "Spotify Technology S.A is a Luxembourg-based holding company who owns Spotify AB, a Swedish audio streaming and media services provider, founded in 2006 by Daniel Ek. Spotify is headquartered in Stockholm, Sweden, with offices in 17 different countries around the world.",
            "YouTube is an online video platform owned by Google. It is the second most-visited website in the world. In 2019, more than 500 hours of video content were uploaded to YouTube servers every minute.",
            "LINE is a freeware app for instant communications on electronic devices such as smartphones, tablet computers, and personal computers. LINE users exchange texts, images, video and audio, and conduct free VoIP conversations and video conferences. ",
            "Shopee Pte Ltd is a Singaporean multinational technology company which focuses mainly on e-commerce. Headquartered under Sea Group, Shopee was first launched in Singapore in 2015, and later expanded its reach to Malaysia, Thailand, Taiwan, Indonesia, Vietnam, the Philippines, Brazil, and Mexico. ",
            "Adobe Lightroom is a creative image organization and image manipulation software developed by Adobe Inc. as part of the Creative Cloud subscription family. It is supported on Windows, macOS, iOS, Android, and tvOS."

    };
    private static int[] logo = new int[] {
            R.drawable.pinterest,
            R.drawable.quora,
            R.drawable.medium,
            R.drawable.linkedin,
            R.drawable.netflix,
            R.drawable.spotify,
            R.drawable.youtube,
            R.drawable.line,
            R.drawable.shopee,
            R.drawable.lightroom};

    public static ArrayList<AplikasiModel> getListData(){
        AplikasiModel menuModel = null;
        ArrayList<AplikasiModel> list= new ArrayList<>();
        for (int i=0; i < nama.length ; i++){
            menuModel = new AplikasiModel(){};
            menuModel.setNama(nama[i]);
            menuModel.setLogo(logo[i]);
            menuModel.setDeskripsi(deskripsi[i]);
            list.add(menuModel);
        }
        return list;
    }
}
