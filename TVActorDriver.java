public class TVActorDriver {
    public static void main( String[] args ) {
        TVActor a = new TVActor();
        a.name = "Thomas Middeditch";
        a.role = "Rochard Hendricks";
        a.episodes = 24;

        TVActor b = new TVActor();
        b.name = "Martin Starr";
        b.role = "Bertram Gilfoyle";
        b.episodes = 23;

        TVActor c = new TVActor();
        c.name = "Kumail Nanjiani";
        c.role = "Dinesh Chugtai";
        c.episodes = 22;

        System.out.println( a.name + " played " + a.role );
        System.out.println( b.name + " played " + b.role );
        System.out.println( c.name + " played " + c.role );
    }
}