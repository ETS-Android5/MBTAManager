package md5193b86d17702d224a499fe6d922d7b53;


public class SfChartRenderer
	extends md51558244f76c53b6aeda52c8a337f2c37.ViewRenderer_2
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Syncfusion.SfChart.XForms.Droid.SfChartRenderer, Syncfusion.SfChart.XForms.Android", SfChartRenderer.class, __md_methods);
	}


	public SfChartRenderer (android.content.Context p0)
	{
		super (p0);
		if (getClass () == SfChartRenderer.class)
			mono.android.TypeManager.Activate ("Syncfusion.SfChart.XForms.Droid.SfChartRenderer, Syncfusion.SfChart.XForms.Android", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public SfChartRenderer (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == SfChartRenderer.class)
			mono.android.TypeManager.Activate ("Syncfusion.SfChart.XForms.Droid.SfChartRenderer, Syncfusion.SfChart.XForms.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public SfChartRenderer (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == SfChartRenderer.class)
			mono.android.TypeManager.Activate ("Syncfusion.SfChart.XForms.Droid.SfChartRenderer, Syncfusion.SfChart.XForms.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
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
