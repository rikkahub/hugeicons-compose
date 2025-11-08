package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SdCard: ImageVector
    get() {
        if (_sdCard != null) {
            return _sdCard!!
        }
        _sdCard = ImageVector.Builder(
            name = "SdCard",
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
        moveTo(5.5f, 8.89922f)
        verticalLineTo(8f)
        curveTo(5.5f, 5.17157f, 5.5f, 3.75736f, 6.37868f, 2.87868f)
        curveTo(7.25736f, 2f, 8.67157f, 2f, 11.5f, 2f)
        horizontalLineTo(14.5f)
        curveTo(17.3284f, 2f, 18.7426f, 2f, 19.6213f, 2.87868f)
        curveTo(20.5f, 3.75736f, 20.5f, 5.17157f, 20.5f, 8f)
        verticalLineTo(14f)
        curveTo(20.5f, 17.7712f, 20.5f, 19.6569f, 19.3284f, 20.8284f)
        curveTo(18.1569f, 22f, 16.2712f, 22f, 12.5f, 22f)
        horizontalLineTo(10.6254f)
        curveTo(7.69689f, 22f, 6.23263f, 22f, 5.19651f, 21.2702f)
        curveTo(4.8212f, 21.0058f, 4.49421f, 20.6788f, 4.22984f, 20.3035f)
        curveTo(3.5f, 19.2674f, 3.5f, 17.8031f, 3.5f, 14.8746f)
        verticalLineTo(14.6008f)
        curveTo(3.5f, 14.0589f, 3.5f, 13.7879f, 3.54625f, 13.5276f)
        curveTo(3.60289f, 13.2088f, 3.71077f, 12.9012f, 3.8657f, 12.6169f)
        curveTo(3.99221f, 12.3847f, 4.16148f, 12.1732f, 4.5f, 11.75f)
        curveTo(4.83852f, 11.3268f, 5.00779f, 11.1153f, 5.1343f, 10.8831f)
        curveTo(5.28923f, 10.5988f, 5.39711f, 10.2912f, 5.45375f, 9.97241f)
        curveTo(5.5f, 9.71207f, 5.5f, 9.44112f, 5.5f, 8.89922f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.5f, 6f)
        verticalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 6f)
        verticalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.5f, 6f)
        verticalLineTo(9f)
        }
        }.build()

        return _sdCard!!
    }

private var _sdCard: ImageVector? = null
