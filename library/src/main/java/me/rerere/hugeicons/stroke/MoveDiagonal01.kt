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

val HugeIcons.MoveDiagonal01: ImageVector
    get() {
        if (_moveDiagonal01 != null) {
            return _moveDiagonal01!!
        }
        _moveDiagonal01 = ImageVector.Builder(
            name = "MoveDiagonal01",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            moveTo(4.52252f, 3.46967f)
            curveTo(4.22962f, 3.17678f, 3.75475f, 3.17678f, 3.46186f, 3.46967f)
            curveTo(3.16896f, 3.76256f, 3.16896f, 4.23744f, 3.46186f, 4.53033f)
            lineTo(3.99219f, 4f)
            lineTo(4.52252f, 3.46967f)
            close()
            moveTo(19.4619f, 20.5303f)
            curveTo(19.7548f, 20.8232f, 20.2296f, 20.8232f, 20.5225f, 20.5303f)
            curveTo(20.8154f, 20.2374f, 20.8154f, 19.7626f, 20.5225f, 19.4697f)
            lineTo(19.9922f, 20f)
            lineTo(19.4619f, 20.5303f)
            close()
            moveTo(3.99219f, 4f)
            lineTo(3.46186f, 4.53033f)
            lineTo(19.4619f, 20.5303f)
            lineTo(19.9922f, 20f)
            lineTo(20.5225f, 19.4697f)
            lineTo(4.52252f, 3.46967f)
            lineTo(3.99219f, 4f)
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
            moveTo(8.99219f, 3.35495f)
            curveTo(7.86632f, 3.33895f, 4.13765f, 2.56438f, 3.34712f, 3.35495f)
            curveTo(2.55658f, 4.14551f, 3.33112f, 7.87412f, 3.34712f, 9f)
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
            moveTo(14.9922f, 20.6451f)
            curveTo(16.1181f, 20.6611f, 19.8467f, 21.4356f, 20.6373f, 20.6451f)
            curveTo(21.4278f, 19.8545f, 20.6533f, 16.1259f, 20.6373f, 15f)
        }
        }.build()

        return _moveDiagonal01!!
    }

private var _moveDiagonal01: ImageVector? = null
