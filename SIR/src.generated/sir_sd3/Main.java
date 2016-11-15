package sir_sd3;

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
double  InfectionRisk;

  /**
   * Returns default value for parameter <code>InfectionRisk</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _InfectionRisk_DefaultValue_xjal() {
    final Main self = this;
    return 
0.08 
;
  }

  public void set_InfectionRisk( double InfectionRisk ) {
    if (InfectionRisk == this.InfectionRisk) {
      return;
    }
    double _oldValue_xjal = this.InfectionRisk;
    this.InfectionRisk = InfectionRisk;
    onChange_InfectionRisk_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter InfectionRisk.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_InfectionRisk()</code> method instead.
   */
  protected void onChange_InfectionRisk() {
    onChange_InfectionRisk_xjal( InfectionRisk );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_InfectionRisk_xjal( double oldValue ) {

 
;  
  }


 
  public 
double  DiseaseDuration;

  /**
   * Returns default value for parameter <code>DiseaseDuration</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _DiseaseDuration_DefaultValue_xjal() {
    final Main self = this;
    return 
10 
;
  }

  public void set_DiseaseDuration( double DiseaseDuration ) {
    if (DiseaseDuration == this.DiseaseDuration) {
      return;
    }
    double _oldValue_xjal = this.DiseaseDuration;
    this.DiseaseDuration = DiseaseDuration;
    onChange_DiseaseDuration_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter DiseaseDuration.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_DiseaseDuration()</code> method instead.
   */
  protected void onChange_DiseaseDuration() {
    onChange_DiseaseDuration_xjal( DiseaseDuration );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_DiseaseDuration_xjal( double oldValue ) {

 
;  
  }


 
  public 
double  PopulationSize;

  /**
   * Returns default value for parameter <code>PopulationSize</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _PopulationSize_DefaultValue_xjal() {
    final Main self = this;
    return 
1000 
;
  }

  public void set_PopulationSize( double PopulationSize ) {
    if (PopulationSize == this.PopulationSize) {
      return;
    }
    double _oldValue_xjal = this.PopulationSize;
    this.PopulationSize = PopulationSize;
    onChange_PopulationSize_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter PopulationSize.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_PopulationSize()</code> method instead.
   */
  protected void onChange_PopulationSize() {
    onChange_PopulationSize_xjal( PopulationSize );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_PopulationSize_xjal( double oldValue ) {

 
;  
  }


 
  public 
double  InitiallyInfected;

  /**
   * Returns default value for parameter <code>InitiallyInfected</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _InitiallyInfected_DefaultValue_xjal() {
    final Main self = this;
    return 
1 
;
  }

  public void set_InitiallyInfected( double InitiallyInfected ) {
    if (InitiallyInfected == this.InitiallyInfected) {
      return;
    }
    double _oldValue_xjal = this.InitiallyInfected;
    this.InitiallyInfected = InitiallyInfected;
    onChange_InitiallyInfected_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter InitiallyInfected.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_InitiallyInfected()</code> method instead.
   */
  protected void onChange_InitiallyInfected() {
    onChange_InitiallyInfected_xjal( InitiallyInfected );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_InitiallyInfected_xjal( double oldValue ) {

 
;  
  }


 
  public 
double  EncounterRate;

  /**
   * Returns default value for parameter <code>EncounterRate</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _EncounterRate_DefaultValue_xjal() {
    final Main self = this;
    return 
10 
;
  }

  public void set_EncounterRate( double EncounterRate ) {
    if (EncounterRate == this.EncounterRate) {
      return;
    }
    double _oldValue_xjal = this.EncounterRate;
    this.EncounterRate = EncounterRate;
    onChange_EncounterRate_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter EncounterRate.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_EncounterRate()</code> method instead.
   */
  protected void onChange_EncounterRate() {
    onChange_EncounterRate_xjal( EncounterRate );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_EncounterRate_xjal( double oldValue ) {

 
;  
  }


 
  public 
double  VaccRate;

  /**
   * Returns default value for parameter <code>VaccRate</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _VaccRate_DefaultValue_xjal() {
    final Main self = this;
    return 
5 
;
  }

  public void set_VaccRate( double VaccRate ) {
    if (VaccRate == this.VaccRate) {
      return;
    }
    double _oldValue_xjal = this.VaccRate;
    this.VaccRate = VaccRate;
    onChange_VaccRate_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter VaccRate.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_VaccRate()</code> method instead.
   */
  protected void onChange_VaccRate() {
    onChange_VaccRate_xjal( VaccRate );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_VaccRate_xjal( double oldValue ) {

 
;  
  }


 
  public 
double  BirthRate;

  /**
   * Returns default value for parameter <code>BirthRate</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _BirthRate_DefaultValue_xjal() {
    final Main self = this;
    return 
0.01 
;
  }

  public void set_BirthRate( double BirthRate ) {
    if (BirthRate == this.BirthRate) {
      return;
    }
    double _oldValue_xjal = this.BirthRate;
    this.BirthRate = BirthRate;
    onChange_BirthRate_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter BirthRate.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_BirthRate()</code> method instead.
   */
  protected void onChange_BirthRate() {
    onChange_BirthRate_xjal( BirthRate );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_BirthRate_xjal( double oldValue ) {

 
;  
  }


 
  public 
double  DeathRisk;

  /**
   * Returns default value for parameter <code>DeathRisk</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _DeathRisk_DefaultValue_xjal() {
    final Main self = this;
    return 
0.01 
;
  }

  public void set_DeathRisk( double DeathRisk ) {
    if (DeathRisk == this.DeathRisk) {
      return;
    }
    double _oldValue_xjal = this.DeathRisk;
    this.DeathRisk = DeathRisk;
    onChange_DeathRisk_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter DeathRisk.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_DeathRisk()</code> method instead.
   */
  protected void onChange_DeathRisk() {
    onChange_DeathRisk_xjal( DeathRisk );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_DeathRisk_xjal( double oldValue ) {

 
;  
  }


  @Override
  public void setParametersToDefaultValues() {
    super.setParametersToDefaultValues();
    InfectionRisk = _InfectionRisk_DefaultValue_xjal();
    DiseaseDuration = _DiseaseDuration_DefaultValue_xjal();
    PopulationSize = _PopulationSize_DefaultValue_xjal();
    InitiallyInfected = _InitiallyInfected_DefaultValue_xjal();
    EncounterRate = _EncounterRate_DefaultValue_xjal();
    VaccRate = _VaccRate_DefaultValue_xjal();
    BirthRate = _BirthRate_DefaultValue_xjal();
    DeathRisk = _DeathRisk_DefaultValue_xjal();
  }

  @Override
  public boolean setParameter(String _name_xjal, Object _value_xjal, boolean _callOnChange_xjal) {
    switch ( _name_xjal ) {
    case "InfectionRisk":
      if ( _callOnChange_xjal ) {
        set_InfectionRisk( ((Number) _value_xjal).doubleValue() );
      } else {
        InfectionRisk = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "DiseaseDuration":
      if ( _callOnChange_xjal ) {
        set_DiseaseDuration( ((Number) _value_xjal).doubleValue() );
      } else {
        DiseaseDuration = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "PopulationSize":
      if ( _callOnChange_xjal ) {
        set_PopulationSize( ((Number) _value_xjal).doubleValue() );
      } else {
        PopulationSize = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "InitiallyInfected":
      if ( _callOnChange_xjal ) {
        set_InitiallyInfected( ((Number) _value_xjal).doubleValue() );
      } else {
        InitiallyInfected = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "EncounterRate":
      if ( _callOnChange_xjal ) {
        set_EncounterRate( ((Number) _value_xjal).doubleValue() );
      } else {
        EncounterRate = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "VaccRate":
      if ( _callOnChange_xjal ) {
        set_VaccRate( ((Number) _value_xjal).doubleValue() );
      } else {
        VaccRate = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "BirthRate":
      if ( _callOnChange_xjal ) {
        set_BirthRate( ((Number) _value_xjal).doubleValue() );
      } else {
        BirthRate = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "DeathRisk":
      if ( _callOnChange_xjal ) {
        set_DeathRisk( ((Number) _value_xjal).doubleValue() );
      } else {
        DeathRisk = ((Number) _value_xjal).doubleValue();
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
    case "InfectionRisk": _result_xjal = InfectionRisk; break;
    case "DiseaseDuration": _result_xjal = DiseaseDuration; break;
    case "PopulationSize": _result_xjal = PopulationSize; break;
    case "InitiallyInfected": _result_xjal = InitiallyInfected; break;
    case "EncounterRate": _result_xjal = EncounterRate; break;
    case "VaccRate": _result_xjal = VaccRate; break;
    case "BirthRate": _result_xjal = BirthRate; break;
    case "DeathRisk": _result_xjal = DeathRisk; break;
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
      list.add( "InfectionRisk" );
      list.add( "DiseaseDuration" );
      list.add( "PopulationSize" );
      list.add( "InitiallyInfected" );
      list.add( "EncounterRate" );
      list.add( "VaccRate" );
      list.add( "BirthRate" );
      list.add( "DeathRisk" );
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
      _t = toModelTime( _t, MINUTE );
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
1 
;
      _t = toModelTime( _t, MINUTE );
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
  public double RecoveryRate;
  public double VaccinationRate;
  public double Birth;
  public double InfectionRate;
  public double DyingRecovered;
  public double DyingInfected;
  public double DyingSusceptible;
  public double Infected;
  public double Susceptible;
  public double Recovered;
  public double InfectCount;
  @AnyLogicInternalCodegenAPI
  private void _stubForCodeCompletion_xjal(){
    Infected = 
InitiallyInfected 
;
Infected = 
-RecoveryRate+InfectionRate - DyingInfected 
;
    Susceptible = 
PopulationSize-InitiallyInfected 
;
Susceptible = 
Birth - InfectionRate - VaccinationRate - DyingSusceptible 
;
    Recovered = 
0 
;
Recovered = 
RecoveryRate+VaccinationRate - DyingRecovered 
;
    InfectCount = 
0 
;
InfectCount = 
InfectionRate 
;
    RecoveryRate = 
 
;
    RecoveryRate = 
Infected/DiseaseDuration 
;
    VaccinationRate = 
 
;
    VaccinationRate = 
VaccRate*(Susceptible>0 ? 1 : 0 ) 
;
    Birth = 
 
;
    Birth = 
BirthRate*Population() 
;
    InfectionRate = 
 
;
    InfectionRate = 
InfectionRisk*Susceptible*Infected/Population()*EncounterRate 
;
    DyingRecovered = 
 
;
    DyingRecovered = 
DeathRisk*Recovered 
;
    DyingInfected = 
 
;
    DyingInfected = 
DeathRisk*Infected 
;
    DyingSusceptible = 
 
;
    DyingSusceptible = 
DeathRisk*Susceptible 
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

  // Functions

 
  
double 
 Population(  ) { 

return Recovered+Infected+Susceptible; 
  }
  /**
   * Auto-created data set(s) for RecoveryRate
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_RecoveryRate = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Main.this.RecoveryRate );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for VaccinationRate
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_VaccinationRate = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Main.this.VaccinationRate );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for Birth
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_Birth = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Main.this.Birth );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for InfectionRate
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_InfectionRate = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Main.this.InfectionRate );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for DyingRecovered
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_DyingRecovered = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Main.this.DyingRecovered );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for DyingInfected
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_DyingInfected = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Main.this.DyingInfected );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for DyingSusceptible
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_DyingSusceptible = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Main.this.DyingSusceptible );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for Infected
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_Infected = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Main.this.Infected );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for Susceptible
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_Susceptible = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Main.this.Susceptible );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for Recovered
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_Recovered = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Main.this.Recovered );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for InfectCount
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_InfectCount = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Main.this.InfectCount );
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
Susceptible 
;
  }

  @AnyLogicInternalCodegenAPI
  public DataSet _plot_expression1_dataSet_xjal = new DataSet( 10000, new DataUpdater_xjal() {
    double _lastUpdateX = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateX ) { return; }
      _d.add( time(), __plot_expression1_dataSet_xjal_YValue() );
      _lastUpdateX = time();
    }
  } );
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private double __plot_expression1_dataSet_xjal_YValue() {
    return 
Infected 
;
  }

  @AnyLogicInternalCodegenAPI
  public DataSet _plot_expression2_dataSet_xjal = new DataSet( 10000, new DataUpdater_xjal() {
    double _lastUpdateX = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateX ) { return; }
      _d.add( time(), __plot_expression2_dataSet_xjal_YValue() );
      _lastUpdateX = time();
    }
  } );
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private double __plot_expression2_dataSet_xjal_YValue() {
    return 
Recovered 
;
  }

  // View areas
  @AnyLogicInternalCodegenAPI
  protected static final int _plot = 1;

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _SHAPE_NEXT_ID_xjal = 2;
 

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
  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBP0_xjal() {
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsAP0_xjal() {
    {
    DataSet _item;
    List<DataSet> _items = new ArrayList<DataSet>( 3 );
    _items.add( _plot_expression0_dataSet_xjal ); 
    _items.add( _plot_expression1_dataSet_xjal ); 
    _items.add( _plot_expression2_dataSet_xjal ); 
    List<String> _titles = new ArrayList<String>( 3 );
    _titles.add( "Susceptible" );
    _titles.add( "Infected" );
    _titles.add( "Recovered" );
    List<Chart2DPlot.Appearance> _appearances = new ArrayList<Chart2DPlot.Appearance>( 3 );
    _appearances.add( new Chart2DPlot.Appearance( limeGreen, true, Chart.INTERPOLATION_LINEAR, 2.0, Chart.POINT_NONE ) );
    _appearances.add( new Chart2DPlot.Appearance( red, true, Chart.INTERPOLATION_LINEAR, 2.0, Chart.POINT_NONE ) );
    _appearances.add( new Chart2DPlot.Appearance( blue, true, Chart.INTERPOLATION_LINEAR, 2.0, Chart.POINT_NONE ) );
    plot = new TimePlot(
		    Main.this, true, 50.0, 340.0, 
			620.0, 270.0,
            null, null,
            40.0, 20.0,
			560.0, 200.0, white, black, black,
            30.0, Chart.SOUTH,
            
300 
            , Chart.WINDOW_MOVES_WITH_DATA, null, Chart.SCALE_FIXED,
            
0 
            , 
PopulationSize 
            , Chart.GRID_DEFAULT, Chart.GRID_DEFAULT,
            darkGray, darkGray, _items, _titles, _appearances ) {
      @Override
      public void updateDynamicProperties(boolean publicOnly) {
        _plot_SetDynamicParams_xjal( this );
        super.updateDynamicProperties(publicOnly);
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
    } catch (Exception e) {
      return null;
    }
    return super.getNameOfShape_xjal( _shape );
  }

  @AnyLogicInternalCodegenAPI
  private void drawModelElements_Parameters_xjal(Panel _panel, Graphics2D _g, boolean _publicOnly, boolean _isSuperClass ) {
    if (!_publicOnly) {
      drawParameter( _panel, _g, 310, 100, 15, -5, "InfectionRisk", InfectionRisk, 0 );
    }
    if (!_publicOnly) {
      drawParameter( _panel, _g, 410, 210, 10, 0, "DiseaseDuration", DiseaseDuration, 0 );
    }
    if (!_publicOnly) {
      drawParameter( _panel, _g, 90, 90, 10, 0, "PopulationSize", PopulationSize, 0 );
    }
    if (!_publicOnly) {
      drawParameter( _panel, _g, 250, 200, 10, 0, "InitiallyInfected", InitiallyInfected, 0 );
    }
    if (!_publicOnly) {
      drawParameter( _panel, _g, 310, 70, 10, -5, "EncounterRate", EncounterRate, 0 );
    }
    if (!_publicOnly) {
      drawParameter( _panel, _g, 420, 70, 10, 0, "VaccRate", VaccRate, 0 );
    }
    if (!_publicOnly) {
      drawParameter( _panel, _g, 100, 240, -20, 20, "BirthRate", BirthRate, 0 );
    }
    if (!_publicOnly) {
      drawParameter( _panel, _g, 320, 310, 10, 0, "DeathRisk", DeathRisk, 0 );
    }
  }

  @AnyLogicInternalCodegenAPI
  private void drawModelElements_StockVariables_xjal(Panel _panel, Graphics2D _g, boolean _publicOnly, boolean _isSuperClass ) {
    if (!_publicOnly) {
      drawStock( _panel, _g, 320, 160, 20, 20, -20, -20, "Infected", Infected, red, 0 );
    }
    if (!_publicOnly) {
      drawStock( _panel, _g, 170, 160, 20, 20, -30, -20, "Susceptible", Susceptible, lime, 0 );
    }
    if (!_publicOnly) {
      drawStock( _panel, _g, 520, 160, 20, 20, -20, 20, "Recovered", Recovered, blue, 0 );
    }
    if (!_publicOnly) {
      drawStock( _panel, _g, 320, 120, 20, 20, 10, 0, "InfectCount", InfectCount, null, 0 );
    }
  }
  @AnyLogicInternalCodegenAPI
  protected static final int[] _RecoveryRate_pointsX_xjal = {334, 420, 491,  };
  @AnyLogicInternalCodegenAPI
  protected static final int[] _RecoveryRate_pointsY_xjal = {160, 160, 160,  };
  @AnyLogicInternalCodegenAPI
  protected static final int[] _VaccinationRate_pointsX_xjal = {170, 170, 340, 520, 520,  };
  @AnyLogicInternalCodegenAPI
  protected static final int[] _VaccinationRate_pointsY_xjal = {146, 40, 40, 40, 131,  };
  @AnyLogicInternalCodegenAPI
  protected static final int[] _Birth_pointsX_xjal = {120, 120, 141,  };
  @AnyLogicInternalCodegenAPI
  protected static final int[] _Birth_pointsY_xjal = {160, 160, 160,  };
  @AnyLogicInternalCodegenAPI
  protected static final int[] _InfectionRate_pointsX_xjal = {184, 250, 291,  };
  @AnyLogicInternalCodegenAPI
  protected static final int[] _InfectionRate_pointsY_xjal = {160, 160, 160,  };
  @AnyLogicInternalCodegenAPI
  protected static final int[] _DyingRecovered_pointsX_xjal = {520, 520, 520,  };
  @AnyLogicInternalCodegenAPI
  protected static final int[] _DyingRecovered_pointsY_xjal = {174, 210, 245,  };
  @AnyLogicInternalCodegenAPI
  protected static final int[] _DyingInfected_pointsX_xjal = {320, 320, 320,  };
  @AnyLogicInternalCodegenAPI
  protected static final int[] _DyingInfected_pointsY_xjal = {174, 210, 245,  };
  @AnyLogicInternalCodegenAPI
  protected static final int[] _DyingSusceptible_pointsX_xjal = {170, 170, 170,  };
  @AnyLogicInternalCodegenAPI
  protected static final int[] _DyingSusceptible_pointsY_xjal = {174, 210, 245,  };

  @AnyLogicInternalCodegenAPI
  private void drawModelElements_Flows_xjal(Panel _panel, Graphics2D _g, boolean _publicOnly, boolean _isSuperClass ) {
    if (!_publicOnly) {
      drawFlow( _panel, _g, _RecoveryRate_pointsX_xjal, _RecoveryRate_pointsY_xjal, 420, 160, 0.0f, -20, -20, "RecoveryRate", RecoveryRate, red, 0 );
    }
    if (!_publicOnly) {
      drawFlow( _panel, _g, _VaccinationRate_pointsX_xjal, _VaccinationRate_pointsY_xjal, 340, 40, 0.0f, -10, -15, "VaccinationRate", VaccinationRate, lime, 0 );
    }
    if (!_publicOnly) {
      drawFlow( _panel, _g, _Birth_pointsX_xjal, _Birth_pointsY_xjal, 120, 160, 0.0f, -10, 20, "Birth", Birth, null, 0 | DRAW_SD_NO_SOURCE );
    }
    if (!_publicOnly) {
      drawFlow( _panel, _g, _InfectionRate_pointsX_xjal, _InfectionRate_pointsY_xjal, 250, 160, 0.0f, -30, -25, "InfectionRate", InfectionRate, lime, 0 );
    }
    if (!_publicOnly) {
      drawFlow( _panel, _g, _DyingRecovered_pointsX_xjal, _DyingRecovered_pointsY_xjal, 520, 210, 1.5707964f, 5, -5, "DyingRecovered", DyingRecovered, silver, 0 | DRAW_SD_NO_TARGET );
    }
    if (!_publicOnly) {
      drawFlow( _panel, _g, _DyingInfected_pointsX_xjal, _DyingInfected_pointsY_xjal, 320, 210, 1.5707964f, 10, 15, "DyingInfected", DyingInfected, silver, 0 | DRAW_SD_NO_TARGET );
    }
    if (!_publicOnly) {
      drawFlow( _panel, _g, _DyingSusceptible_pointsX_xjal, _DyingSusceptible_pointsY_xjal, 170, 210, 1.5707964f, 5, 20, "DyingSusceptible", DyingSusceptible, silver, 0 | DRAW_SD_NO_TARGET );
    }
  }

  @AnyLogicInternalCodegenAPI
  private static void createLinkArcs_xjal() {
    _arc_PD_1320437251244_xjal = new Arc2D.Double(314.03439735951883, -122.00839161834493, 192.5000000000002, 192.5000000000002, 270.433895111084, -35.424068450927734, Arc2D.OPEN);
    _arc_PD_1320437251247_xjal = new Arc2D.Double(97.61140137246538, 129.40285579132996, 179.99999999999974, 179.99999999999974, 187.49781799316406, -36.055877685546875, Arc2D.OPEN);
    _arc_PD_1320437251248_xjal = new Arc2D.Double(169.5796424429009, 35.36106755185472, 270.5915704443925, 270.5915704443925, 170.37008666992188, -86.94401550292969, Arc2D.OPEN);
    _arc_PD_1320437251253_xjal = new Arc2D.Double(404.46596735642004, 152.89319171899015, 74.99999999999972, 74.99999999999972, 197.73927307128906, -41.15911865234375, Arc2D.OPEN);
    _arc_PD_1320437251254_xjal = new Arc2D.Double(240.0, 150.0, 260.0, 260.0, 107.03784370422363, -30.839052200317383, Arc2D.OPEN);
    _arc_PD_1320437251256_xjal = new Arc2D.Double(249.56925491579048, 155.9649467713049, 101.25000000000004, 101.25000000000004, 162.3210906982422, -74.40469360351562, Arc2D.OPEN);
    _arc_PD_1320437251257_xjal = new Arc2D.Double(59.476503540995225, -205.93490732319145, 384.0976401558858, 384.0976401558858, 215.4326629638672, 23.71818733215332, Arc2D.OPEN);
    _arc_PD_1320437251258_xjal = new Arc2D.Double(167.8885409391338, 84.22291350205184, 119.99999999999969, 119.99999999999969, 283.02215576171875, -69.92071533203125, Arc2D.OPEN);
    _arc_PD_1320438679203_xjal = new Arc2D.Double(246.7104579055193, 69.74934927730055, 138.34575538960513, 138.34575538960513, 102.33900451660156, 78.80970001220703, Arc2D.OPEN);
    _arc_PD_1320438680859_xjal = new Arc2D.Double(248.1888239628618, 98.18882396286168, 97.31800424818967, 97.31800424818967, 84.93093872070312, 87.12540435791016, Arc2D.OPEN);
    _arc_PD_1320438682781_xjal = new Arc2D.Double(160.0, 140.0, 100.00000000000001, 100.00000000000001, 124.55130004882812, -64.693603515625, Arc2D.OPEN);
    _arc_PD_1320438686046_xjal = new Arc2D.Double(244.375, 98.75000000000003, 81.25, 81.25, -51.78828430175781, -69.36421966552734, Arc2D.OPEN);
    _arc_PD_1320438918656_xjal = new Arc2D.Double(138.75, 159.375, 51.25, 51.25, 47.82703399658203, -79.89928436279297, Arc2D.OPEN);
    _arc_PD_1320438921109_xjal = new Arc2D.Double(139.00146050536233, -113.81471536455376, 426.2499999999982, 426.2499999999982, 258.9104690551758, -42.24317169189453, Arc2D.OPEN);
    _arc_PD_1320438942890_xjal = new Arc2D.Double(288.75000000000006, 159.37500000000003, 51.25, 51.25, 47.82703399658203, -79.89928436279297, Arc2D.OPEN);
    _arc_PD_1320438944531_xjal = new Arc2D.Double(300.00000000000006, 187.5, 145.0, 145.0, 216.4856719970703, -64.26005554199219, Arc2D.OPEN);
    _arc_PD_1320438966296_xjal = new Arc2D.Double(488.74999999999983, 159.37500000000003, 51.25000000000007, 51.25000000000007, 47.82703399658203, -79.89928436279297, Arc2D.OPEN);
    _arc_PD_1320438967921_xjal = new Arc2D.Double(-110.11661057235006, -428.61130022766616, 743.24381817173, 743.24381817173, 280.44384765625, 30.546276092529297, Arc2D.OPEN);
    _arc_PD_1320439030156_xjal = new Arc2D.Double(249.56925491579057, 115.96494677130505, 101.24999999999999, 101.24999999999999, 156.6247787475586, -68.70838165283203, Arc2D.OPEN);
  }
  
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1320437251244_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1320437251247_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1320437251248_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1320437251253_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1320437251254_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1320437251256_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1320437251257_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1320437251258_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1320438679203_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1320438680859_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1320438682781_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1320438686046_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1320438918656_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1320438921109_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1320438942890_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1320438944531_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1320438966296_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1320438967921_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1320439030156_xjal;

  static {
    createLinkArcs_xjal();
  }

  @AnyLogicInternalCodegenAPI
  private void drawModelElements_Links_xjal(Panel _panel, Graphics2D _g, boolean _publicOnly, boolean _isSuperClass ) {
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1320437251244_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1320437251247_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1320437251248_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1320437251253_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1320437251254_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1320437251256_xjal, null, 1, null, 0.95f, 0 | DRAW_SD_LINK_INITIAL );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1320437251257_xjal, null, 1, null, 0.95f, 0 | DRAW_SD_LINK_INITIAL );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1320437251258_xjal, null, 1, null, 0.95f, 0 | DRAW_SD_LINK_INITIAL );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1320438679203_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1320438680859_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1320438682781_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1320438686046_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1320438918656_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1320438921109_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1320438942890_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1320438944531_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1320438966296_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1320438967921_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1320439030156_xjal, null, 1, null, 0.95f, 0 );
    }
  }

  @AnyLogicInternalCodegenAPI
  private void drawModelElements_Functions_xjal(Panel _panel, Graphics2D _g, boolean _publicOnly, boolean _isSuperClass ) {
    if (!_publicOnly) {
      drawFunction( _panel, _g, 560, 80, 10, 0, "Population");
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
    drawModelElements_Flows_xjal( _panel, _g, _publicOnly, _isSuperClass );
    drawModelElements_Links_xjal( _panel, _g, _publicOnly, _isSuperClass );
    drawModelElements_Functions_xjal( _panel, _g, _publicOnly, _isSuperClass );
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
    if( !_publicOnly && modelElementContains(_x, _y, 310, 100) ) {
      _panel.addInspect( 310, 100, this, "InfectionRisk" ); 
      return true;
    }
    if( !_publicOnly && modelElementContains(_x, _y, 410, 210) ) {
      _panel.addInspect( 410, 210, this, "DiseaseDuration" ); 
      return true;
    }
    if( !_publicOnly && modelElementContains(_x, _y, 90, 90) ) {
      _panel.addInspect( 90, 90, this, "PopulationSize" ); 
      return true;
    }
    if( !_publicOnly && modelElementContains(_x, _y, 250, 200) ) {
      _panel.addInspect( 250, 200, this, "InitiallyInfected" ); 
      return true;
    }
    if( !_publicOnly && modelElementContains(_x, _y, 310, 70) ) {
      _panel.addInspect( 310, 70, this, "EncounterRate" ); 
      return true;
    }
    if( !_publicOnly && modelElementContains(_x, _y, 420, 70) ) {
      _panel.addInspect( 420, 70, this, "VaccRate" ); 
      return true;
    }
    if( !_publicOnly && modelElementContains(_x, _y, 100, 240) ) {
      _panel.addInspect( 100, 240, this, "BirthRate" ); 
      return true;
    }
    if( !_publicOnly && modelElementContains(_x, _y, 320, 310) ) {
      _panel.addInspect( 320, 310, this, "DeathRisk" ); 
      return true;
    }
    return false;
  }

  @AnyLogicInternalCodegenAPI
  private boolean onClickModelAt_Flows_xjal( Panel _panel, double _x, double _y, int _clickCount, boolean _publicOnly, boolean _isSuperClass ) {
    if( !_publicOnly && modelElementContains(_x, _y, 420, 160) ) {
      _panel.addInspect_xjal( 420, 160, this, "RecoveryRate", Panel.INSPECT_READ_ONLY_xjal ); 
      return true;
    }
    if( !_publicOnly && modelElementContains(_x, _y, 340, 40) ) {
      _panel.addInspect_xjal( 340, 40, this, "VaccinationRate", Panel.INSPECT_READ_ONLY_xjal ); 
      return true;
    }
    if( !_publicOnly && modelElementContains(_x, _y, 120, 160) ) {
      _panel.addInspect_xjal( 120, 160, this, "Birth", Panel.INSPECT_READ_ONLY_xjal ); 
      return true;
    }
    if( !_publicOnly && modelElementContains(_x, _y, 250, 160) ) {
      _panel.addInspect_xjal( 250, 160, this, "InfectionRate", Panel.INSPECT_READ_ONLY_xjal ); 
      return true;
    }
    if( !_publicOnly && modelElementContains(_x, _y, 520, 210) ) {
      _panel.addInspect_xjal( 520, 210, this, "DyingRecovered", Panel.INSPECT_READ_ONLY_xjal ); 
      return true;
    }
    if( !_publicOnly && modelElementContains(_x, _y, 320, 210) ) {
      _panel.addInspect_xjal( 320, 210, this, "DyingInfected", Panel.INSPECT_READ_ONLY_xjal ); 
      return true;
    }
    if( !_publicOnly && modelElementContains(_x, _y, 170, 210) ) {
      _panel.addInspect_xjal( 170, 210, this, "DyingSusceptible", Panel.INSPECT_READ_ONLY_xjal ); 
      return true;
    }
    return false;
  }

  @AnyLogicInternalCodegenAPI
  private boolean onClickModelAt_StockVariables_xjal( Panel _panel, double _x, double _y, int _clickCount, boolean _publicOnly, boolean _isSuperClass ) {
    if( !_publicOnly && modelElementContains(_x, _y, 320, 160, 20, 20) ) {
      _panel.addInspect( 320, 160, this, "Infected" ); 
      return true;
    }
    if( !_publicOnly && modelElementContains(_x, _y, 170, 160, 20, 20) ) {
      _panel.addInspect( 170, 160, this, "Susceptible" ); 
      return true;
    }
    if( !_publicOnly && modelElementContains(_x, _y, 520, 160, 20, 20) ) {
      _panel.addInspect( 520, 160, this, "Recovered" ); 
      return true;
    }
    if( !_publicOnly && modelElementContains(_x, _y, 320, 120, 20, 20) ) {
      _panel.addInspect( 320, 120, this, "InfectCount" ); 
      return true;
    }
    return false;
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public boolean onClickModelAt( Panel _panel, double _x, double _y, int _clickCount, boolean _publicOnly, boolean _isSuperClass ) {
    if ( onClickModelAt_AgentLinks_xjal( _panel, _x, _y, _clickCount, _publicOnly, _isSuperClass ) ) { return true; }
    if ( onClickModelAt_Parameters_xjal( _panel, _x, _y, _clickCount, _publicOnly, _isSuperClass ) ) { return true; }
    if ( onClickModelAt_Flows_xjal( _panel, _x, _y, _clickCount, _publicOnly, _isSuperClass ) ) { return true; }
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
  public Main( double InfectionRisk, double DiseaseDuration, double PopulationSize, double InitiallyInfected, double EncounterRate, double VaccRate, double BirthRate, double DeathRisk ) {
    markParametersAreSet();
    this.InfectionRisk = InfectionRisk;
    this.DiseaseDuration = DiseaseDuration;
    this.PopulationSize = PopulationSize;
    this.InitiallyInfected = InitiallyInfected;
    this.EncounterRate = EncounterRate;
    this.VaccRate = VaccRate;
    this.BirthRate = BirthRate;
    this.DeathRisk = DeathRisk;
  }
  
  @Override
  @AnyLogicInternalCodegenAPI
  public void doCreate() {
    super.doCreate();
    // Assigning initial values for plain variables
    setupPlainVariables_Main_xjal();
    // Dynamic initialization of persistent elements
    _createPersistentElementsAP0_xjal();
    presentation = new ShapeTopLevelPresentationGroup( Main.this, true, 0, 0, 0, 0 , plot );
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
10 / getScale().pixelsPerUnit(METER) / 60 
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
    
 
    _ds_RecoveryRate.destroyUpdater_xjal();
    _ds_VaccinationRate.destroyUpdater_xjal();
    _ds_Birth.destroyUpdater_xjal();
    _ds_InfectionRate.destroyUpdater_xjal();
    _ds_DyingRecovered.destroyUpdater_xjal();
    _ds_DyingInfected.destroyUpdater_xjal();
    _ds_DyingSusceptible.destroyUpdater_xjal();
    _ds_Infected.destroyUpdater_xjal();
    _ds_Susceptible.destroyUpdater_xjal();
    _ds_Recovered.destroyUpdater_xjal();
    _ds_InfectCount.destroyUpdater_xjal();
    _plot_expression0_dataSet_xjal.destroyUpdater_xjal();
    _plot_expression1_dataSet_xjal.destroyUpdater_xjal();
    _plot_expression2_dataSet_xjal.destroyUpdater_xjal();
    logToDB( _plot_expression0_dataSet_xjal, "plot : Susceptible" );
    logToDB( _plot_expression1_dataSet_xjal, "plot : Infected" );
    logToDB( _plot_expression2_dataSet_xjal, "plot : Recovered" );
    super.onDestroy();
  }

  // Additional class code

 
  // End of additional class code


}
