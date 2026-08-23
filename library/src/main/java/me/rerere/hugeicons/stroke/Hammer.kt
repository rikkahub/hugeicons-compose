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

val HugeIcons.Hammer: ImageVector
    get() {
        if (_hammer != null) {
            return _hammer!!
        }
        _hammer = ImageVector.Builder(
            name = "Hammer",
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
            moveTo(12f, 8.5f)
            lineTo(3.12132f, 17.3787f)
            curveTo(2.72349f, 17.7765f, 2.5f, 18.3161f, 2.5f, 18.8787f)
            curveTo(2.5f, 20.0503f, 3.44975f, 21f, 4.62132f, 21f)
            curveTo(5.18393f, 21f, 5.72349f, 20.7765f, 6.12132f, 20.3787f)
            lineTo(15f, 11.5f)
        }

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
            moveTo(16.1207f, 5.03693f)
            lineTo(20.3682f, 9.3197f)
            curveTo(21.014f, 9.97093f, 21.3369f, 10.2966f, 21.4435f, 10.6774f)
            curveTo(21.5188f, 10.9467f, 21.5188f, 11.2317f, 21.4435f, 11.501f)
            curveTo(21.3369f, 11.8819f, 21.014f, 12.2075f, 20.3682f, 12.8587f)
            curveTo(19.7223f, 13.51f, 19.3994f, 13.8356f, 19.0216f, 13.943f)
            curveTo(18.7546f, 14.019f, 18.4719f, 14.019f, 18.2048f, 13.943f)
            curveTo(17.8271f, 13.8356f, 17.5042f, 13.51f, 16.8583f, 12.8587f)
            lineTo(10.0245f, 5.96802f)
            curveTo(8.99015f, 4.92507f, 8.47297f, 4.40359f, 8.50109f, 3.94831f)
            curveTo(8.51495f, 3.7239f, 8.60259f, 3.51054f, 8.75017f, 3.34197f)
            curveTo(9.04956f, 3f, 9.78095f, 3f, 11.2437f, 3f)
            curveTo(12.4209f, 3f, 13.0095f, 3f, 13.5574f, 3.16035f)
            curveTo(13.8406f, 3.24325f, 14.1139f, 3.3574f, 14.3723f, 3.50071f)
            curveTo(14.8721f, 3.77792f, 15.2883f, 4.19759f, 16.1207f, 5.03693f)
            close()
        }
        }.build()

        return _hammer!!
    }

private var _hammer: ImageVector? = null
