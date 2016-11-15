package bungee;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Currency;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.Stack;
import java.util.Timer;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import com.anylogic.engine.connectivity.ResultSet;
import com.anylogic.engine.connectivity.Statement;
import com.anylogic.engine.elements.IElementDescriptor;
import com.anylogic.engine.markup.Network;
import com.anylogic.engine.Position;
import com.anylogic.engine.markup.PedFlowStatistics;
import com.anylogic.engine.markup.DensityMap;


import static java.lang.Math.*;
import static com.anylogic.engine.UtilitiesArray.*;
import static com.anylogic.engine.UtilitiesCollection.*;
import static com.anylogic.engine.presentation.UtilitiesColor.*;
import static com.anylogic.engine.presentation.UtilitiesDrawing.*;
import static com.anylogic.engine.HyperArray.*;

import com.anylogic.engine.*;
import com.anylogic.engine.analysis.*;
import com.anylogic.engine.connectivity.*;
import com.anylogic.engine.database.*;
import com.anylogic.engine.gis.*;
import com.anylogic.engine.markup.*;
import com.anylogic.engine.presentation.*;

import java.awt.geom.Arc2D;

 

public class Main extends Agent
{
  // Parameters

 
  public 
double  m;

  /**
   * Returns default value for parameter <code>m</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _m_DefaultValue_xjal() {
    final Main self = this;
    return 
60 
;
  }

  public void set_m( double m ) {
    if (m == this.m) {
      return;
    }
    double _oldValue_xjal = this.m;
    this.m = m;
    onChange_m_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter m.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_m()</code> method instead.
   */
  protected void onChange_m() {
    onChange_m_xjal( m );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_m_xjal( double oldValue ) {

 
;  
  }


 
  public 
double  k;

  /**
   * Returns default value for parameter <code>k</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _k_DefaultValue_xjal() {
    final Main self = this;
    return 
50
 
;
  }

  public void set_k( double k ) {
    if (k == this.k) {
      return;
    }
    double _oldValue_xjal = this.k;
    this.k = k;
    onChange_k_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter k.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_k()</code> method instead.
   */
  protected void onChange_k() {
    onChange_k_xjal( k );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_k_xjal( double oldValue ) {

 
;  
  }


 
  public 
double  D;

  /**
   * Returns default value for parameter <code>D</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _D_DefaultValue_xjal() {
    final Main self = this;
    return 
10
 
;
  }

  public void set_D( double D ) {
    if (D == this.D) {
      return;
    }
    double _oldValue_xjal = this.D;
    this.D = D;
    onChange_D_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter D.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_D()</code> method instead.
   */
  protected void onChange_D() {
    onChange_D_xjal( D );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_D_xjal( double oldValue ) {

 
;  
  }


 
  public 
double  ropeLength;

  /**
   * Returns default value for parameter <code>ropeLength</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _ropeLength_DefaultValue_xjal() {
    final Main self = this;
    return 
20 
;
  }

  public void set_ropeLength( double ropeLength ) {
    if (ropeLength == this.ropeLength) {
      return;
    }
    double _oldValue_xjal = this.ropeLength;
    this.ropeLength = ropeLength;
    onChange_ropeLength_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter ropeLength.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_ropeLength()</code> method instead.
   */
  protected void onChange_ropeLength() {
    onChange_ropeLength_xjal( ropeLength );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_ropeLength_xjal( double oldValue ) {

 
;  
  }


 
  public 
double  g;

  /**
   * Returns default value for parameter <code>g</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _g_DefaultValue_xjal() {
    final Main self = this;
    return 
9.81 
;
  }

  public void set_g( double g ) {
    if (g == this.g) {
      return;
    }
    double _oldValue_xjal = this.g;
    this.g = g;
    onChange_g_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter g.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_g()</code> method instead.
   */
  protected void onChange_g() {
    onChange_g_xjal( g );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_g_xjal( double oldValue ) {

 
;  
  }


  @Override
  public void setParametersToDefaultValues() {
    super.setParametersToDefaultValues();
    m = _m_DefaultValue_xjal();
    k = _k_DefaultValue_xjal();
    D = _D_DefaultValue_xjal();
    ropeLength = _ropeLength_DefaultValue_xjal();
    g = _g_DefaultValue_xjal();
  }

  @Override
  public boolean setParameter(String _name_xjal, Object _value_xjal, boolean _callOnChange_xjal) {
    switch ( _name_xjal ) {
    case "m":
      if ( _callOnChange_xjal ) {
        set_m( ((Number) _value_xjal).doubleValue() );
      } else {
        m = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "k":
      if ( _callOnChange_xjal ) {
        set_k( ((Number) _value_xjal).doubleValue() );
      } else {
        k = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "D":
      if ( _callOnChange_xjal ) {
        set_D( ((Number) _value_xjal).doubleValue() );
      } else {
        D = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "ropeLength":
      if ( _callOnChange_xjal ) {
        set_ropeLength( ((Number) _value_xjal).doubleValue() );
      } else {
        ropeLength = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "g":
      if ( _callOnChange_xjal ) {
        set_g( ((Number) _value_xjal).doubleValue() );
      } else {
        g = ((Number) _value_xjal).doubleValue();
      }
      return true;
    default:
      return super.setParameter( _name_xjal, _value_xjal, _callOnChange_xjal );
    }
  }

  @Override
  public <T> T getParameter(String _name_xjal) {
    Object _result_xjal;
    switch ( _name_xjal ) {
    case "m": _result_xjal = m; break;
    case "k": _result_xjal = k; break;
    case "D": _result_xjal = D; break;
    case "ropeLength": _result_xjal = ropeLength; break;
    case "g": _result_xjal = g; break;
    default: _result_xjal = super.getParameter( _name_xjal ); break;
    }
    return (T) _result_xjal;
  }

  @AnyLogicInternalCodegenAPI
  private static String[] _parameterNames_xjal;

  @Override
  public String[] getParameterNames() {
    String[] result = _parameterNames_xjal;
    if (result == null) {
      List<String> list = new ArrayList<>( Arrays.asList( super.getParameterNames() ) );
      list.add( "m" );
      list.add( "k" );
      list.add( "D" );
      list.add( "ropeLength" );
      list.add( "g" );
      result = list.toArray( new String[ list.size() ] );
      _parameterNames_xjal = result;
    }
    return result;
  }
  @AnyLogicInternalCodegenAPI
  private static Map<String, IElementDescriptor> elementDesciptors_xjal = null;
  
  @AnyLogicInternalCodegenAPI
  @Override
  public Map<String, IElementDescriptor> getElementDesciptors() {
    if (elementDesciptors_xjal == null) {
      elementDesciptors_xjal = createElementDescriptors(super.getElementDesciptors(), Main.class);
    }
    return elementDesciptors_xjal;
  }
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final Scale scale = new Scale( 10.0 );

  @Override
  public Scale getScale() {
    return scale;
  }
  // Events
	
  @AnyLogicInternalCodegenAPI
  public EventTimeout _plot_autoUpdateEvent_xjal = new EventTimeout(this);

  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOf( EventTimeout _e ) {
     if( _e == _plot_autoUpdateEvent_xjal ) return "plot auto update event";
    return super.getNameOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public EventTimeout.Mode getModeOf( EventTimeout _e ) {
    if ( _e == _plot_autoUpdateEvent_xjal ) return EVENT_TIMEOUT_MODE_CYCLIC;
    return super.getModeOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public double getFirstOccurrenceTime( EventTimeout _e ) {
    double _t;
    if ( _e == _plot_autoUpdateEvent_xjal ) {
      _t = 
0 
;
      _t = toModelTime( _t, SECOND );
      return _t;
    }
    return super.getFirstOccurrenceTime( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public double evaluateTimeoutOf( EventTimeout _e ) {
    double _t;
    if( _e == _plot_autoUpdateEvent_xjal) {
      _t = 
0.01 
;
      _t = toModelTime( _t, SECOND );
      return _t;
    }
    return super.evaluateTimeoutOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void executeActionOf( EventTimeout _e ) {
    if ( _e == _plot_autoUpdateEvent_xjal ) {
      plot.updateData();
      return;
    }
    super.executeActionOf( _e );
  }

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final short _STATECHART_ELEMENT_NEXT_ID_xjal = 0;
  // Stub function for code completion support (internal)
  public double F;
  public double Fspring;
  public double Fdamping;
  public double y;
  public double v;
  @AnyLogicInternalCodegenAPI
  private void _stubForCodeCompletion_xjal(){
    y = 
0 
;
y = 
v 
;
    v = 
0 
;
v = 
g + F/m 
;
    F = 
0 
;
    F = 
(y > ropeLength) ? (Fspring + Fdamping) : 0 
;
    Fspring = 
0 
;
    Fspring = 
- k * (y -  ropeLength) 
;
    Fdamping = 
0 
;
    Fdamping = 
- max(D*v, 0) 
;
    {double _t = 
0 
;}
    {double _t = 
1 
;}
    class _Stub_Implements_xjal implements 
  {}
    class _Stub_Extends_xjal extends 
  {}
  }

  /**
   * Auto-created data set(s) for F
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_F = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Main.this.F );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for Fspring
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_Fspring = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Main.this.Fspring );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for Fdamping
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_Fdamping = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Main.this.Fdamping );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for y
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_y = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Main.this.y );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for v
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_v = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Main.this.v );
      _lastUpdateTime = time();
    }
  } );
  @AnyLogicInternalCodegenAPI
  public DataSet _plot_expression0_dataSet_xjal = new DataSet( 10000, new DataUpdater_xjal() {
    double _lastUpdateX = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateX ) { return; }
      _d.add( time(), __plot_expression0_dataSet_xjal_YValue() );
      _lastUpdateX = time();
    }
  } );
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private double __plot_expression0_dataSet_xjal_YValue() {
    return 
y 
;
  }

  // View areas
  public ViewArea _origin_VA = new ViewArea( this, "[Origin]", 0, 0, ViewArea.TOP_LEFT, ViewArea.SPECIFIED_ZOOM, 1, 100, 100 );
  @Override
  @AnyLogicInternalCodegenAPI
  public int getViewAreas(Map<String, ViewArea> _output) {
    if ( _output != null ) {
      _output.put( "_origin_VA", this._origin_VA );
    }
    return 1 + super.getViewAreas( _output );
  }
  @AnyLogicInternalCodegenAPI
  protected static final int _rope = 1;
  @AnyLogicInternalCodegenAPI
  protected static final int _shapeBody = 2;
  @AnyLogicInternalCodegenAPI
  protected static final int _person = 3;
  @AnyLogicInternalCodegenAPI
  protected static final int _plot = 4;

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _SHAPE_NEXT_ID_xjal = 5;
 

  /**
   * Top-level presentation group id
   */	 
  @AnyLogicInternalCodegenAPI
  protected static final int _presentation = 0;

  @AnyLogicInternalCodegenAPI
  public boolean isPublicPresentationDefined() {
    return true;
  }

  @AnyLogicInternalCodegenAPI
  public boolean isEmbeddedAgentPresentationVisible( Agent _a ) {
    return super.isEmbeddedAgentPresentationVisible( _a );
  }
  /**
   * Top-level icon group id
   */	 
  @AnyLogicInternalCodegenAPI
  protected static final int _icon = -1;
  
  @AnyLogicInternalCodegenAPI
  protected static final double[] _shapeBody_pointsDX_xjal() {
    return new double[] { 0.0, 0.0, 3.0, -1.0, -2.0, -2.0, -2.0, 0.0, -1.0, 0.0, 1.0, 3.0, 4.0, 5.0, 4.0, 6.0, 6.0, 6.0, 5.0, 1.0, 4.0, 4.0, 4.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _shapeBody_pointsDY_xjal() {
    return new double[] { 0.0, 4.0, 2.0, 3.0, 3.0, 10.0, 11.0, 11.0, 9.0, 17.0, 17.0, 17.0, 17.0, 9.0, 11.0, 11.0, 10.0, 3.0, 3.0, 2.0, 4.0, 0.0, -3.0, -3.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _shapeBody_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,  };
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public boolean onShapeClick( int _shape, int index, double clickx, double clicky ){
    switch( _shape ){
      case _rope:
        if (true) {
          ShapeLine self = this.rope;
          
 
        }
        break;
      case _shapeBody:
        if (true) {
          ShapeCurve self = this.shapeBody;
          
 
        }
        break;
      case _person:
        if (true) {
          ShapeGroup self = this.person;
          
 
        }
        break;
      default: return super.onShapeClick( _shape, index, clickx, clicky );
 	}
 	return false;
  }
  
  @Override
  @AnyLogicInternalCodegenAPI
  public void onShapeGroupDraw( int _shape, int index, Panel panel, Graphics2D graphics ) {
    switch( _shape ) {
      case _person:
          
 
        break;
      default:
        super.onShapeGroupDraw( _shape, index, panel, graphics );
        break;
    }
  }
   
  @Override
  @AnyLogicInternalCodegenAPI
  public void onSelectionChanged_xjal( int _shape, int index, int[] selectedIndices, boolean programmatically ) {
    switch( _shape ) {
      case _plot: {
        TimePlot self = this.plot;
        
 
;}
        break;
      default:
        super.onSelectionChanged_xjal( _shape, index, selectedIndices, programmatically );
        break;
    }
  }

 
  @Override
  @AnyLogicInternalCodegenAPI
  public void onItemRemoved_xjal( int _shape, int index, int removedIndex, boolean programmatically ) {
    switch( _shape ) {
      case _plot: {
        TimePlot self = this.plot;
        
 
;}
        break;
      default:
        super.onItemRemoved_xjal( _shape, index, removedIndex, programmatically );
        break;
    }
  }
  
  // Stub function for code completion support (internal)
  @AnyLogicInternalCodegenAPI
  private void _stubForReplication_xjal() {
    {
      int _result_xjal = 
 
;
    }
    {
      int _result_xjal = 
 
;
    }
    {
      int _result_xjal = 
 
;
    }
    {
      int _result_xjal = 
 
;
    }
  }

  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _plot_SetDynamicParams_xjal( TimePlot shape ) {
    boolean _visible = 
 
;
    shape.setVisible( _visible );
 	if ( _visible ) {
    shape.setX(
 
);
    shape.setY(
 
);
    shape.setWidth(
 
);
    shape.setHeight(
 
);
 	}
  }
  
  protected TimePlot plot;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _rope_SetDynamicParams_xjal( ShapeLine shape ) {
    boolean _visible = 
 
;
    shape.setVisible( _visible );
 	if ( _visible ) {
    shape.setX(
 
);
    shape.setY(
 
);
    shape.setZ(
 
);
    shape.setDx(
 
);
    shape.setDy(
y * 3
 
);
    shape.setDz(
 
);
    shape.setZHeight(
 
);
    shape.setScaleX(
 
);
    shape.setScaleY(
 
);
    shape.setScaleZ(
 
);
    shape.setRotation(
 
);
    shape.setColor(
(y>ropeLength) ?  
);
    shape.setLineWidth(
 
);
    shape.setLineStyle(
 
);
 	}
  }
  
  protected ShapeLine rope;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _shapeBody_SetDynamicParams_xjal( ShapeCurve shape ) {
    boolean _visible = 
 
;
    shape.setVisible( _visible );
 	if ( _visible ) {
    shape.setX(
 
);
    shape.setY(
 
);
    shape.setZ(
 
);
    shape.setZHeight(
 
);
    shape.setScaleX(
 
);
    shape.setScaleY(
 
);
    shape.setScaleZ(
 
);
    shape.setRotation(
 
);
    shape.setLineColor(
 
);
    shape.setFillColor(
 
);
    shape.setLineWidth(
 
);
    shape.setLineStyle(
 
);
    shape.setNPoints(
 
);
    for (int indexPt = 0; indexPt < shape.getNPoints(); indexPt++) {
      shape.setPointDx( indexPt, 
 
);
     }
    for (int indexPt = 0; indexPt < shape.getNPoints(); indexPt++) {
      shape.setPointDy( indexPt, 
 
);
    }
    for (int indexPt = 0; indexPt < shape.getNPoints(); indexPt++) {
      shape.setPointDz( indexPt, 
 
);
    }
 	}
  }
  
  protected ShapeCurve shapeBody;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _person_SetDynamicParams_xjal( ShapeGroup shape ) {
    boolean _visible = 
 
;
    shape.setVisible( _visible );
 	if ( _visible ) {
    shape.setX(
 
);
    shape.setY(
 
);
    shape.setZ(
 
);
    shape.setScaleX(
 
);
    shape.setScaleY(
 
);
    shape.setScaleZ(
 
);
    shape.setRotationY(
 
);
    shape.setRotationX(
 
);
    shape.setRotationZ(
 
);
 	}
  }
  
  protected ShapeGroup person;
  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBP0_xjal() {
    rope = new ShapeLine(
		SHAPE_DRAW_2D3D, true, 550.0, 130.0, 0.0, black, 
 		0.0,	-130.0, 0.0, 1.0, 10.0, LINE_STYLE_SOLID ) {
      @Override
      public void updateDynamicProperties(boolean publicOnly) {
        _rope_SetDynamicParams_xjal( this );
        super.updateDynamicProperties(publicOnly);
      }
    };

    shapeBody = new ShapeCurve(
      true,-2.0, -7.0, 
      null, black,
      24, true, _shapeBody_pointsDX_xjal(), _shapeBody_pointsDY_xjal(),
 	true, 1.0, LINE_STYLE_SOLID    ) {
      @Override
      public void updateDynamicProperties(boolean publicOnly) {
        _shapeBody_SetDynamicParams_xjal( this );
        super.updateDynamicProperties(publicOnly);
      }
    };

  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsAP0_xjal() {
    {
    DataSet _item;
    List<DataSet> _items = new ArrayList<DataSet>( 1 );
    _items.add( _plot_expression0_dataSet_xjal ); 
    List<String> _titles = new ArrayList<String>( 1 );
    _titles.add( "y" );
    List<Chart2DPlot.Appearance> _appearances = new ArrayList<Chart2DPlot.Appearance>( 1 );
    _appearances.add( new Chart2DPlot.Appearance( chocolate, true, Chart.INTERPOLATION_LINEAR, 1.0, Chart.POINT_NONE ) );
    plot = new TimePlot(
		    Main.this, true, 50.0, 310.0, 
			640.0, 210.0,
            null, null,
            50.0, 30.0,
			560.0, 120.0, white, black, black,
            30.0, Chart.SOUTH,
            
100 
            , Chart.WINDOW_MOVES_WITH_TIME, null, Chart.SCALE_AUTO,
            0, 0, Chart.GRID_DEFAULT, Chart.GRID_DEFAULT,
            darkGray, darkGray, _items, _titles, _appearances ) {
      @Override
      public void updateDynamicProperties(boolean publicOnly) {
        _plot_SetDynamicParams_xjal( this );
        super.updateDynamicProperties(publicOnly);
      }
    };

    }
    {				
    person = new ShapeGroup( Main.this, SHAPE_DRAW_2D, true, 550.0, 140.0, 0.0, 0.0
	
	     ,shapeBody ) {
      @Override
      public void updateDynamicProperties(boolean publicOnly) {
        _person_SetDynamicParams_xjal( this );
        super.updateDynamicProperties(publicOnly);
      }

      @Override
      @AnyLogicInternalCodegenAPI
      public void onDraw( Panel panel, Graphics2D graphics ) {
        onShapeGroupDraw( _person, 0, panel, graphics );
      }
    };

    }
  }


  // Static initialization of persistent elements
  {
    _createPersistentElementsBP0_xjal();
  }
  protected ShapeTopLevelPresentationGroup presentation;
  protected ShapeGroup icon; 

  @Override
  @AnyLogicInternalCodegenAPI
  public Object getPersistentShape( int _shape ) {
    switch (_shape) {
      case _presentation: return presentation;
      case _icon: return icon;
      case _plot: return plot;
      case _rope: return rope;
      case _shapeBody: return shapeBody;
      case _person: return person;
      default: return super.getPersistentShape( _shape ); 
    }
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOfShape_xjal( Object _shape ) {
    try {
      if ( _shape == null ) return null;
      String _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, presentation, "presentation" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, icon, "icon" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, plot, "plot" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, rope, "rope" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, shapeBody, "shapeBody" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, person, "person" ); if (_name_xjal != null) return _name_xjal;
    } catch (Exception e) {
      return null;
    }
    return super.getNameOfShape_xjal( _shape );
  }

  @AnyLogicInternalCodegenAPI
  private void drawModelElements_Parameters_xjal(Panel _panel, Graphics2D _g, boolean _publicOnly, boolean _isSuperClass ) {
    if (!_publicOnly) {
      drawParameter( _panel, _g, 230, 20, 10, 0, "m", m, 0 );
    }
    if (!_publicOnly) {
      drawParameter( _panel, _g, 300, 30, 10, 0, "k", k, 0 );
    }
    if (!_publicOnly) {
      drawParameter( _panel, _g, 380, 20, 10, 0, "D", D, 0 );
    }
    if (!_publicOnly) {
      drawParameter( _panel, _g, 450, 20, 10, 0, "ropeLength", ropeLength, 0 );
    }
    if (!_publicOnly) {
      drawParameter( _panel, _g, 160, 20, 10, 0, "g", g, 0 );
    }
  }

  @AnyLogicInternalCodegenAPI
  private void drawModelElements_StockVariables_xjal(Panel _panel, Graphics2D _g, boolean _publicOnly, boolean _isSuperClass ) {
    if (!_publicOnly) {
      drawStock( _panel, _g, 60, 90, 20, 20, 0, -20, "y", y, null, 0 );
    }
    if (!_publicOnly) {
      drawStock( _panel, _g, 170, 90, 20, 20, 0, -20, "v", v, null, 0 );
    }
  }

  @AnyLogicInternalCodegenAPI
  private void drawModelElements_AuxVariables_xjal(Panel _panel, Graphics2D _g, boolean _publicOnly, boolean _isSuperClass ) {
    if (!_publicOnly) {
      drawAuxiliaryVariable( _panel, _g, 280, 220, 0, -20, "F", F, null, 0 );
    }
    if (!_publicOnly) {
      drawAuxiliaryVariable( _panel, _g, 290, 130, 0, -20, "Fspring", Fspring, null, 0 );
    }
    if (!_publicOnly) {
      drawAuxiliaryVariable( _panel, _g, 280, 290, 0, -20, "Fdamping", Fdamping, null, 0 );
    }
  }

  @AnyLogicInternalCodegenAPI
  private static void createLinkArcs_xjal() {
    _arc_PD_1478005719625_xjal = new Arc2D.Double(-232.27467370872336, 85.11063606707012, 701.2499999999999, 701.2499999999999, 97.59933471679688, -34.45933532714844, Arc2D.OPEN);
    _arc_PD_1478005719626_xjal = new Arc2D.Double(169.01364845867198, 1.5888638769996248, 146.24999999999991, 146.24999999999991, 30.639747619628906, -67.99419403076172, Arc2D.OPEN);
    _arc_PD_1478005719627_xjal = new Arc2D.Double(-3.448080917636389, -356.5494349344235, 491.24999999999415, 491.24999999999415, -34.309627532958984, -40.96396255493164, Arc2D.OPEN);
    _arc_PD_1478005747888_xjal = new Arc2D.Double(-387.1806413916507, 6.480609601480751, 671.2499999999998, 671.2499999999998, 46.03441619873047, -34.54235076904297, Arc2D.OPEN);
    _arc_PD_1478005747889_xjal = new Arc2D.Double(-674.6185900951227, -549.604093694871, 1056.249999999999, 1056.249999999999, -5.4810791015625, -29.033161163330078, Arc2D.OPEN);
    _arc_PD_1478005853433_xjal = new Arc2D.Double(260.0, 214.3750000000001, 81.2499999999998, 81.2499999999998, 226.77043914794922, -85.04766082763672, Arc2D.OPEN);
    _arc_PD_1478005853434_xjal = new Arc2D.Double(182.7522938579251, 109.19469717611076, 122.49999999999959, 122.49999999999959, 32.8978271484375, -72.8543930053711, Arc2D.OPEN);
    _arc_PD_1478005857597_xjal = new Arc2D.Double(29.374999999999957, -61.25000000000005, 171.25000000000009, 171.25000000000009, -59.637271881103516, -56.707271575927734, Arc2D.OPEN);
    _arc_PD_1478005861304_xjal = new Arc2D.Double(164.4799003478481, -146.86760929162284, 382.50000000000017, 382.50000000000017, 243.97679138183594, -44.67301940917969, Arc2D.OPEN);
    _arc_PD_1478005861305_xjal = new Arc2D.Double(104.13205984640423, -36.190370530293066, 126.24999999999855, 126.24999999999855, -1.8688430786132812, -69.20838165283203, Arc2D.OPEN);
    _arc_PD_1478005993671_xjal = new Arc2D.Double(-450.66286148266397, 79.63137311661387, 836.25, 836.25, 75.53034019470215, -31.8469295501709, Arc2D.OPEN);
    _arc_PD_1478006037332_xjal = new Arc2D.Double(102.71357439449154, 16.75520429887191, 82.49999999999991, 82.49999999999991, 54.59669494628906, -75.6343765258789, Arc2D.OPEN);
    _arc_PD_1478006057719_xjal = new Arc2D.Double(-396.1157378776821, -593.0420876694304, 881.2499999999951, 881.2499999999951, -24.205808639526367, -31.537229537963867, Arc2D.OPEN);
  }
  
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1478005719625_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1478005719626_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1478005719627_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1478005747888_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1478005747889_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1478005853433_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1478005853434_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1478005857597_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1478005861304_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1478005861305_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1478005993671_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1478006037332_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1478006057719_xjal;

  static {
    createLinkArcs_xjal();
  }

  @AnyLogicInternalCodegenAPI
  private void drawModelElements_Links_xjal(Panel _panel, Graphics2D _g, boolean _publicOnly, boolean _isSuperClass ) {
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1478005719625_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1478005719626_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1478005719627_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1478005747888_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1478005747889_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1478005853433_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1478005853434_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1478005857597_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1478005861304_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1478005861305_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1478005993671_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1478006037332_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1478006057719_xjal, null, 1, null, 0.95f, 0 );
    }
  }

  @AnyLogicInternalCodegenAPI
  private void drawModelElements_AgentLinks_xjal(Panel _panel, Graphics2D _g, boolean _publicOnly, boolean _isSuperClass ) {
    if (_publicOnly) { return; }
      drawLinkToAgent( _panel, _g, 50, -50, 15, 0, "connections", true, connections );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void drawModelElements( Panel _panel, Graphics2D _g, boolean _publicOnly, boolean _isSuperClass ) {
  	super.drawModelElements( _panel, _g, _publicOnly, true );
    drawModelElements_Parameters_xjal( _panel, _g, _publicOnly, _isSuperClass );
    drawModelElements_StockVariables_xjal( _panel, _g, _publicOnly, _isSuperClass );
    drawModelElements_AuxVariables_xjal( _panel, _g, _publicOnly, _isSuperClass );
    drawModelElements_Links_xjal( _panel, _g, _publicOnly, _isSuperClass );
    drawModelElements_AgentLinks_xjal( _panel, _g, _publicOnly, _isSuperClass );
  }

  @AnyLogicInternalCodegenAPI
  private boolean onClickModelAt_AgentLinks_xjal( Panel _panel, double _x, double _y, int _clickCount, boolean _publicOnly, boolean _isSuperClass ) {
    if ( modelElementContains(_x, _y, 50, -50) ) {
        _panel.addInspect_xjal( 50, -50, this, "connections", Panel.INSPECT_CONNECTIONS_xjal );
      return true;
    }
    return false;
  }


  @AnyLogicInternalCodegenAPI
  private boolean onClickModelAt_Parameters_xjal( Panel _panel, double _x, double _y, int _clickCount, boolean _publicOnly, boolean _isSuperClass ) {
    if( !_publicOnly && modelElementContains(_x, _y, 230, 20) ) {
      _panel.addInspect( 230, 20, this, "m" ); 
      return true;
    }
    if( !_publicOnly && modelElementContains(_x, _y, 300, 30) ) {
      _panel.addInspect( 300, 30, this, "k" ); 
      return true;
    }
    if( !_publicOnly && modelElementContains(_x, _y, 380, 20) ) {
      _panel.addInspect( 380, 20, this, "D" ); 
      return true;
    }
    if( !_publicOnly && modelElementContains(_x, _y, 450, 20) ) {
      _panel.addInspect( 450, 20, this, "ropeLength" ); 
      return true;
    }
    if( !_publicOnly && modelElementContains(_x, _y, 160, 20) ) {
      _panel.addInspect( 160, 20, this, "g" ); 
      return true;
    }
    return false;
  }

  @AnyLogicInternalCodegenAPI
  private boolean onClickModelAt_AuxVariables_xjal( Panel _panel, double _x, double _y, int _clickCount, boolean _publicOnly, boolean _isSuperClass ) {
    if( !_publicOnly && modelElementContains(_x, _y, 280, 220) ) {
      _panel.addInspect_xjal( 280, 220, this, "F", Panel.INSPECT_READ_ONLY_xjal ); 
      return true;
    }
    if( !_publicOnly && modelElementContains(_x, _y, 290, 130) ) {
      _panel.addInspect_xjal( 290, 130, this, "Fspring", Panel.INSPECT_READ_ONLY_xjal ); 
      return true;
    }
    if( !_publicOnly && modelElementContains(_x, _y, 280, 290) ) {
      _panel.addInspect_xjal( 280, 290, this, "Fdamping", Panel.INSPECT_READ_ONLY_xjal ); 
      return true;
    }
    return false;
  }

  @AnyLogicInternalCodegenAPI
  private boolean onClickModelAt_StockVariables_xjal( Panel _panel, double _x, double _y, int _clickCount, boolean _publicOnly, boolean _isSuperClass ) {
    if( !_publicOnly && modelElementContains(_x, _y, 60, 90, 20, 20) ) {
      _panel.addInspect( 60, 90, this, "y" ); 
      return true;
    }
    if( !_publicOnly && modelElementContains(_x, _y, 170, 90, 20, 20) ) {
      _panel.addInspect( 170, 90, this, "v" ); 
      return true;
    }
    return false;
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public boolean onClickModelAt( Panel _panel, double _x, double _y, int _clickCount, boolean _publicOnly, boolean _isSuperClass ) {
    if ( onClickModelAt_AgentLinks_xjal( _panel, _x, _y, _clickCount, _publicOnly, _isSuperClass ) ) { return true; }
    if ( onClickModelAt_Parameters_xjal( _panel, _x, _y, _clickCount, _publicOnly, _isSuperClass ) ) { return true; }
    if ( onClickModelAt_AuxVariables_xjal( _panel, _x, _y, _clickCount, _publicOnly, _isSuperClass ) ) { return true; }
    if ( onClickModelAt_StockVariables_xjal( _panel, _x, _y, _clickCount, _publicOnly, _isSuperClass ) ) { return true; }
    return super.onClickModelAt( _panel, _x, _y, _clickCount, _publicOnly, true );
  }



  @Override
  @AnyLogicInternalCodegenAPI
  public void onArrival() {
    super.onArrival();
    
 
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void onStep() {
    super.onStep();
    
 
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void onBeforeStep() {
    super.onBeforeStep();
    
 
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void onEnterFlowchartBlock(Agent oldBlock, Agent block) {
    super.onEnterFlowchartBlock( oldBlock, block );
    
 
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void onExitFlowchartBlock(Agent block) {
    super.onExitFlowchartBlock(block);
    
 
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void onSeizeResource(Agent unit) {
    super.onSeizeResource(unit);
    
 
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void onReleaseResource(Agent unit) {
    super.onReleaseResource(unit);
    
 
  }

  /**
   * Constructor
   */
  public Main( Engine engine, Agent owner, AgentList<? extends Main> ownerPopulation ) {
    super( engine, owner, ownerPopulation );
    instantiateBaseStructureThis_xjal();
  }

  @AnyLogicInternalCodegenAPI
  public void onOwnerChanged_xjal() {
    super.onOwnerChanged_xjal();
    setupReferences_xjal();
  }

  @AnyLogicInternalCodegenAPI
  public void instantiateBaseStructure_xjal() {
    super.instantiateBaseStructure_xjal();
    instantiateBaseStructureThis_xjal();
  }
  
  @AnyLogicInternalCodegenAPI
  private void instantiateBaseStructureThis_xjal() {
    setupReferences_xjal();
  }
  
  @AnyLogicInternalCodegenAPI
  private void setupReferences_xjal() {
  }
  
  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function
   */
  public Main() {
  }
  
  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function
   */
  public Main( double m, double k, double D, double ropeLength, double g ) {
    markParametersAreSet();
    this.m = m;
    this.k = k;
    this.D = D;
    this.ropeLength = ropeLength;
    this.g = g;
  }
  
  @Override
  @AnyLogicInternalCodegenAPI
  public void doCreate() {
    super.doCreate();
    // Assigning initial values for plain variables
    setupPlainVariables_Main_xjal();
    // Dynamic initialization of persistent elements
    _createPersistentElementsAP0_xjal();
    presentation = new ShapeTopLevelPresentationGroup( Main.this, true, 0, 0, 0, 0 , rope, person, plot );
    icon = new ShapeGroup( Main.this, true, 0, 0, 0  );
	 // Port connectors with non-replicated objects
    // Creating replicated embedded objects
    setupInitialConditions_xjal( Main.class );
  }

  @AnyLogicInternalCodegenAPI
  public void setupExt_xjal(AgentExtension _ext) {
    // Agent properties setup
    if ( _ext instanceof ExtAgentWithSpatialMetrics && _ext instanceof ExtWithSpaceType ) {
      double _value;
      _value = 
10 
;
      ((ExtAgentWithSpatialMetrics) _ext).setSpeed( _value, MPS );
    }
    if ( _ext instanceof ExtAgentWithSpatialMetrics ) {
      ExtAgentWithSpatialMetrics _e = (ExtAgentWithSpatialMetrics) _ext;
      _e.setAutomaticHorizontalRotation( true );
    }
    if ( _ext instanceof ExtAgentContinuous ) {
      ExtAgentContinuous _e = (ExtAgentContinuous) _ext;
      _e.setAutomaticVerticalRotation( false );
    }
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void doStart() {
    super.doStart();
    _plot_autoUpdateEvent_xjal.start();
  }
 
  @AnyLogicInternalCodegenAPI
  public void onStartup() {
    super.onStartup();
    
 
  }

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  public void setupPlainVariables_xjal() {
    setupPlainVariables_Main_xjal();
  }

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  private void setupPlainVariables_Main_xjal() {
  }

  // User API -----------------------------------------------------
  @AnyLogicInternalCodegenAPI
  static LinkToAgentAnimationSettings _connections_commonAnimationSettings_xjal = new LinkToAgentAnimationSettingsImpl( false, black, 1.0, LINE_STYLE_SOLID, ARROW_NONE, 0.0 );

  public LinkToAgentCollection<Agent, Agent> connections = new LinkToAgentStandardImpl<Agent, Agent>(this, _connections_commonAnimationSettings_xjal);
  @Override
  public LinkToAgentCollection<? extends Agent, ? extends Agent> getLinkToAgentStandard_xjal() {
    return connections;
  }
  @Override
  @AnyLogicInternalCodegenAPI
  public void onReceive( Object _msg_xjal, Agent _sender_xjal ) {
    super.onReceive( _msg_xjal, _sender_xjal );
    
Object  msg = (Object) _msg_xjal;
    Agent sender = _sender_xjal;
    
 
  }



  @AnyLogicInternalCodegenAPI
  public void drawLinksToAgents(boolean _underAgents_xjal, LinkToAgentAnimator _animator_xjal) {
    super.drawLinksToAgents(_underAgents_xjal, _animator_xjal);
    if ( _underAgents_xjal ) {
      _animator_xjal.drawLink( this, connections, true, true );
    }
  }

  public AgentList<? extends Main> getPopulation() {
    return (AgentList<? extends Main>) super.getPopulation();
  }

  public List<? extends Main> agentsInRange( double distance ) {
    return (List<? extends Main>) super.agentsInRange( distance );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public boolean isLoggingToDB(EventOriginator _e) {
    if ( _e == _plot_autoUpdateEvent_xjal ) return false;
    return super.isLoggingToDB( _e );
  }

  @AnyLogicInternalCodegenAPI
  public void onDestroy() {
    _plot_autoUpdateEvent_xjal.onDestroy();
    // On destroy code
    
 
    _ds_F.destroyUpdater_xjal();
    _ds_Fspring.destroyUpdater_xjal();
    _ds_Fdamping.destroyUpdater_xjal();
    _ds_y.destroyUpdater_xjal();
    _ds_v.destroyUpdater_xjal();
    _plot_expression0_dataSet_xjal.destroyUpdater_xjal();
    logToDB( _plot_expression0_dataSet_xjal, "plot : y" );
    super.onDestroy();
  }

  // Additional class code

 
  // End of additional class code


}
