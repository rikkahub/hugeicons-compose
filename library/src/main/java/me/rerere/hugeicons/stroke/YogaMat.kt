package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.YogaMat: ImageVector
    get() {
        if (_yogaMat != null) {
            return _yogaMat!!
        }
        _yogaMat = ImageVector.Builder(
            name = "YogaMat",
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
        moveTo(10.5054f, 15.0102f)
        lineTo(17.14f, 10.4989f)
        curveTo(17.3273f, 10.3598f, 17.4944f, 10.1955f, 17.6363f, 10.0112f)
        curveTo(18.1217f, 9.38041f, 18.1121f, 8.50551f, 17.8044f, 7.77366f)
        curveTo(17.1198f, 6.14514f, 15.4952f, 5f, 13.6f, 5f)
        curveTo(12.6644f, 5f, 11.7948f, 5.27908f, 11.0717f, 5.75762f)
        lineTo(3.99219f, 10.7567f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.99514f, 13.5066f)
        curveTo(5.99514f, 14.2026f, 6.36367f, 15.5859f, 8.0358f, 15.9655f)
        curveTo(9.04177f, 16.1939f, 11.9726f, 15.2305f, 10.5386f, 12.4385f)
        curveTo(9.10468f, 9.64659f, 5.6515f, 9.63202f, 4.24682f, 10.5675f)
        curveTo(3.3884f, 11.0889f, 1.72132f, 12.7163f, 2.03737f, 14.8796f)
        curveTo(2.14955f, 16.1903f, 3.1816f, 18.8496f, 6.41238f, 19.0017f)
        horizontalLineTo(16.3037f)
        curveTo(17.2255f, 18.9286f, 17.416f, 18.7949f, 18.1181f, 18.2562f)
        curveTo(19.0626f, 17.408f, 20.6401f, 15.8485f, 21.5565f, 14.8218f)
        curveTo(21.7545f, 14.6f, 21.9682f, 14.3717f, 21.9956f, 14.0757f)
        verticalLineTo(14.0757f)
        curveTo(22.1413f, 12.499f, 19.7488f, 13.1819f, 18.0157f, 12.994f)
        }
        }.build()

        return _yogaMat!!
    }

private var _yogaMat: ImageVector? = null
