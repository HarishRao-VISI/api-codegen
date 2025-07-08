# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.default_api_base import BaseDefaultApi
import openapi_server.impl

from fastapi import (  # noqa: F401
    APIRouter,
    Body,
    Cookie,
    Depends,
    Form,
    Header,
    HTTPException,
    Path,
    Query,
    Response,
    Security,
    status,
)

from openapi_server.models.extra_models import TokenModel  # noqa: F401
from openapi_server.models.dynamic_pricing_post200_response import DynamicPricingPost200Response
from openapi_server.models.dynamic_pricing_post_request import DynamicPricingPostRequest
from openapi_server.security_api import get_token_ApiKeyAuth

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.post(
    "/dynamicPricing",
    responses={
        200: {"model": DynamicPricingPost200Response, "description": "Success response with calculated pricing details"},
    },
    tags=["default"],
    summary="Gets the price details",
    response_model_by_alias=True,
)
async def dynamic_pricing_post(
    dynamic_pricing_post_request: DynamicPricingPostRequest = Body(None, description=""),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> DynamicPricingPost200Response:
    if not BaseDefaultApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseDefaultApi.subclasses[0]().dynamic_pricing_post(dynamic_pricing_post_request)
