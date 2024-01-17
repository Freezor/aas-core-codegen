#include "aas_core/aas_3_0/constants.hpp"

// This code has been automatically generated by aas-core-codegen.
// Do NOT edit or append.

namespace aas_core {
namespace aas_3_0 {
namespace constants {

std::size_t HashBytes::operator()(
  const std::vector<std::uint8_t>& bytes
) const {
  std::size_t result = 0;
  const std::size_t prime = 31;
  const std::size_t size = bytes.size();
  for (std::size_t i = 0; i < size; ++i) {
    result = bytes[i] + (result * prime);
  }
  return result;
}

const std::unordered_set<std::wstring> kValidCategoriesForDataElement = {
  L"CONSTANT",
  L"PARAMETER",
  L"VARIABLE"
};

const std::unordered_set<types::KeyTypes> kGenericFragmentKeys = {
  types::KeyTypes::kFragmentReference
};

const std::unordered_set<types::KeyTypes> kGenericGloballyIdentifiables = {
  types::KeyTypes::kGlobalReference
};

const std::unordered_set<types::KeyTypes> kAasIdentifiables = {
  types::KeyTypes::kAssetAdministrationShell,
  types::KeyTypes::kConceptDescription,
  types::KeyTypes::kIdentifiable,
  types::KeyTypes::kSubmodel
};

const std::unordered_set<types::KeyTypes> kAasSubmodelElementsAsKeys = {
  types::KeyTypes::kAnnotatedRelationshipElement,
  types::KeyTypes::kBasicEventElement,
  types::KeyTypes::kBlob,
  types::KeyTypes::kCapability,
  types::KeyTypes::kDataElement,
  types::KeyTypes::kEntity,
  types::KeyTypes::kEventElement,
  types::KeyTypes::kFile,
  types::KeyTypes::kMultiLanguageProperty,
  types::KeyTypes::kOperation,
  types::KeyTypes::kProperty,
  types::KeyTypes::kRange,
  types::KeyTypes::kReferenceElement,
  types::KeyTypes::kRelationshipElement,
  types::KeyTypes::kSubmodelElement,
  types::KeyTypes::kSubmodelElementCollection,
  types::KeyTypes::kSubmodelElementList
};

const std::unordered_set<types::KeyTypes> kAasReferableNonIdentifiables = {
  types::KeyTypes::kAnnotatedRelationshipElement,
  types::KeyTypes::kBasicEventElement,
  types::KeyTypes::kBlob,
  types::KeyTypes::kCapability,
  types::KeyTypes::kDataElement,
  types::KeyTypes::kEntity,
  types::KeyTypes::kEventElement,
  types::KeyTypes::kFile,
  types::KeyTypes::kMultiLanguageProperty,
  types::KeyTypes::kOperation,
  types::KeyTypes::kProperty,
  types::KeyTypes::kRange,
  types::KeyTypes::kReferenceElement,
  types::KeyTypes::kRelationshipElement,
  types::KeyTypes::kSubmodelElement,
  types::KeyTypes::kSubmodelElementCollection,
  types::KeyTypes::kSubmodelElementList
};

const std::unordered_set<types::KeyTypes> kAasReferables = {
  types::KeyTypes::kAssetAdministrationShell,
  types::KeyTypes::kConceptDescription,
  types::KeyTypes::kIdentifiable,
  types::KeyTypes::kSubmodel,
  types::KeyTypes::kAnnotatedRelationshipElement,
  types::KeyTypes::kBasicEventElement,
  types::KeyTypes::kBlob,
  types::KeyTypes::kCapability,
  types::KeyTypes::kDataElement,
  types::KeyTypes::kEntity,
  types::KeyTypes::kEventElement,
  types::KeyTypes::kFile,
  types::KeyTypes::kMultiLanguageProperty,
  types::KeyTypes::kOperation,
  types::KeyTypes::kProperty,
  types::KeyTypes::kRange,
  types::KeyTypes::kReferenceElement,
  types::KeyTypes::kReferable,
  types::KeyTypes::kRelationshipElement,
  types::KeyTypes::kSubmodelElement,
  types::KeyTypes::kSubmodelElementCollection,
  types::KeyTypes::kSubmodelElementList
};

const std::unordered_set<types::KeyTypes> kGloballyIdentifiables = {
  types::KeyTypes::kGlobalReference,
  types::KeyTypes::kAssetAdministrationShell,
  types::KeyTypes::kConceptDescription,
  types::KeyTypes::kIdentifiable,
  types::KeyTypes::kSubmodel
};

const std::unordered_set<types::KeyTypes> kFragmentKeys = {
  types::KeyTypes::kAnnotatedRelationshipElement,
  types::KeyTypes::kBasicEventElement,
  types::KeyTypes::kBlob,
  types::KeyTypes::kCapability,
  types::KeyTypes::kDataElement,
  types::KeyTypes::kEntity,
  types::KeyTypes::kEventElement,
  types::KeyTypes::kFile,
  types::KeyTypes::kFragmentReference,
  types::KeyTypes::kMultiLanguageProperty,
  types::KeyTypes::kOperation,
  types::KeyTypes::kProperty,
  types::KeyTypes::kRange,
  types::KeyTypes::kReferenceElement,
  types::KeyTypes::kRelationshipElement,
  types::KeyTypes::kSubmodelElement,
  types::KeyTypes::kSubmodelElementCollection,
  types::KeyTypes::kSubmodelElementList
};

const std::unordered_set<types::DataTypeIec61360> kDataTypeIec61360ForPropertyOrValue = {
  types::DataTypeIec61360::kDate,
  types::DataTypeIec61360::kString,
  types::DataTypeIec61360::kStringTranslatable,
  types::DataTypeIec61360::kIntegerMeasure,
  types::DataTypeIec61360::kIntegerCount,
  types::DataTypeIec61360::kIntegerCurrency,
  types::DataTypeIec61360::kRealMeasure,
  types::DataTypeIec61360::kRealCount,
  types::DataTypeIec61360::kRealCurrency,
  types::DataTypeIec61360::kBoolean,
  types::DataTypeIec61360::kRational,
  types::DataTypeIec61360::kRationalMeasure,
  types::DataTypeIec61360::kTime,
  types::DataTypeIec61360::kTimestamp
};

const std::unordered_set<types::DataTypeIec61360> kDataTypeIec61360ForReference = {
  types::DataTypeIec61360::kString,
  types::DataTypeIec61360::kIri,
  types::DataTypeIec61360::kIrdi
};

const std::unordered_set<types::DataTypeIec61360> kDataTypeIec61360ForDocument = {
  types::DataTypeIec61360::kFile,
  types::DataTypeIec61360::kBlob,
  types::DataTypeIec61360::kHtml
};

const std::unordered_set<types::DataTypeIec61360> kIec61360DataTypesWithUnit = {
  types::DataTypeIec61360::kIntegerMeasure,
  types::DataTypeIec61360::kRealMeasure,
  types::DataTypeIec61360::kRationalMeasure,
  types::DataTypeIec61360::kIntegerCurrency,
  types::DataTypeIec61360::kRealCurrency
};

}  // namespace constants
}  // namespace aas_3_0
}  // namespace aas_core

// This code has been automatically generated by aas-core-codegen.
// Do NOT edit or append.
