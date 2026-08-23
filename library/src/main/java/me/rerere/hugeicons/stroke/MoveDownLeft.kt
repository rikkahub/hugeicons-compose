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

val HugeIcons.MoveDownLeft: ImageVector
    get() {
        if (_moveDownLeft != null) {
            return _moveDownLeft!!
        }
        _moveDownLeft = ImageVector.Builder(
            name = "MoveDownLeft",
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
            moveTo(5.40629f, 12f)
            curveTo(5.38762f, 13.3135f, 4.48396f, 17.6636f, 5.4063f, 18.5859f)
            curveTo(6.32862f, 19.5082f, 10.6787f, 18.6046f, 11.9922f, 18.5859f)
        }

        path(
            fill = SolidColor(Color(0xFF141B34)),
            stroke = null,
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(19.5225f, 5.53033f)
            curveTo(19.8154f, 5.23744f, 19.8154f, 4.76256f, 19.5225f, 4.46967f)
            curveTo(19.2296f, 4.17678f, 18.7548f, 4.17678f, 18.4619f, 4.46967f)
            lineTo(18.9922f, 5f)
            lineTo(19.5225f, 5.53033f)
            close()
            moveTo(5.46186f, 17.4697f)
            curveTo(5.16896f, 17.7626f, 5.16896f, 18.2374f, 5.46186f, 18.5303f)
            curveTo(5.75475f, 18.8232f, 6.22962f, 18.8232f, 6.52252f, 18.5303f)
            lineTo(5.99219f, 18f)
            lineTo(5.46186f, 17.4697f)
            close()
            moveTo(18.9922f, 5f)
            lineTo(18.4619f, 4.46967f)
            lineTo(5.46186f, 17.4697f)
            lineTo(5.99219f, 18f)
            lineTo(6.52252f, 18.5303f)
            lineTo(19.5225f, 5.53033f)
            lineTo(18.9922f, 5f)
            close()
        }
        }.build()

        return _moveDownLeft!!
    }

private var _moveDownLeft: ImageVector? = null
