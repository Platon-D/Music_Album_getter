public class Main {
    public static void main(String[] args) {
        Album album = new Album("Track 1 - On Sight","Track 2 - Black Skinhead",
                "Track 3 - I Am a God","Track 4 - New Slaves","Track 5 - Hold My Liquor",
                "Track 6 - I'm in It",
                "Track 7 - Blood on the Leaves","Track 8 - Guilt Trip","Track 9 - Send It Up",
                "Track 10 - Bound 2");

        System.out.println(album.getTrack1());
        System.out.println(album.getTrack2());
        System.out.println(album.getTrack3());
        System.out.println(album.getTrack4());
        System.out.println(album.getTrack5());
        System.out.println(album.getTrack6());
        System.out.println(album.getTrack7());
        System.out.println(album.getTrack8());
        System.out.println(album.getTrack9());
        System.out.println(album.getTrack10());



        System.out.println("Listen chosen album now");

    }




}