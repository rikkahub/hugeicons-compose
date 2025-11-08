package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Shopify: ImageVector
    get() {
        if (_shopify != null) {
            return _shopify!!
        }
        _shopify = ImageVector.Builder(
            name = "Shopify",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 23f)
        verticalLineTo(4f)
        lineTo(4f, 7.5f)
        lineTo(3f, 20.5f)
        lineTo(16f, 23f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.5f, 5.14833f)
        lineTo(16f, 4f)
        verticalLineTo(23f)
        lineTo(21f, 21.5f)
        curveTo(21f, 18.8371f, 20.7998f, 16.178f, 20.4012f, 13.5451f)
        lineTo(19.1298f, 5.14833f)
        horizontalLineTo(17.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.0016f, 4.87502f)
        curveTo(13.0092f, 2.85785f, 12.239f, 1.26304f, 11.0023f, 1.02911f)
        curveTo(9.44084f, 0.73373f, 7.72699f, 2.71982f, 7.17435f, 5.46517f)
        curveTo(7.09535f, 5.85761f, 7.04435f, 6.24433f, 7.01953f, 6.61979f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.8665f, 4.33083f)
        curveTo(14.5732f, 3.14854f, 13.9527f, 2.31296f, 13.1092f, 2.14837f)
        curveTo(11.7258f, 1.8784f, 10.2195f, 3.50662f, 9.55469f, 5.8801f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.7896f, 9.42437f)
        curveTo(11.7896f, 9.0035f, 9.19076f, 8.24627f, 8.50372f, 10.266f)
        curveTo(8.1332f, 11.3553f, 8.79795f, 12.5183f, 10.2171f, 13.6331f)
        curveTo(12.2041f, 15.1939f, 11.867f, 16.524f, 11.5033f, 17.0001f)
        curveTo(10.2176f, 18.6837f, 7.64621f, 17.7016f, 6.78906f, 17.0001f)
        }
        }.build()

        return _shopify!!
    }

private var _shopify: ImageVector? = null
