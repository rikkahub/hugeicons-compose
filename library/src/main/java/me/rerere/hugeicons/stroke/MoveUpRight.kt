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

val HugeIcons.MoveUpRight: ImageVector
    get() {
        if (_moveUpRight != null) {
            return _moveUpRight!!
        }
        _moveUpRight = ImageVector.Builder(
            name = "MoveUpRight",
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
            curveTo(18.5968f, 10.6865f, 19.5004f, 6.33638f, 18.5781f, 5.41409f)
            curveTo(17.6558f, 4.4918f, 13.3057f, 5.39542f, 11.9922f, 5.41408f)
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
            moveTo(4.46186f, 18.4697f)
            curveTo(4.16896f, 18.7626f, 4.16896f, 19.2374f, 4.46186f, 19.5303f)
            curveTo(4.75475f, 19.8232f, 5.22962f, 19.8232f, 5.52252f, 19.5303f)
            lineTo(4.99219f, 19f)
            lineTo(4.46186f, 18.4697f)
            close()
            moveTo(18.5225f, 6.53033f)
            curveTo(18.8154f, 6.23744f, 18.8154f, 5.76256f, 18.5225f, 5.46967f)
            curveTo(18.2296f, 5.17678f, 17.7548f, 5.17678f, 17.4619f, 5.46967f)
            lineTo(17.9922f, 6f)
            lineTo(18.5225f, 6.53033f)
            close()
            moveTo(4.99219f, 19f)
            lineTo(5.52252f, 19.5303f)
            lineTo(18.5225f, 6.53033f)
            lineTo(17.9922f, 6f)
            lineTo(17.4619f, 5.46967f)
            lineTo(4.46186f, 18.4697f)
            lineTo(4.99219f, 19f)
            close()
        }
        }.build()

        return _moveUpRight!!
    }

private var _moveUpRight: ImageVector? = null
