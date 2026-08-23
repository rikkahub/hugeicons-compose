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

val HugeIcons.ShieldEllipsis: ImageVector
    get() {
        if (_shieldEllipsis != null) {
            return _shieldEllipsis!!
        }
        _shieldEllipsis = ImageVector.Builder(
            name = "ShieldEllipsis",
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
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(20.9922f, 11.1833f)
            verticalLineTo(8.28029f)
            curveTo(20.9922f, 6.64029f, 20.9922f, 5.82028f, 20.5881f, 5.28529f)
            curveTo(20.184f, 4.75029f, 19.2703f, 4.49056f, 17.4429f, 3.9711f)
            curveTo(16.1944f, 3.6162f, 15.0938f, 3.18863f, 14.2145f, 2.79829f)
            curveTo(13.0156f, 2.2661f, 12.4161f, 2f, 11.9922f, 2f)
            curveTo(11.5682f, 2f, 10.9688f, 2.2661f, 9.7699f, 2.79829f)
            curveTo(8.89057f, 3.18863f, 7.79002f, 3.61619f, 6.54152f, 3.9711f)
            curveTo(4.71411f, 4.49056f, 3.80041f, 4.75029f, 3.3963f, 5.28529f)
            curveTo(2.99219f, 5.82028f, 2.99219f, 6.64029f, 2.99219f, 8.28029f)
            verticalLineTo(11.1833f)
            curveTo(2.99219f, 16.8085f, 8.05496f, 20.1835f, 10.5861f, 21.5194f)
            curveTo(11.1932f, 21.8398f, 11.4968f, 22f, 11.9922f, 22f)
            curveTo(12.4876f, 22f, 12.7911f, 21.8398f, 13.3982f, 21.5194f)
            curveTo(15.9294f, 20.1835f, 20.9922f, 16.8085f, 20.9922f, 11.1833f)
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
            moveTo(12.1179f, 11f)
            horizontalLineTo(11.9929f)
            moveTo(8.11719f, 11f)
            horizontalLineTo(7.99219f)
            moveTo(16.1172f, 11f)
            horizontalLineTo(15.9922f)
            moveTo(12.2429f, 11f)
            curveTo(12.2429f, 11.1381f, 12.131f, 11.25f, 11.9929f, 11.25f)
            curveTo(11.8549f, 11.25f, 11.7429f, 11.1381f, 11.7429f, 11f)
            curveTo(11.7429f, 10.8619f, 11.8549f, 10.75f, 11.9929f, 10.75f)
            curveTo(12.131f, 10.75f, 12.2429f, 10.8619f, 12.2429f, 11f)
            close()
            moveTo(8.24219f, 11f)
            curveTo(8.24219f, 11.1381f, 8.13026f, 11.25f, 7.99219f, 11.25f)
            curveTo(7.85412f, 11.25f, 7.74219f, 11.1381f, 7.74219f, 11f)
            curveTo(7.74219f, 10.8619f, 7.85412f, 10.75f, 7.99219f, 10.75f)
            curveTo(8.13026f, 10.75f, 8.24219f, 10.8619f, 8.24219f, 11f)
            close()
            moveTo(16.2422f, 11f)
            curveTo(16.2422f, 11.1381f, 16.1303f, 11.25f, 15.9922f, 11.25f)
            curveTo(15.8541f, 11.25f, 15.7422f, 11.1381f, 15.7422f, 11f)
            curveTo(15.7422f, 10.8619f, 15.8541f, 10.75f, 15.9922f, 10.75f)
            curveTo(16.1303f, 10.75f, 16.2422f, 10.8619f, 16.2422f, 11f)
            close()
        }
        }.build()

        return _shieldEllipsis!!
    }

private var _shieldEllipsis: ImageVector? = null
