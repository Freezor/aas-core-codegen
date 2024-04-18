/*
 * This code has been automatically generated by aas-core-codegen.
 * Do NOT edit or append.
 */

package aas_core.aas3_0.types.impl;

import aas_core.aas3_0.visitation.IVisitor;
import aas_core.aas3_0.visitation.IVisitorWithContext;
import aas_core.aas3_0.visitation.ITransformer;
import aas_core.aas3_0.visitation.ITransformerWithContext;
import aas_core.aas3_0.types.enums.*;
import aas_core.aas3_0.types.impl.*;
import aas_core.aas3_0.types.model.*;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Objects;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import aas_core.aas3_0.types.model.IBasicEventElement;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * A basic event element.
 *
 * <p>This element is experimental and therefore may be subject to change or may be
 * removed completely in future versions of the meta-model.
 */
public class BasicEventElement implements IBasicEventElement {
  /**
   * An extension of the element.
   */
  private List<IExtension> extensions;

  /**
   * The category is a value that gives further meta information
   * w.r.t. to the class of the element.
   * It affects the expected existence of attributes and the applicability of
   * constraints.
   *
   * <p>The category is not identical to the semantic definition
   * ({@link aas_core.aas3_0.types.model.IHasSemantics}) of an element. The category e.g. could denote that
   * the element is a measurement value whereas the semantic definition of
   * the element would denote that it is the measured temperature.
   */
  private String category;

  /**
   * In case of identifiables this attribute is a short name of the element.
   * In case of referable this ID is an identifying string of the element within
   * its name space.
   *
   * <p>In case the element is a property and the property has a semantic definition
   * ({@link aas_core.aas3_0.types.model.IHasSemantics#getSemanticId()}) conformant to IEC61360
   * the {@link aas_core.aas3_0.types.model.IReferable#getIdShort()} is typically identical to the short name in English.
   */
  private String idShort;

  /**
   * Display name. Can be provided in several languages.
   */
  private List<ILangStringNameType> displayName;

  /**
   * Description or comments on the element.
   *
   * <p>The description can be provided in several languages.
   *
   * <p>If no description is defined, then the definition of the concept
   * description that defines the semantics of the element is used.
   *
   * <p>Additional information can be provided, e.g., if the element is
   * qualified and which qualifier types can be expected in which
   * context or which additional data specification templates are
   * provided.
   */
  private List<ILangStringTextType> description;

  /**
   * Identifier of the semantic definition of the element. It is called semantic ID
   * of the element or also main semantic ID of the element.
   *
   * <p>It is recommended to use a global reference.
   */
  private IReference semanticId;

  /**
   * Identifier of a supplemental semantic definition of the element.
   * It is called supplemental semantic ID of the element.
   *
   * <p>It is recommended to use a global reference.
   */
  private List<IReference> supplementalSemanticIds;

  /**
   * Additional qualification of a qualifiable element.
   *
   * <p>Constraints:
   *
   * <ul>
   *   <li> Constraint AASd-021:
   *   Every qualifiable can only have one qualifier with the same
   *   {@link aas_core.aas3_0.types.impl.Qualifier#getType()}.
   * </ul>
   */
  private List<IQualifier> qualifiers;

  /**
   * Embedded data specification.
   */
  private List<IEmbeddedDataSpecification> embeddedDataSpecifications;

  /**
   * Reference to the {@link aas_core.aas3_0.types.model.IReferable}, which defines the scope of the event.
   * Can be {@link aas_core.aas3_0.types.impl.AssetAdministrationShell}, {@link aas_core.aas3_0.types.impl.Submodel}, or
   * {@link aas_core.aas3_0.types.model.ISubmodelElement}.
   *
   * <p>Reference to a referable, e.g., a data element or
   * a submodel, that is being observed.
   */
  private IReference observed;

  /**
   * Direction of event.
   *
   * <p>Can be {@code { Input, Output }}.
   */
  private Direction direction;

