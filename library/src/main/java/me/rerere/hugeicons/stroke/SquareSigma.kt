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

val HugeIcons.SquareSigma: ImageVector
    get() {
        if (_squareSigma != null) {
            return _squareSigma!!
        }
        _squareSigma = ImageVector.Builder(
            name = "SquareSigma",
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
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(2.49219f, 12f)
            curveTo(2.49219f, 7.52166f, 2.49219f, 5.28249f, 3.88343f, 3.89124f)
            curveTo(5.27467f, 2.5f, 7.51384f, 2.5f, 11.9922f, 2.5f)
            curveTo(16.4705f, 2.5f, 18.7097f, 2.5f, 20.1009f, 3.89124f)
            curveTo(21.4922f, 5.28249f, 21.4922f, 7.52166f, 21.4922f, 12f)
            curveTo(21.4922f, 16.4783f, 21.4922f, 18.7175f, 20.1009f, 20.1088f)
            curveTo(18.7097f, 21.5f, 16.4705f, 21.5f, 11.9922f, 21.5f)
            curveTo(7.51384f, 21.5f, 5.27467f, 21.5f, 3.88343f, 20.1088f)
            curveTo(2.49219f, 18.7175f, 2.49219f, 16.4783f, 2.49219f, 12f)
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
            moveTo(14.992f, 14.4986f)
            curveTo(14.9903f, 15.0266f, 14.9752f, 15.3137f, 14.8423f, 15.5299f)
            curveTo(14.5158f, 16.0612f, 13.8658f, 15.9976f, 13.3163f, 15.9976f)
            horizontalLineTo(10.7916f)
            curveTo(9.68376f, 15.9976f, 9.12985f, 15.9976f, 9.01176f, 15.6713f)
            curveTo(8.89367f, 15.345f, 9.31424f, 14.9765f, 10.1554f, 14.2394f)
            lineTo(11.8451f, 12.7588f)
            curveTo(12.2475f, 12.4062f, 12.4488f, 12.2298f, 12.4488f, 12f)
            curveTo(12.4488f, 11.7702f, 12.2475f, 11.5938f, 11.8451f, 11.2412f)
            lineTo(10.1554f, 9.76058f)
            curveTo(9.31424f, 9.02355f, 8.89367f, 8.65503f, 9.01176f, 8.3287f)
            curveTo(9.12985f, 8.00237f, 9.68376f, 8.00237f, 10.7916f, 8.00237f)
            horizontalLineTo(13.3163f)
            curveTo(13.8658f, 8.00237f, 14.5158f, 7.93885f, 14.8423f, 8.47006f)
            curveTo(14.9752f, 8.68627f, 14.9903f, 8.97338f, 14.992f, 9.50144f)
        }
        }.build()

        return _squareSigma!!
    }

private var _squareSigma: ImageVector? = null
