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

val HugeIcons.DropletOff: ImageVector
    get() {
        if (_dropletOff != null) {
            return _dropletOff!!
        }
        _dropletOff = ImageVector.Builder(
            name = "DropletOff",
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
            moveTo(12.0009f, 17.9994f)
            curveTo(13.6228f, 17.9994f, 15.0193f, 17.034f, 15.6471f, 15.6465f)
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
            moveTo(8.77661f, 3.77661f)
            curveTo(9.05754f, 3.49066f, 9.3321f, 3.22188f, 9.59499f, 2.97222f)
            curveTo(10.96f, 1.67593f, 13.0417f, 1.67593f, 14.4067f, 2.97222f)
            curveTo(16.9201f, 5.35907f, 20.5009f, 9.49387f, 20.5009f, 13.678f)
            curveTo(20.5009f, 14.2298f, 20.4426f, 14.7836f, 20.329f, 15.329f)
            moveTo(6.45106f, 6.45106f)
            curveTo(4.8377f, 8.58331f, 3.50085f, 11.1215f, 3.50085f, 13.678f)
            curveTo(3.50085f, 17.7804f, 6.71963f, 22f, 12.0009f, 22f)
            curveTo(14.9766f, 22f, 17.2975f, 20.6603f, 18.7569f, 18.7569f)
        }
        }.build()

        return _dropletOff!!
    }

private var _dropletOff: ImageVector? = null
