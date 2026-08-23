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

val HugeIcons.Hold05: ImageVector
    get() {
        if (_hold05 != null) {
            return _hold05!!
        }
        _hold05 = ImageVector.Builder(
            name = "Hold05",
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
            moveTo(17.5882f, 11.1829f)
            lineTo(18.0223f, 8.7209f)
            curveTo(18.1662f, 7.90506f, 18.9442f, 7.3603f, 19.76f, 7.50416f)
            curveTo(20.5759f, 7.64801f, 21.1206f, 8.426f, 20.9768f, 9.24184f)
            lineTo(20.5427f, 11.7039f)
            lineTo(19.4728f, 17.4199f)
            curveTo(19.0301f, 19.7855f, 16.9648f, 21.5f, 14.5582f, 21.5f)
            horizontalLineTo(12.2185f)
            curveTo(11.0787f, 21.5f, 10.5088f, 21.5f, 9.97845f, 21.3834f)
            curveTo(9.16928f, 21.2056f, 8.41699f, 20.8294f, 7.7892f, 20.2888f)
            curveTo(7.3777f, 19.9344f, 7.03576f, 19.4785f, 6.35188f, 18.5667f)
            lineTo(3.33844f, 14.5487f)
            curveTo(2.87541f, 13.9314f, 2.88873f, 13.0789f, 3.37081f, 12.4763f)
            curveTo(4.00086f, 11.6888f, 5.17559f, 11.6237f, 5.88875f, 12.3369f)
            lineTo(7.91449f, 14.4124f)
            lineTo(8.11719f, 13.0669f)
            lineTo(9.50637f, 5.18845f)
            curveTo(9.65023f, 4.37261f, 10.4282f, 3.82786f, 11.2441f, 3.97171f)
            curveTo(12.0599f, 4.11556f, 12.6047f, 4.89355f, 12.4608f, 5.70939f)
            moveTo(11.6794f, 10.141f)
            lineTo(12.4608f, 5.70939f)
            lineTo(12.8081f, 3.73978f)
            curveTo(12.9519f, 2.92394f, 13.7299f, 2.37918f, 14.5458f, 2.52304f)
            curveTo(15.3616f, 2.66689f, 15.9064f, 3.44488f, 15.7625f, 4.26072f)
            lineTo(15.4152f, 6.23034f)
            lineTo(14.6338f, 10.662f)
            moveTo(15.4152f, 6.23034f)
            curveTo(15.5591f, 5.4145f, 16.3371f, 4.86974f, 17.1529f, 5.0136f)
            curveTo(17.9687f, 5.15745f, 18.5135f, 5.93544f, 18.3696f, 6.75128f)
            lineTo(18.0223f, 8.7209f)
        }
        }.build()

        return _hold05!!
    }

private var _hold05: ImageVector? = null
