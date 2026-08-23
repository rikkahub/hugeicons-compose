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

val HugeIcons.SquareCenterlineDashedVertical: ImageVector
    get() {
        if (_squareCenterlineDashedVertical != null) {
            return _squareCenterlineDashedVertical!!
        }
        _squareCenterlineDashedVertical = ImageVector.Builder(
            name = "SquareCenterlineDashedVertical",
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
            moveTo(20.9922f, 12.002f)
            lineTo(19.9922f, 12.002f)
            moveTo(16.9922f, 12.002f)
            lineTo(15.9922f, 12.002f)
            moveTo(12.4922f, 12.002f)
            lineTo(11.4922f, 12.002f)
            moveTo(7.99219f, 12.002f)
            lineTo(6.99219f, 12.002f)
            moveTo(2.99219f, 12.002f)
            lineTo(3.99219f, 12.002f)
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
            moveTo(19.9917f, 16.002f)
            curveTo(19.8621f, 17.3021f, 19.5694f, 18.1772f, 18.9079f, 18.8304f)
            curveTo(17.7213f, 20.002f, 15.8115f, 20.002f, 11.9919f, 20.002f)
            curveTo(8.17235f, 20.002f, 6.26257f, 20.002f, 5.07598f, 18.8304f)
            curveTo(4.41443f, 18.1772f, 4.12171f, 17.3021f, 3.99219f, 16.002f)
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
            moveTo(19.992f, 8.00195f)
            curveTo(19.8625f, 6.70184f, 19.5697f, 5.82671f, 18.9082f, 5.17353f)
            curveTo(17.7216f, 4.00195f, 15.8118f, 4.00195f, 11.9923f, 4.00195f)
            curveTo(8.17269f, 4.00195f, 6.26291f, 4.00195f, 5.07632f, 5.17353f)
            curveTo(4.4396f, 5.80219f, 4.14454f, 6.63645f, 4.00781f, 7.85732f)
        }
        }.build()

        return _squareCenterlineDashedVertical!!
    }

private var _squareCenterlineDashedVertical: ImageVector? = null
