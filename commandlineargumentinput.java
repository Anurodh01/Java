public class commandlineargumentinput {
    public static void main(String args[])
    {
        if(args.length>0)
        {
            System.out.println("Here is the some input given from command line argemnt");
            for(String str:args)
            {
                System.out.print(str+" ");
            }
        }
        else{
            System.out.print("no argument has provided from the command line argument");
        }
    }
    
}