  /**
   * State of event.
   *
   * <p>Can be {@code { On, Off }}.
   */
  private StateOfEvent state;

  /**
   * Information for the outer message infrastructure for scheduling the event to the
   * respective communication channel.
   */
  private String messageTopic;

  /**
   * Information, which outer message infrastructure shall handle messages for
   * the {@link aas_core.aas3_0.types.model.IEventElement}. Refers to a {@link aas_core.aas3_0.types.impl.Submodel},
   * {@link aas_core.aas3_0.types.impl.SubmodelElementList}, {@link aas_core.aas3_0.types.impl.SubmodelElementCollection} or
   * {@link aas_core.aas3_0.types.impl.Entity}, which contains {@link aas_core.aas3_0.types.model.IDataElement}'s describing
   * the proprietary specification for the message broker.
   *
   * <p>For different message infrastructure, e.g., OPC UA or MQTT or AMQP, this
   * proprietary specification could be standardized by having respective Submodels.
   */
  private IReference messageBroker;

  /**
   * Timestamp in UTC, when the last event was received (input direction) or sent
   * (output direction).
   */
  private String lastUpdate;

  /**
   * For input direction, reports on the maximum frequency, the software entity behind
   * the respective Referable can handle input events.
   *
   * <p>For output events, specifies the maximum frequency of outputting this event to
   * an outer infrastructure.
   *
   * <p>Might be not specified, that is, there is no minimum interval.
   */
  private String minInterval;

  /**
   * For input direction: not applicable.
   *
   * <p>For output direction: maximum interval in time, the respective Referable shall send
   * an update of the status of the event, even if no other trigger condition for
   * the event was not met.
   *
   * <p>Might be not specified, that is, there is no maximum interval
   */
  private String maxInterval;

  public BasicEventElement(
    IReference observed,
    Direction direction,
    StateOfEvent state) {
    this.observed = Objects.requireNonNull(
      observed,
      "Argument \"observed\" must be non-null.");
    this.direction = Objects.requireNonNull(
      direction,
      "Argument \"direction\" must be non-null.");
    this.state = Objects.requireNonNull(
      state,
      "Argument \"state\" must be non-null.");
  }

  public BasicEventElement(
    IReference observed,
    Direction direction,
    StateOfEvent state,
    List<IExtension> extensions,
    String category,
    String idShort,
    List<ILangStringNameType> displayName,
    List<ILangStringTextType> description,
    IReference semanticId,
    List<IReference> supplementalSemanticIds,
    List<IQualifier> qualifiers,
    List<IEmbeddedDataSpecification> embeddedDataSpecifications,
    String messageTopic,
    IReference messageBroker,
    String lastUpdate,
    String minInterval,
    String maxInterval) {
    this.extensions = extensions;
    this.idShort = idShort;
    this.displayName = displayName;
    this.category = category;
    this.description = description;
    this.semanticId = semanticId;
    this.supplementalSemanticIds = supplementalSemanticIds;
    this.qualifiers = qualifiers;
    this.embeddedDataSpecifications = embeddedDataSpecifications;
    this.observed = Objects.requireNonNull(
      observed,
      "Argument \"observed\" must be non-null.");
    this.direction = Objects.requireNonNull(
      direction,
      "Argument \"direction\" must be non-null.");
    this.state = Objects.requireNonNull(
      state,
      "Argument \"state\" must be non-null.");
    this.messageTopic = messageTopic;
    this.messageBroker = messageBroker;
    this.lastUpdate = lastUpdate;
    this.minInterval = minInterval;
    this.maxInterval = maxInterval;
  }

  @Override
  public Optional<List<IExtension>> getExtensions() {
    return Optional.ofNullable(extensions);
  }

  @Override
  public void setExtensions(List<IExtension> extensions) {
    this.extensions = extensions;
  }

  @Override
  public Optional<String> getCategory() {
    return Optional.ofNullable(category);
  }

  @Override
  public void setCategory(String category) {
    this.category = category;
  }

