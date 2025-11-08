package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Canvas: ImageVector
    get() {
        if (_canvas != null) {
            return _canvas!!
        }
        _canvas = ImageVector.Builder(
            name = "Canvas",
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
        moveTo(4f, 8f)
        curveTo(4f, 5.17157f, 4f, 3.75736f, 5.00421f, 2.87868f)
        curveTo(6.00841f, 2f, 7.62465f, 2f, 10.8571f, 2f)
        horizontalLineTo(13.1429f)
        curveTo(16.3753f, 2f, 17.9916f, 2f, 18.9958f, 2.87868f)
        curveTo(20f, 3.75736f, 20f, 5.17157f, 20f, 8f)
        verticalLineTo(17f)
        horizontalLineTo(4f)
        verticalLineTo(8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 17f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.6987f, 5.56588f)
        curveTo(11.9289f, 5.38957f, 13.9674f, 5.4601f, 12.2803f, 7.15266f)
        curveTo(10.1715f, 9.26836f, 7.00837f, 14.0289f, 10.6987f, 12.4421f)
        curveTo(14.3891f, 10.8554f, 15.9709f, 11.9132f, 14.3893f, 13.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 17f)
        verticalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 22f)
        lineTo(8f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 22f)
        lineTo(16f, 17f)
        }
        }.build()

        return _canvas!!
    }

private var _canvas: ImageVector? = null
