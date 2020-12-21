package br.com.iftm;

public interface Hash {
    /**
     * Converte uma string em uma hash com o algoritmo sha256.
     * @param input string que deverá ser criptografada
     * @return hash criptografada
     */
    public String generate(String input);

    /**
     * Faz a comparação de uma string que não foi criptografada com uma hash (senha) 
     * que já foi criptografada. Esse método chama o método generate para criptografar
     * a string input, em seguida verifica se as duas hashes são iguais.
     * @param input string que deverá ser criptografada
     * @param hashString  hash criptografada da senha que será comaparada
     * @return boolean que indica se as duas hashes são iguais
     */
    public boolean compare(String input, String hashString);
}
