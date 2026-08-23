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

val HugeIcons.SquareParkingOff: ImageVector
    get() {
        if (_squareParkingOff != null) {
            return _squareParkingOff!!
        }
        _squareParkingOff = ImageVector.Builder(
            name = "SquareParkingOff",
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
            moveTo(8.5f, 8.5f)
            verticalLineTo(12.5f)
            moveTo(8.5f, 12.5f)
            verticalLineTo(17.5f)
            moveTo(8.5f, 12.5f)
            horizontalLineTo(12.5f)
            moveTo(11.5f, 6.5f)
            horizontalLineTo(12.5f)
            curveTo(14.1569f, 6.5f, 15.5f, 7.84315f, 15.5f, 9.5f)
            curveTo(15.5f, 9.80309f, 15.4551f, 10.0957f, 15.3715f, 10.3715f)
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
            moveTo(2f, 2f)
            lineTo(22f, 22f)
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
            moveTo(20.1088f, 20.1088f)
            curveTo(18.7175f, 21.5f, 16.4784f, 21.5f, 12f, 21.5f)
            curveTo(7.52169f, 21.5f, 5.28252f, 21.5f, 3.89127f, 20.1088f)
            curveTo(2.50003f, 18.7175f, 2.50003f, 16.4783f, 2.50003f, 12f)
            curveTo(2.50003f, 7.52166f, 2.50003f, 5.28249f, 3.89127f, 3.89124f)
            moveTo(7.5907f, 2.59066f)
            curveTo(8.7583f, 2.5f, 10.1979f, 2.5f, 12f, 2.5f)
            curveTo(16.4784f, 2.5f, 18.7175f, 2.5f, 20.1088f, 3.89124f)
            curveTo(21.5f, 5.28249f, 21.5f, 7.52166f, 21.5f, 12f)
            curveTo(21.5f, 13.8022f, 21.5f, 15.2417f, 21.4094f, 16.4093f)
        }
        }.build()

        return _squareParkingOff!!
    }

private var _squareParkingOff: ImageVector? = null
