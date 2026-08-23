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

val HugeIcons.Copy01: ImageVector
    get() {
        if (_copy01 != null) {
            return _copy01!!
        }
        _copy01 = ImageVector.Builder(
            name = "Copy01",
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
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(7.5f, 14.5f)
            curveTo(7.5f, 11.2002f, 7.5f, 9.55025f, 8.52513f, 8.52513f)
            curveTo(9.55025f, 7.5f, 11.2002f, 7.5f, 14.5f, 7.5f)
            curveTo(17.7998f, 7.5f, 19.4497f, 7.5f, 20.4749f, 8.52513f)
            curveTo(21.5f, 9.55025f, 21.5f, 11.2002f, 21.5f, 14.5f)
            curveTo(21.5f, 17.7998f, 21.5f, 19.4497f, 20.4749f, 20.4749f)
            curveTo(19.4497f, 21.5f, 17.7998f, 21.5f, 14.5f, 21.5f)
            curveTo(11.2002f, 21.5f, 9.55025f, 21.5f, 8.52513f, 20.4749f)
            curveTo(7.5f, 19.4497f, 7.5f, 17.7998f, 7.5f, 14.5f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(7.5f, 16.5f)
            curveTo(6.10355f, 16.5f, 5.40533f, 16.5f, 4.84402f, 16.3036f)
            curveTo(3.83866f, 15.9518f, 3.0482f, 15.1613f, 2.69641f, 14.156f)
            curveTo(2.5f, 13.5947f, 2.5f, 12.8964f, 2.5f, 11.5f)
            verticalLineTo(9.5f)
            curveTo(2.5f, 6.20017f, 2.5f, 4.55025f, 3.52513f, 3.52513f)
            curveTo(4.55025f, 2.5f, 6.20017f, 2.5f, 9.5f, 2.5f)
            horizontalLineTo(11.5f)
            curveTo(12.8964f, 2.5f, 13.5947f, 2.5f, 14.156f, 2.69641f)
            curveTo(15.1613f, 3.0482f, 15.9518f, 3.83866f, 16.3036f, 4.84402f)
            curveTo(16.5f, 5.40533f, 16.5f, 6.10355f, 16.5f, 7.5f)
        }
        }.build()

        return _copy01!!
    }

private var _copy01: ImageVector? = null
