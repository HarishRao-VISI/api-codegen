# coding: utf-8

from fastapi.testclient import TestClient


from openapi_server.models.dynamic_pricing_post200_response import DynamicPricingPost200Response  # noqa: F401
from openapi_server.models.dynamic_pricing_post_request import DynamicPricingPostRequest  # noqa: F401


def test_dynamic_pricing_post(client: TestClient):
    """Test case for dynamic_pricing_post

    Gets the price details
    """
    dynamic_pricing_post_request = openapi_server.DynamicPricingPostRequest()

    headers = {
        "ApiKeyAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/dynamicPricing",
    #    headers=headers,
    #    json=dynamic_pricing_post_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