  @Override
  public Optional<String> getIdShort() {
    return Optional.ofNullable(idShort);
  }

  @Override
  public void setIdShort(String idShort) {
    this.idShort = idShort;
  }

  @Override
  public Optional<List<ILangStringNameType>> getDisplayName() {
    return Optional.ofNullable(displayName);
  }

  @Override
  public void setDisplayName(List<ILangStringNameType> displayName) {
    this.displayName = displayName;
  }

  @Override
  public Optional<List<ILangStringTextType>> getDescription() {
    return Optional.ofNullable(description);
  }

  @Override
  public void setDescription(List<ILangStringTextType> description) {
    this.description = description;
  }

  @Override
  public Optional<IReference> getSemanticId() {
    return Optional.ofNullable(semanticId);
  }

  @Override
  public void setSemanticId(IReference semanticId) {
    this.semanticId = semanticId;
  }

  @Override
  public Optional<List<IReference>> getSupplementalSemanticIds() {
    return Optional.ofNullable(supplementalSemanticIds);
  }

  @Override
  public void setSupplementalSemanticIds(List<IReference> supplementalSemanticIds) {
    this.supplementalSemanticIds = supplementalSemanticIds;
  }

  @Override
  public Optional<List<IQualifier>> getQualifiers() {
    return Optional.ofNullable(qualifiers);
  }

  @Override
  public void setQualifiers(List<IQualifier> qualifiers) {
    this.qualifiers = qualifiers;
  }

  @Override
  public Optional<List<IEmbeddedDataSpecification>> getEmbeddedDataSpecifications() {
    return Optional.ofNullable(embeddedDataSpecifications);
  }

  @Override
  public void setEmbeddedDataSpecifications(List<IEmbeddedDataSpecification> embeddedDataSpecifications) {
    this.embeddedDataSpecifications = embeddedDataSpecifications;
  }

  @Override
  public IReference getObserved() {
    return observed;
  }

  @Override
  public void setObserved(IReference observed) {
    this.observed = Objects.requireNonNull(
      observed,
      "Argument \"observed\" must be non-null.");
  }

  @Override
  public Direction getDirection() {
    return direction;
  }

  @Override
  public void setDirection(Direction direction) {
    this.direction = Objects.requireNonNull(
      direction,
      "Argument \"direction\" must be non-null.");
  }

  @Override
  public StateOfEvent getState() {
    return state;
  }

  @Override
  public void setState(StateOfEvent state) {
    this.state = Objects.requireNonNull(
      state,
      "Argument \"state\" must be non-null.");
  }

  @Override
  public Optional<String> getMessageTopic() {
    return Optional.ofNullable(messageTopic);
  }

  @Override
  public void setMessageTopic(String messageTopic) {
    this.messageTopic = messageTopic;
  }

  @Override
  public Optional<IReference> getMessageBroker() {
    return Optional.ofNullable(messageBroker);
  }

  @Override
  public void setMessageBroker(IReference messageBroker) {
    this.messageBroker = messageBroker;
  }

  @Override
  public Optional<String> getLastUpdate() {
    return Optional.ofNullable(lastUpdate);
  }

