package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Archive04: ImageVector
    get() {
        if (_archive04 != null) {
            return _archive04!!
        }
        _archive04 = ImageVector.Builder(
            name = "Archive04",
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
        moveTo(21.5709f, 11.9272f)
        curveTo(21.7848f, 12.4619f, 21.8917f, 12.7293f, 21.9459f, 13.0104f)
        curveTo(22f, 13.2915f, 22f, 13.5795f, 22f, 14.1555f)
        verticalLineTo(15f)
        curveTo(22f, 17.8284f, 22f, 19.2426f, 21.1213f, 20.1213f)
        curveTo(20.2426f, 21f, 18.8284f, 21f, 16f, 21f)
        horizontalLineTo(8f)
        curveTo(5.17157f, 21f, 3.75736f, 21f, 2.87868f, 20.1213f)
        curveTo(2f, 19.2426f, 2f, 17.8284f, 2f, 15f)
        verticalLineTo(14.1555f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.5f, 13f)
        horizontalLineTo(5.58579f)
        curveTo(6.16263f, 13f, 6.45105f, 13f, 6.71982f, 13.0766f)
        curveTo(6.86747f, 13.1187f, 7.00978f, 13.1776f, 7.14394f, 13.2523f)
        curveTo(7.38816f, 13.3882f, 7.59211f, 13.5921f, 8f, 14f)
        curveTo(8.40789f, 14.4079f, 8.61184f, 14.6118f, 8.85606f, 14.7477f)
        curveTo(8.99022f, 14.8224f, 9.13253f, 14.8813f, 9.28018f, 14.9234f)
        curveTo(9.54895f, 15f, 9.83737f, 15f, 10.4142f, 15f)
        horizontalLineTo(13.5858f)
        curveTo(14.1626f, 15f, 14.4511f, 15f, 14.7198f, 14.9234f)
        curveTo(14.8675f, 14.8813f, 15.0098f, 14.8224f, 15.1439f, 14.7477f)
        curveTo(15.3882f, 14.6118f, 15.5921f, 14.4079f, 16f, 14f)
        curveTo(16.4079f, 13.5921f, 16.6118f, 13.3882f, 16.8561f, 13.2523f)
        curveTo(16.9902f, 13.1776f, 17.1325f, 13.1187f, 17.2802f, 13.0766f)
        curveTo(17.5489f, 13f, 17.8374f, 13f, 18.4142f, 13f)
        horizontalLineTo(21.5f)
        }
        }.build()

        return _archive04!!
    }

private var _archive04: ImageVector? = null
