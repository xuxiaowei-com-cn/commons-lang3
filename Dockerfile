# FROM docker.io/alibabadragonwell/dragonwell:8-anolis
FROM dragonwell-registry.cn-hangzhou.cr.aliyuncs.com/dragonwell/dragonwell:8-anolis

LABEL maintainer="徐晓伟 <xuxiaowei@xuxiaowei.com.cn>"

WORKDIR /home

ARG GROUP_ID=${GROUP_ID}
ARG ARTIFACT_ID=${ARTIFACT_ID}
ARG VERSION=${VERSION}
ARG CI_PIPELINE_URL=${CI_PIPELINE_URL}
ARG CI_JOB_ID=${CI_JOB_ID}

RUN printf "GROUP_ID: %s\n" "$GROUP_ID" \
    && printf "ARTIFACT_ID: %s\n" "$ARTIFACT_ID" \
    && printf "VERSION: %s\n" "$VERSION" \
    && printf "CI_PIPELINE_URL: %s\n" "$CI_PIPELINE_URL" \
    && printf "CI_JOB_ID: %s\n" "$CI_JOB_ID"

COPY target/$ARTIFACT_ID-$VERSION.jar app.jar

ENV TZ=Asia/Shanghai \
    LANG=C.UTF-8 \
    GROUP_ID=${GROUP_ID} \
    ARTIFACT_ID=${ARTIFACT_ID} \
    VERSION=${VERSION} \
    CI_PIPELINE_URL=${CI_PIPELINE_URL} \
    CI_JOB_ID=${CI_JOB_ID}

CMD java -jar app.jar && echo '在 Docker 中已正常运行并结束，将常驻内存' && sleep infinity
