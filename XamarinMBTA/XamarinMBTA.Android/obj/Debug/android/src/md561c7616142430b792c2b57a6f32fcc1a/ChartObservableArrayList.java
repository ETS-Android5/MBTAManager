package md561c7616142430b792c2b57a6f32fcc1a;


public class ChartObservableArrayList
	extends md561c7616142430b792c2b57a6f32fcc1a.ObservableArrayList
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Com.Syncfusion.Charts.ChartObservableArrayList, Syncfusion.SfChart.XForms.Android", ChartObservableArrayList.class, __md_methods);
	}


	public ChartObservableArrayList ()
	{
		super ();
		if (getClass () == ChartObservableArrayList.class)
			mono.android.TypeManager.Activate ("Com.Syncfusion.Charts.ChartObservableArrayList, Syncfusion.SfChart.XForms.Android", "", this, new java.lang.Object[] {  });
	}


	public ChartObservableArrayList (int p0)
	{
		super (p0);
		if (getClass () == ChartObservableArrayList.class)
			mono.android.TypeManager.Activate ("Com.Syncfusion.Charts.ChartObservableArrayList, Syncfusion.SfChart.XForms.Android", "System.Int32, mscorlib", this, new java.lang.Object[] { p0 });
	}


	public ChartObservableArrayList (java.util.Collection p0)
	{
		super (p0);
		if (getClass () == ChartObservableArrayList.class)
			mono.android.TypeManager.Activate ("Com.Syncfusion.Charts.ChartObservableArrayList, Syncfusion.SfChart.XForms.Android", "System.Collections.ICollection, mscorlib", this, new java.lang.Object[] { p0 });
	}

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
