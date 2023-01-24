package be.vdab.rekening;

public class Rekening {
    private boolean checkIBANnummer(String reknr) {
//formaat van de string reknr: xxxx xxxx xxxx xxxx
        if (reknr == null || reknr.isEmpty() ||
        reknr.length() != 19 ||
                !reknr.substring(0, 2).equals("BE")) {
            return false;
        }
        try {
            Integer.parseInt(reknr.substring(2, 4));
            var d1 = Integer.parseInt(reknr.substring(5, 9));
            var d2 = Integer.parseInt(reknr.substring(10, 14));
            var d3 = Integer.parseInt(reknr.substring(15, 17));
            var d4 = Integer.parseInt(reknr.substring(17, 19));
            var tienCijfers = d1 * 1000000 + d2 * 100 + d3;
            var rest = (int) (tienCijfers % 97);
            return (rest == d4);
        } catch (NumberFormatException ex) {
            return false;
        }
    }

}
