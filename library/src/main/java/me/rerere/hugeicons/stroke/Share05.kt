package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Share05: ImageVector
    get() {
        if (_share05 != null) {
            return _share05!!
        }
        _share05 = ImageVector.Builder(
            name = "Share05",
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
        moveTo(19.0001f, 13f)
        verticalLineTo(14f)
        curveTo(19.0001f, 17.2998f, 19.0001f, 18.9497f, 17.9749f, 19.9749f)
        curveTo(16.9498f, 21f, 15.2999f, 21f, 12.0001f, 21f)
        horizontalLineTo(10.0001f)
        curveTo(6.70023f, 21f, 5.05031f, 21f, 4.02519f, 19.9749f)
        curveTo(3.00006f, 18.9497f, 3.00006f, 17.2998f, 3.00006f, 14f)
        verticalLineTo(12f)
        curveTo(3.00006f, 8.70017f, 3.00006f, 7.05025f, 4.02519f, 6.02513f)
        curveTo(5.05031f, 5f, 6.70023f, 5f, 10.0001f, 5f)
        horizontalLineTo(11.0001f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 3f)
        horizontalLineTo(18f)
        curveTo(19.4142f, 3f, 20.1213f, 3f, 20.5607f, 3.43934f)
        curveTo(21f, 3.87868f, 21f, 4.58579f, 21f, 6f)
        verticalLineTo(10f)
        moveTo(20f, 4f)
        lineTo(11f, 13f)
        }
        }.build()

        return _share05!!
    }

private var _share05: ImageVector? = null
