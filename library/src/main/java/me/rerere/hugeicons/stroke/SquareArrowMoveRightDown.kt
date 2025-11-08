package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
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
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
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
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.5502f, 15.1046f)
        curveTo(10.7789f, 15.7652f, 9.6863f, 17.1002f, 9.23284f, 16.9641f)
        moveTo(9.23284f, 16.9641f)
        curveTo(8.70468f, 16.9641f, 7.69746f, 15.6547f, 6.95898f, 15.1047f)
        moveTo(9.23284f, 16.9641f)
        curveTo(9.38659f, 14.5735f, 8.91377f, 11.4925f, 9.9214f, 10.2373f)
        curveTo(11.0396f, 8.91616f, 14.2191f, 9.39818f, 17.0333f, 9.26573f)
        moveTo(17.0333f, 9.26573f)
        curveTo(17.0924f, 9.93243f, 15.7916f, 10.7933f, 15.1181f, 11.5512f)
        moveTo(17.0333f, 9.26573f)
        curveTo(17.1564f, 8.82288f, 15.7631f, 7.69032f, 15.121f, 7.02637f)
        }
        }.build()

        return _squareArrowMoveRightDown!!
    }

private var _squareArrowMoveRightDown: ImageVector? = null
