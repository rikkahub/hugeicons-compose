package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Clipboard: ImageVector
    get() {
        if (_clipboard != null) {
            return _clipboard!!
        }
        _clipboard = ImageVector.Builder(
            name = "Clipboard",
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
        moveTo(17.0235f, 3.03358f)
        lineTo(16.0689f, 2.77924f)
        curveTo(13.369f, 2.05986f, 12.019f, 1.70018f, 10.9555f, 2.31074f)
        curveTo(9.89196f, 2.9213f, 9.53023f, 4.26367f, 8.80678f, 6.94841f)
        lineTo(7.78366f, 10.7452f)
        curveTo(7.0602f, 13.4299f, 6.69848f, 14.7723f, 7.3125f, 15.8298f)
        curveTo(7.92652f, 16.8874f, 9.27651f, 17.247f, 11.9765f, 17.9664f)
        lineTo(12.9311f, 18.2208f)
        curveTo(15.631f, 18.9401f, 16.981f, 19.2998f, 18.0445f, 18.6893f)
        curveTo(19.108f, 18.0787f, 19.4698f, 16.7363f, 20.1932f, 14.0516f)
        lineTo(21.2163f, 10.2548f)
        curveTo(21.9398f, 7.57005f, 22.3015f, 6.22768f, 21.6875f, 5.17016f)
        curveTo(21.0735f, 4.11264f, 19.7235f, 3.75295f, 17.0235f, 3.03358f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.8538f, 7.43306f)
        curveTo(16.8538f, 8.24714f, 16.1901f, 8.90709f, 15.3714f, 8.90709f)
        curveTo(14.5527f, 8.90709f, 13.889f, 8.24714f, 13.889f, 7.43306f)
        curveTo(13.889f, 6.61898f, 14.5527f, 5.95904f, 15.3714f, 5.95904f)
        curveTo(16.1901f, 5.95904f, 16.8538f, 6.61898f, 16.8538f, 7.43306f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 20.9463f)
        lineTo(11.0477f, 21.2056f)
        curveTo(8.35403f, 21.9391f, 7.00722f, 22.3059f, 5.94619f, 21.6833f)
        curveTo(4.88517f, 21.0608f, 4.52429f, 19.6921f, 3.80253f, 16.9547f)
        lineTo(2.78182f, 13.0834f)
        curveTo(2.06006f, 10.346f, 1.69918f, 8.97731f, 2.31177f, 7.89904f)
        curveTo(2.84167f, 6.96631f, 4f, 7.00027f, 5.5f, 7.00015f)
        }
        }.build()

        return _clipboard!!
    }

private var _clipboard: ImageVector? = null
