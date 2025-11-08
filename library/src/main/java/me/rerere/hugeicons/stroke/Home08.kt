package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Home08: ImageVector
    get() {
        if (_home08 != null) {
            return _home08!!
        }
        _home08 = ImageVector.Builder(
            name = "Home08",
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
        moveTo(3f, 11.9896f)
        verticalLineTo(14.5f)
        curveTo(3f, 17.7998f, 3f, 19.4497f, 4.02513f, 20.4749f)
        curveTo(5.05025f, 21.5f, 6.70017f, 21.5f, 10f, 21.5f)
        horizontalLineTo(14f)
        curveTo(17.2998f, 21.5f, 18.9497f, 21.5f, 19.9749f, 20.4749f)
        curveTo(21f, 19.4497f, 21f, 17.7998f, 21f, 14.5f)
        verticalLineTo(11.9896f)
        curveTo(21f, 10.3083f, 21f, 9.46773f, 20.6441f, 8.74005f)
        curveTo(20.2882f, 8.01237f, 19.6247f, 7.49628f, 18.2976f, 6.46411f)
        lineTo(16.2976f, 4.90855f)
        curveTo(14.2331f, 3.30285f, 13.2009f, 2.5f, 12f, 2.5f)
        curveTo(10.7991f, 2.5f, 9.76689f, 3.30285f, 7.70242f, 4.90855f)
        lineTo(5.70241f, 6.46411f)
        curveTo(4.37533f, 7.49628f, 3.71179f, 8.01237f, 3.3559f, 8.74005f)
        curveTo(3f, 9.46773f, 3f, 10.3083f, 3f, 11.9896f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 15.5f)
        horizontalLineTo(15f)
        verticalLineTo(17.5f)
        horizontalLineTo(17f)
        verticalLineTo(15.5f)
        }
        }.build()

        return _home08!!
    }

private var _home08: ImageVector? = null
