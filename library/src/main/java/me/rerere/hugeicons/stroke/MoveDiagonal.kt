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

val HugeIcons.MoveDiagonal: ImageVector
    get() {
        if (_moveDiagonal != null) {
            return _moveDiagonal!!
        }
        _moveDiagonal = ImageVector.Builder(
            name = "MoveDiagonal",
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
            moveTo(20.5227f, 4.53033f)
            curveTo(20.8156f, 4.23744f, 20.8156f, 3.76256f, 20.5227f, 3.46967f)
            curveTo(20.2298f, 3.17678f, 19.7549f, 3.17678f, 19.462f, 3.46967f)
            lineTo(19.9924f, 4f)
            lineTo(20.5227f, 4.53033f)
            close()
            moveTo(3.46204f, 19.4697f)
            curveTo(3.16915f, 19.7626f, 3.16915f, 20.2374f, 3.46204f, 20.5303f)
            curveTo(3.75493f, 20.8232f, 4.22981f, 20.8232f, 4.5227f, 20.5303f)
            lineTo(3.99237f, 20f)
            lineTo(3.46204f, 19.4697f)
            close()
            moveTo(19.9924f, 4f)
            lineTo(19.462f, 3.46967f)
            lineTo(3.46204f, 19.4697f)
            lineTo(3.99237f, 20f)
            lineTo(4.5227f, 20.5303f)
            lineTo(20.5227f, 4.53033f)
            lineTo(19.9924f, 4f)
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
            moveTo(14.9924f, 3.35495f)
            curveTo(16.1182f, 3.33895f, 19.8469f, 2.56438f, 20.6374f, 3.35495f)
            curveTo(21.428f, 4.14551f, 20.6534f, 7.87412f, 20.6374f, 9f)
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
            moveTo(8.99237f, 20.6451f)
            curveTo(7.8665f, 20.6611f, 4.13783f, 21.4356f, 3.3473f, 20.6451f)
            curveTo(2.55677f, 19.8545f, 3.3313f, 16.1259f, 3.3473f, 15f)
        }
        }.build()

        return _moveDiagonal!!
    }

private var _moveDiagonal: ImageVector? = null
