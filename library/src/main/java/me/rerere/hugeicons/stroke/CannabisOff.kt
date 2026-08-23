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

val HugeIcons.CannabisOff: ImageVector
    get() {
        if (_cannabisOff != null) {
            return _cannabisOff!!
        }
        _cannabisOff = ImageVector.Builder(
            name = "CannabisOff",
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
            moveTo(10.1206f, 5.12057f)
            curveTo(10.2879f, 4.28979f, 10.5471f, 3.48584f, 10.9007f, 2.71887f)
            curveTo(11.3427f, 1.76038f, 12.6574f, 1.76038f, 13.0993f, 2.71887f)
            curveTo(13.7787f, 4.19236f, 14.1096f, 5.80231f, 14.1096f, 7.47689f)
            curveTo(15.2211f, 6.34797f, 17.0072f, 5.43119f, 18.8663f, 5.08315f)
            curveTo(19.7241f, 4.92255f, 20.421f, 5.63107f, 20.0928f, 6.41249f)
            curveTo(19.4034f, 8.05354f, 17.8305f, 9.79631f, 16.7466f, 10.5303f)
            curveTo(17.8039f, 10.5303f, 19.6462f, 11.4163f, 20.7192f, 12.4646f)
            curveTo(21.283f, 13.0154f, 20.9439f, 13.8345f, 20.1821f, 14.0776f)
            curveTo(19.8843f, 14.1726f, 19.5966f, 14.2529f, 19.3205f, 14.3205f)
            moveTo(5.07324f, 5.07321f)
            curveTo(4.24359f, 4.95609f, 3.58679f, 5.64954f, 3.90729f, 6.41249f)
            curveTo(4.59666f, 8.05354f, 6.16954f, 9.79631f, 7.25348f, 10.5303f)
            curveTo(6.19619f, 10.5303f, 4.35386f, 11.4163f, 3.28086f, 12.4646f)
            curveTo(2.71709f, 13.0154f, 3.05621f, 13.8345f, 3.81794f, 14.0776f)
            curveTo(6.46084f, 14.9209f, 8.30827f, 14.6015f, 8.30827f, 14.6015f)
            curveTo(7.35926f, 15.5654f, 6.78505f, 16.6364f, 6.50758f, 17.6718f)
            curveTo(6.28881f, 18.4881f, 7.02733f, 19.1988f, 7.86204f, 18.9493f)
            curveTo(9.52329f, 18.4529f, 10.9026f, 17.2428f, 12f, 16.1282f)
            curveTo(13.0974f, 17.2428f, 14.4768f, 18.4529f, 16.138f, 18.9493f)
            curveTo(16.9727f, 19.1988f, 17.7113f, 18.4881f, 17.4925f, 17.6718f)
            curveTo(17.47f, 17.5877f, 17.4455f, 17.5034f, 17.419f, 17.419f)
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
            moveTo(2f, 2f)
            lineTo(22f, 22f)
        }
        }.build()

        return _cannabisOff!!
    }

private var _cannabisOff: ImageVector? = null
