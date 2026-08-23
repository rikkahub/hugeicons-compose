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

val HugeIcons.MoveDownRight: ImageVector
    get() {
        if (_moveDownRight != null) {
            return _moveDownRight!!
        }
        _moveDownRight = ImageVector.Builder(
            name = "MoveDownRight",
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
            moveTo(18.5781f, 12f)
            curveTo(18.5968f, 13.3135f, 19.5004f, 17.6636f, 18.5781f, 18.5859f)
            curveTo(17.6558f, 19.5082f, 13.3057f, 18.6046f, 11.9922f, 18.5859f)
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
            moveTo(5.52252f, 4.46967f)
            curveTo(5.22962f, 4.17678f, 4.75475f, 4.17678f, 4.46186f, 4.46967f)
            curveTo(4.16896f, 4.76256f, 4.16896f, 5.23744f, 4.46186f, 5.53033f)
            lineTo(4.99219f, 5f)
            lineTo(5.52252f, 4.46967f)
            close()
            moveTo(17.4619f, 18.5303f)
            curveTo(17.7548f, 18.8232f, 18.2296f, 18.8232f, 18.5225f, 18.5303f)
            curveTo(18.8154f, 18.2374f, 18.8154f, 17.7626f, 18.5225f, 17.4697f)
            lineTo(17.9922f, 18f)
            lineTo(17.4619f, 18.5303f)
            close()
            moveTo(4.99219f, 5f)
            lineTo(4.46186f, 5.53033f)
            lineTo(17.4619f, 18.5303f)
            lineTo(17.9922f, 18f)
            lineTo(18.5225f, 17.4697f)
            lineTo(5.52252f, 4.46967f)
            lineTo(4.99219f, 5f)
            close()
        }
        }.build()

        return _moveDownRight!!
    }

private var _moveDownRight: ImageVector? = null
