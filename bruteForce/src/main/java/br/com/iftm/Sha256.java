package br.com.iftm;

import java.nio.charset.StandardCharsets;

import com.google.common.hash.Hashing;

public class Sha256 implements Hash {

    @Override
    public boolean compare(String input, String hashString) {
        String hash = generate(input);
        if (hash.equals(hashString)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String generate(String input) {
        String sha256hex = Hashing.sha256()
        .hashString(input, StandardCharsets.UTF_8)
        .toString();
        return sha256hex;
    }

    public Sha256() { 
        // Constructor empty
    }
    
}
