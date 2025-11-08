package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Navigator01: ImageVector
    get() {
        if (_navigator01 != null) {
            return _navigator01!!
        }
        _navigator01 = ImageVector.Builder(
            name = "Navigator01",
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
        moveTo(4f, 3f)
        verticalLineTo(21f)
        moveTo(20f, 3f)
        verticalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.66101f, 16.8652f)
        curveTo(10.6709f, 14.9551f, 11.1759f, 14f, 12f, 14f)
        curveTo(12.8241f, 14f, 13.3291f, 14.9551f, 14.339f, 16.8652f)
        lineTo(15.0267f, 18.166f)
        curveTo(15.8023f, 19.6329f, 16.1901f, 20.3664f, 15.9082f, 20.7191f)
        curveTo(15.8324f, 20.8139f, 15.7325f, 20.8921f, 15.6163f, 20.9476f)
        curveTo(15.1841f, 21.1541f, 14.3908f, 20.7381f, 12.8043f, 19.9062f)
        curveTo(12.4524f, 19.7216f, 12.2764f, 19.6294f, 12.084f, 19.6129f)
        curveTo(12.0281f, 19.6081f, 11.9719f, 19.6081f, 11.916f, 19.6129f)
        curveTo(11.7236f, 19.6294f, 11.5476f, 19.7216f, 11.1957f, 19.9062f)
        curveTo(9.60915f, 20.7381f, 8.81587f, 21.1541f, 8.38372f, 20.9476f)
        curveTo(8.26754f, 20.8921f, 8.16764f, 20.8139f, 8.09184f, 20.7191f)
        curveTo(7.80989f, 20.3664f, 8.19769f, 19.6329f, 8.97329f, 18.166f)
        lineTo(9.66101f, 16.8652f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 3f)
        verticalLineTo(5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 9f)
        verticalLineTo(11f)
        }
        }.build()

        return _navigator01!!
    }

private var _navigator01: ImageVector? = null
