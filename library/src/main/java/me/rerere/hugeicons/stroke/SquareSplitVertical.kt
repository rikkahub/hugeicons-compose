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

val HugeIcons.SquareSplitVertical: ImageVector
    get() {
        if (_squareSplitVertical != null) {
            return _squareSplitVertical!!
        }
        _squareSplitVertical = ImageVector.Builder(
            name = "SquareSplitVertical",
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
            moveTo(20.9922f, 11.9993f)
            lineTo(2.99219f, 11.9993f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(19.9917f, 15.9993f)
            curveTo(19.8621f, 17.2994f, 19.5694f, 18.1745f, 18.9079f, 18.8277f)
            curveTo(17.7213f, 19.9993f, 15.8115f, 19.9993f, 11.9919f, 19.9993f)
            curveTo(8.17235f, 19.9993f, 6.26257f, 19.9993f, 5.07598f, 18.8277f)
            curveTo(4.41443f, 18.1745f, 4.12171f, 17.2994f, 3.99219f, 15.9993f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(19.992f, 7.99927f)
            curveTo(19.8625f, 6.69915f, 19.5697f, 5.82402f, 18.9082f, 5.17084f)
            curveTo(17.7216f, 3.99927f, 15.8118f, 3.99927f, 11.9923f, 3.99927f)
            curveTo(8.17269f, 3.99927f, 6.26291f, 3.99927f, 5.07632f, 5.17084f)
            curveTo(4.4396f, 5.7995f, 4.14454f, 6.63376f, 4.00781f, 7.85464f)
        }
        }.build()

        return _squareSplitVertical!!
    }

private var _squareSplitVertical: ImageVector? = null
