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

val HugeIcons.Shredder: ImageVector
    get() {
        if (_shredder != null) {
            return _shredder!!
        }
        _shredder = ImageVector.Builder(
            name = "Shredder",
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
            moveTo(21.9922f, 12.9993f)
            horizontalLineTo(1.99219f)
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
            moveTo(19.9922f, 13.0012f)
            verticalLineTo(10.6581f)
            curveTo(19.9922f, 9.84057f, 19.9922f, 9.43182f, 19.8399f, 9.06428f)
            curveTo(19.6877f, 8.69674f, 19.3987f, 8.40771f, 18.8206f, 7.82965f)
            lineTo(14.0841f, 3.0931f)
            curveTo(13.5852f, 2.59422f, 13.3357f, 2.34477f, 13.0267f, 2.19697f)
            curveTo(12.9624f, 2.16623f, 12.8966f, 2.13894f, 12.8294f, 2.11523f)
            curveTo(12.5063f, 2.00122f, 12.1536f, 2.00122f, 11.448f, 2.00122f)
            curveTo(8.20301f, 2.00122f, 6.58049f, 2.00122f, 5.48152f, 2.88729f)
            curveTo(5.2595f, 3.0663f, 5.05727f, 3.26853f, 4.87826f, 3.49055f)
            curveTo(3.99219f, 4.58953f, 3.99219f, 6.21204f, 3.99219f, 9.45706f)
            verticalLineTo(13.0012f)
            moveTo(12.9922f, 2.50122f)
            verticalLineTo(3.00122f)
            curveTo(12.9922f, 5.82965f, 12.9922f, 7.24386f, 13.8709f, 8.12254f)
            curveTo(14.7495f, 9.00122f, 16.1638f, 9.00122f, 18.9922f, 9.00122f)
            horizontalLineTo(19.4922f)
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
            moveTo(5.99219f, 15.9993f)
            verticalLineTo(16.9993f)
            moveTo(9.99219f, 15.9993f)
            verticalLineTo(21.9993f)
            moveTo(13.9922f, 15.9993f)
            verticalLineTo(17.9993f)
            moveTo(17.9922f, 15.9993f)
            verticalLineTo(19.9993f)
        }
        }.build()

        return _shredder!!
    }

private var _shredder: ImageVector? = null
