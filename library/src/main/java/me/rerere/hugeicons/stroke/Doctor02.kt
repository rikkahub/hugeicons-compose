package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Doctor02: ImageVector
    get() {
        if (_doctor02 != null) {
            return _doctor02!!
        }
        _doctor02 = ImageVector.Builder(
            name = "Doctor02",
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
        moveTo(4f, 22.0002f)
        verticalLineTo(21.0002f)
        curveTo(4f, 19.131f, 4f, 18.1964f, 4.40192f, 17.5002f)
        curveTo(4.66523f, 17.0442f, 5.04394f, 16.6655f, 5.5f, 16.4022f)
        curveTo(6.19615f, 16.0002f, 7.13077f, 16.0002f, 9f, 16.0002f)
        lineTo(12f, 20.0002f)
        lineTo(15f, 16.0002f)
        curveTo(16.8692f, 16.0002f, 17.8038f, 16.0002f, 18.5f, 16.4022f)
        curveTo(18.9561f, 16.6655f, 19.3348f, 17.0442f, 19.5981f, 17.5002f)
        curveTo(20f, 18.1964f, 20f, 19.131f, 20f, 21.0002f)
        verticalLineTo(22.0002f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.9374f, 7.99976f)
        lineTo(16.9552f, 3.86408f)
        curveTo(17.1882f, 2.91735f, 16.4833f, 2.00024f, 15.5228f, 2.00024f)
        horizontalLineTo(8.47724f)
        curveTo(7.51665f, 2.00024f, 6.81182f, 2.91735f, 7.04482f, 3.86407f)
        lineTo(8.06263f, 7.99976f)
        moveTo(15.9374f, 7.99976f)
        verticalLineTo(9.99976f)
        curveTo(15.9374f, 12.2089f, 14.1745f, 13.9998f, 12f, 13.9998f)
        curveTo(9.82545f, 13.9998f, 8.06263f, 12.2089f, 8.06263f, 9.99976f)
        verticalLineTo(7.99976f)
        moveTo(15.9374f, 7.99976f)
        horizontalLineTo(8.06263f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.9998f, 4.00024f)
        verticalLineTo(5.99976f)
        moveTo(12.9995f, 5f)
        lineTo(11f, 5f)
        }
        }.build()

        return _doctor02!!
    }

private var _doctor02: ImageVector? = null
