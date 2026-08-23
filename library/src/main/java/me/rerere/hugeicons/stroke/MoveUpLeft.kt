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

val HugeIcons.MoveUpLeft: ImageVector
    get() {
        if (_moveUpLeft != null) {
            return _moveUpLeft!!
        }
        _moveUpLeft = ImageVector.Builder(
            name = "MoveUpLeft",
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
            curveTo(5.38762f, 10.6865f, 4.48396f, 6.33638f, 5.4063f, 5.41409f)
            curveTo(6.32862f, 4.4918f, 10.6787f, 5.39542f, 11.9922f, 5.41408f)
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
            moveTo(19.5225f, 18.4697f)
            curveTo(19.8154f, 18.7626f, 19.8154f, 19.2374f, 19.5225f, 19.5303f)
            curveTo(19.2296f, 19.8232f, 18.7548f, 19.8232f, 18.4619f, 19.5303f)
            lineTo(18.9922f, 19f)
            lineTo(19.5225f, 18.4697f)
            close()
            moveTo(5.46186f, 6.53033f)
            curveTo(5.16896f, 6.23744f, 5.16896f, 5.76256f, 5.46186f, 5.46967f)
            curveTo(5.75475f, 5.17678f, 6.22962f, 5.17678f, 6.52252f, 5.46967f)
            lineTo(5.99219f, 6f)
            lineTo(5.46186f, 6.53033f)
            close()
            moveTo(18.9922f, 19f)
            lineTo(18.4619f, 19.5303f)
            lineTo(5.46186f, 6.53033f)
            lineTo(5.99219f, 6f)
            lineTo(6.52252f, 5.46967f)
            lineTo(19.5225f, 18.4697f)
            lineTo(18.9922f, 19f)
            close()
        }
        }.build()

        return _moveUpLeft!!
    }

private var _moveUpLeft: ImageVector? = null
