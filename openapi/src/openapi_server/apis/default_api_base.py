# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from openapi_server.models.discount_request import DiscountRequest
from openapi_server.models.dynamic_pricing_response import DynamicPricingResponse
from openapi_server.security_api import get_token_ApiKeyAuth

class BaseDefaultApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseDefaultApi.subclasses = BaseDefaultApi.subclasses + (cls,)
    async def dynamic_pricing_post(
        self,
        discount_request: DiscountRequest,
    ) -> DynamicPricingResponse:
        ...
