package Day191105;

public class app {

    public int calc(String str)
    {
        int depth=0;
        int max_depth=0;
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            switch (c)
            {
                case'(':depth++; break;
                case')':depth--; break;
                default:throw new IllegalArgumentException("Wrong char");
            }
            if(depth<0) throw new IllegalArgumentException("Extra ')' required");
        max_depth=Math.max(max_depth,depth);
        }
        if(depth>0) throw new IllegalArgumentException("Extra '(' required");
        return max_depth;
    }
}
