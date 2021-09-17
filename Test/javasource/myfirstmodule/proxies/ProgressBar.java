// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class ProgressBar
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject progressBarMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.ProgressBar";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Value("Value"),
		Color("Color");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public ProgressBar(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MyFirstModule.ProgressBar"));
	}

	protected ProgressBar(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject progressBarMendixObject)
	{
		if (progressBarMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MyFirstModule.ProgressBar", progressBarMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MyFirstModule.ProgressBar");

		this.progressBarMendixObject = progressBarMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ProgressBar.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static myfirstmodule.proxies.ProgressBar initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.ProgressBar.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.ProgressBar initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.ProgressBar(context, mendixObject);
	}

	public static myfirstmodule.proxies.ProgressBar load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.ProgressBar.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.ProgressBar> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<myfirstmodule.proxies.ProgressBar> result = new java.util.ArrayList<myfirstmodule.proxies.ProgressBar>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MyFirstModule.ProgressBar" + xpathConstraint))
			result.add(myfirstmodule.proxies.ProgressBar.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Value
	 */
	public final java.math.BigDecimal getValue()
	{
		return getValue(getContext());
	}

	/**
	 * @param context
	 * @return value of Value
	 */
	public final java.math.BigDecimal getValue(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.Value.toString());
	}

	/**
	 * Set value of Value
	 * @param value
	 */
	public final void setValue(java.math.BigDecimal value)
	{
		setValue(getContext(), value);
	}

	/**
	 * Set value of Value
	 * @param context
	 * @param value
	 */
	public final void setValue(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal value)
	{
		getMendixObject().setValue(context, MemberNames.Value.toString(), value);
	}

	/**
	 * @return value of Color
	 */
	public final java.lang.String getColor()
	{
		return getColor(getContext());
	}

	/**
	 * @param context
	 * @return value of Color
	 */
	public final java.lang.String getColor(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Color.toString());
	}

	/**
	 * Set value of Color
	 * @param color
	 */
	public final void setColor(java.lang.String color)
	{
		setColor(getContext(), color);
	}

	/**
	 * Set value of Color
	 * @param context
	 * @param color
	 */
	public final void setColor(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String color)
	{
		getMendixObject().setValue(context, MemberNames.Color.toString(), color);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return progressBarMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final myfirstmodule.proxies.ProgressBar that = (myfirstmodule.proxies.ProgressBar) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "MyFirstModule.ProgressBar";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
