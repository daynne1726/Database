/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package harvestword;

/**
 *
 * @author caballeroda_sd2081
 */
public class removeTags {
    public String removeHTML(String str) {
        str = str.replaceAll("\\<[^>]*>","");
        return str;

        
    }

    @Override
    public String toString() {
        return "removeTags{" + '}';
    }
}
