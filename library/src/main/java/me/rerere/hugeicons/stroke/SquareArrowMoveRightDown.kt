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

val HugeIcons.SquareArrowMoveRightDown: ImageVector
    get() {
        if (_squareArrowMoveRightDown != null) {
            return _squareArrowMoveRightDown!!
        }
        _squareArrowMoveRightDown = ImageVector.Builder(
            name = "SquareArrowMoveRightDown",
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
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(2.5f, 12f)
            curveTo(2.5f, 7.52166f, 2.5f, 5.28249f, 3.89124f, 3.89124f)
            curveTo(5.28249f, 2.5f, 7.52166f, 2.5f, 12f, 2.5f)
            curveTo(16.4783f, 2.5f, 18.7175f, 2.5f, 20.1088f, 3.89124f)
            curveTo(21.5f, 5.28249f, 21.5f, 7.52166f, 21.5f, 12f)
            curveTo(21.5f, 16.4783f, 21.5f, 18.7175f, 20.1088f, 20.1088f)
            curveTo(18.7175f, 21.5f, 16.4783f, 21.5f, 12f, 21.5f)
            curveTo(7.52166f, 21.5f, 5.28249f, 21.5f, 3.89124f, 20.1088f)
            curveTo(2.5f, 18.7175f, 2.5f, 16.4783f, 2.5f, 12f)
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
            moveTo(11.5502f, 15.1045f)
            curveTo(10.7789f, 15.7651f, 9.6863f, 17.1001f, 9.23284f, 16.964f)
            moveTo(9.23284f, 16.964f)
            curveTo(8.70468f, 16.964f, 7.69746f, 15.6546f, 6.95898f, 15.1046f)
            moveTo(9.23284f, 16.964f)
            curveTo(9.38659f, 14.5734f, 8.91377f, 11.4923f, 9.9214f, 10.2372f)
            curveTo(11.0396f, 8.91603f, 14.2191f, 9.39806f, 17.0333f, 9.26561f)
            moveTo(17.0333f, 9.26561f)
            curveTo(17.0924f, 9.93231f, 15.7916f, 10.7932f, 15.1181f, 11.551f)
            moveTo(17.0333f, 9.26561f)
            curveTo(17.1564f, 8.82276f, 15.7631f, 7.6902f, 15.121f, 7.02625f)
        }
        }.build()

        return _squareArrowMoveRightDown!!
    }

private var _squareArrowMoveRightDown: ImageVector? = null
