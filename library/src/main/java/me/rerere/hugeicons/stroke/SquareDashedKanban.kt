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

val HugeIcons.SquareDashedKanban: ImageVector
    get() {
        if (_squareDashedKanban != null) {
            return _squareDashedKanban!!
        }
        _squareDashedKanban = ImageVector.Builder(
            name = "SquareDashedKanban",
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
            moveTo(9.99877f, 2.5f)
            curveTo(9.45899f, 2.50516f, 8.96002f, 2.51488f, 8.49784f, 2.53315f)
            moveTo(14.0012f, 2.5f)
            curveTo(14.541f, 2.50516f, 15.04f, 2.51488f, 15.5022f, 2.53315f)
            moveTo(19.0043f, 3.13088f)
            curveTo(19.43f, 3.32055f, 19.7943f, 3.56673f, 20.1138f, 3.88624f)
            curveTo(20.4333f, 4.20575f, 20.6794f, 4.56995f, 20.8691f, 4.99568f)
            moveTo(3.13088f, 4.99568f)
            curveTo(3.32056f, 4.56995f, 3.56673f, 4.20575f, 3.88624f, 3.88624f)
            curveTo(4.20575f, 3.56673f, 4.56995f, 3.32055f, 4.99568f, 3.13088f)
            moveTo(21.5f, 9.99877f)
            curveTo(21.4948f, 9.45899f, 21.4851f, 8.96002f, 21.4669f, 8.49784f)
            moveTo(21.5f, 14.0012f)
            curveTo(21.4948f, 14.5409f, 21.4851f, 15.0399f, 21.4669f, 15.5021f)
            moveTo(20.8691f, 19.0043f)
            curveTo(20.6794f, 19.43f, 20.4333f, 19.7943f, 20.1138f, 20.1138f)
            curveTo(19.7943f, 20.4333f, 19.43f, 20.6794f, 19.0043f, 20.8691f)
            moveTo(15.5022f, 21.4668f)
            curveTo(15.04f, 21.4851f, 14.541f, 21.4948f, 14.0012f, 21.5f)
            moveTo(9.99877f, 21.5f)
            curveTo(9.45898f, 21.4948f, 8.96f, 21.4851f, 8.49781f, 21.4668f)
            moveTo(4.99568f, 20.8691f)
            curveTo(4.56995f, 20.6794f, 4.20575f, 20.4333f, 3.88624f, 20.1138f)
            curveTo(3.56673f, 19.7943f, 3.32056f, 19.43f, 3.13088f, 19.0043f)
            moveTo(2.5f, 14.0012f)
            curveTo(2.50516f, 14.5409f, 2.51488f, 15.0399f, 2.53315f, 15.5021f)
            moveTo(2.5f, 9.99884f)
            curveTo(2.50516f, 9.45904f, 2.51488f, 8.96004f, 2.53315f, 8.49784f)
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
            moveTo(12f, 8f)
            verticalLineTo(12f)
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
            moveTo(8f, 8f)
            verticalLineTo(14f)
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
            moveTo(16f, 8f)
            verticalLineTo(16f)
        }
        }.build()

        return _squareDashedKanban!!
    }

private var _squareDashedKanban: ImageVector? = null
