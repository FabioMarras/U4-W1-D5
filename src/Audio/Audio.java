package Audio;

public class Audio {
    public void sceltaBrano(String scelta) {
        switch (scelta) {
            case "BRANO1", "Brano1", "brano1":
                System.out.println("Hai scelto: " + TrackList.BRANO1.getNome() + " durata: " +  TrackList.BRANO1.getDurata() + " il volume è: " + TrackList.BRANO1.getVolume());
               /* alzaVolume(TrackList.BRANO1);
                System.out.println("Hai scelto: " + TrackList.BRANO1.getNome() + " durata: " +  TrackList.BRANO1.getDurata() + " il volume è: " + TrackList.BRANO1.getVolume());
                alzaVolume(TrackList.BRANO1);
                System.out.println("Hai scelto: " + TrackList.BRANO1.getNome() + " durata: " +  TrackList.BRANO1.getDurata() + " il volume è: " + TrackList.BRANO1.getVolume());
                alzaVolume(TrackList.BRANO1);
                System.out.println("Hai scelto: " + TrackList.BRANO1.getNome() + " durata: " +  TrackList.BRANO1.getDurata() + " il volume è: " + TrackList.BRANO1.getVolume());
                abbassaVolume(TrackList.BRANO1);
                System.out.println("Hai scelto: " + TrackList.BRANO1.getNome() + " durata: " +  TrackList.BRANO1.getDurata() + " il volume è: " + TrackList.BRANO1.getVolume());
                abbassaVolume(TrackList.BRANO1);
                System.out.println("Hai scelto: " + TrackList.BRANO1.getNome() + " durata: " +  TrackList.BRANO1.getDurata() + " il volume è: " + TrackList.BRANO1.getVolume());*/
                break;
            case "BRANO2", "Brano2", "brano2":
                System.out.println("Hai scelto: " + TrackList.BRANO2.getNome() + " durata: " +  TrackList.BRANO2.getDurata() + " il volume è: " + TrackList.BRANO2.getVolume());
                break;
            case "BRANO3", "Brano3", "brano3":
                System.out.println("Hai scelto: " + TrackList.BRANO3.getNome() + " durata: " +  TrackList.BRANO3.getDurata() + " il volume è: " + TrackList.BRANO3.getVolume());
                break;
            case "BRANO4", "Brano4", "brano4":
                System.out.println("Hai scelto: " + TrackList.BRANO4.getNome() + " durata: " +  TrackList.BRANO4.getDurata() + " il volume è: " + TrackList.BRANO4.getVolume());
                break;
            case "BRANO5", "Brano5", "brano5":
                System.out.println("Hai scelto: " + TrackList.BRANO5.getNome() + " durata: " +  TrackList.BRANO5.getDurata() + " il volume è: " + TrackList.BRANO5.getVolume());
                break;
            default:
                System.out.println("Non abbiamo questo brano :(");
                break;
        }
    }
//public void StampaBrano() {
//  if (TrackList.BRANO1.getVolume().length() > 0 && < 2) {
//      System.out.println(TrackList.BRANO1.getNome());
//  } if else {
//      (TrackList.BRANO1.getVolume().length() > 1 && < 3) {
//            System.out.println(TrackList.BRANO1.getNome() * 2);
//    }
//}
    public void alzaVolume(TrackList brano) {
        String volumeAttuale = brano.getVolume();

        if (volumeAttuale.length() == 1) {
            TrackList.BRANO1.setVolume("!!");
        } else if (volumeAttuale.length() == 2) {
                TrackList.BRANO1.setVolume("!!!");;
            } else if (volumeAttuale.length() == 3) {
            TrackList.BRANO1.setVolume("!!!!");;
        } else if (volumeAttuale.length() == 4) {
            TrackList.BRANO1.setVolume("!!!!!");;
        } else {
            System.out.println("Volume già al massimo!");
        }
        }
    public void abbassaVolume(TrackList brano) {
        String volumeAttuale = brano.getVolume();
        if (volumeAttuale.length() == 5) {
            TrackList.BRANO1.setVolume("!!!!");
        } else if (volumeAttuale.length() == 4) {
            TrackList.BRANO1.setVolume("!!!");;
        } else if (volumeAttuale.length() == 3) {
            TrackList.BRANO1.setVolume("!!");;
        } else if (volumeAttuale.length() == 2) {
            TrackList.BRANO1.setVolume("!");;
        } else {
            System.out.println("Volume già al minimo!");
        }
    }
    
}
