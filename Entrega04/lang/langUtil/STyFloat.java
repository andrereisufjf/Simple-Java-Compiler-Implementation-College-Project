 /*
  *  DCC045 - Teoria dos Compiladores - 2023.1
  *  André Luiz dos Reis - 201965004C
  *  Lucca Oliveira Schröder - 201765205C
  */
  
package lang.langUtil;

public class STyFloat extends SType
{
    private static STyFloat st = new STyFloat();

    private STyFloat(){}

    public static STyFloat newSTyFloat() { return st; }

    @Override
    public boolean match(SType v)
    {
        return (v instanceof STyFloat);
    }

    public String toString()
    {
        return "Float";
    }
}