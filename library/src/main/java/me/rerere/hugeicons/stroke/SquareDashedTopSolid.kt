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

val HugeIcons.SquareDashedTopSolid: ImageVector
    get() {
        if (_squareDashedTopSolid != null) {
            return _squareDashedTopSolid!!
        }
        _squareDashedTopSolid = ImageVector.Builder(
            name = "SquareDashedTopSolid",
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
            moveTo(21.5f, 10.0023f)
            curveTo(21.4948f, 9.4627f, 21.4851f, 8.96388f, 21.4668f, 8.50184f)
            moveTo(21.5f, 14.0035f)
            curveTo(21.4948f, 14.5431f, 21.4851f, 15.0419f, 21.4668f, 15.504f)
            moveTo(20.8691f, 5.00077f)
            curveTo(20.6794f, 4.57517f, 20.4333f, 4.21108f, 20.1138f, 3.89167f)
            curveTo(18.7217f, 2.5f, 16.4811f, 2.5f, 12f, 2.5f)
            curveTo(7.5189f, 2.5f, 5.27834f, 2.5f, 3.88624f, 3.89167f)
            curveTo(3.56673f, 4.21108f, 3.32056f, 4.57517f, 3.13088f, 5.00077f)
            moveTo(20.8691f, 19.0051f)
            curveTo(20.6794f, 19.4307f, 20.4333f, 19.7948f, 20.1138f, 20.1142f)
            curveTo(19.7942f, 20.4336f, 19.43f, 20.6797f, 19.0043f, 20.8693f)
            moveTo(14.0012f, 21.5f)
            curveTo(14.541f, 21.4948f, 15.04f, 21.4851f, 15.5022f, 21.4669f)
            moveTo(9.99886f, 21.5f)
            curveTo(9.45904f, 21.4948f, 8.96004f, 21.4851f, 8.49784f, 21.4669f)
            moveTo(4.99568f, 20.8693f)
            curveTo(4.56996f, 20.6797f, 4.20575f, 20.4336f, 3.88624f, 20.1142f)
            curveTo(3.56673f, 19.7948f, 3.32056f, 19.4307f, 3.13088f, 19.0051f)
            moveTo(2.53315f, 15.504f)
            curveTo(2.51488f, 15.0419f, 2.50516f, 14.5431f, 2.5f, 14.0035f)
            moveTo(2.5f, 10.0023f)
            curveTo(2.50516f, 9.4627f, 2.51488f, 8.96388f, 2.53315f, 8.50184f)
        }
        }.build()

        return _squareDashedTopSolid!!
    }

private var _squareDashedTopSolid: ImageVector? = null
