public class Main {
    public static void main(String[] args) {
        Video v[]=new Video [2];
        v[0]=new Video("aula 1");
        //System.out.println(v[0].toString());
        v[1]=new Video("aula 2");
        //System.out.println(v[1].toString());

        Gafanhoto g[]=new Gafanhoto[2];
        g[0]=new Gafanhoto("alex", 30, "M", "Alx");
        //System.out.println(g[0].toString());
        g[1]=new Gafanhoto("sara", 60, "F", "5Ara");
        //System.out.println(g[1].toString());

        Visualizacao vis[]=new Visualizacao[2];
        vis[0]=new Visualizacao(v[0],g[0]);
        vis[0].like();
        System.out.println(vis[0].toString());
        
        vis[1]=new Visualizacao(v[1], g[0]);
        System.out.println(vis[1].toString());

    }
}
