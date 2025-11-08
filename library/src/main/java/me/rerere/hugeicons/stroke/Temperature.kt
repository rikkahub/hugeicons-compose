package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Temperature: ImageVector
    get() {
        if (_temperature != null) {
            return _temperature!!
        }
        _temperature = ImageVector.Builder(
            name = "Temperature",
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
        moveTo(12f, 22f)
        curveTo(14.7614f, 22f, 17f, 19.7614f, 17f, 17f)
        curveTo(17f, 15.3644f, 16.2147f, 13.9122f, 15.0005f, 13f)
        verticalLineTo(5.00049f)
        curveTo(15.0005f, 4.06815f, 15.0005f, 3.60198f, 14.8481f, 3.23428f)
        curveTo(14.6451f, 2.74451f, 14.256f, 2.35537f, 13.7662f, 2.15239f)
        curveTo(13.3985f, 2f, 12.9323f, 2f, 12f, 2f)
        curveTo(11.0677f, 2f, 10.6015f, 2f, 10.2338f, 2.15239f)
        curveTo(9.74402f, 2.35537f, 9.35488f, 2.74451f, 9.1519f, 3.23428f)
        curveTo(8.99951f, 3.60198f, 8.99951f, 4.06815f, 8.99951f, 5.00049f)
        verticalLineTo(13f)
        curveTo(7.78534f, 13.9122f, 7f, 15.3644f, 7f, 17f)
        curveTo(7f, 19.7614f, 9.23858f, 22f, 12f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 15f)
        curveTo(10.8954f, 15f, 10f, 15.8954f, 10f, 17f)
        curveTo(10f, 18.1046f, 10.8954f, 19f, 12f, 19f)
        curveTo(13.1046f, 19f, 14f, 18.1046f, 14f, 17f)
        curveTo(14f, 15.8954f, 13.1046f, 15f, 12f, 15f)
        moveTo(12f, 15f)
        verticalLineTo(8f)
        }
        }.build()

        return _temperature!!
    }

private var _temperature: ImageVector? = null
