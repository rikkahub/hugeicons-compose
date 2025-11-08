package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SquareArrowMoveLeftDown: ImageVector
    get() {
        if (_squareArrowMoveLeftDown != null) {
            return _squareArrowMoveLeftDown!!
        }
        _squareArrowMoveLeftDown = ImageVector.Builder(
            name = "SquareArrowMoveLeftDown",
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
        moveTo(12.4654f, 15.1066f)
        curveTo(13.2366f, 15.7672f, 14.3293f, 17.1022f, 14.7827f, 16.9661f)
        moveTo(14.7827f, 16.9661f)
        curveTo(15.3109f, 16.9661f, 16.3181f, 15.6567f, 17.0566f, 15.1067f)
        moveTo(14.7827f, 16.9661f)
        curveTo(14.629f, 14.5755f, 15.1018f, 11.4944f, 14.0942f, 10.2393f)
        curveTo(12.976f, 8.91811f, 9.79651f, 9.40013f, 6.98226f, 9.26768f)
        moveTo(6.98226f, 9.26768f)
        curveTo(6.92317f, 9.93439f, 8.22401f, 10.7952f, 8.89747f, 11.5531f)
        moveTo(6.98226f, 9.26768f)
        curveTo(6.85917f, 8.82483f, 8.25247f, 7.69228f, 8.89459f, 7.02832f)
        }
        }.build()

        return _squareArrowMoveLeftDown!!
    }

private var _squareArrowMoveLeftDown: ImageVector? = null
