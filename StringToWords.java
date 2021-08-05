public class StringToWords
{
    public static void main(String rags[])
    {
        String st="the green bottle contain green water and it is kept on green table";
        String word="", newst="";
        char ch;
        int i,l;
        st=st+" ";
        l=st.length();
        for(i=0;i<l;i++)
        {
            ch=st.charAt(i);
            if(ch!=' ')
            {
                word=word+ch;
            }
            else
            {
                //if(word.equals("green"))
                if(word.compareTo("green")==0)
                  word="red";
                 newst=newst + word + " ";
                
                word="";
            }
        }
        System.out.println(st);
        System.out.println(newst);
                
    }
}
