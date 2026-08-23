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

val HugeIcons.Shoes: ImageVector
    get() {
        if (_shoes != null) {
            return _shoes!!
        }
        _shoes = ImageVector.Builder(
            name = "Shoes",
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
            moveTo(22.5f, 15f)
            horizontalLineTo(1.5f)
            verticalLineTo(7.33333f)
            curveTo(1.5f, 7.14924f, 1.64924f, 7f, 1.83333f, 7f)
            curveTo(1.93825f, 7f, 2.03705f, 7.0494f, 2.1f, 7.13333f)
            lineTo(2.42669f, 7.56892f)
            curveTo(3.10235f, 8.4698f, 4.16274f, 9f, 5.28885f, 9f)
            curveTo(6.64399f, 9f, 7.88282f, 8.23436f, 8.48885f, 7.02229f)
            lineTo(9.21471f, 5.57058f)
            curveTo(9.38955f, 5.22089f, 9.74696f, 5f, 10.1379f, 5f)
            curveTo(10.3723f, 5f, 10.5997f, 5.07977f, 10.7827f, 5.22618f)
            lineTo(12.0417f, 6.23338f)
            curveTo(12.6367f, 6.70939f, 12.9342f, 6.9474f, 13.2371f, 7.17602f)
            curveTo(14.7731f, 8.33558f, 16.4287f, 9.32758f, 18.1757f, 10.1351f)
            curveTo(18.5201f, 10.2943f, 18.8703f, 10.4444f, 19.5707f, 10.7446f)
            lineTo(19.7426f, 10.8182f)
            curveTo(20.0628f, 10.9555f, 20.223f, 11.0241f, 20.3648f, 11.0989f)
            curveTo(21.5768f, 11.7375f, 22.3776f, 12.952f, 22.4872f, 14.3175f)
            curveTo(22.5f, 14.4773f, 22.5f, 14.6515f, 22.5f, 15f)
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
            moveTo(22.5f, 15f)
            curveTo(22.5f, 16.4142f, 22.5f, 17.1213f, 22.0607f, 17.5607f)
            curveTo(21.6213f, 18f, 20.9142f, 18f, 19.5f, 18f)
            horizontalLineTo(4.5f)
            curveTo(3.08579f, 18f, 2.37868f, 18f, 1.93934f, 17.5607f)
            curveTo(1.5f, 17.1213f, 1.5f, 16.4142f, 1.5f, 15f)
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
            moveTo(12f, 9.5f)
            lineTo(13.5f, 8f)
            moveTo(15f, 11f)
            lineTo(16.5f, 9.5f)
        }
        }.build()

        return _shoes!!
    }

private var _shoes: ImageVector? = null
