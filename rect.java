import java.util.Scanner;

public class okay {
	static class Rect{
		int lx,ly;
		int rx,ry;
		Rect(int lx,int ly,int rx,int ry){
			this.lx=lx;
			this.rx=rx;
			this.ly=ly;
			this.ry=ry;
		}
	}
	public static Rect inx(Rect t,Rect obj){
		if(t==null || obj==null){
			return null;
		}
		int ax = Math.max(t.lx, obj.lx);
		int ay = Math.max(t.ly, obj.ly);
		int bx = Math.min(t.rx, obj.rx);
		int by = Math.min(t.ry, obj.ry);
		if(ax>bx || ay>by){
			return null;
		}else{
			return new Rect(ax,ay,bx,by);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Rect[] rect = new Rect[n];
		Rect[] pref = new Rect[n];
		Rect[] suf = new Rect[n];
		for(int i=0;i<n;i++){
			rect[i]=new Rect(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
		}
		pref[0]=rect[0];
		suf[0]=rect[n-1];
		for(int i=1;i<n;i++){
			pref[i] = inx(pref[i-1],rect[i]);
		}
		for(int i=n-2;i>=0;i--){
			suf[n-i-1] = inx(suf[n-i-2],rect[i]);
		}
//		toPRint(pref);
//		toPRint(suf);
		if(suf[n-2]!=null){
			System.out.println(suf[n-2].lx+" "+suf[n-2].ly);
			return;
		}
		if(pref[n-2]!=null){
			System.out.println(pref[n-2].lx+" "+pref[n-2].ly);
			return;
		}
//		toPRint(rect);
//		toPRint(pref);
//		toPRint(suf);
		
		for(int i=1;i<n-1;i++){
			Rect temp = inx(pref[i-1],suf[n-i-2]); 
			if(temp!=null){
				System.out.println(temp.lx+" "+temp.ly);
				return;
			}
		}
		System.out.println("HII");
	}
	public static void toPRint(Rect[] pr){
		for(int i=0;i<pr.length;i++){
			if(pr[i]==null){
				System.out.print("[null]"+" ");
			}else{
				System.out.print(",["+pr[i].lx+" "+pr[i].ly+" "+pr[i].rx+" "+pr[i].ry+"],");
			}
		}
		System.out.println("%%%%%%%%%55");
	}

}



