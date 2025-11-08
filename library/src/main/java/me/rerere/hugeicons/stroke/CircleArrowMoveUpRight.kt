package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CircleArrowMoveUpRight: ImageVector
    get() {
        if (_circleArrowMoveUpRight != null) {
            return _circleArrowMoveUpRight!!
        }
        _circleArrowMoveUpRight = ImageVector.Builder(
            name = "CircleArrowMoveUpRight",
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
        moveTo(9f, 16f)
        verticalLineTo(15.5176f)
        curveTo(9f, 14.6212f, 9f, 14.173f, 9.05803f, 13.798f)
        curveTo(9.37748f, 11.7336f, 10.9593f, 10.1146f, 12.9762f, 9.78761f)
        curveTo(13.3426f, 9.72821f, 14.1242f, 9.72821f, 15f, 9.72821f)
        moveTo(13.625f, 8f)
        lineTo(14.8051f, 9.23561f)
        curveTo(15.065f, 9.50776f, 15.065f, 9.94899f, 14.8051f, 10.2211f)
        lineTo(13.625f, 11.4567f)
        }
        }.build()

        return _circleArrowMoveUpRight!!
    }

private var _circleArrowMoveUpRight: ImageVector? = null
