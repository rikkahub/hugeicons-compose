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

val HugeIcons.Stone: ImageVector
    get() {
        if (_stone != null) {
            return _stone!!
        }
        _stone = ImageVector.Builder(
            name = "Stone",
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
            moveTo(10.7185f, 20.8661f)
            lineTo(11.236f, 11.9365f)
            moveTo(18.998f, 19.1016f)
            lineTo(16.9282f, 11.9355f)
        }

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
            moveTo(5.02344f, 8.35184f)
            lineTo(9.78297f, 11.0981f)
            curveTo(10.5038f, 11.514f, 10.8641f, 11.722f, 11.2621f, 11.8284f)
            curveTo(11.6601f, 11.9348f, 12.0774f, 11.9348f, 12.9118f, 11.9348f)
            horizontalLineTo(13.6019f)
            curveTo(15.2287f, 11.9348f, 16.0421f, 11.9348f, 16.7286f, 11.5714f)
            curveTo(17.415f, 11.2081f, 17.8662f, 10.5386f, 18.7686f, 9.19968f)
            lineTo(20.03f, 7.32812f)
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
            moveTo(20.8602f, 12.5478f)
            lineTo(20.2801f, 8.53102f)
            curveTo(20.1647f, 7.73229f, 20.1071f, 7.33293f, 19.951f, 6.96694f)
            curveTo(19.9243f, 6.90421f, 19.8954f, 6.84238f, 19.8645f, 6.78155f)
            curveTo(19.6842f, 6.42663f, 19.4144f, 6.12411f, 18.8748f, 5.51906f)
            curveTo(18.2628f, 4.83283f, 17.9568f, 4.48972f, 17.572f, 4.25227f)
            curveTo(17.5062f, 4.21163f, 17.4388f, 4.17345f, 17.3701f, 4.13781f)
            curveTo(16.9685f, 3.92953f, 16.5145f, 3.84185f, 15.6065f, 3.66649f)
            lineTo(13.9096f, 3.33877f)
            curveTo(12.3461f, 3.0368f, 11.5643f, 2.88581f, 10.8324f, 3.10153f)
            curveTo(10.1004f, 3.31724f, 9.52968f, 3.86684f, 8.38819f, 4.96602f)
            lineTo(5.55073f, 7.6983f)
            curveTo(4.99463f, 8.23379f, 4.71658f, 8.50153f, 4.51495f, 8.82488f)
            curveTo(4.31333f, 9.14822f, 4.19624f, 9.51417f, 3.96205f, 10.2461f)
            lineTo(3.76766f, 10.8536f)
            curveTo(3.12566f, 12.86f, 2.80465f, 13.8632f, 3.1068f, 14.795f)
            curveTo(3.40895f, 15.7268f, 4.25998f, 16.3581f, 5.96205f, 17.6209f)
            lineTo(8.71135f, 19.6605f)
            curveTo(9.70212f, 20.3955f, 10.1975f, 20.763f, 10.7807f, 20.9162f)
            curveTo(11.364f, 21.0694f, 11.9784f, 20.9934f, 13.2073f, 20.8415f)
            lineTo(15.1144f, 20.6057f)
            curveTo(17.0021f, 20.3723f, 17.9459f, 20.2556f, 18.6394f, 19.6932f)
            curveTo(19.3329f, 19.1309f, 19.6336f, 18.2383f, 20.2352f, 16.4532f)
            lineTo(20.604f, 15.3589f)
            curveTo(20.8347f, 14.6742f, 20.9501f, 14.3318f, 20.9825f, 13.9757f)
            curveTo(21.015f, 13.6195f, 20.9634f, 13.2623f, 20.8602f, 12.5478f)
            close()
        }
        }.build()

        return _stone!!
    }

private var _stone: ImageVector? = null
