package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Sink01: ImageVector
    get() {
        if (_sink01 != null) {
            return _sink01!!
        }
        _sink01 = ImageVector.Builder(
            name = "Sink01",
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
        moveTo(12f, 14f)
        curveTo(15.2069f, 14f, 17.9143f, 11.8786f, 18.7734f, 8.97359f)
        curveTo(19.0045f, 8.192f, 19.1201f, 7.80121f, 18.8177f, 7.4006f)
        curveTo(18.5152f, 7f, 18.0239f, 7f, 17.0413f, 7f)
        horizontalLineTo(6.9587f)
        curveTo(5.9761f, 7f, 5.4848f, 7f, 5.18234f, 7.4006f)
        curveTo(4.87988f, 7.80121f, 4.99545f, 8.192f, 5.22659f, 8.97359f)
        curveTo(6.08569f, 11.8786f, 8.79306f, 14f, 12f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 7f)
        verticalLineTo(3.5f)
        curveTo(13f, 2.67157f, 13.6716f, 2f, 14.5f, 2f)
        curveTo(15.3284f, 2f, 16f, 2.67157f, 16f, 3.5f)
        verticalLineTo(4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 7f)
        verticalLineTo(6f)
        curveTo(10f, 5.05719f, 10f, 4.58579f, 9.70711f, 4.29289f)
        curveTo(9.41421f, 4f, 8.94281f, 4f, 8f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5f, 14f)
        lineTo(14f, 22f)
        moveTo(9.5f, 14f)
        lineTo(10f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 22f)
        horizontalLineTo(16f)
        }
        }.build()

        return _sink01!!
    }

private var _sink01: ImageVector? = null
