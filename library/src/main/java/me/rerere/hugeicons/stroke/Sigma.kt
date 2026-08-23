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

val HugeIcons.Sigma: ImageVector
    get() {
        if (_sigma != null) {
            return _sigma!!
        }
        _sigma = ImageVector.Builder(
            name = "Sigma",
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
            moveTo(18.4922f, 6.5f)
            verticalLineTo(6f)
            curveTo(18.4922f, 4.58579f, 18.4922f, 3.87868f, 18.0208f, 3.43934f)
            curveTo(17.5495f, 3f, 16.7909f, 3f, 15.2736f, 3f)
            horizontalLineTo(10.6394f)
            curveTo(7.556f, 3f, 6.01431f, 3f, 5.58768f, 3.88552f)
            curveTo(5.16105f, 4.77103f, 6.18529f, 5.84505f, 8.23379f, 7.99309f)
            lineTo(10.1543f, 10.0069f)
            curveTo(11.0588f, 10.9554f, 11.5111f, 11.4297f, 11.5111f, 12f)
            curveTo(11.5111f, 12.5703f, 11.0588f, 13.0446f, 10.1543f, 13.9931f)
            lineTo(8.23379f, 16.0069f)
            curveTo(6.18529f, 18.1549f, 5.16105f, 19.229f, 5.58768f, 20.1145f)
            curveTo(6.01431f, 21f, 7.556f, 21f, 10.6394f, 21f)
            horizontalLineTo(15.2736f)
            curveTo(16.7909f, 21f, 17.5495f, 21f, 18.0208f, 20.5607f)
            curveTo(18.4922f, 20.1213f, 18.4922f, 19.4142f, 18.4922f, 18f)
            verticalLineTo(17.5f)
        }
        }.build()

        return _sigma!!
    }

private var _sigma: ImageVector? = null