  @Override
  public void setLastUpdate(String lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  @Override
  public Optional<String> getMinInterval() {
    return Optional.ofNullable(minInterval);
  }

  @Override
  public void setMinInterval(String minInterval) {
    this.minInterval = minInterval;
  }

  @Override
  public Optional<String> getMaxInterval() {
    return Optional.ofNullable(maxInterval);
  }

  @Override
  public void setMaxInterval(String maxInterval) {
    this.maxInterval = maxInterval;
  }

  /**
   * Iterate over {@link BasicEventElement#extensions}, if set,
   * and otherwise return an empty iterator.
   */
  public Iterable<IExtension> overExtensionsOrEmpty() {
    return getExtensions().orElseGet(Collections::emptyList);
  }

  /**
   * Iterate over {@link BasicEventElement#displayName}, if set,
   * and otherwise return an empty iterator.
   */
  public Iterable<ILangStringNameType> overDisplayNameOrEmpty() {
    return getDisplayName().orElseGet(Collections::emptyList);
  }

  /**
   * Iterate over {@link BasicEventElement#description}, if set,
   * and otherwise return an empty iterator.
   */
  public Iterable<ILangStringTextType> overDescriptionOrEmpty() {
    return getDescription().orElseGet(Collections::emptyList);
  }

  /**
   * Iterate over {@link BasicEventElement#supplementalSemanticIds}, if set,
   * and otherwise return an empty iterator.
   */
  public Iterable<IReference> overSupplementalSemanticIdsOrEmpty() {
    return getSupplementalSemanticIds().orElseGet(Collections::emptyList);
  }

  /**
   * Iterate over {@link BasicEventElement#qualifiers}, if set,
   * and otherwise return an empty iterator.
   */
  public Iterable<IQualifier> overQualifiersOrEmpty() {
    return getQualifiers().orElseGet(Collections::emptyList);
  }

  /**
   * Iterate over {@link BasicEventElement#embeddedDataSpecifications}, if set,
   * and otherwise return an empty iterator.
   */
  public Iterable<IEmbeddedDataSpecification> overEmbeddedDataSpecificationsOrEmpty() {
    return getEmbeddedDataSpecifications().orElseGet(Collections::emptyList);
  }

  /**
   * Iterate recursively over all the class instances referenced from this instance.
   */
  public Iterable<IClass> descend() {
    return new BasicEventElementRecursiveIterable();
  }

  /**
   * Iterate over all the class instances referenced from this instance.
   */
  public Iterable<IClass> descendOnce() {
    return new BasicEventElementIterable();
  }

  /**
   * Accept the {@code visitor} to visit this instance for double dispatch.
   **/
  @Override
  public void accept(IVisitor visitor) {
    visitor.visitBasicEventElement(this);
  }

  /**
   * Accept the {@code visitor} to visit this instance for double dispatch
   * with the {@code context}.
   **/
  @Override
  public <ContextT> void accept(
      IVisitorWithContext<ContextT> visitor,
      ContextT context) {
    visitor.visitBasicEventElement(this, context);
  }

  /**
   * Accept the {@code transformer} to visit this instance for double dispatch.
   **/
  @Override
  public <T> T transform(ITransformer<T> transformer) {
    return transformer.transformBasicEventElement(this);
  }

  /**
   * Accept the {@code transformer} to visit this instance for double dispatch
   * with the {@code context}.
   **/
  @Override
  public <ContextT, T> T transform(
      ITransformerWithContext<ContextT, T> transformer,
      ContextT context) {
    return transformer.transformBasicEventElement(this, context);
  }

  private class BasicEventElementIterable implements Iterable<IClass> {
    @Override
    public Iterator<IClass> iterator() {
      Stream<IClass> stream = stream();

      return stream.iterator();
    }

    @Override
    public void forEach(Consumer<? super IClass> action) {
      Stream<IClass> stream = stream();

      stream.forEach(action);
    }

    @Override
    public Spliterator<IClass> spliterator() {
      Stream<IClass> stream = stream();

      return stream.spliterator();
    }

    private Stream<IClass> stream() {
      Stream<IClass> memberStream = Stream.empty();

      if (extensions != null) {
        memberStream = Stream.concat(memberStream,
          BasicEventElement.this.extensions.stream());
      }

      if (displayName != null) {
        memberStream = Stream.concat(memberStream,
          BasicEventElement.this.displayName.stream());
      }

      if (description != null) {
        memberStream = Stream.concat(memberStream,
          BasicEventElement.this.description.stream());
      }

      if (semanticId != null) {
        memberStream = Stream.concat(memberStream,
          Stream.<IClass>of(BasicEventElement.this.semanticId));
      }

      if (supplementalSemanticIds != null) {
        memberStream = Stream.concat(memberStream,
          BasicEventElement.this.supplementalSemanticIds.stream());
      }

      if (qualifiers != null) {
        memberStream = Stream.concat(memberStream,
          BasicEventElement.this.qualifiers.stream());
      }

      if (embeddedDataSpecifications != null) {
        memberStream = Stream.concat(memberStream,
          BasicEventElement.this.embeddedDataSpecifications.stream());
      }

      if (observed != null) {
        memberStream = Stream.concat(memberStream,
          Stream.<IClass>of(BasicEventElement.this.observed));
      }

      if (messageBroker != null) {
        memberStream = Stream.concat(memberStream,
          Stream.<IClass>of(BasicEventElement.this.messageBroker));
      }

      return memberStream;
    }
  }

  private class BasicEventElementRecursiveIterable implements Iterable<IClass> {
    @Override
    public Iterator<IClass> iterator() {
      Stream<IClass> stream = stream();

      return stream.iterator();
    }

    @Override
    public void forEach(Consumer<? super IClass> action) {
      Stream<IClass> stream = stream();

      stream.forEach(action);
    }

    @Override
    public Spliterator<IClass> spliterator() {
      Stream<IClass> stream = stream();

      return stream.spliterator();
    }

    private Stream<IClass> stream() {
      Stream<IClass> memberStream = Stream.empty();

      if (extensions != null) {
        memberStream = Stream.concat(memberStream,
          BasicEventElement.this.extensions.stream()
            .flatMap(item -> Stream.concat(Stream.<IClass>of(item),
              StreamSupport.stream(item.descend().spliterator(), false))));
      }

      if (displayName != null) {
        memberStream = Stream.concat(memberStream,
          BasicEventElement.this.displayName.stream()
            .flatMap(item -> Stream.concat(Stream.<IClass>of(item),
              StreamSupport.stream(item.descend().spliterator(), false))));
      }

      if (description != null) {
        memberStream = Stream.concat(memberStream,
          BasicEventElement.this.description.stream()
            .flatMap(item -> Stream.concat(Stream.<IClass>of(item),
              StreamSupport.stream(item.descend().spliterator(), false))));
      }

      if (semanticId != null) {
        memberStream = Stream.concat(memberStream,
          Stream.concat(Stream.<IClass>of(BasicEventElement.this.semanticId),
            StreamSupport.stream(BasicEventElement.this.semanticId.descend().spliterator(), false)));
      }

      if (supplementalSemanticIds != null) {
        memberStream = Stream.concat(memberStream,
          BasicEventElement.this.supplementalSemanticIds.stream()
            .flatMap(item -> Stream.concat(Stream.<IClass>of(item),
              StreamSupport.stream(item.descend().spliterator(), false))));
      }

      if (qualifiers != null) {
        memberStream = Stream.concat(memberStream,
          BasicEventElement.this.qualifiers.stream()
            .flatMap(item -> Stream.concat(Stream.<IClass>of(item),
              StreamSupport.stream(item.descend().spliterator(), false))));
      }

      if (embeddedDataSpecifications != null) {
        memberStream = Stream.concat(memberStream,
          BasicEventElement.this.embeddedDataSpecifications.stream()
            .flatMap(item -> Stream.concat(Stream.<IClass>of(item),
              StreamSupport.stream(item.descend().spliterator(), false))));
      }

      if (observed != null) {
        memberStream = Stream.concat(memberStream,
          Stream.concat(Stream.<IClass>of(BasicEventElement.this.observed),
            StreamSupport.stream(BasicEventElement.this.observed.descend().spliterator(), false)));
      }

      if (messageBroker != null) {
        memberStream = Stream.concat(memberStream,
          Stream.concat(Stream.<IClass>of(BasicEventElement.this.messageBroker),
            StreamSupport.stream(BasicEventElement.this.messageBroker.descend().spliterator(), false)));
      }

      return memberStream;
    }
  }
}

/*
 * This code has been automatically generated by aas-core-codegen.
 * Do NOT edit or append.
 */