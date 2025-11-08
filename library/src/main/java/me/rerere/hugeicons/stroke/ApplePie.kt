package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ApplePie: ImageVector
    get() {
        if (_applePie != null) {
            return _applePie!!
        }
        _applePie = ImageVector.Builder(
            name = "ApplePie",
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
        moveTo(16.5f, 7f)
        curveTo(18.6111f, 8.09821f, 20.1802f, 9.94542f, 20.7578f, 12.1376f)
        curveTo(21.5f, 12.1376f, 22f, 13.1645f, 22f, 14.0106f)
        curveTo(22f, 16.3424f, 18.5658f, 16.7405f, 18f, 14.5165f)
        curveTo(17.4968f, 16.4945f, 14.5032f, 16.4945f, 14f, 14.5165f)
        curveTo(13.4968f, 16.4945f, 10.5032f, 16.4945f, 10f, 14.5165f)
        curveTo(9.49677f, 16.4945f, 6.50323f, 16.4945f, 6f, 14.5165f)
        curveTo(5.43417f, 16.7405f, 2f, 16.3424f, 2f, 14.0106f)
        curveTo(2f, 13.1645f, 2.5f, 12.1376f, 3.24224f, 12.1376f)
        curveTo(3.81984f, 9.94542f, 5.38887f, 8.09821f, 7.5f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 4f)
        curveTo(13.1046f, 4f, 14f, 4.89543f, 14f, 6f)
        curveTo(14f, 7.10457f, 13.1046f, 8f, 12f, 8f)
        curveTo(10.8954f, 8f, 10f, 7.10457f, 10f, 6f)
        curveTo(10f, 4.89543f, 10.8954f, 4f, 12f, 4f)
        moveTo(12f, 4f)
        curveTo(12f, 3.5f, 12.4f, 2.4f, 14f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5f, 10.5f)
        lineTo(15f, 11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.5f, 10.5f)
        lineTo(9f, 11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.5f, 16f)
        lineTo(4.13246f, 17.8974f)
        curveTo(4.79247f, 19.8774f, 5.12248f, 20.8675f, 5.90815f, 21.4337f)
        curveTo(6.69381f, 22f, 7.73739f, 22f, 9.82456f, 22f)
        horizontalLineTo(14.1754f)
        curveTo(16.2626f, 22f, 17.3062f, 22f, 18.0919f, 21.4337f)
        curveTo(18.8775f, 20.8675f, 19.2075f, 19.8774f, 19.8675f, 17.8974f)
        lineTo(20.5f, 16f)
        }
        }.build()

        return _applePie!!
    }

private var _applePie: ImageVector? = null
