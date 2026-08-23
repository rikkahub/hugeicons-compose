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

val HugeIcons.Cannabis: ImageVector
    get() {
        if (_cannabis != null) {
            return _cannabis!!
        }
        _cannabis = ImageVector.Builder(
            name = "Cannabis",
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
            moveTo(16.138f, 18.9493f)
            curveTo(14.4767f, 18.4529f, 13.0974f, 17.2428f, 12f, 16.1282f)
            curveTo(10.9026f, 17.2428f, 9.52326f, 18.4529f, 7.86201f, 18.9493f)
            curveTo(7.0273f, 19.1988f, 6.28877f, 18.4881f, 6.50754f, 17.6718f)
            curveTo(6.78501f, 16.6364f, 7.35923f, 15.5654f, 8.30824f, 14.6015f)
            curveTo(8.30824f, 14.6015f, 6.46081f, 14.9209f, 3.81791f, 14.0776f)
            curveTo(3.05617f, 13.8345f, 2.71706f, 13.0154f, 3.28083f, 12.4646f)
            curveTo(4.35383f, 11.4163f, 6.19616f, 10.5303f, 7.25345f, 10.5303f)
            curveTo(6.16951f, 9.79631f, 4.59663f, 8.05354f, 3.90726f, 6.41249f)
            curveTo(3.579f, 5.63107f, 4.27594f, 4.92255f, 5.13376f, 5.08315f)
            curveTo(6.99279f, 5.43119f, 8.77897f, 6.34797f, 9.89042f, 7.47689f)
            curveTo(9.89042f, 5.80231f, 10.2213f, 4.19236f, 10.9007f, 2.71887f)
            curveTo(11.3426f, 1.76038f, 12.6574f, 1.76038f, 13.0993f, 2.71887f)
            curveTo(13.7787f, 4.19236f, 14.1096f, 5.80231f, 14.1096f, 7.47689f)
            curveTo(15.221f, 6.34797f, 17.0072f, 5.43119f, 18.8662f, 5.08315f)
            curveTo(19.7241f, 4.92255f, 20.421f, 5.63107f, 20.0927f, 6.41249f)
            curveTo(19.4034f, 8.05354f, 17.8305f, 9.79631f, 16.7466f, 10.5303f)
            curveTo(17.8038f, 10.5303f, 19.6462f, 11.4163f, 20.7192f, 12.4646f)
            curveTo(21.2829f, 13.0154f, 20.9438f, 13.8345f, 20.1821f, 14.0776f)
            curveTo(17.5392f, 14.9209f, 15.6918f, 14.6015f, 15.6918f, 14.6015f)
            curveTo(16.6408f, 15.5654f, 17.215f, 16.6364f, 17.4925f, 17.6718f)
            curveTo(17.7112f, 18.4881f, 16.9727f, 19.1988f, 16.138f, 18.9493f)
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
            moveTo(12f, 16.5f)
            verticalLineTo(22f)
        }
        }.build()

        return _cannabis!!
    }

private var _cannabis: ImageVector? = null
