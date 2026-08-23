package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MapPinMinusInside: ImageVector
    get() {
        if (_mapPinMinusInside != null) {
            return _mapPinMinusInside!!
        }
        _mapPinMinusInside = ImageVector.Builder(
            name = "MapPinMinusInside",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(13.6138f, 21.367f)
            curveTo(13.1801f, 21.773f, 12.6005f, 22f, 11.9972f, 22f)
            curveTo(11.3939f, 22f, 10.8143f, 21.773f, 10.3806f, 21.367f)
            curveTo(6.40912f, 17.626f, 1.08686f, 13.4469f, 3.68236f, 7.37966f)
            curveTo(5.08573f, 4.09916f, 8.45444f, 2f, 11.9972f, 2f)
            curveTo(15.54f, 2f, 18.9087f, 4.09916f, 20.3121f, 7.37966f)
            curveTo(22.9043f, 13.4393f, 17.5951f, 17.6389f, 13.6138f, 21.367f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(15.4961f, 11f)
            horizontalLineTo(8.49609f)
        }
        }.build()

        return _mapPinMinusInside!!
    }

private var _mapPinMinusInside: ImageVector? = null
