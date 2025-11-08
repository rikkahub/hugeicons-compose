package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Rectangular01: ImageVector
    get() {
        if (_rectangular01 != null) {
            return _rectangular01!!
        }
        _rectangular01 = ImageVector.Builder(
            name = "Rectangular01",
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
        moveTo(7.68924f, 2.43826f)
        lineTo(5.3538f, 4.21913f)
        curveTo(4.38173f, 4.96038f, 3.89569f, 5.33101f, 4.01879f, 5.6655f)
        curveTo(4.14189f, 6f, 4.76432f, 6f, 6.00918f, 6f)
        horizontalLineTo(16f)
        curveTo(16.3645f, 6f, 16.5467f, 6f, 16.7153f, 5.94363f)
        curveTo(16.8839f, 5.88726f, 17.0262f, 5.77875f, 17.3108f, 5.56174f)
        lineTo(19.6462f, 3.78087f)
        curveTo(20.6183f, 3.03962f, 21.1043f, 2.66899f, 20.9812f, 2.3345f)
        curveTo(20.8581f, 2f, 20.2357f, 2f, 18.9908f, 2f)
        horizontalLineTo(9f)
        curveTo(8.63555f, 2f, 8.45332f, 2f, 8.28472f, 2.05637f)
        curveTo(8.11612f, 2.11274f, 7.97383f, 2.22125f, 7.68924f, 2.43826f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.01879f, 21.666f)
        curveTo(4.14189f, 22.0005f, 4.76432f, 22.0005f, 6.00918f, 22.0005f)
        horizontalLineTo(16f)
        curveTo(16.3645f, 22.0005f, 16.5467f, 22.0005f, 16.7153f, 21.9441f)
        moveTo(4.01879f, 21.666f)
        curveTo(3.89569f, 21.3315f, 4.38173f, 20.9608f, 5.3538f, 20.2196f)
        lineTo(7.68924f, 18.4387f)
        curveTo(7.97383f, 18.2217f, 8.11612f, 18.1132f, 8.28472f, 18.0568f)
        moveTo(4.01879f, 21.666f)
        verticalLineTo(5.66597f)
        moveTo(8.28472f, 18.0568f)
        curveTo(8.45332f, 18.0005f, 8.63555f, 18.0005f, 9f, 18.0005f)
        horizontalLineTo(14f)
        moveTo(8.28472f, 18.0568f)
        verticalLineTo(9.00046f)
        moveTo(16.7153f, 21.9441f)
        curveTo(16.8839f, 21.8877f, 17.0262f, 21.7792f, 17.3108f, 21.5622f)
        lineTo(19.6462f, 19.7813f)
        curveTo(20.6183f, 19.0401f, 21.1043f, 18.6695f, 20.9812f, 18.335f)
        verticalLineTo(2.33496f)
        moveTo(16.7153f, 21.9441f)
        verticalLineTo(5.94409f)
        }
        }.build()

        return _rectangular01!!
    }

private var _rectangular01: ImageVector? = null
