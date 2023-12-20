class Table
{
    synchronized void printTable(int n)
      {
            for(int i=1;i<=6;i++)
            {
                System.out.printf("%d x %d = %d\n",n,i,n*i);
                try
                {
                    Thread.sleep(400);
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }

    }
}


class first extends Thread
{
    Table t;
    first(Table tb)
    {
        t=tb;
    }
    public void run()
    {
        t.printTable(5);
    }
}

class second extends Thread
{
    Table t;
    second(Table tb)
    {
        t=tb;
    }
    public void run()
    {
        t.printTable(10);
    }
}


class Threadsynchronization
{
   public static void main(String args[])
    {
        Table tb = new Table();
        first t1 = new first(tb);
        second t2 = new second(tb);
        t1.start();
        t2.start();
    }
}
